/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.plugin.unity;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.plugin.unity.ECommercePriceSerializer;
import io.appmetrica.analytics.plugin.unity.ECommerceProductSerializer;
import io.appmetrica.analytics.plugin.unity.ECommerceReferrerSerializer;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

final class ECommerceCartItemSerializer {
    private ECommerceCartItemSerializer() {
    }

    @NonNull
    public static ECommerceCartItem fromJsonString(@NonNull String string2) throws JSONException {
        string2 = new JSONObject(string2);
        ECommerceCartItem eCommerceCartItem = new ECommerceCartItem(ECommerceProductSerializer.fromJsonString(string2.getString("Product")), ECommercePriceSerializer.fromJsonString(string2.getString("Revenue")), new BigDecimal(string2.getString("Quantity")));
        if (string2.has("Referrer")) {
            eCommerceCartItem.setReferrer(ECommerceReferrerSerializer.fromJsonString(string2.getString("Referrer")));
        }
        return eCommerceCartItem;
    }
}

