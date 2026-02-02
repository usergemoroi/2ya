/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 */
package io.appmetrica.analytics.coreutils.internal.system;

import android.annotation.SuppressLint;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a8\u0006\u0005"}, d2={"Lio/appmetrica/analytics/coreutils/internal/system/SystemPropertiesHelper;", "", "", "name", "readSystemProperty", "core-utils_release"}, k=1, mv={1, 6, 0})
public final class SystemPropertiesHelper {
    @NotNull
    public static final SystemPropertiesHelper INSTANCE = new SystemPropertiesHelper();

    private SystemPropertiesHelper() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @JvmStatic
    @SuppressLint(value={"PrivateApi"})
    @NotNull
    public static final String readSystemProperty(@NotNull String object) {
        String string2 = "";
        try {
            Class<?> clazz = Class.forName("android.os.SystemProperties", true, Context.class.getClassLoader());
            object = clazz.getMethod("get", String.class).invoke(clazz, object);
            object = object instanceof String ? (String)object : null;
            if (object != null) return object;
            return string2;
        }
        catch (Exception exception) {
            return string2;
        }
    }
}

