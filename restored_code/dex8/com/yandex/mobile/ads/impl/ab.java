/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ag1
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.qj1
 *  com.yandex.mobile.ads.impl.t70
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.w72$d
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ag1;
import com.yandex.mobile.ads.impl.bb;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.jq2;
import com.yandex.mobile.ads.impl.oz;
import com.yandex.mobile.ads.impl.qj1;
import com.yandex.mobile.ads.impl.t70;
import com.yandex.mobile.ads.impl.u70;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.w72;
import java.io.IOException;

public final class ab
implements t70 {
    private final int a;
    private final bb b = new bb();
    private final bg1 c = new bg1(2048);
    private final bg1 d;
    private final ag1 e;
    private v70 f;
    private long g;
    private long h = -1L;
    private int i = -1;
    private boolean j;
    private boolean k;
    private boolean l;

    static {
        new jq2();
    }

    public ab() {
        bg1 bg12;
        this.a = 0;
        this.d = bg12 = new bg1(10);
        this.e = new ag1(bg12.c());
    }

    private int a(oz oz3) throws IOException {
        int n10 = 0;
        while (true) {
            oz3.b(this.d.c(), 0, 10, false);
            this.d.e(0);
            if (this.d.w() != 0x494433) {
                oz3.c();
                oz3.a(false, n10);
                if (this.h == -1L) {
                    this.h = n10;
                }
                return n10;
            }
            this.d.f(3);
            int n12 = this.d.s();
            n10 += n12 + 10;
            oz3.a(false, n12);
        }
    }

    private static t70[] a() {
        return new t70[]{new ab()};
    }

    public static /* synthetic */ t70[] b() {
        return ab.a();
    }

    /*
     * Exception decompiling
     */
    public final int a(u70 var1_1, qj1 var2_3) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [10[DOLOOP]], but top level block is 6[TRYBLOCK]
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

    public final void a(long l10, long l11) {
        this.k = false;
        this.b.a();
        this.g = l11;
    }

    public final void a(v70 v702) {
        this.f = v702;
        this.b.a(v702, new w72.d(Integer.MIN_VALUE, 0, 1));
        v702.a();
    }

    public final boolean a(u70 u702) throws IOException {
        int n10;
        int n12;
        u702 = (oz)u702;
        int n13 = n12 = this.a((oz)u702);
        int n14 = 0;
        int n15 = 0;
        do {
            block5: {
                block4: {
                    block2: {
                        block3: {
                            ((oz)u702).b(this.d.c(), 0, 2, false);
                            this.d.e(0);
                            if ((this.d.z() & 0xFFF6) != 65520) break block2;
                            if (++n14 >= 4 && n15 > 188) {
                                return true;
                            }
                            ((oz)u702).b(this.d.c(), 0, 4, false);
                            this.e.c(14);
                            n10 = this.e.b(13);
                            if (n10 > 6) break block3;
                            ((oz)u702).c();
                            ((oz)u702).a(false, ++n13);
                            break block4;
                        }
                        ((oz)u702).a(false, n10 - 6);
                        n15 += n10;
                        n10 = n13;
                        break block5;
                    }
                    ((oz)u702).c();
                    ((oz)u702).a(false, ++n13);
                }
                n14 = 0;
                n15 = 0;
                n10 = n13;
            }
            n13 = n10;
        } while (n10 - n12 < 8192);
        return false;
    }

    public final void release() {
    }
}

