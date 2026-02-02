/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.dc2
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.hq1
 *  com.yandex.mobile.ads.impl.l40
 *  com.yandex.mobile.ads.impl.pm0$a
 *  com.yandex.mobile.ads.impl.qc2
 *  com.yandex.mobile.ads.impl.ss
 *  com.yandex.mobile.ads.impl.vi2
 *  com.yandex.mobile.ads.impl.vl0
 *  com.yandex.mobile.ads.impl.vl0$a
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.dc2;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.hq1;
import com.yandex.mobile.ads.impl.l40;
import com.yandex.mobile.ads.impl.pm0;
import com.yandex.mobile.ads.impl.qc2;
import com.yandex.mobile.ads.impl.rm0;
import com.yandex.mobile.ads.impl.ss;
import com.yandex.mobile.ads.impl.vi2;
import com.yandex.mobile.ads.impl.vl0;
import com.yandex.mobile.ads.impl.w1;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

public final class pm0
implements hq1<vi2>,
vl0.a {
    @NotNull
    private final a a;
    @NotNull
    private final vl0 b;
    @NotNull
    private final l40 c;
    private final Context d;

    public /* synthetic */ pm0(Context context, gv1 gv12, qc2 qc22, rm0 rm02) {
        this(context, rm02, new vl0(gv12, qc22), new l40());
    }

    public pm0(@NotNull Context context, @NotNull rm0 rm02, @NotNull vl0 vl02, @NotNull l40 l402) {
        this.a = rm02;
        this.b = vl02;
        this.c = l402;
        this.d = context.getApplicationContext();
    }

    public final void a(@NotNull dc2 dc22) {
        this.a.a(dc22.a());
    }

    public final void a(Object arrayList) {
        Object object = ((vi2)arrayList).a();
        arrayList = new ArrayList<Object>();
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object = (w1)iterator.next();
            if (!((w1)object).d().contains("linear")) continue;
            arrayList.add(object);
        }
        if (!arrayList.isEmpty()) {
            this.b.a(this.d, arrayList, (vl0.a)this);
        } else {
            this.a.a("Received response with no ad breaks");
        }
    }

    public final void a(@NotNull ArrayList arrayList) {
        this.c.getClass();
        arrayList = l40.a((ArrayList)arrayList);
        if (!arrayList.isEmpty()) {
            arrayList = new ss(arrayList);
            this.a.a((ss)arrayList);
        } else {
            this.a.a("Received response with no ad breaks");
        }
    }
}

