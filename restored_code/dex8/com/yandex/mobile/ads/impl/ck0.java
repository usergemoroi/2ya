/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ac0
 *  com.yandex.mobile.ads.impl.ff2
 *  com.yandex.mobile.ads.impl.gp1
 *  com.yandex.mobile.ads.impl.hk0
 *  com.yandex.mobile.ads.impl.s11
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ac0;
import com.yandex.mobile.ads.impl.dk0;
import com.yandex.mobile.ads.impl.ff2;
import com.yandex.mobile.ads.impl.gp1;
import com.yandex.mobile.ads.impl.hk0;
import com.yandex.mobile.ads.impl.s11;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.jetbrains.annotations.NotNull;

public final class ck0
implements ac0,
ff2,
hk0,
s11,
gp1 {
    @NotNull
    private final LinkedHashSet a = new LinkedHashSet();
    @NotNull
    private final LinkedHashSet b = new LinkedHashSet();
    @NotNull
    private final LinkedHashSet c = new LinkedHashSet();
    @NotNull
    private final LinkedHashSet d = new LinkedHashSet();
    @NotNull
    private final LinkedHashSet e = new LinkedHashSet();

    public final void a() {
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((ac0)iterator.next()).a();
        }
    }

    public final void a(@NotNull ac0 ac02) {
        this.a.add(ac02);
    }

    public final void a(@NotNull dk0 dk02) {
        this.d.add(dk02);
    }

    public final void a(@NotNull s11 s112) {
        this.e.add(s112);
    }

    public final void b() {
        Iterator iterator = this.e.iterator();
        while (iterator.hasNext()) {
            ((s11)iterator.next()).b();
        }
    }

    public final void b(@NotNull dk0 dk02) {
        this.c.add(dk02);
    }

    public final void c() {
        Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            ((hk0)iterator.next()).c();
        }
    }

    public final void c(@NotNull dk0 dk02) {
        this.b.add(dk02);
    }

    public final void d() {
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((ff2)iterator.next()).d();
        }
    }

    public final void e() {
        Iterator iterator = this.e.iterator();
        while (iterator.hasNext()) {
            ((s11)iterator.next()).e();
        }
    }

    public final void f() {
        Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            ((gp1)iterator.next()).f();
        }
    }

    public final void g() {
        Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            ((hk0)iterator.next()).g();
        }
    }

    public final void h() {
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((ff2)iterator.next()).h();
        }
    }
}

