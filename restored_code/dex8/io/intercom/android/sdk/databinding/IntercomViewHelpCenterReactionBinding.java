/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.constraintlayout.motion.widget.MotionLayout
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.utils.views.GrayscaleImageView;

public final class IntercomViewHelpCenterReactionBinding
implements ViewBinding {
    @NonNull
    public final GrayscaleImageView intercomReactionHappy;
    @NonNull
    public final GrayscaleImageView intercomReactionNeutral;
    @NonNull
    public final GrayscaleImageView intercomReactionSad;
    @NonNull
    public final TextView intercomReactionTitle;
    @NonNull
    public final MotionLayout motionLayout;
    @NonNull
    private final MotionLayout rootView;

    private IntercomViewHelpCenterReactionBinding(@NonNull MotionLayout motionLayout, @NonNull GrayscaleImageView grayscaleImageView, @NonNull GrayscaleImageView grayscaleImageView2, @NonNull GrayscaleImageView grayscaleImageView3, @NonNull TextView textView, @NonNull MotionLayout motionLayout2) {
        this.rootView = motionLayout;
        this.intercomReactionHappy = grayscaleImageView;
        this.intercomReactionNeutral = grayscaleImageView2;
        this.intercomReactionSad = grayscaleImageView3;
        this.intercomReactionTitle = textView;
        this.motionLayout = motionLayout2;
    }

    @NonNull
    public static IntercomViewHelpCenterReactionBinding bind(@NonNull View view) {
        TextView textView;
        GrayscaleImageView grayscaleImageView;
        GrayscaleImageView grayscaleImageView2;
        int n10 = R.id.intercom_reaction_happy;
        GrayscaleImageView grayscaleImageView3 = (GrayscaleImageView)ViewBindings.findChildViewById((View)view, (int)n10);
        if (grayscaleImageView3 != null && (grayscaleImageView2 = (GrayscaleImageView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.intercom_reaction_neutral))) != null && (grayscaleImageView = (GrayscaleImageView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.intercom_reaction_sad))) != null && (textView = (TextView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.intercom_reaction_title))) != null) {
            view = (MotionLayout)view;
            return new IntercomViewHelpCenterReactionBinding((MotionLayout)view, grayscaleImageView3, grayscaleImageView2, grayscaleImageView, textView, (MotionLayout)view);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n10)));
    }

    @NonNull
    public static IntercomViewHelpCenterReactionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomViewHelpCenterReactionBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomViewHelpCenterReactionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_view_help_center_reaction, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomViewHelpCenterReactionBinding.bind((View)layoutInflater);
    }

    @NonNull
    public MotionLayout getRoot() {
        return this.rootView;
    }
}

