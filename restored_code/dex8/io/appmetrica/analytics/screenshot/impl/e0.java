/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.screenshot.impl.e;

public final class e0 {
    public final boolean a;

    public e0(e e11) {
        this(e11.a());
    }

    public e0(boolean bl2) {
        this.a = bl2;
    }

    public final boolean a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ServiceSideApiCaptorConfig(enabled=");
        stringBuilder.append(this.a);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

