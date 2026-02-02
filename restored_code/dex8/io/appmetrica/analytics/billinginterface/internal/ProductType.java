/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.billinginterface.internal;

public final class ProductType
extends Enum<ProductType> {
    public static final /* enum */ ProductType INAPP;
    public static final /* enum */ ProductType SUBS;
    public static final /* enum */ ProductType UNKNOWN;
    private static final ProductType[] a;

    static {
        ProductType productType;
        ProductType productType2;
        ProductType productType3;
        INAPP = productType3 = new ProductType();
        SUBS = productType2 = new ProductType();
        UNKNOWN = productType = new ProductType();
        a = new ProductType[]{productType3, productType2, productType};
    }

    public static ProductType valueOf(String string2) {
        return Enum.valueOf(ProductType.class, string2);
    }

    public static ProductType[] values() {
        return (ProductType[])a.clone();
    }
}

