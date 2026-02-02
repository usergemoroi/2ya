/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButton;

public final class IntercomConversationRatingBlockBinding
implements ViewBinding {
    @NonNull
    public final LinearLayout intercomRatingOptionsLayout;
    @NonNull
    public final IntercomPrimaryButton intercomRatingTellUsMoreButton;
    @NonNull
    public final ImageView intercomYouRatedImageView;
    @NonNull
    public final LinearLayout intercomYouRatedLayout;
    @NonNull
    public final TextView rateYourConversationTextView;
    @NonNull
    private final LinearLayout rootView;

    private IntercomConversationRatingBlockBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull IntercomPrimaryButton intercomPrimaryButton, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout3, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.intercomRatingOptionsLayout = linearLayout2;
        this.intercomRatingTellUsMoreButton = intercomPrimaryButton;
        this.intercomYouRatedImageView = imageView;
        this.intercomYouRatedLayout = linearLayout3;
        this.rateYourConversationTextView = textView;
    }

    @NonNull
    public static IntercomConversationRatingBlockBinding bind(@NonNull View view) {
        TextView textView;
        LinearLayout linearLayout;
        ImageView imageView;
        IntercomPrimaryButton intercomPrimaryButton;
        int n10 = R.id.intercom_rating_options_layout;
        LinearLayout linearLayout2 = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)n10);
        if (linearLayout2 != null && (intercomPrimaryButton = (IntercomPrimaryButton)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.intercom_rating_tell_us_more_button))) != null && (imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.intercom_you_rated_image_view))) != null && (linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.intercom_you_rated_layout))) != null && (textView = (TextView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.rate_your_conversation_text_view))) != null) {
            return new IntercomConversationRatingBlockBinding((LinearLayout)view, linearLayout2, intercomPrimaryButton, imageView, linearLayout, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n10)));
    }

    @NonNull
    public static IntercomConversationRatingBlockBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomConversationRatingBlockBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomConversationRatingBlockBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_conversation_rating_block, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomConversationRatingBlockBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

