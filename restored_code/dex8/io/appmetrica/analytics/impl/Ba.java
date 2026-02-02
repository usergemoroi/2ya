/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.collection.a
 */
package io.appmetrica.analytics.impl;

import androidx.collection.a;

public final class ba {
    public final long a;

    public ba(long l10) {
        this.a = l10;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ba)) {
            return false;
        }
        object = (ba)object;
        return this.a == ((ba)object).a;
    }

    public final int hashCode() {
        return androidx.collection.a.a((long)this.a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ExternalAttributionConfig(collectingInterval=");
        stringBuilder.append(this.a);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

