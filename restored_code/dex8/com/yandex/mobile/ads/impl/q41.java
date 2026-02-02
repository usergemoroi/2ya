/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.b81
 *  com.yandex.mobile.ads.impl.b81$a
 *  com.yandex.mobile.ads.impl.i71
 *  com.yandex.mobile.ads.impl.tq1
 *  com.yandex.mobile.ads.impl.u92
 *  com.yandex.mobile.ads.impl.u92$a
 *  com.yandex.mobile.ads.impl.vf
 *  com.yandex.mobile.ads.impl.y71
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.b81;
import com.yandex.mobile.ads.impl.i71;
import com.yandex.mobile.ads.impl.j23;
import com.yandex.mobile.ads.impl.k23;
import com.yandex.mobile.ads.impl.l23;
import com.yandex.mobile.ads.impl.m23;
import com.yandex.mobile.ads.impl.tq1;
import com.yandex.mobile.ads.impl.u92;
import com.yandex.mobile.ads.impl.vf;
import com.yandex.mobile.ads.impl.y71;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class q41
implements b81 {
    @NotNull
    private final List<vf<?>> a;
    @NotNull
    private final y71 b;
    @Nullable
    private String c;
    @Nullable
    private i71 d;

    public q41(@NotNull List<? extends vf<?>> list, @NotNull y71 y712) {
        this.a = list;
        this.b = y712;
    }

    private final boolean a(b81.a a14) {
        i71 i712 = this.d;
        if (i712 == null) {
            return false;
        }
        this.b.c();
        return a14.a(i712);
    }

    private static final boolean a(q41 q412, i71 object) {
        boolean bl2;
        Object object2 = q412.a;
        object = new ArrayList();
        i71 i712 = object2.iterator();
        while (i712.hasNext()) {
            object2 = i712.next();
            if (!((vf)object2).f()) continue;
            ((ArrayList)object).add(object2);
        }
        if (!((ArrayList)object).isEmpty()) {
            object2 = ((ArrayList)object).iterator();
            while (object2.hasNext()) {
                object = (vf)object2.next();
                i712 = q412.d;
                object = i712 != null ? i712.a((vf)object) : null;
                if (object == null || !object.d()) continue;
                bl2 = true;
                break;
            }
        } else {
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Exception decompiling
     */
    private static final boolean b(q41 var0, i71 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[DOLOOP]], but top level block is 3[SIMPLE_IF_TAKEN]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
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
     * Exception decompiling
     */
    private static final boolean c(q41 var0, i71 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[DOLOOP]], but top level block is 3[SIMPLE_IF_TAKEN]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
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
     * Exception decompiling
     */
    private static final boolean d(q41 var0, i71 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[DOLOOP]], but top level block is 3[SIMPLE_IF_TAKEN]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
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

    public static /* synthetic */ boolean e(q41 q412, i71 i712) {
        return q41.c(q412, i712);
    }

    public static /* synthetic */ boolean f(q41 q412, i71 i712) {
        return q41.b(q412, i712);
    }

    public static /* synthetic */ boolean g(q41 q412, i71 i712) {
        return q41.d(q412, i712);
    }

    public static /* synthetic */ boolean h(q41 q412, i71 i712) {
        return q41.a(q412, i712);
    }

    @NotNull
    public final tq1 a() {
        boolean bl2 = this.a(new l23(this));
        return new tq1(this.c, bl2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @NotNull
    public final u92 a(boolean bl2) {
        List<vf<?>> list = this.a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            list = list.iterator();
            int n10 = 0;
            while (list.hasNext()) {
                int n13;
                if (!((vf)list.next()).f()) continue;
                n10 = n13 = n10 + 1;
                if (n13 >= 0) continue;
                t.v();
                n10 = n13;
            }
            if (n10 >= 2 && this.b() && !bl2) {
                list = u92.a.i;
                return new u92((u92.a)list, this.c, null, 4);
            }
        }
        if (this.d() && !bl2) {
            list = u92.a.l;
            return new u92((u92.a)list, this.c, null, 4);
        }
        if (this.c()) {
            list = u92.a.e;
            return new u92((u92.a)list, this.c, null, 4);
        }
        list = u92.a.c;
        return new u92((u92.a)list, this.c, null, 4);
    }

    public final void a(@Nullable i71 i712) {
        this.d = i712;
    }

    public final boolean b() {
        return this.a(new k23(this)) ^ true;
    }

    public final boolean c() {
        return this.a(new j23(this)) ^ true;
    }

    public final boolean d() {
        return this.a(new m23(this)) ^ true;
    }
}

