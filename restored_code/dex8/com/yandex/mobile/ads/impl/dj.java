/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.cj
 *  com.yandex.mobile.ads.impl.v92
 *  com.yandex.mobile.ads.impl.w61
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cj;
import com.yandex.mobile.ads.impl.v92;
import com.yandex.mobile.ads.impl.w61;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

public final class dj
implements v92 {
    @NotNull
    private final cj a;

    public dj(@NotNull cj cj3) {
        this.a = cj3;
    }

    @NotNull
    public final String a(@NotNull String string2, @NotNull JSONObject jSONObject) throws JSONException, w61 {
        if ((string2 = jSONObject.optString(string2)) != null && string2.length() != 0 && !y.e(string2, "null")) {
            this.a.getClass();
            string2 = cj.b((String)string2);
            if (string2 != null && string2.length() != 0) {
                return string2;
            }
            throw new w61("Native Ad json has attribute with broken base64 encoding");
        }
        throw new w61("Native Ad json has not required attributes");
    }
}

