/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.Cj;

public final class a {
    public final Context a;

    public a(Context context) {
        this.a = context;
    }

    public final byte[] a() {
        Object object;
        try {
            object = new StringBuilder(this.a.getPackageName());
            object = Cj.a(((StringBuilder)object).reverse().toString());
        }
        catch (Throwable throwable) {
            object = new byte[16];
        }
        return object;
    }

    public final byte[] b() {
        byte[] byArray;
        try {
            byArray = Cj.a(this.a.getPackageName());
        }
        catch (Throwable throwable) {
            byArray = new byte[16];
        }
        return byArray;
    }
}

