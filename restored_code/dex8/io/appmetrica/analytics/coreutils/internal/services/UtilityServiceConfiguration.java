/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.collection.a
 */
package io.appmetrica.analytics.coreutils.internal.services;

import androidx.collection.a;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\t\u001a\u00020\bH\u00d6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012\u00a8\u0006\u0017"}, d2={"Lio/appmetrica/analytics/coreutils/internal/services/UtilityServiceConfiguration;", "", "", "component1", "component2", "initialConfigTime", "lastUpdateConfigTime", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getInitialConfigTime", "()J", "b", "getLastUpdateConfigTime", "<init>", "(JJ)V", "core-utils_release"}, k=1, mv={1, 6, 0})
public final class UtilityServiceConfiguration {
    private final long a;
    private final long b;

    public UtilityServiceConfiguration() {
        this(0L, 0L, 3, null);
    }

    public UtilityServiceConfiguration(long l10, long l11) {
        this.a = l10;
        this.b = l11;
    }

    public /* synthetic */ UtilityServiceConfiguration(long l10, long l11, int n10, p p14) {
        if ((n10 & 1) != 0) {
            l10 = 0L;
        }
        if ((n10 & 2) != 0) {
            l11 = 0L;
        }
        this(l10, l11);
    }

    public static /* synthetic */ UtilityServiceConfiguration copy$default(UtilityServiceConfiguration utilityServiceConfiguration, long l10, long l11, int n10, Object object) {
        if ((n10 & 1) != 0) {
            l10 = utilityServiceConfiguration.a;
        }
        if ((n10 & 2) != 0) {
            l11 = utilityServiceConfiguration.b;
        }
        return utilityServiceConfiguration.copy(l10, l11);
    }

    public final long component1() {
        return this.a;
    }

    public final long component2() {
        return this.b;
    }

    @NotNull
    public final UtilityServiceConfiguration copy(long l10, long l11) {
        return new UtilityServiceConfiguration(l10, l11);
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof UtilityServiceConfiguration)) {
            return false;
        }
        object = (UtilityServiceConfiguration)object;
        if (this.a != ((UtilityServiceConfiguration)object).a) {
            return false;
        }
        return this.b == ((UtilityServiceConfiguration)object).b;
    }

    public final long getInitialConfigTime() {
        return this.a;
    }

    public final long getLastUpdateConfigTime() {
        return this.b;
    }

    public int hashCode() {
        int n10 = androidx.collection.a.a((long)this.a);
        return androidx.collection.a.a((long)this.b) + n10 * 31;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("UtilityServiceConfiguration(initialConfigTime=");
        stringBuilder.append(this.a);
        stringBuilder.append(", lastUpdateConfigTime=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

