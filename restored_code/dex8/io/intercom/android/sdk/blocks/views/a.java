/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.blocks.views;

import io.intercom.android.sdk.blocks.views.VideoPreviewView;

public final class a
implements Runnable {
    public final VideoPreviewView c;

    public /* synthetic */ a(VideoPreviewView videoPreviewView) {
        this.c = videoPreviewView;
    }

    @Override
    public final void run() {
        VideoPreviewView.a(this.c);
    }
}

