/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.monetization.ads.nativeads.CustomizableMediaView
 *  com.yandex.div.core.DivCustomContainerViewAdapter
 *  com.yandex.div.core.state.DivStatePath
 *  com.yandex.div.core.view2.Div2View
 *  com.yandex.div.json.expressions.ExpressionResolver
 *  com.yandex.div2.v9
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.v9;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

public final class r10
implements DivCustomContainerViewAdapter {
    public final void bindView(@NotNull View view, @NotNull v9 v94, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull DivStatePath divStatePath) {
    }

    @NotNull
    public final View createView(@NotNull v9 v94, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull DivStatePath divStatePath) {
        return new CustomizableMediaView(div2View.getContext());
    }

    public final boolean isCustomTypeSupported(@NotNull String string2) {
        return y.e("media", string2);
    }

    public final void release(@NotNull View view, @NotNull v9 v94) {
    }
}

