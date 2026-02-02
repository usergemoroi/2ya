/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.reflect.a
 *  okhttp3.c0
 *  okhttp3.e0
 *  retrofit2.a0
 *  retrofit2.h
 *  retrofit2.h$a
 */
package retrofit2.converter.gson;

import com.google.gson.Gson;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.c0;
import okhttp3.e0;
import retrofit2.a0;
import retrofit2.converter.gson.b;
import retrofit2.converter.gson.c;
import retrofit2.h;

public final class a
extends h.a {
    private final Gson a;

    private a(Gson gson) {
        this.a = gson;
    }

    public static a f(Gson gson) {
        if (gson != null) {
            return new a(gson);
        }
        throw new NullPointerException("gson == null");
    }

    public h<?, c0> c(Type type, Annotation[] annotationArray, Annotation[] annotationArray2, a0 a02) {
        type = this.a.getAdapter(com.google.gson.reflect.a.b((Type)type));
        return new b(this.a, type);
    }

    public h<e0, ?> d(Type type, Annotation[] annotationArray, a0 a02) {
        type = this.a.getAdapter(com.google.gson.reflect.a.b((Type)type));
        return new c(this.a, type);
    }
}

