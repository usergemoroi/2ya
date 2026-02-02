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
import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import io.appmetrica.analytics.ecommerce.ECommercePrice;
import io.appmetrica.analytics.plugin.unity.ECommerceAmountSerializer;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class ECommercePriceSerializer {
    private ECommercePriceSerializer() {
    }

    @NonNull
    public static ECommercePrice fromJsonString(@NonNull String object) throws JSONException {
        JSONObject jSONObject = new JSONObject((String)object);
        object = new ECommercePrice(ECommerceAmountSerializer.fromJsonString(jSONObject.getString("Fiat")));
        if (jSONObject.has("InternalComponents")) {
            ((ECommercePrice)object).setInternalComponents(ECommercePriceSerializer.getInternalComponents(jSONObject.getJSONArray("InternalComponents")));
        }
        return object;
    }

    @NonNull
    private static List<ECommerceAmount> getInternalComponents(@NonNull JSONArray jSONArray) throws JSONException {
        ArrayList<ECommerceAmount> arrayList = new ArrayList<ECommerceAmount>(jSONArray.length());
        for (int i14 = 0; i14 < jSONArray.length(); ++i14) {
            arrayList.add(ECommerceAmountSerializer.fromJsonString(jSONArray.getString(i14)));
        }
        return arrayList;
    }
}

