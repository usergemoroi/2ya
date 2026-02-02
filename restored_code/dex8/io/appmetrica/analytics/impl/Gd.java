/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import io.appmetrica.analytics.impl.Bb;

public final class gd {
    public static final SparseArray c;
    public final String a;
    public final String b;

    static {
        SparseArray sparseArray;
        c = sparseArray = new SparseArray();
        Bb bb4 = Bb.c;
        sparseArray.put(5891, (Object)new gd("jvm", "binder"));
        sparseArray.put(5890, (Object)new gd("jvm", "file"));
        sparseArray.put(5889, (Object)new gd("jvm", "file"));
        sparseArray.put(5897, (Object)new gd("jni_native", "file"));
        sparseArray.put(5898, (Object)new gd("jni_native", "file"));
    }

    public gd(String string2, String string3) {
        this.a = string2;
        this.b = string3;
    }
}

