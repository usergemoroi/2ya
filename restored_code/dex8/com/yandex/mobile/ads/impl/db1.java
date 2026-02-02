/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ib1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ib1;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;

public final class db1
implements ib1 {
    @NotNull
    private final CopyOnWriteArrayList<ib1> a = new CopyOnWriteArrayList();

    public final void a(long l10, long l11) {
        Iterator<ib1> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(l10, l11);
        }
    }

    public final void a(@NotNull ib1 ib12) {
        this.a.add(ib12);
    }

    public final void b() {
        Iterator<ib1> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().b();
        }
    }

    public final void b(@NotNull ib1 ib12) {
        this.a.remove(ib12);
    }

    public final void c() {
        Iterator<ib1> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().c();
        }
    }
}

