/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
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
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.R;

public final class IntercomToolbarBinding
implements ViewBinding {
    @NonNull
    public final FrameLayout intercomLeftItemLayout;
    @NonNull
    public final ImageView intercomToolbarAvatar;
    @NonNull
    public final View intercomToolbarAvatarActiveState;
    @NonNull
    public final ImageButton intercomToolbarClose;
    @NonNull
    public final View intercomToolbarDivider;
    @NonNull
    public final ImageButton intercomToolbarInbox;
    @NonNull
    public final TextView intercomToolbarSubtitle;
    @NonNull
    public final TextView intercomToolbarTitle;
    @NonNull
    public final LinearLayout intercomToolbarTitleContainer;
    @NonNull
    private final FrameLayout rootView;
    @NonNull
    public final RelativeLayout toolbarContentContainer;
    @NonNull
    public final ProgressBar toolbarProgressBar;
    @NonNull
    public final ImageView wallpaperImage;

    private IntercomToolbarBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView, @NonNull View view, @NonNull ImageButton imageButton, @NonNull View view2, @NonNull ImageButton imageButton2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull ProgressBar progressBar, @NonNull ImageView imageView2) {
        this.rootView = frameLayout;
        this.intercomLeftItemLayout = frameLayout2;
        this.intercomToolbarAvatar = imageView;
        this.intercomToolbarAvatarActiveState = view;
        this.intercomToolbarClose = imageButton;
        this.intercomToolbarDivider = view2;
        this.intercomToolbarInbox = imageButton2;
        this.intercomToolbarSubtitle = textView;
        this.intercomToolbarTitle = textView2;
        this.intercomToolbarTitleContainer = linearLayout;
        this.toolbarContentContainer = relativeLayout;
        this.toolbarProgressBar = progressBar;
        this.wallpaperImage = imageView2;
    }

    @NonNull
    public static IntercomToolbarBinding bind(@NonNull View view) {
        ImageView imageView;
        ProgressBar progressBar;
        RelativeLayout relativeLayout;
        LinearLayout linearLayout;
        TextView textView;
        TextView textView2;
        ImageButton imageButton;
        View view2;
        ImageButton imageButton2;
        View view3;
        ImageView imageView2;
        int n10 = R.id.intercom_left_item_layout;
        FrameLayout frameLayout = (FrameLayout)ViewBindings.findChildViewById((View)view, (int)n10);
        if (frameLayout != null && (imageView2 = (ImageView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.intercom_toolbar_avatar))) != null && (view3 = ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.intercom_toolbar_avatar_active_state))) != null && (imageButton2 = (ImageButton)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.intercom_toolbar_close))) != null && (view2 = ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.intercom_toolbar_divider))) != null && (imageButton = (ImageButton)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.intercom_toolbar_inbox))) != null && (textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.intercom_toolbar_subtitle))) != null && (textView = (TextView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.intercom_toolbar_title))) != null && (linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.intercom_toolbar_title_container))) != null && (relativeLayout = (RelativeLayout)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.toolbar_content_container))) != null && (progressBar = (ProgressBar)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.toolbar_progress_bar))) != null && (imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.wallpaper_image))) != null) {
            return new IntercomToolbarBinding((FrameLayout)view, frameLayout, imageView2, view3, imageButton2, view2, imageButton, textView2, textView, linearLayout, relativeLayout, progressBar, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n10)));
    }

    @NonNull
    public static IntercomToolbarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomToolbarBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomToolbarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_toolbar, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomToolbarBinding.bind((View)layoutInflater);
    }

    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

