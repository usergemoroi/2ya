/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.T2;
import io.appmetrica.analytics.impl.f2;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

public final class g2
extends T2 {
    @NonNull
    public final f2 a(@NonNull byte[] byArray) throws IOException {
        return MessageNano.mergeFrom(new f2(), byArray);
    }

    @Override
    @NonNull
    public final MessageNano a() {
        return new f2();
    }

    @NonNull
    public final f2 b() {
        return new f2();
    }

    @Override
    @NonNull
    public final Object defaultValue() {
        return new f2();
    }
}

