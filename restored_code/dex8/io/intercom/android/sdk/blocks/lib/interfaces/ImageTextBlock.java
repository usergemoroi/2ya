/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Spanned
 *  android.view.View
 *  android.view.ViewGroup
 */
package io.intercom.android.sdk.blocks.lib.interfaces;

import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;

public interface ImageTextBlock {
    public View addImageText(Spanned var1, Spanned var2, String var3, String var4, int var5, int var6, BlockMetadata var7, ViewGroup var8);
}

