/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package io.intercom.android.sdk.blocks;

import android.view.View;

public interface ButtonClickListener {
    public void onButtonClicked(View var1, String var2);

    public boolean shouldHandleClicks();
}

