/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.fz0
 *  com.yandex.mobile.ads.impl.kr1
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.qq0
 *  com.yandex.mobile.ads.impl.uz0
 *  com.yandex.mobile.ads.impl.wc1
 *  com.yandex.mobile.ads.impl.zq1
 *  kotlin.collections.s0
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fz0;
import com.yandex.mobile.ads.impl.kr1;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.qq0;
import com.yandex.mobile.ads.impl.uz0;
import com.yandex.mobile.ads.impl.wc1;
import com.yandex.mobile.ads.impl.xc1;
import com.yandex.mobile.ads.impl.zq1;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

public final class gz0
implements kr1<fz0> {
    @NotNull
    private final wc1 a;
    @NotNull
    private final uz0 b;

    public /* synthetic */ gz0() {
        this(new xc1(), new uz0());
    }

    public gz0(@NotNull wc1 wc12, @NotNull uz0 uz02) {
        this.a = wc12;
        this.b = uz02;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public final fz0 b(@NotNull zq1 var1_1) {
        var6_4 = this.a.a((zq1)var1_1);
        var4_5 = null;
        var1_1 = var4_5;
        if (var6_4 == null) return var1_1;
        var1_1 = var4_5;
        if (var6_4.length() <= 0) return var1_1;
        try {
            var5_6 = new JSONObject((String)var6_4);
        }
        catch (JSONException var1_3) {
            var2_7 = op0.b;
            return var4_5;
        }
        try {
            var2_7 = qq0.b;
            var7_9 = var5_6.getJSONObject("passback_parameters");
            var1_1 = s0.d();
            var6_4 = var7_9.keys();
            while (var6_4.hasNext()) {
                var8_10 = (String)var6_4.next();
                var1_1.put(var8_10, var7_9.getString(var8_10));
            }
        }
        catch (JSONException var1_2) {
            ** GOTO lbl41
        }
        var6_4 = s0.c((Map)var1_1);
        var1_1 = var4_5;
        {
            if ((var6_4.isEmpty() ^ true) == false) return var1_1;
            var1_1 = var5_6.getJSONArray("networks");
            var5_6 = new ArrayList();
            var3_11 = var1_1.length();
            for (var2_7 = 0; var2_7 < var3_11; ++var2_7) {
                var7_9 = var1_1.getJSONObject(var2_7);
                if ((var7_9 = this.b.a(var7_9)) == null) continue;
                var5_6.add(var7_9);
            }
            var1_1 = var4_5;
        }
        {
            if (var5_6.isEmpty() != false) return var1_1;
            return new fz0((ArrayList)var5_6, (Map)var6_4);
lbl41:
            // 1 sources

            var2_8 = op0.b;
            var5_6 = new JSONException(var1_2.getMessage());
            throw var5_6;
        }
    }
}

