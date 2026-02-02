/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.screenshot.impl.K;

public final class e {
    public final boolean a;

    public e() {
        this(new K().a);
    }

    public e(boolean bl2) {
        this.a = bl2;
    }

    public final boolean a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ApiCaptorConfig(enabled=");
        stringBuilder.append(this.a);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

