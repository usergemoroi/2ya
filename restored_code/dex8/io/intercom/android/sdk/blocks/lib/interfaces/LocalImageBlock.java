/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.view.View
 *  android.view.ViewGroup
 */
package io.intercom.android.sdk.blocks.lib.interfaces;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;

public interface LocalImageBlock {
    public View addImage(Uri var1, int var2, int var3, BlockAlignment var4, BlockMetadata var5, ViewGroup var6);
}

