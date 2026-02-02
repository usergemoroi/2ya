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
import io.intercom.android.sdk.views.ContentAwareScrollView;

public final class IntercomFragmentCarouselScreenBinding
implements ViewBinding {
    @NonNull
    public final LinearLayout intercomCarouselActionLayout;
    @NonNull
    public final FrameLayout intercomCarouselContentContainer;
    @NonNull
    public final LinearLayout intercomCarouselFragmentRoot;
    @NonNull
    public final View intercomCarouselGradient;
    @NonNull
    public final ContentAwareScrollView intercomCarouselScrollView;
    @NonNull
    private final LinearLayout rootView;

    private IntercomFragmentCarouselScreenBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout3, @NonNull View view, @NonNull ContentAwareScrollView contentAwareScrollView) {
        this.rootView = linearLayout;
        this.intercomCarouselActionLayout = linearLayout2;
        this.intercomCarouselContentContainer = frameLayout;
        this.intercomCarouselFragmentRoot = linearLayout3;
        this.intercomCarouselGradient = view;
        this.intercomCarouselScrollView = contentAwareScrollView;
    }

    @NonNull
    public static IntercomFragmentCarouselScreenBinding bind(@NonNull View view) {
        FrameLayout frameLayout;
        int n10 = R.id.intercom_carousel_action_layout;
        LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)n10);
        if (linearLayout != null && (frameLayout = (FrameLayout)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.intercom_carousel_content_container))) != null) {
            ContentAwareScrollView contentAwareScrollView;
            LinearLayout linearLayout2 = (LinearLayout)view;
            n10 = R.id.intercom_carousel_gradient;
            View view2 = ViewBindings.findChildViewById((View)view, (int)n10);
            if (view2 != null && (contentAwareScrollView = (ContentAwareScrollView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.intercom_carousel_scroll_view))) != null) {
                return new IntercomFragmentCarouselScreenBinding(linearLayout2, linearLayout, frameLayout, linearLayout2, view2, contentAwareScrollView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n10)));
    }

    @NonNull
    public static IntercomFragmentCarouselScreenBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomFragmentCarouselScreenBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomFragmentCarouselScreenBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_fragment_carousel_screen, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomFragmentCarouselScreenBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

