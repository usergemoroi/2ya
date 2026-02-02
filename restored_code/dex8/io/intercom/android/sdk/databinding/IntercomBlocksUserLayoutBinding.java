/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.viewbinding.ViewBinding
 */
package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import io.intercom.android.sdk.R;

public final class IntercomBlocksUserLayoutBinding
implements ViewBinding {
    @NonNull
    private final LinearLayout rootView;

    private IntercomBlocksUserLayoutBinding(@NonNull LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    @NonNull
    public static IntercomBlocksUserLayoutBinding bind(@NonNull View view) {
        if (view != null) {
            return new IntercomBlocksUserLayoutBinding((LinearLayout)view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static IntercomBlocksUserLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomBlocksUserLayoutBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomBlocksUserLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_blocks_user_layout, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomBlocksUserLayoutBinding.bind((View)layoutInflater);
    }

    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

