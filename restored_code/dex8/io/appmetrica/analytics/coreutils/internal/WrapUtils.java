/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.coreutils.internal;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.a;
import java.util.concurrent.TimeUnit;

public class WrapUtils {
    public static double getFiniteDoubleOrDefault(double d14, double d15) {
        if (!a.a(d14)) {
            d14 = d15;
        }
        return d14;
    }

    public static long getMillisOrDefault(@Nullable Long l10, @NonNull TimeUnit timeUnit, long l11) {
        if (l10 != null) {
            l11 = timeUnit.toMillis(l10);
        }
        return l11;
    }

    @NonNull
    public static <T> T getOrDefault(@Nullable T t13, @NonNull T t14) {
        T t15 = t13;
        if (t13 == null) {
            t15 = t14;
        }
        return t15;
    }

    @NonNull
    public static String getOrDefaultIfEmpty(@Nullable String string2, @NonNull String string3) {
        String string4 = string2;
        if (TextUtils.isEmpty((CharSequence)string2)) {
            string4 = string3;
        }
        return string4;
    }

    @Nullable
    public static <T> T getOrDefaultNullable(@Nullable T t13, @Nullable T t14) {
        T t15 = t13;
        if (t13 == null) {
            t15 = t14;
        }
        return t15;
    }

    @Nullable
    public static String getOrDefaultNullableIfEmpty(@Nullable String string2, @Nullable String string3) {
        String string4 = string2;
        if (TextUtils.isEmpty((CharSequence)string2)) {
            string4 = string3;
        }
        return string4;
    }

    @NonNull
    public static <T> String wrapToTag(@Nullable T t13) {
        if (t13 == null) {
            return "<null>";
        }
        if (t13.toString().isEmpty()) {
            return "<empty>";
        }
        return t13.toString();
    }
}

