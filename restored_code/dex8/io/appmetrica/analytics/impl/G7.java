/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.DatabaseUtils
 *  android.database.sqlite.SQLiteDatabase
 *  android.os.Bundle
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.impl.Al;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.Gj;
import io.appmetrica.analytics.impl.Ij;
import io.appmetrica.analytics.impl.Jj;
import io.appmetrica.analytics.impl.Kj;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Vf;
import io.appmetrica.analytics.impl.W9;
import io.appmetrica.analytics.impl.b9;
import io.appmetrica.analytics.impl.bi;
import io.appmetrica.analytics.impl.e7;
import io.appmetrica.analytics.impl.f7;
import io.appmetrica.analytics.impl.l4;
import io.appmetrica.analytics.impl.lg;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.qb;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g7 {
    public final CounterConfigurationReporterType a;
    public final Ij b;

    public g7(CounterConfigurationReporterType counterConfigurationReporterType) {
        this(counterConfigurationReporterType, Na.j().v());
    }

    public g7(CounterConfigurationReporterType counterConfigurationReporterType, Ij ij3) {
        this.a = counterConfigurationReporterType;
        this.b = ij3;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final e7 a(SQLiteDatabase object, String object2, int n10, String object3, boolean bl2) {
        Object object4;
        Iterator iterator;
        ContentValues contentValues;
        Object object5;
        Object object6;
        int n13;
        block27: {
            block25: {
                block24: {
                    block23: {
                        n13 = 0;
                        object6 = object.rawQuery(String.format("SELECT %s, %s, %s FROM %s WHERE %s", "global_number", "type", "event_description", "events", object2), null);
                        if (object6 == null) break block23;
                        try {
                            if (object6.getCount() <= 0) break block23;
                            object5 = new ArrayList(object6.getCount());
                            while (true) {
                                contentValues = object5;
                                if (object6.moveToNext()) {
                                    contentValues = new ContentValues();
                                    DatabaseUtils.cursorRowToContentValues((Cursor)object6, (ContentValues)contentValues);
                                    ((ArrayList)object5).add(contentValues);
                                    continue;
                                }
                                break block24;
                                break;
                            }
                        }
                        catch (Throwable throwable) {
                            contentValues = object6;
                            break block25;
                        }
                    }
                    contentValues = null;
                }
                ro.a((Cursor)object6);
                break block27;
        // Removed invalid catch block
                }
            }
            object6 = Kj.a;
            object6.getClass();
            iterator = new Iterator("select_rows_to_delete_exception", (Throwable)object5);
            object6.a((qb)((Object)iterator));
            contentValues = null;
        }
        try {
            int n14;
            n13 = n14 = object.delete("events", (String)object2, null);
        }
        catch (Throwable throwable) {}
        finally {
            ro.a(contentValues);
        }
        if (contentValues == null) return new e7((ArrayList)contentValues, n13);
        if (contentValues.size() == 0) return new e7((ArrayList)contentValues, n13);
        if (n13 != contentValues.size()) {
            return new e7((ArrayList)contentValues, n13);
        }
        if (!bl2) return new e7((ArrayList)contentValues, n13);
        if (object3 == null) return new e7((ArrayList)contentValues, n13);
        object5 = this.b;
        if (object5 == null) return new e7((ArrayList)contentValues, n13);
        object6 = this.a;
        // MONITORENTER : object5
        object2 = (Gj)((Ij)object5).c.get(object3);
        object = object2;
        if (object2 == null) {
            object = new Gj((String)object3, ((Ij)object5).b, (CounterConfigurationReporterType)((Object)object6), ((Ij)object5).a);
            ((Ij)object5).c.put(object3, object);
        }
        try {
            object5 = new JSONObject();
            object6 = new JSONArray();
            object4 = new JSONArray();
            for (Object object7 : contentValues) {
                object2 = object7.getAsInteger("global_number");
                object7 = object7.getAsInteger("type");
                if (object2 == null || object7 == null) continue;
                object6.put(object2);
                object2 = Bb.a((Integer)object7);
                if (object2 == null) {
                    object2 = lg.a;
                    object2 = null;
                } else {
                    object2 = (Integer)lg.c.get(object2);
                }
                object4.put(object2);
            }
            object5.put("global_number", object6).put("event_type", object4);
            object2 = new JSONObject();
            object2 = object2.put("reason", (Object)f7.a(n10)).put("cleared", object5).put("actual_deleted_number", n13);
            object5 = new JSONObject();
            object5 = object5.put("details", object2);
            object2 = LoggerStorage.getOrCreatePublicLogger((String)object3);
            object3 = object5.toString();
            object5 = W9.a;
            object5 = Bb.c;
            object2 = new l4((String)object3, "", 12290, 0, (PublicLogger)object2);
        }
        // Removed invalid catch block
        }
        if (object2 == null) return new e7((ArrayList)contentValues, n13);
        if (object.c == null) return new e7((ArrayList)contentValues, n13);
        try {
            Object object7;
            iterator = new Iterator(object.a);
            ((CounterConfiguration)((Object)iterator)).setReporterType(object.c);
            object3 = object.d;
            object6 = new Vf(object.b, null);
            object5 = new Al(LoggerStorage.getOrCreatePublicLogger(object.a), "Crash Environment");
            object7 = new b9((Al)object5);
            object4 = new bi((Vf)object6, (CounterConfiguration)((Object)iterator), (b9)object7, null);
            object = ((o6)object2).d(((bi)object4).c());
            ((Jj)object3).a.reportData(1, (Bundle)object);
            return new e7((ArrayList)contentValues, n13);
        }
        catch (Throwable throwable) {
            return new e7((ArrayList)contentValues, n13);
        }
    }
}

