/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.impl.ro;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class rn {
    public final HashMap a;

    public rn(@NonNull String string2, @NonNull HashMap<String, List<String>> hashMap) {
        this.a = hashMap;
    }

    @VisibleForTesting(otherwise=5)
    public final HashMap<String, List<String>> a() {
        return this.a;
    }

    /*
     * Loose catch block
     */
    public final boolean a(SQLiteDatabase sQLiteDatabase) {
        boolean bl2;
        block15: {
            Cursor cursor;
            Iterator iterator = this.a.entrySet().iterator();
            bl2 = true;
            while (true) {
                Cursor cursor2;
                Object object;
                block16: {
                    if (!iterator.hasNext()) break block15;
                    object = iterator.next();
                    cursor = null;
                    cursor2 = sQLiteDatabase.query((String)object.getKey(), null, null, null, null, null, null);
                    if (cursor2 != null) break block16;
                    ro.a(cursor2);
                }
                cursor = cursor2;
                Object object2 = (String)object.getKey();
                cursor = cursor2;
                object2 = (List)object.getValue();
                cursor = cursor2;
                object = Arrays.asList(cursor2.getColumnNames());
                cursor = cursor2;
                Collections.sort(object);
                cursor = cursor2;
                boolean bl3 = object2.equals(object);
                bl2 &= bl3;
                ro.a(cursor2);
                continue;
                break;
            }
        // Removed invalid catch block
                throw throwable;
            }
        }
        return bl2;
        {
        // Removed invalid catch block
        finally {
            return false;
        }
    }
}

