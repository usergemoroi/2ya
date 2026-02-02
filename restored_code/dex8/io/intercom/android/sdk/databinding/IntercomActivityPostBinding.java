/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.RelativeLayout
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  com.google.android.material.appbar.AppBarLayout
 *  io.intercom.android.sdk.views.IntercomToolbar
 */
package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.conversation.ReactionInputView;
import io.intercom.android.sdk.views.ContentAwareScrollView;
import io.intercom.android.sdk.views.IntercomToolbar;

public final class IntercomActivityPostBinding
implements ViewBinding {
    @NonNull
    public final AppBarLayout appBarLayout;
    @NonNull
    public final FrameLayout conversationCoordinator;
    @NonNull
    public final IntercomToolbar intercomToolbar;
    @NonNull
    public final FrameLayout postContainer;
    @NonNull
    public final View postTouchTarget;
    @NonNull
    public final ContentAwareScrollView postView;
    @NonNull
    public final ReactionInputView reactionInputView;
    @NonNull
    private final RelativeLayout rootView;

    private IntercomActivityPostBinding(@NonNull RelativeLayout relativeLayout, @NonNull AppBarLayout appBarLayout, @NonNull FrameLayout frameLayout, @NonNull IntercomToolbar intercomToolbar, @NonNull FrameLayout frameLayout2, @NonNull View view, @NonNull ContentAwareScrollView contentAwareScrollView, @NonNull ReactionInputView reactionInputView) {
        this.rootView = relativeLayout;
        this.appBarLayout = appBarLayout;
        this.conversationCoordinator = frameLayout;
        this.intercomToolbar = intercomToolbar;
        this.postContainer = frameLayout2;
        this.postTouchTarget = view;
        this.postView = contentAwareScrollView;
        this.reactionInputView = reactionInputView;
    }

    @NonNull
    public static IntercomActivityPostBinding bind(@NonNull View view) {
        ReactionInputView reactionInputView;
        ContentAwareScrollView contentAwareScrollView;
        View view2;
        FrameLayout frameLayout;
        IntercomToolbar intercomToolbar;
        FrameLayout frameLayout2;
        int n10 = R.id.app_bar_layout;
        AppBarLayout appBarLayout = (AppBarLayout)ViewBindings.findChildViewById((View)view, (int)n10);
        if (appBarLayout != null && (frameLayout2 = (FrameLayout)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.conversation_coordinator))) != null && (intercomToolbar = (IntercomToolbar)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.intercom_toolbar))) != null && (frameLayout = (FrameLayout)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.post_container))) != null && (view2 = ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.post_touch_target))) != null && (contentAwareScrollView = (ContentAwareScrollView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.post_view))) != null && (reactionInputView = (ReactionInputView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.reaction_input_view))) != null) {
            return new IntercomActivityPostBinding((RelativeLayout)view, appBarLayout, frameLayout2, intercomToolbar, frameLayout, view2, contentAwareScrollView, reactionInputView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n10)));
    }

    @NonNull
    public static IntercomActivityPostBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomActivityPostBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomActivityPostBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_activity_post, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomActivityPostBinding.bind((View)layoutInflater);
    }

    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

