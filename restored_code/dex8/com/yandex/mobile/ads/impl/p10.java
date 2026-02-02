/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.yandex.div.core.DivCustomContainerViewAdapter
 *  com.yandex.div.core.state.DivStatePath
 *  com.yandex.div.core.view2.Div2View
 *  com.yandex.div.json.expressions.ExpressionResolver
 *  com.yandex.div2.v9
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.v9;
import org.jetbrains.annotations.NotNull;

public final class p10
implements DivCustomContainerViewAdapter {
    @NotNull
    private final DivCustomContainerViewAdapter[] a;

    public p10(DivCustomContainerViewAdapter ... divCustomContainerViewAdapterArray) {
        this.a = divCustomContainerViewAdapterArray;
    }

    public final void bindView(@NotNull View view, @NotNull v9 v94, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull DivStatePath divStatePath) {
    }

    @NotNull
    public final View createView(@NotNull v9 v94, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull DivStatePath divStatePath) {
        DivCustomContainerViewAdapter divCustomContainerViewAdapter2;
        block3: {
            for (DivCustomContainerViewAdapter divCustomContainerViewAdapter2 : this.a) {
                if (!divCustomContainerViewAdapter2.isCustomTypeSupported(v94.j)) {
                    continue;
                }
                break block3;
            }
            divCustomContainerViewAdapter2 = null;
        }
        if (divCustomContainerViewAdapter2 == null || (v94 = divCustomContainerViewAdapter2.createView(v94, div2View, expressionResolver, divStatePath)) == null) {
            v94 = new View(div2View.getContext());
        }
        return v94;
    }

    public final boolean isCustomTypeSupported(@NotNull String string2) {
        boolean bl2;
        DivCustomContainerViewAdapter[] divCustomContainerViewAdapterArray = this.a;
        int n10 = divCustomContainerViewAdapterArray.length;
        boolean bl3 = false;
        int n13 = 0;
        while (true) {
            bl2 = bl3;
            if (n13 >= n10) break;
            if (divCustomContainerViewAdapterArray[n13].isCustomTypeSupported(string2)) {
                bl2 = true;
                break;
            }
            ++n13;
        }
        return bl2;
    }

    public final void release(@NotNull View view, @NotNull v9 v94) {
    }
}

