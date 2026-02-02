/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreapi.internal.model;

import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0002H\u00c6\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\n\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\u00a8\u0006\u001a"}, d2={"Lio/appmetrica/analytics/coreapi/internal/model/SdkInfo;", "", "", "component1", "component2", "component3", "sdkVersionName", "sdkBuildNumber", "sdkBuildType", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getSdkVersionName", "()Ljava/lang/String;", "b", "getSdkBuildNumber", "c", "getSdkBuildType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "core-api_release"}, k=1, mv={1, 6, 0})
public final class SdkInfo {
    private final String a;
    private final String b;
    private final String c;

    public SdkInfo(@NotNull String string2, @NotNull String string3, @NotNull String string4) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
    }

    public static /* synthetic */ SdkInfo copy$default(SdkInfo sdkInfo, String string2, String string3, String string4, int n10, Object object) {
        if ((n10 & 1) != 0) {
            string2 = sdkInfo.a;
        }
        if ((n10 & 2) != 0) {
            string3 = sdkInfo.b;
        }
        if ((n10 & 4) != 0) {
            string4 = sdkInfo.c;
        }
        return sdkInfo.copy(string2, string3, string4);
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
    public final String component3() {
        return this.c;
    }

    @NotNull
    public final SdkInfo copy(@NotNull String string2, @NotNull String string3, @NotNull String string4) {
        return new SdkInfo(string2, string3, string4);
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof SdkInfo)) {
            return false;
        }
        object = (SdkInfo)object;
        if (!y.e(this.a, ((SdkInfo)object).a)) {
            return false;
        }
        if (!y.e(this.b, ((SdkInfo)object).b)) {
            return false;
        }
        return y.e(this.c, ((SdkInfo)object).c);
    }

    @NotNull
    public final String getSdkBuildNumber() {
        return this.b;
    }

    @NotNull
    public final String getSdkBuildType() {
        return this.c;
    }

    @NotNull
    public final String getSdkVersionName() {
        return this.a;
    }

    public int hashCode() {
        int n10 = this.a.hashCode();
        int n13 = this.b.hashCode();
        return this.c.hashCode() + (n13 + n10 * 31) * 31;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SdkInfo(sdkVersionName=");
        stringBuilder.append(this.a);
        stringBuilder.append(", sdkBuildNumber=");
        stringBuilder.append(this.b);
        stringBuilder.append(", sdkBuildType=");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

