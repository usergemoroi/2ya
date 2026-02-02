/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Point
 *  android.os.Bundle
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.util.Pair
 *  android.util.SparseArray
 *  android.util.SparseBooleanArray
 *  androidx.annotation.GuardedBy
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.b70$a
 *  com.yandex.mobile.ads.impl.b70$b
 *  com.yandex.mobile.ads.impl.bx2
 *  com.yandex.mobile.ads.impl.dx2
 *  com.yandex.mobile.ads.impl.ep1
 *  com.yandex.mobile.ads.impl.fi
 *  com.yandex.mobile.ads.impl.fs2
 *  com.yandex.mobile.ads.impl.fx2
 *  com.yandex.mobile.ads.impl.hx2
 *  com.yandex.mobile.ads.impl.ix2
 *  com.yandex.mobile.ads.impl.jf1
 *  com.yandex.mobile.ads.impl.k00$b
 *  com.yandex.mobile.ads.impl.k00$e
 *  com.yandex.mobile.ads.impl.k00$g
 *  com.yandex.mobile.ads.impl.k00$g$a
 *  com.yandex.mobile.ads.impl.k62$a
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.mq
 *  com.yandex.mobile.ads.impl.vl
 *  com.yandex.mobile.ads.impl.vl$a
 *  com.yandex.mobile.ads.impl.vw2
 *  com.yandex.mobile.ads.impl.wl
 *  com.yandex.mobile.ads.impl.ww2
 *  com.yandex.mobile.ads.impl.xj1
 *  com.yandex.mobile.ads.impl.yt0$a
 *  com.yandex.mobile.ads.impl.yw2
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ax2;
import com.yandex.mobile.ads.impl.b62;
import com.yandex.mobile.ads.impl.b70;
import com.yandex.mobile.ads.impl.bx2;
import com.yandex.mobile.ads.impl.c62;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.cx2;
import com.yandex.mobile.ads.impl.dx2;
import com.yandex.mobile.ads.impl.eh;
import com.yandex.mobile.ads.impl.ep1;
import com.yandex.mobile.ads.impl.ex2;
import com.yandex.mobile.ads.impl.fi;
import com.yandex.mobile.ads.impl.fs2;
import com.yandex.mobile.ads.impl.fx2;
import com.yandex.mobile.ads.impl.g60;
import com.yandex.mobile.ads.impl.gx2;
import com.yandex.mobile.ads.impl.hx2;
import com.yandex.mobile.ads.impl.ix2;
import com.yandex.mobile.ads.impl.j62;
import com.yandex.mobile.ads.impl.jf1;
import com.yandex.mobile.ads.impl.k00;
import com.yandex.mobile.ads.impl.k62;
import com.yandex.mobile.ads.impl.l52;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.mq;
import com.yandex.mobile.ads.impl.oa;
import com.yandex.mobile.ads.impl.qw0;
import com.yandex.mobile.ads.impl.vj0;
import com.yandex.mobile.ads.impl.vl;
import com.yandex.mobile.ads.impl.vw2;
import com.yandex.mobile.ads.impl.wl;
import com.yandex.mobile.ads.impl.ww2;
import com.yandex.mobile.ads.impl.xj0;
import com.yandex.mobile.ads.impl.xj1;
import com.yandex.mobile.ads.impl.xw2;
import com.yandex.mobile.ads.impl.yt0;
import com.yandex.mobile.ads.impl.yw2;
import com.yandex.mobile.ads.impl.zs0;
import com.yandex.mobile.ads.impl.zw2;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Exception performing whole class analysis ignored.
 */
