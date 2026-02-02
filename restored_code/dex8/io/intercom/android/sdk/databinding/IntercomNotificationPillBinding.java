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

public final class IntercomNotificationPillBinding
implements ViewBinding {
    @NonNull
    public final TextView notificationPill;
    @NonNull
    private final TextView rootView;

    private IntercomNotificationPillBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = textView;
        this.notificationPill = textView2;
    }

    @NonNull
    public static IntercomNotificationPillBinding bind(@NonNull View view) {
        if (view != null) {
            view = (TextView)view;
            return new IntercomNotificationPillBinding((TextView)view, (TextView)view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static IntercomNotificationPillBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomNotificationPillBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomNotificationPillBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_notification_pill, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomNotificationPillBinding.bind((View)layoutInflater);
    }

    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }
}

