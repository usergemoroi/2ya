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
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class ECommerceScreenSerializer {
    private ECommerceScreenSerializer() {
    }

    @NonNull
    public static ECommerceScreen fromJsonString(@NonNull String string2) throws JSONException {
        string2 = new JSONObject(string2);
        ECommerceScreen eCommerceScreen = new ECommerceScreen();
        if (string2.has("CategoriesPath")) {
            eCommerceScreen.setCategoriesPath(ECommerceScreenSerializer.getCategoriesPath(string2.getJSONArray("CategoriesPath")));
        }
        if (string2.has("Name")) {
            eCommerceScreen.setName(string2.getString("Name"));
        }
        if (string2.has("Payload")) {
            eCommerceScreen.setPayload(ECommerceScreenSerializer.getPayload(string2.getJSONObject("Payload")));
        }
        if (string2.has("SearchQuery")) {
            eCommerceScreen.setSearchQuery(string2.getString("SearchQuery"));
        }
        return eCommerceScreen;
    }

    @NonNull
    private static List<String> getCategoriesPath(@NonNull JSONArray jSONArray) throws JSONException {
        ArrayList<String> arrayList = new ArrayList<String>(jSONArray.length());
        for (int i14 = 0; i14 < jSONArray.length(); ++i14) {
            arrayList.add(jSONArray.getString(i14));
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

