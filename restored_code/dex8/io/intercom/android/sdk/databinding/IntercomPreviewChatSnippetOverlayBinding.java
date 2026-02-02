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
 *  androidx.compose.ui.platform.ComposeView
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
import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.R;

public final class IntercomPreviewChatSnippetOverlayBinding
implements ViewBinding {
    @NonNull
    public final FrameLayout chatAvatarContainer;
    @NonNull
    public final FrameLayout chatFullBody;
    @NonNull
    public final ImageView chatheadAvatar;
    @NonNull
    public final FrameLayout chatheadRoot;
    @NonNull
    public final TextView chatheadTextBody;
    @NonNull
    public final LinearLayout chatheadTextContainer;
    @NonNull
    public final TextView chatheadTextHeader;
    @NonNull
    private final FrameLayout rootView;
    @NonNull
    public final ComposeView ticketHeaderComposeView;

    private IntercomPreviewChatSnippetOverlayBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull FrameLayout frameLayout3, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout4, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull TextView textView2, @NonNull ComposeView composeView) {
        this.rootView = frameLayout;
        this.chatAvatarContainer = frameLayout2;
        this.chatFullBody = frameLayout3;
        this.chatheadAvatar = imageView;
        this.chatheadRoot = frameLayout4;
        this.chatheadTextBody = textView;
        this.chatheadTextContainer = linearLayout;
        this.chatheadTextHeader = textView2;
        this.ticketHeaderComposeView = composeView;
    }

    @NonNull
    public static IntercomPreviewChatSnippetOverlayBinding bind(@NonNull View view) {
        ImageView imageView;
        FrameLayout frameLayout;
        int n10 = R.id.chat_avatar_container;
        FrameLayout frameLayout2 = (FrameLayout)ViewBindings.findChildViewById((View)view, (int)n10);
        if (frameLayout2 != null && (frameLayout = (FrameLayout)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.chat_full_body))) != null && (imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.chathead_avatar))) != null) {
            ComposeView composeView;
            TextView textView;
            LinearLayout linearLayout;
            FrameLayout frameLayout3 = (FrameLayout)view;
            n10 = R.id.chathead_text_body;
            TextView textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)n10);
            if (textView2 != null && (linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.chathead_text_container))) != null && (textView = (TextView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.chathead_text_header))) != null && (composeView = (ComposeView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.ticket_header_compose_view))) != null) {
                return new IntercomPreviewChatSnippetOverlayBinding(frameLayout3, frameLayout2, frameLayout, imageView, frameLayout3, textView2, linearLayout, textView, composeView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n10)));
    }

    @NonNull
    public static IntercomPreviewChatSnippetOverlayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomPreviewChatSnippetOverlayBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomPreviewChatSnippetOverlayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_preview_chat_snippet_overlay, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomPreviewChatSnippetOverlayBinding.bind((View)layoutInflater);
    }

    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

