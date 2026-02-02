/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.T2;
import io.appmetrica.analytics.impl.U9;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

public final class o9
extends T2 {
    @NonNull
    public final U9 a(@NonNull byte[] byArray) throws IOException {
        return MessageNano.mergeFrom(new U9(), byArray);
    }

    @Override
    @NonNull
    public final MessageNano a() {
        return new U9();
    }

    @NonNull
    public final U9 b() {
        return new U9();
    }

    @Override
    @NonNull
    public final Object defaultValue() {
        return new U9();
    }
}

