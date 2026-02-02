/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  okhttp3.e0
 *  org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
 *  retrofit2.a0
 *  retrofit2.h
 *  retrofit2.h$a
 *  retrofit2.q
 *  retrofit2.r
 */
package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import okhttp3.e0;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import retrofit2.a0;
import retrofit2.h;
import retrofit2.q;
import retrofit2.r;

@IgnoreJRERequirement
final class s
extends h.a {
    static final h.a a = new s();

    s() {
    }

    @Nullable
    public h<e0, ?> d(Type type, Annotation[] annotationArray, a0 a02) {
        if (h.a.b((Type)type) != q.a()) {
            return null;
        }
        return new a(a02.h(h.a.a((int)0, (ParameterizedType)((ParameterizedType)type)), annotationArray));
    }

    @IgnoreJRERequirement
    static final class a<T>
    implements h<e0, Optional<T>> {
        final h<e0, T> a;

        a(h<e0, T> h4) {
            this.a = h4;
        }

        public Optional<T> a(e0 e02) throws IOException {
            return r.a((Object)this.a.convert((Object)e02));
        }
    }
}

