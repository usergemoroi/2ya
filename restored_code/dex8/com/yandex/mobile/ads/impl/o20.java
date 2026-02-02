/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  com.yandex.div.core.extension.DivExtensionHandler
 *  com.yandex.div.core.view2.Div2View
 *  com.yandex.div.json.expressions.ExpressionResolver
 *  com.yandex.div2.f7
 *  com.yandex.mobile.ads.impl.do
 *  com.yandex.mobile.ads.impl.n20
 *  com.yandex.mobile.ads.impl.q20
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.div.core.extension.DivExtensionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.f7;
import com.yandex.mobile.ads.impl.do;
import com.yandex.mobile.ads.impl.n20;
import com.yandex.mobile.ads.impl.q20;
import org.jetbrains.annotations.NotNull;

public final class o20
implements DivExtensionHandler {
    @NotNull
    private final n20 a;
    @NotNull
    private final q20 b;

    public /* synthetic */ o20(n20 n202) {
        this(n202, new q20(0));
    }

    public o20(@NotNull n20 n202, @NotNull q20 q202) {
        this.a = n202;
        this.b = q202;
    }

    public final void bindView(@NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull f7 f73) {
        div2View = view.getContext();
        expressionResolver = this.b.a(f73);
        if (expressionResolver != null) {
            div2View = new do((Context)div2View, (View.OnClickListener)new /* Unavailable Anonymous Inner Class!! */);
            view.setOnTouchListener((View.OnTouchListener)div2View);
            view.setOnClickListener((View.OnClickListener)div2View);
        }
    }

    public final boolean matches(@NotNull f7 f73) {
        boolean bl2 = this.b.a(f73) != null;
        return bl2;
    }

    public final void unbindView(@NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull View view, @NotNull f7 f73) {
        view.setOnTouchListener(null);
        view.setOnClickListener(null);
    }
}

