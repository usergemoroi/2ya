/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  okhttp3.b0
 *  okio.m0
 *  retrofit2.SkipCallbackExecutor
 *  retrofit2.a0
 *  retrofit2.b
 *  retrofit2.c
 *  retrofit2.c$a
 *  retrofit2.d
 *  retrofit2.d0
 *  retrofit2.j
 *  retrofit2.k
 *  retrofit2.z
 */
package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.b0;
import okio.m0;
import retrofit2.SkipCallbackExecutor;
import retrofit2.a0;
import retrofit2.c;
import retrofit2.d;
import retrofit2.d0;
import retrofit2.j;
import retrofit2.k;
import retrofit2.z;

final class i
extends c.a {
    @Nullable
    private final Executor a;

    i(@Nullable Executor executor) {
        this.a = executor;
    }

    @Nullable
    public c<?, ?> get(Type object, Annotation[] annotationArray, a0 a02) {
        Type type = c.a.getRawType((Type)object);
        a02 = null;
        if (type != retrofit2.b.class) {
            return null;
        }
        if (object instanceof ParameterizedType) {
            type = d0.g((int)0, (ParameterizedType)((ParameterizedType)object));
            object = d0.l((Annotation[])annotationArray, SkipCallbackExecutor.class) ? a02 : this.a;
            return new c<Object, retrofit2.b<?>>(){
                final Type a;
                final Executor b;
                final i c;
                {
                    this.c = i4;
                    this.a = type;
                    this.b = executor;
                }

                public retrofit2.b<Object> a(retrofit2.b<Object> b4) {
                    Executor executor = this.b;
                    if (executor != null) {
                        b4 = new b<Object>(executor, b4);
                    }
                    return b4;
                }

                public Type responseType() {
                    return this.a;
                }
            };
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }

    static final class b<T>
    implements retrofit2.b<T> {
        final Executor c;
        final retrofit2.b<T> d;

        b(Executor executor, retrofit2.b<T> b4) {
            this.c = executor;
            this.d = b4;
        }

        public void cancel() {
            this.d.cancel();
        }

        public retrofit2.b<T> clone() {
            return new b<T>(this.c, this.d.clone());
        }

        public void enqueue(d<T> d4) {
            Objects.requireNonNull(d4, "callback == null");
            this.d.enqueue(new d<T>(){
                final d a;
                final b b;
                {
                    this.b = b4;
                    this.a = d4;
                }

                public static /* synthetic */ void a(a a4, d d4, Throwable throwable) {
                    a4.c(d4, throwable);
                }

                public static /* synthetic */ void b(a a4, d d4, z z3) {
                    a4.d(d4, z3);
                }

                private /* synthetic */ void c(d d4, Throwable throwable) {
                    d4.onFailure((retrofit2.b)this.b, throwable);
                }

                private /* synthetic */ void d(d d4, z z3) {
                    if (this.b.d.isCanceled()) {
                        d4.onFailure((retrofit2.b)this.b, (Throwable)new IOException("Canceled"));
                    } else {
                        d4.onResponse((retrofit2.b)this.b, z3);
                    }
                }

                public void onFailure(retrofit2.b<T> b4, Throwable throwable) {
                    this.b.c.execute((Runnable)new k(this, this.a, throwable));
                }

                public void onResponse(retrofit2.b<T> b4, z<T> z3) {
                    this.b.c.execute((Runnable)new j(this, this.a, z3));
                }
            });
        }

        public boolean isCanceled() {
            return this.d.isCanceled();
        }

        public boolean isExecuted() {
            return this.d.isExecuted();
        }

        public b0 request() {
            return this.d.request();
        }

        public m0 timeout() {
            return this.d.timeout();
        }
    }
}

