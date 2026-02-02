/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Pair
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Pair;
import io.appmetrica.analytics.impl.mm;
import io.appmetrica.analytics.impl.s2;
import io.appmetrica.analytics.impl.t2;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class v2 {
    public static void a(mm mm3, JSONObject object) {
        if ((object = object.optJSONObject("attribution")) != null) {
            ArrayList<Pair> arrayList = new ArrayList<Pair>();
            JSONArray jSONArray = object.optJSONArray("deeplink_conditions");
            if (jSONArray != null) {
                for (int i14 = 0; i14 < jSONArray.length(); ++i14) {
                    Object object2 = jSONArray.optJSONObject(i14);
                    object = null;
                    String string2 = object2.optString("key", null);
                    if (TextUtils.isEmpty((CharSequence)string2)) continue;
                    if ((object2 = object2.optString("value", null)) != null) {
                        object = new s2((String)object2);
                    }
                    arrayList.add(new Pair((Object)string2, object));
                }
            }
            mm3.t = new t2(arrayList);
        }
    }
}

