/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  android.widget.TextView
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.viewbinding.ViewBinding
 *  androidx.viewbinding.ViewBindings
 */
package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.R;

public final class IntercomImageTextBlockBinding
implements ViewBinding {
    @NonNull
    public final FrameLayout imageHolder;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final TextView text;
    @NonNull
    public final TextView title;

    private IntercomImageTextBlockBinding(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = linearLayout;
        this.imageHolder = frameLayout;
        this.text = textView;
        this.title = textView2;
    }

    @NonNull
    public static IntercomImageTextBlockBinding bind(@NonNull View view) {
        TextView textView;
        TextView textView2;
        int n10 = R.id.image_holder;
        FrameLayout frameLayout = (FrameLayout)ViewBindings.findChildViewById((View)view, (int)n10);
        if (frameLayout != null && (textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.text))) != null && (textView = (TextView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.title))) != null) {
            return new IntercomImageTextBlockBinding((LinearLayout)view, frameLayout, textView2, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n10)));
    }

    @NonNull
    public static IntercomImageTextBlockBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomImageTextBlockBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomImageTextBlockBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_image_text_block, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomImageTextBlockBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

