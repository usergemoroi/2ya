/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics;

public final class AdType
extends Enum<AdType> {
    public static final /* enum */ AdType APP_OPEN;
    public static final /* enum */ AdType BANNER;
    public static final /* enum */ AdType INTERSTITIAL;
    public static final /* enum */ AdType MREC;
    public static final /* enum */ AdType NATIVE;
    public static final /* enum */ AdType OTHER;
    public static final /* enum */ AdType REWARDED;
    private static final AdType[] a;

    static {
        AdType adType;
        AdType adType2;
        AdType adType3;
        AdType adType4;
        AdType adType5;
        AdType adType6;
        AdType adType7;
        NATIVE = adType7 = new AdType();
        BANNER = adType6 = new AdType();
        REWARDED = adType5 = new AdType();
        INTERSTITIAL = adType4 = new AdType();
        MREC = adType3 = new AdType();
        APP_OPEN = adType2 = new AdType();
        OTHER = adType = new AdType();
        a = new AdType[]{adType7, adType6, adType5, adType4, adType3, adType2, adType};
    }

    public static AdType valueOf(String string2) {
        return Enum.valueOf(AdType.class, string2);
    }

    public static AdType[] values() {
        return (AdType[])a.clone();
    }
}

