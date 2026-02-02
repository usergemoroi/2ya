/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.Period;
import io.appmetrica.analytics.billinginterface.internal.ProductType;

public abstract class bg {
    public static final int[] a;
    public static final int[] b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int[] nArray = new int[Period.TimeUnit.values().length];
        b = nArray;
        try {
            nArray[Period.TimeUnit.DAY.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            bg.b[Period.TimeUnit.WEEK.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            bg.b[Period.TimeUnit.MONTH.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            bg.b[Period.TimeUnit.YEAR.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        nArray = new int[ProductType.values().length];
        a = nArray;
        try {
            nArray[ProductType.INAPP.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            bg.a[ProductType.SUBS.ordinal()] = 2;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

