/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Da;
import io.appmetrica.analytics.impl.E9;
import io.appmetrica.analytics.impl.G6;
import io.appmetrica.analytics.impl.Gh;
import io.appmetrica.analytics.impl.I7;
import io.appmetrica.analytics.impl.Ia;
import io.appmetrica.analytics.impl.Ja;
import io.appmetrica.analytics.impl.Ka;
import io.appmetrica.analytics.impl.Sd;
import io.appmetrica.analytics.impl.T9;
import io.appmetrica.analytics.impl.W8;
import io.appmetrica.analytics.impl.hn;
import io.appmetrica.analytics.impl.l9;
import io.appmetrica.analytics.impl.mj;
import io.appmetrica.analytics.impl.na;
import io.appmetrica.analytics.impl.nj;
import io.appmetrica.analytics.impl.pe;
import io.appmetrica.analytics.impl.t9;
import io.appmetrica.analytics.impl.vc;
import io.appmetrica.analytics.impl.xe;
import io.appmetrica.analytics.impl.z9;
import io.appmetrica.analytics.impl.zo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class u9 {
    public static final Map h;
    public static final u9 i;
    public final Sd a;
    public final zo b;
    public final W8 c;
    public final T9 d;
    public final vc e;
    public final pe f;
    public final na g;

    static {
        HashMap<Da, Integer> hashMap = new HashMap<Da, Integer>();
        hashMap.put(Da.c, 1);
        hashMap.put(Da.d, 0);
        hashMap.put(Da.b, -1);
        h = Collections.unmodifiableMap(hashMap);
        i = new u9(new nj(), new hn(), new xe(), new mj(), new Ja(), new Ka(), new Ia());
    }

    public u9(Sd sd3, zo zo3, W8 w84, T9 t92, vc vc3, pe pe3, na na4) {
        this.a = sd3;
        this.b = zo3;
        this.c = w84;
        this.d = t92;
        this.e = vc3;
        this.f = pe3;
        this.g = na4;
    }

    public u9(t9 t92) {
        this(t9.f(t92), t9.g(t92), t9.a(t92), t9.b(t92), t9.c(t92), t9.d(t92), t9.e(t92));
    }

    public static /* synthetic */ Sd a(u9 u94) {
        return u94.a;
    }

    public static t9 a() {
        return new t9(i);
    }

    public static /* synthetic */ zo b(u9 u94) {
        return u94.b;
    }

    public static /* synthetic */ W8 c(u9 u94) {
        return u94.c;
    }

    public static /* synthetic */ T9 d(u9 u94) {
        return u94.d;
    }

    public static /* synthetic */ vc e(u9 u94) {
        return u94.e;
    }

    public static /* synthetic */ pe f(u9 u94) {
        return u94.f;
    }

    public static /* synthetic */ na g(u9 u94) {
        return u94.g;
    }

    public final E9 a(l9 object, Gh object2) {
        E9 e94 = new E9();
        Object object3 = this.f.a(((l9)object).l, ((l9)object).m);
        z9 z94 = this.e.a(((l9)object).g);
        if (object3 != null) {
            e94.g = object3;
        }
        if (z94 != null) {
            e94.f = z94;
        }
        if ((object3 = this.a.a(((l9)object).a)) != null) {
            e94.d = object3;
        }
        e94.e = this.b.a((l9)object, (Gh)object2);
        object2 = ((l9)object).j;
        if (object2 != null) {
            e94.h = object2;
        }
        if ((object2 = this.d.a((l9)object)) != null) {
            e94.c = (Integer)object2;
        }
        if ((object2 = ((l9)object).c) != null) {
            e94.a = (Long)object2;
        }
        if ((object2 = ((l9)object).d) != null) {
            e94.n = (Long)object2;
        }
        if ((object2 = ((l9)object).e) != null) {
            e94.o = (Long)object2;
        }
        if ((object2 = ((l9)object).f) != null) {
            e94.b = (Long)object2;
        }
        if ((object2 = ((l9)object).k) != null) {
            e94.i = (Integer)object2;
        }
        e94.j = this.c.a(((l9)object).o);
        object2 = ((l9)object).g;
        int n10 = object2 != null ? new G6().a(((I7)object2).a) : -1;
        e94.k = n10;
        object2 = ((l9)object).n;
        if (object2 != null) {
            e94.l = ((String)object2).getBytes();
        }
        if ((object2 = (object2 = ((l9)object).p) != null ? (Integer)h.get(object2) : null) != null) {
            e94.m = (Integer)object2;
        }
        if ((object2 = ((l9)object).q) != null) {
            n10 = ((Enum)object2).ordinal();
            if (n10 != 0) {
                if (n10 != 1) {
                    if (n10 == 2) {
                        e94.p = 2;
                    }
                } else {
                    e94.p = 1;
                }
            } else {
                e94.p = 0;
            }
        }
        if ((object2 = ((l9)object).r) != null) {
            e94.q = (Boolean)object2;
        }
        if ((object2 = ((l9)object).s) != null) {
            e94.r = ((Integer)object2).intValue();
        }
        object2 = this.g;
        object = ((l9)object).t;
        e94.s = ((Ia)object2).a((byte[])object);
        return e94;
    }
}

