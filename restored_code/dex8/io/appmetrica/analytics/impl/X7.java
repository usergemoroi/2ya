/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteOpenHelper
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.impl.Kj;
import io.appmetrica.analytics.impl.Lj;
import io.appmetrica.analytics.impl.V5;
import io.appmetrica.analytics.impl.lk;
import io.appmetrica.analytics.impl.qn;
import io.appmetrica.analytics.impl.rn;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;

public final class x7
extends SQLiteOpenHelper
implements Closeable {
    public final String a;
    public final PublicLogger b;
    public final qn c;

    public x7(Context context, String string2, qn qn3, PublicLogger publicLogger) {
        super(context, string2, null, V5.b);
        this.c = qn3;
        this.a = string2;
        this.b = publicLogger;
    }

    public final SQLiteDatabase getReadableDatabase() {
        try {
            SQLiteDatabase sQLiteDatabase = super.getReadableDatabase();
            return sQLiteDatabase;
        }
        catch (Throwable throwable) {
            this.b.error(throwable, "Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.a);
            lk lk3 = Kj.a;
            lk3.getClass();
            lk3.a(new Lj("db_read_error", throwable));
            return null;
        }
    }

    public final SQLiteDatabase getWritableDatabase() {
        try {
            SQLiteDatabase sQLiteDatabase = super.getWritableDatabase();
            return sQLiteDatabase;
        }
        catch (Throwable throwable) {
            this.b.error(throwable, "Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.a);
            lk lk3 = Kj.a;
            lk3.getClass();
            lk3.a(new Lj("db_write_error", throwable));
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        DatabaseScript databaseScript = this.c.a;
        try {
            databaseScript.runScript(sQLiteDatabase);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int n10, int n13) {
        Object object = this.c;
        if (n10 <= n13) {
            object.getClass();
            return;
        }
        DatabaseScript databaseScript = ((qn)object).b;
        try {
            databaseScript.runScript(sQLiteDatabase);
        }
        catch (Throwable throwable) {}
        object = ((qn)object).a;
        try {
            ((DatabaseScript)object).runScript(sQLiteDatabase);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        Object object;
        super.onOpen(sQLiteDatabase);
        qn qn3 = this.c;
        qn3.getClass();
        try {
            object = qn3.d;
            if (object == null) return;
            if (((rn)object).a(sQLiteDatabase)) return;
            object = qn3.b;
        }
        catch (Throwable throwable) {
            return;
        }
        try {
            ((DatabaseScript)object).runScript(sQLiteDatabase);
        }
        catch (Throwable throwable) {}
        qn3.a.runScript(sQLiteDatabase);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int n10, int n13) {
        Iterator iterator;
        Object object;
        block10: {
            block9: {
                object = this.c;
                object.getClass();
                if (n13 <= n10) break block9;
                ++n10;
                while (n10 <= n13) {
                    iterator = (Collection)((qn)object).c.a.get(n10);
                    if (iterator != null) {
                        iterator = iterator.iterator();
                        while (iterator.hasNext()) {
                            ((DatabaseScript)iterator.next()).runScript(sQLiteDatabase);
                        }
                    }
                    ++n10;
                }
                n10 = 0;
                break block10;
                catch (Throwable throwable) {}
            }
            n10 = 1;
        }
        if ((n10 | ((qn)object).d.a(sQLiteDatabase) ^ 1) == 0) return;
        iterator = ((qn)object).b;
        try {
            ((DatabaseScript)((Object)iterator)).runScript(sQLiteDatabase);
        }
        catch (Throwable throwable) {}
        object = ((qn)object).a;
        try {
            ((DatabaseScript)object).runScript(sQLiteDatabase);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

