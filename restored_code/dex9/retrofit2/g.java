/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.facebook.gamingservices.cloudgaming.b
 *  javax.annotation.Nullable
 *  org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
 *  retrofit2.a0
 *  retrofit2.b
 *  retrofit2.c
 *  retrofit2.c$a
 *  retrofit2.d
 *  retrofit2.e
 *  retrofit2.f
 *  retrofit2.g$b
 *  retrofit2.l
 *  retrofit2.z
 */
package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.a0;
import retrofit2.c;
import retrofit2.d;
import retrofit2.e;
import retrofit2.f;
import retrofit2.g;
import retrofit2.l;
import retrofit2.z;

@IgnoreJRERequirement
final class g
extends c.a {
    static final c.a a = new g();

    g() {
    }

    @Nullable
    public retrofit2.c<?, ?> get(Type type, Annotation[] annotationArray, a0 a02) {
        if (c.a.getRawType((Type)type) != e.a()) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            if (c.a.getRawType((Type)(type = c.a.getParameterUpperBound((int)0, (ParameterizedType)((ParameterizedType)type)))) != z.class) {
                return new a(type);
            }
            if (type instanceof ParameterizedType) {
                return new c(c.a.getParameterUpperBound((int)0, (ParameterizedType)((ParameterizedType)type)));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }

    @IgnoreJRERequirement
    private static final class retrofit2.g$a<R>
    implements retrofit2.c<R, CompletableFuture<R>> {
        private final Type a;

        retrofit2.g$a(Type type) {
            this.a = type;
        }

        public CompletableFuture<R> a(retrofit2.b<R> b4) {
            b b5 = new /* Unavailable Anonymous Inner Class!! */;
            b4.enqueue((d)new a(this, b5));
            return b5;
        }

        public Type responseType() {
            return this.a;
        }

        @IgnoreJRERequirement
        private class a
        implements d<R> {
            private final CompletableFuture<R> a;
            final retrofit2.g$a b;

            public a(retrofit2.g$a a4, CompletableFuture<R> completableFuture) {
                this.b = a4;
                this.a = completableFuture;
            }

            public void onFailure(retrofit2.b<R> b4, Throwable throwable) {
                f.a(this.a, (Throwable)throwable);
            }

            public void onResponse(retrofit2.b<R> b4, z<R> z3) {
                if (z3.e()) {
                    com.facebook.gamingservices.cloudgaming.b.a(this.a, (Object)z3.a());
                } else {
                    f.a(this.a, (Throwable)new l(z3));
                }
            }
        }
    }

    @IgnoreJRERequirement
    private static final class c<R>
    implements retrofit2.c<R, CompletableFuture<z<R>>> {
        private final Type a;

        c(Type type) {
            this.a = type;
        }

        public CompletableFuture<z<R>> a(retrofit2.b<R> b4) {
            b b5 = new /* Unavailable Anonymous Inner Class!! */;
            b4.enqueue((d)new a(this, b5));
            return b5;
        }

        public Type responseType() {
            return this.a;
        }

        @IgnoreJRERequirement
        private class a
        implements d<R> {
            private final CompletableFuture<z<R>> a;
            final c b;

            public a(c c4, CompletableFuture<z<R>> completableFuture) {
                this.b = c4;
                this.a = completableFuture;
            }

            public void onFailure(retrofit2.b<R> b4, Throwable throwable) {
                f.a(this.a, (Throwable)throwable);
            }

            public void onResponse(retrofit2.b<R> b4, z<R> z3) {
                com.facebook.gamingservices.cloudgaming.b.a(this.a, z3);
            }
        }
    }
}

