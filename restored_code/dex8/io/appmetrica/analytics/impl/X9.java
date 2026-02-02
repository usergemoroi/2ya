/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.Ib;
import io.appmetrica.analytics.impl.Il;
import io.appmetrica.analytics.impl.Ni;
import io.appmetrica.analytics.impl.Nl;
import io.appmetrica.analytics.impl.O4;
import io.appmetrica.analytics.impl.Oa;
import io.appmetrica.analytics.impl.Pf;
import io.appmetrica.analytics.impl.Qf;
import io.appmetrica.analytics.impl.R6;
import io.appmetrica.analytics.impl.Zf;
import io.appmetrica.analytics.impl.ao;
import io.appmetrica.analytics.impl.bo;
import io.appmetrica.analytics.impl.ch;
import io.appmetrica.analytics.impl.ea;
import io.appmetrica.analytics.impl.h;
import io.appmetrica.analytics.impl.jh;
import io.appmetrica.analytics.impl.ng;
import io.appmetrica.analytics.impl.v5;
import io.appmetrica.analytics.impl.v9;
import io.appmetrica.analytics.impl.w9;
import java.util.HashMap;
import java.util.LinkedList;

public final class x9
extends Zf {
    public final Ni a;
    public final HashMap b;
    public final O4 c;

    public x9(v5 object) {
        this.a = object = new Ni((v5)object);
        this.c = new O4((Ni)object);
        this.b = this.a();
    }

    @VisibleForTesting
    public final Oa a(Bb bb4) {
        return (Oa)this.b.get((Object)bb4);
    }

    @Override
    public final w9 a(int n10) {
        LinkedList<Object> linkedList = new LinkedList<Object>();
        Object object = Bb.a(n10);
        O4 o44 = this.c;
        if (o44 != null) {
            o44.a((Bb)((Object)object), linkedList);
        }
        if ((object = (Oa)this.b.get(object)) != null) {
            ((Oa)object).a(linkedList);
        }
        return new v9(linkedList);
    }

    public final HashMap a() {
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        hashMap.put((Object)Bb.z, new h(this.a));
        hashMap.put((Object)Bb.B, new Nl(this.a));
        hashMap.put((Object)Bb.e, new ch(this.a));
        Ib ib4 = new Ib(this.a);
        hashMap.put((Object)Bb.u, ib4);
        hashMap.put((Object)Bb.v, ib4);
        hashMap.put((Object)Bb.o, ib4);
        hashMap.put((Object)Bb.C, ib4);
        Object object = Bb.D;
        Object object2 = this.a;
        hashMap.put(object, new Il((Ni)object2, object2.t));
        hashMap.put((Object)Bb.E, new jh(this.a));
        hashMap.put((Object)Bb.n, new ng(this.a));
        hashMap.put((Object)Bb.w, new R6(this.a));
        hashMap.put((Object)Bb.x, new Pf(this.a));
        hashMap.put((Object)Bb.r, new bo(this.a));
        hashMap.put((Object)Bb.s, new Qf(this.a));
        object = new ao(this.a);
        hashMap.put((Object)Bb.t, object);
        hashMap.put((Object)Bb.y, ib4);
        object = Bb.p;
        object2 = this.a;
        hashMap.put(object, new Il((Ni)object2, object2.e));
        object2 = Bb.q;
        object = this.a;
        hashMap.put(object2, new Il((Ni)object, ((Ni)object).f));
        hashMap.put((Object)Bb.i, ib4);
        object = Bb.j;
        object2 = this.a;
        hashMap.put(object, new Il((Ni)object2, object2.k));
        hashMap.put((Object)Bb.k, ib4);
        hashMap.put((Object)Bb.l, ib4);
        hashMap.put((Object)Bb.I, ib4);
        hashMap.put((Object)Bb.m, ib4);
        hashMap.put((Object)Bb.J, ib4);
        hashMap.put((Object)Bb.h, new ea(this.a));
        return hashMap;
    }

    public final void a(Bb bb4, Oa oa4) {
        this.b.put(bb4, oa4);
    }

    public final Ni b() {
        return this.a;
    }
}

