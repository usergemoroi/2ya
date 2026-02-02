/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.protobuf.nano;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public final class MessageNanoPrinter {
    private static final String INDENT = "  ";
    private static final int MAX_STRING_LEN = 200;

    private MessageNanoPrinter() {
    }

    private static void appendQuotedBytes(byte[] byArray, StringBuffer stringBuffer) {
        if (byArray == null) {
            stringBuffer.append("\"\"");
            return;
        }
        stringBuffer.append('\"');
        for (int i14 = 0; i14 < byArray.length; ++i14) {
            int n10 = byArray[i14] & 0xFF;
            if (n10 != 92 && n10 != 34) {
                if (n10 >= 32 && n10 < 127) {
                    stringBuffer.append((char)n10);
                    continue;
                }
                stringBuffer.append(String.format("\\%03o", n10));
                continue;
            }
            stringBuffer.append('\\');
            stringBuffer.append((char)n10);
        }
        stringBuffer.append('\"');
    }

    private static String deCamelCaseify(String string2) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i14 = 0; i14 < string2.length(); ++i14) {
            char c11 = string2.charAt(i14);
            if (i14 == 0) {
                stringBuffer.append(Character.toLowerCase(c11));
                continue;
            }
            if (Character.isUpperCase(c11)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(c11));
                continue;
            }
            stringBuffer.append(c11);
        }
        return stringBuffer.toString();
    }

    private static String escapeString(String string2) {
        int n10 = string2.length();
        StringBuilder stringBuilder = new StringBuilder(n10);
        for (int i14 = 0; i14 < n10; ++i14) {
            char c11 = string2.charAt(i14);
            if (c11 >= ' ' && c11 <= '~' && c11 != '\"' && c11 != '\'') {
                stringBuilder.append(c11);
                continue;
            }
            stringBuilder.append(String.format("\\u%04x", c11));
        }
        return stringBuilder.toString();
    }

    public static <T extends MessageNano> String print(T object) {
        IllegalAccessException illegalAccessException2;
        block4: {
            if (object == null) {
                return "";
            }
            AbstractStringBuilder abstractStringBuilder = new StringBuffer();
            try {
                StringBuffer stringBuffer = new StringBuffer();
                MessageNanoPrinter.print(null, object, stringBuffer, (StringBuffer)abstractStringBuilder);
                return ((StringBuffer)abstractStringBuilder).toString();
            }
            catch (InvocationTargetException invocationTargetException) {
            }
            catch (IllegalAccessException illegalAccessException2) {
                break block4;
            }
            abstractStringBuilder = new StringBuilder("Error printing proto: ");
            ((StringBuilder)abstractStringBuilder).append(invocationTargetException.getMessage());
            return ((StringBuilder)abstractStringBuilder).toString();
        }
        object = new StringBuilder("Error printing proto: ");
        ((StringBuilder)object).append(illegalAccessException2.getMessage());
        return ((StringBuilder)object).toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void print(String string2, Object iterator, StringBuffer stringBuffer, StringBuffer stringBuffer2) throws IllegalAccessException, InvocationTargetException {
        Object object;
        String string3;
        int n10;
        int n13;
        int n14;
        AccessibleObject[] accessibleObjectArray;
        Class<?> clazz;
        int n15;
        if (iterator == null) {
            return;
        }
        if (iterator instanceof MessageNano) {
            n15 = stringBuffer.length();
            if (string2 != null) {
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(MessageNanoPrinter.deCamelCaseify(string2));
                stringBuffer2.append(" <\n");
                stringBuffer.append(INDENT);
            }
            clazz = iterator.getClass();
            accessibleObjectArray = clazz.getFields();
            n14 = accessibleObjectArray.length;
        } else {
            if (iterator instanceof Map) {
                iterator = (Map)((Object)iterator);
                string2 = MessageNanoPrinter.deCamelCaseify(string2);
                iterator = iterator.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry entry = iterator.next();
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(string2);
                    stringBuffer2.append(" <\n");
                    int n16 = stringBuffer.length();
                    stringBuffer.append(INDENT);
                    MessageNanoPrinter.print("key", entry.getKey(), stringBuffer, stringBuffer2);
                    MessageNanoPrinter.print("value", entry.getValue(), stringBuffer, stringBuffer2);
                    stringBuffer.setLength(n16);
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(">\n");
                }
                return;
            }
            string2 = MessageNanoPrinter.deCamelCaseify(string2);
            stringBuffer2.append(stringBuffer);
            stringBuffer2.append(string2);
            stringBuffer2.append(": ");
            if (iterator instanceof String) {
                string2 = MessageNanoPrinter.sanitizeString((String)((Object)iterator));
                stringBuffer2.append("\"");
                stringBuffer2.append(string2);
                stringBuffer2.append("\"");
            } else if (iterator instanceof byte[]) {
                MessageNanoPrinter.appendQuotedBytes((byte[])iterator, stringBuffer2);
            } else {
                stringBuffer2.append(iterator);
            }
            stringBuffer2.append("\n");
            return;
        }
        for (n13 = 0; n13 < n14; ++n13) {
            Field field = accessibleObjectArray[n13];
            n10 = field.getModifiers();
            string3 = field.getName();
            if ("cachedSize".equals(string3) || (n10 & 1) != 1 || (n10 & 8) == 8 || string3.startsWith("_") || string3.endsWith("_")) continue;
            object = field.getType();
            Object object2 = field.get(iterator);
            if (((Class)object).isArray()) {
                if (((Class)object).getComponentType() == Byte.TYPE) {
                    MessageNanoPrinter.print(string3, object2, stringBuffer, stringBuffer2);
                    continue;
                }
                n10 = object2 == null ? 0 : Array.getLength(object2);
                for (int i14 = 0; i14 < n10; ++i14) {
                    MessageNanoPrinter.print(string3, Array.get(object2, i14), stringBuffer, stringBuffer2);
                }
                continue;
            }
            MessageNanoPrinter.print(string3, object2, stringBuffer, stringBuffer2);
        }
        accessibleObjectArray = clazz.getMethods();
        n10 = accessibleObjectArray.length;
        n13 = 0;
        while (true) {
            block20: {
                if (n13 >= n10) {
                    if (string2 == null) return;
                    stringBuffer.setLength(n15);
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(">\n");
                    return;
                }
                string3 = ((Method)accessibleObjectArray[n13]).getName();
                if (string3.startsWith("set")) {
                    string3 = string3.substring(3);
                    try {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("has");
                        ((StringBuilder)object).append(string3);
                        object = clazz.getMethod(((StringBuilder)object).toString(), new Class[0]);
                        if (!((Boolean)((Method)object).invoke(iterator, new Object[0])).booleanValue()) break block20;
                        object = new StringBuilder();
                        ((StringBuilder)object).append("get");
                        ((StringBuilder)object).append(string3);
                        object = clazz.getMethod(((StringBuilder)object).toString(), new Class[0]);
                    }
                    catch (NoSuchMethodException noSuchMethodException) {}
                    MessageNanoPrinter.print(string3, ((Method)object).invoke(iterator, new Object[0]), stringBuffer, stringBuffer2);
                }
            }
            ++n13;
        }
    }

    private static String sanitizeString(String string2) {
        CharSequence charSequence = string2;
        if (!string2.startsWith("http")) {
            charSequence = string2;
            if (string2.length() > 200) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(string2.substring(0, 200));
                ((StringBuilder)charSequence).append("[...]");
                charSequence = ((StringBuilder)charSequence).toString();
            }
        }
        return MessageNanoPrinter.escapeString((String)charSequence);
    }
}

