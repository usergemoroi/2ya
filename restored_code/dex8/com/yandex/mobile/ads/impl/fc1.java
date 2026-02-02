/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.af1
 *  com.yandex.mobile.ads.impl.gc1
 *  com.yandex.mobile.ads.impl.t11
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.af1;
import com.yandex.mobile.ads.impl.gc1;
import com.yandex.mobile.ads.impl.t11;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;

public final class fc1
implements af1,
t11 {
    @NotNull
    private final CopyOnWriteArrayList<gc1> a = new CopyOnWriteArrayList();

    public final void a() {
        Iterator<gc1> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
        }
    }

    public final void a(@NotNull gc1 gc12) {
        this.a.add(gc12);
    }

    public final void a(boolean bl2) {
        Iterator<gc1> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(bl2);
        }
    }

    public final void b(@NotNull gc1 gc12) {
        this.a.remove(gc12);
    }

    public final void c() {
    }
}

