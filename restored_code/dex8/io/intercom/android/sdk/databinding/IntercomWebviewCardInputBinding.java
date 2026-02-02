/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.AutoCompleteTextView
 *  android.widget.FrameLayout
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.R;

public final class IntercomWebviewCardInputBinding
implements ViewBinding {
    @NonNull
    public final AutoCompleteTextView input;
    @NonNull
    private final FrameLayout rootView;

    private IntercomWebviewCardInputBinding(@NonNull FrameLayout frameLayout, @NonNull AutoCompleteTextView autoCompleteTextView) {
        this.rootView = frameLayout;
        this.input = autoCompleteTextView;
    }

    @NonNull
    public static IntercomWebviewCardInputBinding bind(@NonNull View view) {
        int n10 = R.id.input;
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView)ViewBindings.findChildViewById((View)view, (int)n10);
        if (autoCompleteTextView != null) {
            return new IntercomWebviewCardInputBinding((FrameLayout)view, autoCompleteTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n10)));
    }

    @NonNull
    public static IntercomWebviewCardInputBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomWebviewCardInputBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomWebviewCardInputBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_webview_card_input, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomWebviewCardInputBinding.bind((View)layoutInflater);
    }

    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

