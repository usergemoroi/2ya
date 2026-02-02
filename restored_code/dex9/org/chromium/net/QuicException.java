/*
 * Decompiled with CFR 0.152.
 */
package org.chromium.net;

import org.chromium.net.NetworkException;

public abstract class QuicException
extends NetworkException {
    protected QuicException(String string, Throwable throwable) {
        super(string, throwable);
    }

    public abstract int getQuicDetailedErrorCode();
}

