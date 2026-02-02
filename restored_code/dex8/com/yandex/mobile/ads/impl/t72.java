/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.s52
 *  com.yandex.mobile.ads.impl.uk
 *  com.yandex.mobile.ads.impl.uk$d
 *  com.yandex.mobile.ads.impl.uk$e
 *  com.yandex.mobile.ads.impl.uk$f
 *  com.yandex.mobile.ads.impl.x72
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.oz;
import com.yandex.mobile.ads.impl.s52;
import com.yandex.mobile.ads.impl.uk;
import com.yandex.mobile.ads.impl.x72;
import java.io.IOException;

final class t72
extends uk {
    public t72(s52 s522, long l10, long l11, int n10, int n13) {
        super((uk.d)new uk.b(), (uk.f)new a(n10, s522, n13), l10, l10 + 1L, 0L, l11, 188L, 940);
    }

    private static final class a
    implements uk.f {
        private final s52 a;
        private final bg1 b;
        private final int c;
        private final int d;

        public a(int n10, s52 s522, int n13) {
            this.c = n10;
            this.a = s522;
            this.d = n13;
            this.b = new bg1();
        }

        public final uk.e a(oz object, long l10) throws IOException {
            block5: {
                long l11 = ((oz)object).a();
                int n10 = (int)Math.min((long)this.d, ((oz)object).b() - l11);
                this.b.c(n10);
                ((oz)object).b(this.b.c(), 0, n10, false);
                bg1 bg12 = this.b;
                int n13 = bg12.e();
                long l13 = -1L;
                long l14 = -1L;
                long l15 = -9223372036854775807L;
                while (bg12.a() >= 188) {
                    object = bg12.c();
                    for (n10 = bg12.d(); n10 < n13 && object[n10] != 71; ++n10) {
                    }
                    int n14 = n10 + 188;
                    if (n14 > n13) break;
                    l13 = x72.a((int)n10, (int)this.c, (bg1)bg12);
                    long l16 = l14;
                    long l17 = l15;
                    if (l13 != -9223372036854775807L) {
                        l17 = this.a.b(l13);
                        if (l17 > l10) {
                            object = l15 == -9223372036854775807L ? uk.e.a((long)l17, (long)l11) : uk.e.a((long)(l11 + l14));
                            break block5;
                        }
                        if (100000L + l17 > l10) {
                            object = uk.e.a((long)(l11 + (long)n10));
                            break block5;
                        }
                        l16 = n10;
                    }
                    bg12.e(n14);
                    l13 = n14;
                    l14 = l16;
                    l15 = l17;
                }
                object = l15 != -9223372036854775807L ? uk.e.b((long)l15, (long)(l11 + l13)) : uk.e.d;
            }
            return object;
        }

        public final void a() {
            this.b.a(m92.f);
        }
    }
}

