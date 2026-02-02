/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.aj1
 *  com.yandex.mobile.ads.impl.cu
 *  com.yandex.mobile.ads.impl.rg2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.aj1;
import com.yandex.mobile.ads.impl.cu;
import com.yandex.mobile.ads.impl.nf2;
import com.yandex.mobile.ads.impl.rg2;
import com.yandex.mobile.ads.impl.wf2;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class rf2
implements aj1 {
    @NotNull
    private final cu a;
    @NotNull
    private final rg2 b;
    @NotNull
    private final wf2 c;

    public /* synthetic */ rf2(cu cu3) {
        this(cu3, new rg2(), new wf2());
    }

    @JvmOverloads
    public rf2(@NotNull cu cu3, @NotNull rg2 rg22, @NotNull wf2 wf22) {
        this.a = cu3;
        this.b = rg22;
        this.c = wf22;
    }

    @NotNull
    public final rg2 a() {
        return this.b;
    }

    public final void a(@NotNull nf2 nf22) {
        this.c.a(nf22);
    }

    public final long b() {
        return this.a.getVideoDuration();
    }

    public final long c() {
        return this.a.getVideoPosition();
    }

    public final void d() {
        this.a.pauseVideo();
    }

    public final void e() {
        this.a.prepareVideo();
    }

    public final void f() {
        this.a.resumeVideo();
    }

    public final void g() {
        this.a.a(this.c);
    }

    public final float getVolume() {
        return this.a.getVolume();
    }

    public final void h() {
        this.a.a(null);
        this.c.b();
    }
}

