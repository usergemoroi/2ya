/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.impl.B2;
import io.appmetrica.analytics.impl.i3;

public final class j3
implements ProtobufConverter {
    public static B2 a(BillingInfo billingInfo) {
        B2 b22 = new B2();
        ProductType productType = billingInfo.type;
        int n10 = i3.a[productType.ordinal()];
        int n13 = 2;
        if (n10 != 1) {
            n13 = n10 != 2 ? 1 : 3;
        }
        b22.a = n13;
        b22.b = billingInfo.productId;
        b22.c = billingInfo.purchaseToken;
        b22.d = billingInfo.purchaseTime;
        b22.e = billingInfo.sendTime;
        return b22;
    }

    @Override
    public final Object toModel(Object object) {
        B2 b22 = (B2)object;
        int n10 = b22.a;
        object = n10 != 2 ? (n10 != 3 ? ProductType.UNKNOWN : ProductType.SUBS) : ProductType.INAPP;
        return new BillingInfo((ProductType)((Object)object), b22.b, b22.c, b22.d, b22.e);
    }
}

