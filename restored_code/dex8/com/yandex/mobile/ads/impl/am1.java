/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.kc2
 *  com.yandex.mobile.ads.impl.kf2
 *  com.yandex.mobile.ads.impl.nd2
 *  com.yandex.mobile.ads.impl.r62
 *  com.yandex.mobile.ads.impl.wa2$b
 *  com.yandex.mobile.ads.impl.zl1
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.kc2;
import com.yandex.mobile.ads.impl.kf2;
import com.yandex.mobile.ads.impl.lu;
import com.yandex.mobile.ads.impl.nd2;
import com.yandex.mobile.ads.impl.r62;
import com.yandex.mobile.ads.impl.wa2;
import com.yandex.mobile.ads.impl.zl1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

public final class am1
implements nd2 {
    private final Context a;
    @NotNull
    private final List<zl1> b;

    public am1(@NotNull Context context, @NotNull kc2<?> kc22) {
        this.a = context.getApplicationContext();
        this.b = am1.a(kc22);
    }

    private static List a(kc2 object) {
        Object e11;
        object = object.b();
        long l10 = ((lu)object).e();
        Object object2 = ((lu)object).j();
        object = new ArrayList();
        object2 = object2.iterator();
        while (object2.hasNext()) {
            e11 = object2.next();
            if (!y.e("progress", ((r62)e11).a())) continue;
            ((ArrayList)object).add(e11);
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Iterator iterator = ((ArrayList)object).iterator();
        while (iterator.hasNext()) {
            r62 r622 = (r62)iterator.next();
            object = r622.b();
            e11 = null;
            object2 = e11;
            if (object != null) {
                object = wa2.b.b == object.c() ? Long.valueOf((long)object.d()) : (wa2.b.c == object.c() ? Long.valueOf((long)(object.d() / (float)100 * (float)l10)) : null);
                object2 = e11;
                if (object != null) {
                    long l11 = ((Number)object).longValue();
                    object2 = new zl1(r622.c(), l11);
                }
            }
            if (object2 == null) continue;
            arrayList.add(object2);
        }
        return t.h1(arrayList);
    }

    public final void a(long l10, long l11) {
        Iterator<zl1> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            zl1 zl12 = iterator.next();
            if (zl12.a() > l11) continue;
            kf2.c.a(this.a).a(zl12.b());
            iterator.remove();
        }
    }
}

