/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.ImageButton
 *  android.widget.TextView
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.appcompat.widget.Toolbar
 *  androidx.constraintlayout.widget.ConstraintLayout
 *  androidx.constraintlayout.widget.Group
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterLoadingScreen;
import io.intercom.android.sdk.m5.helpcenter.components.TeamPresenceComponent;

public final class IntercomActivityArticleSearchBinding
implements ViewBinding {
    @NonNull
    public final ImageButton clearSearch;
    @NonNull
    private final ConstraintLayout rootView;
    @NonNull
    public final EditText searchBar;
    @NonNull
    public final TextView searchError;
    @NonNull
    public final TeamPresenceComponent searchErrorTeamHelp;
    @NonNull
    public final Group searchErrors;
    @NonNull
    public final HelpCenterLoadingScreen searchLoading;
    @NonNull
    public final RecyclerView searchResultRecyclerView;
    @NonNull
    public final Toolbar toolbar;
    @NonNull
    public final View toolbarDivider;

    private IntercomActivityArticleSearchBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageButton imageButton, @NonNull EditText editText, @NonNull TextView textView, @NonNull TeamPresenceComponent teamPresenceComponent, @NonNull Group group, @NonNull HelpCenterLoadingScreen helpCenterLoadingScreen, @NonNull RecyclerView recyclerView, @NonNull Toolbar toolbar, @NonNull View view) {
        this.rootView = constraintLayout;
        this.clearSearch = imageButton;
        this.searchBar = editText;
        this.searchError = textView;
        this.searchErrorTeamHelp = teamPresenceComponent;
        this.searchErrors = group;
        this.searchLoading = helpCenterLoadingScreen;
        this.searchResultRecyclerView = recyclerView;
        this.toolbar = toolbar;
        this.toolbarDivider = view;
    }

    @NonNull
    public static IntercomActivityArticleSearchBinding bind(@NonNull View view) {
        View view2;
        Toolbar toolbar;
        RecyclerView recyclerView;
        HelpCenterLoadingScreen helpCenterLoadingScreen;
        Group group;
        TeamPresenceComponent teamPresenceComponent;
        TextView textView;
        EditText editText;
        int n10 = R.id.clear_search;
        ImageButton imageButton = (ImageButton)ViewBindings.findChildViewById((View)view, (int)n10);
        if (imageButton != null && (editText = (EditText)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.search_bar))) != null && (textView = (TextView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.search_error))) != null && (teamPresenceComponent = (TeamPresenceComponent)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.search_error_team_help))) != null && (group = (Group)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.search_errors))) != null && (helpCenterLoadingScreen = (HelpCenterLoadingScreen)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.search_loading))) != null && (recyclerView = (RecyclerView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.search_result_recycler_view))) != null && (toolbar = (Toolbar)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.toolbar))) != null && (view2 = ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.toolbar_divider))) != null) {
            return new IntercomActivityArticleSearchBinding((ConstraintLayout)view, imageButton, editText, textView, teamPresenceComponent, group, helpCenterLoadingScreen, recyclerView, toolbar, view2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n10)));
    }

    @NonNull
    public static IntercomActivityArticleSearchBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomActivityArticleSearchBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomActivityArticleSearchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_activity_article_search, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomActivityArticleSearchBinding.bind((View)layoutInflater);
    }

    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

