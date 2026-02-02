/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import io.appmetrica.analytics.impl.G3;
import io.appmetrica.analytics.impl.Ie;
import io.appmetrica.analytics.impl.gg;
import io.appmetrica.analytics.impl.kl;
import io.appmetrica.analytics.impl.ml;
import io.appmetrica.analytics.impl.ol;
import java.util.List;

public abstract class ECommerceEvent
implements gg {
    protected ECommerceEvent() {
    }

    @NonNull
    public static ECommerceEvent addCartItemEvent(@NonNull ECommerceCartItem eCommerceCartItem) {
        return new G3(4, eCommerceCartItem);
    }

    @NonNull
    public static ECommerceEvent beginCheckoutEvent(@NonNull ECommerceOrder eCommerceOrder) {
        return new Ie(6, eCommerceOrder);
    }

    @NonNull
    public static ECommerceEvent purchaseEvent(@NonNull ECommerceOrder eCommerceOrder) {
        return new Ie(7, eCommerceOrder);
    }

    @NonNull
    public static ECommerceEvent removeCartItemEvent(@NonNull ECommerceCartItem eCommerceCartItem) {
        return new G3(5, eCommerceCartItem);
    }

    @NonNull
    public static ECommerceEvent showProductCardEvent(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommerceScreen eCommerceScreen) {
        return new kl(eCommerceProduct, eCommerceScreen);
    }

    @NonNull
    public static ECommerceEvent showProductDetailsEvent(@NonNull ECommerceProduct eCommerceProduct, @Nullable ECommerceReferrer eCommerceReferrer) {
        return new ml(eCommerceProduct, eCommerceReferrer);
    }

    @NonNull
    public static ECommerceEvent showScreenEvent(@NonNull ECommerceScreen eCommerceScreen) {
        return new ol(eCommerceScreen);
    }

    @NonNull
    public String getPublicDescription() {
        return "E-commerce base event";
    }

    @Override
    public abstract /* synthetic */ List toProto();
}

