/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.coreutils.internal.parsing;

import androidx.annotation.Nullable;

public class ParseUtils {
    public static final int NEGATIVE_INT = -1;
    public static final int ZERO = 0;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public static Integer intValueOf(@Nullable String object) {
        if (object == null) return null;
        try {
            return Integer.valueOf((String)object);
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
    }

    @Nullable
    public static Float parseFloat(String string2) {
        float f11;
        try {
            f11 = Float.parseFloat(string2);
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        return Float.valueOf(f11);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int parseInt(String string2, int n10) {
        if (string2 == null) {
            return n10;
        }
        try {
            int n13 = Integer.parseInt(string2);
            return n13;
        }
        catch (NumberFormatException numberFormatException) {
            return n10;
        }
    }

    @Nullable
    public static Integer parseInt(String string2) {
        int n10;
        try {
            n10 = Integer.parseInt(string2);
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        return n10;
    }

    public static int parseIntOrNegative(String string2) {
        return ParseUtils.parseInt(string2, -1);
    }

    public static int parseIntOrZero(String string2) {
        return ParseUtils.parseInt(string2, 0);
    }

    public static long parseLong(String string2, long l10) {
        try {
            long l11 = Long.parseLong(string2);
            return l11;
        }
        catch (NumberFormatException numberFormatException) {
            return l10;
        }
    }

    @Nullable
    public static Long parseLong(String string2) {
        long l10;
        try {
            l10 = Long.parseLong(string2);
        }
        catch (NumberFormatException numberFormatException) {
            return null;
        }
        return l10;
    }
}

