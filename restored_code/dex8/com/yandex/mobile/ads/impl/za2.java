/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.ab2
 *  com.yandex.mobile.ads.impl.j50
 *  com.yandex.mobile.ads.impl.kx1
 *  com.yandex.mobile.ads.impl.mn1
 *  com.yandex.mobile.ads.impl.ra2
 *  com.yandex.mobile.ads.impl.vp
 *  com.yandex.mobile.ads.impl.x2
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.internal.a0
 *  kotlin.text.p
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ab2;
import com.yandex.mobile.ads.impl.j50;
import com.yandex.mobile.ads.impl.kx1;
import com.yandex.mobile.ads.impl.mn1;
import com.yandex.mobile.ads.impl.ra2;
import com.yandex.mobile.ads.impl.vp;
import com.yandex.mobile.ads.impl.x2;
import java.util.Map;
import java.util.Random;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.a0;
import kotlin.text.p;

final class za2
extends a0
implements l<mn1, mn1> {
    final ab2 b;
    final ra2 c;
    final x2 d;
    final Context e;

    za2(ab2 ab22, ra2 ra22, x2 x22, Context context) {
        this.b = ab22;
        this.c = ra22;
        this.d = x22;
        this.e = context;
        super(1);
    }

    public final Object invoke(Object object) {
        mn1 mn12 = (mn1)object;
        ab2 ab22 = this.b;
        Object object2 = this.c;
        object = this.d;
        Context context = this.e;
        mn12.a("charset", "UTF-8");
        ab2.b((ab2)ab22).getClass();
        mn12.a("rnd", String.valueOf(new Random().nextInt(89999999) + 10000000));
        object2 = object2.a();
        if (object2 != null) {
            for (Map.Entry entry : object2.entrySet()) {
                object2 = (String)entry.getKey();
                String object3 = (String)entry.getValue();
                if (!(p.h0((CharSequence)object2) ^ true)) continue;
                mn12.a((String)object2, object3);
            }
        }
        object2 = object.j();
        ab2.c((ab2)ab22).getClass();
        if (kx1.a((Context)context) ^ true) {
            mn12.a("uuid", object2.g());
            mn12.a("mauid", object2.e());
        }
        ab2.a((ab2)ab22).getClass();
        vp.a((Context)context, (mn1)mn12);
        new j50(context, (x2)object).a(context, mn12);
        return mn12;
    }
}

