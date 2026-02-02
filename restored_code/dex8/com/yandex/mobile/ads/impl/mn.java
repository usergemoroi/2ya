/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.ky$a
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.n03
 *  com.yandex.mobile.ads.impl.q32
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.jy;
import com.yandex.mobile.ads.impl.ky;
import com.yandex.mobile.ads.impl.m03;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.n03;
import com.yandex.mobile.ads.impl.q32;
import com.yandex.mobile.ads.impl.r32;
import com.yandex.mobile.ads.impl.s32;
import com.yandex.mobile.ads.impl.u32;
import com.yandex.mobile.ads.impl.v32;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

abstract class mn
implements r32 {
    private final ArrayDeque<a> a = new ArrayDeque();
    private final ArrayDeque<v32> b;
    private final PriorityQueue<a> c;
    @Nullable
    private a d;
    private long e;
    private long f;

    public mn() {
        int n10;
        int n13 = 0;
        for (n10 = 0; n10 < 10; ++n10) {
            this.a.add(new a(null));
        }
        this.b = new ArrayDeque();
        for (n10 = n13; n10 < 2; ++n10) {
            this.b.add(new b(new m03(this)));
        }
        this.c = new PriorityQueue();
    }

    @Override
    public void a(long l10) {
        this.e = l10;
    }

    protected final void a(v32 v322) {
        v322.b();
        this.b.add(v322);
    }

    protected abstract void b(u32 var1);

    protected abstract q32 c();

    public void c(u32 u322) throws s32 {
        if (u322 == this.d) {
            if ((u322 = (a)u322).e()) {
                u322.b();
                this.a.add((a)u322);
            } else {
                long l10 = this.f;
                this.f = 1L + l10;
                ((a)u322).k = l10;
                this.c.add((a)u322);
            }
            this.d = null;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Nullable
    public u32 d() throws s32 {
        if (this.d == null) {
            a a13;
            if (this.a.isEmpty()) {
                return null;
            }
            this.d = a13 = this.a.pollFirst();
            return a13;
        }
        throw new IllegalStateException();
    }

    @Nullable
    public v32 e() throws s32 {
        if (this.b.isEmpty()) {
            return null;
        }
        while (!this.c.isEmpty()) {
            a a13 = this.c.peek();
            int n10 = m92.a;
            if (a13.f > this.e) break;
            a13 = this.c.poll();
            if (a13.f()) {
                v32 v322 = this.b.pollFirst();
                v322.b(4);
                a13.b();
                this.a.add(a13);
                return v322;
            }
            this.b(a13);
            if (this.h()) {
                q32 q322 = this.c();
                v32 v323 = this.b.pollFirst();
                v323.a(a13.f, q322, Long.MAX_VALUE);
                a13.b();
                this.a.add(a13);
                return v323;
            }
            a13.b();
            this.a.add(a13);
        }
        return null;
    }

    @Nullable
    protected final v32 f() {
        return this.b.pollFirst();
    }

    public void flush() {
        a a13;
        this.f = 0L;
        this.e = 0L;
        while (!this.c.isEmpty()) {
            a13 = this.c.poll();
            int n10 = m92.a;
            a13.b();
            this.a.add(a13);
        }
        a13 = this.d;
        if (a13 != null) {
            a13.b();
            this.a.add(a13);
            this.d = null;
        }
    }

    protected final long g() {
        return this.e;
    }

    protected abstract boolean h();

    private static final class a
    extends u32
    implements Comparable<a> {
        private long k;

        private a() {
        }

        /* synthetic */ a(n03 n032) {
            this();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final int compareTo(Object object) {
            object = (a)object;
            if (this.f() != object.f()) {
                if (!this.f()) return -1;
                return 1;
            } else {
                long l10;
                long l11 = l10 = this.f - ((jy)((Object)object)).f;
                if (l10 == 0L) {
                    l11 = l10 = this.k - ((a)object).k;
                    if (l10 == 0L) {
                        return 0;
                    }
                }
                if (l11 <= 0L) return -1;
            }
            return 1;
        }
    }

    private static final class b
    extends v32 {
        private ky.a<b> f;

        public b(ky.a<b> a13) {
            this.f = a13;
        }

        @Override
        public final void h() {
            this.f.a((ky)this);
        }
    }
}

