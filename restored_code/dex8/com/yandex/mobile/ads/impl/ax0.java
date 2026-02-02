/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bj0
 *  com.yandex.mobile.ads.impl.hg
 *  com.yandex.mobile.ads.impl.jf2
 *  com.yandex.mobile.ads.impl.jj0
 *  com.yandex.mobile.ads.impl.jw0
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.pj0
 *  com.yandex.mobile.ads.impl.su0
 *  com.yandex.mobile.ads.impl.w61
 *  com.yandex.mobile.ads.impl.wb2
 *  com.yandex.mobile.ads.impl.zw0
 *  kotlin.collections.t
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bj0;
import com.yandex.mobile.ads.impl.hg;
import com.yandex.mobile.ads.impl.jf2;
import com.yandex.mobile.ads.impl.jj0;
import com.yandex.mobile.ads.impl.jw0;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.pj0;
import com.yandex.mobile.ads.impl.su0;
import com.yandex.mobile.ads.impl.w61;
import com.yandex.mobile.ads.impl.wb2;
import com.yandex.mobile.ads.impl.zw0;
import java.util.Collection;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ax0
implements hg<zw0> {
    @NotNull
    private final jw0 a;
    @NotNull
    private final jf2 b;
    @NotNull
    private final bj0 c;
    @NotNull
    private final pj0 d;

    @JvmOverloads
    public ax0(@NotNull jw0 jw02, @NotNull jf2 jf22, @NotNull bj0 bj02, @NotNull pj0 pj02) {
        this.a = jw02;
        this.b = jf22;
        this.c = bj02;
        this.d = pj02;
    }

    public final Object a(JSONObject object) {
        block6: {
            jj0 jj02;
            Object object2;
            su0 su02;
            Object var6_4;
            JSONObject jSONObject;
            block8: {
                block7: {
                    if (!object.has("value") || object.isNull("value")) break block6;
                    jSONObject = object.getJSONObject("value");
                    object = this.a;
                    boolean bl2 = jSONObject.has("media");
                    var6_4 = null;
                    object = bl2 && !jSONObject.isNull("media") ? object.a(jSONObject.getJSONObject("media")) : null;
                    su02 = (su0)object;
                    object = jSONObject.optJSONArray("images");
                    object = object != null ? this.d.a((JSONArray)object) : null;
                    object2 = this.c;
                    jj02 = jSONObject.has("image") && !jSONObject.isNull("image") ? object2.a(jSONObject.getJSONObject("image")) : null;
                    if (object == null) break block7;
                    object2 = object;
                    if (!object.isEmpty()) break block8;
                }
                object2 = object;
                if (jj02 != null) {
                    object2 = t.s((Object[])new Object[]{jj02});
                }
            }
            object = this.b;
            object = jSONObject.has("video") && !jSONObject.isNull("video") ? object.a(jSONObject.getJSONObject("video")) : null;
            jj02 = (wb2)object;
            if (su02 == null && (object2 == null || object2.isEmpty()) && jj02 == null) {
                int n10 = op0.b;
                throw new w61("Native Ad json has not required attributes");
            }
            object = var6_4;
            if (object2 != null) {
                object = t.h1((Collection)object2);
            }
            return new zw0(su02, (wb2)jj02, (List)object);
        }
        int n12 = op0.b;
        throw new w61("Native Ad json has not required attributes");
    }
}

