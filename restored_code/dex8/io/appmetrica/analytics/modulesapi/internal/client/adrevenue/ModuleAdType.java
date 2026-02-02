/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.modulesapi.internal.client.adrevenue;

import kotlin.Metadata;

@Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2={"Lio/appmetrica/analytics/modulesapi/internal/client/adrevenue/ModuleAdType;", "", "NATIVE", "BANNER", "REWARDED", "INTERSTITIAL", "MREC", "APP_OPEN", "OTHER", "modules-api_release"}, k=1, mv={1, 6, 0})
public final class ModuleAdType
extends Enum<ModuleAdType> {
    public static final /* enum */ ModuleAdType APP_OPEN;
    public static final /* enum */ ModuleAdType BANNER;
    public static final /* enum */ ModuleAdType INTERSTITIAL;
    public static final /* enum */ ModuleAdType MREC;
    public static final /* enum */ ModuleAdType NATIVE;
    public static final /* enum */ ModuleAdType OTHER;
    public static final /* enum */ ModuleAdType REWARDED;
    private static final ModuleAdType[] a;

    static {
        ModuleAdType moduleAdType;
        ModuleAdType moduleAdType2;
        ModuleAdType moduleAdType3;
        ModuleAdType moduleAdType4;
        ModuleAdType moduleAdType5;
        ModuleAdType moduleAdType6;
        ModuleAdType moduleAdType7;
        NATIVE = moduleAdType7 = new ModuleAdType();
        BANNER = moduleAdType6 = new ModuleAdType();
        REWARDED = moduleAdType5 = new ModuleAdType();
        INTERSTITIAL = moduleAdType4 = new ModuleAdType();
        MREC = moduleAdType3 = new ModuleAdType();
        APP_OPEN = moduleAdType2 = new ModuleAdType();
        OTHER = moduleAdType = new ModuleAdType();
        a = new ModuleAdType[]{moduleAdType7, moduleAdType6, moduleAdType5, moduleAdType4, moduleAdType3, moduleAdType2, moduleAdType};
    }

    public static ModuleAdType valueOf(String string2) {
        return Enum.valueOf(ModuleAdType.class, string2);
    }

    public static ModuleAdType[] values() {
        return (ModuleAdType[])a.clone();
    }
}

