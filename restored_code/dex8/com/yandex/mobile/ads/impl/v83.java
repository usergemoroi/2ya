/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ed
 *  com.yandex.mobile.ads.impl.ed$a
 *  com.yandex.mobile.ads.impl.gw0
 *  com.yandex.mobile.ads.impl.vr0$a
 *  com.yandex.mobile.ads.impl.zr0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ed;
import com.yandex.mobile.ads.impl.gw0;
import com.yandex.mobile.ads.impl.vr0;
import com.yandex.mobile.ads.impl.wy;
import com.yandex.mobile.ads.impl.zr0;
import java.io.IOException;

public final class v83
implements vr0.a {
    public final ed.a a;
    public final zr0 b;
    public final gw0 c;
    public final IOException d;
    public final boolean e;

    public /* synthetic */ v83(ed.a a14, zr0 zr02, gw0 gw02, IOException iOException, boolean bl2) {
        this.a = a14;
        this.b = zr02;
        this.c = gw02;
        this.d = iOException;
        this.e = bl2;
    }

    public final void invoke(Object object) {
        wy.i(this.a, this.b, this.c, this.d, this.e, (ed)object);
    }
}

