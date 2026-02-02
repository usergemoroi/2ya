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
import io.appmetrica.analytics.impl.Cg;
import io.appmetrica.analytics.impl.M8;
import io.appmetrica.analytics.impl.O8;
import io.appmetrica.analytics.impl.R8;
import io.appmetrica.analytics.impl.T8;
import io.appmetrica.analytics.impl.Tg;
import io.appmetrica.analytics.impl.Zi;
import io.appmetrica.analytics.impl.ag;
import io.appmetrica.analytics.impl.ml;
import io.appmetrica.analytics.impl.z3;
import java.util.Collections;
import java.util.List;

public final class nl
implements A8 {
    public final ag a;
    public final Cg b;

    public nl() {
        this(new ag(), new Cg());
    }

    public nl(ag ag2, Cg cg3) {
        this.a = ag2;
        this.b = cg3;
    }

    @NonNull
    public final ml a(@NonNull List<Zi> list) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final List<Zi> a(@NonNull ml object) {
        T8 t82 = new T8();
        t82.a = 3;
        t82.d = new R8();
        Zi zi3 = this.a.a(((ml)object).a);
        t82.d.a = (M8)zi3.a;
        object = ((ml)object).b;
        if (object != null) {
            object = this.b.a((Tg)object);
            t82.d.b = (O8)((Zi)object).a;
        } else {
            object = null;
        }
        return Collections.singletonList(new Zi(t82, new z3(z3.b(new A3[]{zi3, object}))));
    }

    @NonNull
    public final Object toModel(@NonNull Object object) {
        object = (List)object;
        throw new UnsupportedOperationException();
    }
}

