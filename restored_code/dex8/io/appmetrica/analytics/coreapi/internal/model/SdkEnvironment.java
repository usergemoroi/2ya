/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreapi.internal.model;

import io.appmetrica.analytics.coreapi.internal.model.AppVersionInfo;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreapi.internal.model.SdkInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u00a2\u0006\u0004\b0\u00101J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J\t\u0010\n\u001a\u00020\u0004H\u00c6\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u00c6\u0003JK\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u00c6\u0001J\t\u0010\u0014\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000f\u001a\u00020\u00068\u0006\u00a2\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0010\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0011\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010!R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006\u00a2\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\u00a8\u00062"}, d2={"Lio/appmetrica/analytics/coreapi/internal/model/SdkEnvironment;", "", "Lio/appmetrica/analytics/coreapi/internal/model/AppVersionInfo;", "component1", "", "component2", "Lio/appmetrica/analytics/coreapi/internal/model/ScreenInfo;", "component3", "Lio/appmetrica/analytics/coreapi/internal/model/SdkInfo;", "component4", "component5", "", "component6", "appVersionInfo", "appFramework", "screenInfo", "sdkInfo", "deviceType", "locales", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Lio/appmetrica/analytics/coreapi/internal/model/AppVersionInfo;", "getAppVersionInfo", "()Lio/appmetrica/analytics/coreapi/internal/model/AppVersionInfo;", "b", "Ljava/lang/String;", "getAppFramework", "()Ljava/lang/String;", "c", "Lio/appmetrica/analytics/coreapi/internal/model/ScreenInfo;", "getScreenInfo", "()Lio/appmetrica/analytics/coreapi/internal/model/ScreenInfo;", "d", "Lio/appmetrica/analytics/coreapi/internal/model/SdkInfo;", "getSdkInfo", "()Lio/appmetrica/analytics/coreapi/internal/model/SdkInfo;", "e", "getDeviceType", "f", "Ljava/util/List;", "getLocales", "()Ljava/util/List;", "<init>", "(Lio/appmetrica/analytics/coreapi/internal/model/AppVersionInfo;Ljava/lang/String;Lio/appmetrica/analytics/coreapi/internal/model/ScreenInfo;Lio/appmetrica/analytics/coreapi/internal/model/SdkInfo;Ljava/lang/String;Ljava/util/List;)V", "core-api_release"}, k=1, mv={1, 6, 0})
public final class SdkEnvironment {
    private final AppVersionInfo a;
    private final String b;
    private final ScreenInfo c;
    private final SdkInfo d;
    private final String e;
    private final List f;

    public SdkEnvironment(@NotNull AppVersionInfo appVersionInfo, @NotNull String string2, @NotNull ScreenInfo screenInfo, @NotNull SdkInfo sdkInfo, @NotNull String string3, @NotNull List<String> list) {
        this.a = appVersionInfo;
        this.b = string2;
        this.c = screenInfo;
        this.d = sdkInfo;
        this.e = string3;
        this.f = list;
    }

    public static /* synthetic */ SdkEnvironment copy$default(SdkEnvironment sdkEnvironment, AppVersionInfo appVersionInfo, String string2, ScreenInfo screenInfo, SdkInfo sdkInfo, String string3, List list, int n10, Object object) {
        if ((n10 & 1) != 0) {
            appVersionInfo = sdkEnvironment.a;
        }
        if ((n10 & 2) != 0) {
            string2 = sdkEnvironment.b;
        }
        if ((n10 & 4) != 0) {
            screenInfo = sdkEnvironment.c;
        }
        if ((n10 & 8) != 0) {
            sdkInfo = sdkEnvironment.d;
        }
        if ((n10 & 0x10) != 0) {
            string3 = sdkEnvironment.e;
        }
        if ((n10 & 0x20) != 0) {
            list = sdkEnvironment.f;
        }
        return sdkEnvironment.copy(appVersionInfo, string2, screenInfo, sdkInfo, string3, list);
    }

    @NotNull
    public final AppVersionInfo component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    @NotNull
    public final ScreenInfo component3() {
        return this.c;
    }

    @NotNull
    public final SdkInfo component4() {
        return this.d;
    }

    @NotNull
    public final String component5() {
        return this.e;
    }

    @NotNull
    public final List<String> component6() {
        return this.f;
    }

    @NotNull
    public final SdkEnvironment copy(@NotNull AppVersionInfo appVersionInfo, @NotNull String string2, @NotNull ScreenInfo screenInfo, @NotNull SdkInfo sdkInfo, @NotNull String string3, @NotNull List<String> list) {
        return new SdkEnvironment(appVersionInfo, string2, screenInfo, sdkInfo, string3, list);
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof SdkEnvironment)) {
            return false;
        }
        object = (SdkEnvironment)object;
        if (!y.e(this.a, ((SdkEnvironment)object).a)) {
            return false;
        }
        if (!y.e(this.b, ((SdkEnvironment)object).b)) {
            return false;
        }
        if (!y.e(this.c, ((SdkEnvironment)object).c)) {
            return false;
        }
        if (!y.e(this.d, ((SdkEnvironment)object).d)) {
            return false;
        }
        if (!y.e(this.e, ((SdkEnvironment)object).e)) {
            return false;
        }
        return y.e(this.f, ((SdkEnvironment)object).f);
    }

    @NotNull
    public final String getAppFramework() {
        return this.b;
    }

    @NotNull
    public final AppVersionInfo getAppVersionInfo() {
        return this.a;
    }

    @NotNull
    public final String getDeviceType() {
        return this.e;
    }

    @NotNull
    public final List<String> getLocales() {
        return this.f;
    }

    @NotNull
    public final ScreenInfo getScreenInfo() {
        return this.c;
    }

    @NotNull
    public final SdkInfo getSdkInfo() {
        return this.d;
    }

    public int hashCode() {
        int n10 = this.a.hashCode();
        int n13 = this.b.hashCode();
        int n14 = this.c.hashCode();
        int n15 = this.d.hashCode();
        int n16 = this.e.hashCode();
        return ((Object)this.f).hashCode() + (n16 + (n15 + (n14 + (n13 + n10 * 31) * 31) * 31) * 31) * 31;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SdkEnvironment(appVersionInfo=");
        stringBuilder.append(this.a);
        stringBuilder.append(", appFramework=");
        stringBuilder.append(this.b);
        stringBuilder.append(", screenInfo=");
        stringBuilder.append(this.c);
        stringBuilder.append(", sdkInfo=");
        stringBuilder.append(this.d);
        stringBuilder.append(", deviceType=");
        stringBuilder.append(this.e);
        stringBuilder.append(", locales=");
        stringBuilder.append(this.f);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

