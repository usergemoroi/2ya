/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.lightbox.LightBoxImageView;

public final class IntercomActivityLightboxBinding
implements ViewBinding {
    @NonNull
    public final LightBoxImageView fullImage;
    @NonNull
    public final RelativeLayout rootView;
    @NonNull
    private final RelativeLayout rootView_;

    private IntercomActivityLightboxBinding(@NonNull RelativeLayout relativeLayout, @NonNull LightBoxImageView lightBoxImageView, @NonNull RelativeLayout relativeLayout2) {
        this.rootView_ = relativeLayout;
        this.fullImage = lightBoxImageView;
        this.rootView = relativeLayout2;
    }

    @NonNull
    public static IntercomActivityLightboxBinding bind(@NonNull View view) {
        int n10 = R.id.full_image;
        LightBoxImageView lightBoxImageView = (LightBoxImageView)ViewBindings.findChildViewById((View)view, (int)n10);
        if (lightBoxImageView != null) {
            view = (RelativeLayout)view;
            return new IntercomActivityLightboxBinding((RelativeLayout)view, lightBoxImageView, (RelativeLayout)view);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n10)));
    }

    @NonNull
    public static IntercomActivityLightboxBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomActivityLightboxBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomActivityLightboxBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_activity_lightbox, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomActivityLightboxBinding.bind((View)layoutInflater);
    }

    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView_;
    }
}

