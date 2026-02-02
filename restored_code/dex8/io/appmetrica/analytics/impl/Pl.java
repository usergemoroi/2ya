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
import io.appmetrica.analytics.impl.P8;
import io.appmetrica.analytics.impl.S8;
import io.appmetrica.analytics.impl.T8;
import io.appmetrica.analytics.impl.Zi;
import io.appmetrica.analytics.impl.ol;
import io.appmetrica.analytics.impl.uj;
import io.appmetrica.analytics.impl.z3;
import java.util.Collections;
import java.util.List;

public final class pl
implements A8 {
    public final uj a;

    public pl() {
        this(new uj());
    }

    public pl(uj uj3) {
        this.a = uj3;
    }

    @NonNull
    public final ol a(@NonNull List<Zi> list) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final List<Zi> a(@NonNull ol object) {
        T8 t82 = new T8();
        t82.a = 1;
        t82.b = new S8();
        object = this.a.a(((ol)object).a);
        t82.b.a = (P8)((Zi)object).a;
        z3 z33 = new z3(z3.b(new A3[]{object}));
        ((Zi)object).b.getBytesTruncated();
        return Collections.singletonList(new Zi(t82, z33));
    }

    @NonNull
    public final Object toModel(@NonNull Object object) {
        object = (List)object;
        throw new UnsupportedOperationException();
    }
}

