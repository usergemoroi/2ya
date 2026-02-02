/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import java.util.List;

public final class k0 {
    public final List a;
    public final boolean b;

    public k0(List list, boolean bl2) {
        this.a = list;
        this.b = bl2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AppMetricaConfigExtension(autoCollectedDataSubscribers=");
        stringBuilder.append(this.a);
        stringBuilder.append(", needClearEnvironment=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

