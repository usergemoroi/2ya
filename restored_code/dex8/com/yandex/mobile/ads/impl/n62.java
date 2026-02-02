/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  com.yandex.mobile.ads.impl.b4
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.ba
 *  com.yandex.mobile.ads.impl.dh1
 *  com.yandex.mobile.ads.impl.dk0$a
 *  com.yandex.mobile.ads.impl.ek0
 *  com.yandex.mobile.ads.impl.f9
 *  com.yandex.mobile.ads.impl.gk0
 *  com.yandex.mobile.ads.impl.gp1
 *  com.yandex.mobile.ads.impl.h0
 *  com.yandex.mobile.ads.impl.ia
 *  com.yandex.mobile.ads.impl.j0
 *  com.yandex.mobile.ads.impl.od1
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.ou1
 *  com.yandex.mobile.ads.impl.p62
 *  com.yandex.mobile.ads.impl.pw1
 *  com.yandex.mobile.ads.impl.pw1$a
 *  com.yandex.mobile.ads.impl.qd1
 *  com.yandex.mobile.ads.impl.u92
 *  com.yandex.mobile.ads.impl.u92$a
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.yo1
 *  com.yandex.mobile.ads.impl.z3
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Bundle;
import com.yandex.mobile.ads.impl.b4;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.ba;
import com.yandex.mobile.ads.impl.ck0;
import com.yandex.mobile.ads.impl.dh1;
import com.yandex.mobile.ads.impl.dk0;
import com.yandex.mobile.ads.impl.ek0;
import com.yandex.mobile.ads.impl.f31;
import com.yandex.mobile.ads.impl.f9;
import com.yandex.mobile.ads.impl.gk0;
import com.yandex.mobile.ads.impl.gp1;
import com.yandex.mobile.ads.impl.h0;
import com.yandex.mobile.ads.impl.ia;
import com.yandex.mobile.ads.impl.j0;
import com.yandex.mobile.ads.impl.od1;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.ou1;
import com.yandex.mobile.ads.impl.p62;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.qd1;
import com.yandex.mobile.ads.impl.u92;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.xf0;
import com.yandex.mobile.ads.impl.xo1;
import com.yandex.mobile.ads.impl.yf0;
import com.yandex.mobile.ads.impl.yo1;
import com.yandex.mobile.ads.impl.z3;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class n62
extends xf0
implements dk0.a,
j0 {
    @NotNull
    private final ia e;
    @NotNull
    private final ck0 f;
    @NotNull
    private final f31 g;
    @NotNull
    private final dk0 h;
    @NotNull
    private final h0 i;
    @NotNull
    private final xo1 j;

    public /* synthetic */ n62(Context context, ia ia2, b8 b82, x2 x22) {
        this(context, ia2, (b8<String>)b82, x22, new ck0(), new b4((z3)new yf0((b8<String>)b82)), new gk0(context, b82, x22, b82.B()), new yo1(), new qd1(), new ek0(), new od1());
    }

    @JvmOverloads
    protected n62(@NotNull Context context, @NotNull ia ia2, @NotNull b8<String> b82, @NotNull x2 x22, @NotNull ck0 ck02, @NotNull b4 b43, @NotNull gk0 object, @NotNull yo1 yo12, @NotNull qd1 qd12, @NotNull ek0 ek02, @NotNull od1 od12) {
        super(context, b82);
        this.e = ia2;
        this.f = ck02;
        this.i = new h0(context, x22, b82, (j0)this, b82.y());
        a a13 = new a(this);
        ek02.getClass();
        this.h = ek0.a((Context)context, this, (gk0)object, (b4)b43, (ck0)ck02);
        object = qd12.a(context, x22, (gk0)object, (p62)a13, ba.a((Object)this), f9.b);
        this.g = object;
        ((f31)object).a(ck02);
        od12.getClass();
        ck02.a(od1.a((f31)object));
        yo12.getClass();
        this.j = yo1.a((Context)context, b82, (x2)x22, (b4)b43, (ia)ia2, (gp1)ck02);
    }

    public static final boolean a(n62 n622) {
        return n622.e.b() ^ true;
    }

    public void a(int n10, @Nullable Bundle bundle) {
        int n12 = op0.b;
        if (n10 != 14) {
            if (n10 != 15) {
                switch (n10) {
                    default: {
                        break;
                    }
                    case 9: {
                        this.i.a();
                        this.f.a();
                        break;
                    }
                    case 8: {
                        this.i.f();
                        break;
                    }
                    case 7: {
                        this.onLeftApplication();
                        this.i.e();
                        break;
                    }
                    case 6: {
                        this.onLeftApplication();
                        this.i.g();
                        break;
                    }
                }
            } else {
                this.f.b();
            }
        } else {
            this.f.e();
        }
    }

    public final void a(@NotNull dh1 dh12) {
        this.e.b();
        Objects.toString(dh12);
        int n10 = op0.b;
        this.g.a(dh12, this.e.b());
    }

    public final void a(@Nullable Map<String, String> c43) {
        this.toString();
        int n10 = op0.b;
        ArrayList arrayList = ba.a(this.d(), c43);
        c43 = this.d().B();
        this.h.a(arrayList, c43);
        this.g.a(this.d(), arrayList);
        this.m();
    }

    protected abstract boolean a(int var1);

    @Override
    public final void b() {
        this.toString();
        int n10 = op0.b;
        super.b();
        this.g.a();
        this.j.c();
    }

    public final void b(int n10) {
        int n12 = op0.b;
        n12 = pw1.l;
        ou1 ou12 = pw1.a.a().a(this.e());
        if (ou12 != null && ou12.p0()) {
            if (n10 == 0) {
                this.g.b();
            } else {
                this.g.a();
            }
        } else if (this.e.b()) {
            this.g.b();
        } else {
            this.g.a();
        }
        this.getClass().toString();
    }

    @NotNull
    public final ck0 j() {
        return this.f;
    }

    protected abstract boolean k();

    protected abstract boolean l();

    public final void m() {
        synchronized (this) {
            this.toString();
            int n10 = op0.b;
            this.g.b();
            this.j.b();
            return;
        }
    }

    public final class a
    implements p62 {
        final n62 a;

        public a(n62 n622) {
            this.a = n622;
        }

        @NotNull
        public final u92 a(int n10) {
            u92.a a13 = n62.a(this.a) ? u92.a.o : (!this.a.l() ? u92.a.q : (!this.a.k() ? u92.a.k : u92.a.c));
            return new u92(a13, null, null, 6);
        }

        @NotNull
        public final u92 b(int n10) {
            u92.a a13 = this.a.f() ? u92.a.d : (n62.a(this.a) ? u92.a.o : (!this.a.l() ? u92.a.q : (this.a.a(n10) && this.a.k() ? u92.a.c : u92.a.k)));
            return new u92(a13, null, null, 6);
        }
    }
}

