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
 *  com.yandex.mobile.ads.impl.nr
 */
package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.j1;
import com.yandex.mobile.ads.impl.e10;
import com.yandex.mobile.ads.impl.nr;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

public final class g20
extends DivActionHandler {
    @NotNull
    private final nr a;

    public g20(@NotNull e10 e102) {
        this.a = e102;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean handleAction(@NotNull j1 j12, @NotNull DivViewFacade divViewFacade, @NotNull ExpressionResolver expressionResolver) {
        Expression expression = j12.k;
        if (expression != null && y.e((expression = (Uri)expression.evaluate(expressionResolver)).getScheme(), "mobileads") && y.e(expression.getHost(), "closeDialog")) {
            this.a.e();
            return true;
        } else if (!super.handleAction(j12, divViewFacade, expressionResolver)) return false;
        return true;
    }
}

