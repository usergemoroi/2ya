/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.SQLException
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteOpenHelper
 *  com.yandex.mobile.ads.impl.rv
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.yandex.mobile.ads.impl.rv;
import com.yandex.mobile.ads.impl.zs0;

public class m22
extends SQLiteOpenHelper
implements rv {
    public m22(Context context) {
        super(context.getApplicationContext(), "monetization_ads_exoplayer_internal.db", null, 1);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int n10, int n12) {
        Throwable throwable2;
        Cursor cursor;
        block7: {
            cursor = sQLiteDatabase.query("sqlite_master", new String[]{"type", "name"}, null, null, null, null, null);
            try {
                while (cursor.moveToNext()) {
                    String string2 = cursor.getString(0);
                    String string3 = cursor.getString(1);
                    if ("sqlite_sequence".equals(string3)) continue;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("DROP ");
                    stringBuilder.append(string2);
                    stringBuilder.append(" IF EXISTS ");
                    stringBuilder.append(string3);
                    string3 = stringBuilder.toString();
                    try {
                        sQLiteDatabase.execSQL(string3);
                    }
                    catch (SQLException sQLException) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Error executing ");
                        stringBuilder.append(string3);
                        zs0.a((String)"SADatabaseProvider", (String)stringBuilder.toString(), (Throwable)sQLException);
                    }
                }
            }
            catch (Throwable throwable2) {
                break block7;
            }
            cursor.close();
            return;
        }
        if (cursor == null) throw throwable2;
        try {
            cursor.close();
            throw throwable2;
        }
        catch (Throwable throwable3) {
            throwable2.addSuppressed(throwable3);
        }
        throw throwable2;
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int n10, int n12) {
    }
}

