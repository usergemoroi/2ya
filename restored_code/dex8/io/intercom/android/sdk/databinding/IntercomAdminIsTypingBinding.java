/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.R;

public final class IntercomAdminIsTypingBinding
implements ViewBinding {
    @NonNull
    public final ImageView dot1;
    @NonNull
    public final ImageView dot2;
    @NonNull
    public final ImageView dot3;
    @NonNull
    private final LinearLayout rootView;

    private IntercomAdminIsTypingBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3) {
        this.rootView = linearLayout;
        this.dot1 = imageView;
        this.dot2 = imageView2;
        this.dot3 = imageView3;
    }

    @NonNull
    public static IntercomAdminIsTypingBinding bind(@NonNull View view) {
        ImageView imageView;
        ImageView imageView2;
        int n10 = R.id.dot1;
        ImageView imageView3 = (ImageView)ViewBindings.findChildViewById((View)view, (int)n10);
        if (imageView3 != null && (imageView2 = (ImageView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.dot2))) != null && (imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.dot3))) != null) {
            return new IntercomAdminIsTypingBinding((LinearLayout)view, imageView3, imageView2, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n10)));
    }

    @NonNull
    public static IntercomAdminIsTypingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomAdminIsTypingBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomAdminIsTypingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_admin_is_typing, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomAdminIsTypingBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

