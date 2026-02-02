/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.h72
 *  com.yandex.mobile.ads.impl.s00
 *  com.yandex.mobile.ads.impl.t
 *  com.yandex.mobile.ads.impl.t20
 *  com.yandex.mobile.ads.impl.w61
 *  com.yandex.mobile.ads.impl.x
 *  com.yandex.mobile.ads.impl.x00
 *  com.yandex.mobile.ads.impl.y20
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.f20;
import com.yandex.mobile.ads.impl.h72;
import com.yandex.mobile.ads.impl.s00;
import com.yandex.mobile.ads.impl.t;
import com.yandex.mobile.ads.impl.t20;
import com.yandex.mobile.ads.impl.w61;
import com.yandex.mobile.ads.impl.x;
import com.yandex.mobile.ads.impl.x00;
import com.yandex.mobile.ads.impl.y20;
import java.util.ArrayList;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class h20
implements x<t> {
    @NotNull
    private final x00 a;
    @NotNull
    private final y20 b;
    @NotNull
    private final h72 c;
    private final boolean d;

    public h20(@NotNull x00 x002, @NotNull y20 y202, @NotNull h72 h722, boolean bl2) {
        this.a = x002;
        this.b = y202;
        this.c = h722;
        this.d = bl2;
    }

    @NotNull
    public final t a(@NotNull JSONObject object) throws JSONException, w61 {
        String string2 = object.optString("type");
        if (string2 != null && string2.length() != 0 && !y.e(string2, "null")) {
            this.c.getClass();
            JSONArray jSONArray = object.getJSONArray("trackingUrls");
            ArrayList<String> arrayList = new ArrayList<String>();
            int n10 = jSONArray.length();
            for (int i14 = 0; i14 < n10; ++i14) {
                arrayList.add(jSONArray.getString(i14));
            }
            object = object.optJSONObject("design");
            jSONArray = null;
            if ((object = object != null ? this.a.a(object) : null) != null) {
                jSONArray = this.b.a((s00)object, this.d);
            }
            if (jSONArray != null) {
                return new f20(string2, (t20)jSONArray, arrayList);
            }
            throw new w61("Native Ad json has not required attributes");
        }
        throw new w61("Native Ad json has not required attributes");
    }
}

