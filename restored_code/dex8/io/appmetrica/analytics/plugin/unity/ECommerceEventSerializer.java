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
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import io.appmetrica.analytics.plugin.unity.ECommerceCartItemSerializer;
import io.appmetrica.analytics.plugin.unity.ECommerceOrderSerializer;
import io.appmetrica.analytics.plugin.unity.ECommerceProductSerializer;
import io.appmetrica.analytics.plugin.unity.ECommerceReferrerSerializer;
import io.appmetrica.analytics.plugin.unity.ECommerceScreenSerializer;
import org.json.JSONException;
import org.json.JSONObject;

final class ECommerceEventSerializer {
    private ECommerceEventSerializer() {
    }

    @NonNull
    public static ECommerceEvent fromJsonString(@NonNull String object) throws JSONException {
        object = new JSONObject((String)object);
        Object object2 = object.getString("Type");
        ((String)object2).hashCode();
        int n10 = ((String)object2).hashCode();
        int n13 = -1;
        switch (n10) {
            default: {
                break;
            }
            case 1759656721: {
                if (!((String)object2).equals("RemoveCartItemECommerceEvent")) break;
                n13 = 6;
                break;
            }
            case 936883708: {
                if (!((String)object2).equals("ShowProductCardECommerceEvent")) break;
                n13 = 5;
                break;
            }
            case 643795722: {
                if (!((String)object2).equals("ShowProductDetailsECommerceEvent")) break;
                n13 = 4;
                break;
            }
            case 476996398: {
                if (!((String)object2).equals("AddCartItemECommerceEvent")) break;
                n13 = 3;
                break;
            }
            case 302547689: {
                if (!((String)object2).equals("BeginCheckoutECommerceEvent")) break;
                n13 = 2;
                break;
            }
            case -1597371493: {
                if (!((String)object2).equals("PurchaseECommerceEvent")) break;
                n13 = 1;
                break;
            }
            case -1823271325: {
                if (!((String)object2).equals("ShowScreenECommerceEvent")) break;
                n13 = 0;
            }
        }
        switch (n13) {
            default: {
                object = new StringBuilder();
                ((StringBuilder)object).append("Unknown ECommerce type ");
                ((StringBuilder)object).append((String)object2);
                throw new JSONException(((StringBuilder)object).toString());
            }
            case 6: {
                return ECommerceEvent.removeCartItemEvent(ECommerceCartItemSerializer.fromJsonString(object.getString("CartItem")));
            }
            case 5: {
                return ECommerceEvent.showProductCardEvent(ECommerceProductSerializer.fromJsonString(object.getString("Product")), ECommerceScreenSerializer.fromJsonString(object.getString("Screen")));
            }
            case 4: {
                object2 = ECommerceProductSerializer.fromJsonString(object.getString("Product"));
                object = object.has("Referrer") ? ECommerceReferrerSerializer.fromJsonString(object.getString("Referrer")) : null;
                return ECommerceEvent.showProductDetailsEvent((ECommerceProduct)object2, (ECommerceReferrer)object);
            }
            case 3: {
                return ECommerceEvent.addCartItemEvent(ECommerceCartItemSerializer.fromJsonString(object.getString("CartItem")));
            }
            case 2: {
                return ECommerceEvent.beginCheckoutEvent(ECommerceOrderSerializer.fromJsonString(object.getString("Order")));
            }
            case 1: {
                return ECommerceEvent.purchaseEvent(ECommerceOrderSerializer.fromJsonString(object.getString("Order")));
            }
            case 0: 
        }
        return ECommerceEvent.showScreenEvent(ECommerceScreenSerializer.fromJsonString(object.getString("Screen")));
    }
}

