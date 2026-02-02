/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.X6;
import io.appmetrica.analytics.impl.x7;

public final class zl
implements X6 {
    public final x7 a;

    public zl(x7 x74) {
        this.a = x74;
    }

    @Override
    @Nullable
    public final SQLiteDatabase a() {
        try {
            SQLiteDatabase sQLiteDatabase = this.a.getWritableDatabase();
            return sQLiteDatabase;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    @Override
    public final void a(@Nullable SQLiteDatabase sQLiteDatabase) {
    }
}

