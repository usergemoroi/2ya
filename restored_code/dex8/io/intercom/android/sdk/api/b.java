/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.api;

import io.intercom.android.sdk.IntercomStatusCallback;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.ErrorObject;

public final class b
implements Runnable {
    public final IntercomStatusCallback c;
    public final ErrorObject d;
    public final String e;

    public /* synthetic */ b(IntercomStatusCallback intercomStatusCallback, ErrorObject errorObject, String string2) {
        this.c = intercomStatusCallback;
        this.d = errorObject;
        this.e = string2;
    }

    @Override
    public final void run() {
        Api.1.a(this.c, this.d, this.e);
    }
}

