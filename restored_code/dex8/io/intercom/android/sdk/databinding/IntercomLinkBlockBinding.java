/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.R;

public final class IntercomLinkBlockBinding
implements ViewBinding {
    @NonNull
    public final TextView author;
    @NonNull
    public final ImageView avatar;
    @NonNull
    public final TextView description;
    @NonNull
    private final LinearLayout rootView;
    @NonNull
    public final TextView title;

    private IntercomLinkBlockBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = linearLayout;
        this.author = textView;
        this.avatar = imageView;
        this.description = textView2;
        this.title = textView3;
    }

    @NonNull
    public static IntercomLinkBlockBinding bind(@NonNull View view) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        int n10 = R.id.author;
        TextView textView3 = (TextView)ViewBindings.findChildViewById((View)view, (int)n10);
        if (textView3 != null && (imageView = (ImageView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.avatar))) != null && (textView2 = (TextView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.description))) != null && (textView = (TextView)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.title))) != null) {
            return new IntercomLinkBlockBinding((LinearLayout)view, textView3, imageView, textView2, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n10)));
    }

    @NonNull
    public static IntercomLinkBlockBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomLinkBlockBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomLinkBlockBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_link_block, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomLinkBlockBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

