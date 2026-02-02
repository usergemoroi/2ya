/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.dj2
 *  com.yandex.mobile.ads.impl.iq1
 *  com.yandex.mobile.ads.impl.o4
 *  com.yandex.mobile.ads.impl.ou1
 *  com.yandex.mobile.ads.impl.p4
 *  com.yandex.mobile.ads.impl.su1$a
 *  com.yandex.mobile.ads.impl.uu1
 *  com.yandex.mobile.ads.impl.yq
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ak;
import com.yandex.mobile.ads.impl.dj2;
import com.yandex.mobile.ads.impl.iq1;
import com.yandex.mobile.ads.impl.o4;
import com.yandex.mobile.ads.impl.ou1;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.su1;
import com.yandex.mobile.ads.impl.tu1;
import com.yandex.mobile.ads.impl.uu1;
import com.yandex.mobile.ads.impl.yq;
import org.jetbrains.annotations.NotNull;

public final class av1
implements ak.a<ou1>,
iq1 {
    @NotNull
    private final uu1 a;
    @NotNull
    private final su1.a b;
    @NotNull
    private final p4 c;
    @NotNull
    private final Context d;
    @NotNull
    private final yq e;

    public av1(@NotNull Context context, @NotNull uu1 uu12, @NotNull tu1.b b10, @NotNull p4 p42) {
        this.a = uu12;
        this.b = b10;
        this.c = p42;
        this.d = context.getApplicationContext();
        this.e = yq.c;
    }

    public final void a(@NotNull dj2 dj22) {
        this.c.a(o4.m);
        this.b.a(dj22, this.e);
    }

    public final void a(Object object) {
        object = (ou1)object;
        this.a.a(this.d, (ou1)object);
        this.c.a(o4.m);
        this.b.a((ou1)object, this.e);
    }

    public final void b() {
        this.c.a(o4.l);
        this.c.a(o4.m, null);
    }
}

