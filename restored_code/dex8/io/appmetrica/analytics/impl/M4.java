/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.w7;
import org.jetbrains.annotations.NotNull;

public final class m4
implements w7 {
    public final String a;
    public final String b;

    public m4() {
        this.a = "client.db";
        this.b = "metrica_client_data.db";
    }

    @Override
    @NotNull
    public final String a() {
        return this.b;
    }

    @Override
    @NotNull
    public final String b() {
        return this.a;
    }
}

