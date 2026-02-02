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
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.E7;
import io.appmetrica.analytics.impl.F7;
import org.jetbrains.annotations.NotNull;

public final class g5
extends DatabaseScript {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final F7 x = new F7(null, 1, null);

    public g5() {
        this.a = 2000;
        this.b = "number";
        this.c = "global_number";
        this.d = "number_of_type";
        this.e = "name";
        this.f = "value";
        this.g = "type";
        this.h = "time";
        this.i = "session_id";
        this.j = "error_environment";
        this.k = "session_type";
        this.l = "app_environment";
        this.m = "app_environment_revision";
        this.n = "truncated";
        this.o = "custom_type";
        this.p = "encrypting_mode";
        this.q = "profile_id";
        this.r = "first_occurrence_status";
        this.s = "source";
        this.t = "attribution_id_changed";
        this.u = "open_id";
        this.v = "extras";
        this.w = "reports";
    }

    public static boolean a(E7 object) {
        Object object2 = ((E7)object).a;
        boolean bl2 = !(object2 == null || (Long)object2 < 10000000000L || ((E7)object).b == null || (object2 = ((E7)object).c) == null || (Long)object2 < 0L || (object2 = ((E7)object).d) == null || object2 == Bb.c || (object2 = ((E7)object).e) == null || (Long)object2 < 0L || (object2 = ((E7)object).f) == null || (Long)object2 < 0L || (object2 = ((E7)object).g.d) != null && (Long)object2 < 0L || (object = ((E7)object).g.i) != null && (Integer)object < 0);
        return bl2;
    }

    /*
     * Exception decompiling
     */
    public final E7 a(Cursor var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void runScript(@NotNull SQLiteDatabase var1_1) {
        block9: {
            block7: {
                block10: {
                    var1_1.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY,session_id INTEGER,session_type INTEGER,number_in_session INTEGER,type INTEGER,global_number INTEGER,time INTEGER,event_description BLOB )");
                    var3_2 = null;
                    try {
                        var2_5 = var1_1.query(this.w, null, null, null, null, null, null, String.valueOf(this.a));
                    }
                    catch (Throwable var2_6) {
                        var2_5 = var3_2;
                        ** GOTO lbl-1000
                    }
lbl5:
                    // 3 sources

                    while (true) {
                        var3_2 = var2_5;
                        if (!var2_5.moveToNext()) break block7;
                        var3_2 = this.a((Cursor)var2_5);
                        if (var3_2 == null || !g5.a((E7)var3_2)) continue;
                        var3_2 = this.x.a((E7)var3_2);
                        break;
                    }
                    try {}
                    catch (Throwable var3_4) {
                    }
                    break block10;
                    catch (Throwable var3_3) lbl-1000:
                    // 2 sources

                    {
                        if (var2_5 == null) break block9;
                        var3_2 = var2_5;
                        break block7;
                    }
                }
                var1_1.insertOrThrow("events", null, (ContentValues)var3_2);
                ** while (true)
            }
            var3_2.close();
        }
        var2_5 = new StringBuilder("DROP TABLE IF EXISTS ");
        var2_5.append(this.w);
        var1_1.execSQL(var2_5.toString());
    }
}

