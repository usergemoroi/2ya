/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.remotepermissions.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.remotepermissions.impl.a;
import io.appmetrica.analytics.remotepermissions.impl.c;
import io.appmetrica.analytics.remotepermissions.impl.f;
import org.jetbrains.annotations.NotNull;

public final class b
implements Converter {
    public final c a = new c();

    @NotNull
    public final a a(@NotNull byte[] byArray) {
        return this.a.a(MessageNano.mergeFrom(new f(), byArray));
    }

    @NotNull
    public final byte[] a(@NotNull a a14) {
        return MessageNano.toByteArray(this.a.a(a14));
    }

    public final Object fromModel(Object object) {
        object = (a)object;
        return MessageNano.toByteArray(this.a.a((a)object));
    }
}

