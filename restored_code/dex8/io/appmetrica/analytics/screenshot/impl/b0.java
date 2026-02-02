/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;

public abstract class b0 {
    public static final int[] a;

    static {
        int[] nArray = new int[ActivityEvent.values().length];
        nArray[ActivityEvent.RESUMED.ordinal()] = 1;
        nArray[ActivityEvent.PAUSED.ordinal()] = 2;
        a = nArray;
    }
}

