/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bj0
 *  com.yandex.mobile.ads.impl.c12
 *  com.yandex.mobile.ads.impl.hg
 *  com.yandex.mobile.ads.impl.w61
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bj0;
import com.yandex.mobile.ads.impl.c12;
import com.yandex.mobile.ads.impl.hg;
import com.yandex.mobile.ads.impl.w61;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

public final class d12
implements hg<c12> {
    @NotNull
    private final bj0 a;

    public /* synthetic */ d12() {
        this(new bj0());
    }

    public d12(@NotNull bj0 bj02) {
        this.a = bj02;
    }

    @NotNull
    public final c12 b(@NotNull JSONObject jSONObject) throws JSONException, w61 {
        String string2 = jSONObject.optString("title");
        if (string2 != null && string2.length() != 0 && !y.e(string2, "null")) {
            jSONObject = jSONObject.getJSONObject("image");
            return new c12(this.a.a(jSONObject), string2);
        }
        throw new w61("Native Ad json has not required attributes");
    }
}

