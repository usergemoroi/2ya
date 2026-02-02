/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.C6;
import io.appmetrica.analytics.impl.Jb;
import io.appmetrica.analytics.impl.M4;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.Nb;
import io.appmetrica.analytics.impl.W9;
import io.appmetrica.analytics.impl.im;
import io.appmetrica.analytics.impl.jl;
import io.appmetrica.analytics.impl.l4;
import io.appmetrica.analytics.impl.o4;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.oh;
import io.appmetrica.analytics.impl.pq;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;
import java.util.Set;

public final class qh {
    public final Context a;
    public final jl b;
    public final Nb c;
    public final N4 d;
    public final Consumer e;

    public qh(Context context, C6 c64, Bb bb4, jl jl2) {
        this.a = context;
        this.b = jl2;
        this.c = new Nb();
        this.d = new N4(new im(), new M4(), null);
        this.e = new pq(bb4, c64, this);
    }

    public static final void a(Bb object, C6 c64, qh object2, Jb object3) {
        Object object4 = ((Jb)object3).h;
        o4 o44 = new o4((String)object4, ((Jb)object3).e, ((Jb)object3).f, ((Jb)object3).g, ((Jb)object3).i);
        String string2 = ((Jb)object3).b;
        byte[] byArray = ((Jb)object3).a;
        int n10 = ((Jb)object3).c;
        HashMap hashMap = ((Jb)object3).d;
        object3 = ((Jb)object3).j;
        object4 = LoggerStorage.getOrCreatePublicLogger((String)object4);
        Set set = W9.a;
        object = new l4(byArray, string2, object.a, (PublicLogger)object4);
        ((l4)object).q = hashMap;
        ((o6)object).g = n10;
        ((o6)object).c = object3;
        object2 = ((qh)object2).d;
        ((oh)c64).a(o44, (o6)object, (N4)object2);
    }
}

