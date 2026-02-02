/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.DatabaseUtils
 *  android.database.sqlite.SQLiteDatabase
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.D7;
import io.appmetrica.analytics.impl.E7;
import io.appmetrica.analytics.impl.F7;
import io.appmetrica.analytics.impl.Gh;
import io.appmetrica.analytics.impl.Kj;
import io.appmetrica.analytics.impl.Lj;
import io.appmetrica.analytics.impl.On;
import io.appmetrica.analytics.impl.R7;
import io.appmetrica.analytics.impl.S7;
import io.appmetrica.analytics.impl.T7;
import io.appmetrica.analytics.impl.W9;
import io.appmetrica.analytics.impl.e7;
import io.appmetrica.analytics.impl.eb;
import io.appmetrica.analytics.impl.fl;
import io.appmetrica.analytics.impl.g7;
import io.appmetrica.analytics.impl.j7;
import io.appmetrica.analytics.impl.lk;
import io.appmetrica.analytics.impl.m6;
import io.appmetrica.analytics.impl.mg;
import io.appmetrica.analytics.impl.pk;
import io.appmetrica.analytics.impl.q9;
import io.appmetrica.analytics.impl.qk;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.impl.v5;
import io.appmetrica.analytics.impl.x7;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

public final class k7 {
    public final ReentrantReadWriteLock.ReadLock a;
    public final ReentrantReadWriteLock.WriteLock b;
    public final x7 c;
    public final j7 d;
    public final Object e;
    public final ArrayList f;
    public final Context g;
    public final v5 h;
    public final AtomicLong i;
    public final ArrayList j;
    public final g7 k;
    public final F7 l;

    static {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        Bb bb4 = Bb.c;
        hashSet.add(0);
        hashSet.add(6400);
    }

    public k7(v5 v54, x7 object, g7 g74, F7 f74) {
        Serializable serializable = new ReentrantReadWriteLock();
        this.a = ((ReentrantReadWriteLock)serializable).readLock();
        this.b = ((ReentrantReadWriteLock)serializable).writeLock();
        this.e = new Object();
        this.f = new ArrayList(3);
        serializable = new AtomicLong();
        this.i = serializable;
        this.j = new ArrayList();
        this.c = object;
        this.g = v54.getContext();
        this.h = v54;
        this.k = g74;
        this.l = f74;
        ((AtomicLong)serializable).set(this.c());
        this.d = object = new j7(this, v54);
        ((Thread)object).setName(k7.a(v54));
    }

