/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.R;

public final class IntercomPreviewChatFullOverlayBinding
implements ViewBinding {
    @NonNull
    public final FrameLayout chatAvatarContainer;
    @NonNull
    public final FrameLayout chatFullBody;
    @NonNull
    public final View chatOverlayOverflowFade;
    @NonNull
    public final ImageView chatheadAvatar;
    @NonNull
    public final FrameLayout chatheadRoot;
    @NonNull
    public final LinearLayout chatheadTextContainer;
    @NonNull
    public final TextView chatheadTextHeader;
    @NonNull
    private final FrameLayout rootView;

    private IntercomPreviewChatFullOverlayBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull View view, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout4, @NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.rootView = frameLayout;
        this.chatAvatarContainer = frameLayout2;
        this.chatFullBody = frameLayout3;
        this.chatOverlayOverflowFade = view;
        this.chatheadAvatar = imageView;
        this.chatheadRoot = frameLayout4;
        this.chatheadTextContainer = linearLayout;
        this.chatheadTextHeader = textView;
    }

    @NonNull
    public static IntercomPreviewChatFullOverlayBinding bind(@NonNull View view) {
        ImageView imageView;
        View view2;
        FrameLayout frameLayout;
        int n10 = R.id.chat_avatar_container;
        FrameLayout frameLayout2 = (FrameLayout)ViewBindings.findChildViewById((View)view, (int)n10);
        if (frameLayout2 != null && (frameLayout = (FrameLayout)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.chat_full_body))) != null && (view2 = ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.chat_overlay_overflow_fade))) != null && (imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.chathead_avatar))) != null) {
            TextView textView;
            FrameLayout frameLayout3 = (FrameLayout)view;
            n10 = R.id.chathead_text_container;
            LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)n10);
            if (linearLayout != null && (textView = (TextView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.chathead_text_header))) != null) {
                return new IntercomPreviewChatFullOverlayBinding(frameLayout3, frameLayout2, frameLayout, view2, imageView, frameLayout3, linearLayout, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n10)));
    }

    @NonNull
    public static IntercomPreviewChatFullOverlayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomPreviewChatFullOverlayBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomPreviewChatFullOverlayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_preview_chat_full_overlay, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomPreviewChatFullOverlayBinding.bind((View)layoutInflater);
    }

    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

