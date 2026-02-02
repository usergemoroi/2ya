/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.screenshot.impl.G;
import io.appmetrica.analytics.screenshot.impl.T;
import io.appmetrica.analytics.screenshot.impl.h0;

public final class g0 {
    public final boolean a;
    public final h0 b;

    public g0() {
        this(new G());
    }

    public g0(G object) {
        boolean bl2 = ((G)object).b();
        object = (object = ((G)object).a()) != null ? new h0((T)object) : null;
        this(bl2, (h0)object);
    }

    public g0(boolean bl2, h0 h03) {
        this.a = bl2;
        this.b = h03;
    }

    public final h0 a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ServiceSideRemoteScreenshotConfig(enabled=");
        stringBuilder.append(this.a);
        stringBuilder.append(", config=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