    public static String a(eb eb4) {
        StringBuilder stringBuilder = new StringBuilder("DatabaseWorker [");
        stringBuilder.append(eb4.b().e());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static String a(LinkedHashMap object) {
        StringBuilder stringBuilder = new StringBuilder("id >= ?");
        for (String string2 : ((LinkedHashMap)object).keySet()) {
            object = stringBuilder.length() > 0 ? " AND " : "";
            stringBuilder.append((String)object);
            object = new StringBuilder();
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(" = ? ");
            stringBuilder.append(((StringBuilder)object).toString());
        }
        object = TextUtils.isEmpty((CharSequence)stringBuilder.toString()) ? null : stringBuilder.toString();
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean a(k7 k74) {
        Object object = k74.e;
        synchronized (object) {
            return k74.f.isEmpty();
        }
    }

    public static String[] a(String[] object, LinkedHashMap linkedHashMap) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.addAll(Arrays.asList(object));
        object = linkedHashMap.entrySet().iterator();
        while (object.hasNext()) {
            arrayList.add((String)((Map.Entry)object.next()).getValue());
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    public final int a(SQLiteDatabase sQLiteDatabase) {
        try {
            String string2 = String.format("id IN (SELECT id FROM events ORDER BY CASE WHEN type IN (%1$s) THEN 2 WHEN type IN (%2$s) THEN 1 ELSE 0 END, id LIMIT (SELECT count() FROM events) / %3$s)", TextUtils.join((CharSequence)", ", (Iterable)W9.i), TextUtils.join((CharSequence)", ", (Iterable)W9.j), 10);
            int n10 = this.k.a((SQLiteDatabase)sQLiteDatabase, (String)string2, (int)2, (String)this.h.b.b, (boolean)true).b;
            return n10;
        }
        catch (Throwable throwable) {
            lk lk3 = Kj.a;
            lk3.getClass();
            lk3.a(new Lj("deleteExcessiveReports exception", throwable));
            return 0;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long a(Set object) {
        long l10;
        Object object2;
        block7: {
            this.a.lock();
            StringBuilder stringBuilder = null;
            object2 = null;
            long l11 = 0L;
            Object object3 = stringBuilder;
            try {
                SQLiteDatabase sQLiteDatabase = this.c.getReadableDatabase();
                l10 = l11;
                if (sQLiteDatabase == null) break block7;
                object3 = stringBuilder;
                object3 = stringBuilder;
                object2 = new StringBuilder("SELECT count() FROM events");
                object3 = stringBuilder;
                if (!object.isEmpty()) {
                    object3 = stringBuilder;
                    ((StringBuilder)object2).append(" WHERE ");
                }
                object3 = stringBuilder;
                object = object.iterator();
                int n10 = 0;
                while (true) {
                    object3 = stringBuilder;
                    if (!object.hasNext()) break;
                    object3 = stringBuilder;
                    Integer n13 = (Integer)object.next();
                    if (n10 > 0) {
                        object3 = stringBuilder;
                        ((StringBuilder)object2).append(" OR ");
                    }
                    object3 = stringBuilder;
                    object3 = stringBuilder;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    object3 = stringBuilder;
                    stringBuilder2.append("type == ");
                    object3 = stringBuilder;
                    stringBuilder2.append(n13);
                    object3 = stringBuilder;
                    ((StringBuilder)object2).append(stringBuilder2.toString());
                    ++n10;
                }
                object3 = stringBuilder;
                object2 = object = sQLiteDatabase.rawQuery(((StringBuilder)object2).toString(), null);
                l10 = l11;
                object3 = object;
                if (object.moveToFirst()) {
                    object3 = object;
                    l10 = object.getLong(0);
                    object2 = object;
                }
            }
            catch (Throwable throwable) {
                object2 = object3;
                l10 = l11;
            }
        }
        ro.a(object2);
        this.a.unlock();
        return l10;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ContentValues a(long l10, fl fl3) {
        ContentValues contentValues;
        fl fl4;
        block3: {
            ContentValues contentValues2 = new ContentValues();
            this.a.lock();
            fl fl5 = null;
            fl4 = null;
            fl fl6 = fl5;
            try {
                SQLiteDatabase sQLiteDatabase = this.c.getReadableDatabase();
                contentValues = contentValues2;
                if (sQLiteDatabase == null) break block3;
                fl6 = fl5;
                fl3 = sQLiteDatabase.rawQuery(String.format(Locale.US, "SELECT report_request_parameters FROM sessions WHERE id = %s AND type = %s ORDER BY id DESC LIMIT 1", l10, fl3.a), null);
                contentValues = contentValues2;
                fl4 = fl3;
                fl6 = fl3;
                if (fl3.moveToNext()) {
                    fl6 = fl3;
                    fl6 = fl3;
                    contentValues = new ContentValues();
                    fl6 = fl3;
                    DatabaseUtils.cursorRowToContentValues((Cursor)fl3, (ContentValues)contentValues);
                    fl4 = fl3;
                }
            }
            catch (Throwable throwable) {
                contentValues = contentValues2;
                fl4 = fl6;
            }
        }
        ro.a(fl4);
        this.a.unlock();
        return contentValues;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        block4: {
            try {
                Object object;
                this.b.lock();
                long l10 = ((Gh)this.h.k.a()).v;
                if (this.i.get() <= l10 || (object = this.c.getWritableDatabase()) == null) break block4;
                int n10 = this.a((SQLiteDatabase)object);
                this.i.addAndGet(-n10);
                if (n10 != 0) {
                    object = this.j.iterator();
                    while (object.hasNext()) {
                        ((q9)object.next()).a();
                    }
                }
            }
            catch (Throwable throwable) {}
        }
        this.b.unlock();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(long l10, int n10, int n13, boolean bl2) {
        if (n13 <= 0) {
            return;
        }
        this.b.lock();
        try {
            Object object = Locale.US;
            int n14 = 0;
            ArrayList<Object> arrayList = String.format((Locale)object, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", "session_id", Long.toString(l10), "session_type", Integer.toString(n10), "id", "events", Integer.toString(n13 - 1));
            object = this.c.getWritableDatabase();
            if (object != null) {
                object = this.k.a((SQLiteDatabase)object, (String)((Object)arrayList), 1, this.h.b.b, bl2);
                if (((e7)object).a != null) {
                    Object object2;
                    arrayList = new ArrayList<Object>();
                    Iterator iterator = ((e7)object).a.iterator();
                    while (iterator.hasNext()) {
                        object2 = ((ContentValues)iterator.next()).getAsInteger("type");
                        ((Integer)object2).intValue();
                        arrayList.add(object2);
                    }
                    object2 = this.j.iterator();
                    while (object2.hasNext()) {
                        ((q9)object2.next()).b(arrayList);
                    }
                }
                if ((arrayList = ((e7)object).a) != null) {
                    for (n10 = n14; n10 < arrayList.size(); ++n10) {
                        this.a((ContentValues)arrayList.get(n10), "Event removed from db");
                    }
                }
                n10 = ((e7)object).b;
                this.i.addAndGet(-n10);
            }
        }
        catch (Throwable throwable) {}
        this.b.unlock();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(long l10, fl fl3, long l11) {
        void var4_4;
        boolean bl2;
        T7 t74 = new T7(null, 1, null);
        Object object = (Gh)this.h.k.a();
        try {
            JSONObject jSONObject = new JSONObject();
            object = jSONObject.put("dId", (Object)((BaseRequestConfig)object).getDeviceId()).put("uId", (Object)((BaseRequestConfig)object).getUuid()).put("appVer", (Object)((BaseRequestConfig)object).getAppVersion()).put("appBuild", (Object)((BaseRequestConfig)object).getAppBuildNumber()).put("kitBuildType", (Object)((BaseRequestConfig)object).getAnalyticsSdkBuildType()).put("osVer", (Object)((BaseRequestConfig)object).getOsVersion()).put("osApiLev", ((BaseRequestConfig)object).getOsApiLevel()).put("lang", (Object)((BaseRequestConfig)object).getLocale()).put("root", (Object)((BaseRequestConfig)object).getDeviceRootStatus()).put("app_debuggable", (Object)((m6)object).a).put("app_framework", (Object)((BaseRequestConfig)object).getAppFramework()).put("attribution_id", ((Gh)object).r).put("analyticsSdkVersionName", (Object)((BaseRequestConfig)object).getAnalyticsSdkVersionName()).put("kitBuildNumber", (Object)((BaseRequestConfig)object).getAnalyticsSdkBuildNumber());
        }
        catch (Throwable throwable) {
            object = new JSONObject();
        }
        String string2 = object.toString();
        long l13 = On.a();
        object = pk.a;
        synchronized (object) {
            bl2 = ((qk)object).b.b(true);
        }
        object = t74.a(new S7(l10, fl3, string2, new R7((long)var4_4, l13, bl2)));
        if (object == null) {
            return;
        }
        this.b.lock();
        try {
            fl3 = this.c.getWritableDatabase();
            if (fl3 != null) {
                fl3.insertOrThrow("sessions", null, (ContentValues)object);
            }
        }
        catch (Throwable throwable) {}
        this.b.unlock();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(ContentValues object) {
        Object object2 = this.e;
        synchronized (object2) {
            this.f.add(object);
        }
        object = this.d;
        synchronized (object) {
            this.d.notifyAll();
            return;
        }
    }

    public final void a(ContentValues object, String string2) {
        Object object2 = object.getAsInteger("type");
        int n10 = object2 != null ? (Integer)object2 : -1;
        if (W9.d.contains((Object)Bb.a(n10))) {
            Object object3 = new F7(null, 1, null).a((ContentValues)object);
            object2 = this.h.m;
            object = ((E7)object3).d;
            object3 = ((E7)object3).g;
            ((BaseReleaseLogger)object2).info(mg.a(string2, (Bb)((Object)object), ((D7)object3).b, ((D7)object3).c), new Object[0]);
        }
    }

    public final void a(q9 q92) {
        this.j.add(q92);
    }

    public final long b() {
        this.a.lock();
        try {
            long l10 = this.i.get();
            return l10;
        }
        finally {
            this.a.unlock();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long c() {
        long l10;
        block2: {
            this.a.lock();
            try {
                SQLiteDatabase sQLiteDatabase = this.c.getReadableDatabase();
                if (sQLiteDatabase == null) break block2;
                l10 = DBUtils.queryRowsCount(sQLiteDatabase, "events");
            }
            catch (Throwable throwable) {}
        }
        l10 = 0L;
        this.a.unlock();
        return l10;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        SQLiteDatabase sQLiteDatabase;
        StringBuffer stringBuffer;
        block9: {
            SQLiteDatabase sQLiteDatabase2;
            block8: {
                block7: {
                    Cursor cursor;
                    SQLiteDatabase sQLiteDatabase3;
                    this.a.lock();
                    stringBuffer = null;
                    sQLiteDatabase2 = null;
                    sQLiteDatabase = null;
                    try {
                        sQLiteDatabase3 = this.c.getReadableDatabase();
                        if (sQLiteDatabase3 == null) break block7;
                        cursor = sQLiteDatabase3.rawQuery(" SELECT DISTINCT id From sessions order by id asc ", new String[0]);
                        sQLiteDatabase2 = sQLiteDatabase;
                    }
                    catch (Throwable throwable) {
                        sQLiteDatabase2 = null;
                        break block8;
                    }
                    try {
                        sQLiteDatabase2 = sQLiteDatabase;
                        stringBuffer = new StringBuffer();
                        sQLiteDatabase2 = sQLiteDatabase;
                        stringBuffer.append("All sessions in db: ");
                        while (true) {
                            sQLiteDatabase2 = sQLiteDatabase;
                            boolean bl2 = cursor.moveToNext();
                            if (!bl2) break;
                            sQLiteDatabase2 = sQLiteDatabase;
                            stringBuffer.append(cursor.getString(0));
                            sQLiteDatabase2 = sQLiteDatabase;
                            stringBuffer.append(", ");
                        }
                        sQLiteDatabase2 = sQLiteDatabase;
                        sQLiteDatabase2 = sQLiteDatabase3 = sQLiteDatabase3.rawQuery(" SELECT DISTINCT session_id From events order by session_id asc ", new String[0]);
                        sQLiteDatabase2 = sQLiteDatabase3;
                        StringBuffer stringBuffer2 = new StringBuffer();
                        sQLiteDatabase2 = sQLiteDatabase3;
                        stringBuffer2.append("All sessions in reports db: ");
                        while (true) {
                            sQLiteDatabase2 = sQLiteDatabase3;
                            sQLiteDatabase = sQLiteDatabase3;
                            stringBuffer = cursor;
                            if (sQLiteDatabase3.moveToNext()) {
                                sQLiteDatabase2 = sQLiteDatabase3;
                                stringBuffer2.append(sQLiteDatabase3.getString(0));
                                sQLiteDatabase2 = sQLiteDatabase3;
                                stringBuffer2.append(", ");
                                continue;
                            }
                            break block9;
                            break;
                        }
                    }
                    catch (Throwable throwable) {
                        stringBuffer = cursor;
                    }
                    break block8;
                }
                stringBuffer = null;
                sQLiteDatabase = sQLiteDatabase2;
                break block9;
            }
            sQLiteDatabase = sQLiteDatabase2;
        }
        this.a.unlock();
        ro.a(stringBuffer);
        ro.a(sQLiteDatabase);
    }

    public final void e() {
        this.d.start();
    }
}

