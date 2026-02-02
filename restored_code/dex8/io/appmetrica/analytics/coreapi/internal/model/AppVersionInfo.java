/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreapi.internal.model;

import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\b\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011\u00a8\u0006\u0016"}, d2={"Lio/appmetrica/analytics/coreapi/internal/model/AppVersionInfo;", "", "", "component1", "component2", "appVersionName", "appBuildNumber", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getAppVersionName", "()Ljava/lang/String;", "b", "getAppBuildNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "core-api_release"}, k=1, mv={1, 6, 0})
public final class AppVersionInfo {
    private final String a;
    private final String b;

    public AppVersionInfo(@NotNull String string2, @NotNull String string3) {
        this.a = string2;
        this.b = string3;
    }

    public static /* synthetic */ AppVersionInfo copy$default(AppVersionInfo appVersionInfo, String string2, String string3, int n10, Object object) {
        if ((n10 & 1) != 0) {
            string2 = appVersionInfo.a;
        }
        if ((n10 & 2) != 0) {
            string3 = appVersionInfo.b;
        }
        return appVersionInfo.copy(string2, string3);
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    @NotNull
    public final AppVersionInfo copy(@NotNull String string2, @NotNull String string3) {
        return new AppVersionInfo(string2, string3);
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof AppVersionInfo)) {
            return false;
        }
        object = (AppVersionInfo)object;
        if (!y.e(this.a, ((AppVersionInfo)object).a)) {
            return false;
        }
        return y.e(this.b, ((AppVersionInfo)object).b);
    }

    @NotNull
    public final String getAppBuildNumber() {
        return this.b;
    }

    @NotNull
    public final String getAppVersionName() {
        return this.a;
    }

    public int hashCode() {
        int n10 = this.a.hashCode();
        return this.b.hashCode() + n10 * 31;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AppVersionInfo(appVersionName=");
        stringBuilder.append(this.a);
        stringBuilder.append(", appBuildNumber=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

