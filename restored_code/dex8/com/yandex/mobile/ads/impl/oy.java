/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.dk1
 *  com.yandex.mobile.ads.impl.g72
 *  com.yandex.mobile.ads.impl.t
 *  com.yandex.mobile.ads.impl.w61
 *  com.yandex.mobile.ads.impl.x
 *  com.yandex.mobile.ads.impl.x82
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dk1;
import com.yandex.mobile.ads.impl.g72;
import com.yandex.mobile.ads.impl.my;
import com.yandex.mobile.ads.impl.t;
import com.yandex.mobile.ads.impl.w61;
import com.yandex.mobile.ads.impl.x;
import com.yandex.mobile.ads.impl.x82;
import java.util.List;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

public final class oy
implements x<my> {
    @NotNull
    private final x82 a;
    @NotNull
    private final dk1 b;
    @NotNull
    private final g72 c;

    public oy(@NotNull x82 x822, @NotNull dk1 dk12, @NotNull g72 g722) {
        this.a = x822;
        this.b = dk12;
        this.c = g722;
    }

    public final t a(JSONObject jSONObject) {
        String string2 = jSONObject.optString("type");
        if (string2 != null && string2.length() != 0 && !y.e(string2, "null")) {
            this.a.getClass();
            String string3 = x82.a((String)"fallbackUrl", (JSONObject)jSONObject);
            this.c.getClass();
            List list = g72.a((JSONObject)jSONObject);
            jSONObject = jSONObject.optJSONArray("preferredPackages");
            return new my(string2, string3, list, this.b.a((JSONArray)jSONObject));
        }
        throw new w61("Native Ad json has not required attributes");
    }
}

