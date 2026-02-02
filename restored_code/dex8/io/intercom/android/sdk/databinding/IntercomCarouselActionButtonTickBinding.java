/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.viewbinding.ViewBinding
 */
package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import io.intercom.android.sdk.R;

public final class IntercomCarouselActionButtonTickBinding
implements ViewBinding {
    @NonNull
    private final ImageView rootView;

    private IntercomCarouselActionButtonTickBinding(@NonNull ImageView imageView) {
        this.rootView = imageView;
    }

    @NonNull
    public static IntercomCarouselActionButtonTickBinding bind(@NonNull View view) {
        if (view != null) {
            return new IntercomCarouselActionButtonTickBinding((ImageView)view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static IntercomCarouselActionButtonTickBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomCarouselActionButtonTickBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomCarouselActionButtonTickBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_carousel_action_button_tick, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomCarouselActionButtonTickBinding.bind((View)layoutInflater);
    }

    @NonNull
    public ImageView getRoot() {
        return this.rootView;
    }
}

