/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageButton
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
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.R;

public final class IntercomDefaultLauncherBinding
implements ViewBinding {
    @NonNull
    public final TextView launcherBadgeCount;
    @NonNull
    public final ImageButton launcherIcon;
    @NonNull
    public final FrameLayout launcherRoot;
    @NonNull
    private final FrameLayout rootView;

    private IntercomDefaultLauncherBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull ImageButton imageButton, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.launcherBadgeCount = textView;
        this.launcherIcon = imageButton;
        this.launcherRoot = frameLayout2;
    }

    @NonNull
    public static IntercomDefaultLauncherBinding bind(@NonNull View view) {
        ImageButton imageButton;
        int n10 = R.id.launcher_badge_count;
        TextView textView = (TextView)ViewBindings.findChildViewById((View)view, (int)n10);
        if (textView != null && (imageButton = (ImageButton)ViewBindings.findChildViewById((View)view, (int)(n10 = R.id.launcher_icon))) != null) {
            view = (FrameLayout)view;
            return new IntercomDefaultLauncherBinding((FrameLayout)view, textView, imageButton, (FrameLayout)view);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(n10)));
    }

    @NonNull
    public static IntercomDefaultLauncherBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomDefaultLauncherBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomDefaultLauncherBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_default_launcher, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomDefaultLauncherBinding.bind((View)layoutInflater);
    }

    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

