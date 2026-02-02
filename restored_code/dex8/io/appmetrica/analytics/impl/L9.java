/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 */
package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.Da;
import io.appmetrica.analytics.impl.E7;
import io.appmetrica.analytics.impl.F7;
import io.appmetrica.analytics.impl.I7;
import io.appmetrica.analytics.impl.M9;
import io.appmetrica.analytics.impl.g9;

public final class l9 {
    public final String a;
    public String b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final I7 g;
    public final Bb h;
    public final Integer i;
    public final String j;
    public final Integer k;
    public final Integer l;
    public final String m;
    public final String n;
    public final g9 o;
    public final Da p;
    public final M9 q;
    public final Boolean r;
    public final Integer s;
    public final byte[] t;

    public l9(ContentValues object) {
        E7 e74 = new F7(null, 1, null).a((ContentValues)object);
        this.a = e74.a().j();
        this.b = e74.a().p();
        this.c = e74.c();
        this.d = e74.b();
        this.e = e74.a().k();
        this.f = e74.d();
        this.g = e74.a().i();
        this.h = e74.e();
        this.i = e74.a().d();
        this.j = e74.a().f();
        this.k = e74.a().o();
        this.l = e74.a().c();
        this.m = e74.a().b();
        this.n = e74.a().m();
        Enum enum_ = e74.a().e();
        object = enum_;
        if (enum_ == null) {
            object = g9.a(null);
        }
        this.o = object;
        enum_ = e74.a().h();
        object = enum_;
        if (enum_ == null) {
            object = Da.a(null);
        }
        this.p = object;
        this.q = e74.a().n();
        this.r = e74.a().a();
        this.s = e74.a().l();
        this.t = e74.a().g();
    }
}

