/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.mb2
 *  com.yandex.mobile.ads.impl.nb2
 *  com.yandex.mobile.ads.impl.ne1
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.mb2;
import com.yandex.mobile.ads.impl.nb2;
import com.yandex.mobile.ads.impl.ne1;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.t;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

public final class do2
implements mb2 {
    @NotNull
    private final ne1 a;
    @NotNull
    private final Object b;
    @NotNull
    private final ArrayList c;

    public do2(@NotNull Context context) {
        this.a = ne1.g.a(context);
        this.b = new Object();
        this.c = new ArrayList();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Object k02;
        List list;
        Object object222 = this.b;
        synchronized (object222) {
            list = t.e1((Iterable)this.c);
            this.c.clear();
            k02 = k0.a;
        }
        k02 = list.iterator();
        while (k02.hasNext()) {
            object222 = (nb2)k02.next();
            this.a.a((nb2)object222);
        }
        return;
    }

    public final void a(@NotNull nb2 object) {
        Object object2 = this.b;
        synchronized (object2) {
            this.c.add(object);
            this.a.b(object);
            object = k0.a;
            return;
        }
    }
}

