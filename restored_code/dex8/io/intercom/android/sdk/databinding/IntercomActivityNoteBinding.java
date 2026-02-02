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
 *  com.google.android.material.appbar.AppBarLayout
 *  io.intercom.android.sdk.views.IntercomToolbar
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
import com.google.android.material.appbar.AppBarLayout;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.conversation.ReactionInputView;
import io.intercom.android.sdk.views.ContentAwareScrollView;
import io.intercom.android.sdk.views.IntercomToolbar;

public final class IntercomActivityNoteBinding
implements ViewBinding {
    @NonNull
    public final AppBarLayout appBarLayout;
    @NonNull
    public final IntercomToolbar intercomToolbar;
    @NonNull
    public final FrameLayout noteComposerContainer;
    @NonNull
    public final LinearLayout noteLayout;
    @NonNull
    public final View noteTouchTarget;
    @NonNull
    public final ContentAwareScrollView noteView;
    @NonNull
    public final ReactionInputView reactionInputView;
    @NonNull
    private final FrameLayout rootView;

    private IntercomActivityNoteBinding(@NonNull FrameLayout frameLayout, @NonNull AppBarLayout appBarLayout, @NonNull IntercomToolbar intercomToolbar, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout, @NonNull View view, @NonNull ContentAwareScrollView contentAwareScrollView, @NonNull ReactionInputView reactionInputView) {
        this.rootView = frameLayout;
        this.appBarLayout = appBarLayout;
        this.intercomToolbar = intercomToolbar;
        this.noteComposerContainer = frameLayout2;
        this.noteLayout = linearLayout;
        this.noteTouchTarget = view;
        this.noteView = contentAwareScrollView;
        this.reactionInputView = reactionInputView;
    }

    @NonNull
    public static IntercomActivityNoteBinding bind(@NonNull View view) {
        ReactionInputView reactionInputView;
        ContentAwareScrollView contentAwareScrollView;
        View view2;
        LinearLayout linearLayout;
        FrameLayout frameLayout;
        IntercomToolbar intercomToolbar;
        int n10 = R.id.app_bar_layout;
        AppBarLayout appBarLayout = (AppBarLayout)ViewBindings.findChildViewById((View)view, (int)n10);
        if (appBarLayout != null && (intercomToolbar = (IntercomToolbar)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.intercom_toolbar))) != null && (frameLayout = (FrameLayout)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.note_composer_container))) != null && (linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.note_layout))) != null && (view2 = ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.note_touch_target))) != null && (contentAwareScrollView = (ContentAwareScrollView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.note_view))) != null && (reactionInputView = (ReactionInputView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.reaction_input_view))) != null) {
            return new IntercomActivityNoteBinding((FrameLayout)view, appBarLayout, intercomToolbar, frameLayout, linearLayout, view2, contentAwareScrollView, reactionInputView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n10)));
    }

    @NonNull
    public static IntercomActivityNoteBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomActivityNoteBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomActivityNoteBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_activity_note, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomActivityNoteBinding.bind((View)layoutInflater);
    }

    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

