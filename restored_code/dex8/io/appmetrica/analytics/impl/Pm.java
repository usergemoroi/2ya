/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.impl.Am;
import io.appmetrica.analytics.impl.C3;
import io.appmetrica.analytics.impl.E3;
import io.appmetrica.analytics.impl.Em;
import io.appmetrica.analytics.impl.Fa;
import io.appmetrica.analytics.impl.Fm;
import io.appmetrica.analytics.impl.Gm;
import io.appmetrica.analytics.impl.Ld;
import io.appmetrica.analytics.impl.Mm;
import io.appmetrica.analytics.impl.Nm;
import io.appmetrica.analytics.impl.Qm;
import io.appmetrica.analytics.impl.Re;
import io.appmetrica.analytics.impl.Rm;
import io.appmetrica.analytics.impl.Se;
import io.appmetrica.analytics.impl.V6;
import io.appmetrica.analytics.impl.ba;
import io.appmetrica.analytics.impl.ca;
import io.appmetrica.analytics.impl.rm;
import io.appmetrica.analytics.impl.sm;
import io.appmetrica.analytics.impl.t2;
import io.appmetrica.analytics.impl.u2;
import io.appmetrica.analytics.impl.wm;
import io.appmetrica.analytics.impl.x2;
import io.appmetrica.analytics.impl.xm;
import io.appmetrica.analytics.impl.ym;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class pm
implements ProtobufConverter {
    public final Se a = new Se();
    public final Fa b = new Fa();
    public final Rm c = new Rm();
    public final x2 d = new x2();
    public final E3 e = new E3();
    public final u2 f = new u2();
    public final V6 g = new V6();
    public final Nm h = new Nm();
    public final Ld i = new Ld();
    public final ca j = new ca();

    @NonNull
    public final Gm a(@NonNull sm sm3) {
        Object object;
        Gm gm3 = new Gm();
        gm3.s = sm3.u;
        gm3.t = sm3.v;
        Object object2 = sm3.a;
        if (object2 != null) {
            gm3.a = object2;
        }
        if ((object2 = sm3.f) != null) {
            gm3.f = object2.toArray(new String[object2.size()]);
        }
        if ((object2 = sm3.g) != null) {
            gm3.g = object2.toArray(new String[object2.size()]);
        }
        if ((object2 = sm3.b) != null) {
            gm3.c = object2.toArray(new String[object2.size()]);
        }
        if ((object2 = sm3.h) != null) {
            gm3.o = object2.toArray(new String[object2.size()]);
        }
        if ((object2 = sm3.i) != null) {
            gm3.h = this.g.a((Map<String, ? extends List<String>>)object2);
        }
        if ((object2 = sm3.s) != null) {
            gm3.v = this.a.a((Re)object2);
        }
        if ((object2 = sm3.j) != null) {
            gm3.j = object2;
        }
        if ((object2 = sm3.c) != null) {
            gm3.d = object2;
        }
        if ((object2 = sm3.d) != null) {
            gm3.e = object2;
        }
        if ((object2 = sm3.e) != null) {
            gm3.r = object2;
        }
        gm3.i = this.b.a(sm3.m);
        object2 = sm3.k;
        if (object2 != null) {
            gm3.k = object2;
        }
        if ((object2 = sm3.l) != null) {
            gm3.l = object2;
        }
        gm3.m = sm3.p;
        gm3.b = sm3.n;
        gm3.q = sm3.o;
        object2 = sm3.t;
        gm3.w = ((RetryPolicyConfig)object2).maxIntervalSeconds;
        gm3.x = ((RetryPolicyConfig)object2).exponentialMultiplier;
        object2 = sm3.q;
        if (object2 != null) {
            gm3.n = object2;
        }
        if ((object2 = sm3.r) != null) {
            this.c.getClass();
            object = new Fm();
            ((Fm)object).a = ((Qm)object2).a;
            gm3.p = object;
        }
        gm3.u = sm3.w;
        object2 = sm3.x;
        if (object2 != null) {
            gm3.z = this.d.a((BillingConfig)object2);
        }
        if ((object = sm3.y) != null) {
            this.e.getClass();
            object2 = new ym();
            ((ym)object2).a = ((C3)object).a;
            gm3.y = object2;
        }
        if ((object2 = sm3.z) != null) {
            gm3.A = this.f.a((t2)object2);
        }
        gm3.B = this.h.a(sm3.A);
        gm3.C = this.i.a(sm3.B);
        gm3.D = this.j.a(sm3.C);
        return gm3;
    }

    @NonNull
    public final sm a(@NonNull Gm messageNano) {
        rm rm3 = new rm(this.b.a(messageNano.i));
        rm3.a = messageNano.a;
        rm3.j = messageNano.j;
        rm3.c = messageNano.d;
        rm3.b = Arrays.asList(messageNano.c);
        rm3.g = Arrays.asList(messageNano.g);
        rm3.f = Arrays.asList(messageNano.f);
        rm3.d = messageNano.e;
        rm3.e = messageNano.r;
        rm3.h = Arrays.asList(messageNano.o);
        rm3.k = messageNano.k;
        rm3.l = messageNano.l;
        rm3.q = messageNano.m;
        rm3.o = messageNano.b;
        rm3.p = messageNano.q;
        rm3.t = messageNano.s;
        rm3.u = messageNano.t;
        rm3.r = messageNano.n;
        rm3.v = messageNano.u;
        rm3.w = new RetryPolicyConfig(messageNano.w, messageNano.x);
        rm3.i = this.g.a(messageNano.h);
        MessageNano messageNano2 = messageNano.v;
        if (messageNano2 != null) {
            this.a.getClass();
            rm3.n = new Re(messageNano2.a, messageNano2.b);
        }
        if ((messageNano2 = messageNano.p) != null) {
            this.c.getClass();
            rm3.s = new Qm(((Fm)messageNano2).a);
        }
        if ((messageNano2 = messageNano.z) != null) {
            this.d.getClass();
            rm3.x = new BillingConfig(((xm)messageNano2).a, ((xm)messageNano2).b);
        }
        if ((messageNano2 = messageNano.y) != null) {
            this.e.getClass();
            rm3.y = new C3(((ym)messageNano2).a);
        }
        if ((messageNano2 = messageNano.A) != null) {
            rm3.z = this.f.a((wm)messageNano2);
        }
        if ((messageNano2 = messageNano.B) != null) {
            this.h.getClass();
            rm3.A = new Mm(((Em)messageNano2).a);
        }
        rm3.B = this.i.a(messageNano.C);
        messageNano = messageNano.D;
        if (messageNano != null) {
            this.j.getClass();
            rm3.C = new ba(((Am)messageNano).a);
        }
        return new sm(rm3);
    }
}

