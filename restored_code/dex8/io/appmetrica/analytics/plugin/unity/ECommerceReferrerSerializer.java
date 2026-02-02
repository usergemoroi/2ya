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
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import io.appmetrica.analytics.plugin.unity.ECommerceScreenSerializer;
import org.json.JSONException;
import org.json.JSONObject;

final class ECommerceReferrerSerializer {
    private ECommerceReferrerSerializer() {
    }

    @NonNull
    public static ECommerceReferrer fromJsonString(@NonNull String object) throws JSONException {
        JSONObject jSONObject = new JSONObject((String)object);
        object = new ECommerceReferrer();
        if (jSONObject.has("Identifier")) {
            ((ECommerceReferrer)object).setIdentifier(jSONObject.getString("Identifier"));
        }
        if (jSONObject.has("Screen")) {
            ((ECommerceReferrer)object).setScreen(ECommerceScreenSerializer.fromJsonString(jSONObject.getString("Screen")));
        }
        if (jSONObject.has("Type")) {
            ((ECommerceReferrer)object).setType(jSONObject.getString("Type"));
        }
        return object;
    }
}

