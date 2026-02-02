/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.impl.A5;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.Dh;
import io.appmetrica.analytics.impl.Do;
import io.appmetrica.analytics.impl.Fh;
import io.appmetrica.analytics.impl.Gh;
import io.appmetrica.analytics.impl.I5;
import io.appmetrica.analytics.impl.K9;
import io.appmetrica.analytics.impl.Kf;
import io.appmetrica.analytics.impl.L3;
import io.appmetrica.analytics.impl.M4;
import io.appmetrica.analytics.impl.M5;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Nf;
import io.appmetrica.analytics.impl.Oi;
import io.appmetrica.analytics.impl.Pi;
import io.appmetrica.analytics.impl.Q9;
import io.appmetrica.analytics.impl.Ri;
import io.appmetrica.analytics.impl.Sl;
import io.appmetrica.analytics.impl.Tk;
import io.appmetrica.analytics.impl.bl;
import io.appmetrica.analytics.impl.eb;
import io.appmetrica.analytics.impl.fd;
import io.appmetrica.analytics.impl.h0;
import io.appmetrica.analytics.impl.i0;
import io.appmetrica.analytics.impl.j0;
import io.appmetrica.analytics.impl.k7;
import io.appmetrica.analytics.impl.k9;
import io.appmetrica.analytics.impl.mg;
import io.appmetrica.analytics.impl.mh;
import io.appmetrica.analytics.impl.n5;
import io.appmetrica.analytics.impl.n8;
import io.appmetrica.analytics.impl.o5;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.om;
import io.appmetrica.analytics.impl.pb;
import io.appmetrica.analytics.impl.q5;
import io.appmetrica.analytics.impl.qf;
import io.appmetrica.analytics.impl.r5;
import io.appmetrica.analytics.impl.s5;
import io.appmetrica.analytics.impl.t5;
import io.appmetrica.analytics.impl.tf;
import io.appmetrica.analytics.impl.u5;
import io.appmetrica.analytics.impl.w2;
import io.appmetrica.analytics.impl.x9;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import kotlin.collections.t;

