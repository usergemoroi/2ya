/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Layout$Alignment
 *  android.text.SpannableStringBuilder
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.ag1
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.cq
 *  com.yandex.mobile.ads.impl.ln$a
 *  com.yandex.mobile.ads.impl.ln$b
 *  com.yandex.mobile.ads.impl.ln$c
 *  com.yandex.mobile.ads.impl.q32
 *  com.yandex.mobile.ads.impl.sr0
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ag1;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.cq;
import com.yandex.mobile.ads.impl.jy;
import com.yandex.mobile.ads.impl.ln;
import com.yandex.mobile.ads.impl.mn;
import com.yandex.mobile.ads.impl.nn;
import com.yandex.mobile.ads.impl.q32;
import com.yandex.mobile.ads.impl.sr0;
import com.yandex.mobile.ads.impl.u32;
import com.yandex.mobile.ads.impl.wu;
import com.yandex.mobile.ads.impl.zs0;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Exception performing whole class analysis ignored.
 */
public final class ln
extends mn {
    private final bg1 g = new bg1();
    private final ag1 h = new ag1();
    private int i = -1;
    private final int j;
    private final b[] k;
    private b l;
    @Nullable
    private List<wu> m;
    @Nullable
    private List<wu> n;
    @Nullable
    private c o;
    private int p;

    public ln(int n10, @Nullable List<byte[]> list) {
        int n13 = n10;
        if (n10 == -1) {
            n13 = 1;
        }
        this.j = n13;
        if (list != null) {
            cq.a(list);
        }
        this.k = new b[8];
        for (n10 = 0; n10 < 8; ++n10) {
            this.k[n10] = new /* Unavailable Anonymous Inner Class!! */;
        }
        this.l = this.k[0];
    }

    /*
     * Unable to fully structure code
     */
    private void i() {
        var14_1 = this.o;
        if (var14_1 == null) {
            return;
        }
        var2_2 = var14_1.d;
        var3_3 = var14_1.b;
        var1_4 = 2;
        var11_5 = true;
        if (var2_2 != var3_3 * 2 - 1) {
            var14_1 = new StringBuilder("DtvCcPacket ended prematurely; size is ");
            var14_1.append(this.o.b * 2 - 1);
            var14_1.append(", but current index is ");
            var14_1.append(this.o.d);
            var14_1.append(" (sequence number ");
            var14_1.append(this.o.a);
            var14_1.append(");");
            zs0.a((String)"Cea708Decoder", (String)var14_1.toString());
        }
        var16_6 = this.h;
        var14_1 = this.o;
        var15_7 = var14_1.c;
        var16_6.a(var14_1.d, var15_7);
        var4_8 = 0;
        while (this.h.b() > 0) {
            var14_1 = this.h;
            var5_9 = 3;
            var6_10 = var14_1.b(3);
            var7_11 = this.h.b(5);
            var3_3 = 7;
            var2_2 = var6_10;
            if (var6_10 == 7) {
                this.h.d(var1_4);
                var2_2 = var6_10 = this.h.b(6);
                if (var6_10 < 7) {
                    sr0.a((String)"Invalid extended service number: ", (int)var6_10, (String)"Cea708Decoder");
                    var2_2 = var6_10;
                }
            }
            if (var7_11 == 0) {
                if (var2_2 == 0) break;
                var14_1 = new StringBuilder("serviceNumber is non-zero (");
                var14_1.append(var2_2);
                var14_1.append(") when blockSize is 0");
                zs0.d((String)"Cea708Decoder", (String)var14_1.toString());
                break;
            }
            if (var2_2 != this.j) {
                this.h.e(var7_11);
                continue;
            }
            var6_10 = this.h.e();
            var2_2 = var5_9;
            while (this.h.e() < var7_11 * 8 + var6_10) {
                block89: {
                    block114: {
                        block88: {
                            block111: {
                                block113: {
                                    block112: {
                                        block100: {
                                            block101: {
                                                block102: {
                                                    block103: {
                                                        block104: {
                                                            block105: {
                                                                block106: {
                                                                    block107: {
                                                                        block108: {
                                                                            block109: {
                                                                                block110: {
                                                                                    block96: {
                                                                                        block99: {
                                                                                            block98: {
                                                                                                block97: {
                                                                                                    block90: {
                                                                                                        block95: {
                                                                                                            block94: {
                                                                                                                block91: {
                                                                                                                    block92: {
                                                                                                                        block93: {
                                                                                                                            var5_9 = this.h.b(8);
                                                                                                                            if (var5_9 == 16) break block90;
                                                                                                                            if (var5_9 > 31) break block91;
                                                                                                                            if (var5_9 == 0) break block89;
                                                                                                                            if (var5_9 == var2_2) break block92;
                                                                                                                            if (var5_9 == 8) break block93;
                                                                                                                            switch (var5_9) {
                                                                                                                                default: {
                                                                                                                                    if (var5_9 < 17 || var5_9 > 23) break;
                                                                                                                                    sr0.a((String)"Currently unsupported COMMAND_EXT1 Command: ", (int)var5_9, (String)"Cea708Decoder");
                                                                                                                                    this.h.d(8);
                                                                                                                                }
lbl67:

                                                                                                                                case 14: {
                                                                                                                                    break block89;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            if (var5_9 >= 24 && var5_9 <= 31) {
                                                                                                                                sr0.a((String)"Currently unsupported COMMAND_P16 Command: ", (int)var5_9, (String)"Cea708Decoder");
                                                                                                                                this.h.d(16);
                                                                                                                            } else {
                                                                                                                                sr0.a((String)"Invalid C0 command: ", (int)var5_9, (String)"Cea708Decoder");
                                                                                                                            }
                                                                                                                            break block89;
                                                                                                                            {
                                                                                                                                case 13: {
                                                                                                                                    this.l.a('\n');

                                                                                                                                }
                                                                                                                                ** case 12:
                                                                                                                            }
lbl79:

                                                                                                                            for (var5_9 = 0; var5_9 < 8; ++var5_9) {
                                                                                                                                this.k[var5_9].b();
                                                                                                                            }
                                                                                                                            break block89;
                                                                                                                        }
                                                                                                                        var14_1 = this.l;
                                                                                                                        var5_9 = b.b(var14_1).length();
                                                                                                                        if (var5_9 > 0) {
                                                                                                                            b.b(var14_1).delete(var5_9 - 1, var5_9);
                                                                                                                        }
                                                                                                                        break block89;
                                                                                                                    }
                                                                                                                    this.m = this.j();
                                                                                                                    break block89;
                                                                                                                }
                                                                                                                if (var5_9 > 127) break block94;
                                                                                                                if (var5_9 == 127) {
                                                                                                                    this.l.a('\u266b');
                                                                                                                } else {
                                                                                                                    this.l.a((char)(var5_9 & 255));
                                                                                                                }
                                                                                                                break block88;
                                                                                                            }
                                                                                                            if (var5_9 > 159) break block95;
                                                                                                            switch (var5_9) {
                                                                                                                case 142: {
                                                                                                                    break block88;
                                                                                                                }
                                                                                                                default: {
                                                                                                                    sr0.a((String)"Invalid C1 command: ", (int)var5_9, (String)"Cea708Decoder");
                                                                                                                    break block88;
                                                                                                                }
                                                                                                                case 152: 
                                                                                                                case 153: 
                                                                                                                case 154: 
                                                                                                                case 155: 
                                                                                                                case 156: 
                                                                                                                case 157: 
                                                                                                                case 158: 
                                                                                                                case 159: {
                                                                                                                    var4_8 = var5_9 - 152;
                                                                                                                    var14_1 = this.k[var4_8];
                                                                                                                    this.h.d(var1_4);
                                                                                                                    var11_5 = this.h.f();
                                                                                                                    var13_16 = this.h.f();
                                                                                                                    this.h.f();
                                                                                                                    var5_9 = this.h.b(var2_2);
                                                                                                                    var12_15 = this.h.f();
                                                                                                                    var10_14 = this.h.b(var3_3);
                                                                                                                    var9_13 = this.h.b(8);
                                                                                                                    var8_12 = this.h.b(4);
                                                                                                                    var3_3 = this.h.b(4);
                                                                                                                    this.h.d(var1_4);
                                                                                                                    this.h.b(6);
                                                                                                                    this.h.d(var1_4);
                                                                                                                    var2_2 = this.h.b(3);
                                                                                                                    var1_4 = this.h.b(3);
                                                                                                                    b.p(var14_1, (boolean)true);
                                                                                                                    b.q(var14_1, (boolean)var11_5);
                                                                                                                    b.x(var14_1, (boolean)var13_16);
                                                                                                                    b.r(var14_1, (int)var5_9);
                                                                                                                    b.s(var14_1, (boolean)var12_15);
                                                                                                                    b.t(var14_1, (int)var10_14);
                                                                                                                    b.u(var14_1, (int)var9_13);
                                                                                                                    b.v(var14_1, (int)var8_12);
                                                                                                                    var5_9 = b.j(var14_1);
                                                                                                                    if (var5_9 != ++var3_3) {
                                                                                                                        b.w(var14_1, (int)var3_3);
                                                                                                                        while (var13_16 && b.a(var14_1).size() >= b.j(var14_1) || b.a(var14_1).size() >= 15) {
                                                                                                                            b.a(var14_1).remove(0);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    if (var2_2 != 0 && b.l(var14_1) != var2_2) {
                                                                                                                        b.z(var14_1, (int)var2_2);
                                                                                                                        var3_3 = var2_2 - 1;
                                                                                                                        var2_2 = b.J()[var3_3];
                                                                                                                        var11_5 = b.I()[var3_3];
                                                                                                                        var5_9 = b.O()[var3_3];
                                                                                                                        var5_9 = b.H()[var3_3];
                                                                                                                        var3_3 = b.N()[var3_3];
                                                                                                                        b.B(var14_1, (int)var2_2);
                                                                                                                        b.y(var14_1, (int)var3_3);
                                                                                                                    }
                                                                                                                    if (var1_4 != 0 && b.m(var14_1) != var1_4) {
                                                                                                                        b.A(var14_1, (int)var1_4);
                                                                                                                        var2_2 = b.L()[--var1_4];
                                                                                                                        var2_2 = b.K()[var1_4];
                                                                                                                        var14_1.a(false, false);
                                                                                                                        var14_1.a(b.w, b.M()[var1_4]);
                                                                                                                    }
                                                                                                                    if (this.p != var4_8) {
                                                                                                                        this.p = var4_8;
                                                                                                                        this.l = this.k[var4_8];
                                                                                                                    }
lbl162:

                                                                                                                    while (true) {
                                                                                                                        var1_4 = 3;
lbl164:

                                                                                                                        while (true) {
                                                                                                                            var2_2 = var1_4;
lbl166:

                                                                                                                            while (true) {
                                                                                                                                var1_4 = 2;
                                                                                                                                var3_3 = 7;
                                                                                                                                break block88;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                case 151: {
                                                                                                                    if (b.c(this.l)) ** GOTO lbl174
                                                                                                                    this.h.d(32);

lbl174:

                                                                                                                    var1_4 = this.h.b(2);
                                                                                                                    var1_4 = b.a((int)this.h.b(2), (int)this.h.b(2), (int)this.h.b(2), (int)var1_4);
                                                                                                                    this.h.b(2);
                                                                                                                    b.a((int)this.h.b(2), (int)this.h.b(2), (int)this.h.b(2), (int)0);
                                                                                                                    this.h.f();
                                                                                                                    this.h.f();
                                                                                                                    this.h.b(2);
                                                                                                                    this.h.b(2);
                                                                                                                    var2_2 = this.h.b(2);
                                                                                                                    this.h.d(8);
                                                                                                                    var14_1 = this.l;
                                                                                                                    b.B(var14_1, (int)var1_4);
                                                                                                                    b.y(var14_1, (int)var2_2);

                                                                                                                }
                                                                                                                case 146: {
                                                                                                                    if (b.c(this.l)) ** GOTO lbl198
                                                                                                                    this.h.d(16);

lbl198:

                                                                                                                    this.h.d(4);
                                                                                                                    var1_4 = this.h.b(4);
                                                                                                                    this.h.d(2);
                                                                                                                    this.h.b(6);
                                                                                                                    var14_1 = this.l;
                                                                                                                    if (b.o(var14_1) != var1_4) {
                                                                                                                        var14_1.a('\n');
                                                                                                                    }
                                                                                                                    b.G(var14_1, (int)var1_4);

                                                                                                                }
                                                                                                                case 145: {
                                                                                                                    if (b.c(this.l)) ** GOTO lbl212
                                                                                                                    this.h.d(24);

lbl212:

                                                                                                                    var1_4 = this.h.b(2);
                                                                                                                    var1_4 = b.a((int)this.h.b(2), (int)this.h.b(2), (int)this.h.b(2), (int)var1_4);
                                                                                                                    var2_2 = this.h.b(2);
                                                                                                                    var2_2 = b.a((int)this.h.b(2), (int)this.h.b(2), (int)this.h.b(2), (int)var2_2);
                                                                                                                    this.h.d(2);
                                                                                                                    b.a((int)this.h.b(2), (int)this.h.b(2), (int)this.h.b(2), (int)0);
                                                                                                                    this.l.a(var1_4, var2_2);

                                                                                                                }
                                                                                                                case 144: {
                                                                                                                    if (!b.c(this.l)) {
                                                                                                                        this.h.d(16);

                                                                                                                    }
                                                                                                                    this.h.b(4);
                                                                                                                    this.h.b(2);
                                                                                                                    this.h.b(2);
                                                                                                                    var12_15 = this.h.f();
                                                                                                                    var11_5 = this.h.f();
                                                                                                                    var14_1 = this.h;
                                                                                                                    var1_4 = 3;
                                                                                                                    var14_1.b(3);
                                                                                                                    this.h.b(3);
                                                                                                                    this.l.a(var12_15, var11_5);

                                                                                                                }
                                                                                                                case 143: {
                                                                                                                    var3_3 = 0;
                                                                                                                    while (true) {
                                                                                                                        var1_4 = var2_2;
                                                                                                                        if (var3_3 >= 8) ** GOTO lbl164
                                                                                                                        this.k[var3_3].b();
                                                                                                                        ++var3_3;
                                                                                                                    }
                                                                                                                }
                                                                                                                case 141: {
                                                                                                                    this.h.d(8);
                                                                                                                    var1_4 = var2_2;

                                                                                                                }
                                                                                                                case 140: {
                                                                                                                    var3_3 = 1;
                                                                                                                    while (true) {
                                                                                                                        var1_4 = var2_2;
                                                                                                                        if (var3_3 > 8) ** GOTO lbl164
                                                                                                                        if (this.h.f()) {
                                                                                                                            this.k[8 - var3_3].b();
                                                                                                                        }
                                                                                                                        ++var3_3;
                                                                                                                    }
                                                                                                                }
                                                                                                                case 139: {
                                                                                                                    var3_3 = 1;
                                                                                                                    while (true) {
                                                                                                                        var1_4 = var2_2;
                                                                                                                        if (var3_3 > 8) ** GOTO lbl164
                                                                                                                        if (this.h.f()) {
                                                                                                                            var14_1 = this.k[8 - var3_3];
                                                                                                                            b.q(var14_1, (boolean)(b.d(var14_1) ^ true));
                                                                                                                        }
                                                                                                                        ++var3_3;
                                                                                                                    }
                                                                                                                }
                                                                                                                case 138: {
                                                                                                                    var3_3 = 1;
                                                                                                                    while (true) {
                                                                                                                        var1_4 = var2_2;
                                                                                                                        if (var3_3 > 8) ** GOTO lbl164
                                                                                                                        if (this.h.f()) {
                                                                                                                            b.q(this.k[8 - var3_3], (boolean)false);
                                                                                                                        }
                                                                                                                        ++var3_3;
                                                                                                                    }
                                                                                                                }
                                                                                                                case 137: {
                                                                                                                    var3_3 = 1;
                                                                                                                    while (true) {
                                                                                                                        var1_4 = var2_2;
                                                                                                                        if (var3_3 <= 8) ** break;

                                                                                                                        if (this.h.f()) {
                                                                                                                            b.q(this.k[8 - var3_3], (boolean)true);
                                                                                                                        }
                                                                                                                        ++var3_3;
                                                                                                                    }
                                                                                                                }
                                                                                                                case 136: {
                                                                                                                    var1_4 = 1;
                                                                                                                    while (true) {
                                                                                                                        if (var1_4 > 8) ** GOTO lbl166
                                                                                                                        if (this.h.f()) {
                                                                                                                            var14_1 = this.k[8 - var1_4];
                                                                                                                            b.a(var14_1).clear();
                                                                                                                            b.b(var14_1).clear();
                                                                                                                            b.C(var14_1, (int)-1);
                                                                                                                            b.D(var14_1, (int)-1);
                                                                                                                            b.E(var14_1, (int)-1);
                                                                                                                            b.F(var14_1, (int)-1);
                                                                                                                            b.G(var14_1, (int)0);
                                                                                                                        }
                                                                                                                        ++var1_4;
                                                                                                                    }
                                                                                                                }
                                                                                                                case 128: 
                                                                                                                case 129: 
                                                                                                                case 130: 
                                                                                                                case 131: 
                                                                                                                case 132: 
                                                                                                                case 133: 
                                                                                                                case 134: 
                                                                                                                case 135: {
                                                                                                                    var1_4 = var5_9 - 128;
                                                                                                                    if (this.p == var1_4) ** GOTO lbl166
                                                                                                                    this.p = var1_4;
                                                                                                                    this.l = this.k[var1_4];
                                                                                                                    break;
                                                                                                                }
                                                                                                            }

                                                                                                        }
                                                                                                        if (var5_9 <= 255) {
                                                                                                            this.l.a((char)(var5_9 & 255));

                                                                                                        }
                                                                                                        sr0.a((String)"Invalid base command: ", (int)var5_9, (String)"Cea708Decoder");
                                                                                                        var1_4 = 2;
                                                                                                        var3_3 = 7;
                                                                                                        break block89;
                                                                                                    }
                                                                                                    var5_9 = this.h.b(8);
                                                                                                    if (var5_9 > 31) break block96;
                                                                                                    if (var5_9 > 7) break block97;
lbl325:

                                                                                                    while (true) {
                                                                                                        var3_3 = 7;
                                                                                                        var1_4 = 2;
                                                                                                        break block89;
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                if (var5_9 > 15) break block98;
                                                                                                this.h.d(8);

                                                                                            }
                                                                                            if (var5_9 > 23) break block99;
                                                                                            this.h.d(16);

                                                                                        }
                                                                                        if (var5_9 > 31) ** GOTO lbl325
                                                                                        this.h.d(24);

                                                                                    }
                                                                                    var3_3 = 7;
                                                                                    if (var5_9 > 127) break block100;
                                                                                    if (var5_9 == 32) break block101;
                                                                                    if (var5_9 == 33) break block102;
                                                                                    if (var5_9 == 37) break block103;
                                                                                    if (var5_9 == 42) break block104;
                                                                                    if (var5_9 == 44) break block105;
                                                                                    if (var5_9 == 63) break block106;
                                                                                    if (var5_9 == 57) break block107;
                                                                                    if (var5_9 == 58) break block108;
                                                                                    if (var5_9 == 60) break block109;
                                                                                    if (var5_9 == 61) break block110;
                                                                                    block21 : switch (var5_9) {
                                                                                        default: {
                                                                                            switch (var5_9) {
                                                                                                default: {
                                                                                                    sr0.a((String)"Invalid G2 character: ", (int)var5_9, (String)"Cea708Decoder");
                                                                                                }
lbl359:

                                                                                                while (true) {
                                                                                                    var1_4 = 2;
                                                                                                    break block88;
                                                                                                    break;
                                                                                                }
                                                                                                case 127: {
                                                                                                    this.l.a('\u250c');
                                                                                                    break block21;
                                                                                                }
                                                                                                case 126: {
                                                                                                    this.l.a('\u2518');
                                                                                                    break block21;
                                                                                                }
                                                                                                case 125: {
                                                                                                    this.l.a('\u2500');
                                                                                                    break block21;
                                                                                                }
                                                                                                case 124: {
                                                                                                    this.l.a('\u2514');
                                                                                                    break block21;
                                                                                                }
                                                                                                case 123: {
                                                                                                    this.l.a('\u2510');
                                                                                                    break block21;
                                                                                                }
                                                                                                case 122: {
                                                                                                    this.l.a('\u2502');
                                                                                                    break block21;
                                                                                                }
                                                                                                case 121: {
                                                                                                    this.l.a('\u215e');
                                                                                                    break block21;
                                                                                                }
                                                                                                case 120: {
                                                                                                    this.l.a('\u215d');
                                                                                                    break block21;
                                                                                                }
                                                                                                case 119: {
                                                                                                    this.l.a('\u215c');
                                                                                                    break block21;
                                                                                                }
                                                                                                case 118: 
                                                                                            }
                                                                                            this.l.a('\u215b');
                                                                                            break;
                                                                                        }
                                                                                        case 53: {
                                                                                            this.l.a('\u2022');
                                                                                            break;
                                                                                        }
                                                                                        case 52: {
                                                                                            this.l.a('\u201d');
                                                                                            break;
                                                                                        }
                                                                                        case 51: {
                                                                                            this.l.a('\u201c');
                                                                                            break;
                                                                                        }
                                                                                        case 50: {
                                                                                            this.l.a('\u2019');
                                                                                            break;
                                                                                        }
                                                                                        case 49: {
                                                                                            this.l.a('\u2018');
                                                                                            break;
                                                                                        }
                                                                                        case 48: {
                                                                                            this.l.a('\u2588');
                                                                                            break;
                                                                                        }
                                                                                    }

                                                                                }
                                                                                this.l.a('\u2120');

                                                                            }
                                                                            this.l.a('\u0153');

                                                                        }
                                                                        this.l.a('\u0161');

                                                                    }
                                                                    this.l.a('\u2122');

                                                                }
                                                                this.l.a('\u0178');

                                                            }
                                                            this.l.a('\u0152');

                                                        }
                                                        this.l.a('\u0160');

                                                    }
                                                    this.l.a('\u2026');

                                                }
                                                this.l.a('\u00a0');

                                            }
                                            this.l.a(' ');

                                        }
                                        if (var5_9 > 159) break block111;
                                        if (var5_9 > 135) break block112;
                                        this.h.d(32);

                                    }
                                    if (var5_9 > 143) break block113;
                                    this.h.d(40);

                                }
                                if (var5_9 <= 159) ** break;

                                var14_1 = this.h;
                                var1_4 = 2;
                                var14_1.d(2);
                                var5_9 = this.h.b(6);
                                this.h.d(var5_9 * 8);
                                break block89;
                            }
                            var1_4 = 2;
                            if (var5_9 > 255) break block114;
                            if (var5_9 == 160) {
                                this.l.a('\u33c4');
                            } else {
                                sr0.a((String)"Invalid G3 character: ", (int)var5_9, (String)"Cea708Decoder");
                                this.l.a('_');
                            }
                        }
                        var4_8 = 1;
                        var11_5 = true;
                        continue;
                    }
                    sr0.a((String)"Invalid extended command: ", (int)var5_9, (String)"Cea708Decoder");
                }
                var11_5 = true;
            }
        }
        if (var4_8 != 0) {
            this.m = this.j();
        }
        this.o = null;
    }

    private List<wu> j() {
        int n10;
        Object object;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        int n13 = 0;
        for (int i14 = 0; i14 < 8; ++i14) {
            block11: {
                block6: {
                    float f11;
                    float f12;
                    SpannableStringBuilder spannableStringBuilder;
                    b b10;
                    block10: {
                        block7: {
                            block8: {
                                block9: {
                                    object = this.k[i14];
                                    if (!b.c(object) || b.a(object).isEmpty() && b.b(object).length() == 0 || !b.d(b10 = this.k[i14])) continue;
                                    if (!b.c(b10) || b.a(b10).isEmpty() && b.b(b10).length() == 0) break block6;
                                    spannableStringBuilder = new SpannableStringBuilder();
                                    for (n10 = 0; n10 < b.a(b10).size(); ++n10) {
                                        spannableStringBuilder.append((CharSequence)b.a(b10).get(n10));
                                        spannableStringBuilder.append('\n');
                                    }
                                    spannableStringBuilder.append((CharSequence)b10.a());
                                    n10 = b.k(b10);
                                    if (n10 == 0) break block7;
                                    if (n10 == 1) break block8;
                                    if (n10 == 2) break block9;
                                    if (n10 != 3) {
                                        object = new StringBuilder("Unexpected justification value: ");
                                        ((StringBuilder)object).append(b.k(b10));
                                        throw new IllegalArgumentException(((StringBuilder)object).toString());
                                    }
                                    break block7;
                                }
                                object = Layout.Alignment.ALIGN_CENTER;
                                break block10;
                            }
                            object = Layout.Alignment.ALIGN_OPPOSITE;
                            break block10;
                        }
                        object = Layout.Alignment.ALIGN_NORMAL;
                    }
                    if (b.f(b10)) {
                        f12 = (float)b.h(b10) / 99.0f;
                        f11 = (float)b.g(b10) / 99.0f;
                    } else {
                        f12 = (float)b.h(b10) / 209.0f;
                        f11 = (float)b.g(b10) / 74.0f;
                    }
                    int n14 = b.i(b10);
                    n10 = n14 / 3;
                    n10 = n10 == 0 ? 0 : (n10 == 1 ? 1 : 2);
                    n14 = (n14 %= 3) == 0 ? 0 : (n14 == 1 ? 1 : 2);
                    boolean bl2 = b.n(b10) != b.x;
                    object = new /* Unavailable Anonymous Inner Class!! */;
                    break block11;
                }
                object = null;
            }
            if (object == null) continue;
            arrayList.add(object);
        }
        Collections.sort(arrayList, a.c());
        object = new ArrayList(arrayList.size());
        for (n10 = n13; n10 < arrayList.size(); ++n10) {
            ((ArrayList)object).add((arrayList.get((int)n10)).a);
        }
        return Collections.unmodifiableList(object);
    }

    @Override
    protected final void b(u32 object) {
        object = ((jy)((Object)object)).d;
        object.getClass();
        Object object2 = ((ByteBuffer)object).array();
        this.g.a(((Buffer)object).limit(), object2);
        while (this.g.a() >= 3) {
            block10: {
                block9: {
                    byte by;
                    byte by3;
                    int n10;
                    int n13;
                    block8: {
                        n13 = this.g.t();
                        n10 = n13 & 3;
                        n13 = (n13 & 4) == 4 ? 1 : 0;
                        by3 = (byte)this.g.t();
                        by = (byte)this.g.t();
                        if (n10 != 2 && n10 != 3 || n13 == 0) continue;
                        if (n10 != 3) break block8;
                        this.i();
                        int n14 = (by3 & 0xC0) >> 6;
                        n13 = this.i;
                        if (n13 != -1 && n14 != (n13 + 1) % 4) {
                            for (n13 = 0; n13 < 8; ++n13) {
                                this.k[n13].b();
                            }
                            object = new StringBuilder("Sequence number discontinuity. previous=");
                            ((StringBuilder)object).append(this.i);
                            ((StringBuilder)object).append(" current=");
                            ((StringBuilder)object).append(n14);
                            zs0.d((String)"Cea708Decoder", (String)((StringBuilder)object).toString());
                        }
                        this.i = n14;
                        n13 = n10 = by3 & 0x3F;
                        if (n10 == 0) {
                            n13 = 64;
                        }
                        object = new /* Unavailable Anonymous Inner Class!! */;
                        this.o = object;
                        object2 = object.c;
                        object.d = 1;
                        object2[0] = by;
                        break block9;
                    }
                    if (n10 != 2) break block10;
                    object2 = this.o;
                    if (object2 == null) {
                        zs0.b((String)"Cea708Decoder", (String)"Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        continue;
                    }
                    object = object2.c;
                    n13 = object2.d;
                    object[n13] = (u32)by3;
                    object2.d = n13 + 2;
                    object[n13 + 1] = (u32)by;
                }
                object = this.o;
                if (object.d != object.b * 2 - 1) continue;
                this.i();
                continue;
            }
            throw new IllegalArgumentException();
        }
    }

    @Override
    protected final q32 c() {
        List<wu> list = this.m;
        this.n = list;
        list.getClass();
        return new nn(list);
    }

    @Override
    public final void flush() {
        super.flush();
        this.m = null;
        this.n = null;
        this.p = 0;
        this.l = this.k[0];
        for (int i14 = 0; i14 < 8; ++i14) {
            this.k[i14].b();
        }
        this.o = null;
    }

    @Override
    protected final boolean h() {
        boolean bl2 = this.m != this.n;
        return bl2;
    }
}

