/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.mobile.ads.impl.ht2
 *  com.yandex.mobile.ads.impl.k72
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.mw0
 *  com.yandex.mobile.ads.impl.qw0
 *  com.yandex.mobile.ads.impl.vc
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.eu0;
import com.yandex.mobile.ads.impl.ew0;
import com.yandex.mobile.ads.impl.hc0;
import com.yandex.mobile.ads.impl.ht2;
import com.yandex.mobile.ads.impl.k72;
import com.yandex.mobile.ads.impl.kw0;
import com.yandex.mobile.ads.impl.l52;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.mw0;
import com.yandex.mobile.ads.impl.qw0;
import com.yandex.mobile.ads.impl.tq;
import com.yandex.mobile.ads.impl.vc;
import com.yandex.mobile.ads.impl.w4;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class fu0
extends tq<Void> {
    private final qw0 k;
    private final boolean l;
    private final l52.d m;
    private final l52.b n;
    private a o;
    @Nullable
    private eu0 p;
    private boolean q;
    private boolean r;
    private boolean s;

    public fu0(qw0 qw02, boolean bl2) {
        this.k = qw02;
        if (bl2) {
            qw02.getClass();
            bl2 = true;
        } else {
            bl2 = false;
        }
        this.l = bl2;
        this.m = new l52.d();
        this.n = new l52.b();
        qw02.getClass();
        this.o = a.a(qw02.getMediaItem());
    }

    @RequiresNonNull(value={"unpreparedMaskingMediaPeriod"})
    private void a(long l10) {
        eu0 eu02 = this.p;
        int n10 = this.o.a(eu02.b.a);
        if (n10 == -1) {
            return;
        }
        long l11 = this.o.a((int)n10, (l52.b)this.n, (boolean)false).e;
        long l13 = l10;
        if (l11 != -9223372036854775807L) {
            l13 = l10;
            if (l10 >= l11) {
                l13 = Math.max(0L, l11 - 1L);
            }
        }
        eu02.a(l13);
    }

    @Override
    @Nullable
    protected final qw0.b a(Object object, qw0.b b10) {
        object = (Void)object;
        Object object2 = b10.a;
        Object object3 = this.o.e;
        object = object2;
        if (object3 != null) {
            object = object2;
            if (object3.equals(object2)) {
                object = a.f;
            }
        }
        return new qw0.b(b10.a(object));
    }

    @Override
    public final void a(@Nullable k72 k722) {
        super.a(k722);
        if (!this.l) {
            this.q = true;
            this.a(null, this.k);
        }
    }

    public final void a(kw0 kw02) {
        ((eu0)kw02).c();
        if (kw02 == this.p) {
            this.p = null;
        }
    }

    public final eu0 b(qw0.b b10, vc object, long l10) {
        eu0 eu02 = new eu0(b10, (vc)object, l10);
        eu02.a(this.k);
        if (this.r) {
            Object object2 = b10.a;
            object = object2;
            if (this.o.e != null) {
                object = object2;
                if (object2.equals(a.f)) {
                    object = this.o.e;
                }
            }
            eu02.a(new qw0.b(b10.a(object)));
        } else {
            this.p = eu02;
            if (!this.q) {
                this.q = true;
                this.a(null, this.k);
            }
        }
        return eu02;
    }

    @Override
    protected final void b(Object object, qw0 object2, l52 object3) {
        object = (Void)object;
        boolean bl2 = this.r;
        object2 = null;
        if (bl2) {
            object = this.o;
            this.o = new a((l52)object3, ((a)object).d, ((a)object).e, null);
            object3 = this.p;
            object = object2;
            if (object3 != null) {
                this.a(((eu0)object3).a());
                object = object2;
            }
        } else if (((l52)object3).c()) {
            if (this.s) {
                object = this.o;
                object = new a((l52)object3, ((a)object).d, ((a)object).e, null);
            } else {
                object = new a((l52)object3, l52.d.s, a.f, null);
            }
            this.o = object;
            object = object2;
        } else {
            Object object4;
            ((l52)object3).a(0, this.m, 0L);
            object = this.m;
            long l10 = ((l52.d)object).n;
            object = ((l52.d)object).b;
            Object object5 = this.p;
            long l11 = l10;
            if (object5 != null) {
                l11 = ((eu0)object5).b();
                object5 = this.o;
                Object object6 = this.p.b.a;
                object4 = this.n;
                ((a)object5).a(((a)object5).a(object6), (l52.b)object4, true);
                long l13 = this.n.f + l11;
                l11 = l10;
                if (l13 != this.o.a((int)0, (l52.d)this.m, (long)0L).n) {
                    l11 = l13;
                }
            }
            object4 = ((l52)object3).a(this.m, this.n, 0, l11);
            object5 = object4.first;
            l11 = (Long)object4.second;
            if (this.s) {
                object = this.o;
                object = new a((l52)object3, ((a)object).d, ((a)object).e, null);
            } else {
                object = new a((l52)object3, object, object5, null);
            }
            this.o = object;
            object3 = this.p;
            object = object2;
            if (object3 != null) {
                this.a(l11);
                object3 = ((eu0)object3).b;
                object = object2 = ((mw0)object3).a;
                if (this.o.e != null) {
                    object = object2;
                    if (object2.equals(a.f)) {
                        object = this.o.e;
                    }
                }
                object = new qw0.b(object3.a(object));
            }
        }
        this.s = true;
        this.r = true;
        this.a(this.o);
        if (object != null) {
            object2 = this.p;
            object2.getClass();
            ((eu0)object2).a((qw0.b)((Object)object));
        }
    }

    @Override
    public final void e() {
        this.r = false;
        this.q = false;
        super.e();
    }

    public final l52 f() {
        return this.o;
    }

    public final ew0 getMediaItem() {
        return this.k.getMediaItem();
    }

    public final void maybeThrowSourceInfoRefreshError() {
    }

    private static final class a
    extends hc0 {
        public static final Object f = new Object();
        @Nullable
        private final Object d;
        @Nullable
        private final Object e;

        private a(l52 l522, @Nullable Object object, @Nullable Object object2) {
            super(l522);
            this.d = object;
            this.e = object2;
        }

        /* synthetic */ a(l52 l522, Object object, Object object2, ht2 ht22) {
            this(l522, object, object2);
        }

        public static a a(ew0 ew02) {
            return new a(new b(ew02), l52.d.s, f);
        }

        @Override
        public final int a(Object object) {
            l52 l522 = this.c;
            Object object2 = object;
            if (f.equals(object)) {
                Object object3 = this.e;
                object2 = object;
                if (object3 != null) {
                    object2 = object3;
                }
            }
            return l522.a(object2);
        }

        @Override
        public final l52.b a(int n10, l52.b b10, boolean bl2) {
            this.c.a(n10, b10, bl2);
            if (m92.a((Object)b10.c, (Object)this.e) && bl2) {
                b10.c = f;
            }
            return b10;
        }

        @Override
        public final l52.d a(int n10, l52.d d10, long l10) {
            this.c.a(n10, d10, l10);
            if (m92.a((Object)d10.b, (Object)this.d)) {
                d10.b = l52.d.s;
            }
            return d10;
        }

        @Override
        public final Object a(int n10) {
            Object object;
            Object object2 = object = this.c.a(n10);
            if (m92.a((Object)object, (Object)this.e)) {
                object2 = f;
            }
            return object2;
        }
    }

    @VisibleForTesting
    public static final class b
    extends l52 {
        private final ew0 c;

        public b(ew0 ew02) {
            this.c = ew02;
        }

        @Override
        public final int a() {
            return 1;
        }

        @Override
        public final int a(Object object) {
            int n10 = object == a.f ? 0 : -1;
            return n10;
        }

        @Override
        public final l52.b a(int n10, l52.b b10, boolean bl2) {
            Object object = null;
            Integer n12 = bl2 ? Integer.valueOf(0) : null;
            if (bl2) {
                object = a.f;
            }
            b10.a(n12, object, 0, -9223372036854775807L, 0L, w4.h, true);
            return b10;
        }

        @Override
        public final l52.d a(int n10, l52.d d10, long l10) {
            d10.a(l52.d.s, this.c, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            d10.m = true;
            return d10;
        }

        @Override
        public final Object a(int n10) {
            return a.f;
        }

        @Override
        public final int b() {
            return 1;
        }
    }
}

