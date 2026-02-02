/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  android.util.SparseArray
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.a62
 *  com.yandex.mobile.ads.impl.be0
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.dn1
 *  com.yandex.mobile.ads.impl.ex1
 *  com.yandex.mobile.ads.impl.f00
 *  com.yandex.mobile.ads.impl.fg1
 *  com.yandex.mobile.ads.impl.g41
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.g62$a
 *  com.yandex.mobile.ads.impl.h62
 *  com.yandex.mobile.ads.impl.ic0$a
 *  com.yandex.mobile.ads.impl.ic0$b
 *  com.yandex.mobile.ads.impl.iv
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.on
 *  com.yandex.mobile.ads.impl.qj1
 *  com.yandex.mobile.ads.impl.s
 *  com.yandex.mobile.ads.impl.sr0
 *  com.yandex.mobile.ads.impl.t70
 *  com.yandex.mobile.ads.impl.u50
 *  com.yandex.mobile.ads.impl.v02
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.y30
 *  com.yandex.mobile.ads.impl.y30$b
 *  com.yandex.mobile.ads.impl.y52
 *  com.yandex.mobile.ads.impl.yd0
 *  com.yandex.mobile.ads.impl.z52
 *  com.yandex.mobile.ads.impl.zg
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.a62;
import com.yandex.mobile.ads.impl.be0;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.dn1;
import com.yandex.mobile.ads.impl.ex1;
import com.yandex.mobile.ads.impl.f00;
import com.yandex.mobile.ads.impl.fg1;
import com.yandex.mobile.ads.impl.g41;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.h62;
import com.yandex.mobile.ads.impl.ic0;
import com.yandex.mobile.ads.impl.iv;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.on;
import com.yandex.mobile.ads.impl.oz;
import com.yandex.mobile.ads.impl.qj1;
import com.yandex.mobile.ads.impl.s;
import com.yandex.mobile.ads.impl.s50;
import com.yandex.mobile.ads.impl.sr0;
import com.yandex.mobile.ads.impl.sv2;
import com.yandex.mobile.ads.impl.t70;
import com.yandex.mobile.ads.impl.tv2;
import com.yandex.mobile.ads.impl.u50;
import com.yandex.mobile.ads.impl.u70;
import com.yandex.mobile.ads.impl.v02;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.wn;
import com.yandex.mobile.ads.impl.y30;
import com.yandex.mobile.ads.impl.y52;
import com.yandex.mobile.ads.impl.yd0;
import com.yandex.mobile.ads.impl.yg;
import com.yandex.mobile.ads.impl.z52;
import com.yandex.mobile.ads.impl.zg;
import com.yandex.mobile.ads.impl.zs0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/*
 * Exception performing whole class analysis ignored.
 */
