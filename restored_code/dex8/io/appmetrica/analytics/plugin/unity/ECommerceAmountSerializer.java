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
import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

final class ECommerceAmountSerializer {
    private ECommerceAmountSerializer() {
    }

    @NonNull
    public static ECommerceAmount fromJsonString(@NonNull String string2) throws JSONException {
        string2 = new JSONObject(string2);
        return new ECommerceAmount(new BigDecimal(string2.getString("Amount")), string2.getString("Unit"));
    }
}

