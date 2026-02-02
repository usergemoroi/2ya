/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.hg
 *  com.yandex.mobile.ads.impl.oo
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.w61
 *  com.yandex.mobile.ads.impl.x82
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.hg;
import com.yandex.mobile.ads.impl.oo;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.w61;
import com.yandex.mobile.ads.impl.x82;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public final class po
implements hg<oo> {
    @NotNull
    private final x82 a;

    public po(@NotNull x82 x822) {
        this.a = x822;
    }

    public final Object a(JSONObject jSONObject) {
        int n10;
        String string2 = (new String[]{"value"})[0];
        if (jSONObject.has(string2) && !jSONObject.isNull(string2)) {
            jSONObject = jSONObject.getJSONObject("value");
            for (n10 = 0; n10 < 2; ++n10) {
                string2 = (new String[]{"url", "size"})[n10];
                if (jSONObject.has(string2) && !jSONObject.isNull(string2)) {
                    continue;
                }
                n10 = op0.b;
                throw new w61("Native Ad json has not required attributes");
            }
            this.a.getClass();
            string2 = x82.a((String)"url", (JSONObject)jSONObject);
            return new oo(jSONObject.optInt("size"), string2);
        }
        n10 = op0.b;
        throw new w61("Native Ad json has not required attributes");
    }
}

