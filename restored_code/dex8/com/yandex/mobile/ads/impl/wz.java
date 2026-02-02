/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.bv0
 *  com.yandex.mobile.ads.impl.wz$a
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.b42;
import com.yandex.mobile.ads.impl.bi1;
import com.yandex.mobile.ads.impl.bv0;
import com.yandex.mobile.ads.impl.cp1;
import com.yandex.mobile.ads.impl.dv0;
import com.yandex.mobile.ads.impl.g60;
import com.yandex.mobile.ads.impl.n22;
import com.yandex.mobile.ads.impl.n60;
import com.yandex.mobile.ads.impl.wz;

final class wz
implements bv0 {
    private final n22 b;
    private final a c;
    @Nullable
    private cp1 d;
    @Nullable
    private bv0 e;
    private boolean f;
    private boolean g;

    public wz(a a14, b42 b422) {
        this.c = a14;
        this.b = new n22(b422);
        this.f = true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final long a(boolean bl2) {
        Object object = this.d;
        if (object != null && !object.a() && (this.d.d() || !bl2 && !this.d.e())) {
            object = this.e;
            object.getClass();
            long l10 = object.o();
            if (this.f) {
                if (l10 < this.b.o()) {
                    this.b.b();
                    return this.o();
                }
                this.f = false;
                if (this.g) {
                    this.b.a();
                }
            }
            this.b.a(l10);
            object = object.getPlaybackParameters();
            if (((bi1)object).equals(this.b.getPlaybackParameters())) return this.o();
            this.b.a((bi1)object);
            ((n60)this.c).a((bi1)object);
            return this.o();
        }
        this.f = true;
        if (!this.g) return this.o();
        this.b.a();
        return this.o();
    }

    public final void a() {
        this.g = true;
        this.b.a();
    }

    public final void a(long l10) {
        this.b.a(l10);
    }

    public final void a(bi1 bi12) {
        bv0 bv02 = this.e;
        bi1 bi13 = bi12;
        if (bv02 != null) {
            bv02.a(bi12);
            bi13 = this.e.getPlaybackParameters();
        }
        this.b.a(bi13);
    }

    public final void a(cp1 cp12) {
        if (cp12 == this.d) {
            this.e = null;
            this.d = null;
            this.f = true;
        }
    }

    public final void b() {
        this.g = false;
        this.b.b();
    }

    public final void b(cp1 object) throws g60 {
        bv0 bv02;
        bv0 bv03 = object.l();
        if (bv03 != null && bv03 != (bv02 = this.e)) {
            if (bv02 == null) {
                this.e = bv03;
                this.d = object;
                object = this.b.getPlaybackParameters();
                ((dv0)bv03).a((bi1)object);
            } else {
                throw g60.a(new IllegalStateException("Multiple renderer media clocks enabled."));
            }
        }
    }

    public final bi1 getPlaybackParameters() {
        Object object = this.e;
        object = object != null ? object.getPlaybackParameters() : this.b.getPlaybackParameters();
        return object;
    }

    public final long o() {
        long l10;
        if (this.f) {
            l10 = this.b.o();
        } else {
            bv0 bv02 = this.e;
            bv02.getClass();
            l10 = bv02.o();
        }
        return l10;
    }
}

