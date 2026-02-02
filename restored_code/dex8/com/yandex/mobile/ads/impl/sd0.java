/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  com.yandex.mobile.ads.impl.a6
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.ba
 *  com.yandex.mobile.ads.impl.bo
 *  com.yandex.mobile.ads.impl.c4
 *  com.yandex.mobile.ads.impl.f4
 *  com.yandex.mobile.ads.impl.f7
 *  com.yandex.mobile.ads.impl.gd0
 *  com.yandex.mobile.ads.impl.hd0
 *  com.yandex.mobile.ads.impl.hs
 *  com.yandex.mobile.ads.impl.j1
 *  com.yandex.mobile.ads.impl.k1
 *  com.yandex.mobile.ads.impl.m32
 *  com.yandex.mobile.ads.impl.m32$a
 *  com.yandex.mobile.ads.impl.o4
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.p4
 *  com.yandex.mobile.ads.impl.sq0
 *  com.yandex.mobile.ads.impl.u8
 *  com.yandex.mobile.ads.impl.vc0
 *  com.yandex.mobile.ads.impl.wr
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.yandex.mobile.ads.impl.a6;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.ba;
import com.yandex.mobile.ads.impl.bo;
import com.yandex.mobile.ads.impl.c4;
import com.yandex.mobile.ads.impl.d1;
import com.yandex.mobile.ads.impl.dg0;
import com.yandex.mobile.ads.impl.f4;
import com.yandex.mobile.ads.impl.f7;
import com.yandex.mobile.ads.impl.gd0;
import com.yandex.mobile.ads.impl.hd0;
import com.yandex.mobile.ads.impl.hs;
import com.yandex.mobile.ads.impl.j1;
import com.yandex.mobile.ads.impl.k1;
import com.yandex.mobile.ads.impl.m32;
import com.yandex.mobile.ads.impl.n62;
import com.yandex.mobile.ads.impl.o4;
import com.yandex.mobile.ads.impl.oc0;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.sq0;
import com.yandex.mobile.ads.impl.u8;
import com.yandex.mobile.ads.impl.vc0;
import com.yandex.mobile.ads.impl.wr;
import com.yandex.mobile.ads.impl.x2;
import java.util.Map;
import kotlin.u;
import kotlin.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class sd0<T extends sd0<T>>
extends n62 {
    @NotNull
    private final x2 k;
    @NotNull
    private final oc0 l;
    @NotNull
    private final vc0<T> m;
    @NotNull
    private final f4 n;
    @NotNull
    private final hd0 o;
    @NotNull
    private final p4 p;
    @NotNull
    private final m32 q;
    @NotNull
    private final f7 r;
    @Nullable
    private gd0 s;

    public /* synthetic */ sd0(Context context, b8 b82, x2 x22, oc0 oc02, vc0 vc02, f4 f42) {
        hd0 hd02 = new hd0();
        p4 p42 = new p4();
        int n10 = m32.d;
        m32 m322 = m32.a.a();
        dg0 dg02 = new dg0();
        dg02.a((b8<String>)b82);
        dg02.a(x22);
        this(context, (b8<String>)b82, x22, oc02, vc02, f42, hd02, p42, m322, new f7(context, b82, x22, p42, dg02));
    }

    public sd0(@NotNull Context object, @NotNull b8<String> b82, @NotNull x2 x22, @NotNull oc0 oc02, @NotNull vc0<T> vc02, @NotNull f4 f42, @NotNull hd0 hd02, @NotNull p4 p42, @NotNull m32 m322, @NotNull f7 f73) {
        super((Context)object, oc02, (b8)b82, x22);
        this.k = x22;
        this.l = oc02;
        this.m = vc02;
        this.n = f42;
        this.o = hd02;
        this.p = p42;
        this.q = m322;
        this.r = f73;
        object = new d1();
        k1.b.a().a("window_type_fullscreen", (j1)object);
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @NotNull
    public final Object a(@NotNull Activity object) {
        this.g();
        u.a a13 = u.d;
        u.b(v.a((Throwable)a6.a()));
        // MONITORENTER : this
        // MONITOREXIT : this
        p4 p42 = this.p;
        a13 = o4.f;
        p42.a((o4)a13, null);
        m32 m322 = this.q;
        p42 = sq0.c;
        m322.b((sq0)p42, (Object)this);
        Object object2 = this.m.a(this.o(), object);
        if (u.e(object2) == null) return object2;
        this.p.a((o4)a13);
        if (ba.a((bo)this)) return object2;
        this.q.a((sq0)p42, (Object)this);
        this.m.a(this.e());
        super.c();
        return object2;
    }

    @Override
    public void a(int n10, @Nullable Bundle object) {
        ((Object)this.getClass()).toString();
        int n12 = op0.b;
        b8 b82 = null;
        Object object2 = null;
        if (n10 != 0) {
            if (n10 != 16) {
                if (n10 != 17) {
                    if (n10 != 2) {
                        if (n10 != 3) {
                            if (n10 != 4) {
                                if (n10 != 5) {
                                    super.a(n10, (Bundle)object);
                                }
                            } else {
                                this.p();
                            }
                        } else {
                            this.l.a(8);
                            this.b(8);
                        }
                    } else {
                        this.l.a(0);
                        this.b(0);
                    }
                } else {
                    object = this.s;
                    if (object != null) {
                        object.onAdClicked();
                    }
                }
            } else if (object != null) {
                b82 = object.getParcelable("impression_data_key");
                object = object2;
                if (b82 instanceof c4) {
                    object = (c4)b82;
                }
                this.a((c4)object);
            } else {
                this.a((c4)null);
            }
        } else {
            object2 = b82;
            if (object != null) {
                object = object.getSerializable("extra_tracking_parameters");
                object2 = b82;
                if (object instanceof Map) {
                    object2 = (Map)object;
                }
            }
            this.p.a(o4.f);
            this.r.a();
            this.q();
            object = this.o;
            b82 = this.d();
            object.getClass();
            if (b82 == null || b82.u() != wr.c) {
                this.a((Map<String, String>)object2);
            }
        }
    }

    public final void a(@Nullable c4 c43) {
        gd0 gd02 = this.s;
        if (gd02 != null) {
            gd02.a(c43);
        }
    }

    public final void a(@NotNull gd0 gd02) {
        this.s = gd02;
    }

    @Override
    protected final boolean a(int n10) {
        return true;
    }

    @Override
    protected final boolean k() {
        return true;
    }

    @Override
    public final boolean l() {
        return true;
    }

    @NotNull
    public final hs n() {
        Object object = this.n;
        Context context = this.e();
        u8 u82 = this.d();
        x2 x22 = this.k;
        String string2 = this.m.getAdInfo();
        object.getClass();
        String string3 = u82.o();
        object = string3;
        if (string3 == null) {
            string3 = x22.c();
            object = string3;
            if (string3 == null) {
                object = "";
            }
        }
        string3 = u82.N();
        int n10 = string3.getWidth();
        u82 = null;
        if (n10 == 0 || string3.getHeight() == 0) {
            string3 = null;
        }
        if (string3 != null) {
            u82 = new u8(string3.c(context), string3.a(context));
        }
        return new hs((String)object, u82, string2);
    }

    @NotNull
    protected abstract T o();

    public final void onLeftApplication() {
        gd0 gd02 = this.s;
        if (gd02 != null) {
            gd02.onAdClicked();
        }
    }

    public final void onReturnedToApplication() {
    }

    public final void p() {
        this.h();
        this.q.a(sq0.c, (Object)this);
        gd0 gd02 = this.s;
        if (gd02 != null) {
            gd02.onAdDismissed();
        }
    }

    public final void q() {
        gd0 gd02 = this.s;
        if (gd02 != null) {
            gd02.onAdShown();
        }
    }
}

