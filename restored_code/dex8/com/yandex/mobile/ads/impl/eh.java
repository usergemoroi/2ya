/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  androidx.annotation.Nullable
 *  androidx.annotation.RequiresApi
 *  com.yandex.mobile.ads.impl.eh$c
 *  com.yandex.mobile.ads.impl.vl
 */
package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.impl.eh;
import com.yandex.mobile.ads.impl.ns2;
import com.yandex.mobile.ads.impl.vl;

public final class eh
implements vl {
    public static final eh h = new eh(0, 0, 1, 1, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    @Nullable
    private c g;

    static {
        new ns2();
    }

    private eh(int n10, int n12, int n13, int n14, int n15) {
        this.b = n10;
        this.c = n12;
        this.d = n13;
        this.e = n14;
        this.f = n15;
    }

    private static eh a(Bundle bundle) {
        int n10 = 0;
        int n12 = bundle.containsKey(Integer.toString(0, 36)) ? bundle.getInt(Integer.toString(0, 36)) : 0;
        int n13 = 1;
        int n14 = bundle.containsKey(Integer.toString(1, 36)) ? bundle.getInt(Integer.toString(1, 36)) : 0;
        int n15 = bundle.containsKey(Integer.toString(2, 36)) ? bundle.getInt(Integer.toString(2, 36)) : 1;
        if (bundle.containsKey(Integer.toString(3, 36))) {
            n13 = bundle.getInt(Integer.toString(3, 36));
        }
        if (bundle.containsKey(Integer.toString(4, 36))) {
            n10 = bundle.getInt(Integer.toString(4, 36));
        }
        return new eh(n12, n14, n15, n13, n10);
    }

    public static /* synthetic */ eh b(Bundle bundle) {
        return eh.a(bundle);
    }

    @RequiresApi(value=21)
    public final c a() {
        if (this.g == null) {
            this.g = new /* Unavailable Anonymous Inner Class!! */;
        }
        return this.g;
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && eh.class == object.getClass()) {
            object = (eh)object;
            if (this.b != ((eh)object).b || this.c != ((eh)object).c || this.d != ((eh)object).d || this.e != ((eh)object).e || this.f != ((eh)object).f) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b + 527) * 31 + this.c) * 31 + this.d) * 31 + this.e) * 31 + this.f;
    }
}

