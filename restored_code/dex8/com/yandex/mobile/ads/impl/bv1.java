/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.a60
 *  com.yandex.mobile.ads.impl.c42
 *  com.yandex.mobile.ads.impl.d6
 *  com.yandex.mobile.ads.impl.f50
 *  com.yandex.mobile.ads.impl.kr1
 *  com.yandex.mobile.ads.impl.ou1
 *  com.yandex.mobile.ads.impl.pa
 *  com.yandex.mobile.ads.impl.rk
 *  com.yandex.mobile.ads.impl.t22
 *  com.yandex.mobile.ads.impl.zq1
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.a60;
import com.yandex.mobile.ads.impl.c42;
import com.yandex.mobile.ads.impl.d6;
import com.yandex.mobile.ads.impl.f50;
import com.yandex.mobile.ads.impl.kr1;
import com.yandex.mobile.ads.impl.ou1;
import com.yandex.mobile.ads.impl.pa;
import com.yandex.mobile.ads.impl.rk;
import com.yandex.mobile.ads.impl.t22;
import com.yandex.mobile.ads.impl.wp1;
import com.yandex.mobile.ads.impl.zq1;
import kotlin.u;
import kotlin.v;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public final class bv1
implements kr1<ou1> {
    @NotNull
    private final wp1 a;
    @NotNull
    private final kr1<String> b;
    @NotNull
    private final c42 c;
    @NotNull
    private final f50 d;
    @NotNull
    private final rk e;
    @NotNull
    private final a60 f;
    @NotNull
    private final pa g;
    @NotNull
    private final d6 h;
    @NotNull
    private final t22 i;

    public bv1(@NotNull wp1 wp12, @NotNull kr1<String> kr12, @NotNull c42 c422, @NotNull f50 f502, @NotNull rk rk3, @NotNull a60 a602, @NotNull pa pa2, @NotNull d6 d62, @NotNull t22 t222) {
        this.a = wp12;
        this.b = kr12;
        this.c = c422;
        this.d = f502;
        this.e = rk3;
        this.f = a602;
        this.g = pa2;
        this.h = d62;
        this.i = t222;
    }

    private static Integer a(String object, JSONObject object2) {
        boolean bl2 = object2.has((String)object);
        Object object3 = null;
        Object var4_5 = null;
        if (!bl2) {
            object2 = null;
        }
        if (object2 != null) {
            try {
                object3 = u.d;
                object = u.b(object2.getInt((String)object));
            }
            catch (Throwable throwable) {
                object2 = u.d;
                object = u.b(v.a(throwable));
            }
            if (u.g(object)) {
                object = var4_5;
            }
            object3 = (Integer)object;
        }
        return object3;
    }

    /*
     * Exception decompiling
     */
    public final Object a(zq1 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 126->238)] org.json.JSONException
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
}

