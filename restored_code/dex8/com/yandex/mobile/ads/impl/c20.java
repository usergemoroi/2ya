/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  com.yandex.div.core.DivActionHandler
 *  com.yandex.div.core.DivViewFacade
 *  com.yandex.div.json.expressions.Expression
 *  com.yandex.div.json.expressions.ExpressionResolver
 *  com.yandex.div2.ap
 *  com.yandex.div2.j1
 *  com.yandex.mobile.ads.impl.b30
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.c30
 *  com.yandex.mobile.ads.impl.d20
 *  com.yandex.mobile.ads.impl.f72
 *  com.yandex.mobile.ads.impl.fo
 *  com.yandex.mobile.ads.impl.n20
 *  com.yandex.mobile.ads.impl.nr
 *  com.yandex.mobile.ads.impl.x2
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.ap;
import com.yandex.div2.j1;
import com.yandex.mobile.ads.impl.b30;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.c30;
import com.yandex.mobile.ads.impl.d20;
import com.yandex.mobile.ads.impl.f72;
import com.yandex.mobile.ads.impl.fo;
import com.yandex.mobile.ads.impl.lh1;
import com.yandex.mobile.ads.impl.n20;
import com.yandex.mobile.ads.impl.nr;
import com.yandex.mobile.ads.impl.x2;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

public final class c20
extends DivActionHandler {
    @NotNull
    private final nr a;
    @NotNull
    private final d20 b;
    @NotNull
    private final n20 c;
    @NotNull
    private final c30 d;
    @NotNull
    private final b30 e;

    public /* synthetic */ c20(Context context, x2 x22, b8 b82, nr nr2, d20 d202, n20 n202) {
        this(nr2, d202, n202, new c30(new lh1(context, x22, f72.d)), new b30(x22, b82));
    }

    @JvmOverloads
    public c20(@NotNull nr nr2, @NotNull d20 d202, @NotNull n20 n202, @NotNull c30 c302, @NotNull b30 b302) {
        this.a = nr2;
        this.b = d202;
        this.c = n202;
        this.d = c302;
        this.e = b302;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean a(JSONObject jSONObject, Uri uri, DivViewFacade divViewFacade) {
        if (!y.e(uri.getScheme(), "mobileads")) return false;
        String string2 = uri.getHost();
        if (string2 == null) return this.b.a(uri);
        int n10 = string2.hashCode();
        boolean bl2 = true;
        if (n10 != 94750088) {
            if (n10 != 866535483) {
                if (n10 != 986975867) {
                    if (n10 != 1270469668 || !string2.equals("trackUrl")) return this.b.a(uri);
                    this.d.a(uri);
                    return bl2;
                } else {
                    if (!string2.equals("trackAnalytics")) return this.b.a(uri);
                    this.e.a(uri, jSONObject);
                }
                return bl2;
            } else {
                if (!string2.equals("closeAd")) return this.b.a(uri);
                this.a.e();
            }
            return bl2;
        } else {
            if (!string2.equals("click")) return this.b.a(uri);
            this.c.a(uri, divViewFacade.getView());
        }
        return bl2;
    }

    public final void a(@Nullable fo fo3) {
        this.c.a(fo3);
    }

    public final boolean handleAction(@NotNull ap ap2, @NotNull DivViewFacade divViewFacade, @NotNull ExpressionResolver expressionResolver) {
        boolean bl2;
        boolean bl3 = super.handleAction(ap2, divViewFacade, expressionResolver);
        boolean bl4 = bl2 = true;
        if (!bl3) {
            Expression expression = ap2.getUrl();
            bl4 = expression != null && this.a(ap2.getPayload(), (Uri)expression.evaluate(expressionResolver), divViewFacade) ? bl2 : false;
        }
        return bl4;
    }

    public final boolean handleAction(@NotNull j1 j12, @NotNull DivViewFacade divViewFacade, @NotNull ExpressionResolver expressionResolver) {
        boolean bl2;
        boolean bl3 = super.handleAction(j12, divViewFacade, expressionResolver);
        boolean bl4 = bl2 = true;
        if (!bl3) {
            Expression expression = j12.k;
            bl4 = expression != null && this.a(j12.f, (Uri)expression.evaluate(expressionResolver), divViewFacade) ? bl2 : false;
        }
        return bl4;
    }
}

