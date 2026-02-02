/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  androidx.annotation.IntRange
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.ct2
 *  com.yandex.mobile.ads.impl.ew0$b$a
 *  com.yandex.mobile.ads.impl.ew0$d
 *  com.yandex.mobile.ads.impl.ew0$d$a
 *  com.yandex.mobile.ads.impl.ew0$f
 *  com.yandex.mobile.ads.impl.ew0$h$a
 *  com.yandex.mobile.ads.impl.ew0$j
 *  com.yandex.mobile.ads.impl.ew0$j$a
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.ss2
 *  com.yandex.mobile.ads.impl.ts2
 *  com.yandex.mobile.ads.impl.vl
 *  com.yandex.mobile.ads.impl.vl$a
 *  com.yandex.mobile.ads.impl.xs2
 *  com.yandex.mobile.ads.impl.zs2
 */
package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ct2;
import com.yandex.mobile.ads.impl.ew0;
import com.yandex.mobile.ads.impl.hw0;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.qs2;
import com.yandex.mobile.ads.impl.rs2;
import com.yandex.mobile.ads.impl.ss2;
import com.yandex.mobile.ads.impl.ts2;
import com.yandex.mobile.ads.impl.vl;
import com.yandex.mobile.ads.impl.vs2;
import com.yandex.mobile.ads.impl.xj0;
import com.yandex.mobile.ads.impl.xs2;
import com.yandex.mobile.ads.impl.ys2;
import com.yandex.mobile.ads.impl.zs2;
import java.util.Collections;
import java.util.List;

