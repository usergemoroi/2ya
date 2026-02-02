/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bj0
 *  com.yandex.mobile.ads.impl.hg
 *  com.yandex.mobile.ads.impl.jj0
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.w61
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bj0;
import com.yandex.mobile.ads.impl.hg;
import com.yandex.mobile.ads.impl.jj0;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.w61;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

public final class mj0
implements hg<jj0> {
    @NotNull
    private final bj0 a;

    public /* synthetic */ mj0() {
        this(new bj0());
    }

    @JvmOverloads
    public mj0(@NotNull bj0 bj02) {
        this.a = bj02;
    }

    @NotNull
    public final jj0 b(@NotNull JSONObject jSONObject) throws JSONException, w61 {
        if (jSONObject.has("value") && !jSONObject.isNull("value")) {
            jSONObject = jSONObject.getJSONObject("value");
            return this.a.a(jSONObject);
        }
        int n10 = op0.b;
        throw new w61("Native Ad json has not required attributes");
    }
}

