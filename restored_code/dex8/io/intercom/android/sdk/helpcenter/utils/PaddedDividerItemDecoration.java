/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.drawable.Drawable
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  androidx.core.content.ContextCompat
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$ItemDecoration
 *  androidx.recyclerview.widget.RecyclerView$State
 */
package io.intercom.android.sdk.helpcenter.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0004\b\u0016\u0010\u0017J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0018"}, d2={"Lio/intercom/android/sdk/helpcenter/utils/PaddedDividerItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Landroid/graphics/Canvas;", "canvas", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "Lkotlin/k0;", "onDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "", "padding", "I", "Landroid/graphics/drawable/Drawable;", "dividerDrawable", "Landroid/graphics/drawable/Drawable;", "<init>", "(Landroid/content/Context;)V", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
public final class PaddedDividerItemDecoration
extends RecyclerView.ItemDecoration {
    @NotNull
    private final Context context;
    @Nullable
    private Drawable dividerDrawable;
    private final int padding;

    public PaddedDividerItemDecoration(@NotNull Context context) {
        y.j(context, "context");
        this.context = context;
        this.padding = (int)TypedValue.applyDimension((int)1, (float)16.0f, (DisplayMetrics)context.getResources().getDisplayMetrics());
        this.dividerDrawable = ContextCompat.getDrawable((Context)context, (int)R.drawable.intercom_list_divider);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    public void onDraw(@NotNull Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        y.j(canvas, "canvas");
        y.j(recyclerView, "parent");
        y.j(state, "state");
        int n10 = recyclerView.getPaddingLeft();
        int n13 = this.padding;
        int n14 = recyclerView.getWidth();
        int n15 = recyclerView.getPaddingRight();
        int n16 = this.padding;
        if (recyclerView.getAdapter() != null) {
            int n17 = recyclerView.getChildCount();
            for (int i14 = 0; i14 < n17 - 1; ++i14) {
                state = recyclerView.getChildAt(i14);
                if (recyclerView.getChildAdapterPosition((View)state) == -1) {
                    return;
                }
                int n18 = state.getBottom();
                state = this.dividerDrawable;
                int n19 = state != null ? state.getIntrinsicHeight() : 0;
                state = this.dividerDrawable;
                if (state != null) {
                    state.setBounds(n10 + n13, n18, n14 - n15 - n16, n19 + n18);
                }
                if ((state = this.dividerDrawable) == null) continue;
                state.draw(canvas);
            }
        }
    }
}

