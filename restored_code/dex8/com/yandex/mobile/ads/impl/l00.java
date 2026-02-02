/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.vn
 *  com.yandex.mobile.ads.impl.w72
 *  com.yandex.mobile.ads.impl.w72$b
 *  com.yandex.mobile.ads.impl.w72$c
 */
package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.vn;
import com.yandex.mobile.ads.impl.w72;
import com.yandex.mobile.ads.impl.xj0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class l00
implements w72.c {
    private final int a;
    private final List<cc0> b;

    public l00() {
        this(xj0.h());
    }

    public l00(List list) {
        this.a = 0;
        this.b = list;
    }

    private List<cc0> a(w72.b object) {
        if (this.a(32)) {
            return this.b;
        }
        bg1 bg12 = new bg1(object.c);
        object = this.b;
        while (bg12.a() > 0) {
            int n10 = bg12.t();
            int n13 = bg12.t();
            int n14 = bg12.d();
            if (n10 == 134) {
                ArrayList<cc0> arrayList = new ArrayList<cc0>();
                int n15 = bg12.t();
                n10 = 0;
                while (true) {
                    Object object2;
                    object = arrayList;
                    if (n10 >= (n15 & 0x1F)) break;
                    String string2 = bg12.a(3, vn.c);
                    int n16 = bg12.t();
                    boolean bl2 = (n16 & 0x80) != 0;
                    if (bl2) {
                        n16 &= 0x3F;
                        object = "application/cea-708";
                    } else {
                        object = "application/cea-608";
                        n16 = 1;
                    }
                    byte by = (byte)bg12.t();
                    bg12.f(1);
                    if (bl2) {
                        object2 = (by & 0x40) != 0 ? new byte[]{1} : new byte[]{0};
                        object2 = Collections.singletonList(object2);
                    } else {
                        object2 = null;
                    }
                    arrayList.add(new /* Unavailable Anonymous Inner Class!! */.e((String)object).d(string2).a(n16).a((List)object2).a());
                    ++n10;
                }
            }
            bg12.e(n14 + n13);
        }
        return object;
    }

    private boolean a(int n10) {
        boolean bl2 = (n10 & this.a) != 0;
        return bl2;
    }

    public final SparseArray<w72> a() {
        return new SparseArray();
    }

    /*
     * Exception decompiling
     */
    @Nullable
    public final w72 a(int var1_1, w72.b var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[CASE]], but top level block is 5[SWITCH]
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
}

