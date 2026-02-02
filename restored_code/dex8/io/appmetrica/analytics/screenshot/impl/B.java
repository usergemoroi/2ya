/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;

public abstract class b {
    public static final int[] a;

    static {
        int[] nArray = new int[ActivityEvent.values().length];
        nArray[ActivityEvent.STARTED.ordinal()] = 1;
        nArray[ActivityEvent.STOPPED.ordinal()] = 2;
        a = nArray;
    }
}

