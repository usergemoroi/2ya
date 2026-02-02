/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingType;

public abstract class n3 {
    public static final int[] a;

    static {
        int[] nArray = new int[BillingType.values().length];
        nArray[BillingType.LIBRARY_V6.ordinal()] = 1;
        nArray[BillingType.LIBRARY_V8.ordinal()] = 2;
        a = nArray;
    }
}

