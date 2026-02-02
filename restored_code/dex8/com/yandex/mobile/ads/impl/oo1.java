/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.dh1
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.hi2
 *  com.yandex.mobile.ads.impl.jp0
 *  com.yandex.mobile.ads.impl.oo1$a
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.p4
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ag0;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.dh1;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.ha;
import com.yandex.mobile.ads.impl.hi2;
import com.yandex.mobile.ads.impl.jp0;
import com.yandex.mobile.ads.impl.oo1;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.p4;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public abstract class oo1
extends ag0
implements hi2 {
    @NotNull
    private final a A;
    @NotNull
    private final jp0 x;
    @NotNull
    private final ha y;
    private boolean z;

    public /* synthetic */ oo1(Context context, jp0 jp02, p4 p42) {
        this(context, jp02, p42, new ha(jp02));
    }

    @JvmOverloads
    public oo1(@NotNull Context context, @NotNull jp0 jp02, @NotNull p4 p42, @NotNull ha ha3) {
        super(context, jp02.getAdConfiguration$mobileads_externalRelease(), p42);
        this.x = jp02;
        this.y = ha3;
        this.z = true;
        this.A = new /* Unavailable Anonymous Inner Class!! */;
        jp02.addVisibilityChangeListener((hi2)this);
    }

    private final void x() {
        int n10 = op0.b;
        this.l().removeCallbacks((Runnable)this.A);
        b8 b82 = this.j();
        if (b82 != null && b82.V() && this.z && !this.n() && this.y.b()) {
            this.l().postDelayed((Runnable)this.A, (long)b82.g());
        }
    }

    public final void a(int n10) {
        this.x();
    }

    @Override
    public final void a(@NotNull dh1 dh12) {
        super.a(dh12);
        this.x();
    }

    @Override
    public final void b(@NotNull f3 f33) {
        super.b(f33);
        if (5 != f33.b() && 2 != f33.b()) {
            this.x();
        }
    }

    @Override
    public void c() {
        super.c();
        this.x.removeVisibilityChangeListener((hi2)this);
        int n10 = op0.b;
        this.z = false;
        this.l().removeCallbacks((Runnable)this.A);
    }

    @Override
    protected final void r() {
        super.r();
        this.x();
    }
}

