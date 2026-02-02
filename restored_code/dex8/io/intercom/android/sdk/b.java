/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk;

import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.NexusWrapper;

public final class b
implements Runnable {
    public final NexusWrapper c;
    public final NexusConfig d;
    public final boolean e;

    public /* synthetic */ b(NexusWrapper nexusWrapper, NexusConfig nexusConfig, boolean bl2) {
        this.c = nexusWrapper;
        this.d = nexusConfig;
        this.e = bl2;
    }

    @Override
    public final void run() {
        NexusWrapper.a(this.c, this.d, this.e);
    }
}

