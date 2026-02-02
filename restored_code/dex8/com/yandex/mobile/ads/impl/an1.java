/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.bn1
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.nq2
 *  com.yandex.mobile.ads.impl.s52
 *  com.yandex.mobile.ads.impl.uk
 *  com.yandex.mobile.ads.impl.uk$d
 *  com.yandex.mobile.ads.impl.uk$e
 *  com.yandex.mobile.ads.impl.uk$f
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.bn1;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.nq2;
import com.yandex.mobile.ads.impl.oz;
import com.yandex.mobile.ads.impl.s52;
import com.yandex.mobile.ads.impl.uk;
import java.io.IOException;

final class an1
extends uk {
    public an1(s52 s522, long l10, long l11) {
        super((uk.d)new uk.b(), (uk.f)new a(s522, null), l10, l10 + 1L, 0L, l11, 188L, 1000);
    }

    private static int a(int n10, byte[] byArray) {
        byte by = byArray[n10];
        byte by2 = byArray[n10 + 1];
        byte by3 = byArray[n10 + 2];
        return byArray[n10 + 3] & 0xFF | ((by & 0xFF) << 24 | (by2 & 0xFF) << 16 | (by3 & 0xFF) << 8);
    }

    private static final class a
    implements uk.f {
        private final s52 a;
        private final bg1 b;

        private a(s52 s522) {
            this.a = s522;
            this.b = new bg1();
        }

        /* synthetic */ a(s52 s522, nq2 nq22) {
            this(s522);
        }

        /*
         * Enabled aggressive block sorting
         */
        public final uk.e a(oz oz3, long l10) throws IOException {
            long l11 = oz3.a();
            int n10 = (int)Math.min(20000L, oz3.b() - l11);
            this.b.c(n10);
            oz3.b(this.b.c(), 0, n10, false);
            oz3 = this.b;
            int n12 = -1;
            int n13 = -1;
            long l13 = -9223372036854775807L;
            while (true) {
                long l14;
                block9: {
                    byte[] byArray;
                    block12: {
                        block7: {
                            block13: {
                                block11: {
                                    block10: {
                                        block8: {
                                            if (oz3.a() < 4) break block7;
                                            byArray = oz3.c();
                                            if (an1.a(oz3.d(), byArray) != 442) {
                                                oz3.f(1);
                                                continue;
                                            }
                                            oz3.f(4);
                                            long l15 = bn1.a((bg1)oz3);
                                            n10 = n13;
                                            l14 = l13;
                                            if (l15 != -9223372036854775807L) {
                                                l14 = this.a.b(l15);
                                                if (l14 > l10) {
                                                    if (l13 != -9223372036854775807L) return uk.e.a((long)(l11 + (long)n13));
                                                    return uk.e.a((long)l14, (long)l11);
                                                }
                                                if (100000L + l14 > l10) {
                                                    return uk.e.a((long)(l11 + (long)oz3.d()));
                                                }
                                                n10 = oz3.d();
                                            }
                                            n13 = oz3.e();
                                            if (oz3.a() >= 10) break block8;
                                            oz3.e(n13);
                                            break block9;
                                        }
                                        oz3.f(9);
                                        n12 = oz3.t() & 7;
                                        if (oz3.a() >= n12) break block10;
                                        oz3.e(n13);
                                        break block9;
                                    }
                                    oz3.f(n12);
                                    if (oz3.a() >= 4) break block11;
                                    oz3.e(n13);
                                    break block9;
                                }
                                byArray = oz3.c();
                                if (an1.a(oz3.d(), byArray) != 443) break block12;
                                oz3.f(4);
                                n12 = oz3.z();
                                if (oz3.a() >= n12) break block13;
                                oz3.e(n13);
                                break block9;
                            }
                            oz3.f(n12);
                            break block12;
                        }
                        if (l13 == -9223372036854775807L) return uk.e.d;
                        return uk.e.b((long)l13, (long)(l11 + (long)n12));
                    }
                    while (oz3.a() >= 4) {
                        byArray = oz3.c();
                        n12 = an1.a(oz3.d(), byArray);
                        if (n12 == 442 || n12 == 441 || n12 >>> 8 != 1) break;
                        oz3.f(4);
                        if (oz3.a() < 2) {
                            oz3.e(n13);
                            break;
                        }
                        n12 = oz3.z();
                        oz3.e(Math.min(oz3.e(), oz3.d() + n12));
                    }
                }
                n12 = oz3.d();
                n13 = n10;
                l13 = l14;
            }
        }

        public final void a() {
            this.b.a(m92.f);
        }
    }
}

