/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 */
package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.impl.g5;
import io.appmetrica.analytics.impl.h5;
import org.jetbrains.annotations.NotNull;

public final class i5
extends DatabaseScript {
    public final h5 a = new h5();
    public final g5 b = new g5();

    @Override
    public final void runScript(@NotNull SQLiteDatabase sQLiteDatabase) {
        this.a.runScript(sQLiteDatabase);
        this.b.runScript(sQLiteDatabase);
    }
}

