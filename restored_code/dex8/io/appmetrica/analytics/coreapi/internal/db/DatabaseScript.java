/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 *  androidx.annotation.NonNull
 *  org.json.JSONException
 */
package io.appmetrica.analytics.coreapi.internal.db;

import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import java.sql.SQLException;
import org.json.JSONException;

public abstract class DatabaseScript {
    public abstract void runScript(@NonNull SQLiteDatabase var1) throws SQLException, JSONException;
}

