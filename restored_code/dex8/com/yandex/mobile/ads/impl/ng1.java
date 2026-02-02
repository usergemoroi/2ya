/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.SystemClock
 *  com.yandex.mobile.ads.impl.h13
 *  com.yandex.mobile.ads.impl.mg1
 *  com.yandex.mobile.ads.impl.ng1$b
 *  com.yandex.mobile.ads.impl.og1
 *  com.yandex.mobile.ads.impl.p52
 */
package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.SystemClock;
import com.yandex.mobile.ads.impl.h13;
import com.yandex.mobile.ads.impl.mg1;
import com.yandex.mobile.ads.impl.ng1;
import com.yandex.mobile.ads.impl.og1;
import com.yandex.mobile.ads.impl.p52;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class ng1
implements mg1 {
    private final boolean b;
    @NotNull
    private final Handler c;
    @NotNull
    private b d;
    @Nullable
    private og1 e;
    @Nullable
    private p52 f;
    private long g;
    private long h;
    private long i;

    public ng1(boolean bl2, @NotNull Handler handler) {
        this.b = bl2;
        this.c = handler;
        this.d = com.yandex.mobile.ads.impl.ng1$b.b;
    }

    private final void a() {
        this.d = com.yandex.mobile.ads.impl.ng1$b.c;
        this.i = SystemClock.elapsedRealtime();
        long l10 = (long)Math.min(200.0, (double)this.g);
        if (l10 > 0L) {
            this.c.postDelayed((Runnable)new /* Unavailable Anonymous Inner Class!! */, l10);
        } else {
            og1 og12 = this.e;
            if (og12 != null) {
                og12.a();
            }
            this.invalidate();
        }
    }

    public static final /* synthetic */ void a(ng1 ng12) {
        ng12.a();
    }

    public static final void b(ng1 ng12) {
        ng12.getClass();
        long l10 = SystemClock.elapsedRealtime();
        long l11 = ng12.i;
        ng12.i = l10;
        ng12.g = l11 = ng12.g - (l10 - l11);
        l11 = (long)Math.max(0.0, (double)l11);
        p52 p522 = ng12.f;
        if (p522 != null) {
            p522.a(l11, ng12.h - l11);
        }
    }

    private static final void c(ng1 ng12) {
        ng12.a();
    }

    public static /* synthetic */ void d(ng1 ng12) {
        ng1.c(ng12);
    }

    public final void a(long l10, @Nullable og1 og12) {
        this.invalidate();
        this.e = og12;
        this.g = l10;
        this.h = l10;
        if (this.b) {
            this.c.post((Runnable)new h13(this));
        } else {
            this.a();
        }
    }

    public final void a(@Nullable p52 p522) {
        this.f = p522;
    }

    public final void invalidate() {
        b b10 = com.yandex.mobile.ads.impl.ng1$b.b;
        if (b10 != this.d) {
            this.d = b10;
            this.e = null;
            this.c.removeCallbacksAndMessages(null);
        }
    }

    public final void pause() {
        if (com.yandex.mobile.ads.impl.ng1$b.c == this.d) {
            this.d = com.yandex.mobile.ads.impl.ng1$b.d;
            this.c.removeCallbacksAndMessages(null);
            long l10 = SystemClock.elapsedRealtime();
            long l11 = this.i;
            this.i = l10;
            this.g = l11 = this.g - (l10 - l11);
            l11 = (long)Math.max(0.0, (double)l11);
            p52 p522 = this.f;
            if (p522 != null) {
                p522.a(l11, this.h - l11);
            }
        }
    }

    public final void resume() {
        if (com.yandex.mobile.ads.impl.ng1$b.d == this.d) {
            this.a();
        }
    }

    public final void stop() {
        this.invalidate();
    }
}

