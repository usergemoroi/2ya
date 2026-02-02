/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.collection.a
 */
package io.appmetrica.analytics.locationapi.internal;

import androidx.collection.a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u00a2\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\t8\u0006\u00a2\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\u00a8\u0006\u0014"}, d2={"Lio/appmetrica/analytics/locationapi/internal/CacheArguments;", "", "", "toString", "other", "", "equals", "", "hashCode", "", "a", "J", "getRefreshPeriod", "()J", "refreshPeriod", "b", "getOutdatedTimeInterval", "outdatedTimeInterval", "<init>", "(JJ)V", "location-api_release"}, k=1, mv={1, 6, 0})
public final class CacheArguments {
    private final long a;
    private final long b;

    public CacheArguments() {
        this(0L, 0L, 3, null);
    }

    public CacheArguments(long l10, long l11) {
        this.a = l10;
        this.b = l11;
    }

    public /* synthetic */ CacheArguments(long l10, long l11, int n10, p p14) {
        if ((n10 & 1) != 0) {
            l10 = TimeUnit.SECONDS.toMillis(10L);
        }
        if ((n10 & 2) != 0) {
            l11 = TimeUnit.MINUTES.toMillis(2L);
        }
        this(l10, l11);
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        Class<?> clazz = object != null ? object.getClass() : null;
        if (!y.e(CacheArguments.class, clazz)) {
            return false;
        }
        if (object != null) {
            object = (CacheArguments)object;
            if (this.a != ((CacheArguments)object).a) {
                return false;
            }
            return this.b == ((CacheArguments)object).b;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.locationapi.internal.CacheArguments");
    }

    public final long getOutdatedTimeInterval() {
        return this.b;
    }

    public final long getRefreshPeriod() {
        return this.a;
    }

    public int hashCode() {
        int n10 = androidx.collection.a.a((long)this.a);
        return androidx.collection.a.a((long)this.b) + n10 * 31;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("CacheArguments(refreshPeriod=");
        stringBuilder.append(this.a);
        stringBuilder.append(", outdatedTimeInterval=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

