/*
 * Decompiled with CFR 0.152.
 */
package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import retrofit2.a0;
import retrofit2.b;
import retrofit2.d0;

public interface c<R, T> {
    public T adapt(b<R> var1);

    public Type responseType();

    public static abstract class a {
        protected static Type getParameterUpperBound(int n10, ParameterizedType parameterizedType) {
            return d0.g(n10, parameterizedType);
        }

        protected static Class<?> getRawType(Type type) {
            return d0.h(type);
        }

        @Nullable
        public abstract c<?, ?> get(Type var1, Annotation[] var2, a0 var3);
    }
}

