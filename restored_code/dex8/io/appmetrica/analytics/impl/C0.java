/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.impl.Dn;
import io.appmetrica.analytics.impl.G6;
import io.appmetrica.analytics.impl.V;
import io.appmetrica.analytics.impl.b0;
import io.appmetrica.analytics.impl.r6;

public final class c0
implements ProtobufConverter {
    public final V a;
    public final G6 b;

    public c0() {
        this(new V(new Dn()), new G6());
    }

    public c0(V v14, G6 g63) {
        this.a = v14;
        this.b = g63;
    }

    @NonNull
    public final b0 a(@NonNull r6 r64) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final r6 a(@NonNull b0 b04) {
        r6 r64 = new r6();
        r64.a = this.a.a(b04.a);
        String string2 = b04.b;
        if (string2 != null) {
            r64.b = string2;
        }
        r64.c = this.b.a(b04.c);
        return r64;
    }

    @Override
    @NonNull
    public final Object toModel(@NonNull Object object) {
        object = (r6)object;
        throw new UnsupportedOperationException();
    }
}

