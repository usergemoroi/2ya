/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.coreutils.internal.system;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001JM\u0010\n\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\bH\u0007\u00a2\u0006\u0004\b\n\u0010\u000bJS\u0010\r\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u00012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\bH\u0007\u00a2\u0006\u0004\b\r\u0010\u000eJS\u0010\u0012\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\bH\u0007\u00a2\u0006\u0004\b\u0012\u0010\u0013JY\u0010\u0014\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u00012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\bH\u0007\u00a2\u0006\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2={"Lio/appmetrica/analytics/coreutils/internal/system/SystemServiceUtils;", "", "T", "S", "systemService", "", "whileWhat", "whatIsNull", "Lio/appmetrica/analytics/coreapi/internal/backport/FunctionWithThrowable;", "tryBlock", "accessSystemServiceSafely", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lio/appmetrica/analytics/coreapi/internal/backport/FunctionWithThrowable;)Ljava/lang/Object;", "defaultValue", "accessSystemServiceSafelyOrDefault", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lio/appmetrica/analytics/coreapi/internal/backport/FunctionWithThrowable;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "serviceName", "accessSystemServiceByNameSafely", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/appmetrica/analytics/coreapi/internal/backport/FunctionWithThrowable;)Ljava/lang/Object;", "accessSystemServiceByNameSafelyOrDefault", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lio/appmetrica/analytics/coreapi/internal/backport/FunctionWithThrowable;)Ljava/lang/Object;", "core-utils_release"}, k=1, mv={1, 6, 0})
public final class SystemServiceUtils {
    @NotNull
    public static final SystemServiceUtils INSTANCE = new SystemServiceUtils();

    private SystemServiceUtils() {
    }

    @JvmStatic
    @Nullable
    public static final <T, S> S accessSystemServiceByNameSafely(@NotNull Context object, @NotNull String string2, @NotNull String string3, @NotNull String string4, @NotNull FunctionWithThrowable<T, S> functionWithThrowable) {
        try {
            object = SystemServiceUtils.accessSystemServiceSafely(object.getSystemService(string2), string3, string4, functionWithThrowable);
        }
        catch (Throwable throwable) {
            return null;
        }
        return (S)object;
    }

    @JvmStatic
    public static final <T, S> S accessSystemServiceByNameSafelyOrDefault(@NotNull Context object, @NotNull String string2, @NotNull String string3, @NotNull String string4, S s13, @NotNull FunctionWithThrowable<T, S> functionWithThrowable) {
        try {
            object = SystemServiceUtils.accessSystemServiceSafelyOrDefault(object.getSystemService(string2), string3, string4, s13, functionWithThrowable);
        }
        catch (Throwable throwable) {
            return s13;
        }
        return (S)object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @JvmStatic
    @Nullable
    public static final <T, S> S accessSystemServiceSafely(@Nullable T object, @NotNull String string2, @NotNull String string3, @NotNull FunctionWithThrowable<T, S> functionWithThrowable) {
        if (object == null) return null;
        try {
            void var3_5;
            Object r14 = var3_5.apply(object);
            return (S)r14;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    @JvmStatic
    public static final <T, S> S accessSystemServiceSafelyOrDefault(@Nullable T object, @NotNull String string2, @NotNull String string3, S s13, @NotNull FunctionWithThrowable<T, S> functionWithThrowable) {
        block0: {
            if ((object = SystemServiceUtils.accessSystemServiceSafely(object, string2, string3, functionWithThrowable)) != null) break block0;
            object = s13;
        }
        return (S)object;
    }
}

