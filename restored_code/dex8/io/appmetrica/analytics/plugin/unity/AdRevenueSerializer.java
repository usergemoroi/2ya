/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.plugin.unity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AdType;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final class AdRevenueSerializer {
    private AdRevenueSerializer() {
    }

    @Nullable
    private static AdType GetAdType(@NonNull String string2) {
        string2.hashCode();
        int n10 = string2.hashCode();
        int n13 = -1;
        switch (n10) {
            default: {
                break;
            }
            case 1982491468: {
                if (!string2.equals("Banner")) break;
                n13 = 6;
                break;
            }
            case 0x33E3B3EB: {
                if (!string2.equals("AppOpen")) break;
                n13 = 5;
                break;
            }
            case 769047372: {
                if (!string2.equals("Interstitial")) break;
                n13 = 4;
                break;
            }
            case 76517104: {
                if (!string2.equals("Other")) break;
                n13 = 3;
                break;
            }
            case 2406691: {
                if (!string2.equals("Mrec")) break;
                n13 = 2;
                break;
            }
            case -174936018: {
                if (!string2.equals("Rewarded")) break;
                n13 = 1;
                break;
            }
            case -1968751561: {
                if (!string2.equals("Native")) break;
                n13 = 0;
            }
        }
        switch (n13) {
            default: {
                return null;
            }
            case 6: {
                return AdType.BANNER;
            }
            case 5: {
                return AdType.APP_OPEN;
            }
            case 4: {
                return AdType.INTERSTITIAL;
            }
            case 3: {
                return AdType.OTHER;
            }
            case 2: {
                return AdType.MREC;
            }
            case 1: {
                return AdType.REWARDED;
            }
            case 0: 
        }
        return AdType.NATIVE;
    }

    @NonNull
    public static AdRevenue fromJsonString(@NonNull String object) throws JSONException {
        JSONObject jSONObject = new JSONObject((String)object);
        object = AdRevenue.newBuilder(new BigDecimal(jSONObject.getString("AdRevenue")), Currency.getInstance(jSONObject.getString("Currency")));
        if (jSONObject.has("AdNetwork")) {
            ((AdRevenue.Builder)object).withAdNetwork(jSONObject.getString("AdNetwork"));
        }
        if (jSONObject.has("AdPlacementId")) {
            ((AdRevenue.Builder)object).withAdPlacementId(jSONObject.getString("AdPlacementId"));
        }
        if (jSONObject.has("AdPlacementName")) {
            ((AdRevenue.Builder)object).withAdPlacementName(jSONObject.getString("AdPlacementName"));
        }
        if (jSONObject.has("AdType")) {
            ((AdRevenue.Builder)object).withAdType(AdRevenueSerializer.GetAdType(jSONObject.getString("AdType")));
        }
        if (jSONObject.has("AdUnitId")) {
            ((AdRevenue.Builder)object).withAdUnitId(jSONObject.getString("AdUnitId"));
        }
        if (jSONObject.has("AdUnitName")) {
            ((AdRevenue.Builder)object).withAdUnitName(jSONObject.getString("AdUnitName"));
        }
        if (jSONObject.has("Payload")) {
            ((AdRevenue.Builder)object).withPayload(AdRevenueSerializer.getPayload(jSONObject.getJSONObject("Payload")));
        }
        if (jSONObject.has("Precision")) {
            ((AdRevenue.Builder)object).withPrecision(jSONObject.getString("Precision"));
        }
        return ((AdRevenue.Builder)object).build();
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

