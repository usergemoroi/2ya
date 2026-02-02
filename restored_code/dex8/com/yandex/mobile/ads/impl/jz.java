/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.NotProvisionedException
 *  android.os.HandlerThread
 *  android.os.Looper
 *  androidx.annotation.Nullable
 *  androidx.annotation.RequiresApi
 *  com.yandex.mobile.ads.impl.a40$a
 *  com.yandex.mobile.ads.impl.cm
 *  com.yandex.mobile.ads.impl.d40
 *  com.yandex.mobile.ads.impl.e40
 *  com.yandex.mobile.ads.impl.f40
 *  com.yandex.mobile.ads.impl.f60
 *  com.yandex.mobile.ads.impl.f60$a
 *  com.yandex.mobile.ads.impl.f60$d
 *  com.yandex.mobile.ads.impl.fs
 *  com.yandex.mobile.ads.impl.jz$a
 *  com.yandex.mobile.ads.impl.jz$b
 *  com.yandex.mobile.ads.impl.jz$c
 *  com.yandex.mobile.ads.impl.jz$d
 *  com.yandex.mobile.ads.impl.jz$e
 *  com.yandex.mobile.ads.impl.kz$d
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.mi1
 *  com.yandex.mobile.ads.impl.mr
 *  com.yandex.mobile.ads.impl.s82
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.uk2
 *  com.yandex.mobile.ads.impl.uu
 *  com.yandex.mobile.ads.impl.vq0
 *  com.yandex.mobile.ads.impl.vv0
 *  com.yandex.mobile.ads.impl.y30$b
 *  com.yandex.mobile.ads.impl.yr0
 *  com.yandex.mobile.ads.impl.z30
 *  com.yandex.mobile.ads.impl.z30$a
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import android.media.NotProvisionedException;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.impl.a40;
import com.yandex.mobile.ads.impl.cm;
import com.yandex.mobile.ads.impl.d40;
import com.yandex.mobile.ads.impl.e40;
import com.yandex.mobile.ads.impl.f40;
import com.yandex.mobile.ads.impl.f60;
import com.yandex.mobile.ads.impl.fs;
import com.yandex.mobile.ads.impl.jz;
import com.yandex.mobile.ads.impl.kz;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.mi1;
import com.yandex.mobile.ads.impl.mr;
import com.yandex.mobile.ads.impl.qw2;
import com.yandex.mobile.ads.impl.rw2;
import com.yandex.mobile.ads.impl.s82;
import com.yandex.mobile.ads.impl.sw2;
import com.yandex.mobile.ads.impl.tw2;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.uk2;
import com.yandex.mobile.ads.impl.uu;
import com.yandex.mobile.ads.impl.uw2;
import com.yandex.mobile.ads.impl.vq0;
import com.yandex.mobile.ads.impl.vv0;
import com.yandex.mobile.ads.impl.y30;
import com.yandex.mobile.ads.impl.yr0;
import com.yandex.mobile.ads.impl.z30;
import com.yandex.mobile.ads.impl.zs0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/*
 * Exception performing whole class analysis ignored.
 */
