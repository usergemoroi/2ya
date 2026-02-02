/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.dc0
 *  com.yandex.mobile.ads.impl.fx1
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.mx1
 *  com.yandex.mobile.ads.impl.pt1
 *  com.yandex.mobile.ads.impl.w01
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.b70;
import com.yandex.mobile.ads.impl.c62;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.dc0;
import com.yandex.mobile.ads.impl.fx1;
import com.yandex.mobile.ads.impl.jy;
import com.yandex.mobile.ads.impl.kw0;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.mx1;
import com.yandex.mobile.ads.impl.pt1;
import com.yandex.mobile.ads.impl.w01;
import java.io.IOException;

public final class wo
implements kw0,
kw0.a {
    public final kw0 b;
    @Nullable
    private kw0.a c;
    private a[] d;
    private long e;
    long f;
    long g;

    public wo(kw0 kw02, boolean bl2, long l10, long l11) {
        this.b = kw02;
        this.d = new a[0];
        long l13 = bl2 ? l10 : -9223372036854775807L;
        this.e = l13;
        this.f = l10;
        this.g = l11;
    }

    @Override
    public final long a(long l10, fx1 fx12) {
        long l11 = this.f;
        if (l10 == l11) {
            return l11;
        }
        long l13 = fx12.a;
        int n10 = m92.a;
        l13 = Math.max(0L, Math.min(l13, l10 - l11));
        long l14 = fx12.b;
        l11 = this.g;
        l11 = l11 == Long.MIN_VALUE ? Long.MAX_VALUE : (l11 -= l10);
        l11 = Math.max(0L, Math.min(l14, l11));
        if (l13 != fx12.a || l11 != fx12.b) {
            fx12 = new fx1(l13, l11);
        }
        return this.b.a(l10, fx12);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final long a(b70[] pt12, boolean[] object, pt1[] pt1Array, boolean[] objectArray, long l10) {
        long l11;
        int n10;
        this.d = new a[pt1Array.length];
        pt1[] pt1Array2 = new pt1[pt1Array.length];
        int n13 = 0;
        int n14 = 0;
        while (true) {
            a a14;
            n10 = pt1Array.length;
            pt1 pt13 = null;
            if (n14 >= n10) break;
            a[] aArray = this.d;
            aArray[n14] = a14 = (a)pt1Array[n14];
            if (a14 != null) {
                pt13 = a14.a;
            }
            pt1Array2[n14] = pt13;
            ++n14;
        }
        long l13 = this.b.a((b70[])pt12, (boolean[])object, pt1Array2, (boolean[])objectArray, l10);
        long l14 = this.e;
        long l15 = l11 = -9223372036854775807L;
        if (l14 != -9223372036854775807L) {
            l14 = this.f;
            l15 = l11;
            if (l10 == l14) {
                l15 = l11;
                if (l14 != 0L) {
                    n10 = ((pt1)pt12).length;
                    n14 = 0;
                    while (true) {
                        l15 = l11;
                        if (n14 >= n10) break;
                        object = pt12[n14];
                        if (object != null) {
                            object = object.e();
                            if (!w01.a((String)((cc0)object).m, (String)((cc0)object).j)) {
                                l15 = l13;
                                break;
                            }
                        }
                        ++n14;
                    }
                }
            }
        }
        this.e = l15;
        n14 = n13;
        if (l13 != l10) {
            if (l13 < this.f) throw new IllegalStateException();
            l10 = this.g;
            n14 = n13;
            if (l10 != Long.MIN_VALUE) {
                if (l13 > l10) throw new IllegalStateException();
                n14 = n13;
            }
        }
        while (n14 < pt1Array.length) {
            pt12 = pt1Array2[n14];
            if (pt12 == null) {
                this.d[n14] = null;
            } else {
                objectArray = this.d;
                object = objectArray[n14];
                if (object == null || ((a)object).a != pt12) {
                    objectArray[n14] = new a(this, pt12);
                }
            }
            pt1Array[n14] = this.d[n14];
            ++n14;
        }
        return l13;
    }

    public final void a(long l10) {
        this.f = 0L;
        this.g = l10;
    }

    @Override
    public final void a(kw0.a a14, long l10) {
        this.c = a14;
        this.b.a(this, l10);
    }

    @Override
    public final void a(kw0 object) {
        object = this.c;
        object.getClass();
        object.a(this);
    }

    public final void a(mx1 object) {
        object = (kw0)object;
        object = this.c;
        object.getClass();
        object.a((mx1)this);
    }

    public final boolean continueLoading(long l10) {
        return this.b.continueLoading(l10);
    }

    @Override
    public final void discardBuffer(long l10, boolean bl2) {
        this.b.discardBuffer(l10, bl2);
    }

    public final long getBufferedPositionUs() {
        long l10;
        long l11 = this.b.getBufferedPositionUs();
        if (l11 != Long.MIN_VALUE && ((l10 = this.g) == Long.MIN_VALUE || l11 < l10)) {
            return l11;
        }
        return Long.MIN_VALUE;
    }

    public final long getNextLoadPositionUs() {
        long l10;
        long l11 = this.b.getNextLoadPositionUs();
        if (l11 != Long.MIN_VALUE && ((l10 = this.g) == Long.MIN_VALUE || l11 < l10)) {
            return l11;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final c62 getTrackGroups() {
        return this.b.getTrackGroups();
    }

    public final boolean isLoading() {
        return this.b.isLoading();
    }

    @Override
    public final void maybeThrowPrepareError() throws IOException {
        this.b.maybeThrowPrepareError();
    }

    @Override
    public final long readDiscontinuity() {
        long l10 = this.e;
        if (l10 != -9223372036854775807L) {
            this.e = -9223372036854775807L;
            long l11 = this.readDiscontinuity();
            if (l11 != -9223372036854775807L) {
                l10 = l11;
            }
            return l10;
        }
        long l13 = this.b.readDiscontinuity();
        if (l13 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (l13 >= this.f) {
            l10 = this.g;
            if (l10 != Long.MIN_VALUE && l13 > l10) {
                throw new IllegalStateException();
            }
            return l13;
        }
        throw new IllegalStateException();
    }

    public final void reevaluateBuffer(long l10) {
        this.b.reevaluateBuffer(l10);
    }

    @Override
    public final long seekToUs(long l10) {
        this.e = -9223372036854775807L;
        for (a a14 : this.d) {
            if (a14 == null) continue;
            a14.b = false;
        }
        long l11 = this.b.seekToUs(l10);
        if (l11 != l10 && (l11 < this.f || (l10 = this.g) != Long.MIN_VALUE && l11 > l10)) {
            throw new IllegalStateException();
        }
        return l11;
    }

    private final class a
    implements pt1 {
        public final pt1 a;
        private boolean b;
        final wo c;

        public a(wo wo3, pt1 pt12) {
            this.c = wo3;
            this.a = pt12;
        }

        public final int a(long l10) {
            if (this.c.e != -9223372036854775807L) {
                return -3;
            }
            return this.a.a(l10);
        }

        public final int a(dc0 object, jy object2, int n10) {
            if (this.c.e != -9223372036854775807L) {
                return -3;
            }
            if (this.b) {
                object2.d(4);
                return -4;
            }
            if ((n10 = this.a.a((dc0)object, (jy)((Object)object2), n10)) == -5) {
                object2 = ((dc0)object).b;
                object2.getClass();
                n10 = ((cc0)object2).C;
                if (n10 != 0 || ((cc0)object2).D != 0) {
                    wo wo3 = this.c;
                    long l10 = wo3.f;
                    int n13 = 0;
                    if (l10 != 0L) {
                        n10 = 0;
                    }
                    if (wo3.g == Long.MIN_VALUE) {
                        n13 = ((cc0)object2).D;
                    }
                    ((dc0)object).b = ((cc0)object2).a().d(n10).e(n13).a();
                }
                return -5;
            }
            object = this.c;
            long l11 = ((wo)object).g;
            if (l11 != Long.MIN_VALUE && (n10 == -4 && ((jy)((Object)object2)).f >= l11 || n10 == -3 && ((wo)object).getBufferedPositionUs() == Long.MIN_VALUE && !((jy)((Object)object2)).e)) {
                ((jy)((Object)object2)).b();
                object2.d(4);
                this.b = true;
                return -4;
            }
            return n10;
        }

        public final void a() throws IOException {
            this.a.a();
        }

        public final boolean d() {
            boolean bl2 = this.c.e == -9223372036854775807L && this.a.d();
            return bl2;
        }
    }
}

