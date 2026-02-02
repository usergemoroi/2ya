/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  dalvik.system.VMRuntime
 */
package org.lsposed.hiddenapibypass;

import android.util.Log;
import dalvik.system.VMRuntime;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandleInfo;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.lsposed.hiddenapibypass.Helper$Class;
import org.lsposed.hiddenapibypass.Helper$Executable;
import org.lsposed.hiddenapibypass.Helper$HandleInfo;
import org.lsposed.hiddenapibypass.Helper$InvokeStub;
import org.lsposed.hiddenapibypass.Helper$MethodHandle;
import org.lsposed.hiddenapibypass.Helper$MethodHandleImpl;
import org.lsposed.hiddenapibypass.Helper$NeverCall;
import sun.misc.Unsafe;

public final class HiddenApiBypass {
    private static final Unsafe a;
    private static final long b;
    private static final long c;
    private static final long d;
    private static final long e;
    private static final long f;
    private static final long g;
    private static final long h;
    private static final long i;
    private static final long j;
    private static final long k;
    private static final long l;
    private static final long m;
    private static final Set n;

    static {
        long l4;
        long l5;
        Object object;
        Object object2;
        long l6;
        long l7;
        long l8;
        Unsafe unsafe;
        n = new HashSet();
        try {
            a = unsafe = (Unsafe)Unsafe.class.getDeclaredMethod("getUnsafe", new Class[0]).invoke(null, new Object[0]);
            b = unsafe.objectFieldOffset(Helper$Executable.class.getDeclaredField("artMethod"));
            c = unsafe.objectFieldOffset(Helper$Executable.class.getDeclaredField("declaringClass"));
            d = l8 = unsafe.objectFieldOffset(Helper$MethodHandle.class.getDeclaredField("artFieldOrMethod"));
            e = unsafe.objectFieldOffset(Helper$MethodHandleImpl.class.getDeclaredField("info"));
            f = l7 = unsafe.objectFieldOffset(Helper$Class.class.getDeclaredField("methods"));
            g = l6 = unsafe.objectFieldOffset(Helper$Class.class.getDeclaredField("iFields"));
            h = unsafe.objectFieldOffset(Helper$Class.class.getDeclaredField("sFields"));
            i = unsafe.objectFieldOffset(Helper$HandleInfo.class.getDeclaredField("member"));
            object2 = Helper$NeverCall.class.getDeclaredMethod("a", new Class[0]);
            object = Helper$NeverCall.class.getDeclaredMethod("b", new Class[0]);
            ((Method)object2).setAccessible(true);
            ((Method)object).setAccessible(true);
            object2 = MethodHandles.lookup().unreflect((Method)object2);
            object = MethodHandles.lookup().unreflect((Method)object);
            l5 = unsafe.getLong(object2, l8);
            l4 = unsafe.getLong(object, l8);
            l7 = unsafe.getLong(Helper$NeverCall.class, l7);
            l4 -= l5;
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            Log.e((String)"HiddenApiBypass", (String)"Initialize error", (Throwable)reflectiveOperationException);
            throw new ExceptionInInitializerError(reflectiveOperationException);
        }
        j = l4;
        k = l5 - l7 - l4;
        object = Helper$NeverCall.class.getDeclaredField("i");
        object2 = Helper$NeverCall.class.getDeclaredField("j");
        ((Field)object).setAccessible(true);
        ((Field)object2).setAccessible(true);
        object = MethodHandles.lookup().unreflectGetter((Field)object);
        object2 = MethodHandles.lookup().unreflectGetter((Field)object2);
        l5 = unsafe.getLong(object, l8);
        l8 = unsafe.getLong(object2, l8);
        l6 = unsafe.getLong(Helper$NeverCall.class, l6);
        l = l8 - l5;
        m = l5 - l6;
    }

    static boolean a(Class[] classArray, Object[] objectArray) {
        if (classArray.length != objectArray.length) {
            return false;
        }
        for (int i4 = 0; i4 < classArray.length; ++i4) {
            if (classArray[i4].isPrimitive()) {
                if (classArray[i4] == Integer.TYPE && !(objectArray[i4] instanceof Integer)) {
                    return false;
                }
                if (classArray[i4] == Byte.TYPE && !(objectArray[i4] instanceof Byte)) {
                    return false;
                }
                if (classArray[i4] == Character.TYPE && !(objectArray[i4] instanceof Character)) {
                    return false;
                }
                if (classArray[i4] == Boolean.TYPE && !(objectArray[i4] instanceof Boolean)) {
                    return false;
                }
                if (classArray[i4] == Double.TYPE && !(objectArray[i4] instanceof Double)) {
                    return false;
                }
                if (classArray[i4] == Float.TYPE && !(objectArray[i4] instanceof Float)) {
                    return false;
                }
                if (classArray[i4] == Long.TYPE && !(objectArray[i4] instanceof Long)) {
                    return false;
                }
                if (classArray[i4] != Short.TYPE || objectArray[i4] instanceof Short) continue;
                return false;
            }
            Object object = objectArray[i4];
            if (object == null || classArray[i4].isInstance(object)) continue;
            return false;
        }
        return true;
    }

