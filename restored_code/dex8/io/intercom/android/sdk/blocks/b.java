/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.blocks;

import io.intercom.android.sdk.blocks.Video;
import io.intercom.android.sdk.blocks.views.VideoPreviewView;

public final class b
implements Runnable {
    public final Video.2 c;
    public final VideoPreviewView d;
    public final String e;
    public final String f;

    public /* synthetic */ b(Video.2 var1_1, VideoPreviewView videoPreviewView, String string2, String string3) {
        this.c = var1_1;
        this.d = videoPreviewView;
        this.e = string2;
        this.f = string3;
    }

    @Override
    public final void run() {
        Video.2.a(this.c, this.d, this.e, this.f);
    }
}

