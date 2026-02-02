/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

public abstract class c9 {
    public static final int[] a;

    static {
        int[] nArray = new int[ModuleEvent.Category.values().length];
        nArray[ModuleEvent.Category.GENERAL.ordinal()] = 1;
        nArray[ModuleEvent.Category.SYSTEM.ordinal()] = 2;
        a = nArray;
    }
}

