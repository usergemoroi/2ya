/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.compose.ui.platform.ComposeView
 *  androidx.viewbinding.ViewBinding
 */
package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.viewbinding.ViewBinding;
import io.intercom.android.sdk.R;

public final class IntercomRowComposeViewBinding
implements ViewBinding {
    @NonNull
    public final ComposeView composeView;
    @NonNull
    private final ComposeView rootView;

    private IntercomRowComposeViewBinding(@NonNull ComposeView composeView, @NonNull ComposeView composeView2) {
        this.rootView = composeView;
        this.composeView = composeView2;
    }

    @NonNull
    public static IntercomRowComposeViewBinding bind(@NonNull View view) {
        if (view != null) {
            view = (ComposeView)view;
            return new IntercomRowComposeViewBinding((ComposeView)view, (ComposeView)view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static IntercomRowComposeViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomRowComposeViewBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomRowComposeViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_row_compose_view, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomRowComposeViewBinding.bind((View)layoutInflater);
    }

    @NonNull
    public ComposeView getRoot() {
        return this.rootView;
    }
}

