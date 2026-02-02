/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$ItemDecoration
 *  androidx.recyclerview.widget.RecyclerView$State
 *  com.yandex.mobile.ads.R$dimen
 *  com.yandex.mobile.ads.R$id
 */
package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.R;
import org.jetbrains.annotations.NotNull;

public final class ex
extends RecyclerView.ItemDecoration {
    public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        state = view.getResources();
        if (view.getId() == R.id.item_divider) {
            if (recyclerView.getChildAdapterPosition(view) != 0) {
                rect.top = state.getDimensionPixelSize(R.dimen.debug_panel_space_medium_large);
            }
        } else {
            int n10;
            rect.bottom = n10 = state.getDimensionPixelSize(R.dimen.debug_panel_space_small);
            rect.top = n10;
        }
    }
}

