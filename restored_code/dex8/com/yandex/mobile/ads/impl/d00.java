/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  com.yandex.mobile.ads.impl.fp1
 *  com.yandex.mobile.ads.impl.gg2
 *  com.yandex.mobile.ads.impl.gh
 *  com.yandex.mobile.ads.impl.kh
 *  com.yandex.mobile.ads.impl.kv0
 *  com.yandex.mobile.ads.impl.o01
 *  com.yandex.mobile.ads.impl.w42
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import com.yandex.mobile.ads.impl.ck;
import com.yandex.mobile.ads.impl.cp1;
import com.yandex.mobile.ads.impl.dv0;
import com.yandex.mobile.ads.impl.fp1;
import com.yandex.mobile.ads.impl.gg2;
import com.yandex.mobile.ads.impl.gh;
import com.yandex.mobile.ads.impl.in;
import com.yandex.mobile.ads.impl.kh;
import com.yandex.mobile.ads.impl.kv0;
import com.yandex.mobile.ads.impl.o01;
import com.yandex.mobile.ads.impl.p01;
import com.yandex.mobile.ads.impl.pv0;
import com.yandex.mobile.ads.impl.w42;
import com.yandex.mobile.ads.impl.x42;
import com.yandex.mobile.ads.impl.xz;
import com.yandex.mobile.ads.impl.zy;
import java.util.ArrayList;

public final class d00
implements fp1 {
    private final Context a;
    private final xz b;
    private kv0 c;

    public d00(Context context) {
        this.a = context;
        this.b = new xz();
        this.c = kv0.a;
    }

    public final cp1[] a(Handler handler, gg2 object, kh kh3, w42 w422, o01 o012) {
        ArrayList<ck> arrayList = new ArrayList<ck>();
        Context context = this.a;
        kv0 kv02 = this.c;
        arrayList.add(new pv0(context, this.b, kv02, handler, (gg2)object));
        object = this.a;
        object = new /* Unavailable Anonymous Inner Class!! */.a(gh.a((Context)object)).c().b().d().a();
        context = this.a;
        kv02 = this.c;
        arrayList.add(new dv0(context, this.b, kv02, handler, kh3, (zy)object));
        arrayList.add(new x42(w422, handler.getLooper()));
        arrayList.add(new p01(o012, handler.getLooper()));
        arrayList.add(new in());
        return arrayList.toArray(new cp1[0]);
    }
}

