/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.chromium.net.CronetException
 */
package org.chromium.net;

import org.chromium.net.CronetException;

public abstract class CallbackException
extends CronetException {
    protected CallbackException(String string, Throwable throwable) {
        super(string, throwable);
    }
}

