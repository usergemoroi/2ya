/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fyber.fairbid.ads.PlacementType
 */
package io.appmetrica.analytics.adrevenue.fyber.v3.impl;

import com.fyber.fairbid.ads.PlacementType;

public abstract class a {
    public static final int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int[] nArray = new int[PlacementType.values().length];
        a = nArray;
        try {
            nArray[PlacementType.BANNER.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            io.appmetrica.analytics.adrevenue.fyber.v3.impl.a.a[PlacementType.REWARDED.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            io.appmetrica.analytics.adrevenue.fyber.v3.impl.a.a[PlacementType.INTERSTITIAL.ordinal()] = 3;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

