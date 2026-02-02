/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

public abstract class an {
    public final ProtobufStateStorage<Object> a(@NonNull Context context) {
        return this.a(context, this.c(context));
    }

    @NonNull
    public abstract ProtobufStateStorage<Object> a(@NonNull Context var1, @NonNull IBinaryDataHelper var2);

    public final ProtobufStateStorage<Object> b(@NonNull Context context) {
        return this.a(context, this.d(context));
    }

    @NonNull
    public abstract IBinaryDataHelper c(@NonNull Context var1);

    @NonNull
    public abstract IBinaryDataHelper d(@NonNull Context var1);
}

