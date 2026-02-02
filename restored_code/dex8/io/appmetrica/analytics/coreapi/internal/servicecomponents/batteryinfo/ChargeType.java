/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo;

public final class ChargeType
extends Enum<ChargeType> {
    public static final /* enum */ ChargeType AC;
    public static final /* enum */ ChargeType NONE;
    public static final /* enum */ ChargeType UNKNOWN;
    public static final /* enum */ ChargeType USB;
    public static final /* enum */ ChargeType WIRELESS;
    private static final ChargeType[] b;
    private final int a;

    static {
        ChargeType chargeType;
        ChargeType chargeType2;
        ChargeType chargeType3;
        ChargeType chargeType4;
        ChargeType chargeType5;
        UNKNOWN = chargeType5 = new ChargeType(-1);
        NONE = chargeType4 = new ChargeType(0);
        USB = chargeType3 = new ChargeType(1);
        WIRELESS = chargeType2 = new ChargeType(2);
        AC = chargeType = new ChargeType(3);
        b = new ChargeType[]{chargeType5, chargeType4, chargeType3, chargeType2, chargeType};
    }

    private ChargeType(int n13) {
        this.a = n13;
    }

    public static ChargeType fromId(Integer n10) {
        if (n10 != null) {
            for (ChargeType chargeType : ChargeType.values()) {
                if (chargeType.getId() != n10.intValue()) continue;
                return chargeType;
            }
        }
        return UNKNOWN;
    }

    public static ChargeType valueOf(String string2) {
        return Enum.valueOf(ChargeType.class, string2);
    }

    public static ChargeType[] values() {
        return (ChargeType[])b.clone();
    }

    public int getId() {
        return this.a;
    }
}

