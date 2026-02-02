/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.ag1
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.di0$a
 *  com.yandex.mobile.ads.impl.di0$b
 *  com.yandex.mobile.ads.impl.k01
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.sf
 *  com.yandex.mobile.ads.impl.sr0
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ag1;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.ce0;
import com.yandex.mobile.ads.impl.cs2;
import com.yandex.mobile.ads.impl.di0;
import com.yandex.mobile.ads.impl.ei0;
import com.yandex.mobile.ads.impl.hl1;
import com.yandex.mobile.ads.impl.hq;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.n01;
import com.yandex.mobile.ads.impl.sf;
import com.yandex.mobile.ads.impl.sn;
import com.yandex.mobile.ads.impl.sr0;
import com.yandex.mobile.ads.impl.tk;
import com.yandex.mobile.ads.impl.tn;
import com.yandex.mobile.ads.impl.uy1;
import com.yandex.mobile.ads.impl.v42;
import com.yandex.mobile.ads.impl.y01;
import com.yandex.mobile.ads.impl.y82;
import com.yandex.mobile.ads.impl.yd;
import com.yandex.mobile.ads.impl.zs0;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public final class di0
extends uy1 {
    public static final a b = new cs2();
    @Nullable
    private final a a;

    public di0(@Nullable a a12) {
        this.a = a12;
    }

    private static int a(int n10) {
        n10 = n10 != 0 && n10 != 3 ? 2 : 1;
        return n10;
    }

    private static int a(byte[] byArray, int n10, int n12) {
        int n13 = di0.b(n10, byArray);
        if (n12 != 0) {
            int n14 = n13;
            if (n12 != 3) {
                while (n14 < byArray.length - 1) {
                    if ((n14 - n10) % 2 == 0 && byArray[n14 + 1] == 0) {
                        return n14;
                    }
                    n14 = di0.b(n14 + 1, byArray);
                }
                return byArray.length;
            }
        }
        return n13;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    private static ei0 a(int var0, bg1 var1_1, boolean var2_2, int var3_3, @Nullable a var4_4) {
        block46: {
            var14_8 = var1_1.t();
            var15_9 = var1_1.t();
            var16_10 = var1_1.t();
            var10_11 = var0 >= 3 ? var1_1.t() : 0;
            if (var0 == 4) {
                var5_13 = var6_12 = var1_1.x();
                if (!var2_2) {
                    var5_13 = (var6_12 >> 24 & 255) << 21 | (var6_12 & 255 | (var6_12 >> 8 & 255) << 7 | (var6_12 >> 16 & 255) << 14);
                }
            } else {
                var5_13 = var0 == 3 ? var1_1.x() : var1_1.w();
            }
            var11_14 = var5_13;
            var9_15 = var0 >= 3 ? var1_1.z() : 0;
            if (var14_8 == 0 && var15_9 == 0 && var16_10 == 0 && var10_11 == 0 && var11_14 == 0 && var9_15 == 0) {
                var1_1.e(var1_1.e());
                return null;
            }
            var17_16 = var1_1.d() + var11_14;
            if (var17_16 > var1_1.e()) {
                zs0.d((String)"Id3Decoder", (String)"Frame size exceeds remaining tag data");
                var1_1.e(var1_1.e());
                return null;
            }
            if (var4_4 /* !! */  != null && !var4_4 /* !! */ .a(var0, var14_8, var15_9, var16_10, var10_11)) {
                var1_1.e(var17_16);
                return null;
            }
            if (var0 == 3) {
                var5_13 = (var9_15 & 128) != 0 ? 1 : 0;
                var6_12 = (var9_15 & 64) != 0 ? 1 : 0;
                var7_17 = (var9_15 & 32) != 0 ? 1 : 0;
                var8_18 = var7_17;
                var12_19 = 0;
                var7_17 = var5_13;
                var9_15 = var5_13;
                var5_13 = var7_17;
                var7_17 = var6_12;
                var6_12 = var12_19;
            } else if (var0 == 4) {
                var5_13 = (var9_15 & 64) != 0 ? 1 : 0;
                var8_18 = (var9_15 & 8) != 0 ? 1 : 0;
                var6_12 = (var9_15 & 4) != 0 ? 1 : 0;
                var7_17 = (var9_15 & 2) != 0 ? 1 : 0;
                if ((var9_15 & 1) != 0) {
                    var12_20 = var7_17;
                    var13_22 = var5_13;
                    var5_13 = 1;
                    var9_15 = var8_18;
                    var7_17 = var6_12;
                    var8_18 = var13_22;
                    var6_12 = var12_20;
                } else {
                    var12_21 = var7_17;
                    var13_23 = var5_13;
                    var5_13 = 0;
                    var9_15 = var8_18;
                    var7_17 = var6_12;
                    var8_18 = var13_23;
                    var6_12 = var12_21;
                }
            } else {
                var9_15 = 0;
                var5_13 = 0;
                var7_17 = 0;
                var8_18 = 0;
                var6_12 = 0;
            }
            if (var9_15 != 0 || var7_17 != 0) ** GOTO lbl131
            var7_17 = var11_14;
            if (var8_18 != 0) {
                var7_17 = var11_14 - 1;
                var1_1.f(1);
            }
            var8_18 = var7_17;
            if (var5_13 != 0) {
                var8_18 = var7_17 - 4;
                var1_1.f(4);
            }
            var5_13 = var8_18;
            if (var6_12 != 0) {
                var5_13 = di0.g(var8_18, var1_1);
            }
            if (var14_8 != 84 || var15_9 != 88 || var16_10 != 88 || var0 != 2 && var10_11 != 88) ** GOTO lbl83
            try {
                block45: {
                    block44: {
                        try {
                            var4_4 /* !! */  = di0.e(var5_13, var1_1);
                            break block44;
                        }
                        catch (UnsupportedEncodingException var4_6) {
                            break block45;
                        }
lbl83:

                        if (var14_8 == 84) {
                            var4_4 /* !! */  = di0.a(var5_13, var1_1, di0.a(var0, var14_8, var15_9, var16_10, var10_11));
                        } else if (var14_8 == 87 && var15_9 == 88 && var16_10 == 88 && (var0 == 2 || var10_11 == 88)) {
                            var4_4 /* !! */  = di0.f(var5_13, var1_1);
                        } else if (var14_8 == 87) {
                            var4_4 /* !! */  = di0.b(var5_13, var1_1, di0.a(var0, var14_8, var15_9, var16_10, var10_11));
                        } else if (var14_8 == 80 && var15_9 == 82 && var16_10 == 73 && var10_11 == 86) {
                            var4_4 /* !! */  = di0.d(var5_13, var1_1);
                        } else if (var14_8 == 71 && var15_9 == 69 && var16_10 == 79 && (var10_11 == 66 || var0 == 2)) {
                            var4_4 /* !! */  = di0.b(var5_13, var1_1);
                        } else if (var0 == 2 ? var14_8 == 80 && var15_9 == 73 && var16_10 == 67 : var14_8 == 65 && var15_9 == 80 && var16_10 == 73 && var10_11 == 67) {
                            var4_4 /* !! */  = di0.a(var5_13, var0, var1_1);
                        } else if (var14_8 == 67 && var15_9 == 79 && var16_10 == 77 && (var10_11 == 77 || var0 == 2)) {
                            var4_4 /* !! */  = di0.a(var5_13, var1_1);
                        } else if (var14_8 == 67 && var15_9 == 72 && var16_10 == 65 && var10_11 == 80) {
                            var4_4 /* !! */  = di0.a(var1_1, var5_13, var0, var2_2, var3_3, var4_4 /* !! */ );
                        } else if (var14_8 == 67 && var15_9 == 84 && var16_10 == 79 && var10_11 == 67) {
                            var4_4 /* !! */  = di0.b(var1_1, var5_13, var0, var2_2, var3_3, var4_4 /* !! */ );
                        } else if (var14_8 == 77 && var15_9 == 76 && var16_10 == 76 && var10_11 == 84) {
                            var4_4 /* !! */  = di0.c(var5_13, var1_1);
                        } else {
                            var4_4 /* !! */  = di0.a(var0, var14_8, var15_9, var16_10, var10_11);
                            var18_24 = new byte[var5_13];
                            var1_1.a((byte[])var18_24, 0, var5_13);
                            var4_4 /* !! */  = new tk((String)var4_4 /* !! */ , (byte[])var18_24);
                        }
                    }
                    if (var4_4 /* !! */  == null) {
                        var18_24 = new StringBuilder("Failed to decode frame: id=");
                        var18_24.append(di0.a(var0, var14_8, var15_9, var16_10, var10_11));
                        var18_24.append(", frameSize=");
                        var18_24.append(var5_13);
                        var18_24 = var18_24.toString();
                        zs0.d((String)"Id3Decoder", (String)var18_24);
                    }
                    var1_1.e(var17_16);
                    return var4_4 /* !! */ ;
lbl131:

                    zs0.d((String)"Id3Decoder", (String)"Skipping unsupported compressed or encrypted frame");
                    var1_1.e(var17_16);
                    return null;
        // Removed invalid catch block
                zs0.d((String)"Id3Decoder", (String)"Unsupported character encoding");
            }
        // Removed invalid catch block
            }
            var1_1.e(var17_16);
            return null;
        }
        var1_1.e(var17_16);
        throw var4_5;
    }

    @Nullable
    private static hq a(int n10, bg1 object) throws UnsupportedEncodingException {
        if (n10 < 4) {
            return null;
        }
        int n12 = object.t();
        String string2 = di0.b(n12);
        Object object2 = new byte[3];
        object.a(object2, 0, 3);
        object2 = new String((byte[])object2, 0, 3);
        byte[] byArray = new byte[n10 -= 4];
        object.a(byArray, 0, n10);
        n10 = di0.a(byArray, 0, n12);
        object = new String(byArray, 0, n10, string2);
        return new hq((String)object2, (String)object, di0.a(n10 += di0.a(n12), di0.a(byArray, n10, n12), string2, byArray));
    }

    private static sn a(bg1 bg12, int n10, int n12, boolean bl2, int n13, @Nullable a a12) throws UnsupportedEncodingException {
        long l10;
        int n14 = bg12.d();
        int n15 = di0.b(n14, bg12.c());
        String string2 = new String(bg12.c(), n14, n15 - n14, "ISO-8859-1");
        bg12.e(n15 + 1);
        n15 = bg12.h();
        int n16 = bg12.h();
        long l11 = bg12.v();
        if (l11 == 0xFFFFFFFFL) {
            l11 = -1L;
        }
        if ((l10 = bg12.v()) == 0xFFFFFFFFL) {
            l10 = -1L;
        }
        ArrayList<ei0> arrayList = new ArrayList<ei0>();
        while (bg12.d() < n14 + n10) {
            ei0 ei02 = di0.a(n12, bg12, bl2, n13, a12);
            if (ei02 == null) continue;
            arrayList.add(ei02);
        }
        return new sn(string2, n15, n16, l11, l10, arrayList.toArray(new ei0[0]));
    }

    @Nullable
    private static v42 a(int n10, bg1 bg12, String string2) throws UnsupportedEncodingException {
        if (n10 < 1) {
            return null;
        }
        int n12 = bg12.t();
        String string3 = di0.b(n12);
        byte[] byArray = new byte[--n10];
        bg12.a(byArray, 0, n10);
        return new v42(string2, null, new String(byArray, 0, di0.a(byArray, 0, n12), string3));
    }

    private static yd a(int n10, int n12, bg1 object) throws UnsupportedEncodingException {
        Object object2;
        int n13 = object.t();
        String string2 = di0.b(n13);
        int n14 = n10 - 1;
        byte[] byArray = new byte[n14];
        object.a(byArray, 0, n14);
        if (n12 == 2) {
            object = new StringBuilder("image/");
            ((StringBuilder)object).append(sf.b((String)new String(byArray, 0, 3, "ISO-8859-1")));
            object = object2 = ((StringBuilder)object).toString();
            if ("image/jpg".equals(object2)) {
                object = "image/jpeg";
            }
            n10 = 2;
        } else {
            n12 = di0.b(0, byArray);
            object2 = sf.b((String)new String(byArray, 0, n12, "ISO-8859-1"));
            n10 = n12;
            object = object2;
            if (((String)object2).indexOf(47) == -1) {
                object = "image/".concat((String)object2);
                n10 = n12;
            }
        }
        n12 = byArray[n10 + 1];
        int n15 = n10 + 2;
        n10 = di0.a(byArray, n15, n13);
        string2 = new String(byArray, n15, n10 - n15, string2);
        object2 = n14 <= (n10 += di0.a(n13)) ? (Object)m92.f : (Object)Arrays.copyOfRange(byArray, n10, n14);
        return new yd((String)object, string2, n12 & 0xFF, (byte[])object2);
    }

    private static String a(int n10, int n12, int n13, int n14, int n15) {
        String string2 = n10 == 2 ? String.format(Locale.US, "%c%c%c", n12, n13, n14) : String.format(Locale.US, "%c%c%c%c", n12, n13, n14, n15);
        return string2;
    }

    private static String a(int n10, int n12, String string2, byte[] byArray) throws UnsupportedEncodingException {
        if (n12 > n10 && n12 <= byArray.length) {
            return new String(byArray, n10, n12 - n10, string2);
        }
        return "";
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean a(bg1 var0, int var1_1, int var2_2, boolean var3_3) {
        block17: {
            var8_4 = var0.d();
            while (true) {
                block18: {
                    block20: {
                        block19: {
                            block16: {
                                block15: {
                                    try {
                                        var4_5 = var0.a();
                                        var7_8 = 1;
                                        if (var4_5 < var2_2) break;
                                        if (var1_1 < 3) break block15;
                                        var4_5 = var0.h();
                                        var9_9 = var0.v();
                                        var6_7 = var0.z();
                                        break block16;
                                    }
                                    catch (Throwable var13_11) {
                                        break block17;
                                    }
                                }
                                var4_5 = var0.w();
                                var5_6 = var0.w();
                                var9_9 = var5_6;
                                var6_7 = 0;
                            }
                            if (var4_5 == 0 && var9_9 == 0L && var6_7 == 0) {
                                var0.e(var8_4);
                                return true;
                            }
                            var11_10 = var9_9;
                            if (var1_1 == 4) {
                                var11_10 = var9_9;
                                if (!var3_3) {
                                    if ((0x808080L & var9_9) != 0L) {
                                        var0.e(var8_4);
                                        return false;
                                    }
                                    var11_10 = (var9_9 >> 24 & 255L) << 21 | (var9_9 & 255L | (var9_9 >> 8 & 255L) << 7 | (var9_9 >> 16 & 255L) << 14);
                                }
                            }
                            if (var1_1 != 4) break block19;
                            var4_5 = (var6_7 & 64) != 0 ? 1 : 0;
                            var5_6 = var4_5;
                            if ((var6_7 & 1) == 0) ** GOTO lbl-1000
                            var5_6 = var7_8;
                            break block18;
                        }
                        if (var1_1 == 3) {
                            var4_5 = (var6_7 & 32) != 0 ? 1 : 0;
                            var5_6 = var4_5;
                            ** if ((var6_7 & 128) == 0) goto lbl-1000

                            {
                                var5_6 = var7_8;
                                break block18;
                            }
                        }
                        break block20;

                        {
                            var6_7 = 0;
                            var4_5 = var5_6;
                            var5_6 = var6_7;
                        }
                        break block18;
                    }
                    var4_5 = 0;
                    var5_6 = 0;
                }
                var6_7 = var4_5;
                if (var5_6 != 0) {
                    var6_7 = var4_5 + 4;
                }
                if (var11_10 < (long)var6_7) {
                    var0.e(var8_4);
                    return false;
                }
                var4_5 = var0.a();
                if ((long)var4_5 < var11_10) {
                    var0.e(var8_4);
                    return false;
                }
                var4_5 = (int)var11_10;
                {
                    var0.f(var4_5);
                    continue;
                }
                break;
            }
            var0.e(var8_4);
            return true;
        }
        var0.e(var8_4);
        throw var13_11;
    }

    private static int b(int n10, byte[] byArray) {
        while (n10 < byArray.length) {
            if (byArray[n10] == 0) {
                return n10;
            }
            ++n10;
        }
        return byArray.length;
    }

    private static ce0 b(int n10, bg1 object) throws UnsupportedEncodingException {
        int n12 = object.t();
        String string2 = di0.b(n12);
        byte[] byArray = new byte[--n10];
        object.a(byArray, 0, n10);
        int n13 = di0.b(0, byArray);
        String string3 = new String(byArray, 0, n13, "ISO-8859-1");
        int n14 = n13 + 1;
        n13 = di0.a(byArray, n14, n12);
        String string4 = di0.a(n14, n13, string2, byArray);
        n14 = di0.a(byArray, n13 += di0.a(n12), n12);
        string2 = di0.a(n13, n14, string2, byArray);
        n12 = n14 + di0.a(n12);
        object = n10 <= n12 ? (Object)m92.f : (Object)Arrays.copyOfRange(byArray, n12, n10);
        return new ce0(string3, string4, string2, (byte[])object);
    }

    private static tn b(bg1 bg12, int n10, int n12, boolean bl2, int n13, @Nullable a a12) throws UnsupportedEncodingException {
        int n14 = bg12.d();
        int n15 = di0.b(n14, bg12.c());
        String string2 = new String(bg12.c(), n14, n15 - n14, "ISO-8859-1");
        bg12.e(n15 + 1);
        n15 = bg12.t();
        boolean bl3 = (n15 & 2) != 0;
        boolean bl4 = (n15 & 1) != 0;
        int n16 = bg12.t();
        String[] stringArray = new String[n16];
        for (n15 = 0; n15 < n16; ++n15) {
            int n17 = bg12.d();
            int n18 = di0.b(n17, bg12.c());
            stringArray[n15] = new String(bg12.c(), n17, n18 - n17, "ISO-8859-1");
            bg12.e(n18 + 1);
        }
        ArrayList<ei0> arrayList = new ArrayList<ei0>();
        while (bg12.d() < n14 + n10) {
            ei0 ei02 = di0.a(n12, bg12, bl2, n13, a12);
            if (ei02 == null) continue;
            arrayList.add(ei02);
        }
        return new tn(string2, bl3, bl4, stringArray, arrayList.toArray(new ei0[0]));
    }

    private static y82 b(int n10, bg1 bg12, String string2) throws UnsupportedEncodingException {
        byte[] byArray = new byte[n10];
        bg12.a(byArray, 0, n10);
        return new y82(string2, null, new String(byArray, 0, di0.b(0, byArray), "ISO-8859-1"));
    }

    private static String b(int n10) {
        if (n10 != 1) {
            if (n10 != 2) {
                if (n10 != 3) {
                    return "ISO-8859-1";
                }
                return "UTF-8";
            }
            return "UTF-16BE";
        }
        return "UTF-16";
    }

    private static /* synthetic */ boolean b(int n10, int n12, int n13, int n14, int n15) {
        return false;
    }

    private static y01 c(int n10, bg1 object) {
        int n12 = object.z();
        int n13 = object.w();
        int n14 = object.w();
        int n15 = object.t();
        int n16 = object.t();
        ag1 ag12 = new ag1();
        Object[] objectArray = object.c();
        ag12.a(object.e(), objectArray);
        ag12.c(object.d() * 8);
        int n17 = (n10 - 10) * 8 / (n15 + n16);
        object = new int[n17];
        objectArray = new int[n17];
        for (n10 = 0; n10 < n17; ++n10) {
            int n18 = ag12.b(n15);
            int n19 = ag12.b(n16);
            object[n10] = (bg1)n18;
            objectArray[n10] = n19;
        }
        return new y01(n12, n13, n14, (int[])object, (int[])objectArray);
    }

    public static /* synthetic */ boolean c(int n10, int n12, int n13, int n14, int n15) {
        return di0.b(n10, n12, n13, n14, n15);
    }

    private static hl1 d(int n10, bg1 object) throws UnsupportedEncodingException {
        byte[] byArray = new byte[n10];
        object.a(byArray, 0, n10);
        int n12 = di0.b(0, byArray);
        String string2 = new String(byArray, 0, n12, "ISO-8859-1");
        object = n10 <= ++n12 ? (Object)m92.f : (Object)Arrays.copyOfRange(byArray, n12, n10);
        return new hl1(string2, (byte[])object);
    }

    @Nullable
    private static v42 e(int n10, bg1 object) throws UnsupportedEncodingException {
        if (n10 < 1) {
            return null;
        }
        int n12 = object.t();
        String string2 = di0.b(n12);
        byte[] byArray = new byte[--n10];
        object.a(byArray, 0, n10);
        n10 = di0.a(byArray, 0, n12);
        object = new String(byArray, 0, n10, string2);
        return new v42("TXXX", (String)object, di0.a(n10 += di0.a(n12), di0.a(byArray, n10, n12), string2, byArray));
    }

    @Nullable
    private static y82 f(int n10, bg1 object) throws UnsupportedEncodingException {
        if (n10 < 1) {
            return null;
        }
        int n12 = object.t();
        String string2 = di0.b(n12);
        byte[] byArray = new byte[--n10];
        object.a(byArray, 0, n10);
        n10 = di0.a(byArray, 0, n12);
        object = new String(byArray, 0, n10, string2);
        return new y82("WXXX", (String)object, di0.a(n10 += di0.a(n12), di0.b(n10, byArray), "ISO-8859-1", byArray));
    }

    private static int g(int n10, bg1 bg12) {
        int n12;
        int n13;
        byte[] byArray = bg12.c();
        int n14 = n13 = bg12.d();
        int n15 = n10;
        while ((n12 = n14 + 1) < n13 + n15) {
            n10 = n15;
            if ((byArray[n14] & 0xFF) == 255) {
                n10 = n15;
                if (byArray[n12] == 0) {
                    System.arraycopy(byArray, n14 + 2, byArray, n12, n15 - (n14 - n13) - 2);
                    n10 = n15 - 1;
                }
            }
            n14 = n12;
            n15 = n10;
        }
        return n15;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Nullable
    public final k01 a(int var1_1, byte[] var2_2) {
        block14: {
            block17: {
                block16: {
                    block15: {
                        var10_3 = new ArrayList<E>();
                        var11_4 = new bg1(var1_1, var2_2 /* !! */ );
                        var1_1 = var11_4.a();
                        var9_5 = false;
                        var5_6 = 10;
                        if (var1_1 < 10) {
                            zs0.d((String)"Id3Decoder", (String)"Data too short to be an ID3 tag");
lbl8:

                            while (true) {
                                var2_2 /* !! */  = null;
                                break block14;
                                break;
                            }
                        }
                        var1_1 = var11_4.w();
                        if (var1_1 == 0x494433) break block15;
                        zs0.d((String)"Id3Decoder", (String)"Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", new Object[]{var1_1})));

                    }
                    var6_8 = var11_4.t();
                    var11_4.f(1);
                    var7_9 = var11_4.t();
                    var4_7 = var11_4.s();
                    if (var6_8 != 2) break block16;
                    var1_1 = var4_7;
                    if ((var7_9 & 64) == 0) ** GOTO lbl43
                    zs0.d((String)"Id3Decoder", (String)"Skipped ID3 tag with majorVersion=2 and undefined compression scheme");

                }
                if (var6_8 != 3) break block17;
                var1_1 = var4_7;
                if ((var7_9 & 64) != 0) {
                    var1_1 = var11_4.h();
                    var11_4.f(var1_1);
                    var1_1 = var4_7 - (var1_1 + 4);
                }

            }
            if (var6_8 == 4) {
                var3_10 = var4_7;
                if ((var7_9 & 64) != 0) {
                    var1_1 = var11_4.s();
                    var11_4.f(var1_1 - 4);
                    var3_10 = var4_7 - var1_1;
                }
                var1_1 = var3_10;
                if ((var7_9 & 16) != 0) {
                    var1_1 = var3_10 - 10;
                }
lbl43:

                var8_11 = var6_8 < 4 && (var7_9 & 128) != 0;
                var2_2 /* !! */  = (byte[])new /* Unavailable Anonymous Inner Class!! */;
            } else {
                sr0.a((String)"Skipped ID3 tag with unsupported majorVersion=", (int)var6_8, (String)"Id3Decoder");

            }
        }
        if (var2_2 /* !! */  == null) {
            return null;
        }
        var6_8 = var11_4.d();
        var1_1 = var5_6;
        if (com.yandex.mobile.ads.impl.di0$b.a(var2_2 /* !! */ ) == 2) {
            var1_1 = 6;
        }
        var3_10 = var4_7 = com.yandex.mobile.ads.impl.di0$b.c(var2_2 /* !! */ );
        if (com.yandex.mobile.ads.impl.di0$b.b(var2_2 /* !! */ )) {
            var3_10 = di0.g(var4_7, var11_4);
        }
        var11_4.d(var6_8 + var3_10);
        var8_11 = var9_5;
        if (!di0.a(var11_4, com.yandex.mobile.ads.impl.di0$b.a(var2_2 /* !! */ ), var1_1, false)) {
            if (com.yandex.mobile.ads.impl.di0$b.a(var2_2 /* !! */ ) == 4 && di0.a(var11_4, 4, var1_1, true)) {
                var8_11 = true;
            } else {
                var10_3 = new StringBuilder("Failed to validate ID3 tag with majorVersion=");
                var10_3.append(com.yandex.mobile.ads.impl.di0$b.a(var2_2 /* !! */ ));
                zs0.d((String)"Id3Decoder", (String)var10_3.toString());
                return null;
            }
        }
        while (var11_4.a() >= var1_1) {
            var12_12 = di0.a(com.yandex.mobile.ads.impl.di0$b.a(var2_2 /* !! */ ), var11_4, var8_11, var1_1, this.a);
            if (var12_12 == null) continue;
            var10_3.add(var12_12);
        }
        return new k01(var10_3);
    }

    @Override
    @Nullable
    protected final k01 a(n01 object, ByteBuffer byteBuffer) {
        object = byteBuffer.array();
        return this.a(byteBuffer.limit(), (byte[])object);
    }
}

