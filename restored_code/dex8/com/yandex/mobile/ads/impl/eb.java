/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.h72
 *  com.yandex.mobile.ads.impl.rq0
 *  com.yandex.mobile.ads.impl.t
 *  com.yandex.mobile.ads.impl.w61
 *  com.yandex.mobile.ads.impl.x
 *  com.yandex.mobile.ads.impl.x82
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cb;
import com.yandex.mobile.ads.impl.h72;
import com.yandex.mobile.ads.impl.rq0;
import com.yandex.mobile.ads.impl.t;
import com.yandex.mobile.ads.impl.w61;
import com.yandex.mobile.ads.impl.x;
import com.yandex.mobile.ads.impl.x82;
import java.util.ArrayList;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

public final class eb
implements x<t> {
    @NotNull
    private final x82 a;
    @NotNull
    private final h72 b;

    public eb(@NotNull x82 x822, @NotNull h72 h722) {
        this.a = x822;
        this.b = h722;
    }

    @NotNull
    public final t a(@NotNull JSONObject jSONObject) throws JSONException, w61 {
        String string2 = jSONObject.optString("type");
        if (string2 != null && string2.length() != 0 && !y.e(string2, "null")) {
            this.a.getClass();
            String string3 = x82.a((String)"url", (JSONObject)jSONObject);
            Object object = rq0.a((String)"optOutUrl", (JSONObject)jSONObject);
            String string4 = object;
            if (object == null) {
                string4 = "";
            }
            this.b.getClass();
            jSONObject = jSONObject.getJSONArray("trackingUrls");
            object = new ArrayList();
            int n10 = jSONObject.length();
            for (int i14 = 0; i14 < n10; ++i14) {
                ((ArrayList)object).add(jSONObject.getString(i14));
            }
            return new cb(string2, string3, string4, (ArrayList)object);
        }
        throw new w61("Native Ad json has not required attributes");
    }
}

