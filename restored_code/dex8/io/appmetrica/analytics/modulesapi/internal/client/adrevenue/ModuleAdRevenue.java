/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.modulesapi.internal.client.adrevenue;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0014\u0012\u0016\b\u0002\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010)\u0012\b\b\u0002\u00104\u001a\u00020/\u00a2\u0006\u0004\b5\u00106R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00148\u0006\u00a2\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00148\u0006\u00a2\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00148\u0006\u00a2\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018R\u0019\u0010%\u001a\u0004\u0018\u00010\u00148\u0006\u00a2\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u0019\u0010(\u001a\u0004\u0018\u00010\u00148\u0006\u00a2\u0006\f\n\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010\u0018R%\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010)8\u0006\u00a2\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u00104\u001a\u00020/8\u0006\u00a2\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103\u00a8\u00067"}, d2={"Lio/appmetrica/analytics/modulesapi/internal/client/adrevenue/ModuleAdRevenue;", "", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "getAdRevenue", "()Ljava/math/BigDecimal;", "adRevenue", "Ljava/util/Currency;", "b", "Ljava/util/Currency;", "getCurrency", "()Ljava/util/Currency;", "currency", "Lio/appmetrica/analytics/modulesapi/internal/client/adrevenue/ModuleAdType;", "c", "Lio/appmetrica/analytics/modulesapi/internal/client/adrevenue/ModuleAdType;", "getAdType", "()Lio/appmetrica/analytics/modulesapi/internal/client/adrevenue/ModuleAdType;", "adType", "", "d", "Ljava/lang/String;", "getAdNetwork", "()Ljava/lang/String;", "adNetwork", "e", "getAdUnitId", "adUnitId", "f", "getAdUnitName", "adUnitName", "g", "getAdPlacementId", "adPlacementId", "h", "getAdPlacementName", "adPlacementName", "i", "getPrecision", "precision", "", "j", "Ljava/util/Map;", "getPayload", "()Ljava/util/Map;", "payload", "", "k", "Z", "getAutoCollected", "()Z", "autoCollected", "<init>", "(Ljava/math/BigDecimal;Ljava/util/Currency;Lio/appmetrica/analytics/modulesapi/internal/client/adrevenue/ModuleAdType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)V", "modules-api_release"}, k=1, mv={1, 6, 0})
public final class ModuleAdRevenue {
    private final BigDecimal a;
    private final Currency b;
    private final ModuleAdType c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final Map j;
    private final boolean k;

    public ModuleAdRevenue(@NotNull BigDecimal bigDecimal, @NotNull Currency currency, @Nullable ModuleAdType moduleAdType, @Nullable String string2, @Nullable String string3, @Nullable String string4, @Nullable String string5, @Nullable String string6, @Nullable String string7, @Nullable Map<String, String> map2, boolean bl2) {
        this.a = bigDecimal;
        this.b = currency;
        this.c = moduleAdType;
        this.d = string2;
        this.e = string3;
        this.f = string4;
        this.g = string5;
        this.h = string6;
        this.i = string7;
        this.j = map2;
        this.k = bl2;
    }

    public /* synthetic */ ModuleAdRevenue(BigDecimal bigDecimal, Currency currency, ModuleAdType moduleAdType, String string2, String string3, String string4, String string5, String string6, String string7, Map map2, boolean bl2, int n10, p p14) {
        if ((n10 & 4) != 0) {
            moduleAdType = null;
        }
        if ((n10 & 8) != 0) {
            string2 = null;
        }
        if ((n10 & 0x10) != 0) {
            string3 = null;
        }
        if ((n10 & 0x20) != 0) {
            string4 = null;
        }
        if ((n10 & 0x40) != 0) {
            string5 = null;
        }
        if ((n10 & 0x80) != 0) {
            string6 = null;
        }
        if ((n10 & 0x100) != 0) {
            string7 = null;
        }
        if ((n10 & 0x200) != 0) {
            map2 = null;
        }
        if ((n10 & 0x400) != 0) {
            bl2 = true;
        }
        this(bigDecimal, currency, moduleAdType, string2, string3, string4, string5, string6, string7, map2, bl2);
    }

    @Nullable
    public final String getAdNetwork() {
        return this.d;
    }

    @Nullable
    public final String getAdPlacementId() {
        return this.g;
    }

    @Nullable
    public final String getAdPlacementName() {
        return this.h;
    }

    @NotNull
    public final BigDecimal getAdRevenue() {
        return this.a;
    }

    @Nullable
    public final ModuleAdType getAdType() {
        return this.c;
    }

    @Nullable
    public final String getAdUnitId() {
        return this.e;
    }

    @Nullable
    public final String getAdUnitName() {
        return this.f;
    }

    public final boolean getAutoCollected() {
        return this.k;
    }

    @NotNull
    public final Currency getCurrency() {
        return this.b;
    }

    @Nullable
    public final Map<String, String> getPayload() {
        return this.j;
    }

    @Nullable
    public final String getPrecision() {
        return this.i;
    }
}

