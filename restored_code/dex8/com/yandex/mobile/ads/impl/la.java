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
 *  com.yandex.mobile.ads.impl.wf
 *  com.yandex.mobile.ads.impl.y71
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.a03;
import com.yandex.mobile.ads.impl.b81;
import com.yandex.mobile.ads.impl.i71;
import com.yandex.mobile.ads.impl.tq1;
import com.yandex.mobile.ads.impl.u92;
import com.yandex.mobile.ads.impl.vf;
import com.yandex.mobile.ads.impl.wf;
import com.yandex.mobile.ads.impl.wz2;
import com.yandex.mobile.ads.impl.xz2;
import com.yandex.mobile.ads.impl.y71;
import com.yandex.mobile.ads.impl.yz2;
import com.yandex.mobile.ads.impl.zz2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class la
implements b81 {
    @NotNull
    private final List<vf<?>> a;
    @NotNull
    private final y71 b;
    @NotNull
    private final Set<? extends String> c;
    @Nullable
    private String d;
    @Nullable
    private i71 e;

    private la(List<? extends vf<?>> list, y71 y712, Set<? extends String> set) {
        this.a = list;
        this.b = y712;
        this.c = set;
    }

    public /* synthetic */ la(List list, y71 y712, Set set, int n10) {
        this(list, y712, set);
    }

    private final boolean a(b81.a a13) {
        i71 i712 = this.e;
        if (i712 == null) {
            return false;
        }
        this.b.c();
        return a13.a(i712);
    }

    private static final boolean a(la object, i71 i712) {
        boolean bl2;
        Iterator iterator = ((la)object).a;
        object = new ArrayList();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Object e11 = iterator.next();
            if (!((vf)e11).f()) continue;
            ((ArrayList)object).add(e11);
        }
        if (!((ArrayList)object).isEmpty()) {
            iterator = ((ArrayList)object).iterator();
            while (iterator.hasNext()) {
                object = i712.a((vf)iterator.next());
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
     * WARNING - void declaration
     */
    private static final boolean b(la la32, i71 i712) {
        void var1_7;
        wf wf3;
        void var0_4;
        block2: {
            for (Object t13 : la32.a) {
                vf vf3 = (vf)t13;
                if (!vf3.f() || !y.e(vf3.b(), "sponsored")) continue;
                break block2;
            }
            Object var0_3 = null;
        }
        vf vf4 = (vf)var0_4;
        boolean bl2 = true;
        if (!(vf4 == null || (wf3 = var1_7.a(vf4)) != null && wf3.d())) {
            bl2 = false;
        }
        return bl2;
    }

    /*
     * Exception decompiling
     */
    private static final boolean c(la var0, i71 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[DOLOOP]], but top level block is 4[SIMPLE_IF_TAKEN]
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
    private static final boolean d(la var0, i71 var1_1) {
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
    private static final boolean e(la var0, i71 var1_1) {
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

    public static /* synthetic */ boolean f(la la3, i71 i712) {
        return la.a(la3, i712);
    }

    public static /* synthetic */ boolean g(la la3, i71 i712) {
        return la.e(la3, i712);
    }

    public static /* synthetic */ boolean h(la la3, i71 i712) {
        return la.b(la3, i712);
    }

    public static /* synthetic */ boolean i(la la3, i71 i712) {
        return la.c(la3, i712);
    }

    public static /* synthetic */ boolean j(la la3, i71 i712) {
        return la.d(la3, i712);
    }

    @NotNull
    public final tq1 a() {
        boolean bl2 = this.a(new a03(this));
        return new tq1(this.d, bl2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @NotNull
    public final u92 a(boolean bl2) {
        Set<? extends String> set = this.c;
        Object object = u92.a.h;
        if (set.contains(object.a()) ^ true && this.c() && !bl2) {
            return new u92((u92.a)object, this.d, null, 4);
        }
        if (!(!(this.c.contains(u92.a.i.a()) ^ true) || (object = this.a) instanceof Collection && object.isEmpty())) {
            object = object.iterator();
            int n10 = 0;
            while (object.hasNext()) {
                int n13;
                if (!((vf)object.next()).f()) continue;
                n10 = n13 = n10 + 1;
                if (n13 >= 0) continue;
                t.v();
                n10 = n13;
            }
            if (n10 >= 2 && this.b() && !bl2) {
                object = u92.a.i;
                return new u92((u92.a)object, this.d, null, 4);
            }
        }
        if ((set = this.c).contains((object = u92.a.l).a()) ^ true && this.e() && !bl2) {
            return new u92((u92.a)object, this.d, null, 4);
        }
        set = this.c;
        object = u92.a.e;
        if (set.contains(object.a()) ^ true && this.d()) {
            return new u92((u92.a)object, this.d, null, 4);
        }
        object = u92.a.c;
        return new u92((u92.a)object, this.d, null, 4);
    }

    public final void a(@Nullable i71 i712) {
        this.e = i712;
    }

    public final boolean b() {
        return this.a(new yz2(this)) ^ true;
    }

    public final boolean c() {
        return this.a(new xz2(this)) ^ true;
    }

    public final boolean d() {
        return this.a(new wz2(this)) ^ true;
    }

    public final boolean e() {
        return this.a(new zz2(this)) ^ true;
    }
}

