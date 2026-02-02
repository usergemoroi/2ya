/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.b12
 *  com.yandex.mobile.ads.impl.hj
 *  com.yandex.mobile.ads.impl.t
 *  com.yandex.mobile.ads.impl.w61
 *  com.yandex.mobile.ads.impl.x
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.b12;
import com.yandex.mobile.ads.impl.hj;
import com.yandex.mobile.ads.impl.t;
import com.yandex.mobile.ads.impl.w61;
import com.yandex.mobile.ads.impl.x;
import com.yandex.mobile.ads.impl.x02;
import java.util.ArrayList;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

public final class e12
implements x<x02> {
    @NotNull
    private final hj a;
    @NotNull
    private final b12 b;

    @JvmOverloads
    public e12(@NotNull hj hj3, @NotNull b12 b122) {
        this.a = hj3;
        this.b = b122;
    }

    public final t a(JSONObject object) {
        String string2 = object.optString("type");
        if (string2 != null && string2.length() != 0 && !y.e(string2, "null")) {
            JSONArray jSONArray = object.getJSONArray("items");
            object = new ArrayList();
            int n10 = jSONArray.length();
            for (int i14 = 0; i14 < n10; ++i14) {
                JSONObject jSONObject = jSONArray.getJSONObject(i14);
                ((ArrayList)object).add(this.b.a(jSONObject, this.a));
            }
            if (!((ArrayList)object).isEmpty()) {
                return new x02(string2, (ArrayList)object);
            }
            throw new w61("Native Ad json has not required attributes");
        }
        throw new w61("Native Ad json has not required attributes");
    }
}

