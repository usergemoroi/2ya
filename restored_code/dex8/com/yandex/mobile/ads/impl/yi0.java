/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.aj0
 *  com.yandex.mobile.ads.impl.aj0$a
 *  com.yandex.mobile.ads.impl.ar1$a
 *  com.yandex.mobile.ads.impl.dj2
 *  com.yandex.mobile.ads.impl.zi0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.aj0;
import com.yandex.mobile.ads.impl.ar1;
import com.yandex.mobile.ads.impl.dj2;
import com.yandex.mobile.ads.impl.zi0;

final class yi0
implements ar1.a {
    final String a;
    final aj0 b;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    yi0(aj0 aj02, String string2) {
        this.b = aj02;
        this.a = string2;
    }

    public final void a(dj2 dj22) {
        aj0 aj02 = this.b;
        String string2 = this.a;
        aj0.a a14 = (aj0.a)aj0.b((aj0)aj02).remove(string2);
        if (a14 != null) {
            aj0.a.f((aj0.a)a14, (dj2)dj22);
            aj0.c((aj0)aj02).put(string2, a14);
            if (aj0.e((aj0)aj02) == null) {
                dj22 = new zi0(aj02);
                aj0.f((aj0)aj02, (Runnable)dj22);
                aj0.d((aj0)aj02).postDelayed((Runnable)dj22, (long)100);
            }
        }
    }
}

