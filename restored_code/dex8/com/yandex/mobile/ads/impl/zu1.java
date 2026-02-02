/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.lq1
 *  com.yandex.mobile.ads.impl.lr1
 *  com.yandex.mobile.ads.impl.ou1
 *  com.yandex.mobile.ads.impl.pw1
 *  com.yandex.mobile.ads.impl.pw1$a
 *  com.yandex.mobile.ads.impl.uc1
 *  com.yandex.mobile.ads.impl.xu1
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.cv1;
import com.yandex.mobile.ads.impl.lq1;
import com.yandex.mobile.ads.impl.lr1;
import com.yandex.mobile.ads.impl.ou1;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.uc1;
import com.yandex.mobile.ads.impl.wp1;
import com.yandex.mobile.ads.impl.xu1;
import org.jetbrains.annotations.NotNull;

public final class zu1
implements lq1<ou1> {
    @NotNull
    private final pw1 a;
    @NotNull
    private final lr1<ou1> b;
    @NotNull
    private final xu1 c;
    @NotNull
    private final Context d;

    public zu1(@NotNull Context context, @NotNull pw1 pw12, @NotNull lr1 lr12, @NotNull xu1 xu12) {
        this.a = pw12;
        this.b = lr12;
        this.c = xu12;
        this.d = context.getApplicationContext();
    }

    public /* synthetic */ zu1(Context context, wp1 wp12) {
        int n10 = pw1.l;
        this(context, pw1.a.a(), new cv1(wp12), new xu1());
    }

    public final Object a(uc1 uc12) {
        return (ou1)this.b.a(uc12);
    }

    public final boolean a() {
        ou1 ou12 = this.a.a(this.d);
        boolean bl2 = ou12 == null || this.c.a(ou12);
        return bl2;
    }
}

