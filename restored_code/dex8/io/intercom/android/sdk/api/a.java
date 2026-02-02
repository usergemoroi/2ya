/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.api;

import io.intercom.android.sdk.IntercomStatusCallback;

public final class a
implements Runnable {
    public final IntercomStatusCallback c;

    public /* synthetic */ a(IntercomStatusCallback intercomStatusCallback) {
        this.c = intercomStatusCallback;
    }

    @Override
    public final void run() {
        this.c.onSuccess();
    }
}

