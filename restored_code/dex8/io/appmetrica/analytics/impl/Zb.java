/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent;

public abstract class zb {
    public static final int[] a;

    static {
        int[] nArray = new int[InternalModuleEvent.Category.values().length];
        nArray[InternalModuleEvent.Category.SYSTEM.ordinal()] = 1;
        nArray[InternalModuleEvent.Category.GENERAL.ordinal()] = 2;
        a = nArray;
    }
}

