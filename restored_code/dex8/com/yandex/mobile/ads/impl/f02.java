/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.yandex.div.core.extension.DivExtensionHandler
 *  com.yandex.div.core.view2.Div2View
 *  com.yandex.div.json.expressions.ExpressionResolver
 *  com.yandex.div2.ca
 *  com.yandex.div2.f7
 *  com.yandex.div2.pb
 *  com.yandex.mobile.ads.impl.a20
 *  com.yandex.mobile.ads.impl.h02
 *  com.yandex.mobile.ads.impl.q70
 *  com.yandex.mobile.ads.impl.r70
 *  com.yandex.mobile.ads.impl.sg
 *  com.yandex.mobile.ads.impl.t61
 *  com.yandex.mobile.ads.impl.u61
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.div.core.extension.DivExtensionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.ca;
import com.yandex.div2.f7;
import com.yandex.div2.pb;
import com.yandex.mobile.ads.impl.a20;
import com.yandex.mobile.ads.impl.c02;
import com.yandex.mobile.ads.impl.h02;
import com.yandex.mobile.ads.impl.q70;
import com.yandex.mobile.ads.impl.r70;
import com.yandex.mobile.ads.impl.sg;
import com.yandex.mobile.ads.impl.t61;
import com.yandex.mobile.ads.impl.u61;
import com.yandex.mobile.ads.impl.wp1;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

public final class f02
implements DivExtensionHandler {
    @NotNull
    private final wp1 a;
    @NotNull
    private final a20 b;
    @NotNull
    private final q70 c;
    @NotNull
    private final r70 d;
    @NotNull
    private final ConcurrentHashMap<ca, h02> e;

    public /* synthetic */ f02(wp1 wp12) {
        this(wp12, new a20(), new q70(), new r70());
    }

    public f02(@NotNull wp1 wp12, @NotNull a20 a202, @NotNull q70 q702, @NotNull r70 r702) {
        this.a = wp12;
        this.b = a202;
        this.c = q702;
        this.d = r702;
        this.e = new ConcurrentHashMap();
    }

    public final void a(@NotNull ca ca2, @NotNull c02 c022) {
        c022 = new h02(c022, this.a, new a20(), new q70(), new sg((Collection)u61.c((t61)c022)));
        this.e.put(ca2, (h02)c022);
    }

    public final void bindView(@NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull f7 f73) {
        expressionResolver = div2View.getDivData();
        if ((expressionResolver = (h02)this.e.get(expressionResolver)) != null) {
            expressionResolver.a(div2View, view, f73);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean matches(@NotNull f7 object) {
        void var4_11;
        void var1_6;
        boolean bl2;
        this.b.getClass();
        pb pb2 = a20.a((f7)object, (String)"view");
        boolean bl3 = bl2 = false;
        if (pb2 == null) return bl3;
        this.c.getClass();
        JSONObject jSONObject = pb2.b;
        Object var5_16 = null;
        if (jSONObject != null) {
            try {
                Integer n10 = jSONObject.getInt("position");
            }
            catch (JSONException jSONException) {}
        }
        Object var1_5 = null;
        this.d.getClass();
        JSONObject jSONObject2 = pb2.b;
        Object var4_9 = var5_16;
        if (jSONObject2 != null) {
            try {
                String string2 = jSONObject2.getString("view_name");
            }
            catch (JSONException jSONException) {
                Object var4_13 = var5_16;
            }
        }
        bl3 = bl2;
        if (var1_6 == null) return bl3;
        bl3 = bl2;
        if (!y.e("native_ad_view", var4_11)) return bl3;
        return true;
    }

    public final void unbindView(@NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull f7 f73) {
        div2View = div2View.getDivData();
        div2View = (h02)this.e.get(div2View);
    }
}

