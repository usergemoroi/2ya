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
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;

public interface SubheadingBlock {
    public View addSubheading(Spanned var1, BlockAlignment var2, BlockMetadata var3, ViewGroup var4);
}

