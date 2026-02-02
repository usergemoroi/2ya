/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
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
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.R;

public final class IntercomPreviewNotificationBinding
implements ViewBinding {
    @NonNull
    public final TextView inAppNotificationMessageSummary;
    @NonNull
    public final FrameLayout notificationRoot;
    @NonNull
    public final ImageView previewAvatar;
    @NonNull
    public final TextView replyFromTextview;
    @NonNull
    private final FrameLayout rootView;
    @NonNull
    public final ComposeView ticketHeaderComposeView;

    private IntercomPreviewNotificationBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull ComposeView composeView) {
        this.rootView = frameLayout;
        this.inAppNotificationMessageSummary = textView;
        this.notificationRoot = frameLayout2;
        this.previewAvatar = imageView;
        this.replyFromTextview = textView2;
        this.ticketHeaderComposeView = composeView;
    }

    @NonNull
    public static IntercomPreviewNotificationBinding bind(@NonNull View view) {
        int n10 = R.id.in_app_notification_message_summary;
        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)n10);
        if (textView != null) {
            ComposeView composeView;
            TextView textView2;
            FrameLayout frameLayout = (FrameLayout)view;
            n10 = R.id.preview_avatar;
            ImageView imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)n10);
            if (imageView != null && (textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.reply_from_textview))) != null && (composeView = (ComposeView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.ticket_header_compose_view))) != null) {
                return new IntercomPreviewNotificationBinding(frameLayout, textView, frameLayout, imageView, textView2, composeView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n10)));
    }

    @NonNull
    public static IntercomPreviewNotificationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomPreviewNotificationBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomPreviewNotificationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_preview_notification, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomPreviewNotificationBinding.bind((View)layoutInflater);
    }

    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

