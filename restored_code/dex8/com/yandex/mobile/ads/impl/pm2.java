/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.kl0
 *  com.yandex.mobile.ads.impl.ss
 *  com.yandex.mobile.ads.instream.newapi.InstreamAd
 *  com.yandex.mobile.ads.instream.newapi.adbreak.InstreamAdBreak
 *  kotlin.jvm.functions.a
 *  kotlin.n
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.kl0;
import com.yandex.mobile.ads.impl.ml0;
import com.yandex.mobile.ads.impl.ss;
import com.yandex.mobile.ads.impl.xn2;
import com.yandex.mobile.ads.instream.newapi.InstreamAd;
import com.yandex.mobile.ads.instream.newapi.adbreak.InstreamAdBreak;
import java.util.List;
import kotlin.jvm.functions.a;
import kotlin.m;
import kotlin.n;
import org.jetbrains.annotations.NotNull;

public final class pm2
implements InstreamAd {
    @NotNull
    private final ss a;
    @NotNull
    private final kl0<InstreamAdBreak> b;
    @NotNull
    private final ml0 c;
    @NotNull
    private final m d;

    public pm2(@NotNull Context context, @NotNull ss ss3) {
        this.a = ss3;
        this.b = new kl0(context, new xn2(context), ss3);
        this.c = new ml0();
        this.d = n.b((a)new a<List<? extends InstreamAdBreak>>(this){
            final pm2 b;
            {
                this.b = pm22;
                super(0);
            }

            public final Object invoke() {
                return this.b.b.a(this.b.c);
            }
        });
    }

    @NotNull
    public final ss a() {
        return this.a;
    }

    @NotNull
    public final List<InstreamAdBreak> getInstreamAdBreaks() {
        return (List)this.d.getValue();
    }
}

