/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.networktasks.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkTask;

public final class d {
    public final NetworkTask a;
    public final String b;

    public d(NetworkTask networkTask) {
        this.a = networkTask;
        this.b = networkTask.description();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && d.class == object.getClass()) {
            object = (d)object;
            return this.b.equals(((d)object).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}

