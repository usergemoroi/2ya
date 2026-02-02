/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.be1
 *  com.yandex.mobile.ads.impl.gn
 *  com.yandex.mobile.ads.impl.go1
 *  com.yandex.mobile.ads.impl.ho1
 *  com.yandex.mobile.ads.impl.j30
 *  com.yandex.mobile.ads.impl.n92
 *  com.yandex.mobile.ads.impl.q50
 *  com.yandex.mobile.ads.impl.qn
 *  com.yandex.mobile.ads.impl.rh
 *  com.yandex.mobile.ads.impl.rh0
 *  com.yandex.mobile.ads.impl.rh1
 *  com.yandex.mobile.ads.impl.ta
 *  com.yandex.mobile.ads.impl.v50
 *  com.yandex.mobile.ads.impl.w50
 *  com.yandex.mobile.ads.impl.x50
 *  com.yandex.mobile.ads.impl.ym
 *  com.yandex.mobile.ads.impl.yq1
 *  com.yandex.mobile.ads.impl.zp1
 *  kotlin.collections.t
 *  okio.c
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.be1;
import com.yandex.mobile.ads.impl.br;
import com.yandex.mobile.ads.impl.ce1;
import com.yandex.mobile.ads.impl.eo1;
import com.yandex.mobile.ads.impl.gn;
import com.yandex.mobile.ads.impl.go1;
import com.yandex.mobile.ads.impl.ho1;
import com.yandex.mobile.ads.impl.j30;
import com.yandex.mobile.ads.impl.n92;
import com.yandex.mobile.ads.impl.ol;
import com.yandex.mobile.ads.impl.om;
import com.yandex.mobile.ads.impl.pr1;
import com.yandex.mobile.ads.impl.q50;
import com.yandex.mobile.ads.impl.qn;
import com.yandex.mobile.ads.impl.rh;
import com.yandex.mobile.ads.impl.rh0;
import com.yandex.mobile.ads.impl.rh1;
import com.yandex.mobile.ads.impl.ta;
import com.yandex.mobile.ads.impl.v50;
import com.yandex.mobile.ads.impl.w50;
import com.yandex.mobile.ads.impl.x50;
import com.yandex.mobile.ads.impl.ym;
import com.yandex.mobile.ads.impl.yq1;
import com.yandex.mobile.ads.impl.zm;
import com.yandex.mobile.ads.impl.zp1;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import kotlin.k0;
import okio.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class do1
implements ym {
    @NotNull
    private final ce1 a;
    @NotNull
    private final zp1 b;
    private final boolean c;
    @NotNull
    private final go1 d;
    @NotNull
    private final q50 e;
    @NotNull
    private final c f;
    @NotNull
    private final AtomicBoolean g;
    @Nullable
    private Object h;
    @Nullable
    private x50 i;
    @Nullable
    private eo1 j;
    private boolean k;
    @Nullable
    private v50 l;
    private boolean m;
    private boolean n;
    private boolean o;
    private volatile boolean p;
    @Nullable
    private volatile v50 q;
    @Nullable
    private volatile eo1 r;

    public do1(@NotNull ce1 object, @NotNull zp1 zp12, boolean bl2) {
        this.a = object;
        this.b = zp12;
        this.c = bl2;
        this.d = ((ce1)object).f().a();
        this.e = ((ce1)object).k().a((ym)this);
        object = new okio.c(this){
            final do1 a;
            {
                this.a = do12;
            }

            protected final void timedOut() {
                this.a.a();
            }
        };
        ((m0)object).timeout(0, TimeUnit.MILLISECONDS);
        this.f = object;
        this.g = new AtomicBoolean();
        this.o = true;
    }

    public static final /* synthetic */ c a(do1 do12) {
        return do12.f;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private final <E extends IOException> E a(E object) {
        boolean bl2 = n92.f;
        if (bl2 && Thread.holdsLock(this)) {
            object = Thread.currentThread().getName();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Thread ");
            stringBuilder.append((String)object);
            stringBuilder.append(" MUST NOT hold lock on ");
            stringBuilder.append(this);
            throw new AssertionError((Object)stringBuilder.toString());
        }
        Object stringBuilder = this.j;
        if (stringBuilder != null) {
            if (bl2 && Thread.holdsLock(stringBuilder)) {
                object = Thread.currentThread().getName();
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Thread ");
                stringBuilder2.append((String)object);
                stringBuilder2.append(" MUST NOT hold lock on ");
                stringBuilder2.append(stringBuilder);
                throw new AssertionError((Object)stringBuilder2.toString());
            }
            // MONITORENTER : stringBuilder
            stringBuilder = this.l();
            // MONITOREXIT : stringBuilder
            if (this.j == null) {
                if (stringBuilder != null) {
                    n92.a((Socket)stringBuilder);
                }
                this.e.getClass();
            } else if (stringBuilder != null) throw new IllegalStateException("Check failed.".toString());
        }
        if (this.k || !this.f.exit()) {
            stringBuilder = object;
        } else {
            stringBuilder = new InterruptedIOException("timeout");
            stringBuilder = stringBuilder;
            if (object != null) {
                ((Throwable)stringBuilder).initCause((Throwable)object);
                stringBuilder = stringBuilder;
            }
        }
        if (object != null) {
            object = this.e;
            y.g(stringBuilder);
            object.getClass();
            return (E)stringBuilder;
        }
        this.e.getClass();
        return (E)stringBuilder;
    }

    public static final /* synthetic */ String b(do1 do12) {
        return do12.o();
    }

    private final String o() {
        String string2 = this.p ? "canceled " : "";
        String string3 = this.c ? "web socket" : "call";
        String string4 = this.b.g().j();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        stringBuilder.append(" to ");
        stringBuilder.append(string4);
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @NotNull
    public final v50 a(@NotNull ho1 object) {
        block6: {
            block7: {
                block8: {
                    // MONITORENTER : this
                    if (!this.o) break block6;
                    if (!(this.n ^ true)) break block7;
                    if (!(this.m ^ true)) break block8;
                    k0 k02 = k0.a;
                    // MONITOREXIT : this
                    k02 = this.i;
                    y.g(k02);
                    object = k02.a(this.a, (ho1)object);
                    object = new v50(this, this.e, (x50)k02, (w50)object);
                    this.l = object;
                    this.q = object;
                    // MONITORENTER : this
                    this.m = true;
                    this.n = true;
                    // MONITOREXIT : this
                    if (this.p) throw new IOException("Canceled");
                    return object;
                }
                object = new IllegalStateException("Check failed.".toString());
                throw object;
            }
            object = new IllegalStateException("Check failed.".toString());
            throw object;
        }
        object = new IllegalStateException("released".toString());
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final <E extends IOException> E a(@NotNull v50 object, boolean bl2, boolean bl3, E e11) {
        boolean bl4;
        boolean bl5;
        block13: {
            block12: {
                boolean bl6;
                block11: {
                    if (!y.e(object, this.q)) {
                        return e11;
                    }
                    // MONITORENTER : this
                    bl5 = false;
                    bl6 = false;
                    if (bl2) {
                        if (this.m) break block11;
                    }
                    if (!bl3 || !this.n) break block12;
                }
                if (bl2) {
                    this.m = false;
                }
                if (bl3) {
                    this.n = false;
                }
                bl5 = !(bl2 = this.m) && !this.n;
                bl4 = bl6;
                if (bl2) break block13;
                bl4 = bl6;
                if (!this.n) {
                    bl4 = bl6;
                    if (!this.o) {
                        bl4 = true;
                    }
                }
                break block13;
            }
            bl4 = false;
        }
        object = k0.a;
        // MONITOREXIT : this
        if (bl5) {
            this.q = null;
            object = this.j;
            if (object != null) {
                object.g();
            }
        }
        if (!bl4) return e11;
        return this.a(e11);
    }

    public final void a() {
        if (this.p) {
            return;
        }
        this.p = true;
        Object object = this.q;
        if (object != null) {
            object.a();
        }
        if ((object = this.r) != null) {
            ((eo1)((Object)object)).a();
        }
        this.e.getClass();
    }

    public final void a(@NotNull eo1 eo12) {
        if (n92.f && !Thread.holdsLock((Object)eo12)) {
            String string2 = Thread.currentThread().getName();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Thread ");
            stringBuilder.append(string2);
            stringBuilder.append(" MUST hold lock on ");
            stringBuilder.append((Object)eo12);
            throw new AssertionError((Object)stringBuilder.toString());
        }
        if (this.j == null) {
            this.j = eo12;
            eo12.b().add(new /* Unavailable Anonymous Inner Class!! */);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void a(@NotNull gn gn3) {
        if (this.g.compareAndSet(false, true)) {
            this.h = rh1.a().b();
            this.e.getClass();
            this.a.i().a(new /* Unavailable Anonymous Inner Class!! */);
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(@NotNull zp1 object, boolean bl2) {
        block6: {
            block7: {
                Object object2;
                if (this.l != null) throw new IllegalStateException("Check failed.".toString());
                // MONITORENTER : this
                if (!(this.n ^ true)) break block6;
                if (!(this.m ^ true)) break block7;
                Object object3 = k0.a;
                // MONITOREXIT : this
                if (!bl2) return;
                go1 go12 = this.d;
                rh0 rh02 = object.g();
                if (rh02.h()) {
                    object3 = this.a.x();
                    object = this.a.o();
                    object2 = this.a.d();
                } else {
                    object3 = null;
                    object2 = object = null;
                }
                String string2 = rh02.g();
                int n10 = rh02.i();
                rh02 = this.a.j();
                SocketFactory socketFactory = this.a.w();
                rh rh3 = this.a.s();
                this.a.getClass();
                this.i = new x50(go12, new ta(string2, n10, (j30)rh02, socketFactory, (SSLSocketFactory)object3, (be1)object, (qn)object2, rh3, this.a.r(), this.a.g(), this.a.t()), this, this.e);
                return;
            }
            object = new IllegalStateException("Check failed.".toString());
            throw object;
        }
        object = new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(boolean bl2) {
        block4: {
            block5: {
                // MONITORENTER : this
                if (!this.o) break block4;
                k0 k02 = k0.a;
                // MONITOREXIT : this
                if (!bl2 || (k02 = this.q) == null) break block5;
                k02.b();
            }
            this.l = null;
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("released".toString());
        throw illegalStateException;
    }

    @NotNull
    public final yq1 b() {
        if (this.g.compareAndSet(false, true)) {
            this.f.enter();
            this.h = rh1.a().b();
            this.e.getClass();
            try {
                this.a.i().a(this);
                yq1 yq12 = this.i();
                return yq12;
            }
            finally {
                this.a.i().b(this);
            }
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public final IOException b(@Nullable IOException iOException) {
        synchronized (this) {
            try {
                boolean bl2;
                boolean bl3 = this.o;
                boolean bl4 = bl2 = false;
                if (bl3) {
                    this.o = false;
                    bl4 = bl2;
                    if (!this.m) {
                        bl4 = bl2;
                        if (!this.n) {
                            bl4 = true;
                        }
                    }
                }
                Object object = k0.a;
                // MONITOREXIT @DISABLED, blocks:[0, 1] lbl13 : MonitorExitStatement: MONITOREXIT : this
                object = iOException;
                if (!bl4) return object;
                return this.a(iOException);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void b(@Nullable eo1 eo12) {
        this.r = eo12;
    }

    @NotNull
    public final ce1 c() {
        return this.a;
    }

    public final Object clone() {
        return new do1(this.a, this.b, this.c);
    }

    @Nullable
    public final eo1 d() {
        return this.j;
    }

    @NotNull
    public final q50 e() {
        return this.e;
    }

    public final boolean f() {
        return this.c;
    }

    @Nullable
    public final v50 g() {
        return this.l;
    }

    @NotNull
    public final zp1 h() {
        return this.b;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final yq1 i() throws IOException {
        void var3_6;
        boolean bl2;
        Object object;
        block8: {
            object = new ArrayList();
            t.E(object, this.a.p());
            object.add(new pr1(this.a));
            object.add(new ol(this.a.h()));
            this.a.getClass();
            object.add(new om());
            object.add(br.a);
            if (!this.c) {
                t.E(object, this.a.q());
            }
            object.add(new zm(this.c));
            object = new ho1(this, object, 0, null, this.b, this.a.e(), this.a.u(), this.a.z());
            bl2 = false;
            object = object.a(this.b);
            boolean bl3 = this.p;
            if (bl3) break block8;
            this.b((IOException)null);
            return object;
        }
        try {
            n92.a((Closeable)object);
            object = new IOException("Canceled");
            throw object;
        }
        catch (Throwable throwable) {
        }
        catch (IOException iOException) {
            try {
                IOException iOException2 = this.b(iOException);
                y.h(iOException2, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOException2;
            }
            catch (Throwable throwable) {
                bl2 = true;
            }
        }
        if (!bl2) {
            this.b((IOException)null);
        }
        throw var3_6;
    }

    public final boolean j() {
        return this.p;
    }

    @NotNull
    public final String k() {
        return this.b.g().j();
    }

    @Nullable
    public final Socket l() {
        int n10;
        ArrayList arrayList;
        eo1 eo12;
        block6: {
            eo12 = this.j;
            y.g((Object)eo12);
            if (n92.f && !Thread.holdsLock((Object)eo12)) {
                String string2 = Thread.currentThread().getName();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Thread ");
                stringBuilder.append(string2);
                stringBuilder.append(" MUST hold lock on ");
                stringBuilder.append((Object)eo12);
                throw new AssertionError((Object)stringBuilder.toString());
            }
            arrayList = eo12.b();
            Iterator iterator = arrayList.iterator();
            n10 = 0;
            while (iterator.hasNext()) {
                if (!y.e(((Reference)iterator.next()).get(), this)) {
                    ++n10;
                    continue;
                }
                break block6;
            }
            n10 = -1;
        }
        if (n10 != -1) {
            arrayList.remove(n10);
            this.j = null;
            if (arrayList.isEmpty()) {
                eo12.a(System.nanoTime());
                if (this.d.a(eo12)) {
                    return eo12.m();
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final boolean m() {
        x50 x502 = this.i;
        y.g(x502);
        return x502.b();
    }

    public final void n() {
        if (this.k ^ true) {
            this.k = true;
            this.f.exit();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}

