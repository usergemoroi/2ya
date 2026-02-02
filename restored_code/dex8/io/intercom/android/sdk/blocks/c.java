/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.blocks;

import io.intercom.android.sdk.blocks.Video;
import io.intercom.android.sdk.blocks.views.VideoPreviewView;

public final class c
implements Runnable {
    public final Video.3 c;
    public final VideoPreviewView d;
    public final String e;
    public final String f;

    public /* synthetic */ c(Video.3 var1_1, VideoPreviewView videoPreviewView, String string2, String string3) {
        this.c = var1_1;
        this.d = videoPreviewView;
        this.e = string2;
        this.f = string3;
    }

    @Override
    public final void run() {
        Video.3.a(this.c, this.d, this.e, this.f);
    }
}

