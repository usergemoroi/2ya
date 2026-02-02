/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.remotepermissions.impl;

import java.util.Set;

public final class a {
    public final Set a;

    public a(Set set) {
        this.a = set;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FeatureConfig(permittedPermissions=");
        stringBuilder.append(this.a);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

