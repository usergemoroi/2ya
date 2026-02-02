/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  com.yandex.mobile.ads.impl.a6
 *  com.yandex.mobile.ads.impl.ct0
 *  com.yandex.mobile.ads.impl.g13
 *  com.yandex.mobile.ads.impl.gt0
 *  com.yandex.mobile.ads.impl.hs
 *  com.yandex.mobile.ads.impl.js
 *  com.yandex.mobile.ads.impl.z5
 */
package com.yandex.mobile.ads.impl;

import android.app.Activity;
import com.yandex.mobile.ads.impl.a6;
import com.yandex.mobile.ads.impl.ct0;
import com.yandex.mobile.ads.impl.fm2;
import com.yandex.mobile.ads.impl.g13;
import com.yandex.mobile.ads.impl.gf;
import com.yandex.mobile.ads.impl.gt0;
import com.yandex.mobile.ads.impl.hs;
import com.yandex.mobile.ads.impl.js;
import com.yandex.mobile.ads.impl.tm1;
import com.yandex.mobile.ads.impl.z5;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class nf
implements js {
    @NotNull
    private final gf a;
    @NotNull
    private final tm1 b;
    @NotNull
    private final gt0 c;
    @NotNull
    private final ct0 d;
    @NotNull
    private final AtomicBoolean e;
    @NotNull
    private final hs f;

    public nf(@NotNull gf gf3, @NotNull tm1 tm12, @NotNull gt0 gt02, @NotNull ct0 ct02) {
        this.a = gf3;
        this.b = tm12;
        this.c = gt02;
        this.d = ct02;
        this.e = new AtomicBoolean(false);
        this.f = gf3.n();
        gf3.a(tm12);
    }

    private static final void a(nf nf3, Activity object) {
        if (!nf3.e.getAndSet(true)) {
            if ((object = u.e(nf3.a.a((Activity)object))) != null) {
                nf3.b.a(new z5(String.valueOf(((Throwable)object).getMessage())));
            }
        } else {
            nf3.b.a(a6.b());
        }
    }

    public static /* synthetic */ void b(nf nf3, Activity activity) {
        nf.a(nf3, activity);
    }

    public final void a(@Nullable fm2 fm22) {
        this.c.a();
        this.b.a(fm22);
    }

    @NotNull
    public final hs getInfo() {
        return this.f;
    }

    public final void show(@NotNull Activity activity) {
        this.c.a();
        this.d.a((Runnable)new g13(this, activity));
    }
}

