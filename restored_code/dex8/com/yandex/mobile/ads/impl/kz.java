/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.ResourceBusyException
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.SystemClock
 *  androidx.annotation.Nullable
 *  androidx.annotation.RequiresApi
 *  com.yandex.mobile.ads.impl.a40$a
 *  com.yandex.mobile.ads.impl.b40
 *  com.yandex.mobile.ads.impl.b40$b
 *  com.yandex.mobile.ads.impl.cm
 *  com.yandex.mobile.ads.impl.f60
 *  com.yandex.mobile.ads.impl.f60$b
 *  com.yandex.mobile.ads.impl.f60$c
 *  com.yandex.mobile.ads.impl.gy2
 *  com.yandex.mobile.ads.impl.iy2
 *  com.yandex.mobile.ads.impl.jy2
 *  com.yandex.mobile.ads.impl.jz$a
 *  com.yandex.mobile.ads.impl.jz$b
 *  com.yandex.mobile.ads.impl.ky2
 *  com.yandex.mobile.ads.impl.kz$c
 *  com.yandex.mobile.ads.impl.ly2
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.mi1
 *  com.yandex.mobile.ads.impl.my2
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.vv0
 *  com.yandex.mobile.ads.impl.w01
 *  com.yandex.mobile.ads.impl.y30
 *  com.yandex.mobile.ads.impl.y30$b
 *  com.yandex.mobile.ads.impl.yr0
 *  com.yandex.mobile.ads.impl.yx1
 *  com.yandex.mobile.ads.impl.z30
 *  com.yandex.mobile.ads.impl.z30$a
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.impl.a40;
import com.yandex.mobile.ads.impl.b40;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.cm;
import com.yandex.mobile.ads.impl.f60;
import com.yandex.mobile.ads.impl.gy2;
import com.yandex.mobile.ads.impl.iy2;
import com.yandex.mobile.ads.impl.jh0;
import com.yandex.mobile.ads.impl.jy2;
import com.yandex.mobile.ads.impl.jz;
import com.yandex.mobile.ads.impl.kc0;
import com.yandex.mobile.ads.impl.ky2;
import com.yandex.mobile.ads.impl.kz;
import com.yandex.mobile.ads.impl.ly2;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.mi1;
import com.yandex.mobile.ads.impl.my2;
import com.yandex.mobile.ads.impl.o50;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.vv0;
import com.yandex.mobile.ads.impl.vz;
import com.yandex.mobile.ads.impl.w01;
import com.yandex.mobile.ads.impl.xj0;
import com.yandex.mobile.ads.impl.y30;
import com.yandex.mobile.ads.impl.yr0;
import com.yandex.mobile.ads.impl.yx1;
import com.yandex.mobile.ads.impl.z30;
import com.yandex.mobile.ads.impl.zj0;
import com.yandex.mobile.ads.impl.zs0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@RequiresApi(value=18)
public final class kz
implements b40 {
    private final UUID b;
    private final f60.c c;
    private final vv0 d;
    private final HashMap<String, String> e;
    private final boolean f;
    private final int[] g;
    private final boolean h;
    private final f i;
    private final yr0 j;
    private final g k;
    private final long l;
    private final ArrayList m;
    private final Set<e> n;
    private final Set<jz> o;
    private int p;
    @Nullable
    private f60 q;
    @Nullable
    private jz r;
    @Nullable
    private jz s;
    private Looper t;
    private Handler u;
    private int v;
    @Nullable
    private byte[] w;
    private mi1 x;
    @Nullable
    volatile c y;

    private kz(UUID uUID, f60.c c11, jh0 jh02, HashMap hashMap, boolean bl2, int[] nArray, boolean bl3, vz vz2, long l10) {
        uf.a((Object)uUID);
        uf.a((String)"Use C.CLEARKEY_UUID instead", (boolean)(cm.b.equals(uUID) ^ true));
        this.b = uUID;
        this.c = c11;
        this.d = jh02;
        this.e = hashMap;
        this.f = bl2;
        this.g = nArray;
        this.h = bl3;
        this.j = vz2;
        this.i = new f();
        this.k = new g(this, null);
        this.v = 0;
        this.m = new ArrayList();
        this.n = yx1.a();
        this.o = yx1.a();
        this.l = l10;
    }

    /* synthetic */ kz(UUID uUID, f60.c c11, jh0 jh02, HashMap hashMap, boolean bl2, int[] nArray, boolean bl3, vz vz2, long l10, my2 my22) {
        this(uUID, c11, jh02, hashMap, bl2, nArray, bl3, vz2, l10);
    }

    private jz a(@Nullable List<y30.b> object, boolean bl2, @Nullable a40.a a13) {
        this.q.getClass();
        boolean bl3 = this.h;
        UUID uUID = this.b;
        f60 f602 = this.q;
        f f11 = this.i;
        g g11 = this.k;
        int n10 = this.v;
        byte[] byArray = this.w;
        HashMap<String, String> hashMap = this.e;
        vv0 vv02 = this.d;
        Looper looper = this.t;
        looper.getClass();
        yr0 yr02 = this.j;
        mi1 mi12 = this.x;
        mi12.getClass();
        object = new jz(uUID, f602, f11, g11, (List<y30.b>)object, n10, bl3 | bl2, bl2, byArray, hashMap, vv02, looper, yr02, mi12);
        ((jz)object).b(a13);
        if (this.l != -9223372036854775807L) {
            ((jz)object).b(null);
        }
        return object;
    }

    private jz a(@Nullable List<y30.b> list, boolean bl2, @Nullable a40.a a13, boolean bl3) {
        jz jz3;
        block17: {
            jz jz4;
            block18: {
                z30.a a14;
                block15: {
                    block16: {
                        jz4 = jz3 = this.a(list, bl2, a13);
                        if (jz3.getState() != 1) break block15;
                        if (m92.a < 19) break block16;
                        a14 = jz3.getError();
                        a14.getClass();
                        jz4 = jz3;
                        if (!(a14.getCause() instanceof ResourceBusyException)) break block15;
                    }
                    jz4 = jz3;
                    if (!this.o.isEmpty()) {
                        jz4 = zj0.a(this.o).iterator();
                        while (jz4.hasNext()) {
                            ((z30)jz4.next()).a(null);
                        }
                        jz3.a(a13);
                        if (this.l != -9223372036854775807L) {
                            jz3.a((a40.a)null);
                        }
                        jz4 = this.a(list, bl2, a13);
                    }
                }
                jz3 = jz4;
                if (jz4.getState() != 1) break block17;
                if (m92.a < 19) break block18;
                a14 = jz4.getError();
                a14.getClass();
                jz3 = jz4;
                if (!(a14.getCause() instanceof ResourceBusyException)) break block17;
            }
            jz3 = jz4;
            if (bl3) {
                jz3 = jz4;
                if (!this.n.isEmpty()) {
                    jz3 = zj0.a(this.n).iterator();
                    while (jz3.hasNext()) {
                        ((e)jz3.next()).release();
                    }
                    if (!this.o.isEmpty()) {
                        jz3 = zj0.a(this.o).iterator();
                        while (jz3.hasNext()) {
                            ((z30)jz3.next()).a(null);
                        }
                    }
                    jz4.a(a13);
                    if (this.l != -9223372036854775807L) {
                        jz4.a((a40.a)null);
                    }
                    jz3 = this.a(list, bl2, a13);
                }
            }
        }
        return jz3;
    }

    @Nullable
    private z30 a(Looper object, @Nullable a40.a a13, cc0 object2, boolean bl2) {
        if (this.y == null) {
            this.y = new /* Unavailable Anonymous Inner Class!! */;
        }
        object = ((cc0)object2).p;
        int n10 = 0;
        Object var7_6 = null;
        Iterator iterator = null;
        if (object == null) {
            int n13 = w01.c((String)((cc0)object2).m);
            a13 = this.q;
            a13.getClass();
            if (a13.b() == 2 && kc0.d) {
                object = iterator;
            } else {
                object2 = this.g;
                while (true) {
                    object = iterator;
                    if (n10 >= ((Object)object2).length) break;
                    if (object2[n10] == n13) {
                        object = iterator;
                        if (n10 == -1) break;
                        if (a13.b() == 1) {
                            object = iterator;
                            break;
                        }
                        object = this.r;
                        if (object == null) {
                            object = this.a(xj0.<y30.b>h(), true, null, bl2);
                            this.m.add(object);
                            this.r = object;
                        } else {
                            ((jz)object).b(null);
                        }
                        object = this.r;
                        break;
                    }
                    ++n10;
                }
            }
            return object;
        }
        if (this.w == null) {
            object2 = object = kz.a((y30)object, this.b, false);
            if (((ArrayList)object).isEmpty()) {
                object = new /* Unavailable Anonymous Inner Class!! */;
                zs0.a((String)"DefaultDrmSessionMgr", (String)"DRM error", (Throwable)object);
                if (a13 != null) {
                    a13.a((Exception)object);
                }
                return new o50(new z30.a((Throwable)object, 6003));
            }
        } else {
            object2 = null;
        }
        if (!this.f) {
            object = this.s;
        } else {
            iterator = this.m.iterator();
            do {
                object = var7_6;
                if (!iterator.hasNext()) break;
                object = (jz)iterator.next();
            } while (!m92.a(((jz)object).a, (Object)object2));
        }
        if (object == null) {
            object = this.a((List<y30.b>)object2, false, a13, bl2);
            if (!this.f) {
                this.s = object;
            }
            this.m.add(object);
        } else {
            ((jz)object).b(a13);
        }
        return object;
    }

    private static ArrayList a(y30 y302, UUID uUID, boolean bl2) {
        ArrayList<y30.b> arrayList = new ArrayList<y30.b>(y302.e);
        for (int i14 = 0; i14 < y302.e; ++i14) {
            y30.b b10 = y302.a(i14);
            b10.getClass();
            UUID uUID2 = cm.a;
            if (!uUID2.equals(b10.c) && !uUID.equals(b10.c)) {
                if (!cm.c.equals(uUID)) continue;
                UUID uUID3 = cm.b;
                if (!uUID2.equals(b10.c) && !uUID3.equals(b10.c)) continue;
            }
            if (b10.f == null && !bl2) continue;
            arrayList.add(b10);
        }
        return arrayList;
    }

    public final int a(cc0 object) {
        int n10;
        block7: {
            block9: {
                int n13;
                block11: {
                    block10: {
                        f60 f602;
                        block8: {
                            block6: {
                                f602 = this.q;
                                f602.getClass();
                                n13 = f602.b();
                                f602 = ((cc0)object).p;
                                if (f602 == null) {
                                    block5: {
                                        int n14 = w01.c((String)((cc0)object).m);
                                        object = this.g;
                                        for (int i14 = 0; i14 < ((Object)object).length; ++i14) {
                                            if (object[i14] != n14) continue;
                                            if (i14 == -1) break;
                                            break block5;
                                        }
                                        n13 = 0;
                                    }
                                    return n13;
                                }
                                if (this.w == null) break block6;
                                n10 = n13;
                                break block7;
                            }
                            if (!kz.a((y30)f602, this.b, true).isEmpty()) break block8;
                            if (f602.e != 1) break block9;
                            object = f602.a(0);
                            UUID uUID = cm.b;
                            object.getClass();
                            if (!cm.a.equals(((y30.b)object).c) && !uUID.equals(((y30.b)object).c)) break block9;
                            object = new StringBuilder("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
                            ((StringBuilder)object).append(this.b);
                            zs0.d((String)"DefaultDrmSessionMgr", (String)((StringBuilder)object).toString());
                        }
                        object = f602.d;
                        n10 = n13;
                        if (object == null) break block7;
                        if (!"cenc".equals(object)) break block10;
                        n10 = n13;
                        break block7;
                    }
                    if (!"cbcs".equals(object)) break block11;
                    if (m92.a < 25) break block9;
                    n10 = n13;
                    break block7;
                }
                if ("cbc1".equals(object)) break block9;
                n10 = n13;
                if (!"cens".equals(object)) break block7;
            }
            n10 = 1;
        }
        return n10;
    }

    public final b40.b a(@Nullable a40.a object, cc0 cc02) {
        if (this.p > 0) {
            if (this.t != null) {
                object = new e(this, (a40.a)object);
                ((e)object).a(cc02);
                return object;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Looper object, mi1 mi12) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                try {
                    Looper looper = this.t;
                    if (looper == null) {
                        this.t = object;
                        looper = new Handler(object);
                        this.u = looper;
                    } else {
                        if (looper != object) break block7;
                        this.u.getClass();
                    }
                    // MONITOREXIT @DISABLED, blocks:[0, 3] lbl12 : MonitorExitStatement: MONITOREXIT : this
                    this.x = mi12;
                    return;
                }
                catch (Throwable throwable2) {}
            }
            object = new IllegalStateException();
            throw object;
            throw throwable2;
        }
    }

    public final void a(@Nullable byte[] byArray) {
        if (this.m.isEmpty()) {
            this.v = 0;
            this.w = byArray;
            return;
        }
        throw new IllegalStateException();
    }

    @Nullable
    public final z30 b(@Nullable a40.a a13, cc0 cc02) {
        if (this.p > 0) {
            Looper looper = this.t;
            if (looper != null) {
                return this.a(looper, a13, cc02, true);
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    public final void prepare() {
        int n10 = this.p;
        this.p = n10 + 1;
        if (n10 != 0) {
            return;
        }
        if (this.q == null) {
            f60 f602;
            this.q = f602 = this.c.a(this.b);
            f602.a((f60.b)new b(this, null));
        } else if (this.l != -9223372036854775807L) {
            for (n10 = 0; n10 < this.m.size(); ++n10) {
                ((jz)this.m.get(n10)).b(null);
            }
        }
    }

    public final void release() {
        Object object;
        int n10;
        this.p = n10 = this.p - 1;
        if (n10 != 0) {
            return;
        }
        if (this.l != -9223372036854775807L) {
            object = new ArrayList(this.m);
            for (n10 = 0; n10 < ((ArrayList)object).size(); ++n10) {
                ((jz)((ArrayList)object).get(n10)).a((a40.a)null);
            }
        }
        object = zj0.a(this.n).iterator();
        while (object.hasNext()) {
            ((e)object.next()).release();
        }
        if (this.q != null && this.p == 0 && this.m.isEmpty() && this.n.isEmpty()) {
            object = this.q;
            object.getClass();
            object.release();
            this.q = null;
        }
    }

    private final class b
    implements f60.b {
        final kz a;

        private b(kz kz3) {
            this.a = kz3;
        }

        /* synthetic */ b(kz kz3, gy2 gy22) {
            this(kz3);
        }
    }

    private final class e
    implements b40.b {
        @Nullable
        private final a40.a b;
        @Nullable
        private z30 c;
        private boolean d;
        final kz e;

        public e(kz kz3, @Nullable a40.a a13) {
            this.e = kz3;
            this.b = a13;
        }

        private /* synthetic */ void a() {
            if (this.d) {
                return;
            }
            z30 z302 = this.c;
            if (z302 != null) {
                z302.a(this.b);
            }
            this.e.n.remove(this);
            this.d = true;
        }

        public static /* synthetic */ void a(e e11) {
            e11.a();
        }

        private void b(cc0 cc02) {
            kz kz3 = this.e;
            if (kz3.p != 0 && !this.d) {
                Looper looper = kz3.t;
                looper.getClass();
                this.c = kz3.a(looper, this.b, cc02, false);
                this.e.n.add(this);
            }
        }

        public static /* synthetic */ void b(e e11, cc0 cc02) {
            e11.b(cc02);
        }

        public final void a(cc0 cc02) {
            Handler handler = this.e.u;
            handler.getClass();
            handler.post((Runnable)new iy2(this, cc02));
        }

        public final void release() {
            Handler handler = this.e.u;
            handler.getClass();
            m92.a((Handler)handler, (Runnable)new jy2(this));
        }
    }

    private final class f
    implements jz.a {
        private final HashSet a = new HashSet();
        @Nullable
        private jz b;

        public final void a() {
            this.b = null;
            Object object = xj0.a(this.a);
            this.a.clear();
            object = ((xj0)object).a(0);
            while (object.hasNext()) {
                ((jz)object.next()).b();
            }
        }

        public final void a(jz jz3) {
            this.a.add(jz3);
            if (this.b != null) {
                return;
            }
            this.b = jz3;
            jz3.d();
        }

        public final void a(Exception exception, boolean bl2) {
            this.b = null;
            Object object = xj0.a(this.a);
            this.a.clear();
            object = ((xj0)object).a(0);
            while (object.hasNext()) {
                ((jz)object.next()).a(exception, bl2);
            }
        }
    }

    private final class g
    implements jz.b {
        final kz a;

        private g(kz kz3) {
            this.a = kz3;
        }

        /* synthetic */ g(kz kz3, ly2 ly22) {
            this(kz3);
        }

        public static /* synthetic */ void c(jz jz3) {
            jz3.a((a40.a)null);
        }

        public final void a(jz object, int n10) {
            Object object2;
            if (n10 == 1 && ((kz)(object2 = this.a)).p > 0 && ((kz)object2).l != -9223372036854775807L) {
                ((kz)object2).o.add(object);
                object2 = this.a.u;
                object2.getClass();
                object2.postAtTime((Runnable)new ky2((jz)object), object, SystemClock.uptimeMillis() + this.a.l);
            } else if (n10 == 0) {
                this.a.m.remove(object);
                object2 = this.a;
                if (((kz)object2).r == object) {
                    ((kz)object2).r = null;
                }
                if (((kz)object2).s == object) {
                    ((kz)object2).s = null;
                }
                object2 = ((kz)object2).i;
                ((f)object2).a.remove(object);
                if (((f)object2).b == object) {
                    ((f)object2).b = null;
                    if (!((f)object2).a.isEmpty()) {
                        jz jz3 = (jz)((f)object2).a.iterator().next();
                        ((f)object2).b = jz3;
                        jz3.d();
                    }
                }
                if (((kz)(object2 = this.a)).l != -9223372036854775807L) {
                    object2 = ((kz)object2).u;
                    object2.getClass();
                    object2.removeCallbacksAndMessages(object);
                    this.a.o.remove(object);
                }
            }
            object = this.a;
            if (((kz)object).q != null && ((kz)object).p == 0 && ((kz)object).m.isEmpty() && ((kz)object).n.isEmpty()) {
                object2 = ((kz)object).q;
                object2.getClass();
                object2.release();
                ((kz)object).q = null;
            }
        }

        public final void b(jz jz3) {
            kz kz3 = this.a;
            if (kz3.l != -9223372036854775807L) {
                kz3.o.remove(jz3);
                kz3 = this.a.u;
                kz3.getClass();
                kz3.removeCallbacksAndMessages(jz3);
            }
        }
    }
}

