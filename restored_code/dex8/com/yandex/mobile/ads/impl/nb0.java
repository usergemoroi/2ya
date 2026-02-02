/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.e13
 *  com.yandex.mobile.ads.impl.l53
 *  com.yandex.mobile.ads.impl.pb0
 *  com.yandex.mobile.ads.impl.pb0$a
 *  com.yandex.mobile.ads.impl.tb0
 *  com.yandex.mobile.ads.impl.uk
 *  com.yandex.mobile.ads.impl.uk$d
 *  com.yandex.mobile.ads.impl.uk$e
 *  com.yandex.mobile.ads.impl.uk$f
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.d13;
import com.yandex.mobile.ads.impl.e13;
import com.yandex.mobile.ads.impl.l53;
import com.yandex.mobile.ads.impl.oz;
import com.yandex.mobile.ads.impl.pb0;
import com.yandex.mobile.ads.impl.tb0;
import com.yandex.mobile.ads.impl.uk;
import java.io.IOException;
import java.util.Objects;

final class nb0
extends uk {
    public nb0(tb0 tb02, int n10, long l10, long l11) {
        Objects.requireNonNull(tb02);
        super((uk.d)new d13(tb02), (uk.f)new a(n10, tb02, null), tb02.b(), tb02.j, l10, l11, tb02.a(), Math.max(6, tb02.c));
    }

    private static final class a
    implements uk.f {
        private final tb0 a;
        private final int b;
        private final pb0.a c;

        private a(int n10, tb0 tb02) {
            this.a = tb02;
            this.b = n10;
            this.c = new pb0.a();
        }

        /* synthetic */ a(int n10, tb0 tb02, e13 e132) {
            this(n10, tb02);
        }

        private long a(oz oz3) throws IOException {
            while (oz3.d() < oz3.b() - 6L) {
                tb0 tb02 = this.a;
                int n10 = this.b;
                pb0.a a14 = this.c;
                long l10 = oz3.d();
                byte[] byArray = new byte[2];
                oz3.b(byArray, 0, 2, false);
                if (((byArray[0] & 0xFF) << 8 | byArray[1] & 0xFF) != n10) {
                    oz3.c();
                    oz3.a(false, (int)(l10 - oz3.a()));
                } else {
                    int n13;
                    int n14;
                    bg1 bg12 = new bg1(16);
                    System.arraycopy(byArray, 0, bg12.c(), 0, 2);
                    byArray = bg12.c();
                    for (n13 = 0; n13 < 14 && (n14 = oz3.c(byArray, 2 + n13, 14 - n13)) != -1; n13 += n14) {
                    }
                    bg12.d(n13);
                    oz3.c();
                    oz3.a(false, (int)(l10 - oz3.a()));
                    if (pb0.a((bg1)bg12, (tb0)tb02, (int)n10, (pb0.a)a14)) break;
                }
                oz3.a(false, 1);
            }
            if (oz3.d() >= oz3.b() - 6L) {
                oz3.a(false, (int)(oz3.b() - oz3.d()));
                return this.a.j;
            }
            return this.c.a;
        }

        public final uk.e a(oz oz3, long l10) throws IOException {
            long l11 = oz3.a();
            long l13 = this.a(oz3);
            long l14 = oz3.d();
            oz3.a(false, Math.max(6, this.a.c));
            long l15 = this.a(oz3);
            long l16 = oz3.d();
            if (l13 <= l10 && l15 > l10) {
                return uk.e.a((long)l14);
            }
            if (l15 <= l10) {
                return uk.e.b((long)l15, (long)l16);
            }
            return uk.e.a((long)l13, (long)l11);
        }

        public /* synthetic */ void a() {
            l53.a((uk.f)this);
        }
    }
}

