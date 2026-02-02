/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  android.widget.ProgressBar
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.R;

public final class IntercomContainerLayoutBinding
implements ViewBinding {
    @NonNull
    public final LinearLayout cellLayout;
    @NonNull
    public final ProgressBar progressBar;
    @NonNull
    private final FrameLayout rootView;

    private IntercomContainerLayoutBinding(@NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout, @NonNull ProgressBar progressBar) {
        this.rootView = frameLayout;
        this.cellLayout = linearLayout;
        this.progressBar = progressBar;
    }

    @NonNull
    public static IntercomContainerLayoutBinding bind(@NonNull View view) {
        ProgressBar progressBar;
        int n10 = R.id.cellLayout;
        LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)n10);
        if (linearLayout != null && (progressBar = (ProgressBar)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.progressBar))) != null) {
            return new IntercomContainerLayoutBinding((FrameLayout)view, linearLayout, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n10)));
    }

    @NonNull
    public static IntercomContainerLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomContainerLayoutBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomContainerLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_container_layout, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomContainerLayoutBinding.bind((View)layoutInflater);
    }

    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

