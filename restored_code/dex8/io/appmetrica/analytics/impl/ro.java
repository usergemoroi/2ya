/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
package io.appmetrica.analytics.impl;

import android.database.Cursor;
import java.io.Closeable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

public abstract class ro {
    public static double a(double d14) {
        double d15;
        block3: {
            block2: {
                if (Double.isNaN(d14)) break block2;
                d15 = d14;
                if (!Double.isInfinite(d14)) break block3;
            }
            d15 = 0.0;
        }
        return d15;
    }

    public static BigDecimal a(long l10) {
        return new BigDecimal(l10).divide(new BigDecimal(1000000), 6, 6);
    }

    public static void a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static boolean a(Object object) {
        boolean bl2 = object != null;
        return bl2;
    }

    public static boolean a(Object object, Object object2) {
        if (object == null && object2 == null) {
            return true;
        }
        if (object != null && object2 != null) {
            return object.equals(object2);
        }
        return false;
    }

    public static boolean a(Collection collection) {
        boolean bl2 = collection == null || collection.size() == 0;
        return bl2;
    }

    public static boolean a(Map map2) {
        boolean bl2 = map2 == null || map2.size() == 0;
        return bl2;
    }
}

