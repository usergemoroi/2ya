/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.HashMap;

public final class jo {
    public static final int[] c = new int[]{0, 1, 2, 3};
    public final SparseArray a = new SparseArray();
    public int b = 0;

    public jo(int[] nArray) {
        for (int n10 : nArray) {
            this.a.put(n10, new HashMap());
        }
    }
}

