/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

public final class ig
implements ProtobufStateStorage {
    public final String a;
    public final IBinaryDataHelper b;
    public final ProtobufStateSerializer c;
    public final ProtobufConverter d;

    public ig(@NonNull String string2, @NonNull IBinaryDataHelper iBinaryDataHelper, @NonNull ProtobufStateSerializer<MessageNano> protobufStateSerializer, @NonNull ProtobufConverter<Object, MessageNano> protobufConverter) {
        this.a = string2;
        this.b = iBinaryDataHelper;
        this.c = protobufStateSerializer;
        this.d = protobufConverter;
    }

    @Override
    public final void delete() {
        this.b.remove(this.a);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @NonNull
    public final Object read() {
        byte[] byArray;
        try {
            byArray = this.b.get(this.a);
            if (byArray == null) return this.d.toModel((MessageNano)this.c.defaultValue());
        }
        catch (Throwable throwable) {
            return this.d.toModel((MessageNano)this.c.defaultValue());
        }
        if (byArray.length != 0) return this.d.toModel((MessageNano)this.c.toState(byArray));
        return this.d.toModel((MessageNano)this.c.defaultValue());
    }

    public final void save(@NonNull Object object) {
        this.b.insert(this.a, this.c.toByteArray((MessageNano)this.d.fromModel(object)));
    }
}

