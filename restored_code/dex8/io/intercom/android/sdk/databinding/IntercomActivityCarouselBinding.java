/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageButton
 *  android.widget.LinearLayout
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.constraintlayout.widget.ConstraintLayout
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  androidx.viewpager.widget.ViewPager
 */
package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import io.intercom.android.sdk.R;

public final class IntercomActivityCarouselBinding
implements ViewBinding {
    @NonNull
    public final ConstraintLayout intercomCarouselCloseContainer;
    @NonNull
    public final ConstraintLayout intercomCarouselRoot;
    @NonNull
    public final ImageButton intercomClose;
    @NonNull
    public final View intercomCloseBackground;
    @NonNull
    public final LinearLayout intercomPageNavigationLayout;
    @NonNull
    public final FrameLayout intercomStateContainer;
    @NonNull
    public final ViewPager intercomViewPager;
    @NonNull
    private final ConstraintLayout rootView;

    private IntercomActivityCarouselBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ImageButton imageButton, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull ViewPager viewPager) {
        this.rootView = constraintLayout;
        this.intercomCarouselCloseContainer = constraintLayout2;
        this.intercomCarouselRoot = constraintLayout3;
        this.intercomClose = imageButton;
        this.intercomCloseBackground = view;
        this.intercomPageNavigationLayout = linearLayout;
        this.intercomStateContainer = frameLayout;
        this.intercomViewPager = viewPager;
    }

    @NonNull
    public static IntercomActivityCarouselBinding bind(@NonNull View view) {
        int n10 = R.id.intercom_carousel_close_container;
        ConstraintLayout constraintLayout = (ConstraintLayout)ViewBindings.findChildViewById((View)view, (int)n10);
        if (constraintLayout != null) {
            ViewPager viewPager;
            FrameLayout frameLayout;
            LinearLayout linearLayout;
            View view2;
            ConstraintLayout constraintLayout2 = (ConstraintLayout)view;
            n10 = R.id.intercom_close;
            ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById((View)view, (int)n10);
            if (imageButton != null && (view2 = ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.intercom_close_background))) != null && (linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.intercom_page_navigation_layout))) != null && (frameLayout = (FrameLayout)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.intercom_state_container))) != null && (viewPager = (ViewPager)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.intercom_view_pager))) != null) {
                return new IntercomActivityCarouselBinding(constraintLayout2, constraintLayout, constraintLayout2, imageButton, view2, linearLayout, frameLayout, viewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n10)));
    }

    @NonNull
    public static IntercomActivityCarouselBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomActivityCarouselBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomActivityCarouselBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_activity_carousel, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomActivityCarouselBinding.bind((View)layoutInflater);
    }

    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

