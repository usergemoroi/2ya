/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.t
 *  com.yandex.mobile.ads.impl.w61
 *  com.yandex.mobile.ads.impl.x
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.t;
import com.yandex.mobile.ads.impl.w61;
import com.yandex.mobile.ads.impl.x;
import com.yandex.mobile.ads.impl.zo;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

public final class bp
implements x<t> {
    @NotNull
    public final t a(@NotNull JSONObject object) throws JSONException, w61 {
        if ((object = object.optString("type")) != null && ((String)object).length() != 0 && !y.e(object, "null")) {
            return new zo((String)object);
        }
        throw new w61("Native Ad json has not required attributes");
    }
}

