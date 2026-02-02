/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreutils.internal.reflection;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001J\"\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0087\b\u00a2\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007\u00a2\u0006\u0004\b\u0005\u0010\tJ,\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007J\u0016\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J=\u0010\u0011\u001a\u00020\f2\u0010\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000e2\u001a\u0010\u0010\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00070\u000e\"\u0006\u0012\u0002\b\u00030\u0007H\u0007\u00a2\u0006\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2={"Lio/appmetrica/analytics/coreutils/internal/reflection/ReflectionUtils;", "", "T", "", "className", "loadAndInstantiateClassWithDefaultConstructor", "(Ljava/lang/String;)Ljava/lang/Object;", "Ljava/lang/Class;", "targetType", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "loadClass", "findClass", "", "detectClassExists", "", "args", "expected", "isArgumentsOfClasses", "([Ljava/lang/Object;[Ljava/lang/Class;)Z", "core-utils_release"}, k=1, mv={1, 6, 0})
public final class ReflectionUtils {
    @NotNull
    public static final ReflectionUtils INSTANCE = new ReflectionUtils();

    private ReflectionUtils() {
    }

    @JvmStatic
    public static final boolean detectClassExists(@NotNull String string2) {
        boolean bl2 = ReflectionUtils.findClass(string2) != null;
        return bl2;
    }

    @JvmStatic
    @Nullable
    public static final Class<?> findClass(@NotNull String object) {
        try {
            object = Class.forName((String)object, false, ReflectionUtils.class.getClassLoader());
        }
        catch (Throwable throwable) {
            object = null;
        }
        return object;
    }

    @JvmStatic
    public static final boolean isArgumentsOfClasses(@NotNull Object[] objectArray, Class<?> ... classArray) {
        if (objectArray.length != classArray.length) {
            return false;
        }
        int n10 = objectArray.length;
        int n13 = 0;
        int n14 = 0;
        while (n13 < n10) {
            Object object = objectArray[n13];
            if (object != null && classArray[n14].isAssignableFrom(object.getClass())) {
                ++n13;
                ++n14;
                continue;
            }
            return false;
        }
        return true;
    }

    @JvmStatic
    public static final /* synthetic */ <T> T loadAndInstantiateClassWithDefaultConstructor(String string2) {
        y.p(4, "T");
        return (T)ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(string2, Object.class);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @JvmStatic
    @Nullable
    public static final <T> T loadAndInstantiateClassWithDefaultConstructor(@NotNull String constructor, @NotNull Class<T> clazz) {
        void var0_6;
        try {
            Constructor<T> constructor2;
            void var1_8;
            Class<T> clazz2 = ReflectionUtils.loadClass(constructor, var1_8);
            if (clazz2 != null && (constructor2 = clazz2.getConstructor(new Class[0])) != null) {
                T t13 = constructor2.newInstance(new Object[0]);
                return var0_6;
            }
        }
        catch (Throwable throwable) {}
        Object var0_5 = null;
        return var0_6;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @JvmStatic
    @Nullable
    public static final <T> Class<T> loadClass(@NotNull String clazz, @NotNull Class<T> clazz2) {
        block3: {
            try {
                clazz = Class.forName(clazz);
                boolean bl2 = clazz2.isAssignableFrom(clazz);
                if (!bl2) break block3;
                return clazz;
            }
            catch (Throwable throwable) {
                return null;
            }
        }
        return null;
    }
}

