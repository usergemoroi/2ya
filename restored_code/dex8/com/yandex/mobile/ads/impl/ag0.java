/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.ao1
 *  com.yandex.mobile.ads.impl.df1
 *  com.yandex.mobile.ads.impl.ju
 *  com.yandex.mobile.ads.impl.n50
 *  com.yandex.mobile.ads.impl.p4
 *  com.yandex.mobile.ads.impl.qq0
 *  com.yandex.mobile.ads.impl.ux1
 *  com.yandex.mobile.ads.impl.ux1$a
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ao1;
import com.yandex.mobile.ads.impl.bg0;
import com.yandex.mobile.ads.impl.d3;
import com.yandex.mobile.ads.impl.df1;
import com.yandex.mobile.ads.impl.ju;
import com.yandex.mobile.ads.impl.kj;
import com.yandex.mobile.ads.impl.lj;
import com.yandex.mobile.ads.impl.n50;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.q7;
import com.yandex.mobile.ads.impl.qq0;
import com.yandex.mobile.ads.impl.ux1;
import com.yandex.mobile.ads.impl.x2;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;

public abstract class ag0
extends lj<String> {
    @NotNull
    private final df1 v;
    @NotNull
    private final ao1 w;

    public /* synthetic */ ag0(Context context, x2 x22, p4 p42) {
        this(context, x22, p42, ju.a((n50)x22.p().c()), new df1(), ao1.b.a());
    }

    protected ag0(@NotNull Context context, @NotNull x2 x22, @NotNull p4 p42, @NotNull q0 q02, @NotNull df1 df12, @NotNull ao1 ao12) {
        super(context, p42, x22, q02);
        this.v = df12;
        this.w = ao12;
    }

    @Override
    @NotNull
    protected final kj<String> a(@NotNull String string2, @NotNull String string3) {
        Object object = this.k();
        x2 x22 = this.e();
        ux1.a.getClass();
        object = new d3((Context)object, x22, string2, string3, this, this, ux1.a.a((Context)object), new bg0(), new q7());
        string2 = this.e().a();
        string3 = null;
        string2 = string2 != null ? string2.g() : null;
        this.v.getClass();
        if (string2 == null) {
            string2 = string3;
        } else {
            x22 = qq0.a((String)string2);
            string2 = string3;
            if (x22 != null) {
                string2 = string3;
                if (x22.has("response")) {
                    string2 = x22.optString("response");
                }
            }
        }
        if (string2 != null) {
            this.w.a((kj)((Object)object), string2);
        }
        return object;
    }
}

