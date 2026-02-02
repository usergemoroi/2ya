/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.impl.Co;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Zm;
import io.appmetrica.analytics.impl.sm;

public final class nm {
    public final ProtobufStateStorage a;
    public final Co b;

    public nm(Context context) {
        this(Zm.a(sm.class).a(context), Na.j().B().a());
    }

    public nm(ProtobufStateStorage protobufStateStorage, Co co3) {
        this.a = protobufStateStorage;
        this.b = co3;
    }
}

