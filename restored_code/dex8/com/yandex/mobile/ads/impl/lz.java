/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.GuardedBy
 *  androidx.annotation.RequiresApi
 *  com.yandex.mobile.ads.impl.b40
 *  com.yandex.mobile.ads.impl.c40
 *  com.yandex.mobile.ads.impl.ew0$d
 *  com.yandex.mobile.ads.impl.m92
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.impl.b40;
import com.yandex.mobile.ads.impl.c40;
import com.yandex.mobile.ads.impl.dq0;
import com.yandex.mobile.ads.impl.ew0;
import com.yandex.mobile.ads.impl.jh0;
import com.yandex.mobile.ads.impl.kz;
import com.yandex.mobile.ads.impl.lc0;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.qz;
import java.util.AbstractCollection;

public final class lz
implements c40 {
    private final Object a = new Object();
    @GuardedBy(value="lock")
    private ew0.d b;
    @GuardedBy(value="lock")
    private kz c;

    @RequiresApi(value=18)
    private static kz a(ew0.d d14) {
        Object object = new qz.a().b();
        Object object22 = d14.b;
        object22 = object22 == null ? null : object22.toString();
        object = new jh0((String)object22, d14.f, (qz.a)object);
        for (Object object22 : d14.c.e()) {
            ((jh0)object).a((String)object22.getKey(), (String)object22.getValue());
        }
        object22 = new /* Unavailable Anonymous Inner Class!! */.a(d14.a, lc0.e).a(d14.d).b(d14.e).a(dq0.a((AbstractCollection)((Object)d14.g))).a((jh0)object);
        ((kz)object22).a(d14.a());
        return object22;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final b40 a(ew0 object) {
        ((Object)((Object)((ew0)object).c)).getClass();
        Object object2 = ((ew0)object).c.c;
        if (object2 == null) return b40.a;
        if (m92.a < 18) {
            return b40.a;
        }
        object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (m92.a((Object)object2, (Object)this.b)) break block4;
                        this.b = object2;
                        this.c = lz.a(object2);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                object2 = this.c;
                object2.getClass();
                return object2;
            }
            throw throwable2;
        }
    }
}

