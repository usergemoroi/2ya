/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.A3;
import io.appmetrica.analytics.impl.E8;
import io.appmetrica.analytics.impl.K3;
import io.appmetrica.analytics.impl.K8;
import io.appmetrica.analytics.impl.L8;
import io.appmetrica.analytics.impl.M8;
import io.appmetrica.analytics.impl.Me;
import io.appmetrica.analytics.impl.N8;
import io.appmetrica.analytics.impl.Rf;
import io.appmetrica.analytics.impl.Sa;
import io.appmetrica.analytics.impl.Sn;
import io.appmetrica.analytics.impl.Tf;
import io.appmetrica.analytics.impl.Zi;
import io.appmetrica.analytics.impl.dg;
import io.appmetrica.analytics.impl.eg;
import io.appmetrica.analytics.impl.z3;
import java.util.List;
import java.util.Map;

public final class ag
implements Converter {
    public final Me a;
    public final Rf b;
    public final K3 c;
    public final eg d;
    public final Sa e;
    public final Sa f;

    public ag() {
        this(new Me(), new Rf(), new K3(), new eg(), new Sa(100), new Sa(1000));
    }

    public ag(Me me2, Rf rf3, K3 k32, eg eg3, Sa sa2, Sa sa4) {
        this.a = me2;
        this.b = rf3;
        this.c = k32;
        this.d = eg3;
        this.e = sa2;
        this.f = sa4;
    }

    @NonNull
    public final Zi a(@NonNull dg object) {
        M8 m82 = new M8();
        Sn sn3 = this.e.a(((dg)object).a);
        m82.a = StringUtils.getUTF8Bytes((String)sn3.a);
        Sn sn4 = this.f.a(((dg)object).b);
        m82.b = StringUtils.getUTF8Bytes((String)sn4.a);
        Object object2 = ((dg)object).c;
        Object var6_6 = null;
        if (object2 != null) {
            object2 = this.c.a((List<String>)object2);
            m82.c = (E8)((Zi)object2).a;
        } else {
            object2 = null;
        }
        Object object3 = ((dg)object).d;
        if (object3 != null) {
            object3 = this.a.a((Map<String, String>)object3);
            m82.d = (K8)((Zi)object3).a;
        } else {
            object3 = null;
        }
        Object object4 = ((dg)object).e;
        if (object4 != null) {
            object4 = this.b.a((Tf)object4);
            m82.e = (L8)((Zi)object4).a;
        } else {
            object4 = null;
        }
        Object object5 = ((dg)object).f;
        if (object5 != null) {
            object5 = this.b.a((Tf)object5);
            m82.f = (L8)((Zi)object5).a;
        } else {
            object5 = null;
        }
        List list = ((dg)object).g;
        object = var6_6;
        if (list != null) {
            object = this.d.a(list);
            m82.g = (N8[])((Zi)object).a;
        }
        return new Zi(m82, new z3(z3.b(new A3[]{sn3, sn4, object2, object3, object4, object5, object})));
    }

    @NonNull
    public final dg a(@NonNull Zi zi3) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final Object toModel(@NonNull Object object) {
        object = (Zi)object;
        throw new UnsupportedOperationException();
    }
}

