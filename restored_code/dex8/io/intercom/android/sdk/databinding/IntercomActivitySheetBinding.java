/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  io.intercom.android.sdk.views.IntercomToolbar
 */
package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.views.IntercomToolbar;

public final class IntercomActivitySheetBinding
implements ViewBinding {
    @NonNull
    public final IntercomToolbar intercomToolbar;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final LinearLayout sheetRoot;
    @NonNull
    public final FrameLayout sheetView;

    private IntercomActivitySheetBinding(@NonNull LinearLayout linearLayout, @NonNull IntercomToolbar intercomToolbar, @NonNull LinearLayout linearLayout2, @NonNull FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.intercomToolbar = intercomToolbar;
        this.sheetRoot = linearLayout2;
        this.sheetView = frameLayout;
    }

    @NonNull
    public static IntercomActivitySheetBinding bind(@NonNull View view) {
        int n10 = R.id.intercom_toolbar;
        IntercomToolbar intercomToolbar = (IntercomToolbar)ViewBindings.findChildViewById((View)view, (int)n10);
        if (intercomToolbar != null) {
            LinearLayout linearLayout = (LinearLayout)view;
            n10 = R.id.sheet_view;
            FrameLayout frameLayout = (FrameLayout)ViewBindings.findChildViewById((View)view, (int)n10);
            if (frameLayout != null) {
                return new IntercomActivitySheetBinding(linearLayout, intercomToolbar, linearLayout, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n10)));
    }

    @NonNull
    public static IntercomActivitySheetBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomActivitySheetBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomActivitySheetBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_activity_sheet, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomActivitySheetBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

