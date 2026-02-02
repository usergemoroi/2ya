/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
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
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.R;

public final class IntercomMessengerCardBlockBinding
implements ViewBinding {
    @NonNull
    public final ProgressBar loadingView;
    @NonNull
    private final FrameLayout rootView;

    private IntercomMessengerCardBlockBinding(@NonNull FrameLayout frameLayout, @NonNull ProgressBar progressBar) {
        this.rootView = frameLayout;
        this.loadingView = progressBar;
    }

    @NonNull
    public static IntercomMessengerCardBlockBinding bind(@NonNull View view) {
        int n10 = R.id.loading_view;
        ProgressBar progressBar = (ProgressBar)ViewBindings.findChildViewById((View)view, (int)n10);
        if (progressBar != null) {
            return new IntercomMessengerCardBlockBinding((FrameLayout)view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n10)));
    }

    @NonNull
    public static IntercomMessengerCardBlockBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomMessengerCardBlockBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomMessengerCardBlockBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_messenger_card_block, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomMessengerCardBlockBinding.bind((View)layoutInflater);
    }

    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

