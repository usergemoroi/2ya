/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.net.Uri
 *  android.text.TextUtils
 *  androidx.annotation.GuardedBy
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.iv2
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.ol2
 *  com.yandex.mobile.ads.impl.p30
 *  com.yandex.mobile.ads.impl.q30
 *  com.yandex.mobile.ads.impl.qv
 *  com.yandex.mobile.ads.impl.rv
 *  com.yandex.mobile.ads.impl.s30
 *  com.yandex.mobile.ads.impl.t30
 *  com.yandex.mobile.ads.impl.t30$b
 *  com.yandex.mobile.ads.impl.ub2
 *  com.yandex.mobile.ads.impl.z22
 */
package com.yandex.mobile.ads.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.iv2;
import com.yandex.mobile.ads.impl.m22;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.ol2;
import com.yandex.mobile.ads.impl.p30;
import com.yandex.mobile.ads.impl.q30;
import com.yandex.mobile.ads.impl.qv;
import com.yandex.mobile.ads.impl.rv;
import com.yandex.mobile.ads.impl.s30;
import com.yandex.mobile.ads.impl.t30;
import com.yandex.mobile.ads.impl.ub2;
import com.yandex.mobile.ads.impl.z22;
import java.util.ArrayList;
import java.util.List;

public final class hz
implements ol2 {
    private static final String e;
    private static final String[] f;
    private final String a;
    private final rv b;
    private final Object c;
    @GuardedBy(value="initializationLock")
    private boolean d;

    static {
        StringBuilder stringBuilder = new StringBuilder("state IN (");
        for (int i14 = 0; i14 < 2; ++i14) {
            if (i14 > 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append((new int[]{3, 4})[i14]);
        }
        stringBuilder.append(')');
        e = stringBuilder.toString();
        f = new String[]{"id", "mime_type", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};
    }

    public hz(m22 m222, int n10) {
        this.b = m222;
        this.a = "ExoPlayerDownloads";
        this.c = new Object();
    }

    private Cursor a(String string2, @Nullable String[] stringArray) throws qv {
        try {
            string2 = this.b.getReadableDatabase().query(this.a, f, string2, stringArray, null, null, "start_time_ms ASC");
            return string2;
        }
        catch (Throwable throwable) {
            throw new qv(throwable);
        }
    }

    private static p30 a(Cursor cursor) {
        Object object = cursor.getBlob(14);
        int n10 = 0;
        String string2 = cursor.getString(0);
        string2.getClass();
        String string3 = cursor.getString(2);
        string3.getClass();
        string3 = new t30.b(Uri.parse((String)string3), string2).b(cursor.getString(1)).a(hz.a(cursor.getString(3)));
        if (((byte[])object).length <= 0) {
            object = null;
        }
        string3 = string3.b(object).a(cursor.getString(4)).a(cursor.getBlob(5)).a();
        object = new s30();
        object.a = cursor.getLong(13);
        object.b = cursor.getFloat(12);
        int n13 = cursor.getInt(6);
        if (n13 == 4) {
            n10 = cursor.getInt(11);
        }
        return new p30((t30)string3, n13, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), n10, (s30)object);
    }

    private ArrayList a(SQLiteDatabase sQLiteDatabase) {
        Throwable throwable2;
        block7: {
            ArrayList<p30> arrayList = new ArrayList<p30>();
            if (!m92.a((SQLiteDatabase)sQLiteDatabase, (String)this.a)) {
                return arrayList;
            }
            sQLiteDatabase = sQLiteDatabase.query(this.a, new String[]{"id", "title", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
            try {
                while (sQLiteDatabase.moveToNext()) {
                    arrayList.add(hz.b((Cursor)sQLiteDatabase));
                }
            }
            catch (Throwable throwable2) {
                break block7;
            }
            sQLiteDatabase.close();
            return arrayList;
        }
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            }
            catch (Throwable throwable3) {
                throwable2.addSuppressed(throwable3);
            }
        }
        throw throwable2;
    }

    private static ArrayList a(@Nullable String stringArray) {
        ArrayList<z22> arrayList = new ArrayList<z22>();
        if (TextUtils.isEmpty((CharSequence)stringArray)) {
            return arrayList;
        }
        int n10 = m92.a;
        stringArray = stringArray.split(",", -1);
        int n13 = stringArray.length;
        for (n10 = 0; n10 < n13; ++n10) {
            String[] stringArray2 = stringArray[n10].split("\\.", -1);
            if (stringArray2.length == 3) {
                arrayList.add(new z22(Integer.parseInt(stringArray2[0]), Integer.parseInt(stringArray2[1]), Integer.parseInt(stringArray2[2])));
                continue;
            }
            throw new IllegalStateException();
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a() throws qv {
        Object object = this.c;
        synchronized (object) {
            Throwable throwable3;
            Object object2;
            block13: {
                block11: {
                    Throwable throwable22;
                    SQLiteDatabase sQLiteDatabase;
                    block12: {
                        block10: {
                            if (!this.d) break block10;
                            return;
                        }
                        int n10 = ub2.a((SQLiteDatabase)this.b.getReadableDatabase(), (int)0, (String)"");
                        if (n10 == 3) break block11;
                        sQLiteDatabase = this.b.getWritableDatabase();
                        sQLiteDatabase.beginTransactionNonExclusive();
                        try {
                            ub2.a((SQLiteDatabase)sQLiteDatabase, (int)0, (String)"", (int)3);
                            object2 = n10 == 2 ? this.a(sQLiteDatabase) : new ArrayList();
                        }
                        catch (Throwable throwable22) {
                            break block12;
                        }
                        StringBuilder stringBuilder = new StringBuilder("DROP TABLE IF EXISTS ");
                        stringBuilder.append(this.a);
                        sQLiteDatabase.execSQL(stringBuilder.toString());
                        stringBuilder = new StringBuilder("CREATE TABLE ");
                        stringBuilder.append(this.a);
                        stringBuilder.append(" (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        sQLiteDatabase.execSQL(stringBuilder.toString());
                        object2 = object2.iterator();
                        while (object2.hasNext()) {
                            this.a((p30)object2.next(), sQLiteDatabase);
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        try {
                            sQLiteDatabase.endTransaction();
                            break block11;
                        }
                        catch (Throwable throwable3) {}
                        break block13;
                    }
                    sQLiteDatabase.endTransaction();
                    throw throwable22;
                }
                this.d = true;
                return;
            }
            try {
                object2 = new qv(throwable3);
                throw object2;
            }
            catch (Throwable throwable4) {}
            throw throwable4;
        }
    }

    private void a(p30 p302, SQLiteDatabase sQLiteDatabase) {
        Object object = p302.a.f;
        byte[] byArray = object;
        if (object == null) {
            byArray = m92.f;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", p302.a.b);
        contentValues.put("mime_type", p302.a.d);
        contentValues.put("uri", p302.a.c.toString());
        List list = p302.a.e;
        object = new StringBuilder();
        for (int i14 = 0; i14 < list.size(); ++i14) {
            z22 z222 = (z22)list.get(i14);
            ((StringBuilder)object).append(z222.b);
            ((StringBuilder)object).append('.');
            ((StringBuilder)object).append(z222.c);
            ((StringBuilder)object).append('.');
            ((StringBuilder)object).append(z222.d);
            ((StringBuilder)object).append(',');
        }
        if (((StringBuilder)object).length() > 0) {
            ((StringBuilder)object).setLength(((StringBuilder)object).length() - 1);
        }
        contentValues.put("stream_keys", ((StringBuilder)object).toString());
        contentValues.put("custom_cache_key", p302.a.g);
        contentValues.put("data", p302.a.h);
        contentValues.put("state", Integer.valueOf(p302.b));
        contentValues.put("start_time_ms", Long.valueOf(p302.c));
        contentValues.put("update_time_ms", Long.valueOf(p302.d));
        contentValues.put("content_length", Long.valueOf(p302.e));
        contentValues.put("stop_reason", Integer.valueOf(p302.f));
        contentValues.put("failure_reason", Integer.valueOf(p302.g));
        contentValues.put("percent_downloaded", Float.valueOf(p302.h.b));
        contentValues.put("bytes_downloaded", Long.valueOf(p302.h.a));
        contentValues.put("key_set_id", byArray);
        sQLiteDatabase.replaceOrThrow(this.a, null, contentValues);
    }

    private static p30 b(Cursor cursor) {
        int n10 = 0;
        String string2 = cursor.getString(0);
        string2.getClass();
        String string3 = cursor.getString(2);
        string3.getClass();
        string2 = new t30.b(Uri.parse((String)string3), string2);
        string3 = cursor.getString(1);
        string3 = "dash".equals(string3) ? "application/dash+xml" : ("hls".equals(string3) ? "application/x-mpegURL" : ("ss".equals(string3) ? "application/vnd.ms-sstr+xml" : "video/x-unknown"));
        string2 = string2.b(string3).a(hz.a(cursor.getString(3))).a(cursor.getString(4)).a(cursor.getBlob(5)).a();
        string3 = new s30();
        ((s30)string3).a = cursor.getLong(13);
        ((s30)string3).b = cursor.getFloat(12);
        int n13 = cursor.getInt(6);
        if (n13 == 4) {
            n10 = cursor.getInt(11);
        }
        return new p30((t30)string2, n13, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), n10, (s30)string3);
    }

    public final q30 a(int ... object) throws qv {
        this.a();
        if (((int[])object).length == 0) {
            object = "1";
        } else {
            StringBuilder stringBuilder = new StringBuilder("state IN (");
            for (int i14 = 0; i14 < ((int[])object).length; ++i14) {
                if (i14 > 0) {
                    stringBuilder.append(',');
                }
                stringBuilder.append(object[i14]);
            }
            stringBuilder.append(')');
            object = stringBuilder.toString();
        }
        return new a(this.a((String)object, null), null);
    }

    public final void a(int n10) throws qv {
        this.a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(n10));
            this.b.getWritableDatabase().update(this.a, contentValues, e, null);
            return;
        }
        catch (Throwable throwable) {
            throw new qv(throwable);
        }
    }

    public final void a(int n10, String string2) throws qv {
        this.a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(n10));
            SQLiteDatabase sQLiteDatabase = this.b.getWritableDatabase();
            String string3 = this.a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(e);
            stringBuilder.append(" AND id = ?");
            sQLiteDatabase.update(string3, contentValues, stringBuilder.toString(), new String[]{string2});
            return;
        }
        catch (Throwable throwable) {
            throw new qv(throwable);
        }
    }

    public final void a(p30 p302) throws qv {
        this.a();
        try {
            this.a(p302, this.b.getWritableDatabase());
            return;
        }
        catch (Throwable throwable) {
            throw new qv(throwable);
        }
    }

    /*
     * Exception decompiling
     */
    @Nullable
    public final p30 b(String var1_1) throws qv {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [4 : 55->61)] android.database.sqlite.SQLiteException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final void b() throws qv {
        this.a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", Integer.valueOf(0));
            this.b.getWritableDatabase().update(this.a, contentValues, "state = 2", null);
            return;
        }
        catch (Throwable throwable) {
            throw new qv(throwable);
        }
    }

    public final void c() throws qv {
        this.a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", Integer.valueOf(5));
            contentValues.put("failure_reason", Integer.valueOf(0));
            this.b.getWritableDatabase().update(this.a, contentValues, null, null);
            return;
        }
        catch (Throwable throwable) {
            throw new qv(throwable);
        }
    }

    public final void c(String string2) throws qv {
        this.a();
        try {
            this.b.getWritableDatabase().delete(this.a, "id = ?", new String[]{string2});
            return;
        }
        catch (Throwable throwable) {
            throw new qv(throwable);
        }
    }

    private static final class a
    implements q30 {
        private final Cursor a;

        private a(Cursor cursor) {
            this.a = cursor;
        }

        /* synthetic */ a(Cursor cursor, iv2 iv22) {
            this(cursor);
        }

        public final p30 a() {
            return hz.a(this.a);
        }

        public final boolean a(int n10) {
            return this.a.moveToPosition(n10);
        }

        public final int b() {
            return this.a.getPosition();
        }

        public final void close() {
            this.a.close();
        }
    }
}

