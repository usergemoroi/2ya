/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.RemoteException
 *  android.util.Pair
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.tl
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.ul
 *  com.yandex.mobile.ads.impl.vl
 *  com.yandex.mobile.ads.impl.vl$a
 */
package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ew0;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.ny2;
import com.yandex.mobile.ads.impl.oy2;
import com.yandex.mobile.ads.impl.py2;
import com.yandex.mobile.ads.impl.tl;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.ul;
import com.yandex.mobile.ads.impl.vl;
import com.yandex.mobile.ads.impl.w4;
import com.yandex.mobile.ads.impl.xj0;
import java.util.AbstractCollection;

public abstract class l52
implements vl {
    public static final l52 b = new l52(){

        @Override
        public final int a() {
            return 0;
        }

        @Override
        public final int a(Object object) {
            return -1;
        }

        @Override
        public final b a(int n10, b b10, boolean bl2) {
            throw new IndexOutOfBoundsException();
        }

        @Override
        public final d a(int n10, d d10, long l10) {
            throw new IndexOutOfBoundsException();
        }

        @Override
        public final Object a(int n10) {
            throw new IndexOutOfBoundsException();
        }

        @Override
        public final int b() {
            return 0;
        }
    };

    static {
        new ny2();
    }

    protected l52() {
    }

    private static l52 a(Bundle object) {
        Object object2 = d.v;
        xj0<d> xj02 = l52.a(object2, ul.a((Bundle)object, (String)Integer.toString(0, 36)));
        xj0<b> xj03 = l52.a(com.yandex.mobile.ads.impl.l52$b.i, ul.a((Bundle)object, (String)Integer.toString(1, 36)));
        object = object2 = (Object)object.getIntArray(Integer.toString(2, 36));
        if (object2 == null) {
            int n10 = ((AbstractCollection)((Object)xj02)).size();
            object = new int[n10];
            for (int i14 = 0; i14 < n10; ++i14) {
                object[i14] = (vl.a<d>)i14;
            }
        }
        return new c(xj02, xj03, (int[])object);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static <T extends vl> xj0<T> a(vl.a<T> var0, @Nullable IBinder var1_3) {
        if (var1_3 == null) {
            return xj0.h();
        }
        var7_4 = new xj0.a<E>();
        var2_5 = tl.a;
        var2_5 = xj0.d;
        var8_6 = new xj0.a<E>();
        var4_7 = 0;
        var2_5 = 0;
        var3_8 = 1;
        while (var3_8 != 0) {
            var6_10 = Parcel.obtain();
            var5_9 = Parcel.obtain();
            var6_10.writeInt(var2_5);
            var1_3.transact(1, var6_10, var5_9, 0);

            {
                block10: {
        // Removed invalid catch block
lbl21:

                    while ((var3_8 = var5_9.readInt()) == 1) {
                        var9_11 = var5_9.readBundle();
                        var9_11.getClass();
                        var8_6.b(var9_11);
                        ++var2_5;
                    }
                    break block10;
                    var5_9.recycle();
                    var6_10.recycle();
                    throw var0_1;
                }
                var5_9.recycle();
                var6_10.recycle();
                continue;
        // Removed invalid catch block
            }
        }
        var1_3 = var8_6.a();
        var2_5 = var4_7;
        while (true) {
            if (var2_5 >= var1_3.size()) {
                return var7_4.a();
            }
            var7_4.b(var0.fromBundle((Bundle)var1_3.get(var2_5)));
            ++var2_5;
        }
    }

    public static /* synthetic */ l52 b(Bundle bundle) {
        return l52.a(bundle);
    }

    public abstract int a();

    public int a(int n10, int n12, boolean bl2) {
        if (n12 != 0) {
            if (n12 != 1) {
                if (n12 == 2) {
                    n10 = n10 == this.b(bl2) ? this.a(bl2) : ++n10;
                    return n10;
                }
                throw new IllegalStateException();
            }
            return n10;
        }
        n10 = n10 == this.b(bl2) ? -1 : ++n10;
        return n10;
    }

    public final int a(int n10, b b10, d d10, int n12, boolean bl2) {
        int n13 = this.a((int)n10, (b)b10, (boolean)false).d;
        if (this.a((int)n13, (d)d10, (long)0L).q == n10) {
            n10 = this.a(n13, n12, bl2);
            if (n10 == -1) {
                return -1;
            }
            return this.a((int)n10, (d)d10, (long)0L).p;
        }
        return n10 + 1;
    }

    public abstract int a(Object var1);

    public int a(boolean bl2) {
        int n10 = this.c() ? -1 : 0;
        return n10;
    }

    public final Pair<Object, Long> a(d pair, b b10, int n10, long l10) {
        pair = this.a((d)pair, b10, n10, l10, 0L);
        pair.getClass();
        return pair;
    }

    @Nullable
    public final Pair<Object, Long> a(d object, b b10, int n10, long l10, long l11) {
        uf.a((int)n10, (int)this.b());
        this.a(n10, (d)object, l11);
        l11 = l10;
        if (l10 == -9223372036854775807L) {
            l11 = l10 = ((d)object).n;
            if (l10 == -9223372036854775807L) {
                return null;
            }
        }
        n10 = ((d)object).p;
        this.a(n10, b10, false);
        while (n10 < ((d)object).q && b10.f != l11) {
            int n12 = n10 + 1;
            if (this.a((int)n12, (b)b10, (boolean)false).f > l11) break;
            n10 = n12;
        }
        this.a(n10, b10, true);
        long l13 = b10.e;
        l10 = l11 -= b10.f;
        if (l13 != -9223372036854775807L) {
            l10 = Math.min(l11, l13 - 1L);
        }
        l10 = Math.max(0L, l10);
        object = b10.c;
        object.getClass();
        return Pair.create((Object)object, (Object)l10);
    }

    public final b a(int n10, b b10) {
        return this.a(n10, b10, false);
    }

    public abstract b a(int var1, b var2, boolean var3);

    public b a(Object object, b b10) {
        return this.a(this.a(object), b10, true);
    }

    public abstract d a(int var1, d var2, long var3);

    public abstract Object a(int var1);

    public abstract int b();

    public int b(int n10, int n12, boolean bl2) {
        if (n12 != 0) {
            if (n12 != 1) {
                if (n12 == 2) {
                    n10 = n10 == this.a(bl2) ? this.b(bl2) : --n10;
                    return n10;
                }
                throw new IllegalStateException();
            }
            return n10;
        }
        n10 = n10 == this.a(bl2) ? -1 : --n10;
        return n10;
    }

    public int b(boolean bl2) {
        int n10 = this.c() ? -1 : this.b() - 1;
        return n10;
    }

    public final boolean c() {
        boolean bl2 = this.b() == 0;
        return bl2;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof l52)) {
            return false;
        }
        l52 l522 = (l52)object;
        if (l522.b() == this.b() && l522.a() == this.a()) {
            int n10;
            d d10 = new d();
            object = new b();
            d d14 = new d();
            b b10 = new b();
            for (n10 = 0; n10 < this.b(); ++n10) {
                if (this.a(n10, d10, 0L).equals(l522.a(n10, d14, 0L))) continue;
                return false;
            }
            for (n10 = 0; n10 < this.a(); ++n10) {
                if (this.a(n10, (b)object, true).equals(l522.a(n10, b10, true))) continue;
                return false;
            }
            n10 = this.a(true);
            if (n10 != l522.a(true)) {
                return false;
            }
            int n12 = this.b(true);
            if (n12 != l522.b(true)) {
                return false;
            }
            while (n10 != n12) {
                int n13 = this.a(n10, 0, true);
                if (n13 != l522.a(n10, 0, true)) {
                    return false;
                }
                n10 = n13;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int n10;
        d d10 = new d();
        b b10 = new b();
        int n12 = this.b() + 217;
        for (n10 = 0; n10 < this.b(); ++n10) {
            n12 = n12 * 31 + this.a(n10, d10, 0L).hashCode();
        }
        n10 = this.a() + n12 * 31;
        for (n12 = 0; n12 < this.a(); ++n12) {
            n10 = n10 * 31 + this.a(n12, b10, true).hashCode();
        }
        n12 = this.a(true);
        while (n12 != -1) {
            n10 = n10 * 31 + n12;
            n12 = this.a(n12, 0, true);
        }
        return n10;
    }

    public static final class b
    implements vl {
        public static final vl.a<b> i = new oy2();
        @Nullable
        public Object b;
        @Nullable
        public Object c;
        public int d;
        public long e;
        public long f;
        public boolean g;
        private w4 h = w4.h;

        private static b a(Bundle object) {
            int n10 = object.getInt(Integer.toString(0, 36), 0);
            long l10 = object.getLong(Integer.toString(1, 36), -9223372036854775807L);
            long l11 = object.getLong(Integer.toString(2, 36), 0L);
            boolean bl2 = object.getBoolean(Integer.toString(3, 36));
            object = (object = object.getBundle(Integer.toString(4, 36))) != null ? (w4)w4.j.fromBundle(object) : w4.h;
            b b10 = new b();
            b10.a(null, null, n10, l10, l11, (w4)object, bl2);
            return b10;
        }

        public static /* synthetic */ b b(Bundle bundle) {
            return com.yandex.mobile.ads.impl.l52$b.a(bundle);
        }

        public final int a() {
            return this.h.c;
        }

        public final int a(int n10) {
            return this.h.a((int)n10).c;
        }

        public final int a(long l10) {
            int n10;
            w4 w43 = this.h;
            long l11 = this.e;
            w43.getClass();
            int n12 = n10 = -1;
            if (l10 != Long.MIN_VALUE) {
                if (l11 != -9223372036854775807L && l10 >= l11) {
                    n12 = n10;
                } else {
                    int n13;
                    for (n13 = w43.f; n13 < w43.c; ++n13) {
                        if (w43.a((int)n13).b != Long.MIN_VALUE && w43.a((int)n13).b <= l10) continue;
                        w4.a a12 = w43.a(n13);
                        if (a12.c == -1 || a12.a(-1) < a12.c) break;
                    }
                    n12 = n10;
                    if (n13 < w43.c) {
                        n12 = n13;
                    }
                }
            }
            return n12;
        }

        public final long a(int n10, int n12) {
            w4.a a12 = this.h.a(n10);
            long l10 = a12.c != -1 ? a12.f[n12] : -9223372036854775807L;
            return l10;
        }

        public final b a(@Nullable Object object, @Nullable Object object2, int n10, long l10, long l11, w4 w43, boolean bl2) {
            this.b = object;
            this.c = object2;
            this.d = n10;
            this.e = l10;
            this.f = l11;
            this.h = w43;
            this.g = bl2;
            return this;
        }

        public final int b(int n10, int n12) {
            w4.a a12 = this.h.a(n10);
            n10 = a12.c != -1 ? a12.e[n12] : 0;
            return n10;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final int b(long l10) {
            long l11;
            int n10;
            w4 w43 = this.h;
            long l13 = this.e;
            for (n10 = w43.c - 1; n10 >= 0 && l10 != Long.MIN_VALUE && ((l11 = w43.a((int)n10).b) == Long.MIN_VALUE ? l13 == -9223372036854775807L || l10 < l13 : l10 < l11); --n10) {
            }
            if (n10 < 0) return -1;
            w4.a a12 = w43.a(n10);
            if (a12.c == -1) {
                return n10;
            }
            int n12 = 0;
            while (n12 < a12.c) {
                int n13 = a12.e[n12];
                int n14 = n10;
                if (n13 == 0) return n14;
                if (n13 == 1) {
                    return n10;
                }
                ++n12;
            }
            return -1;
        }

        public final long b() {
            return this.h.d;
        }

        public final long b(int n10) {
            return this.h.a((int)n10).b;
        }

        public final int c(int n10, int n12) {
            return this.h.a(n10).a(n12);
        }

        public final long c() {
            return this.f;
        }

        public final long c(int n10) {
            return this.h.a((int)n10).g;
        }

        public final int d() {
            return this.h.f;
        }

        public final int d(int n10) {
            return this.h.a(n10).a(-1);
        }

        public final boolean e(int n10) {
            int n12;
            w4.a a12 = this.h.a(n10);
            if (a12.c != -1) {
                int n13 = 0;
                n10 = 0;
                while (true) {
                    n12 = n13;
                    if (n10 < a12.c) {
                        n12 = a12.e[n10];
                        if (n12 == 0 || n12 == 1) break;
                        ++n10;
                        continue;
                    }
                    break;
                }
            } else {
                n12 = 1;
            }
            return n12 ^ true;
        }

        public final boolean equals(@Nullable Object object) {
            boolean bl2 = true;
            if (this == object) {
                return true;
            }
            if (object != null && b.class.equals(object.getClass())) {
                object = (b)object;
                if (!(m92.a((Object)this.b, (Object)((b)object).b) && m92.a((Object)this.c, (Object)((b)object).c) && this.d == ((b)object).d && this.e == ((b)object).e && this.f == ((b)object).f && this.g == ((b)object).g && m92.a((Object)this.h, (Object)((b)object).h))) {
                    bl2 = false;
                }
                return bl2;
            }
            return false;
        }

        public final boolean f(int n10) {
            return this.h.a((int)n10).h;
        }

        public final int hashCode() {
            Object object = this.b;
            int n10 = 0;
            int n12 = object == null ? 0 : object.hashCode();
            object = this.c;
            if (object != null) {
                n10 = object.hashCode();
            }
            int n13 = this.d;
            long l10 = this.e;
            int n14 = (int)(l10 ^ l10 >>> 32);
            l10 = this.f;
            int n15 = (int)(l10 ^ l10 >>> 32);
            int n16 = this.g;
            return this.h.hashCode() + ((((((n12 + 217) * 31 + n10) * 31 + n13) * 31 + n14) * 31 + n15) * 31 + n16) * 31;
        }
    }

    public static final class c
    extends l52 {
        private final xj0<d> c;
        private final xj0<b> d;
        private final int[] e;
        private final int[] f;

        public c(xj0<d> xj02, xj0<b> xj03, int[] nArray) {
            int n10 = ((AbstractCollection)((Object)xj02)).size();
            int n12 = nArray.length;
            boolean bl2 = n10 == n12;
            uf.a((boolean)bl2);
            this.c = xj02;
            this.d = xj03;
            this.e = nArray;
            this.f = new int[nArray.length];
            for (int i14 = 0; i14 < nArray.length; ++i14) {
                this.f[nArray[i14]] = i14;
            }
        }

        @Override
        public final int a() {
            return ((AbstractCollection)((Object)this.d)).size();
        }

        @Override
        public final int a(int n10, int n12, boolean bl2) {
            if (n12 == 1) {
                return n10;
            }
            if (n10 == this.b(bl2)) {
                n10 = n12 == 2 ? this.a(bl2) : -1;
                return n10;
            }
            n10 = bl2 ? this.e[this.f[n10] + 1] : ++n10;
            return n10;
        }

        @Override
        public final int a(Object object) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final int a(boolean bl2) {
            if (this.c()) {
                return -1;
            }
            int n10 = 0;
            if (bl2) {
                n10 = this.e[0];
            }
            return n10;
        }

        @Override
        public final b a(int n10, b b10, boolean bl2) {
            b b11 = (b)this.d.get(n10);
            b10.a(b11.b, b11.c, b11.d, b11.e, b11.f, b11.h, b11.g);
            return b10;
        }

        @Override
        public final d a(int n10, d d10, long l10) {
            d d14 = (d)this.c.get(n10);
            d10.a(d14.b, d14.d, d14.e, d14.f, d14.g, d14.h, d14.i, d14.j, d14.l, d14.n, d14.o, d14.p, d14.q, d14.r);
            d10.m = d14.m;
            return d10;
        }

        @Override
        public final Object a(int n10) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final int b() {
            return ((AbstractCollection)((Object)this.c)).size();
        }

        @Override
        public final int b(int n10, int n12, boolean bl2) {
            if (n12 == 1) {
                return n10;
            }
            if (n10 == this.a(bl2)) {
                n10 = n12 == 2 ? this.b(bl2) : -1;
                return n10;
            }
            n10 = bl2 ? this.e[this.f[n10] - 1] : --n10;
            return n10;
        }

        @Override
        public final int b(boolean bl2) {
            if (this.c()) {
                return -1;
            }
            int n10 = bl2 ? this.e[((AbstractCollection)((Object)this.c)).size() - 1] : ((AbstractCollection)((Object)this.c)).size() - 1;
            return n10;
        }
    }

    public static final class d
    implements vl {
        public static final Object s = new Object();
        private static final Object t = new Object();
        private static final ew0 u = new /* Unavailable Anonymous Inner Class!! */.b("com.monetization.ads.exoplayer2.Timeline").a(Uri.EMPTY).a();
        public static final vl.a<d> v = new py2();
        public Object b = s;
        @Deprecated
        @Nullable
        public Object c;
        public ew0 d = u;
        @Nullable
        public Object e;
        public long f;
        public long g;
        public long h;
        public boolean i;
        public boolean j;
        @Deprecated
        public boolean k;
        @Nullable
        public ew0.e l;
        public boolean m;
        public long n;
        public long o;
        public int p;
        public int q;
        public long r;

        private static d a(Bundle object) {
            Object object2 = object.getBundle(Integer.toString(1, 36));
            ew0.e e11 = null;
            object2 = object2 != null ? (ew0)ew0.h.fromBundle(object2) : null;
            long l10 = object.getLong(Integer.toString(2, 36), -9223372036854775807L);
            long l11 = object.getLong(Integer.toString(3, 36), -9223372036854775807L);
            long l13 = object.getLong(Integer.toString(4, 36), -9223372036854775807L);
            boolean bl2 = object.getBoolean(Integer.toString(5, 36), false);
            boolean bl3 = object.getBoolean(Integer.toString(6, 36), false);
            Bundle bundle = object.getBundle(Integer.toString(7, 36));
            if (bundle != null) {
                e11 = (ew0.e)ew0.e.h.fromBundle(bundle);
            }
            boolean bl4 = object.getBoolean(Integer.toString(8, 36), false);
            long l14 = object.getLong(Integer.toString(9, 36), 0L);
            long l15 = object.getLong(Integer.toString(10, 36), -9223372036854775807L);
            int n10 = object.getInt(Integer.toString(11, 36), 0);
            int n12 = object.getInt(Integer.toString(12, 36), 0);
            long l16 = object.getLong(Integer.toString(13, 36), 0L);
            object = new d();
            ((d)object).a(t, (ew0)object2, null, l10, l11, l13, bl2, bl3, e11, l14, l15, n10, n12, l16);
            ((d)object).m = bl4;
            return object;
        }

        public static /* synthetic */ d b(Bundle bundle) {
            return com.yandex.mobile.ads.impl.l52$d.a(bundle);
        }

        public final d a(Object object, @Nullable ew0 ew02, @Nullable Object object2, long l10, long l11, long l13, boolean bl2, boolean bl3, @Nullable ew0.e e11, long l14, long l15, int n10, int n12, long l16) {
            this.b = object;
            object = ew02 != null ? ew02 : u;
            this.d = object;
            object = ew02 != null && (object = ew02.c) != null ? object.g : null;
            this.c = object;
            this.e = object2;
            this.f = l10;
            this.g = l11;
            this.h = l13;
            this.i = bl2;
            this.j = bl3;
            bl2 = e11 != null;
            this.k = bl2;
            this.l = e11;
            this.n = l14;
            this.o = l15;
            this.p = n10;
            this.q = n12;
            this.r = l16;
            this.m = false;
            return this;
        }

        public final boolean a() {
            boolean bl2 = this.k;
            ew0.e e11 = this.l;
            boolean bl3 = false;
            boolean bl4 = e11 != null;
            if (bl2 == bl4) {
                bl4 = bl3;
                if (e11 != null) {
                    bl4 = true;
                }
                return bl4;
            }
            throw new IllegalStateException();
        }

        public final boolean equals(@Nullable Object object) {
            boolean bl2 = true;
            if (this == object) {
                return true;
            }
            if (object != null && d.class.equals(object.getClass())) {
                object = (d)object;
                if (!(m92.a((Object)this.b, (Object)((d)object).b) && m92.a((Object)this.d, (Object)((d)object).d) && m92.a((Object)this.e, (Object)((d)object).e) && m92.a((Object)this.l, (Object)((d)object).l) && this.f == ((d)object).f && this.g == ((d)object).g && this.h == ((d)object).h && this.i == ((d)object).i && this.j == ((d)object).j && this.m == ((d)object).m && this.n == ((d)object).n && this.o == ((d)object).o && this.p == ((d)object).p && this.q == ((d)object).q && this.r == ((d)object).r)) {
                    bl2 = false;
                }
                return bl2;
            }
            return false;
        }

        public final int hashCode() {
            int n10 = this.b.hashCode();
            int n12 = this.d.hashCode();
            Object object = this.e;
            int n13 = 0;
            int n14 = object == null ? 0 : object.hashCode();
            object = this.l;
            if (object != null) {
                n13 = ((ew0.e)object).hashCode();
            }
            long l10 = this.f;
            int n15 = (int)(l10 ^ l10 >>> 32);
            l10 = this.g;
            int n16 = (int)(l10 ^ l10 >>> 32);
            l10 = this.h;
            int n17 = (int)(l10 ^ l10 >>> 32);
            int n18 = this.i;
            int n19 = this.j;
            int n23 = this.m;
            l10 = this.n;
            int n24 = (int)(l10 ^ l10 >>> 32);
            l10 = this.o;
            int n25 = (int)(l10 ^ l10 >>> 32);
            int n26 = this.p;
            int n27 = this.q;
            l10 = this.r;
            return (((((((((((((n12 + (n10 + 217) * 31) * 31 + n14) * 31 + n13) * 31 + n15) * 31 + n16) * 31 + n17) * 31 + n18) * 31 + n19) * 31 + n23) * 31 + n24) * 31 + n25) * 31 + n26) * 31 + n27) * 31 + (int)(l10 ^ l10 >>> 32);
        }
    }
}

