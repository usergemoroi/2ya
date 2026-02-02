/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.fx1
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.mx1
 *  com.yandex.mobile.ads.impl.pt1
 *  com.yandex.mobile.ads.impl.qw0
 *  com.yandex.mobile.ads.impl.vc
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.b70;
import com.yandex.mobile.ads.impl.c62;
import com.yandex.mobile.ads.impl.fx1;
import com.yandex.mobile.ads.impl.kw0;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.mx1;
import com.yandex.mobile.ads.impl.pt1;
import com.yandex.mobile.ads.impl.qw0;
import com.yandex.mobile.ads.impl.vc;
import java.io.IOException;

public final class eu0
implements kw0,
kw0.a {
    public final qw0.b b;
    private final long c;
    private final vc d;
    private qw0 e;
    private kw0 f;
    @Nullable
    private kw0.a g;
    private boolean h;
    private long i;

    public eu0(qw0.b b10, vc vc3, long l10) {
        this.b = b10;
        this.d = vc3;
        this.c = l10;
        this.i = -9223372036854775807L;
    }

    public final long a() {
        return this.i;
    }

    @Override
    public final long a(long l10, fx1 fx12) {
        kw0 kw02 = this.f;
        int n10 = m92.a;
        return kw02.a(l10, fx12);
    }

    @Override
    public final long a(b70[] b70Array, boolean[] blArray, pt1[] pt1Array, boolean[] blArray2, long l10) {
        long l11 = this.i;
        if (l11 != -9223372036854775807L && l10 == this.c) {
            this.i = -9223372036854775807L;
            l10 = l11;
        }
        kw0 kw02 = this.f;
        int n10 = m92.a;
        return kw02.a(b70Array, blArray, pt1Array, blArray2, l10);
    }

    public final void a(long l10) {
        this.i = l10;
    }

    @Override
    public final void a(kw0.a object, long l10) {
        this.g = object;
        object = this.f;
        if (object != null) {
            l10 = this.c;
            long l11 = this.i;
            if (l11 != -9223372036854775807L) {
                l10 = l11;
            }
            object.a(this, l10);
        }
    }

    @Override
    public final void a(kw0 object) {
        object = this.g;
        int n10 = m92.a;
        object.a(this);
    }

    public final void a(mx1 object) {
        object = (kw0)object;
        object = this.g;
        int n10 = m92.a;
        object.a((mx1)this);
    }

    public final void a(qw0.b object) {
        long l10 = this.c;
        long l11 = this.i;
        if (l11 != -9223372036854775807L) {
            l10 = l11;
        }
        qw0 qw02 = this.e;
        qw02.getClass();
        object = qw02.a((qw0.b)((Object)object), this.d, l10);
        this.f = object;
        if (this.g != null) {
            object.a(this, l10);
        }
    }

    public final void a(qw0 qw02) {
        if (this.e == null) {
            this.e = qw02;
            return;
        }
        throw new IllegalStateException();
    }

    public final long b() {
        return this.c;
    }

    public final void c() {
        if (this.f != null) {
            qw0 qw02 = this.e;
            qw02.getClass();
            qw02.a(this.f);
        }
    }

    public final boolean continueLoading(long l10) {
        kw0 kw02 = this.f;
        boolean bl2 = kw02 != null && kw02.continueLoading(l10);
        return bl2;
    }

    @Override
    public final void discardBuffer(long l10, boolean bl2) {
        kw0 kw02 = this.f;
        int n10 = m92.a;
        kw02.discardBuffer(l10, bl2);
    }

    public final long getBufferedPositionUs() {
        kw0 kw02 = this.f;
        int n10 = m92.a;
        return kw02.getBufferedPositionUs();
    }

    public final long getNextLoadPositionUs() {
        kw0 kw02 = this.f;
        int n10 = m92.a;
        return kw02.getNextLoadPositionUs();
    }

    @Override
    public final c62 getTrackGroups() {
        kw0 kw02 = this.f;
        int n10 = m92.a;
        return kw02.getTrackGroups();
    }

    public final boolean isLoading() {
        kw0 kw02 = this.f;
        boolean bl2 = kw02 != null && kw02.isLoading();
        return bl2;
    }

    @Override
    public final void maybeThrowPrepareError() throws IOException {
        kw0 kw02 = this.f;
        if (kw02 != null) {
            kw02.maybeThrowPrepareError();
        } else {
            kw02 = this.e;
            if (kw02 != null) {
                kw02.maybeThrowSourceInfoRefreshError();
            }
        }
    }

    @Override
    public final long readDiscontinuity() {
        kw0 kw02 = this.f;
        int n10 = m92.a;
        return kw02.readDiscontinuity();
    }

    public final void reevaluateBuffer(long l10) {
        kw0 kw02 = this.f;
        int n10 = m92.a;
        kw02.reevaluateBuffer(l10);
    }

    @Override
    public final long seekToUs(long l10) {
        kw0 kw02 = this.f;
        int n10 = m92.a;
        return kw02.seekToUs(l10);
    }
}

