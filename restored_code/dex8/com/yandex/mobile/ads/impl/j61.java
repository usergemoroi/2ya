/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.Context
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.mobile.ads.impl.a71
 *  com.yandex.mobile.ads.impl.au
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.c71
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.i7
 *  com.yandex.mobile.ads.impl.iq1
 *  com.yandex.mobile.ads.impl.j51
 *  com.yandex.mobile.ads.impl.j7
 *  com.yandex.mobile.ads.impl.l0
 *  com.yandex.mobile.ads.impl.l51
 *  com.yandex.mobile.ads.impl.lt
 *  com.yandex.mobile.ads.impl.m32
 *  com.yandex.mobile.ads.impl.m81
 *  com.yandex.mobile.ads.impl.o4
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.p4
 *  com.yandex.mobile.ads.impl.rt
 *  com.yandex.mobile.ads.impl.s4
 *  com.yandex.mobile.ads.impl.s61
 *  com.yandex.mobile.ads.impl.sq0
 *  com.yandex.mobile.ads.impl.t61
 *  com.yandex.mobile.ads.impl.v51
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.x61
 *  com.yandex.mobile.ads.impl.y51
 */
package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.a71;
import com.yandex.mobile.ads.impl.ak;
import com.yandex.mobile.ads.impl.au;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.c71;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.f71;
import com.yandex.mobile.ads.impl.i7;
import com.yandex.mobile.ads.impl.iq1;
import com.yandex.mobile.ads.impl.j51;
import com.yandex.mobile.ads.impl.j7;
import com.yandex.mobile.ads.impl.kj;
import com.yandex.mobile.ads.impl.l0;
import com.yandex.mobile.ads.impl.l51;
import com.yandex.mobile.ads.impl.l81;
import com.yandex.mobile.ads.impl.lj;
import com.yandex.mobile.ads.impl.lt;
import com.yandex.mobile.ads.impl.m32;
import com.yandex.mobile.ads.impl.m81;
import com.yandex.mobile.ads.impl.o4;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.rt;
import com.yandex.mobile.ads.impl.s4;
import com.yandex.mobile.ads.impl.s61;
import com.yandex.mobile.ads.impl.sq0;
import com.yandex.mobile.ads.impl.t61;
import com.yandex.mobile.ads.impl.v51;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.x61;
import com.yandex.mobile.ads.impl.y51;
import java.util.ArrayList;
import kotlin.jvm.JvmOverloads;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class j61
extends lj<a71> {
    @NotNull
    private final l51 A;
    @NotNull
    private final a B;
    @NotNull
    private final y51 C;
    @NotNull
    private final x61 v;
    @NotNull
    private final s61 w;
    @NotNull
    private final c71 x;
    @NotNull
    private final f71 y;
    @NotNull
    private final m32 z;

    @JvmOverloads
    public j61(@NotNull Context context, @NotNull x61 x612, @NotNull x2 x22, @NotNull s61 s612, @NotNull p4 p42, @NotNull q0 q02, @NotNull c71 c712, @NotNull f71 f712, @NotNull m32 m322, @NotNull l51 l512) {
        super(context, p42, x22, q02);
        this.v = x612;
        this.w = s612;
        this.x = c712;
        this.y = f712;
        this.z = m322;
        this.A = l512;
        this.B = new a(this);
        this.C = new y51(context, (iq1)this, (ak.a)this);
        s612.a(f712);
    }

    @Override
    @NotNull
    protected final kj<a71> a(@NotNull String string2, @NotNull String string3) {
        return this.C.a(this.v.d(), this.e(), this.v.a(), string2, string3);
    }

    public final void a(@Nullable au au3) {
        this.w.a(au3);
    }

    @Override
    public final void a(@NotNull b8<a71> b82) {
        super.a(b82);
        this.y.a(b82);
        if (!this.g()) {
            m81 m812 = this.x.a(b82).a(this);
            Activity activity = l0.a();
            if (activity != null) {
                int n10 = op0.b;
            }
            if (activity == null) {
                activity = this.k();
            }
            m812.a((Context)activity, b82);
        }
    }

    public final void a(@NotNull b8<a71> b82, @NotNull v51 v512) {
        if (!this.g()) {
            a71 a712 = (a71)b82.J();
            this.A.a(b82, a712, v512, (j51)this.B);
        }
    }

    @Override
    public final void a(@NotNull f3 f33) {
        this.w.b(f33);
    }

    public final void a(@Nullable lt lt3) {
        this.w.a(lt3);
    }

    public final void a(@Nullable rt rt2) {
        this.w.a(rt2);
    }

    @Override
    protected final boolean a(@Nullable i7 i73) {
        return true;
    }

    @Override
    public final void b(@Nullable i7 i73) {
        synchronized (this) {
            throw null;
        }
    }

    @Override
    @SuppressLint(value={"VisibleForTests"})
    @Nullable
    protected final f3 w() {
        return this.m().c();
    }

    public final void x() {
        this.o().a();
        this.f().a();
        this.w.a();
        this.z.a(sq0.b, (Object)this);
        this.a(s4.b);
        this.A.a();
    }

    public final void y() {
        i7 i73 = this.v.a();
        if (this.v.d().a()) {
            this.h().a(o4.e, null);
            this.z.b(sq0.b, (Object)this);
            this.e().a(Integer.valueOf(this.v.b()));
            this.e().a(i73.a());
            this.e().a(this.v.c());
            this.e().a(i73.l());
            this.e().a(this.v.e());
            synchronized (this) {
                this.c(i73);
            }
        } else {
            this.b(j7.q());
        }
    }

    @VisibleForTesting
    public final class a
    implements j51 {
        final j61 a;

        public a(j61 j612) {
            this.a = j612;
        }

        public final void a(@NotNull f3 f33) {
            this.a.h().a(o4.e);
            this.a.b(f33);
        }

        public final void a(@NotNull l81 l812) {
            this.a.s();
            this.a.w.a(l812);
        }

        public final void a(@NotNull t61 t612) {
            this.a.s();
            this.a.w.a(t612);
        }

        public final void a(@NotNull ArrayList arrayList) {
            this.a.s();
            this.a.w.a(arrayList);
        }
    }
}

