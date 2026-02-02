/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.Color
 *  android.view.View
 *  android.widget.ProgressBar
 *  androidx.annotation.ColorInt
 *  com.yandex.div.core.DivCustomContainerViewAdapter
 *  com.yandex.div.core.state.DivStatePath
 *  com.yandex.div.core.view2.Div2View
 *  com.yandex.div.json.expressions.ExpressionResolver
 *  com.yandex.div2.v9
 */
package com.yandex.mobile.ads.impl;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.ColorInt;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.v9;
import kotlin.u;
import kotlin.v;
import org.jetbrains.annotations.NotNull;

public abstract class t10
implements DivCustomContainerViewAdapter {
    @ColorInt
    private static Integer a(v9 object, String object2) {
        block2: {
            object = object.i;
            Object var2_3 = null;
            object = object != null ? object.optString((String)object2) : null;
            try {
                object2 = u.d;
                object = u.b(Color.parseColor((String)object));
            }
            catch (Throwable throwable) {
                object = u.d;
                object = u.b(v.a(throwable));
            }
            if (!u.g(object)) break block2;
            object = var2_3;
        }
        return (Integer)object;
    }

    public final void bindView(@NotNull View view, @NotNull v9 v94, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull DivStatePath divStatePath) {
    }

    @NotNull
    public final View createView(@NotNull v9 object, @NotNull Div2View div2View, @NotNull ExpressionResolver object2, @NotNull DivStatePath divStatePath) {
        div2View = new ProgressBar(div2View.getContext(), null, 16842872);
        object2 = t10.a((v9)object, "progress_color");
        if (object2 != null) {
            div2View.setProgressTintList(ColorStateList.valueOf((int)((Number)object2).intValue()));
        }
        if ((object = t10.a((v9)object, "background_color")) != null) {
            div2View.setProgressBackgroundTintList(ColorStateList.valueOf((int)((Number)object).intValue()));
        }
        return div2View;
    }

    public abstract /* synthetic */ boolean isCustomTypeSupported(@NotNull String var1);

    public final void release(@NotNull View view, @NotNull v9 v94) {
    }
}

