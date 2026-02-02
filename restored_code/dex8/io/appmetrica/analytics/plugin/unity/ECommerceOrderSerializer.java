/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.plugin.unity;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import io.appmetrica.analytics.plugin.unity.ECommerceCartItemSerializer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class ECommerceOrderSerializer {
    private ECommerceOrderSerializer() {
    }

    @NonNull
    public static ECommerceOrder fromJsonString(@NonNull String string2) throws JSONException {
        string2 = new JSONObject(string2);
        ECommerceOrder eCommerceOrder = new ECommerceOrder(string2.getString("Identifier"), ECommerceOrderSerializer.getCartItems(string2.getJSONArray("CartItems")));
        if (string2.has("Payload")) {
            eCommerceOrder.setPayload(ECommerceOrderSerializer.getPayload(string2.getJSONObject("Payload")));
        }
        return eCommerceOrder;
    }

    @NonNull
    private static List<ECommerceCartItem> getCartItems(@NonNull JSONArray jSONArray) throws JSONException {
        ArrayList<ECommerceCartItem> arrayList = new ArrayList<ECommerceCartItem>(jSONArray.length());
        for (int i14 = 0; i14 < jSONArray.length(); ++i14) {
            arrayList.add(ECommerceCartItemSerializer.fromJsonString(jSONArray.getString(i14)));
        }
        return arrayList;
    }

    @NonNull
    private static Map<String, String> getPayload(@NonNull JSONObject jSONObject) throws JSONException {
        HashMap<String, String> hashMap = new HashMap<String, String>(jSONObject.length());
        Iterator iterator = jSONObject.keys();
        while (iterator.hasNext()) {
            String string2 = (String)iterator.next();
            hashMap.put(string2, jSONObject.getString(string2));
        }
        return hashMap;
    }
}

