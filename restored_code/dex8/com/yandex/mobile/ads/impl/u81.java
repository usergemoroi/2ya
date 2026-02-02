/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.z51
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.t81;
import com.yandex.mobile.ads.impl.z51;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;

public final class u81
implements z51 {
    @NotNull
    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private boolean b;

    public final void a() {
        this.b = false;
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((z51)iterator.next()).a();
        }
    }

    public final void a(@NotNull t81 t812) {
        this.a.add(t812);
        if (this.b) {
            t812.b();
        }
    }

    public final void b() {
        this.b = true;
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((z51)iterator.next()).b();
        }
    }

    public final void b(@NotNull t81 t812) {
        this.a.remove(t812);
    }
}

