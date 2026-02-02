/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.impl.C3;
import io.appmetrica.analytics.impl.J4;
import io.appmetrica.analytics.impl.Mm;
import io.appmetrica.analytics.impl.Re;
import io.appmetrica.analytics.impl.ba;
import io.appmetrica.analytics.impl.sm;
import io.appmetrica.analytics.impl.t2;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.List;
import java.util.Map;

public final class om {
    public final Mm A;
    public final Map B;
    public final ba C;
    public final String a;
    public final String b;
    public final sm c;
    public final String d;
    public final List e;
    public final List f;
    public final List g;
    public final Map h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final J4 n;
    public final long o;
    public final boolean p;
    public final boolean q;
    public final String r;
    public final Re s;
    public final RetryPolicyConfig t;
    public final long u;
    public final long v;
    public final boolean w;
    public final BillingConfig x;
    public final C3 y;
    public final t2 z;

    public om(String string2, String string3, sm sm3) {
        this.a = string2;
        this.b = string3;
        this.c = sm3;
        this.d = sm3.a;
        this.e = sm3.b;
        this.f = sm3.f;
        this.g = sm3.g;
        this.h = sm3.i;
        this.i = sm3.c;
        this.j = sm3.d;
        this.k = sm3.j;
        this.l = sm3.k;
        this.m = sm3.l;
        this.n = sm3.m;
        this.o = sm3.n;
        this.p = sm3.o;
        this.q = sm3.p;
        this.r = sm3.q;
        this.s = sm3.s;
        this.t = sm3.t;
        this.u = sm3.u;
        this.v = sm3.v;
        this.w = sm3.w;
        this.x = sm3.x;
        this.y = sm3.y;
        this.z = sm3.z;
        this.A = sm3.A;
        this.B = sm3.B;
        this.C = sm3.C;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final long c() {
        return this.v;
    }

    public final long d() {
        return this.u;
    }

    public final String e() {
        return this.d;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StartupState(deviceId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", deviceIdHash=");
        stringBuilder.append(this.b);
        stringBuilder.append(", startupStateModel=");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

