/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.af1
 *  com.yandex.mobile.ads.impl.s11
 *  com.yandex.mobile.ads.impl.t11
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.af1;
import com.yandex.mobile.ads.impl.s11;
import com.yandex.mobile.ads.impl.t11;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

public final class o21
implements s11,
t11,
af1 {
    @NotNull
    private final ArrayList a = new ArrayList();
    @NotNull
    private final ArrayList b = new ArrayList();
    @NotNull
    private final ArrayList c = new ArrayList();

    public final void a() {
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((t11)iterator.next()).a();
        }
    }

    public final void a(@NotNull af1 af12) {
        this.c.add(af12);
    }

    public final void a(@NotNull s11 s112) {
        this.a.add(s112);
    }

    public final void a(@NotNull t11 t112) {
        this.b.add(t112);
    }

    public final void a(boolean bl2) {
        Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            ((af1)iterator.next()).a(bl2);
        }
    }

    public final void b() {
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((s11)iterator.next()).b();
        }
    }

    public final void c() {
        Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            ((af1)iterator.next()).c();
        }
    }

    public final void e() {
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((s11)iterator.next()).e();
        }
    }
}

