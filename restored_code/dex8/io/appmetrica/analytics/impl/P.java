/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.impl.o;
import java.util.WeakHashMap;

public final class p {
    public final WeakHashMap a = new WeakHashMap();

    public final boolean a(Activity activity, o o11) {
        if (activity != null && this.a.get(activity) == o11) {
            return false;
        }
        if (activity != null) {
            this.a.put(activity, o11);
        }
        return true;
    }
}

