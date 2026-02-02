/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.screenshot.impl.X;

public final class i0 {
    public final boolean a;
    public final long b;

    public i0(X x10) {
        this(x10.b(), x10.a());
    }

    public i0(boolean bl2, long l10) {
        this.a = bl2;
        this.b = l10;
    }

    public final long a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ServiceSideServiceCaptorConfig(enabled=");
        stringBuilder.append(this.a);
        stringBuilder.append(", delaySeconds=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

