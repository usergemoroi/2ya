/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.List;

public final class t2 {
    public final List a;

    public t2(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AttributionConfig{deeplinkConditions=");
        stringBuilder.append(this.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

