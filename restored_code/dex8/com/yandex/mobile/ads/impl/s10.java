/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  com.yandex.div.core.DivCustomContainerViewAdapter
 *  com.yandex.div.core.state.DivStatePath
 *  com.yandex.div.core.view2.Div2View
 *  com.yandex.div.json.expressions.ExpressionResolver
 *  com.yandex.div2.v9
 *  com.yandex.mobile.ads.impl.fd1
 *  com.yandex.mobile.ads.impl.u52
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.v9;
import com.yandex.mobile.ads.impl.fd1;
import com.yandex.mobile.ads.impl.u52;
import com.yandex.mobile.ads.impl.v82;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

public final class s10
implements DivCustomContainerViewAdapter {
    public final void bindView(@NotNull View view, @NotNull v9 v94, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull DivStatePath divStatePath) {
    }

    @NotNull
    public final View createView(@NotNull v9 object, @NotNull Div2View object2, @NotNull ExpressionResolver object3, @NotNull DivStatePath divStatePath) {
        Context context = object2.getContext();
        v82 v822 = fd1.c.a(context).c();
        object2 = object.i;
        divStatePath = null;
        object2 = object2 != null ? object2.get("on_image_url") : null;
        object2 = object2 instanceof String ? (String)object2 : null;
        object = object.i;
        object3 = object != null ? object.get("off_image_url") : null;
        object = divStatePath;
        if (object3 instanceof String) {
            object = (String)object3;
        }
        object3 = new u52(context);
        if (object2 != null) {
            object3.setCheckedIcon((Drawable)new BitmapDrawable(context.getResources(), v822.a((String)object2)));
        }
        if (object != null) {
            object3.setUncheckedIcon((Drawable)new BitmapDrawable(context.getResources(), v822.a((String)object)));
        }
        return object3;
    }

    public final boolean isCustomTypeSupported(@NotNull String string2) {
        return y.e("mute_button", string2);
    }

    public final void release(@NotNull View view, @NotNull v9 v94) {
    }
}

