/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ProgressBar
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.viewbinding.ViewBinding
 */
package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import io.intercom.android.sdk.R;

public final class IntercomProgressBarBinding
implements ViewBinding {
    @NonNull
    public final ProgressBar progressBar;
    @NonNull
    private final ProgressBar rootView;

    private IntercomProgressBarBinding(@NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2) {
        this.rootView = progressBar;
        this.progressBar = progressBar2;
    }

    @NonNull
    public static IntercomProgressBarBinding bind(@NonNull View view) {
        if (view != null) {
            view = (ProgressBar)view;
            return new IntercomProgressBarBinding((ProgressBar)view, (ProgressBar)view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static IntercomProgressBarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomProgressBarBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomProgressBarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_progress_bar, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomProgressBarBinding.bind((View)layoutInflater);
    }

    @NonNull
    public ProgressBar getRoot() {
        return this.rootView;
    }
}

