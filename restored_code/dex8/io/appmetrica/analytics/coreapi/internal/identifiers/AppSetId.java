/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreapi.internal.identifiers;

import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\u001f\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\t\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0019"}, d2={"Lio/appmetrica/analytics/coreapi/internal/identifiers/AppSetId;", "", "", "component1", "Lio/appmetrica/analytics/coreapi/internal/identifiers/AppSetIdScope;", "component2", "id", "scope", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "Lio/appmetrica/analytics/coreapi/internal/identifiers/AppSetIdScope;", "getScope", "()Lio/appmetrica/analytics/coreapi/internal/identifiers/AppSetIdScope;", "<init>", "(Ljava/lang/String;Lio/appmetrica/analytics/coreapi/internal/identifiers/AppSetIdScope;)V", "core-api_release"}, k=1, mv={1, 6, 0})
public final class AppSetId {
    private final String a;
    private final AppSetIdScope b;

    public AppSetId(@Nullable String string2, @NotNull AppSetIdScope appSetIdScope) {
        this.a = string2;
        this.b = appSetIdScope;
    }

    public static /* synthetic */ AppSetId copy$default(AppSetId appSetId, String string2, AppSetIdScope appSetIdScope, int n10, Object object) {
        if ((n10 & 1) != 0) {
            string2 = appSetId.a;
        }
        if ((n10 & 2) != 0) {
            appSetIdScope = appSetId.b;
        }
        return appSetId.copy(string2, appSetIdScope);
    }

    @Nullable
    public final String component1() {
        return this.a;
    }

    @NotNull
    public final AppSetIdScope component2() {
        return this.b;
    }

    @NotNull
    public final AppSetId copy(@Nullable String string2, @NotNull AppSetIdScope appSetIdScope) {
        return new AppSetId(string2, appSetIdScope);
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof AppSetId)) {
            return false;
        }
        object = (AppSetId)object;
        if (!y.e(this.a, ((AppSetId)object).a)) {
            return false;
        }
        return this.b == ((AppSetId)object).b;
    }

    @Nullable
    public final String getId() {
        return this.a;
    }

    @NotNull
    public final AppSetIdScope getScope() {
        return this.b;
    }

    public int hashCode() {
        String string2 = this.a;
        int n10 = string2 == null ? 0 : string2.hashCode();
        return ((Object)((Object)this.b)).hashCode() + n10 * 31;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AppSetId(id=");
        stringBuilder.append(this.a);
        stringBuilder.append(", scope=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

