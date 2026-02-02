/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.webkit.WebView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.appcompat.widget.Toolbar
 *  androidx.constraintlayout.widget.ConstraintLayout
 *  androidx.constraintlayout.widget.Group
 *  androidx.core.widget.NestedScrollView
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 *  com.google.android.material.divider.MaterialDivider
 */
package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.divider.MaterialDivider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.databinding.IntercomViewHelpCenterReactionBinding;
import io.intercom.android.sdk.m5.helpcenter.components.TeamPresenceComponent;
import io.intercom.android.sdk.views.IntercomShimmerLayout;

public final class IntercomFragmentHelpCenterArticleBinding
implements ViewBinding {
    @NonNull
    public final LinearLayout articleContents;
    @NonNull
    public final TextView articleErrorTextView;
    @NonNull
    public final Group articleErrorViews;
    @NonNull
    public final IntercomShimmerLayout articleLoadingView;
    @NonNull
    public final IntercomViewHelpCenterReactionBinding articleReactions;
    @NonNull
    public final View articleReactionsDivider;
    @NonNull
    public final TextView articleRetryButton;
    @NonNull
    public final NestedScrollView articleScrollview;
    @NonNull
    public final TeamPresenceComponent articleTeamHelp;
    @NonNull
    public final Toolbar articleToolbar;
    @NonNull
    public final MaterialDivider articleToolbarDivider;
    @NonNull
    public final WebView articleWebView;
    @NonNull
    private final ConstraintLayout rootView;

    private IntercomFragmentHelpCenterArticleBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull Group group, @NonNull IntercomShimmerLayout intercomShimmerLayout, @NonNull IntercomViewHelpCenterReactionBinding intercomViewHelpCenterReactionBinding, @NonNull View view, @NonNull TextView textView2, @NonNull NestedScrollView nestedScrollView, @NonNull TeamPresenceComponent teamPresenceComponent, @NonNull Toolbar toolbar, @NonNull MaterialDivider materialDivider, @NonNull WebView webView) {
        this.rootView = constraintLayout;
        this.articleContents = linearLayout;
        this.articleErrorTextView = textView;
        this.articleErrorViews = group;
        this.articleLoadingView = intercomShimmerLayout;
        this.articleReactions = intercomViewHelpCenterReactionBinding;
        this.articleReactionsDivider = view;
        this.articleRetryButton = textView2;
        this.articleScrollview = nestedScrollView;
        this.articleTeamHelp = teamPresenceComponent;
        this.articleToolbar = toolbar;
        this.articleToolbarDivider = materialDivider;
        this.articleWebView = webView;
    }

    @NonNull
    public static IntercomFragmentHelpCenterArticleBinding bind(@NonNull View view) {
        View view2;
        IntercomShimmerLayout intercomShimmerLayout;
        Group group;
        TextView textView;
        int n10 = R.id.article_contents;
        LinearLayout linearLayout = (LinearLayout)ViewBindings.findChildViewById((View)view, (int)n10);
        if (linearLayout != null && (textView = (TextView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.article_error_text_view))) != null && (group = (Group)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.article_error_views))) != null && (intercomShimmerLayout = (IntercomShimmerLayout)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.article_loading_view))) != null && (view2 = ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.article_reactions))) != null) {
            WebView webView;
            Toolbar toolbar;
            TeamPresenceComponent teamPresenceComponent;
            NestedScrollView nestedScrollView;
            TextView textView2;
            IntercomViewHelpCenterReactionBinding intercomViewHelpCenterReactionBinding = IntercomViewHelpCenterReactionBinding.bind(view2);
            n10 = R.id.article_reactions_divider;
            View view3 = ViewBindings.findChildViewById((View)view, (int)n10);
            if (view3 != null && (textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.article_retry_button))) != null && (nestedScrollView = (NestedScrollView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.article_scrollview))) != null && (teamPresenceComponent = (TeamPresenceComponent)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.article_team_help))) != null && (toolbar = (Toolbar)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.article_toolbar))) != null && (view2 = (MaterialDivider)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.article_toolbar_divider))) != null && (webView = (WebView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.article_web_view))) != null) {
                return new IntercomFragmentHelpCenterArticleBinding((ConstraintLayout)view, linearLayout, textView, group, intercomShimmerLayout, intercomViewHelpCenterReactionBinding, view3, textView2, nestedScrollView, teamPresenceComponent, toolbar, (MaterialDivider)view2, webView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n10)));
    }

    @NonNull
    public static IntercomFragmentHelpCenterArticleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomFragmentHelpCenterArticleBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomFragmentHelpCenterArticleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_fragment_help_center_article, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomFragmentHelpCenterArticleBinding.bind((View)layoutInflater);
    }

    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

