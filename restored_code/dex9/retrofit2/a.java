/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  kotlin.k0
 *  okhttp3.c0
 *  okhttp3.e0
 *  retrofit2.a0
 *  retrofit2.d0
 *  retrofit2.h
 *  retrofit2.h$a
 *  retrofit2.http.Streaming
 */
package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import kotlin.k0;
import okhttp3.c0;
import okhttp3.e0;
import retrofit2.a0;
import retrofit2.d0;
import retrofit2.h;
import retrofit2.http.Streaming;

final class a
extends h.a {
    private boolean a = true;

    a() {
    }

    @Nullable
    public h<?, c0> c(Type type, Annotation[] annotationArray, Annotation[] annotationArray2, a0 a02) {
        if (c0.class.isAssignableFrom(d0.h((Type)type))) {
            return b.a;
        }
        return null;
    }

    @Nullable
    public h<e0, ?> d(Type object, Annotation[] annotationArray, a0 a02) {
        if (object == e0.class) {
            object = d0.l((Annotation[])annotationArray, Streaming.class) ? c.a : retrofit2.a$a.a;
            return object;
        }
        if (object == Void.class) {
            return f.a;
        }
        if (this.a && object == k0.class) {
            try {
                object = e.a;
                return object;
            }
            catch (NoClassDefFoundError noClassDefFoundError) {
                this.a = false;
            }
        }
        return null;
    }

    static final class a
    implements h<e0, e0> {
        static final a a = new a();

        a() {
        }

        public e0 a(e0 e02) throws IOException {
            try {
                e0 e03 = d0.a((e0)e02);
                return e03;
            }
            finally {
                e02.close();
            }
        }
    }

    static final class b
    implements h<c0, c0> {
        static final b a = new b();

        b() {
        }

        public c0 a(c0 c02) {
            return c02;
        }
    }

    static final class c
    implements h<e0, e0> {
        static final c a = new c();

        c() {
        }

        public e0 a(e0 e02) {
            return e02;
        }
    }

    static final class d
    implements h<Object, String> {
        static final d a = new d();

        d() {
        }

        public String a(Object object) {
            return object.toString();
        }
    }

    static final class e
    implements h<e0, k0> {
        static final e a = new e();

        e() {
        }

        public k0 a(e0 e02) {
            e02.close();
            return k0.a;
        }
    }

    static final class f
    implements h<e0, Void> {
        static final f a = new f();

        f() {
        }

        public Void a(e0 e02) {
            e02.close();
            return null;
        }
    }
}

