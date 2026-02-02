/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.k20
 *  com.yandex.mobile.ads.impl.l20
 *  com.yandex.mobile.ads.impl.v20
 *  kotlin.jvm.functions.p
 *  kotlin.jvm.internal.a0
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.k20;
import com.yandex.mobile.ads.impl.l20;
import com.yandex.mobile.ads.impl.v20;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.a0;
import kotlin.k0;
import org.json.JSONException;
import org.json.JSONObject;

final class u20
extends a0
implements p<JSONObject, l20, k0> {
    final v20 b;
    final List<k20> c;

    u20(v20 v202, ArrayList arrayList) {
        this.b = v202;
        this.c = arrayList;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        JSONObject jSONObject = (JSONObject)object;
        l20 l202 = (l20)object2;
        this.b.getClass();
        boolean bl2 = jSONObject.has("view_name");
        Object var4_7 = null;
        object = var4_7;
        if (bl2) {
            try {
                object2 = jSONObject.get("view_name");
            }
            catch (JSONException jSONException) {
                object2 = null;
            }
            object = var4_7;
            if (object2 instanceof String) {
                object = (String)object2;
            }
        }
        if (object != null) {
            object = new k20(l202, (String)object);
            this.c.add((k20)object);
        }
        return k0.a;
    }
}