public final class ew0
implements vl {
    public static final vl.a<ew0> h;
    public final String b;
    @Nullable
    public final g c;
    public final e d;
    public final hw0 e;
    public final c f;
    public final h g;

    static {
        new a(null);
        Collections.emptyList();
        xj0.h();
        Object object = new /* Unavailable Anonymous Inner Class!! */;
        Object object2 = com.yandex.mobile.ads.impl.ew0$h.d;
        object.a();
        object = hw0.H;
        h = new qs2();
    }

    private ew0(String string2, c c10, @Nullable g g10, e e11, hw0 hw02, h h10) {
        this.b = string2;
        this.c = g10;
        this.d = e11;
        this.e = hw02;
        this.f = c10;
        this.g = h10;
    }

    /* synthetic */ ew0(String string2, c c10, g g10, e e11, hw0 hw02, h h10, ct2 ct22) {
        this(string2, c10, g10, e11, hw02, h10);
    }

    private static ew0 a(Bundle object) {
        String string2 = object.getString(Integer.toString(0, 36), "");
        string2.getClass();
        Object object2 = object.getBundle(Integer.toString(1, 36));
        object2 = object2 == null ? com.yandex.mobile.ads.impl.ew0$e.g : (e)com.yandex.mobile.ads.impl.ew0$e.h.fromBundle(object2);
        Object object3 = object.getBundle(Integer.toString(2, 36));
        object3 = object3 == null ? hw0.H : (hw0)hw0.I.fromBundle(object3);
        Object object4 = object.getBundle(Integer.toString(3, 36));
        object4 = object4 == null ? com.yandex.mobile.ads.impl.ew0$c.h : (c)com.yandex.mobile.ads.impl.ew0$b.g.fromBundle(object4);
        object = object.getBundle(Integer.toString(4, 36));
        object = object == null ? com.yandex.mobile.ads.impl.ew0$h.d : (h)com.yandex.mobile.ads.impl.ew0$h.e.fromBundle(object);
        return new ew0(string2, (c)object4, null, (e)object2, (hw0)object3, (h)object);
    }

    public static ew0 a(String object) {
        b.a a13 = new /* Unavailable Anonymous Inner Class!! */;
        new a(null);
        List list = Collections.emptyList();
        xj0 xj02 = xj0.h();
        h h10 = com.yandex.mobile.ads.impl.ew0$h.d;
        object = object == null ? null : Uri.parse((String)object);
        object = object != null ? new g((Uri)object, null, null, list, null, xj02, null, null) : null;
        return new ew0("", new c(a13, null), (g)((Object)object), new e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), hw0.H, h10);
    }

    public static /* synthetic */ ew0 b(Bundle bundle) {
        return ew0.a(bundle);
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (!(object instanceof ew0)) {
            return false;
        }
        object = (ew0)object;
        if (!(m92.a((Object)this.b, (Object)((ew0)object).b) && this.f.equals(((ew0)object).f) && m92.a((Object)((Object)this.c), (Object)((Object)((ew0)object).c)) && m92.a((Object)this.d, (Object)((ew0)object).d) && m92.a((Object)this.e, (Object)((ew0)object).e) && m92.a((Object)this.g, (Object)((ew0)object).g))) {
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n10 = this.b.hashCode();
        g g10 = this.c;
        int n12 = g10 != null ? g10.hashCode() : 0;
        int n13 = this.d.hashCode();
        int n14 = this.f.hashCode();
        int n15 = this.e.hashCode();
        return this.g.hashCode() + (n15 + (n14 + (n13 + (n10 * 31 + n12) * 31) * 31) * 31) * 31;
    }

    /*
     * Exception performing whole class analysis ignored.
     */
    public static class b
    implements vl {
        public static final vl.a<c> g = new rs2();
        @IntRange(from=0L)
        public final long b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        private b(a a13) {
            this.b = a.a(a13);
            this.c = a.b(a13);
            this.d = a.c(a13);
            this.e = a.d(a13);
            this.f = a.e(a13);
        }

        /* synthetic */ b(a a13, ss2 ss22) {
            this(a13);
        }

        private static c a(Bundle bundle) {
            a a13 = new /* Unavailable Anonymous Inner Class!! */;
            long l10 = bundle.getLong(Integer.toString(0, 36), 0L);
            if (l10 >= 0L) {
                a.f(a13, (long)l10);
                l10 = bundle.getLong(Integer.toString(1, 36), Long.MIN_VALUE);
                if (l10 != Long.MIN_VALUE && l10 < 0L) {
                    throw new IllegalArgumentException();
                }
                a.g(a13, (long)l10);
                a.h(a13, (boolean)bundle.getBoolean(Integer.toString(2, 36), false));
                a.i(a13, (boolean)bundle.getBoolean(Integer.toString(3, 36), false));
                a.j(a13, (boolean)bundle.getBoolean(Integer.toString(4, 36), false));
                return new c(a13, null);
            }
            throw new IllegalArgumentException();
        }

        public static /* synthetic */ c b(Bundle bundle) {
            return com.yandex.mobile.ads.impl.ew0$b.a(bundle);
        }

        public final boolean equals(@Nullable Object object) {
            boolean bl2 = true;
            if (this == object) {
                return true;
            }
            if (!(object instanceof b)) {
                return false;
            }
            object = (b)object;
            if (this.b != ((b)object).b || this.c != ((b)object).c || this.d != ((b)object).d || this.e != ((b)object).e || this.f != ((b)object).f) {
                bl2 = false;
            }
            return bl2;
        }

        public final int hashCode() {
            long l10 = this.b;
            int n10 = (int)(l10 ^ l10 >>> 32);
            l10 = this.c;
            return (((n10 * 31 + (int)(l10 >>> 32 ^ l10)) * 31 + this.d) * 31 + this.e) * 31 + this.f;
        }
    }

    @Deprecated
    public static final class c
    extends b {
        public static final c h = new c(new /* Unavailable Anonymous Inner Class!! */);

        private c(b.a a13) {
            super(a13, null);
        }

        /* synthetic */ c(b.a a13, ts2 ts22) {
            this(a13);
        }
    }

    public static final class e
    implements vl {
        public static final e g = new e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
        public static final vl.a<e> h = new vs2();
        public final long b;
        public final long c;
        public final long d;
        public final float e;
        public final float f;

        @Deprecated
        public e(long l10, long l11, long l13, float f11, float f12) {
            this.b = l10;
            this.c = l11;
            this.d = l13;
            this.e = f11;
            this.f = f12;
        }

        private static e a(Bundle bundle) {
            return new e(bundle.getLong(Integer.toString(0, 36), -9223372036854775807L), bundle.getLong(Integer.toString(1, 36), -9223372036854775807L), bundle.getLong(Integer.toString(2, 36), -9223372036854775807L), bundle.getFloat(Integer.toString(3, 36), -3.4028235E38f), bundle.getFloat(Integer.toString(4, 36), -3.4028235E38f));
        }

        public static /* synthetic */ e b(Bundle bundle) {
            return com.yandex.mobile.ads.impl.ew0$e.a(bundle);
        }

        public final boolean equals(@Nullable Object object) {
            boolean bl2 = true;
            if (this == object) {
                return true;
            }
            if (!(object instanceof e)) {
                return false;
            }
            object = (e)object;
            if (this.b != ((e)object).b || this.c != ((e)object).c || this.d != ((e)object).d || this.e != ((e)object).e || this.f != ((e)object).f) {
                bl2 = false;
            }
            return bl2;
        }

        public final int hashCode() {
            long l10 = this.b;
            int n10 = (int)(l10 ^ l10 >>> 32);
            l10 = this.c;
            int n12 = (int)(l10 ^ l10 >>> 32);
            l10 = this.d;
            int n13 = (int)(l10 >>> 32 ^ l10);
            float f11 = this.e;
            int n14 = 0;
            int n15 = f11 != 0.0f ? Float.floatToIntBits(f11) : 0;
            f11 = this.f;
            if (f11 != 0.0f) {
                n14 = Float.floatToIntBits(f11);
            }
            return (((n10 * 31 + n12) * 31 + n13) * 31 + n15) * 31 + n14;
        }
    }

    @Deprecated
    public static final class g
    extends f {
        private g(Uri uri, @Nullable String string2, @Nullable d d10, List list, @Nullable String string3, xj0 xj02, @Nullable Object object) {
            super(uri, string2, d10, list, string3, xj02, object, null);
        }

        /* synthetic */ g(Uri uri, String string2, d d10, List list, String string3, xj0 xj02, Object object, xs2 xs22) {
            this(uri, string2, d10, list, string3, xj02, object);
        }
    }

    /*
     * Exception performing whole class analysis ignored.
     */
    public static final class h
    implements vl {
        public static final h d = new h(new /* Unavailable Anonymous Inner Class!! */);
        public static final vl.a<h> e = new ys2();
        @Nullable
        public final Uri b;
        @Nullable
        public final String c;

        private h(a a13) {
            this.b = a.a(a13);
            this.c = a.b(a13);
            a.c(a13);
        }

        private static h a(Bundle bundle) {
            a a13 = new /* Unavailable Anonymous Inner Class!! */;
            a.d(a13, (Uri)((Uri)bundle.getParcelable(Integer.toString(0, 36))));
            a.e(a13, (String)bundle.getString(Integer.toString(1, 36)));
            a.f(a13, (Bundle)bundle.getBundle(Integer.toString(2, 36)));
            return new h(a13);
        }

        public static /* synthetic */ h b(Bundle bundle) {
            return com.yandex.mobile.ads.impl.ew0$h.a(bundle);
        }

        public final boolean equals(@Nullable Object object) {
            boolean bl2 = true;
            if (this == object) {
                return true;
            }
            if (!(object instanceof h)) {
                return false;
            }
            object = (h)object;
            if (!m92.a((Object)this.b, (Object)((h)object).b) || !m92.a((Object)this.c, (Object)((h)object).c)) {
                bl2 = false;
            }
            return bl2;
        }

        public final int hashCode() {
            Object object = this.b;
            int n10 = 0;
            int n12 = object == null ? 0 : object.hashCode();
            object = this.c;
            if (object != null) {
                n10 = ((String)object).hashCode();
            }
            return n12 * 31 + n10;
        }
    }

    @Deprecated
    public static final class i
    extends j {
        private i(a a13) {
            super(a13, null);
        }

        /* synthetic */ i(a a13, zs2 zs22) {
            this(a13);
        }
    }
}

