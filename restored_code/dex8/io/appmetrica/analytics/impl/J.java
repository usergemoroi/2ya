/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.impl.l;

public final class j
implements Runnable {
    public final Activity a;
    public final l b;

    public j(l l10, Activity activity) {
        this.b = l10;
        this.a = activity;
    }

    @Override
    public final void run() {
        this.b.a(this.a);
    }
}