@RequiresApi(value=18)
final class jz
implements z30 {
    @Nullable
    public final List<y30.b> a;
    private final f60 b;
    private final a c;
    private final b d;
    private final int e;
    private final boolean f;
    private final boolean g;
    private final HashMap<String, String> h;
    private final fs<a40.a> i;
    private final yr0 j;
    private final mi1 k;
    final vv0 l;
    final UUID m;
    final e n;
    private int o;
    private int p;
    @Nullable
    private HandlerThread q;
    @Nullable
    private c r;
    @Nullable
    private uu s;
    @Nullable
    private z30.a t;
    @Nullable
    private byte[] u;
    private byte[] v;
    @Nullable
    private f60.a w;
    @Nullable
    private f60.d x;

    public jz(UUID uUID, f60 f602, a a13, b b10, @Nullable List<y30.b> list, int n10, boolean bl2, boolean bl3, @Nullable byte[] byArray, HashMap<String, String> hashMap, vv0 vv02, Looper looper, yr0 yr02, mi1 mi12) {
        if (n10 == 1 || n10 == 3) {
            uf.a((Object)byArray);
        }
        this.m = uUID;
        this.c = a13;
        this.d = b10;
        this.b = f602;
        this.e = n10;
        this.f = bl2;
        this.g = bl3;
        if (byArray != null) {
            this.v = byArray;
            this.a = null;
        } else {
            this.a = Collections.unmodifiableList((List)uf.a(list));
        }
        this.h = hashMap;
        this.l = vv02;
        this.i = new fs();
        this.j = yr02;
        this.k = mi12;
        this.o = 2;
        this.n = new /* Unavailable Anonymous Inner Class!! */;
    }

    private void a(int n10, Exception exception) {
        block14: {
            block5: {
                block7: {
                    block13: {
                        block12: {
                            block6: {
                                block11: {
                                    block10: {
                                        block9: {
                                            block8: {
                                                int n13;
                                                block4: {
                                                    n13 = m92.a;
                                                    if (n13 < 21 || !e40.a((Throwable)exception)) break block4;
                                                    n10 = e40.b((Throwable)exception);
                                                    break block5;
                                                }
                                                if (n13 >= 23 && f40.a((Throwable)exception)) break block6;
                                                if (n13 >= 18 && d40.b((Throwable)exception)) break block7;
                                                if (n13 < 18 || !d40.a((Throwable)exception)) break block8;
                                                n10 = 6007;
                                                break block5;
                                            }
                                            if (!(exception instanceof s82)) break block9;
                                            n10 = 6001;
                                            break block5;
                                        }
                                        if (!(exception instanceof kz.d)) break block10;
                                        n10 = 6003;
                                        break block5;
                                    }
                                    if (!(exception instanceof vq0)) break block11;
                                    n10 = 6008;
                                    break block5;
                                }
                                if (n10 != 1) break block12;
                            }
                            n10 = 6006;
                            break block5;
                        }
                        if (n10 != 2) break block13;
                        n10 = 6004;
                        break block5;
                    }
                    if (n10 != 3) break block14;
                }
                n10 = 6002;
            }
            this.t = new z30.a((Throwable)exception, n10);
            zs0.a((String)"DefaultDrmSession", (String)"DRM session error", (Throwable)exception);
            this.a(new rw2(exception));
            if (this.o != 4) {
                this.o = 1;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    private void a(mr<a40.a> mr3) {
        Iterator iterator = this.i.a().iterator();
        while (iterator.hasNext()) {
            mr3.accept((Object)((a40.a)iterator.next()));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(Object object, Object object2) {
        Exception exception2;
        block8: {
            if (object != this.w) return;
            if (!this.a()) {
                return;
            }
            this.w = null;
            if (object2 instanceof Exception) {
                object = (Exception)object2;
                if (object instanceof NotProvisionedException) {
                    ((kz.f)this.c).a(this);
                    return;
                }
                this.a(2, (Exception)object);
                return;
            }
            try {
                object = (byte[])object2;
                if (this.e == 3) {
                    f60 f602 = this.b;
                    object2 = this.v;
                    int n10 = m92.a;
                    f602.b((byte[])object2, (byte[])object);
                    object = new tw2();
                    this.a((mr<a40.a>)object);
                    return;
                }
            }
            catch (Exception exception2) {
                break block8;
            }
            object = this.b.b(this.u, (byte[])object);
            int n13 = this.e;
            if ((n13 == 2 || n13 == 0 && this.v != null) && object != null && ((Object)object).length != 0) {
                this.v = (byte[])object;
            }
            this.o = 4;
            object = new uw2();
            this.a((mr<a40.a>)object);
            return;
        }
        if (exception2 instanceof NotProvisionedException) {
            ((kz.f)this.c).a(this);
            return;
        }
        this.a(1, exception2);
    }

    @RequiresNonNull(value={"sessionId"})
    private void a(boolean bl2) {
        block20: {
            if (this.g) {
                return;
            }
            byte[] byArray = this.u;
            int n10 = m92.a;
            n10 = this.e;
            if (n10 != 0 && n10 != 1) {
                if (n10 != 2) {
                    if (n10 == 3) {
                        this.v.getClass();
                        this.u.getClass();
                        this.a(this.v, 3, bl2);
                    }
                } else {
                    byte[] byArray2 = this.v;
                    if (byArray2 != null) {
                        try {
                            this.b.a(byArray, byArray2);
                        }
                        catch (Exception exception) {
                            this.a(1, exception);
                            break block20;
                        }
                    }
                    this.a(byArray, 2, bl2);
                }
            } else {
                Object object = this.v;
                if (object == null) {
                    this.a(byArray, 1, bl2);
                } else {
                    long l10;
                    if (this.o != 4) {
                        try {
                            this.b.a(byArray, object);
                        }
                        catch (Exception exception) {
                            this.a(1, exception);
                            break block20;
                        }
                    }
                    if (!cm.d.equals(this.m)) {
                        l10 = Long.MAX_VALUE;
                    } else {
                        object = uk2.a((z30)this);
                        object.getClass();
                        l10 = Math.min((Long)object.first, (Long)object.second);
                    }
                    if (this.e == 0 && l10 <= 60L) {
                        object = new StringBuilder("Offline license has expired or will expire soon. Remaining seconds: ");
                        object.append(l10);
                        zs0.a((String)"DefaultDrmSession", (String)object.toString());
                        this.a(byArray, 2, bl2);
                    } else if (l10 <= 0L) {
                        this.a(2, (Exception)new vq0());
                    } else {
                        this.o = 4;
                        this.a(new sw2());
                    }
                }
            }
        }
    }

    private void a(byte[] object, int n10, boolean bl2) {
        try {
            object = this.b.a((byte[])object, this.a, n10, this.h);
            this.w = (f60.a)object;
            c c11 = this.r;
            n10 = m92.a;
            object.getClass();
            c11.getClass();
            d d14 = new /* Unavailable Anonymous Inner Class!! */;
            c11.obtainMessage(1, (Object)d14).sendToTarget();
        }
        catch (Exception exception) {
            if (exception instanceof NotProvisionedException) {
                ((kz.f)this.c).a(this);
            }
            this.a(1, exception);
        }
    }

    @EnsuresNonNullIf(expression={"sessionId"}, result=true)
    private boolean a() {
        int n10 = this.o;
        boolean bl2 = n10 == 3 || n10 == 4;
        return bl2;
    }

    public static /* synthetic */ void b(int n10, a40.a a13) {
        a13.a(n10);
    }

    public static /* synthetic */ void c(Exception exception, a40.a a13) {
        a13.a(exception);
    }

    @EnsuresNonNullIf(expression={"sessionId"}, result=true)
    private boolean c() {
        if (this.a()) {
            return true;
        }
        try {
            Object object = this.b.c();
            this.u = object;
            this.b.a(object, this.k);
            this.s = this.b.d(this.u);
            this.o = 3;
            object = new qw2;
            object(3);
            this.a((mr<a40.a>)object);
            this.u.getClass();
            return true;
        }
        catch (Exception exception) {
            this.a(1, exception);
        }
        catch (NotProvisionedException notProvisionedException) {
            ((kz.f)this.c).a(this);
        }
        return false;
    }

    static /* bridge */ /* synthetic */ f60 d(jz jz3) {
        return jz3.b;
    }

    static /* bridge */ /* synthetic */ a e(jz jz3) {
        return jz3.c;
    }

    static /* bridge */ /* synthetic */ yr0 f(jz jz3) {
        return jz3.j;
    }

    static /* bridge */ /* synthetic */ int g(jz jz3) {
        return jz3.o;
    }

    static /* bridge */ /* synthetic */ f60.d h(jz jz3) {
        return jz3.x;
    }

    static /* bridge */ /* synthetic */ void i(jz jz3, f60.d d14) {
        jz3.x = d14;
    }

    static /* bridge */ /* synthetic */ void j(jz jz3, Object object, Object object2) {
        jz3.a(object, object2);
    }

    static /* bridge */ /* synthetic */ boolean k(jz jz3) {
        return jz3.a();
    }

    public final void a(int n10) {
        if (n10 == 2 && this.e == 0 && this.o == 4) {
            n10 = m92.a;
            this.a(false);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@Nullable a40.a a13) {
        int n10 = this.p;
        if (n10 <= 0) {
            zs0.b((String)"DefaultDrmSession", (String)"release() called on a session that's already fully released.");
            return;
        }
        this.p = --n10;
        if (n10 == 0) {
            this.o = 0;
            Object object = this.n;
            n10 = m92.a;
            object.removeCallbacksAndMessages(null);
            object = this.r;
            synchronized (object) {
                object.removeCallbacksAndMessages(null);
                com.yandex.mobile.ads.impl.jz$c.a(object, (boolean)true);
            }
            this.r = null;
            this.q.quit();
            this.q = null;
            this.s = null;
            this.t = null;
            this.w = null;
            this.x = null;
            object = this.u;
            if (object != null) {
                this.b.b((byte[])object);
                this.u = null;
            }
        }
        if (a13 != null) {
            this.i.c((Object)a13);
            if (this.i.b((Object)a13) == 0) {
                a13.d();
            }
        }
        a13 = this.d;
        n10 = this.p;
        ((kz.g)a13).a(this, n10);
    }

    public final void a(Exception exception, boolean bl2) {
        int n10 = bl2 ? 1 : 3;
        this.a(n10, exception);
    }

    public final boolean a(byte[] byArray) {
        return Arrays.equals(this.u, byArray);
    }

    public final void b() {
        if (this.c()) {
            this.a(true);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void b(@Nullable a40.a a13) {
        int n10;
        if (this.p < 0) {
            StringBuilder stringBuilder = new StringBuilder("Session reference count less than zero: ");
            stringBuilder.append(this.p);
            zs0.b((String)"DefaultDrmSession", (String)stringBuilder.toString());
            this.p = 0;
        }
        if (a13 != null) {
            this.i.a((Object)a13);
        }
        this.p = n10 = this.p + 1;
        if (n10 == 1) {
            if (this.o != 2) throw new IllegalStateException();
            a13 = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.q = a13;
            a13.start();
            this.r = new /* Unavailable Anonymous Inner Class!! */;
            if (this.c()) {
                this.a(true);
            }
        } else if (a13 != null && this.a() && this.i.b((Object)a13) == 1) {
            a13.a(this.o);
        }
        ((kz.g)this.d).b(this);
    }

    public final void d() {
        f60.d d14;
        this.x = d14 = this.b.a();
        c c11 = this.r;
        int n10 = m92.a;
        d14.getClass();
        c11.getClass();
        c11.obtainMessage(0, (Object)new /* Unavailable Anonymous Inner Class!! */).sendToTarget();
    }

    @Nullable
    public final uu getCryptoConfig() {
        return this.s;
    }

    @Nullable
    public final z30.a getError() {
        z30.a a13 = this.o == 1 ? this.t : null;
        return a13;
    }

    public final UUID getSchemeUuid() {
        return this.m;
    }

    public final int getState() {
        return this.o;
    }

    public final boolean playClearSamplesWithoutKeys() {
        return this.f;
    }

    @Nullable
    public final Map<String, String> queryKeyStatus() {
        Object object = this.u;
        object = object == null ? null : (Object)this.b.a(object);
        return object;
    }

    public final boolean requiresSecureDecoder(String string2) {
        f60 f602 = this.b;
        byte[] byArray = this.u;
        if (byArray != null) {
            return f602.a(string2, byArray);
        }
        throw new IllegalStateException();
    }
}

