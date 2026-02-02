/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  kotlin.collections.l
 */
package io.appmetrica.analytics.coreutils.internal;

import android.content.ContentValues;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import kotlin.collections.l;

public final class StringUtils {
    public static final String COMMA = ",";
    public static final String EMPTY = "";
    public static final String PROCESS_POSTFIX_DELIMITER = ":";
    public static final String UNDEFINED = "undefined";

    public static String capitalize(String string2) {
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return EMPTY;
        }
        char c11 = string2.charAt(0);
        if (Character.isUpperCase(c11)) {
            return string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Character.toUpperCase(c11));
        stringBuilder.append(string2.substring(1));
        return stringBuilder.toString();
    }

    public static int compare(@Nullable String string2, @Nullable String string3) {
        if (string2 == null) {
            int n10 = string3 == null ? 0 : -1;
            return n10;
        }
        if (string3 == null) {
            return 1;
        }
        return string2.compareTo(string3);
    }

    @NonNull
    public static String contentValuesToString(@Nullable ContentValues object) {
        object = object == null ? "null" : object.toString();
        return object;
    }

    @NonNull
    public static String correctIllFormedString(@NonNull String string2) {
        return new String(string2.getBytes(StandardCharsets.UTF_8));
    }

    public static String emptyIfNull(String string2) {
        return StringUtils.ifIsNullToDef(string2, EMPTY);
    }

    public static boolean equalsNullSafety(@Nullable String string2, @Nullable String string3) {
        if (string2 == null && string3 == null) {
            return true;
        }
        if (string2 != null && string3 != null) {
            return string2.equals(string3);
        }
        return false;
    }

    public static String formatSha1(@NonNull byte[] byArray) {
        return StringUtils.toHexString(byArray).toUpperCase(Locale.US).replaceAll("(.{2})(?=.+)", "$1:");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static byte[] getUTF8Bytes(@Nullable String object) {
        if (object == null) return new byte[0];
        try {
            return ((String)object).getBytes("UTF-8");
        }
        catch (Throwable throwable) {
            return new byte[0];
        }
    }

    public static byte[][] getUTF8Bytes(@Nullable List<String> list) {
        int n10 = 0;
        byte[][] byArrayArray = new byte[][]{};
        if (list != null) {
            byte[][] byArrayArray2 = new byte[list.size()][];
            while (true) {
                byArrayArray = byArrayArray2;
                if (n10 >= list.size()) break;
                byArrayArray2[n10] = StringUtils.getUTF8Bytes(list.get(n10));
                ++n10;
            }
        }
        return byArrayArray;
    }

    public static int getUtf8BytesLength(@Nullable String string2) {
        return StringUtils.getUTF8Bytes(string2).length;
    }

    public static byte[] hexToBytes(@NonNull String string2) {
        if (string2.length() % 2 == 0) {
            int n10 = string2.length();
            byte[] byArray = new byte[n10 / 2];
            for (int i14 = 0; i14 < n10; i14 += 2) {
                int n13 = i14 / 2;
                int n14 = Character.digit(string2.charAt(i14), 16);
                byArray[n13] = (byte)(Character.digit(string2.charAt(i14 + 1), 16) + (n14 << 4));
            }
            return byArray;
        }
        throw new IllegalArgumentException("Input string must contain an even number of characters");
    }

    public static String ifIsEmptyToDef(String string2, String string3) {
        String string4 = string2;
        if (TextUtils.isEmpty((CharSequence)string2)) {
            string4 = string3;
        }
        return string4;
    }

    public static String ifIsNullToDef(String string2, String string3) {
        String string4 = string2;
        if (string2 == null) {
            string4 = string3;
        }
        return string4;
    }

    @NonNull
    public static byte[] stringToBytesForProtobuf(@Nullable String object) {
        object = object == null ? (Object)new byte[0] : (Object)((String)object).getBytes();
        return object;
    }

    @NonNull
    public static String throwableToString(@NonNull Throwable throwable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(throwable.getClass().getName());
        stringBuilder.append(": ");
        stringBuilder.append(throwable.getMessage());
        stringBuilder.append("\n");
        stringBuilder.append(l.D0((Object[])throwable.getStackTrace(), (CharSequence)"\n", (CharSequence)EMPTY, (CharSequence)EMPTY, (int)-1, (CharSequence)"...", null));
        return stringBuilder.toString();
    }

    public static String toHexString(@NonNull byte[] byArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (byte by : byArray) {
            stringBuilder.append("0123456789abcdef".charAt((by & 0xF0) >> 4));
            stringBuilder.append("0123456789abcdef".charAt(by & 0xF));
        }
        return stringBuilder.toString();
    }

    public static final String wrapFeatures(String ... stringArray) {
        return TextUtils.join((CharSequence)COMMA, (Object[])stringArray);
    }
}

