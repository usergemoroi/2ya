/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.billinginterface.internal;

public final class BillingType
extends Enum<BillingType> {
    public static final /* enum */ BillingType LIBRARY_V6;
    public static final /* enum */ BillingType LIBRARY_V8;
    public static final /* enum */ BillingType NONE;
    private static final BillingType[] a;

    static {
        BillingType billingType;
        BillingType billingType2;
        BillingType billingType3;
        LIBRARY_V6 = billingType3 = new BillingType();
        LIBRARY_V8 = billingType2 = new BillingType();
        NONE = billingType = new BillingType();
        a = new BillingType[]{billingType3, billingType2, billingType};
    }

    public static BillingType valueOf(String string2) {
        return Enum.valueOf(BillingType.class, string2);
    }

    public static BillingType[] values() {
        return (BillingType[])a.clone();
    }
}

