/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  com.yandex.mobile.ads.impl.jp2
 *  com.yandex.mobile.ads.impl.np2
 *  com.yandex.mobile.ads.impl.po2
 *  com.yandex.mobile.ads.impl.sp2
 *  com.yandex.mobile.ads.impl.wo2
 *  com.yandex.mobile.ads.impl.yo2
 *  com.yandex.mobile.ads.impl.zo2
 *  com.yandex.mobile.ads.impl.zo2$a
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import com.yandex.mobile.ads.impl.jp2;
import com.yandex.mobile.ads.impl.n72;
import com.yandex.mobile.ads.impl.np2;
import com.yandex.mobile.ads.impl.oo2;
import com.yandex.mobile.ads.impl.po2;
import com.yandex.mobile.ads.impl.sp2;
import com.yandex.mobile.ads.impl.wo2;
import com.yandex.mobile.ads.impl.yo2;
import com.yandex.mobile.ads.impl.zo2;
import java.util.Iterator;

public final class vp2
implements jp2,
zo2.a {
    private static vp2 f;
    private float a = 0.0f;
    private final sp2 b;
    private final yo2 c;
    private np2 d;
    private po2 e;

    public vp2(sp2 sp22, yo2 yo22) {
        this.b = sp22;
        this.c = yo22;
    }

    public static vp2 a() {
        if (f == null) {
            yo2 yo22 = new yo2();
            f = new vp2(new sp2(), yo22);
        }
        return f;
    }

    public final void a(float f11) {
        this.a = f11;
        if (this.e == null) {
            this.e = po2.a();
        }
        Iterator iterator = this.e.c().iterator();
        while (iterator.hasNext()) {
            ((oo2)((Object)iterator.next())).j().a(f11);
        }
    }

    public final void a(Context context) {
        this.c.getClass();
        wo2 wo22 = new wo2();
        sp2 sp22 = this.b;
        Handler handler = new Handler();
        sp22.getClass();
        this.d = new np2(handler, context, wo22, (jp2)this);
    }

    public final void b() {
        zo2.a().a((zo2.a)this);
        zo2.a().b();
        n72.g().getClass();
        n72.a();
        this.d.a();
    }

    public final void c() {
        n72.g().b();
        zo2.a().c();
        this.d.b();
    }

    public final float d() {
        return this.a;
    }
}

