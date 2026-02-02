/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.ex1
 *  com.yandex.mobile.ads.impl.qj1
 *  com.yandex.mobile.ads.impl.t70
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.w72$d
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.d23;
import com.yandex.mobile.ads.impl.ex1;
import com.yandex.mobile.ads.impl.oz;
import com.yandex.mobile.ads.impl.qj1;
import com.yandex.mobile.ads.impl.r;
import com.yandex.mobile.ads.impl.t70;
import com.yandex.mobile.ads.impl.u70;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.w72;
import java.io.IOException;

public final class q
implements t70 {
    private final r a = new r();
    private final bg1 b = new bg1(16384);
    private boolean c;

    static {
        new d23();
    }

    private static /* synthetic */ t70[] a() {
        return new t70[]{new q()};
    }

    public static /* synthetic */ t70[] b() {
        return q.a();
    }

    public final int a(u70 u702, qj1 object) throws IOException {
        object = this.b.c();
        int n10 = ((oz)u702).read((byte[])object, 0, 16384);
        if (n10 == -1) {
            return -1;
        }
        this.b.e(0);
        this.b.d(n10);
        if (!this.c) {
            this.a.a(4, 0L);
            this.c = true;
        }
        this.a.a(this.b);
        return 0;
    }

    public final void a(long l10, long l11) {
        this.c = false;
        this.a.a();
    }

    public final void a(v70 v702) {
        this.a.a(v702, new w72.d(Integer.MIN_VALUE, 0, 1));
        v702.a();
        v702.a((ex1)new ex1.b(-9223372036854775807L, 0L));
    }

    public final boolean a(u70 object) throws IOException {
        bg1 bg12 = new bg1(10);
        int n10 = 0;
        while (true) {
            int n13;
            byte[] byArray = bg12.c();
            oz oz3 = (oz)object;
            oz3.b(byArray, 0, 10, false);
            bg12.e(0);
            if (bg12.w() != 0x494433) {
                oz3.c();
                oz3.a(false, n10);
                n13 = 0;
                int n14 = n10;
                while (true) {
                    object = bg12.c();
                    int n15 = 7;
                    oz3.b((byte[])object, 0, 7, false);
                    bg12.e(0);
                    int n16 = bg12.z();
                    if (n16 != 44096 && n16 != 44097) {
                        oz3.c();
                        if (++n14 - n10 >= 8192) {
                            return false;
                        }
                        oz3.a(false, n14);
                        n13 = 0;
                        continue;
                    }
                    int n17 = n13 + 1;
                    if (n17 >= 4) {
                        return true;
                    }
                    object = bg12.c();
                    if (((Object)object).length < 7) {
                        n13 = -1;
                    } else {
                        int n18;
                        n13 = (object[2] & 0xFF) << 8 | object[3] & 0xFF;
                        if (n13 == 65535) {
                            n18 = (object[4] & 0xFF) << 16 | (object[5] & 0xFF) << 8 | object[6] & 0xFF;
                            n13 = n15;
                            n15 = n18;
                        } else {
                            n18 = 4;
                            n15 = n13;
                            n13 = n18;
                        }
                        n18 = n13;
                        if (n16 == 44097) {
                            n18 = n13 + 2;
                        }
                        n13 = n15 + n18;
                    }
                    if (n13 == -1) {
                        return false;
                    }
                    oz3.a(false, n13 - 7);
                    n13 = n17;
                }
            }
            bg12.f(3);
            n13 = bg12.s();
            n10 += n13 + 10;
            oz3.a(false, n13);
        }
    }

    public final void release() {
    }
}

