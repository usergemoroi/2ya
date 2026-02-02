/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.M2;
import java.util.List;

public final class b2 {
    public final List a;
    public final M2 b;
    public final List c;

    public b2(List list, M2 m24, List list2) {
        this.a = list;
        this.b = m24;
        this.c = list2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AppPermissionsState{mPermissionStateList=");
        stringBuilder.append(this.a);
        stringBuilder.append(", mBackgroundRestrictionsState=");
        stringBuilder.append(this.b);
        stringBuilder.append(", mAvailableProviders=");
        stringBuilder.append(this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

