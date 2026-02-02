/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  com.yandex.mobile.ads.impl.aj0
 *  com.yandex.mobile.ads.impl.aj0$a
 *  com.yandex.mobile.ads.impl.ar1$b
 *  com.yandex.mobile.ads.impl.zi0
 */
package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.aj0;
import com.yandex.mobile.ads.impl.ar1;
import com.yandex.mobile.ads.impl.zi0;

final class xi0
implements ar1.b<Bitmap> {
    final String a;
    final aj0 b;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    xi0(aj0 aj02, String string2) {
        this.b = aj02;
        this.a = string2;
    }

    public final void a(Object object) {
        Bitmap bitmap = (Bitmap)object;
        object = this.b;
        String string2 = this.a;
        aj0.a((aj0)object).a(string2, bitmap);
        aj0.a a14 = (aj0.a)aj0.b((aj0)object).remove(string2);
        if (a14 != null) {
            aj0.a.e((aj0.a)a14, (Bitmap)bitmap);
            aj0.c((aj0)object).put(string2, a14);
            if (aj0.e((aj0)object) == null) {
                string2 = new zi0((aj0)object);
                aj0.f((aj0)object, (Runnable)((Object)string2));
                aj0.d((aj0)object).postDelayed((Runnable)((Object)string2), (long)100);
            }
        }
    }
}

