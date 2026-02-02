/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ia0$a
 *  com.yandex.mobile.ads.impl.t
 *  com.yandex.mobile.ads.impl.w61
 *  com.yandex.mobile.ads.impl.x
 *  com.yandex.mobile.ads.impl.x82
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ia0;
import com.yandex.mobile.ads.impl.t;
import com.yandex.mobile.ads.impl.w61;
import com.yandex.mobile.ads.impl.x;
import com.yandex.mobile.ads.impl.x82;
import java.util.ArrayList;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ka0
implements x<ia0> {
    @NotNull
    private final x82 a;

    public ka0(@NotNull x82 x822) {
        this.a = x822;
    }

    public final t a(JSONObject jSONObject) {
        String string2 = jSONObject.optString("type");
        if (string2 != null && string2.length() != 0 && !y.e(string2, "null")) {
            JSONArray jSONArray = jSONObject.getJSONArray("items");
            ArrayList<ia0.a> arrayList = new ArrayList<ia0.a>();
            int n10 = jSONArray.length();
            for (int i14 = 0; i14 < n10; ++i14) {
                jSONObject = jSONArray.getJSONObject(i14);
                String string3 = jSONObject.optString("title");
                if (string3 != null && string3.length() != 0 && !y.e(string3, "null")) {
                    this.a.getClass();
                    arrayList.add(new /* Unavailable Anonymous Inner Class!! */);
                    continue;
                }
                throw new w61("Native Ad json has not required attributes");
            }
            if (!arrayList.isEmpty()) {
                return new ia0(string2, arrayList);
            }
            throw new w61("Native Ad json has not required attributes");
        }
        throw new w61("Native Ad json has not required attributes");
    }
}

