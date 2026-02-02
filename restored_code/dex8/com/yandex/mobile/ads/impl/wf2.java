/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.a73
 *  com.yandex.mobile.ads.impl.b73
 *  com.yandex.mobile.ads.impl.c73
 *  com.yandex.mobile.ads.impl.ct0
 *  com.yandex.mobile.ads.impl.du
 *  com.yandex.mobile.ads.impl.y63
 *  com.yandex.mobile.ads.impl.z63
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.a73;
import com.yandex.mobile.ads.impl.b73;
import com.yandex.mobile.ads.impl.c73;
import com.yandex.mobile.ads.impl.ct0;
import com.yandex.mobile.ads.impl.du;
import com.yandex.mobile.ads.impl.nf2;
import com.yandex.mobile.ads.impl.y63;
import com.yandex.mobile.ads.impl.z63;
import java.util.HashSet;
import java.util.LinkedHashSet;
import org.jetbrains.annotations.NotNull;

public final class wf2
implements du {
    @NotNull
    private final Object a;
    @NotNull
    private final ct0 b;
    @NotNull
    private final LinkedHashSet c;

    public /* synthetic */ wf2() {
        this(new Object(), new ct0());
    }

    public wf2(@NotNull Object object, @NotNull ct0 ct02) {
        this.a = object;
        this.b = ct02;
        this.c = new LinkedHashSet();
    }

    private final HashSet a() {
        Object object = this.a;
        synchronized (object) {
            HashSet hashSet = new HashSet(this.c);
            return hashSet;
        }
    }

    private static final void a(wf2 object) {
        object = ((wf2)object).a().iterator();
        while (object.hasNext()) {
            ((du)object.next()).onVideoCompleted();
        }
    }

    private static final void b(wf2 object) {
        object = ((wf2)object).a().iterator();
        while (object.hasNext()) {
            ((du)object.next()).onVideoError();
        }
    }

    private static final void c(wf2 object) {
        object = ((wf2)object).a().iterator();
        while (object.hasNext()) {
            ((du)object.next()).onVideoPaused();
        }
    }

    private static final void d(wf2 object) {
        object = ((wf2)object).a().iterator();
        while (object.hasNext()) {
            ((du)object.next()).onVideoPrepared();
        }
    }

    private static final void e(wf2 object) {
        object = ((wf2)object).a().iterator();
        while (object.hasNext()) {
            ((du)object.next()).onVideoResumed();
        }
    }

    public static /* synthetic */ void f(wf2 wf22) {
        wf2.d(wf22);
    }

    public static /* synthetic */ void g(wf2 wf22) {
        wf2.c(wf22);
    }

    public static /* synthetic */ void h(wf2 wf22) {
        wf2.b(wf22);
    }

    public static /* synthetic */ void i(wf2 wf22) {
        wf2.e(wf22);
    }

    public static /* synthetic */ void j(wf2 wf22) {
        wf2.a(wf22);
    }

    public final void a(@NotNull nf2 nf22) {
        Object object = this.a;
        synchronized (object) {
            this.c.add(nf22);
            return;
        }
    }

    public final void b() {
        this.c.clear();
        this.b.a();
    }

    public final void onVideoCompleted() {
        this.b.a((Runnable)new c73(this));
    }

    public final void onVideoError() {
        this.b.a((Runnable)new b73(this));
    }

    public final void onVideoPaused() {
        this.b.a((Runnable)new z63(this));
    }

    public final void onVideoPrepared() {
        this.b.a((Runnable)new a73(this));
    }

    public final void onVideoResumed() {
        this.b.a((Runnable)new y63(this));
    }
}

