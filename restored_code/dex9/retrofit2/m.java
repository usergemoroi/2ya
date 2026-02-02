/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  kotlin.coroutines.d
 *  okhttp3.d0
 *  okhttp3.e$a
 *  okhttp3.e0
 *  retrofit2.a0
 *  retrofit2.b
 *  retrofit2.b0
 *  retrofit2.c
 *  retrofit2.d0
 *  retrofit2.d0$b
 *  retrofit2.h
 *  retrofit2.o
 *  retrofit2.y
 *  retrofit2.z
 */
package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import kotlin.coroutines.d;
import okhttp3.e;
import okhttp3.e0;
import retrofit2.a0;
import retrofit2.b0;
import retrofit2.c0;
import retrofit2.d0;
import retrofit2.h;
import retrofit2.o;
import retrofit2.p;
import retrofit2.y;
import retrofit2.z;

abstract class m<ResponseT, ReturnT>
extends b0<ReturnT> {
    private final y a;
    private final e.a b;
    private final h<e0, ResponseT> c;

    m(y y3, e.a a4, h<e0, ResponseT> h4) {
        this.a = y3;
        this.b = a4;
        this.c = h4;
    }

    private static <ResponseT, ReturnT> retrofit2.c<ResponseT, ReturnT> d(a0 a02, Method method, Type type, Annotation[] annotationArray) {
        try {
            a02 = a02.a(type, annotationArray);
            return a02;
        }
        catch (RuntimeException runtimeException) {
            throw d0.n((Method)method, (Throwable)runtimeException, (String)"Unable to create call adapter for %s", (Object[])new Object[]{type});
        }
    }

    private static <ResponseT> h<e0, ResponseT> e(a0 a02, Method method, Type type) {
        Annotation[] annotationArray = method.getAnnotations();
        try {
            a02 = a02.h(type, annotationArray);
            return a02;
        }
        catch (RuntimeException runtimeException) {
            throw d0.n((Method)method, (Throwable)runtimeException, (String)"Unable to create converter for %s", (Object[])new Object[]{type});
        }
    }

    static <ResponseT, ReturnT> m<ResponseT, ReturnT> f(a0 object, Method h4, y y3) {
        boolean bl;
        d0.b b4;
        boolean bl2 = y3.k;
        Annotation[] annotationArray = h4.getAnnotations();
        if (bl2) {
            b4 = h4.getGenericParameterTypes();
            if (d0.h(b4 = d0.f((int)0, (ParameterizedType)((ParameterizedType)b4[((Type[])b4).length - 1]))) == z.class && b4 instanceof ParameterizedType) {
                b4 = d0.g((int)0, (ParameterizedType)((ParameterizedType)b4));
                bl = true;
            } else {
                bl = false;
            }
            b4 = new d0.b(null, retrofit2.b.class, new Type[]{b4});
            annotationArray = c0.a(annotationArray);
        } else {
            b4 = h4.getGenericReturnType();
            bl = false;
        }
        b4 = m.d((a0)object, (Method)h4, (Type)b4, annotationArray);
        annotationArray = b4.responseType();
        if (annotationArray != okhttp3.d0.class) {
            if (annotationArray != z.class) {
                if (y3.c.equals("HEAD") && !Void.class.equals((Object)annotationArray)) {
                    throw d0.m(h4, (String)"HEAD method must use Void as response type.", (Object[])new Object[0]);
                }
                h4 = m.e((a0)object, (Method)h4, (Type)annotationArray);
                object = ((a0)object).b;
                if (!bl2) {
                    return new a(y3, (e.a)object, h4, b4);
                }
                if (bl) {
                    return new c<ResponseT>(y3, (e.a)object, h4, b4);
                }
                return new b<ResponseT>(y3, (e.a)object, h4, b4, false);
            }
            throw d0.m((Method)h4, (String)"Response must include generic type (e.g., Response<String>)", (Object[])new Object[0]);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("'");
        ((StringBuilder)object).append(d0.h((Type)annotationArray).getName());
        ((StringBuilder)object).append("' is not a valid response body type. Did you mean ResponseBody?");
        throw d0.m(h4, (String)((StringBuilder)object).toString(), (Object[])new Object[0]);
    }

    @Nullable
    final ReturnT a(Object[] objectArray) {
        return this.c(new p<ResponseT>(this.a, objectArray, this.b, this.c), objectArray);
    }

    @Nullable
    protected abstract ReturnT c(retrofit2.b<ResponseT> var1, Object[] var2);

    static final class a<ResponseT, ReturnT>
    extends m<ResponseT, ReturnT> {
        private final retrofit2.c<ResponseT, ReturnT> d;

        a(y y3, e.a a4, h<e0, ResponseT> h4, retrofit2.c<ResponseT, ReturnT> c4) {
            super(y3, a4, h4);
            this.d = c4;
        }

        @Override
        protected ReturnT c(retrofit2.b<ResponseT> b4, Object[] objectArray) {
            return (ReturnT)this.d.adapt(b4);
        }
    }

    static final class b<ResponseT>
    extends m<ResponseT, Object> {
        private final retrofit2.c<ResponseT, retrofit2.b<ResponseT>> d;
        private final boolean e;

        b(y y3, e.a a4, h<e0, ResponseT> h4, retrofit2.c<ResponseT, retrofit2.b<ResponseT>> c4, boolean bl) {
            super(y3, a4, h4);
            this.d = c4;
            this.e = bl;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        protected Object c(retrofit2.b<ResponseT> object, Object[] d4) {
            object = (retrofit2.b)this.d.adapt(object);
            d4 = (d)d4[((Object[])d4).length - 1];
            try {
                if (!this.e) return o.a((retrofit2.b)object, (d)d4);
                return o.b((retrofit2.b)object, (d)d4);
            }
            catch (Exception exception) {
                return o.d((Exception)exception, (d)d4);
            }
        }
    }

    static final class c<ResponseT>
    extends m<ResponseT, Object> {
        private final retrofit2.c<ResponseT, retrofit2.b<ResponseT>> d;

        c(y y3, e.a a4, h<e0, ResponseT> h4, retrofit2.c<ResponseT, retrofit2.b<ResponseT>> c4) {
            super(y3, a4, h4);
            this.d = c4;
        }

        @Override
        protected Object c(retrofit2.b<ResponseT> d4, Object[] object) {
            retrofit2.b b4 = (retrofit2.b)this.d.adapt(d4);
            d4 = (d)object[((Object[])object).length - 1];
            try {
                object = o.c((retrofit2.b)b4, (d)d4);
                return object;
            }
            catch (Exception exception) {
                return o.d((Exception)exception, (d)d4);
            }
        }
    }
}

