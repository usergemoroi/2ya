/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.widget.ProgressBar
 *  com.yandex.div.core.DivCustomContainerViewAdapter
 *  com.yandex.div.core.state.DivStatePath
 *  com.yandex.div.core.view2.Div2View
 *  com.yandex.div.json.expressions.ExpressionResolver
 *  com.yandex.div2.v9
 *  com.yandex.mobile.ads.R$drawable
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.v9;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

public final class u10
implements DivCustomContainerViewAdapter {
    public final void bindView(@NotNull View view, @NotNull v9 v94, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull DivStatePath divStatePath) {
    }

    @NotNull
    public final View createView(@NotNull v9 object, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull DivStatePath divStatePath) {
        int n10;
        expressionResolver = div2View.getContext();
        div2View = null;
        expressionResolver = new ProgressBar((Context)expressionResolver, null, 16842872);
        divStatePath = object.i;
        if (divStatePath != null && divStatePath.has("progress_color")) {
            divStatePath = object.i;
            object = div2View;
            if (divStatePath != null) {
                object = divStatePath.getString("progress_color");
            }
        } else {
            object = "#000000";
        }
        try {
            n10 = Color.parseColor((String)object);
        }
        catch (Throwable throwable) {
            n10 = -16777216;
        }
        object = expressionResolver.getContext().getDrawable(R.drawable.monetization_ads_internal_circular_close_progress);
        if (object != null) {
            object.setColorFilter((ColorFilter)new PorterDuffColorFilter(n10, PorterDuff.Mode.SRC_IN));
        }
        expressionResolver.setProgressDrawable((Drawable)object);
        return expressionResolver;
    }

    public final boolean isCustomTypeSupported(@NotNull String string2) {
        return y.e(string2, "close_progress_view");
    }

    public final void release(@NotNull View view, @NotNull v9 v94) {
    }
}