public class v5
implements pb,
eb,
Fh {
    public final Context a;
    public final o5 b;
    public final qf c;
    public final tf d;
    public final k7 e;
    public final Pi f;
    public final x9 g;
    public final i0 h;
    public final j0 i;
    public final bl j;
    public final mh k;
    public final k9 l;
    public final PublicLogger m;
    public final K9 n;
    public final q5 o;
    public final Q9 p;
    public final L3 q;
    public final TimePassedChecker r;
    public final Nf s;
    public final Do t;
    public final Tk u;
    public final w2 v;

    public v5(Context object, o5 o54, j0 object2, TimePassedChecker object3, A5 a52, M4 m44) {
        bl bl2;
        i0 i04;
        this.a = object.getApplicationContext();
        this.b = o54;
        this.i = object2;
        this.r = object3;
        Object object4 = a52.f();
        this.t = object4;
        this.s = Na.j().s();
        object = a52.e().a();
        this.c = object;
        this.v = a52.a((qf)object);
        this.k = object3 = a52.a(this);
        Object object5 = a52.d().a();
        this.m = object5;
        this.d = Na.j().x();
        this.h = i04 = ((j0)object2).a(o54, (PublicLogger)object5, (qf)object);
        this.l = a52.a();
        this.e = object2 = a52.b(this);
        Ri ri2 = a52.d(this);
        this.o = A5.b();
        this.w();
        this.j = bl2 = A5.a(this, (Do)object4, new u5(this));
        ((BaseReleaseLogger)object5).info("Read app environment for component %s. Value: %s", o54.toString(), i04.a().a);
        this.u = object5 = a52.c();
        this.n = a52.a((qf)object, (Do)object4, bl2, (k7)object2, i04, (Tk)object5, ri2);
        this.g = object4 = A5.c(this);
        this.f = A5.a(this, (x9)object4);
        this.q = a52.b((qf)object);
        this.p = a52.a(ri2, (k7)object2, (mh)object3, m44, o54, (qf)object);
        ((k7)object2).e();
    }

    public v5(@NonNull Context context, @NonNull om om3, @NonNull o5 o54, @NonNull M4 m44, @NonNull Dh dh3, @NonNull t5 t54) {
        this(context, o54, new j0(), new TimePassedChecker(), new A5(context, o54, m44, t54, om3, dh3, Na.j().w().d(), PackageManagerUtils.getAppVersionCodeInt(context), Na.j().k(), new n5()), m44);
    }

    public final boolean A() {
        Gh gh3 = (Gh)this.k.a();
        boolean bl2 = gh3.n && this.r.didTimePassSeconds(this.n.l, gh3.t, "should force send permissions");
        return bl2;
    }

    public final boolean B() {
        Object object = this.s;
        ((n8)object).h.a(((n8)object).a);
        boolean bl2 = ((Kf)((n8)object).c()).d;
        object = this.k;
        synchronized (object) {
            om om3 = ((M5)object).c.a;
            // MONITOREXIT @DISABLED, blocks:[0, 1] lbl8 : MonitorExitStatement: MONITOREXIT : var4_1
            boolean bl3 = om3.q;
            boolean bl4 = bl2 && bl3;
            return bl4 ^ true;
        }
    }

    public void C() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(@NonNull M4 iterator) {
        synchronized (this) {
            boolean bl2;
            long l10;
            boolean bl3;
            Object object;
            block12: {
                Throwable throwable2;
                block11: {
                    block10: {
                        block9: {
                            try {
                                this.k.a((M4)((Object)iterator));
                                object = ((M4)((Object)iterator)).h;
                                boolean bl4 = Boolean.TRUE.equals(object);
                                bl3 = false;
                                if (!bl4) break block9;
                                this.m.setEnabled(true);
                                break block10;
                            }
                            catch (Throwable throwable2) {
                                break block11;
                            }
                        }
                        object = ((M4)((Object)iterator)).h;
                        if (Boolean.FALSE.equals(object)) {
                            this.m.setEnabled(false);
                        }
                    }
                    object = this.v;
                    iterator = ((M4)((Object)iterator)).o;
                    l10 = ((w2)object).d.currentTimeMillis();
                    iterator = iterator.iterator();
                    bl2 = false;
                    break block12;
                }
                throw throwable2;
            }
            while (iterator.hasNext()) {
                boolean bl5;
                long l11;
                String string2 = (String)iterator.next();
                Long l13 = (Long)((w2)object).e.get(string2);
                if (l13 != null) {
                    l11 = l13;
                    bl5 = bl2;
                } else {
                    l11 = -1L;
                    bl5 = true;
                }
                bl2 = bl5;
                if (l10 - l11 <= ((w2)object).b) continue;
                ((w2)object).e.put(string2, l10);
                bl3 = true;
                bl2 = bl5;
            }
            if (bl3) {
                ((w2)object).a(((w2)object).e);
                ((w2)object).a.a(((w2)object).e);
            }
            if (bl2) {
                this.k.e();
            }
            return;
        }
    }

    @Override
    public final void a(@NonNull Sl sl3, @Nullable om om3) {
    }

    @Override
    public final void a(@NonNull o6 o63) {
        String string2 = mg.a("Event received on service", Bb.a(o63.d), o63.getName(), o63.getValue());
        if (string2 != null) {
            this.m.info(string2, new Object[0]);
        }
        if (!TextUtils.isEmpty((CharSequence)(string2 = this.b.b)) && !"-1".equals(string2)) {
            this.f.a(o63, new Oi());
        }
    }

    @Override
    public void a(@NonNull om om3) {
        synchronized (this) {
            this.k.a(om3);
            ((I5)this.p).e();
            return;
        }
    }

    public final void a(@Nullable String string2) {
        this.c.j(string2).b();
    }

    @Override
    @NonNull
    public final o5 b() {
        return this.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void b(o6 object) {
        block3: {
            this.h.a(((o6)object).f);
            h0 h03 = this.h.a();
            object = this.i;
            qf qf3 = this.c;
            // MONITORENTER : object
            if (h03.b <= qf3.d().b) break block3;
            qf3.a(h03).b();
            // MONITOREXIT : object
            this.m.info("Save new app environment for %s. Value: %s", this.b, h03.a);
            return;
        }
        // MONITOREXIT : object
    }

    @Override
    @NonNull
    public CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MANUAL;
    }

    public final void d() {
        i0 i04 = this.h;
        synchronized (i04) {
            fd fd3;
            i04.a = fd3 = new fd();
            // MONITOREXIT @DISABLED, blocks:[0, 1] lbl5 : MonitorExitStatement: MONITOREXIT : var1_1
            this.i.a(this.h.a(), this.c);
            return;
        }
    }

    public final void e() {
        synchronized (this) {
            ((I5)this.p).d();
            return;
        }
    }

    @NonNull
    public final w2 f() {
        return this.v;
    }

    @NonNull
    public final L3 g() {
        return this.q;
    }

    @Override
    @NonNull
    public final Context getContext() {
        return this.a;
    }

    @NonNull
    public final qf h() {
        return this.c;
    }

    @NonNull
    public final k7 i() {
        return this.e;
    }

    @NonNull
    public final k9 j() {
        return this.l;
    }

    @NonNull
    public final x9 k() {
        return this.g;
    }

    @NonNull
    public final K9 l() {
        return this.n;
    }

    @NonNull
    public final Q9 m() {
        return this.p;
    }

    @NonNull
    public final Gh n() {
        return (Gh)this.k.a();
    }

    @Nullable
    public final String o() {
        return this.c.j();
    }

    @NonNull
    public final PublicLogger p() {
        return this.m;
    }

    @NonNull
    public final tf q() {
        return this.d;
    }

    @NonNull
    public final Tk r() {
        return this.u;
    }

    @NonNull
    public final bl s() {
        return this.j;
    }

    @NonNull
    public final om t() {
        mh mh3 = this.k;
        synchronized (mh3) {
            om om3 = mh3.c.a;
            return om3;
        }
    }

    @NonNull
    public final Do u() {
        return this.t;
    }

    public final void v() {
        int n10;
        K9 k94 = this.n;
        k94.m = n10 = k94.k;
        k94.a.a(n10).b();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void w() {
        int n13 = AppMetrica.getLibraryApiLevel();
        Object object = this.t;
        // MONITORENTER : object
        int n10 = ((Do)object).a.a().optInt("last_migration_api_level", 0);
        // MONITOREXIT : object
        if (n10 >= n13) return;
        this.o.getClass();
        object = kotlin.collections.t.e((Object)new s5(this)).iterator();
        while (true) {
            if (!object.hasNext()) {
                this.t.b(n13);
                return;
            }
            ((r5)object.next()).a(n10);
        }
    }

    public final boolean x() {
        Gh gh3 = (Gh)this.k.a();
        boolean bl2 = gh3.n && gh3.isIdentifiersValid() && this.r.didTimePassSeconds(this.n.l, gh3.s, "need to check permissions");
        return bl2;
    }

    public final boolean y() {
        K9 k94 = this.n;
        boolean bl2 = k94.m < k94.k && ((Gh)this.k.a()).o && ((Gh)this.k.a()).isIdentifiersValid();
        return bl2;
    }

    public final void z() {
        mh mh3 = this.k;
        synchronized (mh3) {
            mh3.a = null;
            return;
        }
    }
}

