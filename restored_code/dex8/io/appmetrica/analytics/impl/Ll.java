/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.A3;
import io.appmetrica.analytics.impl.A8;
import io.appmetrica.analytics.impl.M8;
import io.appmetrica.analytics.impl.P8;
import io.appmetrica.analytics.impl.Q8;
import io.appmetrica.analytics.impl.T8;
import io.appmetrica.analytics.impl.Zi;
import io.appmetrica.analytics.impl.ag;
import io.appmetrica.analytics.impl.kl;
import io.appmetrica.analytics.impl.uj;
import io.appmetrica.analytics.impl.z3;
import java.util.Collections;
import java.util.List;

public final class ll
implements A8 {
    public final uj a;
    public final ag b;

    public ll() {
        this(new uj(), new ag());
    }

    public ll(uj uj3, ag ag2) {
        this.a = uj3;
        this.b = ag2;
    }

    @NonNull
    public final kl a(@NonNull List<Zi> list) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final List<Zi> a(@NonNull kl object) {
        T8 t82 = new T8();
        t82.a = 2;
        t82.c = new Q8();
        Zi zi3 = this.a.a(((kl)object).b);
        t82.c.b = (P8)zi3.a;
        object = this.b.a(((kl)object).a);
        t82.c.a = (M8)((Zi)object).a;
        return Collections.singletonList(new Zi(t82, new z3(z3.b(new A3[]{zi3, object}))));
    }

    @NonNull
    public final Object toModel(@NonNull Object object) {
        object = (List)object;
        throw new UnsupportedOperationException();
    }
}

