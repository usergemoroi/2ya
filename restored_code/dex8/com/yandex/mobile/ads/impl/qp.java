/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  com.yandex.div.core.DivActionHandler
 *  com.yandex.div.core.DivViewFacade
 *  com.yandex.div.json.expressions.Expression
 *  com.yandex.div.json.expressions.ExpressionResolver
 *  com.yandex.div2.j1
 *  com.yandex.mobile.ads.impl.sp
 */
package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.j1;
import com.yandex.mobile.ads.impl.pp;
import com.yandex.mobile.ads.impl.sp;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

public final class qp
extends DivActionHandler {
    @NotNull
    private final sp a;

    public qp(@NotNull pp pp2) {
        this.a = pp2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean handleAction(@NotNull j1 j14, @NotNull DivViewFacade divViewFacade, @NotNull ExpressionResolver expressionResolver) {
        boolean bl2;
        Expression expression = j14.k;
        boolean bl3 = bl2 = false;
        if (expression != null) {
            String string2 = ((Uri)expression.evaluate(expressionResolver)).toString();
            if (y.e(string2, "close_ad")) {
                this.a.a();
                return true;
            }
            bl3 = bl2;
            if (y.e(string2, "close_dialog")) {
                this.a.b();
                return true;
            }
        }
        if (!bl3) return super.handleAction(j14, divViewFacade, expressionResolver);
        return bl3;
    }
}

