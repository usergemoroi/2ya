/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.constraintlayout.widget.ConstraintLayout
 *  androidx.viewbinding.ViewBinding
 */
package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import io.intercom.android.sdk.R;

public final class IntercomActivityHelpCenterArticleBinding
implements ViewBinding {
    @NonNull
    public final ConstraintLayout articleContainer;
    @NonNull
    private final ConstraintLayout rootView;

    private IntercomActivityHelpCenterArticleBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.articleContainer = constraintLayout2;
    }

    @NonNull
    public static IntercomActivityHelpCenterArticleBinding bind(@NonNull View view) {
        if (view != null) {
            view = (ConstraintLayout)view;
            return new IntercomActivityHelpCenterArticleBinding((ConstraintLayout)view, (ConstraintLayout)view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static IntercomActivityHelpCenterArticleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomActivityHelpCenterArticleBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomActivityHelpCenterArticleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_activity_help_center_article, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomActivityHelpCenterArticleBinding.bind((View)layoutInflater);
    }

    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

