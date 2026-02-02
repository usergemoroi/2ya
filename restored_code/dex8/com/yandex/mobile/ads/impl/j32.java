/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.hg
 *  com.yandex.mobile.ads.impl.w61
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.hg;
import com.yandex.mobile.ads.impl.w61;
import kotlin.jvm.internal.y;
import org.json.JSONObject;

public final class j32
implements hg<String> {
    public final Object a(JSONObject object) {
        if ((object = object.optString("value")) != null && ((String)object).length() != 0 && !y.e(object, "null")) {
            return object;
        }
        throw new w61("Native Ad json has not required attributes");
    }
}

