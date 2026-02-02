/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.hg
 *  com.yandex.mobile.ads.impl.ur1
 *  com.yandex.mobile.ads.impl.w61
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.hg;
import com.yandex.mobile.ads.impl.ur1;
import com.yandex.mobile.ads.impl.w61;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public final class ud1
implements hg<String> {
    @NotNull
    private final ur1 a;

    @JvmOverloads
    public ud1(@NotNull ur1 ur12) {
        this.a = ur12;
    }

    public final Object a(JSONObject object) {
        String string2 = object.optString("name");
        if (string2 != null && string2.length() != 0 && !y.e(string2, "null")) {
            String string3 = object.optString("value");
            if (string3 != null && string3.length() != 0 && !y.e(string3, "null")) {
                object = string3;
                if (y.e("review_count", string2)) {
                    object = this.a.a(string3);
                }
                return object;
            }
            throw new w61("Native Ad json has not required attributes");
        }
        throw new w61("Native Ad json has not required attributes");
    }
}

