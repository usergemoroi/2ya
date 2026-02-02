/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2={"Lio/appmetrica/analytics/coreapi/internal/identifiers/AppSetIdScope;", "", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "UNKNOWN", "APP", "DEVELOPER", "core-api_release"}, k=1, mv={1, 6, 0})
public final class AppSetIdScope
extends Enum<AppSetIdScope> {
    public static final /* enum */ AppSetIdScope APP;
    public static final /* enum */ AppSetIdScope DEVELOPER;
    public static final /* enum */ AppSetIdScope UNKNOWN;
    private static final AppSetIdScope[] b;
    private final String a;

    static {
        AppSetIdScope appSetIdScope;
        AppSetIdScope appSetIdScope2;
        AppSetIdScope appSetIdScope3;
        UNKNOWN = appSetIdScope3 = new AppSetIdScope("");
        APP = appSetIdScope2 = new AppSetIdScope("app");
        DEVELOPER = appSetIdScope = new AppSetIdScope("developer");
        b = new AppSetIdScope[]{appSetIdScope3, appSetIdScope2, appSetIdScope};
    }

    private AppSetIdScope(String string3) {
        this.a = string3;
    }

    public static AppSetIdScope valueOf(String string2) {
        return Enum.valueOf(AppSetIdScope.class, string2);
    }

    public static AppSetIdScope[] values() {
        return (AppSetIdScope[])b.clone();
    }

    @NotNull
    public final String getValue() {
        return this.a;
    }
}

