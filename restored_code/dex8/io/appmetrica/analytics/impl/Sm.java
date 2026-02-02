/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.C3;
import io.appmetrica.analytics.impl.Gm;
import io.appmetrica.analytics.impl.J4;
import io.appmetrica.analytics.impl.Mm;
import io.appmetrica.analytics.impl.Qm;
import io.appmetrica.analytics.impl.Re;
import io.appmetrica.analytics.impl.ba;
import io.appmetrica.analytics.impl.g8;
import io.appmetrica.analytics.impl.rm;
import io.appmetrica.analytics.impl.t2;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class sm {
    public final Mm A;
    public final Map B;
    public final ba C;
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final List h;
    public final Map i;
    public final String j;
    public final String k;
    public final String l;
    public final J4 m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final String q;
    public final Qm r;
    public final Re s;
    public final RetryPolicyConfig t;
    public final long u;
    public final long v;
    public final boolean w;
    public final BillingConfig x;
    public final C3 y;
    public final t2 z;

    public sm(rm rm3) {
        this.a = rm3.a;
        Object object = rm3.b;
        Object var3_3 = null;
        object = object == null ? null : CollectionUtils.unmodifiableListCopy(object);
        this.b = object;
        this.c = rm3.c;
        this.d = rm3.d;
        this.e = rm3.e;
        object = rm3.f;
        object = object == null ? null : CollectionUtils.unmodifiableListCopy(object);
        this.f = object;
        object = rm3.g;
        object = object == null ? null : CollectionUtils.unmodifiableListCopy(object);
        this.g = object;
        object = rm3.h;
        object = object == null ? null : CollectionUtils.unmodifiableListCopy(object);
        this.h = object;
        object = rm3.i;
        object = object == null ? var3_3 : CollectionUtils.unmodifiableMapCopy(object);
        this.i = object;
        this.j = rm3.j;
        this.k = rm3.k;
        this.m = rm3.m;
        this.s = rm3.n;
        this.n = rm3.o;
        this.o = rm3.p;
        this.l = rm3.l;
        this.p = rm3.q;
        this.q = rm.a(rm3);
        this.r = rm3.s;
        this.u = rm.b(rm3);
        this.v = rm.c(rm3);
        this.w = rm3.v;
        object = rm3.w;
        if (object == null) {
            object = new Gm();
            this.t = new RetryPolicyConfig(((Gm)object).w, ((Gm)object).x);
        } else {
            this.t = object;
        }
        this.x = rm3.x;
        this.y = rm3.y;
        this.z = rm3.z;
        object = rm.d(rm3) == null ? new Mm(g8.b.a) : rm.d(rm3);
        this.A = object;
        object = rm.e(rm3) == null ? Collections.emptyMap() : rm.e(rm3);
        this.B = object;
        this.C = rm.f(rm3);
    }

    public final rm a(J4 object) {
        object = new rm((J4)object);
        ((rm)object).a = this.a;
        ((rm)object).f = this.f;
        ((rm)object).g = this.g;
        ((rm)object).j = this.j;
        ((rm)object).b = this.b;
        ((rm)object).c = this.c;
        ((rm)object).d = this.d;
        ((rm)object).e = this.e;
        ((rm)object).h = this.h;
        ((rm)object).i = this.i;
        ((rm)object).k = this.k;
        ((rm)object).l = this.l;
        ((rm)object).q = this.p;
        ((rm)object).o = this.n;
        ((rm)object).p = this.o;
        ((rm)object).r = this.q;
        ((rm)object).n = this.s;
        ((rm)object).t = this.u;
        ((rm)object).u = this.v;
        ((rm)object).s = this.r;
        ((rm)object).v = this.w;
        ((rm)object).w = this.t;
        ((rm)object).y = this.y;
        ((rm)object).x = this.x;
        ((rm)object).z = this.z;
        ((rm)object).A = this.A;
        ((rm)object).B = this.B;
        ((rm)object).C = this.C;
        return object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StartupStateModel{uuid='");
        stringBuilder.append(this.a);
        stringBuilder.append("', reportUrls=");
        stringBuilder.append(this.b);
        stringBuilder.append(", getAdUrl='");
        stringBuilder.append(this.c);
        stringBuilder.append("', reportAdUrl='");
        stringBuilder.append(this.d);
        stringBuilder.append("', certificateUrl='");
        stringBuilder.append(this.e);
        stringBuilder.append("', hostUrlsFromStartup=");
        stringBuilder.append(this.f);
        stringBuilder.append(", hostUrlsFromClient=");
        stringBuilder.append(this.g);
        stringBuilder.append(", diagnosticUrls=");
        stringBuilder.append(this.h);
        stringBuilder.append(", customSdkHosts=");
        stringBuilder.append(this.i);
        stringBuilder.append(", encodedClidsFromResponse='");
        stringBuilder.append(this.j);
        stringBuilder.append("', lastClientClidsForStartupRequest='");
        stringBuilder.append(this.k);
        stringBuilder.append("', lastChosenForRequestClids='");
        stringBuilder.append(this.l);
        stringBuilder.append("', collectingFlags=");
        stringBuilder.append(this.m);
        stringBuilder.append(", obtainTime=");
        stringBuilder.append(this.n);
        stringBuilder.append(", hadFirstStartup=");
        stringBuilder.append(this.o);
        stringBuilder.append(", startupDidNotOverrideClids=");
        stringBuilder.append(this.p);
        stringBuilder.append(", countryInit='");
        stringBuilder.append(this.q);
        stringBuilder.append("', statSending=");
        stringBuilder.append(this.r);
        stringBuilder.append(", permissionsCollectingConfig=");
        stringBuilder.append(this.s);
        stringBuilder.append(", retryPolicyConfig=");
        stringBuilder.append(this.t);
        stringBuilder.append(", obtainServerTime=");
        stringBuilder.append(this.u);
        stringBuilder.append(", firstStartupServerTime=");
        stringBuilder.append(this.v);
        stringBuilder.append(", outdated=");
        stringBuilder.append(this.w);
        stringBuilder.append(", autoInappCollectingConfig=");
        stringBuilder.append(this.x);
        stringBuilder.append(", cacheControl=");
        stringBuilder.append(this.y);
        stringBuilder.append(", attributionConfig=");
        stringBuilder.append(this.z);
        stringBuilder.append(", startupUpdateConfig=");
        stringBuilder.append(this.A);
        stringBuilder.append(", modulesRemoteConfigs=");
        stringBuilder.append(this.B);
        stringBuilder.append(", externalAttributionConfig=");
        stringBuilder.append(this.C);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

