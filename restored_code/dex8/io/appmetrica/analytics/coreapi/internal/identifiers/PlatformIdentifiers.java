/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreapi.internal.identifiers;

import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001a"}, d2={"Lio/appmetrica/analytics/coreapi/internal/identifiers/PlatformIdentifiers;", "", "Lio/appmetrica/analytics/coreapi/internal/identifiers/SimpleAdvertisingIdGetter;", "component1", "Lio/appmetrica/analytics/coreapi/internal/identifiers/AppSetIdProvider;", "component2", "advIdentifiersProvider", "appSetIdProvider", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lio/appmetrica/analytics/coreapi/internal/identifiers/SimpleAdvertisingIdGetter;", "getAdvIdentifiersProvider", "()Lio/appmetrica/analytics/coreapi/internal/identifiers/SimpleAdvertisingIdGetter;", "b", "Lio/appmetrica/analytics/coreapi/internal/identifiers/AppSetIdProvider;", "getAppSetIdProvider", "()Lio/appmetrica/analytics/coreapi/internal/identifiers/AppSetIdProvider;", "<init>", "(Lio/appmetrica/analytics/coreapi/internal/identifiers/SimpleAdvertisingIdGetter;Lio/appmetrica/analytics/coreapi/internal/identifiers/AppSetIdProvider;)V", "core-api_release"}, k=1, mv={1, 6, 0})
public final class PlatformIdentifiers {
    private final SimpleAdvertisingIdGetter a;
    private final AppSetIdProvider b;

    public PlatformIdentifiers(@NotNull SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, @NotNull AppSetIdProvider appSetIdProvider) {
        this.a = simpleAdvertisingIdGetter;
        this.b = appSetIdProvider;
    }

    public static /* synthetic */ PlatformIdentifiers copy$default(PlatformIdentifiers platformIdentifiers, SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, AppSetIdProvider appSetIdProvider, int n10, Object object) {
        if ((n10 & 1) != 0) {
            simpleAdvertisingIdGetter = platformIdentifiers.a;
        }
        if ((n10 & 2) != 0) {
            appSetIdProvider = platformIdentifiers.b;
        }
        return platformIdentifiers.copy(simpleAdvertisingIdGetter, appSetIdProvider);
    }

    @NotNull
    public final SimpleAdvertisingIdGetter component1() {
        return this.a;
    }

    @NotNull
    public final AppSetIdProvider component2() {
        return this.b;
    }

    @NotNull
    public final PlatformIdentifiers copy(@NotNull SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, @NotNull AppSetIdProvider appSetIdProvider) {
        return new PlatformIdentifiers(simpleAdvertisingIdGetter, appSetIdProvider);
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof PlatformIdentifiers)) {
            return false;
        }
        object = (PlatformIdentifiers)object;
        if (!y.e(this.a, ((PlatformIdentifiers)object).a)) {
            return false;
        }
        return y.e(this.b, ((PlatformIdentifiers)object).b);
    }

    @NotNull
    public final SimpleAdvertisingIdGetter getAdvIdentifiersProvider() {
        return this.a;
    }

    @NotNull
    public final AppSetIdProvider getAppSetIdProvider() {
        return this.b;
    }

    public int hashCode() {
        int n10 = this.a.hashCode();
        return this.b.hashCode() + n10 * 31;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlatformIdentifiers(advIdentifiersProvider=");
        stringBuilder.append(this.a);
        stringBuilder.append(", appSetIdProvider=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