public final class ic0
implements t70 {
    private static final byte[] F;
    private static final cc0 G;
    private boolean A;
    private v70 B;
    private g62[] C;
    private g62[] D;
    private boolean E;
    private final List<cc0> a;
    private final SparseArray<b> b;
    private final bg1 c;
    private final bg1 d;
    private final bg1 e;
    private final byte[] f;
    private final bg1 g;
    private final u50 h;
    private final bg1 i;
    private final ArrayDeque<yg.a> j;
    private final ArrayDeque<a> k;
    @Nullable
    private final g62 l;
    private int m;
    private int n;
    private long o;
    private int p;
    @Nullable
    private bg1 q;
    private long r;
    private int s;
    private long t;
    private long u;
    private long v;
    @Nullable
    private b w;
    private int x;
    private int y;
    private int z;

    static {
        new tv2();
        F = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        G = new /* Unavailable Anonymous Inner Class!! */.e("application/x-emsg").a();
    }

    public ic0(int n10) {
        this(Collections.emptyList());
    }

    public ic0(List list) {
        this(list, 0);
    }

    public ic0(List object, int n10) {
        this.a = Collections.unmodifiableList(object);
        this.l = null;
        this.h = new u50();
        this.i = new bg1(16);
        this.c = new bg1(g41.a);
        this.d = new bg1(5);
        this.e = new bg1();
        object = new byte[16];
        this.f = (byte[])object;
        this.g = new bg1((byte[])object);
        this.j = new ArrayDeque();
        this.k = new ArrayDeque();
        this.b = new SparseArray();
        this.u = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.B = v70.a;
        this.C = new g62[0];
        this.D = new g62[0];
    }

    @Nullable
    private static y30 a(ArrayList arrayList) {
        int n10 = arrayList.size();
        Object var5_2 = null;
        Object object = null;
        for (int i14 = 0; i14 < n10; ++i14) {
            Object object2 = (yg.b)((Object)arrayList.get(i14));
            ArrayList<y30.b> arrayList2 = object;
            if (object2.a == 1886614376) {
                arrayList2 = object;
                if (object == null) {
                    arrayList2 = new ArrayList<y30.b>();
                }
                if ((object2 = dn1.c((byte[])(object = (Object)object2.b.c()))) == null) {
                    zs0.d((String)"FragmentedMp4Extractor", (String)"Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new y30.b((UUID)object2, null, "video/mp4", (byte[])object));
                }
            }
            object = arrayList2;
        }
        arrayList = object == null ? var5_2 : new y30(object);
        return arrayList;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void a(long l10) throws fg1 {
        Object object = this;
        while (true) {
            ic0 ic02;
            int n10;
            long l11;
            int n13;
            Object object2;
            int n14;
            block56: {
                y30 y302;
                yg.b b10;
                yg.a a13;
                if (!((ic0)object).j.isEmpty() && ((ic0)object).j.peek().b == l10) {
                    a13 = ((ic0)object).j.pop();
                    n14 = a13.a;
                    if (n14 == 1836019574) {
                        ((ic0)object).a(a13);
                        continue;
                    }
                    if (n14 != 0x6D6F6F66) {
                        ic0 ic03 = object;
                        object = ic03;
                        if (ic03.j.isEmpty()) continue;
                        ic03.j.peek().d.add(a13);
                        object = ic03;
                        continue;
                    }
                } else {
                    ((ic0)object).m = 0;
                    ((ic0)object).p = 0;
                    return;
                }
                object2 = ((ic0)object).b;
                byte[] byArray = ((ic0)object).f;
                n14 = a13.d.size();
                n13 = 0;
                object = a13;
                while (true) {
                    void var30_39;
                    block62: {
                        void var35_68;
                        void var36_87;
                        yg.b b11;
                        yg.b b14;
                        z52 z522;
                        long l13;
                        boolean bl2;
                        int n15;
                        int n16;
                        Object object3;
                        yg.a a14;
                        block57: {
                            block58: {
                                bg1 bg12;
                                int n17;
                                int n18;
                                int n19;
                                void var30_27;
                                void var35_58;
                                int n23;
                                block63: {
                                    block59: {
                                        block61: {
                                            block60: {
                                                if (n13 >= n14) break block59;
                                                a14 = (yg.a)((Object)((yg.a)((Object)object)).d.get(n13));
                                                if (a14.a != 1953653094) break block60;
                                                b10 = a14.c(1952868452);
                                                ((Object)((Object)b10)).getClass();
                                                b10 = b10.b;
                                                b10.e(8);
                                                n23 = b10.h();
                                                b b15 = object2.get(b10.h());
                                                if (b15 == null) {
                                                    Object var35_57 = null;
                                                } else {
                                                    if ((n23 & 1) != 0) {
                                                        l11 = b10.y();
                                                        object3 = b15.b;
                                                        ((a62)object3).b = l11;
                                                        ((a62)object3).c = l11;
                                                    }
                                                    object3 = b15.e;
                                                    n10 = (n23 & 2) != 0 ? b10.h() - 1 : ((f00)object3).a;
                                                    n16 = (n23 & 8) != 0 ? b10.h() : ((f00)object3).b;
                                                    n15 = (n23 & 0x10) != 0 ? b10.h() : ((f00)object3).c;
                                                    n23 = (n23 & 0x20) != 0 ? b10.h() : ((f00)object3).d;
                                                    b15.b.a = new f00(n10, n16, n15, n23);
                                                }
                                                if (var35_58 != null) break block61;
                                            }
                                            b b16 = object2;
                                            object2 = var30_27;
                                            b b17 = b16;
                                            break block62;
                                        }
                                        b10 = var35_58.b;
                                        l11 = ((a62)b10).p;
                                        bl2 = ((a62)b10).q;
                                        var35_58.b();
                                        com.yandex.mobile.ads.impl.ic0$b.b(var35_58, (boolean)true);
                                        object3 = a14.c(0x74666474);
                                        if (object3 != null) {
                                            object3 = ((yg.b)((Object)object3)).b;
                                            object3.e(8);
                                            l11 = (object3.h() >> 24 & 0xFF) == 1 ? object3.y() : object3.v();
                                            ((a62)b10).p = l11;
                                            ((a62)b10).q = true;
                                        } else {
                                            ((a62)b10).p = l11;
                                            ((a62)b10).q = bl2;
                                        }
                                        object3 = a14.c;
                                        n19 = ((ArrayList)object3).size();
                                        n23 = 0;
                                        n10 = 0;
                                        for (n15 = 0; n15 < n19; ++n15) {
                                            yg.b b18 = (yg.b)((Object)((ArrayList)object3).get(n15));
                                            n18 = n23;
                                            n16 = n10;
                                            if (b18.a == 1953658222) {
                                                bg1 bg13 = b18.b;
                                                bg13.e(12);
                                                n17 = bg13.x();
                                                n18 = n23;
                                                n16 = n10;
                                                if (n17 > 0) {
                                                    n18 = n23 + n17;
                                                    n16 = n10 + 1;
                                                }
                                            }
                                            n23 = n18;
                                            n10 = n16;
                                        }
                                        var35_58.h = 0;
                                        var35_58.g = 0;
                                        var35_58.f = 0;
                                        a62 a622 = var35_58.b;
                                        a622.d = n10;
                                        a622.e = n23;
                                        if (a622.g.length < n10) {
                                            a622.f = new long[n10];
                                            a622.g = new int[n10];
                                        }
                                        if (a622.h.length >= n23) break block63;
                                        n10 = n23 * 125 / 100;
                                        a622.h = new int[n10];
                                        a622.i = new long[n10];
                                        a622.j = new boolean[n10];
                                        a622.l = new boolean[n10];
                                        break block63;
                                    }
                                    y302 = ic0.a(((yg.a)((Object)object)).c);
                                    ic02 = this;
                                    if (y302 != null) {
                                        n13 = ic02.b.size();
                                        break;
                                    }
                                    break block56;
                                }
                                n17 = 0;
                                int n24 = 0;
                                n16 = 0;
                                while (true) {
                                    block65: {
                                        int n25;
                                        long l14;
                                        int n26;
                                        boolean bl3;
                                        f00 f002;
                                        a62 a623;
                                        int n27;
                                        bg1 bg14;
                                        block66: {
                                            block64: {
                                                if (n17 >= n19) break block64;
                                                yg.b b19 = (yg.b)((Object)((ArrayList)object3).get(n17));
                                                if (b19.a != 1953658222) break block65;
                                                bg14 = b19.b;
                                                bg14.e(8);
                                                n27 = bg14.h();
                                                y52 y522 = var35_58.d.a;
                                                a623 = var35_58.b;
                                                f002 = a623.a;
                                                n10 = m92.a;
                                                a623.g[n24] = bg14.x();
                                                long[] lArray = a623.f;
                                                lArray[n24] = l11 = a623.b;
                                                if ((n27 & 1) != 0) {
                                                    lArray[n24] = l11 + (long)bg14.h();
                                                }
                                                n15 = (n27 & 4) != 0 ? 1 : 0;
                                                n10 = f002.d;
                                                if (n15 != 0) {
                                                    n10 = bg14.h();
                                                }
                                                n23 = (n27 & 0x100) != 0 ? 1 : 0;
                                                n18 = (n27 & 0x200) != 0 ? 1 : 0;
                                                bl3 = (n27 & 0x400) != 0;
                                                n27 = (n27 & 0x800) != 0 ? 1 : 0;
                                                long[] lArray2 = y522.h;
                                                l11 = lArray2 != null && lArray2.length == 1 && lArray2[0] == 0L ? y522.i[0] : 0L;
                                                int[] nArray = a623.h;
                                                long[] lArray3 = a623.i;
                                                boolean[] blArray = a623.j;
                                                n26 = a623.g[n24] + n16;
                                                l13 = y522.c;
                                                l14 = a623.p;
                                                n25 = n16;
                                                n16 = n26;
                                                n26 = n23;
                                                n23 = n15;
                                                break block66;
                                            }
                                            object3 = object;
                                            object = var30_27;
                                            n10 = n14;
                                            y52 y523 = var35_58.d.a;
                                            f00 f003 = ((a62)b10).a;
                                            f003.getClass();
                                            z522 = y523.a(f003.a);
                                            yg.b b22 = a14.c(1935763834);
                                            if (b22 == null) break block57;
                                            z522.getClass();
                                            bg12 = b22.b;
                                            n23 = z522.d;
                                            bg12.e(8);
                                            if ((bg12.h() & 1) == 1) {
                                                bg12.f(8);
                                            }
                                            n14 = bg12.t();
                                            n15 = bg12.x();
                                            if (n15 > ((a62)b10).e) {
                                                object = new StringBuilder("Saiz sample count ");
                                                ((StringBuilder)object).append(n15);
                                                ((StringBuilder)object).append(" is greater than fragment sample count");
                                                ((StringBuilder)object).append(((a62)b10).e);
                                                throw fg1.a((String)((StringBuilder)object).toString(), null);
                                            }
                                            if (n14 == 0) {
                                                boolean[] blArray = ((a62)b10).l;
                                                n14 = 0;
                                                break;
                                            }
                                            bl2 = n14 > n23;
                                            n14 *= n15;
                                            Arrays.fill(((a62)b10).l, 0, n15, bl2);
                                            break block58;
                                        }
                                        while (n25 < n16) {
                                            long l15;
                                            int n28 = n26 != 0 ? bg14.h() : f002.b;
                                            if (n28 < 0) {
                                                object = new StringBuilder("Unexpected negative value: ");
                                                ((StringBuilder)object).append(n28);
                                                throw fg1.a((String)((StringBuilder)object).toString(), null);
                                            }
                                            int n29 = n18 != 0 ? bg14.h() : f002.c;
                                            if (n29 < 0) {
                                                object = new StringBuilder("Unexpected negative value: ");
                                                ((StringBuilder)object).append(n29);
                                                throw fg1.a((String)((StringBuilder)object).toString(), null);
                                            }
                                            n15 = bl3 ? bg14.h() : (n25 == 0 && n23 != 0 ? n10 : f002.d);
                                            int n31 = n27 != 0 ? bg14.h() : 0;
                                            lArray3[n25] = l15 = m92.a((long)((long)n31 + l14 - l11), (long)1000000L, (long)l13);
                                            if (!a623.q) {
                                                lArray3[n25] = l15 + var35_58.d.h;
                                            }
                                            nArray[n25] = n29;
                                            bl2 = (n15 >> 16 & 1) == 0;
                                            blArray[n25] = bl2;
                                            l14 += (long)n28;
                                            ++n25;
                                        }
                                        a623.p = l14;
                                        ++n24;
                                    }
                                    ++n17;
                                }
                                for (n16 = 0; n16 < n15; n14 += n18, ++n16) {
                                    n18 = bg12.t();
                                    bl2 = n18 > n23;
                                    blArray[n16] = bl2;
                                }
                            }
                            Arrays.fill(((a62)b10).l, n15, ((a62)b10).e, false);
                            if (n14 > 0) {
                                ((a62)b10).n.c(n14);
                                ((a62)b10).k = true;
                                ((a62)b10).o = true;
                            }
                        }
                        if ((b14 = a14.c(1935763823)) != null) {
                            bg1 bg15 = b14.b;
                            bg15.e(8);
                            n14 = bg15.h();
                            if ((n14 & 1) == 1) {
                                bg15.f(8);
                            }
                            if ((n16 = bg15.x()) != 1) {
                                object = new StringBuilder("Unexpected saio entry count: ");
                                ((StringBuilder)object).append(n16);
                                throw fg1.a((String)((StringBuilder)object).toString(), null);
                            }
                            l13 = ((a62)b10).c;
                            l11 = (n14 >> 24 & 0xFF) == 0 ? bg15.v() : bg15.y();
                            ((a62)b10).c = l13 + l11;
                        }
                        if ((b11 = a14.c(1936027235)) != null) {
                            ic0.a(b11.b, 0, (a62)b10);
                        }
                        if (z522 != null) {
                            String string2 = z522.b;
                        } else {
                            Object var30_32 = null;
                        }
                        Object var36_86 = null;
                        Object var35_67 = null;
                        for (n14 = 0; n14 < a14.c.size(); ++n14) {
                            void var38_102;
                            void var39_112;
                            yg.b b24 = (yg.b)((Object)a14.c.get(n14));
                            bg1 bg16 = b24.b;
                            n16 = b24.a;
                            if (n16 == 1935828848) {
                                bg16.e(12);
                                void var39_107 = var36_87;
                                void var38_97 = var35_68;
                                if (bg16.h() == 1936025959) {
                                    bg1 bg17 = bg16;
                                    void var38_98 = var35_68;
                                }
                            } else {
                                void var39_109 = var36_87;
                                void var38_99 = var35_68;
                                if (n16 == 1936158820) {
                                    bg16.e(12);
                                    void var39_110 = var36_87;
                                    void var38_100 = var35_68;
                                    if (bg16.h() == 1936025959) {
                                        bg1 bg18 = bg16;
                                        void var39_111 = var36_87;
                                    }
                                }
                            }
                            void var36_88 = var39_112;
                            void var35_69 = var38_102;
                        }
                        if (var36_87 != null && var35_68 != null) {
                            var36_87.e(8);
                            n14 = var36_87.h();
                            var36_87.f(4);
                            if ((n14 >> 24 & 0xFF) == 1) {
                                var36_87.f(4);
                            }
                            if (var36_87.h() != 1) {
                                throw fg1.a((String)"Entry count in sbgp != 1 (unsupported).");
                            }
                            var35_68.e(8);
                            n14 = var35_68.h() >> 24 & 0xFF;
                            var35_68.f(4);
                            if (n14 == 1) {
                                if (var35_68.v() == 0L) {
                                    throw fg1.a((String)"Variable length description in sgpd found (unsupported)");
                                }
                            } else if (n14 >= 2) {
                                var35_68.f(4);
                            }
                            if (var35_68.v() != 1L) {
                                throw fg1.a((String)"Entry count in sgpd != 1 (unsupported).");
                            }
                            var35_68.f(1);
                            n14 = var35_68.t();
                            bl2 = var35_68.t() == 1;
                            if (bl2) {
                                void var35_71;
                                void var30_33;
                                n16 = var35_68.t();
                                byte[] byArray2 = new byte[16];
                                var35_68.a(byArray2, 0, 16);
                                if (n16 == 0) {
                                    n15 = var35_68.t();
                                    byte[] byArray3 = new byte[n15];
                                    var35_68.a(byArray3, 0, n15);
                                    byte[] byArray4 = byArray3;
                                } else {
                                    Object var35_72 = null;
                                }
                                ((a62)b10).k = true;
                                ((a62)b10).m = new z52(bl2, (String)var30_33, n16, byArray2, (n14 & 0xF0) >> 4, n14 & 0xF, (byte[])var35_71);
                            }
                        }
                        n16 = a14.c.size();
                        for (n14 = 0; n14 < n16; ++n14) {
                            yg.b b25 = (yg.b)((Object)a14.c.get(n14));
                            if (b25.a != 1970628964) continue;
                            bg1 bg19 = b25.b;
                            bg19.e(8);
                            bg19.a((byte[])object, 0, 16);
                            if (!Arrays.equals((byte[])object, F)) continue;
                            ic0.a(bg19, 16, (a62)b10);
                        }
                        Object object4 = object;
                        object = object3;
                        n14 = n10;
                        b b26 = object2;
                        object2 = object4;
                    }
                    b b27 = object2;
                    ++n13;
                    object2 = var30_39;
                    b b28 = b27;
                }
                for (n14 = 0; n14 < n13; ++n14) {
                    object2 = ic02.b.valueAt(n14);
                    b10 = object2.d.a;
                    object = object2.b.a;
                    n10 = m92.a;
                    object = b10.a(((f00)object).a);
                    object = object != null ? ((z52)object).b : null;
                    object = y302.a((String)object);
                    object = object2.d.a.f.a().a((y30)object).a();
                    object2.a.a((cc0)object);
                }
            }
            object = ic02;
            if (ic02.t == -9223372036854775807L) continue;
            n10 = ic02.b.size();
            block9: for (n14 = 0; n14 < n10; ++n14) {
                object = ic02.b.valueAt(n14);
                l11 = ic02.t;
                n13 = object.f;
                while (true) {
                    object2 = object.b;
                    if (n13 >= object2.e || object2.i[n13] >= l11) continue block9;
                    if (object2.j[n13]) {
                        object.i = n13;
                    }
                    ++n13;
                }
            }
            ic02.t = -9223372036854775807L;
            object = ic02;
        }
    }

    private static void a(bg1 object, int n10, a62 a622) throws fg1 {
        object.e(n10 + 8);
        n10 = object.h();
        if ((n10 & 1) == 0) {
            boolean bl2 = (n10 & 2) != 0;
            n10 = object.x();
            if (n10 == 0) {
                Arrays.fill(a622.l, 0, a622.e, false);
                return;
            }
            if (n10 == a622.e) {
                Arrays.fill(a622.l, 0, n10, bl2);
                n10 = object.a();
                a622.n.c(n10);
                a622.k = true;
                a622.o = true;
                object.a(a622.n.c(), 0, a622.n.e());
                a622.n.e(0);
                a622.o = false;
                return;
            }
            object = new StringBuilder("Senc sample count ");
            ((StringBuilder)object).append(n10);
            ((StringBuilder)object).append(" is different from fragment sample count");
            ((StringBuilder)object).append(a622.e);
            throw fg1.a((String)((StringBuilder)object).toString(), null);
        }
        throw fg1.a((String)"Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private void a(yg.a a13) throws fg1 {
        block11: {
            block10: {
                int n10;
                yg.b b10;
                int n13;
                int n14;
                SparseArray sparseArray;
                Object object;
                y30 y302;
                block9: {
                    y302 = ic0.a(a13.c);
                    object = a13.b(1836475768);
                    object.getClass();
                    sparseArray = new SparseArray();
                    n14 = ((yg.a)((Object)object)).c.size();
                    long l10 = -9223372036854775807L;
                    for (n13 = 0; n13 < n14; ++n13) {
                        b10 = (yg.b)((Object)((yg.a)((Object)object)).c.get(n13));
                        n10 = b10.a;
                        if (n10 == 1953654136) {
                            b10 = b10.b;
                            b10.e(12);
                            b10 = Pair.create((Object)b10.h(), (Object)new f00(b10.h() - 1, b10.h(), b10.h(), b10.h()));
                            sparseArray.put(((Integer)((Pair)b10).first).intValue(), (Object)((f00)((Pair)b10).second));
                            continue;
                        }
                        if (n10 != 1835362404) continue;
                        b10 = b10.b;
                        b10.e(8);
                        l10 = (b10.h() >> 24 & 0xFF) == 0 ? b10.v() : b10.y();
                    }
                    object = zg.a((yg.a)a13, (be0)new be0(), (long)l10, (y30)y302, (boolean)false, (boolean)false, (yd0)new sv2(this));
                    n14 = ((ArrayList)object).size();
                    if (this.b.size() != 0) break block9;
                    for (n13 = 0; n13 < n14; ++n13) {
                        b10 = (h62)((ArrayList)object).get(n13);
                        y302 = ((h62)b10).a;
                        g62 g622 = this.B.a(n13, y302.b);
                        n10 = y302.a;
                        if (sparseArray.size() == 1) {
                            a13 = (f00)sparseArray.valueAt(0);
                        } else {
                            a13 = (f00)sparseArray.get(n10);
                            ((Object)((Object)a13)).getClass();
                        }
                        a13 = new /* Unavailable Anonymous Inner Class!! */;
                        this.b.put(y302.a, (Object)a13);
                        this.u = Math.max(this.u, y302.e);
                    }
                    this.B.a();
                    break block10;
                }
                if (this.b.size() == n14) {
                    for (n13 = 0; n13 < n14; ++n13) {
                        b10 = (h62)((ArrayList)object).get(n13);
                        a13 = ((h62)b10).a;
                        y302 = this.b.get(((y52)a13).a);
                        n10 = ((y52)a13).a;
                        if (sparseArray.size() == 1) {
                            a13 = (f00)sparseArray.valueAt(0);
                        } else {
                            a13 = (f00)sparseArray.get(n10);
                            ((Object)((Object)a13)).getClass();
                        }
                        y302.a((h62)b10, (f00)a13);
                    }
                }
                break block11;
            }
            return;
        }
        throw new IllegalStateException();
    }

    private static t70[] a() {
        return new t70[]{new ic0(0)};
    }

    public static /* synthetic */ t70[] b() {
        return ic0.a();
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public final int a(u70 var1_1, qj1 var2_2) throws IOException {
        while (true) {
            block68: {
                block87: {
                    block85: {
                        block91: {
                            block89: {
                                block90: {
                                    block88: {
                                        block86: {
                                            block69: {
                                                block70: {
                                                    block78: {
                                                        block84: {
                                                            block83: {
                                                                block82: {
                                                                    block79: {
                                                                        block74: {
                                                                            block75: {
                                                                                block77: {
                                                                                    block76: {
                                                                                        block71: {
                                                                                            var3_3 = this.m;
                                                                                            var21_14 /* !! */  = null;
                                                                                            if (var3_3 == 0) break block68;
                                                                                            if (var3_3 == 1) break block69;
                                                                                            var8_7 = 0x7FFFFFFFFFFFFFFFL;
                                                                                            if (var3_3 == 2) break block70;
                                                                                            var20_13 /* !! */  = this.w;
                                                                                            var2_2 /* !! */  = var20_13 /* !! */ ;
                                                                                            if (var20_13 /* !! */  != null) break block71;
                                                                                            var23_16 /* !! */  = this.b;
                                                                                            var4_4 = var23_16 /* !! */ .size();
                                                                                            var10_8 = 0x7FFFFFFFFFFFFFFFL;
                                                                                            var2_2 /* !! */  = null;
                                                                                            for (var3_3 = 0; var3_3 < var4_4; ++var3_3) {
                                                                                                block73: {
                                                                                                    block72: {
                                                                                                        var22_15 /* !! */  = var23_16 /* !! */ .valueAt(var3_3);
                                                                                                        var7_6 = com.yandex.mobile.ads.impl.ic0$b.a(var22_15 /* !! */ );
                                                                                                        if (var7_6) break block72;
                                                                                                        var20_13 /* !! */  = var2_2 /* !! */ ;
                                                                                                        var12_9 = var10_8;
                                                                                                        if (var22_15 /* !! */ .f == var22_15 /* !! */ .d.b) break block73;
                                                                                                    }
                                                                                                    if (var7_6 && var22_15 /* !! */ .h == var22_15 /* !! */ .b.d) {
                                                                                                        var20_13 /* !! */  = var2_2 /* !! */ ;
                                                                                                        var12_9 = var10_8;
                                                                                                    } else {
                                                                                                        var8_7 = var7_6 == false ? var22_15 /* !! */ .d.c[var22_15 /* !! */ .f] : var22_15 /* !! */ .b.f[var22_15 /* !! */ .h];
                                                                                                        var20_13 /* !! */  = var2_2 /* !! */ ;
                                                                                                        var12_9 = var10_8;
                                                                                                        if (var8_7 < var10_8) {
                                                                                                            var20_13 /* !! */  = var22_15 /* !! */ ;
                                                                                                            var12_9 = var8_7;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                var2_2 /* !! */  = var20_13 /* !! */ ;
                                                                                                var10_8 = var12_9;
                                                                                            }
                                                                                            if (var2_2 /* !! */  == null) {
                                                                                                var8_7 = this.r;
                                                                                                var2_2 /* !! */  = (oz)var1_1 /* !! */ ;
                                                                                                var3_3 = (int)(var8_7 - var2_2 /* !! */ .a());
                                                                                                if (var3_3 >= 0) {
                                                                                                    var2_2 /* !! */ .a(var3_3);
                                                                                                    this.m = 0;
                                                                                                    this.p = 0;
                                                                                                    continue;
                                                                                                }
                                                                                                throw fg1.a((String)"Offset to end of mdat was negative.", null);
                                                                                            }
                                                                                            var8_7 = com.yandex.mobile.ads.impl.ic0$b.a(var2_2 /* !! */ ) == false ? var2_2 /* !! */ .d.c[var2_2 /* !! */ .f] : var2_2 /* !! */ .b.f[var2_2 /* !! */ .h];
                                                                                            var20_13 /* !! */  = (oz)var1_1 /* !! */ ;
                                                                                            var3_3 = var4_4 = (int)(var8_7 - var20_13 /* !! */ .a());
                                                                                            if (var4_4 < 0) {
                                                                                                zs0.d((String)"FragmentedMp4Extractor", (String)"Ignoring negative offset to sample data.");
                                                                                                var3_3 = 0;
                                                                                            }
                                                                                            var20_13 /* !! */ .a(var3_3);
                                                                                            this.w = var2_2 /* !! */ ;
                                                                                        }
                                                                                        var3_3 = this.m;
                                                                                        var4_4 = 6;
                                                                                        if (var3_3 != 3) break block74;
                                                                                        var3_3 = com.yandex.mobile.ads.impl.ic0$b.a(var2_2 /* !! */ ) == false ? var2_2 /* !! */ .d.d[var2_2 /* !! */ .f] : var2_2 /* !! */ .b.h[var2_2 /* !! */ .f];
                                                                                        this.x = var3_3;
                                                                                        if (var2_2 /* !! */ .f >= var2_2 /* !! */ .i) break block75;
                                                                                        ((oz)var1_1 /* !! */ ).a(var3_3);
                                                                                        var20_13 /* !! */  = var2_2 /* !! */ .a();
                                                                                        if (var20_13 /* !! */  != null) {
                                                                                            var1_1 /* !! */  = var2_2 /* !! */ .b.n;
                                                                                            var3_3 = var20_13 /* !! */ .d;
                                                                                            if (var3_3 != 0) {
                                                                                                var1_1 /* !! */ .f(var3_3);
                                                                                            }
                                                                                            var20_13 /* !! */  = var2_2 /* !! */ .b;
                                                                                            var3_3 = var2_2 /* !! */ .f;
                                                                                            if (var20_13 /* !! */ .k && var20_13 /* !! */ .l[var3_3]) {
                                                                                                var1_1 /* !! */ .f(var1_1 /* !! */ .z() * 6);
                                                                                            }
                                                                                        }
                                                                                        ++var2_2 /* !! */ .f;
                                                                                        if (!com.yandex.mobile.ads.impl.ic0$b.a(var2_2 /* !! */ )) break block76;
                                                                                        var2_2 /* !! */ .g = var4_4 = var2_2 /* !! */ .g + 1;
                                                                                        var1_1 /* !! */  = (g62[])var2_2 /* !! */ .b.g;
                                                                                        var3_3 = var2_2 /* !! */ .h;
                                                                                        if (var4_4 != var1_1 /* !! */ [var3_3]) break block77;
                                                                                        var2_2 /* !! */ .h = var3_3 + 1;
                                                                                        var2_2 /* !! */ .g = 0;
                                                                                    }
                                                                                    this.w = null;
                                                                                }
                                                                                this.m = 3;
                                                                                break block78;
                                                                            }
                                                                            if (var2_2 /* !! */ .d.a.g == 1) {
                                                                                this.x = var3_3 - 8;
                                                                                ((oz)var1_1 /* !! */ ).a(8);
                                                                            }
                                                                            if ("audio/ac4".equals(var2_2 /* !! */ .d.a.f.m)) {
                                                                                this.y = var2_2 /* !! */ .a(this.x, 7);
                                                                                com.yandex.mobile.ads.impl.s.a((int)this.x, (bg1)this.g);
                                                                                var2_2 /* !! */ .a.a(7, this.g);
                                                                                this.y += 7;
                                                                            } else {
                                                                                this.y = var2_2 /* !! */ .a(this.x, 0);
                                                                            }
                                                                            this.x += this.y;
                                                                            this.m = 4;
                                                                            this.z = 0;
                                                                        }
                                                                        var20_13 /* !! */  = var2_2 /* !! */ .d;
                                                                        var23_16 /* !! */  = var20_13 /* !! */ .a;
                                                                        var22_15 /* !! */  = var2_2 /* !! */ .a;
                                                                        if (!com.yandex.mobile.ads.impl.ic0$b.a(var2_2 /* !! */ )) {
                                                                            var8_7 = var20_13 /* !! */ .f[var2_2 /* !! */ .f];
                                                                        } else {
                                                                            var20_13 /* !! */  = var2_2 /* !! */ .b;
                                                                            var3_3 = var2_2 /* !! */ .f;
                                                                            var8_7 = var20_13 /* !! */ .i[var3_3];
                                                                        }
                                                                        if (var23_16 /* !! */ .j == 0) break block79;
                                                                        var24_17 = this.d.c();
                                                                        var24_17[0] = 0;
                                                                        var24_17[1] = 0;
                                                                        var24_17[2] = 0;
                                                                        var6_18 = var23_16 /* !! */ .j;
                                                                        var5_5 = 4 - var6_18;
                                                                        var20_13 /* !! */  = var21_14 /* !! */ ;
                                                                        var3_3 = var4_4;
                                                                        while (this.y < this.x) {
                                                                            block80: {
                                                                                block81: {
                                                                                    var4_4 = this.z;
                                                                                    if (var4_4 != 0) break block80;
                                                                                    ((oz)var1_1 /* !! */ ).a(var24_17, var5_5, var6_18 + 1, false);
                                                                                    this.d.e(0);
                                                                                    var4_4 = this.d.h();
                                                                                    if (var4_4 < 1) break block81;
                                                                                    this.z = var4_4 - 1;
                                                                                    this.c.e(0);
                                                                                    var22_15 /* !! */ .a(4, this.c);
                                                                                    var22_15 /* !! */ .a(1, this.d);
                                                                                    if (this.D.length <= 0) ** GOTO lbl-1000
                                                                                    var25_19 = var23_16 /* !! */ .f.m;
                                                                                    var4_4 = var24_17[4];
                                                                                    var21_14 /* !! */  = (g62[])g41.a;
                                                                                    if ("video/avc".equals(var25_19) && (var4_4 & 31) == var3_3 || "video/hevc".equals(var25_19) && (var4_4 & 126) >> 1 == 39) {
                                                                                        var7_6 = true;
                                                                                    } else // 2 sources

                                                                                    {
                                                                                        var7_6 = false;
                                                                                    }
                                                                                    this.A = var7_6;
                                                                                    this.y += 5;
                                                                                    this.x += var5_5;
                                                                                    continue;
                                                                                }
                                                                                throw fg1.a((String)"Invalid NAL length", (Exception)var20_13 /* !! */ );
                                                                            }
                                                                            if (this.A) {
                                                                                this.e.c(var4_4);
                                                                                var20_13 /* !! */  = this.e.c();
                                                                                var3_3 = this.z;
                                                                                ((oz)var1_1 /* !! */ ).a((byte[])var20_13 /* !! */ , 0, var3_3, false);
                                                                                var20_13 /* !! */  = this.e;
                                                                                var22_15 /* !! */ .a(this.z, (bg1)var20_13 /* !! */ );
                                                                                var3_3 = this.z;
                                                                                var20_13 /* !! */  = this.e.c();
                                                                                var4_4 = g41.a((int)this.e.e(), (byte[])var20_13 /* !! */ );
                                                                                this.e.e((int)"video/hevc".equals(var23_16 /* !! */ .f.m));
                                                                                this.e.d(var4_4);
                                                                                on.a((long)var8_7, (bg1)this.e, (g62[])this.D);
                                                                            } else {
                                                                                var3_3 = var22_15 /* !! */ .b((iv)var1_1 /* !! */ , var4_4, false);
                                                                            }
                                                                            this.y += var3_3;
                                                                            this.z -= var3_3;
                                                                            var3_3 = 6;
                                                                            var20_13 /* !! */  = null;
                                                                        }
                                                                        break block82;
                                                                    }
                                                                    while ((var3_3 = this.y) < (var4_4 = this.x)) {
                                                                        var3_3 = var22_15 /* !! */ .b((iv)var1_1 /* !! */ , var4_4 - var3_3, false);
                                                                        this.y += var3_3;
                                                                    }
                                                                }
                                                                var3_3 = com.yandex.mobile.ads.impl.ic0$b.a(var2_2 /* !! */ ) == false ? var2_2 /* !! */ .d.g[var2_2 /* !! */ .f] : (var2_2 /* !! */ .b.j[var2_2 /* !! */ .f] != false ? 1 : 0);
                                                                var4_4 = var3_3;
                                                                if (var2_2 /* !! */ .a() != null) {
                                                                    var4_4 = var3_3 | 0x40000000;
                                                                }
                                                                var1_1 /* !! */  = (var1_1 /* !! */  = var2_2 /* !! */ .a()) != null ? var1_1 /* !! */ .c : null;
                                                                var22_15 /* !! */ .a(var8_7, var4_4, this.x, 0, (g62.a)var1_1 /* !! */ );
                                                                while (!this.k.isEmpty()) {
                                                                    var20_13 /* !! */  = this.k.removeFirst();
                                                                    this.s -= var20_13 /* !! */ .c;
                                                                    var10_8 = var12_9 = var20_13 /* !! */ .a;
                                                                    if (var20_13 /* !! */ .b) {
                                                                        var10_8 = var12_9 + var8_7;
                                                                    }
                                                                    var1_1 /* !! */  = this.C;
                                                                    var4_4 = var1_1 /* !! */ .length;
                                                                    for (var3_3 = 0; var3_3 < var4_4; ++var3_3) {
                                                                        var1_1 /* !! */ [var3_3].a(var10_8, 1, var20_13 /* !! */ .c, this.s, null);
                                                                    }
                                                                }
                                                                ++var2_2 /* !! */ .f;
                                                                if (!com.yandex.mobile.ads.impl.ic0$b.a(var2_2 /* !! */ )) break block83;
                                                                var2_2 /* !! */ .g = var3_3 = var2_2 /* !! */ .g + 1;
                                                                var1_1 /* !! */  = (g62[])var2_2 /* !! */ .b.g;
                                                                var4_4 = var2_2 /* !! */ .h;
                                                                if (var3_3 != var1_1 /* !! */ [var4_4]) break block84;
                                                                var2_2 /* !! */ .h = var4_4 + 1;
                                                                var2_2 /* !! */ .g = 0;
                                                            }
                                                            this.w = null;
                                                        }
                                                        this.m = 3;
                                                    }
                                                    return 0;
                                                }
                                                var4_4 = this.b.size();
                                                var2_2 /* !! */  = null;
                                                for (var3_3 = 0; var3_3 < var4_4; ++var3_3) {
                                                    var21_14 /* !! */  = (this.b.valueAt((int)var3_3)).b;
                                                    var10_8 = var8_7;
                                                    var20_13 /* !! */  = var2_2 /* !! */ ;
                                                    if (var21_14 /* !! */ .o) {
                                                        var12_9 = var21_14 /* !! */ .c;
                                                        var10_8 = var8_7;
                                                        var20_13 /* !! */  = var2_2 /* !! */ ;
                                                        if (var12_9 < var8_7) {
                                                            var20_13 /* !! */  = this.b.valueAt(var3_3);
                                                            var10_8 = var12_9;
                                                        }
                                                    }
                                                    var8_7 = var10_8;
                                                    var2_2 /* !! */  = var20_13 /* !! */ ;
                                                }
                                                if (var2_2 /* !! */  == null) {
                                                    this.m = 3;
                                                    continue;
                                                }
                                                var20_13 /* !! */  = (oz)var1_1 /* !! */ ;
                                                var3_3 = (int)(var8_7 - var20_13 /* !! */ .a());
                                                if (var3_3 >= 0) {
                                                    var20_13 /* !! */ .a(var3_3);
                                                    var2_2 /* !! */  = var2_2 /* !! */ .b;
                                                    var20_13 /* !! */ .a(var2_2 /* !! */ .n.c(), 0, var2_2 /* !! */ .n.e(), false);
                                                    var2_2 /* !! */ .n.e(0);
                                                    var2_2 /* !! */ .o = false;
                                                    continue;
                                                }
                                                throw fg1.a((String)"Offset to encryption data was negative.", null);
                                            }
                                            var3_3 = (int)this.o - this.p;
                                            var21_14 /* !! */  = this.q;
                                            if (var21_14 /* !! */  == null) break block85;
                                            var20_13 /* !! */  = var21_14 /* !! */ .c();
                                            var2_2 /* !! */  = (oz)var1_1 /* !! */ ;
                                            var2_2 /* !! */ .a((byte[])var20_13 /* !! */ , 8, var3_3, false);
                                            var3_3 = this.n;
                                            var20_13 /* !! */  = new yg.b(var3_3, (bg1)var21_14 /* !! */ );
                                            var12_9 = var2_2 /* !! */ .a();
                                            if (this.j.isEmpty()) break block86;
                                            this.j.peek().c.add(var20_13 /* !! */ );
                                            break block87;
                                        }
                                        if (var3_3 != 1936286840) break block88;
                                        var21_14 /* !! */ .e(8);
                                        var3_3 = var21_14 /* !! */ .h();
                                        var21_14 /* !! */ .f(4);
                                        var14_10 = var21_14 /* !! */ .v();
                                        if ((var3_3 >> 24 & 255) == 0) {
                                            var8_7 = var21_14 /* !! */ .v();
                                            var10_8 = var21_14 /* !! */ .v();
                                        } else {
                                            var8_7 = var21_14 /* !! */ .y();
                                            var10_8 = var21_14 /* !! */ .y();
                                        }
                                        var16_11 = m92.a((long)var8_7, (long)1000000L, (long)var14_10);
                                        var21_14 /* !! */ .f(2);
                                        var3_3 = var21_14 /* !! */ .z();
                                        var20_13 /* !! */  = new int[var3_3];
                                        var23_16 /* !! */  = (y52)new long[var3_3];
                                        var22_15 /* !! */  = (g62)new long[var3_3];
                                        var2_2 /* !! */  = (g62[])new long[var3_3];
                                        var10_8 += var12_9;
                                        var12_9 = var16_11;
                                        for (var4_4 = 0; var4_4 < var3_3; ++var4_4) {
                                            var5_5 = var21_14 /* !! */ .h();
                                            if ((var5_5 & -2147483648) == 0) {
                                                var18_12 = var21_14 /* !! */ .v();
                                                var20_13 /* !! */ [var4_4] = var5_5 & 0x7FFFFFFF;
                                                var23_16 /* !! */ [var4_4] = (y52)var10_8;
                                                var2_2 /* !! */ [var4_4] = (qj1)var12_9;
                                                var12_9 = m92.a((long)(var8_7 += var18_12), (long)1000000L, (long)var14_10);
                                                var22_15 /* !! */ [var4_4] = (g62)(var12_9 - var2_2 /* !! */ [var4_4]);
                                                var21_14 /* !! */ .f(4);
                                                var10_8 += (long)var20_13 /* !! */ [var4_4];
                                                continue;
                                            }
                                            throw fg1.a((String)"Unhandled indirect reference", null);
                                        }
                                        var2_2 /* !! */  = Pair.create((Object)var16_11, (Object)new wn((int[])var20_13 /* !! */ , (long[])var23_16 /* !! */ , (long[])var22_15 /* !! */ , (long[])var2_2 /* !! */ ));
                                        this.v = (Long)var2_2 /* !! */ .first;
                                        this.B.a((ex1)var2_2 /* !! */ .second);
                                        this.E = true;
                                        break block87;
                                    }
                                    if (var3_3 != 1701671783 || this.C.length == 0) break block87;
                                    var21_14 /* !! */ .e(8);
                                    var3_3 = var21_14 /* !! */ .h() >> 24 & 255;
                                    if (var3_3 == 0) break block89;
                                    if (var3_3 == 1) break block90;
                                    sr0.a((String)"Skipping unsupported emsg version: ", (int)var3_3, (String)"FragmentedMp4Extractor");
                                    break block87;
                                }
                                var8_7 = var21_14 /* !! */ .v();
                                var10_8 = m92.a((long)var21_14 /* !! */ .y(), (long)1000000L, (long)var8_7);
                                var8_7 = m92.a((long)var21_14 /* !! */ .v(), (long)1000L, (long)var8_7);
                                var14_10 = var21_14 /* !! */ .v();
                                var2_2 /* !! */  = var21_14 /* !! */ .q();
                                var2_2 /* !! */ .getClass();
                                var20_13 /* !! */  = var21_14 /* !! */ .q();
                                var20_13 /* !! */ .getClass();
                                var12_9 = -9223372036854775807L;
                                break block91;
                            }
                            var2_2 /* !! */  = var21_14 /* !! */ .q();
                            var2_2 /* !! */ .getClass();
                            var20_13 /* !! */  = var21_14 /* !! */ .q();
                            var20_13 /* !! */ .getClass();
                            var10_8 = var21_14 /* !! */ .v();
                            var12_9 = m92.a((long)var21_14 /* !! */ .v(), (long)1000000L, (long)var10_8);
                            var8_7 = this.v;
                            var8_7 = var8_7 != -9223372036854775807L ? (var8_7 += var12_9) : -9223372036854775807L;
                            var10_8 = m92.a((long)var21_14 /* !! */ .v(), (long)1000L, (long)var10_8);
                            var14_10 = var21_14 /* !! */ .v();
                            var16_11 = var8_7;
                            var8_7 = var10_8;
                            var10_8 = var16_11;
                        }
                        var22_15 /* !! */  = (g62)new byte[var21_14 /* !! */ .a()];
                        var21_14 /* !! */ .a((byte[])var22_15 /* !! */ , 0, var21_14 /* !! */ .a());
                        var2_2 /* !! */  = new s50((String)var2_2 /* !! */ , (String)var20_13 /* !! */ , var8_7, var14_10, (byte[])var22_15 /* !! */ );
                        var20_13 /* !! */  = new bg1(this.h.a((s50)var2_2 /* !! */ ));
                        var4_4 = var20_13 /* !! */ .a();
                        for (g62[] var2_2 : this.C) {
                            var20_13 /* !! */ .e(0);
                            var2_2 /* !! */ .a(var4_4, (bg1)var20_13 /* !! */ );
                        }
                        if (var10_8 == -9223372036854775807L) {
                            this.k.addLast(new /* Unavailable Anonymous Inner Class!! */);
                            this.s += var4_4;
                        } else if (!this.k.isEmpty()) {
                            this.k.addLast(new /* Unavailable Anonymous Inner Class!! */);
                            this.s += var4_4;
                        } else {
                            var2_2 /* !! */  = this.C;
                            var5_5 = var2_2 /* !! */ .length;
                            for (var3_3 = 0; var3_3 < var5_5; ++var3_3) {
                                var2_2 /* !! */ [var3_3].a(var10_8, 1, var4_4, 0, null);
                            }
                        }
                        break block87;
                    }
                    ((oz)var1_1 /* !! */ ).a(var3_3);
                }
                this.a(((oz)var1_1 /* !! */ ).a());
                continue;
            }
            if (this.p == 0) {
                var2_2 /* !! */  = (g62[])this.i.c();
                if (!((oz)var1_1 /* !! */ ).a((byte[])var2_2 /* !! */ , 0, 8, true)) {
                    return -1;
                }
                this.p = 8;
                this.i.e(0);
                this.o = this.i.v();
                this.n = this.i.h();
            }
            if ((var8_7 = this.o) == 1L) {
                var2_2 /* !! */  = (g62[])this.i.c();
                ((oz)var1_1 /* !! */ ).a((byte[])var2_2 /* !! */ , 8, 8, false);
                this.p += 8;
                this.o = this.i.y();
            } else if (var8_7 == 0L) {
                var2_2 /* !! */  = (oz)var1_1 /* !! */ ;
                var8_7 = var10_8 = var2_2 /* !! */ .b();
                if (var10_8 == -1L) {
                    var8_7 = var10_8;
                    if (!this.j.isEmpty()) {
                        var8_7 = this.j.peek().b;
                    }
                }
                if (var8_7 != -1L) {
                    this.o = var8_7 - var2_2 /* !! */ .a() + (long)this.p;
                }
            }
            if (this.o < (long)this.p) break;
            var2_2 /* !! */  = (oz)var1_1 /* !! */ ;
            var8_7 = var2_2 /* !! */ .a() - (long)this.p;
            var3_3 = this.n;
            if (!(var3_3 != 0x6D6F6F66 && var3_3 != 1835295092 || this.E)) {
                this.B.a((ex1)new ex1.b(this.u, var8_7));
                this.E = true;
            }
            if (this.n == 0x6D6F6F66) {
                var4_4 = this.b.size();
                for (var3_3 = 0; var3_3 < var4_4; ++var3_3) {
                    var20_13 /* !! */  = (this.b.valueAt((int)var3_3)).b;
                    var20_13 /* !! */ .getClass();
                    var20_13 /* !! */ .c = var8_7;
                    var20_13 /* !! */ .b = var8_7;
                }
            }
            if ((var3_3 = this.n) == 1835295092) {
                this.w = null;
                this.r = var8_7 + this.o;
                this.m = 2;
                continue;
            }
            if (var3_3 != 1836019574 && var3_3 != 1953653099 && var3_3 != 1835297121 && var3_3 != 1835626086 && var3_3 != 1937007212 && var3_3 != 0x6D6F6F66 && var3_3 != 1953653094 && var3_3 != 1836475768 && var3_3 != 1701082227) {
                if (var3_3 != 1751411826 && var3_3 != 1835296868 && var3_3 != 1836476516 && var3_3 != 1936286840 && var3_3 != 1937011556 && var3_3 != 0x73747473 && var3_3 != 1668576371 && var3_3 != 1937011555 && var3_3 != 1937011578 && var3_3 != 1937013298 && var3_3 != 1937007471 && var3_3 != 1668232756 && var3_3 != 0x73747373 && var3_3 != 0x74666474 && var3_3 != 1952868452 && var3_3 != 1953196132 && var3_3 != 1953654136 && var3_3 != 1953658222 && var3_3 != 1886614376 && var3_3 != 1935763834 && var3_3 != 1935763823 && var3_3 != 1936027235 && var3_3 != 1970628964 && var3_3 != 1935828848 && var3_3 != 1936158820 && var3_3 != 1701606260 && var3_3 != 1835362404 && var3_3 != 1701671783) {
                    if (this.o <= 0x7FFFFFFFL) {
                        this.q = null;
                        this.m = 1;
                        continue;
                    }
                    throw fg1.a((String)"Skipping atom with length > 2147483647 (unsupported).");
                }
                if (this.p == 8) {
                    var8_7 = this.o;
                    if (var8_7 <= 0x7FFFFFFFL) {
                        var2_2 /* !! */  = new bg1((int)var8_7);
                        System.arraycopy(this.i.c(), 0, var2_2 /* !! */ .c(), 0, 8);
                        this.q = var2_2 /* !! */ ;
                        this.m = 1;
                        continue;
                    }
                    throw fg1.a((String)"Leaf atom with length > 2147483647 (unsupported).");
                }
                throw fg1.a((String)"Leaf atom defines extended atom size (unsupported).");
            }
            var8_7 = var2_2 /* !! */ .a() + this.o - 8L;
            this.j.push(new yg.a(this.n, var8_7));
            if (this.o == (long)this.p) {
                this.a(var8_7);
                continue;
            }
            this.m = 0;
            this.p = 0;
        }
        throw fg1.a((String)"Atom size less than header length (unsupported).");
    }

    @Nullable
    protected final y52 a(@Nullable y52 y522) {
        return y522;
    }

    public final void a(long l10, long l11) {
        int n10 = this.b.size();
        for (int i14 = 0; i14 < n10; ++i14) {
            (this.b.valueAt(i14)).b();
        }
        this.k.clear();
        this.s = 0;
        this.t = l11;
        this.j.clear();
        this.m = 0;
        this.p = 0;
    }

    public final void a(v70 g622) {
        int n10;
        this.B = g622;
        int n13 = 0;
        this.m = 0;
        this.p = 0;
        g622 = new g62[2];
        this.C = g622;
        g62 g623 = this.l;
        if (g623 != null) {
            g622[0] = g623;
            n10 = 1;
        } else {
            n10 = 0;
        }
        g622 = (g62[])m92.a((int)n10, (Object[])g622);
        this.C = g622;
        int n14 = ((Object[])g622).length;
        for (n10 = 0; n10 < n14; ++n10) {
            g622[n10].a(G);
        }
        this.D = new g62[this.a.size()];
        n14 = 100;
        n10 = n13;
        n13 = n14;
        while (n10 < this.D.length) {
            g622 = this.B.a(n13, 3);
            g622.a(this.a.get(n10));
            this.D[n10] = g622;
            ++n10;
            ++n13;
        }
    }

    public final boolean a(u70 u702) throws IOException {
        return v02.a((oz)((oz)u702));
    }

    public final void release() {
    }
}

