/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.collection.a
 */
package io.appmetrica.analytics.locationapi.internal;

import androidx.collection.a;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2={"Lio/appmetrica/analytics/locationapi/internal/LocationFilter;", "", "", "toString", "other", "", "equals", "", "hashCode", "", "a", "J", "getUpdateTimeInterval", "()J", "updateTimeInterval", "", "b", "F", "getUpdateDistanceInterval", "()F", "updateDistanceInterval", "<init>", "(JF)V", "location-api_release"}, k=1, mv={1, 6, 0})
public final class LocationFilter {
    private final long a;
    private final float b;

    public LocationFilter() {
        this(0L, 0.0f, 3, null);
    }

    public LocationFilter(long l10, float f11) {
        this.a = l10;
        this.b = f11;
    }

    public /* synthetic */ LocationFilter(long l10, float f11, int n10, p p14) {
        if ((n10 & 1) != 0) {
            l10 = 5000L;
        }
        if ((n10 & 2) != 0) {
            f11 = 10.0f;
        }
        this(l10, f11);
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        Class<?> clazz = object != null ? object.getClass() : null;
        if (!y.e(LocationFilter.class, clazz)) {
            return false;
        }
        if (object != null) {
            object = (LocationFilter)object;
            if (this.a != ((LocationFilter)object).a) {
                return false;
            }
            return this.b == ((LocationFilter)object).b;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.locationapi.internal.LocationFilter");
    }

    public final float getUpdateDistanceInterval() {
        return this.b;
    }

    public final long getUpdateTimeInterval() {
        return this.a;
    }

    public int hashCode() {
        int n10 = androidx.collection.a.a((long)this.a);
        return Float.floatToIntBits(this.b) + n10 * 31;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("LocationFilter(updateTimeInterval=");
        stringBuilder.append(this.a);
        stringBuilder.append(", updateDistanceInterval=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

