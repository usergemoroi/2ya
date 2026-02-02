/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.impl.An;
import io.appmetrica.analytics.impl.X6;
import io.appmetrica.analytics.impl.ro;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class yn
implements TempCacheStorage {
    public final X6 a;
    public final String b;
    public final SystemTimeProvider c;

    public yn(@NotNull X6 x64, @NotNull String string2) {
        this.a = x64;
        this.b = string2;
        this.c = new SystemTimeProvider();
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NotNull
    public final List<TempCacheStorage.Entry> a(@NotNull String object, int n10) {
        void var6_14;
        SQLiteDatabase sQLiteDatabase;
        ArrayList<TempCacheStorage.Entry> arrayList;
        block10: {
            block11: {
                void var4_19;
                block14: {
                    SQLiteDatabase sQLiteDatabase2;
                    block13: {
                        Cursor cursor;
                        block12: {
                            arrayList = new ArrayList<TempCacheStorage.Entry>();
                            SQLiteDatabase sQLiteDatabase3 = null;
                            sQLiteDatabase = null;
                            sQLiteDatabase2 = this.a.a();
                            sQLiteDatabase = sQLiteDatabase3;
                            SQLiteDatabase sQLiteDatabase4 = sQLiteDatabase2;
                            if (sQLiteDatabase2 == null) break block10;
                            try {
                                cursor = sQLiteDatabase2.query(false, this.b, null, "scope=?", new String[]{object}, null, null, "id", String.valueOf(n10));
                                object = sQLiteDatabase2;
                                sQLiteDatabase = cursor;
                                if (cursor == null) break block11;
                                break block12;
                            }
                            catch (Throwable throwable) {
                                object = null;
                                break block13;
                            }
                            catch (Throwable throwable) {
                                Object var4_18 = null;
                            }
                            break block14;
                        }
                        while (true) {
                            boolean bl2 = cursor.moveToNext();
                            object = sQLiteDatabase2;
                            sQLiteDatabase = cursor;
                            if (!bl2) break block11;
                            try {
                                object = new An(cursor.getLong(cursor.getColumnIndexOrThrow("id")), cursor.getString(cursor.getColumnIndexOrThrow("scope")), cursor.getLong(cursor.getColumnIndexOrThrow("timestamp")), cursor.getBlob(cursor.getColumnIndexOrThrow("data")));
                            }
                            catch (Throwable throwable) {
                                object = null;
                            }
                            if (object == null) continue;
                            arrayList.add((TempCacheStorage.Entry)object);
                            continue;
                            break;
                        }
                        catch (Throwable throwable) {
                            object = cursor;
                        }
                    }
                    sQLiteDatabase = sQLiteDatabase2;
                    Object object2 = object;
                }
                object = sQLiteDatabase;
                sQLiteDatabase = var4_19;
            }
            Object object3 = object;
        }
        ro.a(sQLiteDatabase);
        this.a.a((SQLiteDatabase)var6_14);
        return arrayList;
    }

    /*
     * Unable to fully structure code
     */
    public final void a(String var1_1, String[] var2_4) {
        block6: {
            var3_6 = var4_5 = this.a.a();
            if (var4_5 == null) break block6;
            var4_5.delete(this.b, var1_1, var2_4);
            catch (Throwable var1_2) {
                var3_6 = null;
            }
        }
lbl10:
        // 2 sources

        while (true) {
            this.a.a(var3_6);
            return;
        }
        finally {
            var3_6 = var4_5;
            ** continue;
        }
    }

    @Override
    @Nullable
    public final TempCacheStorage.Entry get(@NotNull String string2) {
        return (TempCacheStorage.Entry)t.t0(this.a(string2, 1));
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final long put(@NotNull String string2, long l10, @NotNull byte[] byArray) {
        SQLiteDatabase sQLiteDatabase;
        block4: {
            SQLiteDatabase sQLiteDatabase2;
            sQLiteDatabase = null;
            sQLiteDatabase = sQLiteDatabase2 = this.a.a();
            if (sQLiteDatabase2 == null) break block4;
            try {
                sQLiteDatabase = new ContentValues();
                sQLiteDatabase.put("scope", string2);
                sQLiteDatabase.put("timestamp", Long.valueOf(l10));
                sQLiteDatabase.put("data", byArray);
                l10 = sQLiteDatabase2.insertOrThrow(this.b, null, (ContentValues)sQLiteDatabase);
                this.a.a(sQLiteDatabase2);
                return l10;
            }
            catch (Throwable throwable) {
                SQLiteDatabase sQLiteDatabase3;
                block5: {
                    sQLiteDatabase3 = sQLiteDatabase2;
                    break block5;
                    catch (Throwable throwable2) {
                        sQLiteDatabase3 = sQLiteDatabase;
                    }
                }
                sQLiteDatabase = sQLiteDatabase3;
            }
        }
        this.a.a(sQLiteDatabase);
        return -1L;
    }

    @Override
    public final void remove(long l10) {
        this.a("id=?", new String[]{String.valueOf(l10)});
    }

    @Override
    public final void removeOlderThan(@NotNull String string2, long l10) {
        this.a("scope=? AND timestamp<?", new String[]{string2, String.valueOf(this.c.currentTimeMillis() - l10)});
    }
}

