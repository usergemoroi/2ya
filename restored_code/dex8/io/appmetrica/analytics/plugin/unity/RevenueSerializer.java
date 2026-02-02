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
import io.appmetrica.analytics.Revenue;
import java.util.Currency;
import org.json.JSONException;
import org.json.JSONObject;

final class RevenueSerializer {
    private RevenueSerializer() {
    }

    @NonNull
    public static Revenue fromJsonString(@NonNull String object) throws JSONException {
        JSONObject jSONObject = new JSONObject((String)object);
        Revenue.Builder builder = Revenue.newBuilder(jSONObject.getLong("PriceMicros"), Currency.getInstance(jSONObject.getString("Currency")));
        if (jSONObject.has("Payload")) {
            builder.withPayload(jSONObject.getString("Payload"));
        }
        if (jSONObject.has("ProductID")) {
            builder.withProductID(jSONObject.getString("ProductID"));
        }
        if (jSONObject.has("Quantity")) {
            builder.withQuantity(jSONObject.getInt("Quantity"));
        }
        if (jSONObject.has("ReceiptData") || jSONObject.has("Signature")) {
            object = Revenue.Receipt.newBuilder();
            if (jSONObject.has("ReceiptData")) {
                ((Revenue.Receipt.Builder)object).withData(jSONObject.getString("ReceiptData"));
            }
            if (jSONObject.has("Signature")) {
                ((Revenue.Receipt.Builder)object).withSignature(jSONObject.getString("Signature"));
            }
            builder.withReceipt(((Revenue.Receipt.Builder)object).build());
        }
        return builder.build();
    }
}

