/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ae
 *  com.yandex.mobile.ads.impl.ce
 *  com.yandex.mobile.ads.impl.kq2
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.yc
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ae;
import com.yandex.mobile.ads.impl.ce;
import com.yandex.mobile.ads.impl.kq2;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.yc;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

public final class ad
implements ce {
    @NotNull
    private static final Object b = new Object();
    @NotNull
    private final Executor a;

    public ad(@NotNull Executor executor) {
        this.a = executor;
    }

    public static final /* synthetic */ Object a() {
        return b;
    }

    private static final void a(ad ad2, ae ae2) {
        ad2.getClass();
        ad.b(ae2);
        yc.a.getClass();
        yc.a((ae)ae2);
    }

    public static /* synthetic */ void b(ad ad2, ae ae2) {
        ad.a(ad2, ae2);
    }

    private static void b(ae ae2) {
        ae2.a();
        ae2.b();
        int n10 = op0.b;
    }

    public final void a(@NotNull ae ae2) {
        this.a.execute((Runnable)new kq2(this, ae2));
    }
}

