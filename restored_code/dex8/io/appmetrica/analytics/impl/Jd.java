/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.SparseArray
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.impl.id;

public abstract class jd {
    public final int a() {
        return AppMetrica.getLibraryApiLevel();
    }

    public abstract void a(int var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Context context) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block4: {
                    int n10;
                    block5: {
                        try {
                            int n13;
                            int n14 = this.b();
                            n10 = AppMetrica.getLibraryApiLevel();
                            if (n14 == n10) break block4;
                            if (n14 >= n10) break block5;
                            SparseArray sparseArray = this.c();
                            while ((n13 = n14 + 1) <= n10) {
                                id id3 = (id)sparseArray.get(n13);
                                n14 = n13;
                                if (id3 == null) continue;
                                id3.a(context);
                                n14 = n13;
                            }
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    this.a(n10);
                }
                return;
            }
            throw throwable2;
        }
    }

    public abstract int b();

    public abstract SparseArray c();
}

