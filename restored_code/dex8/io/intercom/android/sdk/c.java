/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk;

import io.intercom.android.sdk.NexusWrapper;

public final class c
implements Runnable {
    public final NexusWrapper c;

    public /* synthetic */ c(NexusWrapper nexusWrapper) {
        this.c = nexusWrapper;
    }

    @Override
    public final void run() {
        NexusWrapper.b(this.c);
    }
}

