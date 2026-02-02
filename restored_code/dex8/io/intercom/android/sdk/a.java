/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk;

import io.intercom.android.sdk.Intercom;

public final class a
implements Runnable {
    public final Intercom c;

    public /* synthetic */ a(Intercom intercom) {
        this.c = intercom;
    }

    @Override
    public final void run() {
        Intercom.a(this.c);
    }
}

