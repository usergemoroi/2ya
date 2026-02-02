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
import io.appmetrica.analytics.impl.Me;
import io.appmetrica.analytics.impl.P8;
import io.appmetrica.analytics.impl.Sa;
import io.appmetrica.analytics.impl.Sn;
import io.appmetrica.analytics.impl.Zi;
import io.appmetrica.analytics.impl.yj;
import io.appmetrica.analytics.impl.z3;
import java.util.List;
import java.util.Map;

public final class uj
implements Converter {
    public final Me a;
    public final K3 b;
    public final Sa c;
    public final Sa d;

    public uj() {
        this(new Me(), new K3(), new Sa(100), new Sa(1000));
    }

    public uj(Me me2, K3 k32, Sa sa2, Sa sa4) {
        this.a = me2;
        this.b = k32;
        this.c = sa2;
        this.d = sa4;
    }

    @NonNull
    public final Zi a(@NonNull yj object) {
        P8 p84 = new P8();
        Sn sn3 = this.c.a(((yj)object).a);
        p84.a = StringUtils.getUTF8Bytes((String)sn3.a);
        Object object2 = ((yj)object).b;
        Object var3_5 = null;
        if (object2 != null) {
            object2 = this.b.a((List<String>)object2);
            p84.b = (E8)((Zi)object2).a;
        } else {
            object2 = null;
        }
        Sn sn4 = this.d.a(((yj)object).c);
        p84.c = StringUtils.getUTF8Bytes((String)sn4.a);
        Map map2 = ((yj)object).d;
        object = var3_5;
        if (map2 != null) {
            object = this.a.a(map2);
            p84.d = (K8)((Zi)object).a;
        }
        return new Zi(p84, new z3(z3.b(new A3[]{sn3, object2, sn4, object})));
    }

    @NonNull
    public final yj a(@NonNull Zi zi3) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final Object toModel(@NonNull Object object) {
        object = (Zi)object;
        throw new UnsupportedOperationException();
    }
}

