/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
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
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.views.IntercomErrorView;

public final class IntercomErrorSheetBinding
implements ViewBinding {
    @NonNull
    public final Button actionButton;
    @NonNull
    public final TextView emptyTextSubtitle;
    @NonNull
    public final TextView emptyTextTitle;
    @NonNull
    public final IntercomErrorView errorLayoutSheet;
    @NonNull
    private final IntercomErrorView rootView;

    private IntercomErrorSheetBinding(@NonNull IntercomErrorView intercomErrorView, @NonNull Button button, @NonNull TextView textView, @NonNull TextView textView2, @NonNull IntercomErrorView intercomErrorView2) {
        this.rootView = intercomErrorView;
        this.actionButton = button;
        this.emptyTextSubtitle = textView;
        this.emptyTextTitle = textView2;
        this.errorLayoutSheet = intercomErrorView2;
    }

    @NonNull
    public static IntercomErrorSheetBinding bind(@NonNull View object) {
        TextView textView;
        TextView textView2;
        int n10 = R.id.action_button;
        Button button = (Button)ViewBindings.findChildViewById((View)object, (int)n10);
        if (button != null && (textView2 = (TextView)ViewBindings.findChildViewById((View)object, (int)(n10 = R.id.empty_text_subtitle))) != null && (textView = (TextView)ViewBindings.findChildViewById((View)object, (int)(n10 = R.id.empty_text_title))) != null) {
            object = (IntercomErrorView)((Object)object);
            return new IntercomErrorSheetBinding((IntercomErrorView)((Object)object), button, textView2, textView, (IntercomErrorView)((Object)object));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(object.getResources().getResourceName(n10)));
    }

    @NonNull
    public static IntercomErrorSheetBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomErrorSheetBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomErrorSheetBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_error_sheet, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomErrorSheetBinding.bind((View)layoutInflater);
    }

    @NonNull
    public IntercomErrorView getRoot() {
        return this.rootView;
    }
}