public final class k00
extends yt0 {
    private static final jf1<Integer> i = jf1.a((Comparator)new vw2());
    private static final jf1<Integer> j = jf1.a((Comparator)new ww2());
    private final Object c = new Object();
    private final b70.b d;
    private final boolean e;
    @GuardedBy(value="lock")
    private c f;
    @GuardedBy(value="lock")
    @Nullable
    private e g;
    @GuardedBy(value="lock")
    private eh h;

    public k00(Context context, c c11, oa.b b10) {
        this(c11, b10, context);
    }

    private k00(c c11, oa.b b10, @Nullable Context context) {
        if (context != null) {
            context.getApplicationContext();
        }
        this.d = b10;
        this.f = c11;
        this.h = eh.h;
        boolean bl2 = context != null && m92.d((Context)context);
        this.e = bl2;
        if (!bl2 && context != null && m92.a >= 32) {
            this.g = com.yandex.mobile.ads.impl.k00$e.a((Context)context);
        }
        if (this.f.L && context == null) {
            zs0.d((String)"DefaultTrackSelector", (String)"Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    private static int a(int n10, int n13) {
        if (n10 != 0 && n10 == n13) {
            return Integer.MAX_VALUE;
        }
        return Integer.bitCount(n10 & n13);
    }

    protected static int a(cc0 object, @Nullable String string2, boolean bl2) {
        if (!TextUtils.isEmpty((CharSequence)string2) && string2.equals(((cc0)object).d)) {
            return 4;
        }
        string2 = k00.b(string2);
        object = k00.b(((cc0)object).d);
        int n10 = 0;
        if (object != null && string2 != null) {
            if (!((String)object).startsWith(string2) && !string2.startsWith((String)object)) {
                int n13 = m92.a;
                if (((String)object).split("-", 2)[0].equals(string2.split("-", 2)[0])) {
                    return 2;
                }
                return 0;
            }
            return 3;
        }
        int n14 = n10;
        if (bl2) {
            n14 = n10;
            if (object == null) {
                n14 = 1;
            }
        }
        return n14;
    }

    private static /* synthetic */ int a(Integer n10, Integer n13) {
        int n14 = n10;
        int n15 = -1;
        if (n14 == -1) {
            if (n13 == -1) {
                n15 = 0;
            }
        } else {
            n15 = n13 == -1 ? 1 : n10 - n13;
        }
        return n15;
    }

    private static int a(@Nullable String string2) {
        if (string2 == null) {
            return 0;
        }
        int n10 = string2.hashCode();
        int n13 = -1;
        switch (n10) {
            default: {
                break;
            }
            case 1599127257: {
                if (!string2.equals("video/x-vnd.on2.vp9")) break;
                n13 = 3;
                break;
            }
            case 1331836730: {
                if (!string2.equals("video/avc")) break;
                n13 = 2;
                break;
            }
            case -1662541442: {
                if (!string2.equals("video/hevc")) break;
                n13 = 1;
                break;
            }
            case -1662735862: {
                if (!string2.equals("video/av01")) break;
                n13 = 0;
            }
        }
        switch (n13) {
            default: {
                return 0;
            }
            case 3: {
                return 2;
            }
            case 2: {
                return 1;
            }
            case 1: {
                return 3;
            }
            case 0: 
        }
        return 4;
    }

    @Nullable
    private static Pair a(int n10, yt0.a object, int[][][] object2, a a13, Comparator comparator) {
        ArrayList<List<Object>> arrayList = new ArrayList<List<Object>>();
        int n13 = object.a();
        for (int i14 = 0; i14 < n13; ++i14) {
            int n14 = n13;
            if (n10 == object.a(i14)) {
                c62 c622 = object.b(i14);
                int n15 = 0;
                while (true) {
                    n14 = n13;
                    if (n15 >= c622.b) break;
                    b62 b622 = c622.a(n15);
                    List list = a13.a(i14, b622, (int[])object2[i14][n15]);
                    boolean[] blArray = new boolean[b622.b];
                    for (n14 = 0; n14 < b622.b; ++n14) {
                        List<Object> list2;
                        g g11 = list.get(n14);
                        int n16 = g11.a();
                        if (blArray[n14] || n16 == 0) continue;
                        if (n16 == 1) {
                            list2 = xj0.a(g11);
                        } else {
                            list2 = new ArrayList();
                            ((ArrayList)list2).add(g11);
                            for (n16 = n14 + 1; n16 < b622.b; ++n16) {
                                g g12 = list.get(n16);
                                if (g12.a() != 2 || !g11.a(g12)) continue;
                                ((ArrayList)list2).add(g12);
                                blArray[n16] = true;
                            }
                        }
                        arrayList.add(list2);
                    }
                    ++n15;
                }
            }
            n13 = n14;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        object2 = (List)Collections.max(arrayList, comparator);
        object = new int[object2.size()];
        for (n10 = 0; n10 < object2.size(); ++n10) {
            object[n10] = (object2.get((int)n10)).d;
        }
        object2 = object2.get(0);
        return Pair.create((Object)new /* Unavailable Anonymous Inner Class!! */, (Object)object2.b);
    }

    @Nullable
    protected static Pair a(yt0.a a13, int[][][] nArray, c c11, @Nullable String string2) throws g60 {
        return k00.a(3, a13, nArray, new ax2(c11, string2), (Comparator)new bx2());
    }

    @Nullable
    protected static Pair a(yt0.a a13, int[][][] nArray, int[] nArray2, c c11) throws g60 {
        return k00.a(2, a13, nArray, new xw2(c11, nArray2), (Comparator)new yw2());
    }

    private static List a(c c11, String string2, int n10, b62 b622, int[] nArray) {
        int n13 = xj0.d;
        xj0.a a13 = new xj0.a();
        for (n13 = 0; n13 < b622.b; ++n13) {
            a13.b(new f(n10, b622, n13, c11, nArray[n13], string2));
        }
        return a13.a();
    }

    private List a(c c11, boolean bl2, int n10, b62 b622, int[] nArray) {
        zw2 zw22 = new zw2(this);
        int n13 = xj0.d;
        xj0.a a13 = new xj0.a();
        for (n13 = 0; n13 < b622.b; ++n13) {
            a13.b(new a(n10, b622, n13, c11, nArray[n13], bl2, zw22));
        }
        return a13.a();
    }

    private static List a(c c11, int[] object, int n10, b62 b622, int[] nArray) {
        int n13;
        int n14 = object[n10];
        int n15 = c11.j;
        int n16 = c11.k;
        boolean bl2 = c11.l;
        if (n15 != Integer.MAX_VALUE && n16 != Integer.MAX_VALUE) {
            n13 = Integer.MAX_VALUE;
            for (int i14 = 0; i14 < b622.b; ++i14) {
                cc0 cc02 = b622.a(i14);
                int n17 = cc02.r;
                int n18 = n13;
                if (n17 > 0) {
                    int n19 = cc02.s;
                    n18 = n13;
                    if (n19 > 0) {
                        int n23;
                        if (bl2 && (n18 = n17 > n19 ? 1 : 0) != (n23 = n15 > n16 ? 1 : 0)) {
                            n18 = n15;
                            n23 = n16;
                        } else {
                            n23 = n15;
                            n18 = n16;
                        }
                        int n24 = n17 * n18;
                        int n25 = n19 * n23;
                        if (n24 >= n25) {
                            n18 = m92.a;
                            object = new Point(n23, (n25 + n17 - 1) / n17);
                        } else {
                            n23 = m92.a;
                            object = new Point((n24 + n19 - 1) / n19, n18);
                        }
                        n17 = cc02.r;
                        n19 = cc02.s;
                        n23 = n17 * n19;
                        n18 = n13;
                        if (n17 >= (int)((float)((Point)object).x * 0.98f)) {
                            n18 = n13;
                            if (n19 >= (int)((float)((Point)object).y * 0.98f)) {
                                n18 = n13;
                                if (n23 < n13) {
                                    n18 = n23;
                                }
                            }
                        }
                    }
                }
                n13 = n18;
            }
        } else {
            n13 = Integer.MAX_VALUE;
        }
        n16 = xj0.d;
        object = new xj0.a();
        for (n16 = 0; n16 < b622.b; ++n16) {
            n15 = b622.a(n16).b();
            bl2 = n13 == Integer.MAX_VALUE || n15 != -1 && n15 <= n13;
            ((vj0.a)((Object)object)).b((Object)new h(n10, b622, n16, c11, nArray[n16], n14, bl2));
        }
        return ((xj0.a)((Object)object)).a();
    }

    private static void a(c62 c622, c c11, HashMap hashMap) {
        for (int i14 = 0; i14 < c622.b; ++i14) {
            Object object = c622.a(i14);
            j62 j622 = (j62)c11.z.get(object);
            if (j622 == null || (object = (j62)hashMap.get(j622.b.d)) != null && (!((AbstractCollection)((Object)((j62)object).c)).isEmpty() || ((AbstractCollection)((Object)j622.c)).isEmpty())) continue;
            hashMap.put(j622.b.d, j622);
        }
    }

    /*
     * Exception decompiling
     */
    private boolean a(cc0 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [7 : 340->343)] java.lang.Throwable
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

    protected static boolean a(boolean bl2, int n10) {
        bl2 = (n10 &= 7) == 4 || bl2 && n10 == 3;
        return bl2;
    }

    private static /* synthetic */ int b(Integer n10, Integer n13) {
        return 0;
    }

    @Nullable
    protected static String b(@Nullable String string2) {
        String string3;
        block3: {
            block2: {
                if (TextUtils.isEmpty((CharSequence)string2)) break block2;
                string3 = string2;
                if (!TextUtils.equals((CharSequence)string2, (CharSequence)"und")) break block3;
            }
            string3 = null;
        }
        return string3;
    }

    public static /* synthetic */ List e(c c11, String string2, int n10, b62 b622, int[] nArray) {
        return k00.a(c11, string2, n10, b622, nArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void e() {
        e e11;
        Object object = this.c;
        // MONITORENTER : object
        boolean bl2 = this.f.L && !this.e && m92.a >= 32 && (e11 = this.g) != null && com.yandex.mobile.ads.impl.k00$e.a(e11);
        if (!bl2) return;
        this.b();
    }

    public static /* synthetic */ int f(Integer n10, Integer n13) {
        return k00.a(n10, n13);
    }

    public static /* synthetic */ boolean g(k00 k002, cc0 cc02) {
        return k002.a(cc02);
    }

    public static /* synthetic */ List h(c c11, int[] nArray, int n10, b62 b622, int[] nArray2) {
        return k00.a(c11, nArray, n10, b622, nArray2);
    }

    public static /* synthetic */ int i(Integer n10, Integer n13) {
        return k00.b(n10, n13);
    }

    public static /* synthetic */ List j(k00 k002, c c11, boolean bl2, int n10, b62 b622, int[] nArray) {
        return k002.a(c11, bl2, n10, b622, nArray);
    }

    static /* bridge */ /* synthetic */ void k(k00 k002) {
        k002.e();
    }

    static /* bridge */ /* synthetic */ int o(String string2) {
        return k00.a(string2);
    }

    @Nullable
    protected final Pair a(yt0.a a13, int[][][] nArray, c c11) throws g60 {
        boolean bl2;
        boolean bl3 = false;
        int n10 = 0;
        while (true) {
            bl2 = bl3;
            if (n10 >= a13.a()) break;
            if (2 == a13.a(n10) && a13.b((int)n10).b > 0) {
                bl2 = true;
                break;
            }
            ++n10;
        }
        return k00.a(1, a13, nArray, new cx2(this, c11, bl2), (Comparator)new dx2());
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final Pair<ep1[], b70[]> a(yt0.a var1_1, int[][][] var2_3, int[] var3_4, qw0.b var4_5, l52 var5_6) throws g60 {
        block35: {
            block30: {
                block29: {
                    var4_5 = this.c;
                    synchronized (var4_5) {
                        try {
                            var16_7 = this.f;
                            if (!var16_7.L || m92.a < 32 || (var5_6 /* !! */  = this.g) == null) break block29;
                            var13_8 /* !! */  = Looper.myLooper();
                            if (var13_8 /* !! */  == null) {
                                var1_1 /* !! */  = new IllegalStateException();
                                throw var1_1 /* !! */ ;
                            }
                            var5_6 /* !! */ .a(this, var13_8 /* !! */ );
                        }
                        catch (Throwable var1_2) {
                            ** break block31
                        }
                    }
                }
                var11_9 = var1_1 /* !! */ .a();
                var6_10 = var1_1 /* !! */ .a();
                var17_11 = new b70.a[var6_10];
                var3_4 = k00.a(var1_1 /* !! */ , var2_3, (int[])var3_4, var16_7);
                if (var3_4 != null) {
                    var17_11[((Integer)var3_4.second).intValue()] = var3_4.first;
                }
                if ((var3_4 = (Object)this.a(var1_1 /* !! */ , var2_3, var16_7)) != null) {
                    var17_11[((Integer)var3_4.second).intValue()] = var3_4.first;
                }
                if (var3_4 == null) {
                    var3_4 = null;
                } else {
                    var3_4 = var3_4.first;
                    var3_4 = var3_4.a.a((int)var3_4.b[0]).d;
                }
                var3_4 = k00.a(var1_1 /* !! */ , var2_3, var16_7, (String)var3_4);
                if (var3_4 != null) {
                    var17_11[((Integer)var3_4.second).intValue()] = var3_4.first;
                }
                for (var8_12 = 0; var8_12 < var6_10; ++var8_12) {
                    var7_13 = var1_1 /* !! */ .a(var8_12);
                    if (var7_13 == 2 || var7_13 == 1 || var7_13 == 3) continue;
                    var4_5 = var1_1 /* !! */ .b(var8_12);
                    var18_19 = var2_3[var8_12];
                    var10_15 = 0;
                    var13_8 /* !! */  = null;
                    var5_6 /* !! */  = null;
                    var7_13 = var6_10;
                    for (var9_14 = 0; var9_14 < var4_5.b; ++var9_14) {
                        var3_4 = var4_5.a(var9_14);
                        var19_20 = var18_19[var9_14];
                        for (var6_10 = 0; var6_10 < var3_4.b; ++var6_10) {
                            block34: {
                                block32: {
                                    block33: {
                                        var12_16 = var19_20[var6_10];
                                        if (!k00.a(var16_7.M, var12_16)) break block32;
                                        var15_18 = new /* Unavailable Anonymous Inner Class!! */;
                                        if (var5_6 /* !! */  == null) break block33;
                                        var14_17 = var5_6 /* !! */ ;
                                        if (mq.b().a(b.c(var15_18), b.c(var5_6 /* !! */ )).a(b.a(var15_18), b.a(var5_6 /* !! */ )).a() <= 0) break block34;
                                    }
                                    var10_15 = var6_10;
                                    var14_17 = var15_18;
                                    var13_8 /* !! */  = var3_4;
                                    break block34;
                                }
                                var14_17 = var5_6 /* !! */ ;
                            }
                            var5_6 /* !! */  = var14_17;
                        }
                    }
                    var6_10 = var7_13;
                    var3_4 = var13_8 /* !! */  == null ? null : new /* Unavailable Anonymous Inner Class!! */;
                    var17_11[var8_12] = var3_4;
                }
                var7_13 = var1_1 /* !! */ .a();
                var4_5 = new HashMap<K, V>();
                for (var6_10 = 0; var6_10 < var7_13; ++var6_10) {
                    k00.a(var1_1 /* !! */ .b(var6_10), var16_7, (HashMap)var4_5);
                }
                k00.a(var1_1 /* !! */ .b(), var16_7, (HashMap)var4_5);
                var6_10 = 0;
                while (true) {
                    var8_12 = -1;
                    if (var6_10 >= var7_13) break;
                    var3_4 = (j62)var4_5.get(var1_1 /* !! */ .a(var6_10));
                    if (var3_4 != null) {
                        var3_4 = var3_4.c.isEmpty() == false && var1_1 /* !! */ .b(var6_10).a(var3_4.b) != -1 ? new /* Unavailable Anonymous Inner Class!! */ : null;
                        var17_11[var6_10] = var3_4;
                    }
                    ++var6_10;
                }
                var7_13 = var1_1 /* !! */ .a();
                for (var6_10 = 0; var6_10 < var7_13; ++var6_10) {
                    var4_5 = var1_1 /* !! */ .b(var6_10);
                    var3_4 = (Map)com.yandex.mobile.ads.impl.k00$c.d(var16_7).get(var6_10);
                    if (var3_4 == null || !var3_4.containsKey(var4_5)) continue;
                    var3_4 = (Map)com.yandex.mobile.ads.impl.k00$c.d(var16_7).get(var6_10);
                    var3_4 = var3_4 != null ? (d)var3_4.get(var4_5) : null;
                    if (var3_4 != null && var3_4.c.length != 0) {
                        var4_5 = var4_5.a(var3_4.b);
                        var5_6 /* !! */  = var3_4.c;
                        var3_4 = new /* Unavailable Anonymous Inner Class!! */;
                    } else {
                        var3_4 = null;
                    }
                    var17_11[var6_10] = var3_4;
                }
                for (var6_10 = 0; var6_10 < var11_9; ++var6_10) {
                    var7_13 = var1_1 /* !! */ .a(var6_10);
                    if (!com.yandex.mobile.ads.impl.k00$c.e(var16_7).get(var6_10) && !var16_7.A.contains(var7_13)) continue;
                    var17_11[var6_10] = null;
                }
                var4_5 = this.d;
                var3_4 = this.a();
                var4_5 = ((oa.b)var4_5).a(var17_11, (fi)var3_4);
                var5_6 /* !! */  = new ep1[var11_9];
                for (var6_10 = 0; var6_10 < var11_9; ++var6_10) {
                    var7_13 = var1_1 /* !! */ .a(var6_10);
                    var3_4 = com.yandex.mobile.ads.impl.k00$c.e(var16_7).get(var6_10) == false && var16_7.A.contains(var7_13) == false && (var1_1 /* !! */ .a(var6_10) == -2 || var4_5[var6_10] != null) ? ep1.b : null;
                    var5_6 /* !! */ [var6_10] = var3_4;
                }
                if (!var16_7.N) break block35;
                var9_14 = -1;
                var10_15 = -1;
                var6_10 = var8_12;
                var8_12 = var10_15;
                block12: for (var7_13 = 0; var7_13 < var1_1 /* !! */ .a(); ++var7_13) {
                    block38: {
                        block37: {
                            block36: {
                                var10_15 = var1_1 /* !! */ .a(var7_13);
                                var3_4 = var4_5[var7_13];
                                if (var10_15 != 1 && var10_15 != 2 || var3_4 == null) continue;
                                var13_8 /* !! */  = (Looper)var2_3[var7_13];
                                var11_9 = var1_1 /* !! */ .b(var7_13).a(var3_4.a());
                                for (var6_10 = 0; var6_10 < var3_4.b(); ++var6_10) {
                                    if ((var13_8 /* !! */ [var11_9][var3_4.b(var6_10)] & 32) == 32) continue;
                                    var6_10 = -1;
                                    continue block12;
                                }
                                if (var10_15 != 1) break block36;
                                var6_10 = -1;
                                if (var9_14 == -1) {
                                    var9_14 = var7_13;
                                    continue;
                                }
                                break block37;
                            }
                            var6_10 = -1;
                            if (var8_12 == -1) break block38;
                        }
                        var7_13 = -1;
                        var6_10 = 0;
                        break block30;
                    }
                    var8_12 = var7_13;
                }
                var7_13 = var6_10;
                var6_10 = 1;
            }
            var7_13 = var9_14 != var7_13 && var8_12 != var7_13 ? 1 : 0;
            if ((var6_10 & var7_13) != 0) {
                var1_1 /* !! */  = new ep1(true);
                var5_6 /* !! */ [var9_14] = var1_1 /* !! */ ;
                var5_6 /* !! */ [var8_12] = var1_1 /* !! */ ;
            }
        }
        return Pair.create((Object)var5_6 /* !! */ , (Object)var4_5);

        {
            throw var1_2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(eh eh2) {
        Object object = this.c;
        // MONITORENTER : object
        boolean bl2 = this.h.equals(eh2);
        this.h = eh2;
        // MONITOREXIT : object
        if (!(bl2 ^ true)) return;
        this.e();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void d() {
        e e11;
        Object object = this.c;
        // MONITORENTER : object
        if (m92.a >= 32 && (e11 = this.g) != null) {
            e11.c();
        }
        super.d();
    }

    private static final class a
    extends g<a>
    implements Comparable<a> {
        private final int f;
        private final boolean g;
        @Nullable
        private final String h;
        private final c i;
        private final boolean j;
        private final int k;
        private final int l;
        private final int m;
        private final boolean n;
        private final int o;
        private final int p;
        private final boolean q;
        private final int r;
        private final int s;
        private final int t;
        private final int u;
        private final boolean v;
        private final boolean w;

        public a(int n10, b62 object, int n13, c c11, int n14, boolean bl2, xj1<cc0> xj12) {
            boolean bl3;
            int n15;
            boolean bl4;
            block7: {
                block6: {
                    super(n10, n13, (b62)object);
                    this.i = c11;
                    this.h = k00.b(this.e.d);
                    bl4 = false;
                    this.j = k00.a(false, n14);
                    n10 = 0;
                    while (true) {
                        n13 = ((AbstractCollection)((Object)c11.o)).size();
                        n15 = Integer.MAX_VALUE;
                        if (n10 >= n13) break;
                        n13 = k00.a(this.e, (String)c11.o.get(n10), false);
                        if (n13 <= 0) {
                            ++n10;
                            continue;
                        }
                        break block6;
                        break;
                    }
                    n13 = 0;
                    n10 = Integer.MAX_VALUE;
                }
                this.l = n10;
                this.k = n13;
                this.m = k00.a(this.e.f, c11.p);
                object = this.e;
                n10 = ((cc0)object).f;
                bl3 = n10 == 0 || (n10 & 1) != 0;
                this.n = bl3;
                bl3 = (((cc0)object).e & 1) != 0;
                this.q = bl3;
                this.r = n10 = ((cc0)object).z;
                this.s = ((cc0)object).A;
                this.t = n13 = ((cc0)object).i;
                bl3 = !(n13 != -1 && n13 > c11.r || n10 != -1 && n10 > c11.q || !xj12.apply(object));
                this.g = bl3;
                object = m92.d();
                for (n10 = 0; n10 < ((String[])object).length; ++n10) {
                    int n16 = k00.a(this.e, object[n10], false);
                    if (n16 <= 0) continue;
                    n13 = n10;
                    n10 = n16;
                    break block7;
                }
                n10 = 0;
                n13 = Integer.MAX_VALUE;
            }
            this.o = n13;
            this.p = n10;
            n10 = 0;
            while (true) {
                n13 = n15;
                if (n10 >= ((AbstractCollection)((Object)c11.s)).size()) break;
                object = this.e.m;
                if (object != null && ((String)object).equals(c11.s.get(n10))) {
                    n13 = n10;
                    break;
                }
                ++n10;
            }
            this.u = n13;
            bl3 = fs2.a((int)n14) == 128;
            this.v = bl3;
            bl3 = bl4;
            if (fs2.c((int)n14) == 64) {
                bl3 = true;
            }
            this.w = bl3;
            this.f = this.a(bl2, n14);
        }

        public static int a(List<a> list, List<a> list2) {
            return Collections.max(list).a(Collections.max(list2));
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        private int a(boolean bl2, int n10) {
            if (!k00.a(this.i.M, n10)) {
                return 0;
            }
            if (!this.g && !this.i.G) {
                return 0;
            }
            if (!k00.a(false, n10)) return 1;
            if (!this.g) return 1;
            if (this.e.i == -1) return 1;
            c c11 = this.i;
            if (c11.y) return 1;
            if (c11.x) return 1;
            if (c11.O) return 2;
            if (bl2) return 1;
            return 2;
        }

        public final int a() {
            return this.f;
        }

        public final int a(a a13) {
            jf1 jf12 = this.g && this.j ? i : i.b();
            mq mq3 = mq.b().a(this.j, a13.j).a((Object)this.l, (Object)a13.l, (Comparator)jf1.a().b()).a(this.k, a13.k).a(this.m, a13.m).a(this.q, a13.q).a(this.n, a13.n).a((Object)this.o, (Object)a13.o, (Comparator)jf1.a().b()).a(this.p, a13.p).a(this.g, a13.g).a((Object)this.u, (Object)a13.u, (Comparator)jf1.a().b());
            int n10 = this.t;
            int n13 = a13.t;
            jf1 jf13 = this.i.x ? i.b() : j;
            jf13 = mq3.a((Object)n10, (Object)n13, (Comparator)jf13).a(this.v, a13.v).a(this.w, a13.w).a((Object)this.r, (Object)a13.r, (Comparator)jf12).a((Object)this.s, (Object)a13.s, (Comparator)jf12);
            n10 = this.t;
            n13 = a13.t;
            if (!m92.a((Object)this.h, (Object)a13.h)) {
                jf12 = j;
            }
            return jf13.a((Object)n10, (Object)n13, (Comparator)jf12).a();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final boolean a(g g11) {
            int n10;
            g11 = (a)g11;
            Object object = this.i;
            if (!((c)object).J) {
                n10 = this.e.z;
                if (n10 == -1) return false;
                if (n10 != g11.e.z) return false;
            }
            if (!((c)object).H) {
                object = this.e.m;
                if (object == null) return false;
                if (!TextUtils.equals((CharSequence)object, (CharSequence)g11.e.m)) return false;
            }
            object = this.i;
            if (!((c)object).I) {
                n10 = this.e.A;
                if (n10 == -1) return false;
                if (n10 != g11.e.A) return false;
            }
            if (((c)object).K) return true;
            if (this.v != g11.v) return false;
            if (this.w != g11.w) return false;
            return true;
        }
    }

    public static final class c
    extends k62 {
        public static final c R = new c(new a());
        public final boolean C;
        public final boolean D;
        public final boolean E;
        public final boolean F;
        public final boolean G;
        public final boolean H;
        public final boolean I;
        public final boolean J;
        public final boolean K;
        public final boolean L;
        public final boolean M;
        public final boolean N;
        public final boolean O;
        private final SparseArray<Map<c62, d>> P;
        private final SparseBooleanArray Q;

        static {
            new ex2();
        }

        private c(a a13) {
            super(a13);
            this.C = a13.A;
            this.D = a13.B;
            this.E = a13.C;
            this.F = a13.D;
            this.G = a13.E;
            this.H = a13.F;
            this.I = a13.G;
            this.J = a13.H;
            this.K = a13.I;
            this.L = a13.J;
            this.M = a13.K;
            this.N = a13.L;
            this.O = a13.M;
            this.P = a13.N;
            this.Q = a13.O;
        }

        public static c a(Context context) {
            return new c(new a(context));
        }

        private static c b(Bundle bundle) {
            return new c(new a(bundle, null));
        }

        public static /* synthetic */ c c(Bundle bundle) {
            return com.yandex.mobile.ads.impl.k00$c.b(bundle);
        }

        static /* bridge */ /* synthetic */ SparseArray d(c c11) {
            return c11.P;
        }

        static /* bridge */ /* synthetic */ SparseBooleanArray e(c c11) {
            return c11.Q;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final boolean equals(@Nullable Object sparseArray) {
            int n10;
            boolean bl2 = true;
            if (this == sparseArray) {
                return true;
            }
            if (sparseArray == null) return false;
            if (c.class != sparseArray.getClass()) return false;
            Object object = (c)sparseArray;
            if (!super.equals(object)) return false;
            if (this.C != ((c)object).C) return false;
            if (this.D != ((c)object).D) return false;
            if (this.E != ((c)object).E) return false;
            if (this.F != ((c)object).F) return false;
            if (this.G != ((c)object).G) return false;
            if (this.H != ((c)object).H) return false;
            if (this.I != ((c)object).I) return false;
            if (this.J != ((c)object).J) return false;
            if (this.K != ((c)object).K) return false;
            if (this.L != ((c)object).L) return false;
            if (this.M != ((c)object).M) return false;
            if (this.N != ((c)object).N) return false;
            if (this.O != ((c)object).O) return false;
            sparseArray = this.Q;
            SparseArray<Map<c62, d>> sparseArray2 = ((c)object).Q;
            int n13 = sparseArray.size();
            if (sparseArray2.size() != n13) return false;
            for (n10 = 0; n10 < n13; ++n10) {
                if (sparseArray2.indexOfKey(sparseArray.keyAt(n10)) < 0) return false;
            }
            sparseArray = this.P;
            sparseArray2 = ((c)object).P;
            n13 = sparseArray.size();
            if (sparseArray2.size() != n13) return false;
            n10 = 0;
            while (true) {
                boolean bl3 = bl2;
                if (n10 >= n13) return bl3;
                int n14 = sparseArray2.indexOfKey(sparseArray.keyAt(n10));
                if (n14 < 0) return false;
                Map map2 = (Map)sparseArray.valueAt(n10);
                object = (Map)sparseArray2.valueAt(n14);
                n14 = map2.size();
                if (object.size() != n14) return false;
                for (Map.Entry entry : map2.entrySet()) {
                    c62 c622 = (c62)entry.getKey();
                    if (!object.containsKey(c622)) return false;
                    if (m92.a(entry.getValue(), object.get(c622))) continue;
                    return false;
                }
                ++n10;
            }
        }

        @Override
        public final int hashCode() {
            return (((((((((((((super.hashCode() + 31) * 31 + this.C) * 31 + this.D) * 31 + this.E) * 31 + this.F) * 31 + this.G) * 31 + this.H) * 31 + this.I) * 31 + this.J) * 31 + this.K) * 31 + this.L) * 31 + this.M) * 31 + this.N) * 31 + this.O;
        }

        public static final class a
        extends k62.a {
            private boolean A;
            private boolean B;
            private boolean C;
            private boolean D;
            private boolean E;
            private boolean F;
            private boolean G;
            private boolean H;
            private boolean I;
            private boolean J;
            private boolean K;
            private boolean L;
            private boolean M;
            private final SparseArray<Map<c62, d>> N;
            private final SparseBooleanArray O;

            @Deprecated
            public a() {
                this.N = new SparseArray();
                this.O = new SparseBooleanArray();
                this.a();
            }

            public a(Context context) {
                super(context);
                this.N = new SparseArray();
                this.O = new SparseBooleanArray();
                this.a();
            }

            private a(Bundle bundle) {
                super(bundle);
                this.a();
                c c11 = R;
                this.l(bundle.getBoolean(k62.a(1000), c11.C));
                this.g(bundle.getBoolean(k62.a(1001), c11.D));
                this.h(bundle.getBoolean(k62.a(1002), c11.E));
                this.f(bundle.getBoolean(k62.a(1014), c11.F));
                this.j(bundle.getBoolean(k62.a(1003), c11.G));
                this.c(bundle.getBoolean(k62.a(1004), c11.H));
                this.d(bundle.getBoolean(k62.a(1005), c11.I));
                this.a(bundle.getBoolean(k62.a(1006), c11.J));
                this.b(bundle.getBoolean(k62.a(1015), c11.K));
                this.i(bundle.getBoolean(k62.a(1016), c11.L));
                this.k(bundle.getBoolean(k62.a(1007), c11.M));
                this.m(bundle.getBoolean(k62.a(1008), c11.N));
                this.e(bundle.getBoolean(k62.a(1009), c11.O));
                this.N = new SparseArray();
                this.a(bundle);
                this.O = a.a(bundle.getIntArray(k62.a(1013)));
            }

            /* synthetic */ a(Bundle bundle, fx2 fx22) {
                this(bundle);
            }

            private static SparseBooleanArray a(@Nullable int[] nArray) {
                if (nArray == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(nArray.length);
                int n10 = nArray.length;
                for (int i14 = 0; i14 < n10; ++i14) {
                    sparseBooleanArray.append(nArray[i14], true);
                }
                return sparseBooleanArray;
            }

            private void a() {
                this.A = true;
                this.B = false;
                this.C = true;
                this.D = false;
                this.E = true;
                this.F = false;
                this.G = false;
                this.H = false;
                this.I = false;
                this.J = true;
                this.K = true;
                this.L = false;
                this.M = true;
            }

            private void a(Bundle bundle) {
                int n10;
                Object object;
                int[] nArray = bundle.getIntArray(Integer.toString(1010, 36));
                List list = bundle.getParcelableArrayList(Integer.toString(1011, 36));
                list = list == null ? xj0.h() : wl.a(c62.f, (ArrayList)list);
                Object object2 = bundle.getSparseParcelableArray(Integer.toString(1012, 36));
                int n13 = 0;
                if (object2 == null) {
                    bundle = new SparseArray();
                } else {
                    object = com.yandex.mobile.ads.impl.k00$d.e;
                    bundle = new SparseArray(object2.size());
                    for (n10 = 0; n10 < object2.size(); ++n10) {
                        bundle.put(object2.keyAt(n10), (Object)object.fromBundle((Bundle)object2.valueAt(n10)));
                    }
                }
                if (nArray != null) {
                    if (nArray.length == list.size()) {
                        for (n10 = n13; n10 < nArray.length; ++n10) {
                            n13 = nArray[n10];
                            c62 c622 = (c62)list.get(n10);
                            d d14 = (d)bundle.get(n10);
                            object2 = object = (Map)this.N.get(n13);
                            if (object == null) {
                                object2 = new HashMap();
                                this.N.put(n13, object2);
                            }
                            if (object2.containsKey(c622) && m92.a(object2.get(c622), (Object)d14)) continue;
                            object2.put(c622, d14);
                        }
                    }
                }
            }

            public final k62.a a(int n10, int n13) {
                super.a(n10, n13);
                return this;
            }

            public final void a(Context context) {
                super.a(context);
            }

            public final void a(boolean bl2) {
                this.H = bl2;
            }

            public final void b(Context context) {
                context = m92.c((Context)context);
                super.a(context.x, context.y);
            }

            public final void b(boolean bl2) {
                this.I = bl2;
            }

            public final void c(boolean bl2) {
                this.F = bl2;
            }

            public final void d(boolean bl2) {
                this.G = bl2;
            }

            public final void e(boolean bl2) {
                this.M = bl2;
            }

            public final void f(boolean bl2) {
                this.D = bl2;
            }

            public final void g(boolean bl2) {
                this.B = bl2;
            }

            public final void h(boolean bl2) {
                this.C = bl2;
            }

            public final void i(boolean bl2) {
                this.J = bl2;
            }

            public final void j(boolean bl2) {
                this.E = bl2;
            }

            public final void k(boolean bl2) {
                this.K = bl2;
            }

            public final void l(boolean bl2) {
                this.A = bl2;
            }

            public final void m(boolean bl2) {
                this.L = bl2;
            }
        }
    }

    public static final class d
    implements vl {
        public static final vl.a<d> e = new gx2();
        public final int b;
        public final int[] c;
        public final int d;

        public d(int n10, int n13, int[] nArray) {
            this.b = n10;
            nArray = Arrays.copyOf(nArray, nArray.length);
            this.c = nArray;
            this.d = n13;
            Arrays.sort(nArray);
        }

        private static d a(Bundle bundle) {
            int n10 = bundle.getInt(Integer.toString(0, 36), -1);
            int[] nArray = bundle.getIntArray(Integer.toString(1, 36));
            int n13 = bundle.getInt(Integer.toString(2, 36), -1);
            if (n10 >= 0 && n13 >= 0) {
                nArray.getClass();
                return new d(n10, n13, nArray);
            }
            throw new IllegalArgumentException();
        }

        public static /* synthetic */ d b(Bundle bundle) {
            return com.yandex.mobile.ads.impl.k00$d.a(bundle);
        }

        public final boolean equals(@Nullable Object object) {
            boolean bl2 = true;
            if (this == object) {
                return true;
            }
            if (object != null && d.class == object.getClass()) {
                object = (d)object;
                if (this.b != ((d)object).b || !Arrays.equals(this.c, ((d)object).c) || this.d != ((d)object).d) {
                    bl2 = false;
                }
                return bl2;
            }
            return false;
        }

        public final int hashCode() {
            int n10 = this.b;
            return (Arrays.hashCode(this.c) + n10 * 31) * 31 + this.d;
        }
    }

    private static final class f
    extends g<f>
    implements Comparable<f> {
        private final int f;
        private final boolean g;
        private final boolean h;
        private final boolean i;
        private final int j;
        private final int k;
        private final int l;
        private final int m;
        private final boolean n;

        public f(int n10, b62 xj02, int n13, c c11, int n14, @Nullable String string2) {
            int n15;
            boolean bl2;
            int n16;
            block4: {
                super(n10, n13, (b62)((Object)xj02));
                n16 = 0;
                this.g = k00.a(false, n14);
                n10 = this.e.e & ~c11.v;
                bl2 = (n10 & 1) != 0;
                this.h = bl2;
                bl2 = (n10 & 2) != 0;
                this.i = bl2;
                xj02 = ((AbstractCollection)((Object)c11.t)).isEmpty() ? xj0.a("") : c11.t;
                for (n10 = 0; n10 < ((AbstractCollection)((Object)xj02)).size(); ++n10) {
                    n13 = k00.a(this.e, (String)xj02.get(n10), c11.w);
                    if (n13 <= 0) {
                        continue;
                    }
                    break block4;
                }
                n10 = Integer.MAX_VALUE;
                n13 = 0;
            }
            this.j = n10;
            this.k = n13;
            this.l = n10 = k00.a(this.e.f, c11.u);
            bl2 = (this.e.f & 0x440) != 0;
            this.n = bl2;
            bl2 = k00.b(string2) == null;
            this.m = n15 = k00.a(this.e, string2, bl2);
            n13 = !(n13 > 0 || ((AbstractCollection)((Object)c11.t)).isEmpty() && n10 > 0 || this.h || this.i && n15 > 0) ? 0 : 1;
            n10 = n16;
            if (k00.a(c11.M, n14)) {
                n10 = n16;
                if (n13 != 0) {
                    n10 = 1;
                }
            }
            this.f = n10;
        }

        public static int a(List<f> list, List<f> list2) {
            return list.get(0).a(list2.get(0));
        }

        public final int a() {
            return this.f;
        }

        public final int a(f f11) {
            mq mq3 = mq.b().a(this.g, f11.g).a((Object)this.j, (Object)f11.j, (Comparator)jf1.a().b()).a(this.k, f11.k).a(this.l, f11.l).a(this.h, f11.h);
            boolean bl2 = this.i;
            boolean bl3 = f11.i;
            jf1 jf12 = this.k == 0 ? jf1.a() : jf1.a().b();
            mq3 = mq3.a((Object)bl2, (Object)bl3, (Comparator)jf12).a(this.m, f11.m);
            jf12 = mq3;
            if (this.l == 0) {
                jf12 = mq3.b(this.n, f11.n);
            }
            return jf12.a();
        }
    }

    private static final class h
    extends g<h> {
        private final boolean f;
        private final c g;
        private final boolean h;
        private final boolean i;
        private final int j;
        private final int k;
        private final int l;
        private final int m;
        private final boolean n;
        private final boolean o;
        private final int p;
        private final boolean q;
        private final boolean r;
        private final int s;

        /*
         * Unable to fully structure code
         */
        public h(int var1_1, b62 var2_2, int var3_3, c var4_4, int var5_5, int var6_6, boolean var7_7) {
            block6: {
                super(var1_1, var3_3, (b62)var2_2);
                this.g = var4_4;
                var3_3 = var4_4.E != false ? 24 : 16;
                var9_8 = var4_4.D;
                var10_9 = true;
                var9_8 = var9_8 != false && (var6_6 & var3_3) != 0;
                this.o = var9_8;
                if (!var7_7) ** GOTO lbl-1000
                var2_2 = this.e;
                var1_1 = var2_2.r;
                if (!(var1_1 != -1 && var1_1 > var4_4.b || (var1_1 = var2_2.s) != -1 && var1_1 > var4_4.c || (var8_10 = var2_2.t) != -1.0f && !(var8_10 <= (float)var4_4.d) || (var1_1 = var2_2.i) != -1 && var1_1 > var4_4.e)) {
                    var9_8 = true;
                } else // 2 sources

                {
                    var9_8 = false;
                }
                this.f = var9_8;
                if (!var7_7) ** GOTO lbl-1000
                var2_2 = this.e;
                var1_1 = var2_2.r;
                if (!(var1_1 != -1 && var1_1 < var4_4.f || (var1_1 = var2_2.s) != -1 && var1_1 < var4_4.g || (var8_10 = var2_2.t) != -1.0f && !(var8_10 >= (float)var4_4.h) || (var1_1 = var2_2.i) != -1 && var1_1 < var4_4.i)) {
                    var7_7 = true;
                } else // 2 sources

                {
                    var7_7 = false;
                }
                this.h = var7_7;
                this.i = k00.a(false, var5_5);
                var2_2 = this.e;
                this.j = var2_2.i;
                this.k = var2_2.b();
                this.m = k00.n(this.e.f, var4_4.n);
                var1_1 = this.e.f;
                var7_7 = var1_1 == 0 || (var1_1 & 1) != 0;
                this.n = var7_7;
                for (var1_1 = 0; var1_1 < var4_4.m.size(); ++var1_1) {
                    var2_2 = this.e.m;
                    if (var2_2 == null || !var2_2.equals(var4_4.m.get(var1_1))) {
                        continue;
                    }
                    break block6;
                }
                var1_1 = 0x7FFFFFFF;
            }
            this.l = var1_1;
            var7_7 = fs2.a((int)var5_5) == 128;
            this.q = var7_7;
            var7_7 = fs2.c((int)var5_5) == 64 ? var10_9 : false;
            this.r = var7_7;
            this.s = k00.o(this.e.m);
            this.p = this.a(var5_5, var3_3);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        private int a(int n10, int n13) {
            if ((this.e.f & 0x4000) != 0) {
                return 0;
            }
            if (!k00.a(this.g.M, n10)) {
                return 0;
            }
            if (!this.f && !this.g.C) {
                return 0;
            }
            if (!k00.a(false, n10)) return 1;
            if (!this.h) return 1;
            if (!this.f) return 1;
            if (this.e.i == -1) return 1;
            c c11 = this.g;
            if (c11.y) return 1;
            if (c11.x) return 1;
            if ((n10 & n13) == 0) return 1;
            return 2;
        }

        private static int a(h h13, h h14) {
            mq mq3;
            mq mq4 = mq3 = mq.b().a(h13.i, h14.i).a(h13.m, h14.m).a(h13.n, h14.n).a(h13.f, h14.f).a(h13.h, h14.h).a((Object)h13.l, (Object)h14.l, (Comparator)jf1.a().b()).a(h13.q, h14.q).a(h13.r, h14.r);
            if (h13.q) {
                mq4 = mq3;
                if (h13.r) {
                    mq4 = mq3.a(h13.s, h14.s);
                }
            }
            return mq4.a();
        }

        public static int a(List<h> list, List<h> list2) {
            return mq.b().a((Object)Collections.max(list, new hx2()), (Object)Collections.max(list2, new hx2()), (Comparator)new hx2()).a(list.size(), list2.size()).a((Object)Collections.max(list, new ix2()), (Object)Collections.max(list2, new ix2()), (Comparator)new ix2()).a();
        }

        private static int b(h h13, h h14) {
            jf1 jf12 = h13.f && h13.i ? i : i.b();
            mq mq3 = mq.b();
            int n10 = h13.j;
            int n13 = h14.j;
            jf1 jf13 = h13.g.x ? i.b() : j;
            return mq3.a((Object)n10, (Object)n13, (Comparator)jf13).a((Object)h13.k, (Object)h14.k, (Comparator)jf12).a((Object)h13.j, (Object)h14.j, (Comparator)jf12).a();
        }

        public static /* synthetic */ int c(h h13, h h14) {
            return com.yandex.mobile.ads.impl.k00$h.b(h13, h14);
        }

        public static /* synthetic */ int d(h h13, h h14) {
            return com.yandex.mobile.ads.impl.k00$h.a(h13, h14);
        }

        public final int a() {
            return this.p;
        }

        public final boolean a(g g11) {
            g11 = (h)g11;
            boolean bl2 = (this.o || m92.a((Object)this.e.m, (Object)g11.e.m)) && (this.g.F || this.q == g11.q && this.r == g11.r);
            return bl2;
        }
    }
}

