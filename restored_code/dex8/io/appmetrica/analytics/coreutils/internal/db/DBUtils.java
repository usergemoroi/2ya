/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 */
package io.appmetrica.analytics.coreutils.internal.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt;

public class DBUtils {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void cursorRowToContentValues(Cursor cursor, ContentValues contentValues) {
        try {
            DBUtils.enhancedCursorRowToContentValues(cursor, contentValues);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public static void enhancedCursorRowToContentValues(Cursor cursor, ContentValues contentValues) {
        String[] stringArray = cursor.getColumnNames();
        int n10 = stringArray.length;
        for (int i14 = 0; i14 < n10; ++i14) {
            int n13 = cursor.getType(i14);
            if (n13 != 0) {
                if (n13 != 1) {
                    if (n13 != 2) {
                        if (n13 != 3) {
                            if (n13 != 4) {
                                contentValues.put(stringArray[i14], cursor.getString(i14));
                                continue;
                            }
                            contentValues.put(stringArray[i14], cursor.getBlob(i14));
                            continue;
                        }
                        contentValues.put(stringArray[i14], cursor.getString(i14));
                        continue;
                    }
                    contentValues.put(stringArray[i14], Double.valueOf(cursor.getDouble(i14)));
                    continue;
                }
                contentValues.put(stringArray[i14], Long.valueOf(cursor.getLong(i14)));
                continue;
            }
            contentValues.put(stringArray[i14], cursor.getString(i14));
        }
    }

    public static long queryRowsCount(SQLiteDatabase sQLiteDatabase, String string2) {
        Throwable throwable2;
        SQLiteDatabase sQLiteDatabase2;
        block9: {
            long l10;
            block8: {
                block7: {
                    StringBuilder stringBuilder;
                    SQLiteDatabase sQLiteDatabase3;
                    sQLiteDatabase2 = sQLiteDatabase3 = null;
                    sQLiteDatabase2 = sQLiteDatabase3;
                    try {
                        stringBuilder = new StringBuilder("SELECT count() FROM ");
                        sQLiteDatabase2 = sQLiteDatabase3;
                    }
                    catch (Throwable throwable2) {}
                    stringBuilder.append(string2);
                    sQLiteDatabase2 = sQLiteDatabase3;
                    sQLiteDatabase2 = sQLiteDatabase = sQLiteDatabase.rawQuery(stringBuilder.toString(), null);
                    if (!sQLiteDatabase.moveToFirst()) break block7;
                    sQLiteDatabase2 = sQLiteDatabase;
                    l10 = sQLiteDatabase.getLong(0);
                    break block8;
                    break block9;
                }
                l10 = 0L;
            }
            CloseableUtilsKt.closeSafely((Cursor)sQLiteDatabase);
            return l10;
        }
        CloseableUtilsKt.closeSafely(sQLiteDatabase2);
        throw throwable2;
    }
}

