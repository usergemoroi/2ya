/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.hg
 *  com.yandex.mobile.ads.impl.jj0
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.ta0
 *  com.yandex.mobile.ads.impl.w61
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.hg;
import com.yandex.mobile.ads.impl.jj0;
import com.yandex.mobile.ads.impl.mj0;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.ta0;
import com.yandex.mobile.ads.impl.w61;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public final class va0
implements hg<ta0> {
    @NotNull
    private final mj0 a;

    public va0(@NotNull mj0 mj02) {
        this.a = mj02;
    }

    public final Object a(JSONObject object) {
        if (object.has("value")) {
            object = !object.isNull("value") ? this.a.b((JSONObject)object) : null;
            return new ta0((jj0)object);
        }
        int n10 = op0.b;
        throw new w61("Native Ad json has not required attributes");
    }
}

