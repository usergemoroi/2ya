/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import kotlin.jvm.internal.y;

public final class i {
    public final LocationFilter a;
    public final CacheArguments b;

    public /* synthetic */ i() {
        this(new LocationFilter(0L, 0.0f, 3, null), new CacheArguments(0L, 0L, 3, null));
    }

    public i(LocationFilter locationFilter, CacheArguments cacheArguments) {
        this.a = locationFilter;
        this.b = cacheArguments;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        Class<?> clazz = object != null ? object.getClass() : null;
        if (!y.e(i.class, clazz)) {
            return false;
        }
        if (object != null) {
            object = (i)object;
            if (!y.e(this.a, ((i)object).a)) {
                return false;
            }
            return y.e(this.b, ((i)object).b);
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.location.impl.LocationConfig");
    }

    public final int hashCode() {
        int n10 = this.a.hashCode();
        return this.b.hashCode() + n10 * 31;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LocationConfig(locationFilter=");
        stringBuilder.append(this.a);
        stringBuilder.append(", cacheArguments=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

