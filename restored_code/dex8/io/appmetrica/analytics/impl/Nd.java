/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;

public abstract class nd {
    public static final int[] a;

    static {
        int[] nArray = new int[ModuleAdType.values().length];
        nArray[ModuleAdType.NATIVE.ordinal()] = 1;
        nArray[ModuleAdType.BANNER.ordinal()] = 2;
        nArray[ModuleAdType.REWARDED.ordinal()] = 3;
        nArray[ModuleAdType.INTERSTITIAL.ordinal()] = 4;
        nArray[ModuleAdType.MREC.ordinal()] = 5;
        nArray[ModuleAdType.APP_OPEN.ordinal()] = 6;
        nArray[ModuleAdType.OTHER.ordinal()] = 7;
        a = nArray;
    }
}

