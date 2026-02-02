/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 */
package io.intercom.android.sdk.blocks.lib.interfaces;

import android.view.View;
import android.view.ViewGroup;
import io.intercom.android.sdk.blocks.lib.VideoProvider;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;

public interface VideoBlock {
    public View addVideo(String var1, VideoProvider var2, String var3, BlockMetadata var4, ViewGroup var5);
}

