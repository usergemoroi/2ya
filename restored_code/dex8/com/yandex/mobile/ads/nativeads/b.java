/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.monetization.ads.nativeads.CustomizableMediaView
 */
package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.monetization.ads.nativeads.CustomizableMediaView;

public abstract class b
extends CustomizableMediaView {
    public b(@NonNull Context context, @Nullable AttributeSet attributeSet, int n10) {
        super(context, attributeSet, n10);
    }

    void setVideoControls(int n10) {
        this.a(n10);
    }
}

