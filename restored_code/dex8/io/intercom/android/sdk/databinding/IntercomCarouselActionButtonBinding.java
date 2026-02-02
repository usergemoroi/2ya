/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.viewbinding.ViewBinding
 */
package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import io.intercom.android.sdk.R;

public final class IntercomCarouselActionButtonBinding
implements ViewBinding {
    @NonNull
    private final TextView rootView;

    private IntercomCarouselActionButtonBinding(@NonNull TextView textView) {
        this.rootView = textView;
    }

    @NonNull
    public static IntercomCarouselActionButtonBinding bind(@NonNull View view) {
        if (view != null) {
            return new IntercomCarouselActionButtonBinding((TextView)view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static IntercomCarouselActionButtonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomCarouselActionButtonBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomCarouselActionButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_carousel_action_button, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomCarouselActionButtonBinding.bind((View)layoutInflater);
    }

    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }
}