    public static boolean addHiddenApiExemptions(String ... stringArray) {
        Set set = n;
        set.addAll(Arrays.asList(stringArray));
        stringArray = new String[((HashSet)set).size()];
        set.toArray(stringArray);
        return HiddenApiBypass.setHiddenApiExemptions(stringArray);
    }

    public static boolean clearHiddenApiExemptions() {
        ((HashSet)n).clear();
        return HiddenApiBypass.setHiddenApiExemptions(new String[0]);
    }

    public static Constructor getDeclaredConstructor(Class genericDeclaration2, Class ... classArray) {
        block0: for (GenericDeclaration genericDeclaration2 : HiddenApiBypass.getDeclaredMethods((Class)genericDeclaration2)) {
            Class<?>[] classArray2;
            if (!(genericDeclaration2 instanceof Constructor) || (classArray2 = ((Executable)genericDeclaration2).getParameterTypes()).length != classArray.length) continue;
            for (int i4 = 0; i4 < classArray.length; ++i4) {
                if (classArray[i4] != classArray2[i4]) continue block0;
            }
            return (Constructor)genericDeclaration2;
        }
        throw new NoSuchMethodException("Cannot find matching constructor");
    }

    public static Method getDeclaredMethod(Class object, String string, Class ... classArray) {
        block0: for (Executable executable : HiddenApiBypass.getDeclaredMethods((Class)object)) {
            Class<?>[] classArray2;
            if (!executable.getName().equals(string) || !(executable instanceof Method) || (classArray2 = executable.getParameterTypes()).length != classArray.length) continue;
            for (int i4 = 0; i4 < classArray.length; ++i4) {
                if (classArray[i4] != classArray2[i4]) continue block0;
            }
            return (Method)executable;
        }
        throw new NoSuchMethodException("Cannot find matching method");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List getDeclaredMethods(Class object) {
        int n4;
        long l4;
        Object object2;
        ArrayList<Executable> arrayList = new ArrayList<Executable>();
        if (((Class)object).isPrimitive()) return arrayList;
        if (((Class)object).isArray()) {
            return arrayList;
        }
        int n5 = 0;
        try {
            object2 = Helper$NeverCall.class.getDeclaredMethod("a", new Class[0]);
            ((Method)object2).setAccessible(true);
            object2 = MethodHandles.lookup().unreflect((Method)object2);
            Unsafe unsafe = a;
            l4 = unsafe.getLong(object, f);
            if (l4 == 0L) {
                return arrayList;
            }
            n4 = unsafe.getInt(l4);
        }
        catch (IllegalAccessException | NoSuchMethodException reflectiveOperationException) {
            return arrayList;
        }
        while (n5 < n4) {
            long l5 = n5;
            long l6 = j;
            long l7 = k;
            object = a;
            ((Unsafe)object).putLong(object2, d, l5 * l6 + l4 + l7);
            ((Unsafe)object).putObject(object2, e, null);
            try {
                MethodHandles.lookup().revealDirect((MethodHandle)object2);
            }
            catch (Throwable throwable) {}
            object = a;
            arrayList.add((Executable)((Unsafe)object).getObject((MethodHandleInfo)((Unsafe)object).getObject(object2, e), i));
            ++n5;
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List getInstanceFields(Class object) {
        int n4;
        int n5;
        long l4;
        Object object2;
        ArrayList<Field> arrayList = new ArrayList<Field>();
        if (((Class)object).isPrimitive()) return arrayList;
        if (((Class)object).isArray()) {
            return arrayList;
        }
        try {
            object2 = Helper$NeverCall.class.getDeclaredField("i");
            ((Field)object2).setAccessible(true);
            object2 = MethodHandles.lookup().unreflectGetter((Field)object2);
            Unsafe unsafe = a;
            l4 = unsafe.getLong(object, g);
            if (l4 == 0L) {
                return arrayList;
            }
            n5 = unsafe.getInt(l4);
            n4 = 0;
        }
        catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
            return arrayList;
        }
        while (n4 < n5) {
            long l5 = n4;
            long l6 = l;
            long l7 = m;
            object = a;
            ((Unsafe)object).putLong(object2, d, l5 * l6 + l4 + l7);
            ((Unsafe)object).putObject(object2, e, null);
            try {
                MethodHandles.lookup().revealDirect((MethodHandle)object2);
            }
            catch (Throwable throwable) {}
            object = a;
            arrayList.add((Field)((Unsafe)object).getObject((MethodHandleInfo)((Unsafe)object).getObject(object2, e), i));
            ++n4;
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List getStaticFields(Class object) {
        int n4;
        int n5;
        long l4;
        Object object2;
        ArrayList<Field> arrayList = new ArrayList<Field>();
        if (((Class)object).isPrimitive()) return arrayList;
        if (((Class)object).isArray()) {
            return arrayList;
        }
        try {
            object2 = Helper$NeverCall.class.getDeclaredField("s");
            ((Field)object2).setAccessible(true);
            object2 = MethodHandles.lookup().unreflectGetter((Field)object2);
            Unsafe unsafe = a;
            l4 = unsafe.getLong(object, h);
            if (l4 == 0L) {
                return arrayList;
            }
            n5 = unsafe.getInt(l4);
            n4 = 0;
        }
        catch (IllegalAccessException | NoSuchFieldException reflectiveOperationException) {
            return arrayList;
        }
        while (n4 < n5) {
            long l5 = n4;
            long l6 = l;
            long l7 = m;
            object = a;
            ((Unsafe)object).putLong(object2, d, l5 * l6 + l4 + l7);
            ((Unsafe)object).putObject(object2, e, null);
            try {
                MethodHandles.lookup().revealDirect((MethodHandle)object2);
            }
            catch (Throwable throwable) {}
            object = a;
            arrayList.add((Field)((Unsafe)object).getObject((MethodHandleInfo)((Unsafe)object).getObject(object2, e), i));
            ++n4;
        }
        return arrayList;
    }

    public static Object invoke(Class clazz, Object object, String string, Object ... objectArray) {
        if (object != null && !clazz.isInstance(object)) {
            throw new IllegalArgumentException("this object is not an instance of the given class");
        }
        Method method = Helper$InvokeStub.class.getDeclaredMethod("invoke", Object[].class);
        method.setAccessible(true);
        Unsafe unsafe = a;
        long l4 = unsafe.getLong(clazz, f);
        if (l4 != 0L) {
            int n4 = unsafe.getInt(l4);
            for (int i4 = 0; i4 < n4; ++i4) {
                long l5 = i4;
                long l6 = j;
                long l7 = k;
                a.putLong(method, b, l5 * l6 + l4 + l7);
                if (!string.equals(method.getName()) || !HiddenApiBypass.a(method.getParameterTypes(), objectArray)) continue;
                return method.invoke(object, objectArray);
            }
            throw new NoSuchMethodException("Cannot find matching method");
        }
        throw new NoSuchMethodException("Cannot find matching method");
    }

    public static Object newInstance(Class clazz, Object ... objectArray) {
        Method method = Helper$InvokeStub.class.getDeclaredMethod("invoke", Object[].class);
        Constructor constructor = Helper$InvokeStub.class.getDeclaredConstructor(Object[].class);
        constructor.setAccessible(true);
        Unsafe unsafe = a;
        long l4 = unsafe.getLong(clazz, f);
        if (l4 != 0L) {
            int n4 = unsafe.getInt(l4);
            for (int i4 = 0; i4 < n4; ++i4) {
                long l5 = (long)i4 * j + l4 + k;
                unsafe = a;
                long l6 = b;
                unsafe.putLong(method, l6, l5);
                if (!"<init>".equals(method.getName())) continue;
                unsafe.putLong(constructor, l6, l5);
                unsafe.putObject(constructor, c, clazz);
                if (!HiddenApiBypass.a(constructor.getParameterTypes(), objectArray)) continue;
                return constructor.newInstance(objectArray);
            }
            throw new NoSuchMethodException("Cannot find matching constructor");
        }
        throw new NoSuchMethodException("Cannot find matching constructor");
    }

    public static boolean setHiddenApiExemptions(String ... stringArray) {
        try {
            HiddenApiBypass.invoke(VMRuntime.class, HiddenApiBypass.invoke(VMRuntime.class, null, "getRuntime", new Object[0]), "setHiddenApiExemptions", new Object[]{stringArray});
            return true;
        }
        catch (Throwable throwable) {
            Log.w((String)"HiddenApiBypass", (String)"setHiddenApiExemptions", (Throwable)throwable);
            return false;
        }
    }
}

