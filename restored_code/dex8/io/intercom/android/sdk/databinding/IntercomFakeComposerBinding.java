/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.viewbinding.ViewBinding
 */
package io.intercom.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import io.intercom.android.sdk.R;

public final class IntercomFakeComposerBinding
implements ViewBinding {
    @NonNull
    public final EditText composerInputView;
    @NonNull
    private final EditText rootView;

    private IntercomFakeComposerBinding(@NonNull EditText editText, @NonNull EditText editText2) {
        this.rootView = editText;
        this.composerInputView = editText2;
    }

    @NonNull
    public static IntercomFakeComposerBinding bind(@NonNull View view) {
        if (view != null) {
            view = (EditText)view;
            return new IntercomFakeComposerBinding((EditText)view, (EditText)view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static IntercomFakeComposerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return IntercomFakeComposerBinding.inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IntercomFakeComposerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean bl2) {
        layoutInflater = layoutInflater.inflate(R.layout.intercom_fake_composer, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IntercomFakeComposerBinding.bind((View)layoutInflater);
    }

    @NonNull
    public EditText getRoot() {
        return this.rootView;
    }
}

