/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 */
package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.impl.R7;
import io.appmetrica.analytics.impl.S7;
import io.appmetrica.analytics.impl.T7;
import io.appmetrica.analytics.impl.fl;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

public final class h5
extends DatabaseScript {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final T7 i = new T7(null, 1, null);

    public h5() {
        this.a = "sessions";
        this.b = 200;
        this.c = "id";
        this.d = "start_time";
        this.e = "report_request_parameters";
        this.f = "server_time_offset";
        this.g = "type";
        this.h = "obtained_before_first_sync";
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final S7 a(Cursor object) {
        S7 s74;
        long l10;
        long l11;
        String string2;
        void var1_3;
        boolean bl2;
        fl fl3;
        long l13;
        block7: {
            block6: {
                int n10;
                Object var11_6 = null;
                try {
                    l13 = object.getLong(object.getColumnIndexOrThrow(this.c));
                    n10 = object.getInt(object.getColumnIndexOrThrow(this.g));
                    fl3 = fl.b;
                    bl2 = true;
                    if (n10 == 0) break block6;
                }
                catch (Throwable throwable) {
                    Object var1_5 = var11_6;
                    return var1_3;
                }
                fl3 = fl.c;
                if (n10 == 1) break block6;
                fl3 = null;
            }
            string2 = object.getString(object.getColumnIndexOrThrow(this.e));
            l11 = object.getLong(object.getColumnIndexOrThrow(this.d));
            l10 = object.getLong(object.getColumnIndexOrThrow(this.f));
            if (object.getInt(object.getColumnIndexOrThrow(this.h)) == 1) break block7;
            bl2 = false;
        }
        R7 r74 = new R7(l11, l10, bl2);
        S7 s75 = s74 = new S7(l13, fl3, string2, r74);
        return var1_3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void runScript(@NotNull SQLiteDatabase var1_1) {
        block9: {
            block10: {
                var4_2 = new ArrayList<ContentValues>();
                try {
                    var2_3 = var1_1.query(this.a, null, null, null, null, null, null, String.valueOf(this.b));
                }
                catch (Throwable var2_4) {
                    var2_3 = null;
lbl7:

                    while (true) {
                        if (var2_3 == null) break block9;
                        var3_5 = var2_3;
                        break block10;
                        break;
                    }
                }
                while (true) {
                    var3_5 = var2_3;
                    if (!var2_3.moveToNext()) break;
                    var3_5 = this.a((Cursor)var2_3);
                    if (var3_5 == null || (var5_8 = var3_5.a) == null || var5_8.longValue() < 0L || var3_5.b == null || (var5_8 = var3_5.c) == null || var5_8.length() == 0 || (var5_8 = var3_5.d.a) == null || var5_8.longValue() <= 0L) continue;
                    var4_2.add(this.i.a((S7)var3_5));
                    continue;
                    break;
                }
            }
            var3_5.close();
        }
        var2_3 = new StringBuilder("DROP TABLE IF EXISTS ");
        var2_3.append(this.a);
        var1_1.execSQL(var2_3.toString());
        var1_1.execSQL("CREATE TABLE IF NOT EXISTS sessions (id INTEGER,type INTEGER,report_request_parameters TEXT,session_description BLOB )");
        var2_3 = var4_2.iterator();
lbl29:

        while (true) {
            if (!var2_3.hasNext()) ** GOTO lbl36
            var3_5 = (ContentValues)var2_3.next();
            var1_1.insertOrThrow("sessions", null, (ContentValues)var3_5);
            continue;
lbl36:

            return;
            break;
        }
        // Removed invalid catch block
        }
        // Removed invalid catch block
        }
    }
}

