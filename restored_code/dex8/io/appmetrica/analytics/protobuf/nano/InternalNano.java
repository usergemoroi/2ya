/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.protobuf.nano;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.ExtendableMessageNano;
import io.appmetrica.analytics.protobuf.nano.FieldArray;
import io.appmetrica.analytics.protobuf.nano.MapFactories;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class InternalNano {
    static final Charset ISO_8859_1;
    public static final Object LAZY_INIT_LOCK;
    public static final int TYPE_BOOL = 8;
    public static final int TYPE_BYTES = 12;
    public static final int TYPE_DOUBLE = 1;
    public static final int TYPE_ENUM = 14;
    public static final int TYPE_FIXED32 = 7;
    public static final int TYPE_FIXED64 = 6;
    public static final int TYPE_FLOAT = 2;
    public static final int TYPE_GROUP = 10;
    public static final int TYPE_INT32 = 5;
    public static final int TYPE_INT64 = 3;
    public static final int TYPE_MESSAGE = 11;
    public static final int TYPE_SFIXED32 = 15;
    public static final int TYPE_SFIXED64 = 16;
    public static final int TYPE_SINT32 = 17;
    public static final int TYPE_SINT64 = 18;
    public static final int TYPE_STRING = 9;
    public static final int TYPE_UINT32 = 13;
    public static final int TYPE_UINT64 = 4;
    static final Charset UTF_8;

    static {
        UTF_8 = Charset.forName("UTF-8");
        ISO_8859_1 = Charset.forName("ISO-8859-1");
        LAZY_INIT_LOCK = new Object();
    }

    private InternalNano() {
    }

    public static byte[] bytesDefaultValue(String string2) {
        return string2.getBytes(ISO_8859_1);
    }

    public static void cloneUnknownFieldData(ExtendableMessageNano object, ExtendableMessageNano extendableMessageNano) {
        object = ((ExtendableMessageNano)object).unknownFieldData;
        if (object != null) {
            extendableMessageNano.unknownFieldData = ((FieldArray)object).clone();
        }
    }

    public static <K, V> int computeMapFieldSize(Map<K, V> map2, int n10, int n13, int n14) {
        int n15 = CodedOutputByteBufferNano.computeTagSize(n10);
        Iterator<Map.Entry<K, V>> iterator = map2.entrySet().iterator();
        n10 = 0;
        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = iterator.next();
            map2 = entry.getKey();
            entry = entry.getValue();
            if (map2 != null && entry != null) {
                int n16 = CodedOutputByteBufferNano.computeFieldSize(1, n13, map2) + CodedOutputByteBufferNano.computeFieldSize(2, n14, entry);
                n10 += CodedOutputByteBufferNano.computeRawVarint32Size(n16) + (n15 + n16);
                continue;
            }
            throw new IllegalStateException("keys and values in maps cannot be null");
        }
        return n10;
    }

    public static byte[] copyFromUtf8(String string2) {
        return string2.getBytes(UTF_8);
    }

    public static <K, V> boolean equals(Map<K, V> entry2, Map<K, V> map2) {
        boolean bl2 = true;
        boolean bl3 = true;
        if (entry2 == map2) {
            return true;
        }
        if (entry2 == null) {
            if (map2.size() != 0) {
                bl3 = false;
            }
            return bl3;
        }
        if (map2 == null) {
            bl3 = entry2.size() == 0 ? bl2 : false;
            return bl3;
        }
        if (entry2.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry2 : entry2.entrySet()) {
            if (!map2.containsKey(entry2.getKey())) {
                return false;
            }
            if (InternalNano.equalsMapValue(entry2.getValue(), map2.get(entry2.getKey()))) continue;
            return false;
        }
        return true;
    }

    public static boolean equals(double[] dArray, double[] dArray2) {
        if (dArray != null && dArray.length != 0) {
            return Arrays.equals(dArray, dArray2);
        }
        boolean bl2 = dArray2 == null || dArray2.length == 0;
        return bl2;
    }

    public static boolean equals(float[] fArray, float[] fArray2) {
        if (fArray != null && fArray.length != 0) {
            return Arrays.equals(fArray, fArray2);
        }
        boolean bl2 = fArray2 == null || fArray2.length == 0;
        return bl2;
    }

    public static boolean equals(int[] nArray, int[] nArray2) {
        if (nArray != null && nArray.length != 0) {
            return Arrays.equals(nArray, nArray2);
        }
        boolean bl2 = nArray2 == null || nArray2.length == 0;
        return bl2;
    }

    public static boolean equals(long[] lArray, long[] lArray2) {
        if (lArray != null && lArray.length != 0) {
            return Arrays.equals(lArray, lArray2);
        }
        boolean bl2 = lArray2 == null || lArray2.length == 0;
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean equals(Object[] objectArray, Object[] objectArray2) {
        int n10 = objectArray == null ? 0 : objectArray.length;
        int n13 = objectArray2 == null ? 0 : objectArray2.length;
        int n14 = 0;
        int n15 = 0;
        while (true) {
            int n16 = n15;
            if (n14 < n10) {
                n16 = n15;
                if (objectArray[n14] == null) {
                    ++n14;
                    continue;
                }
            }
            while (n16 < n13 && objectArray2[n16] == null) {
                ++n16;
            }
            n15 = n14 >= n10 ? 1 : 0;
            int n17 = n16 >= n13 ? 1 : 0;
            if (n15 != 0 && n17 != 0) {
                return true;
            }
            if (n15 != n17) {
                return false;
            }
            if (!objectArray[n14].equals(objectArray2[n16])) {
                return false;
            }
            ++n14;
            n15 = n16 + 1;
        }
    }

    public static boolean equals(boolean[] blArray, boolean[] blArray2) {
        if (blArray != null && blArray.length != 0) {
            return Arrays.equals(blArray, blArray2);
        }
        boolean bl2 = blArray2 == null || blArray2.length == 0;
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean equals(byte[][] byArray, byte[][] byArray2) {
        int n10 = byArray == null ? 0 : byArray.length;
        int n13 = byArray2 == null ? 0 : byArray2.length;
        int n14 = 0;
        int n15 = 0;
        while (true) {
            int n16 = n15;
            if (n14 < n10) {
                n16 = n15;
                if (byArray[n14] == null) {
                    ++n14;
                    continue;
                }
            }
            while (n16 < n13 && byArray2[n16] == null) {
                ++n16;
            }
            n15 = n14 >= n10 ? 1 : 0;
            int n17 = n16 >= n13 ? 1 : 0;
            if (n15 != 0 && n17 != 0) {
                return true;
            }
            if (n15 != n17) {
                return false;
            }
            if (!Arrays.equals(byArray[n14], byArray2[n16])) {
                return false;
            }
            ++n14;
            n15 = n16 + 1;
        }
    }

    private static boolean equalsMapValue(Object object, Object object2) {
        if (object != null && object2 != null) {
            if (object instanceof byte[] && object2 instanceof byte[]) {
                return Arrays.equals((byte[])object, (byte[])object2);
            }
            return object.equals(object2);
        }
        throw new IllegalStateException("keys and values in maps cannot be null");
    }

    public static <K, V> int hashCode(Map<K, V> object2) {
        int n10 = 0;
        if (object2 == null) {
            return 0;
        }
        for (Map.Entry entry : object2.entrySet()) {
            int n13 = InternalNano.hashCodeForMap(entry.getKey());
            n10 += InternalNano.hashCodeForMap(entry.getValue()) ^ n13;
        }
        return n10;
    }

    public static int hashCode(double[] dArray) {
        int n10 = dArray != null && dArray.length != 0 ? Arrays.hashCode(dArray) : 0;
        return n10;
    }

    public static int hashCode(float[] fArray) {
        int n10 = fArray != null && fArray.length != 0 ? Arrays.hashCode(fArray) : 0;
        return n10;
    }

    public static int hashCode(int[] nArray) {
        int n10 = nArray != null && nArray.length != 0 ? Arrays.hashCode(nArray) : 0;
        return n10;
    }

    public static int hashCode(long[] lArray) {
        int n10 = lArray != null && lArray.length != 0 ? Arrays.hashCode(lArray) : 0;
        return n10;
    }

    public static int hashCode(Object[] objectArray) {
        int n10;
        int n13;
        int n14 = 0;
        if (objectArray == null) {
            n13 = 0;
            n10 = 0;
        } else {
            n13 = objectArray.length;
            n10 = 0;
        }
        while (n14 < n13) {
            Object object = objectArray[n14];
            int n15 = n10;
            if (object != null) {
                n15 = object.hashCode() + n10 * 31;
            }
            ++n14;
            n10 = n15;
        }
        return n10;
    }

    public static int hashCode(boolean[] blArray) {
        int n10 = blArray != null && blArray.length != 0 ? Arrays.hashCode(blArray) : 0;
        return n10;
    }

    public static int hashCode(byte[][] byArray) {
        int n10;
        int n13;
        int n14 = 0;
        if (byArray == null) {
            n13 = 0;
            n10 = 0;
        } else {
            n13 = byArray.length;
            n10 = 0;
        }
        while (n14 < n13) {
            byte[] byArray2 = byArray[n14];
            int n15 = n10;
            if (byArray2 != null) {
                n15 = Arrays.hashCode(byArray2) + n10 * 31;
            }
            ++n14;
            n10 = n15;
        }
        return n10;
    }

    private static int hashCodeForMap(Object object) {
        if (object instanceof byte[]) {
            return Arrays.hashCode((byte[])object);
        }
        return object.hashCode();
    }

    public static final <K, V> Map<K, V> mergeMapEntry(CodedInputByteBufferNano object, Map<K, V> object2, MapFactories.MapFactory object3, int n10, int n13, V object4, int n14, int n15) throws IOException {
        int n16;
        object3 = object3.forMap(object2);
        int n17 = ((CodedInputByteBufferNano)object).pushLimit(((CodedInputByteBufferNano)object).readRawVarint32());
        object2 = null;
        while ((n16 = ((CodedInputByteBufferNano)object).readTag()) != 0) {
            if (n16 == n14) {
                object2 = ((CodedInputByteBufferNano)object).readPrimitiveField(n10);
                continue;
            }
            if (n16 == n15) {
                if (n13 == 11) {
                    ((CodedInputByteBufferNano)object).readMessage((MessageNano)object4);
                    continue;
                }
                object4 = ((CodedInputByteBufferNano)object).readPrimitiveField(n13);
                continue;
            }
            if (((CodedInputByteBufferNano)object).skipField(n16)) continue;
        }
        ((CodedInputByteBufferNano)object).checkLastTagWas(0);
        ((CodedInputByteBufferNano)object).popLimit(n17);
        object = object2;
        if (object2 == null) {
            object = InternalNano.primitiveDefaultValue(n10);
        }
        object2 = object4;
        if (object4 == null) {
            object2 = InternalNano.primitiveDefaultValue(n13);
        }
        object3.put(object, object2);
        return object3;
    }

    private static Object primitiveDefaultValue(int n10) {
        switch (n10) {
            default: {
                StringBuilder stringBuilder = new StringBuilder("Type: ");
                stringBuilder.append(n10);
                stringBuilder.append(" is not a primitive type.");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            case 12: {
                return WireFormatNano.EMPTY_BYTES;
            }
            case 9: {
                return "";
            }
            case 8: {
                return Boolean.FALSE;
            }
            case 5: 
            case 7: 
            case 13: 
            case 14: 
            case 15: 
            case 17: {
                return 0;
            }
            case 3: 
            case 4: 
            case 6: 
            case 16: 
            case 18: {
                return 0L;
            }
            case 2: {
                return Float.valueOf(0.0f);
            }
            case 1: 
        }
        return 0.0;
    }

    public static <K, V> void serializeMapField(CodedOutputByteBufferNano codedOutputByteBufferNano, Map<K, V> map2, int n10, int n13, int n14) throws IOException {
        for (Map.Entry<K, V> entry : map2.entrySet()) {
            map2 = entry.getKey();
            entry = entry.getValue();
            if (map2 != null && entry != null) {
                int n15 = CodedOutputByteBufferNano.computeFieldSize(1, n13, map2);
                int n16 = CodedOutputByteBufferNano.computeFieldSize(2, n14, entry);
                codedOutputByteBufferNano.writeTag(n10, 2);
                codedOutputByteBufferNano.writeRawVarint32(n15 + n16);
                codedOutputByteBufferNano.writeField(1, n13, map2);
                codedOutputByteBufferNano.writeField(2, n14, entry);
                continue;
            }
            throw new IllegalStateException("keys and values in maps cannot be null");
        }
    }

    public static String stringDefaultValue(String string2) {
        return new String(string2.getBytes(ISO_8859_1), UTF_8);
    }
}

