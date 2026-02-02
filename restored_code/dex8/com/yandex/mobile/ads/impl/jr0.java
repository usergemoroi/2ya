/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.dm
 *  com.yandex.mobile.ads.impl.pw2
 *  com.yandex.mobile.ads.impl.qm
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dm;
import com.yandex.mobile.ads.impl.km;
import com.yandex.mobile.ads.impl.pw2;
import com.yandex.mobile.ads.impl.qm;
import java.util.TreeSet;

public final class jr0
implements km {
    private final long a;
    private final TreeSet<qm> b;
    private long c;

    public jr0(long l10) {
        this.a = l10;
        this.b = new TreeSet(new pw2());
    }

    private static int a(qm qm3, qm qm4) {
        long l10 = qm3.g;
        long l11 = qm4.g;
        int n10 = 1;
        int n13 = 1;
        if (l10 - l11 == 0L) {
            if (!qm3.b.equals(qm4.b)) {
                n13 = qm3.b.compareTo(qm4.b);
            } else {
                long l13 = qm3.c - qm4.c - 0L;
                n10 = l13 == 0L ? 0 : (l13 < 0L ? -1 : 1);
                if (n10 == 0) {
                    n13 = 0;
                } else if (n10 < 0) {
                    n13 = -1;
                }
            }
            return n13;
        }
        n13 = n10;
        if (l10 < l11) {
            n13 = -1;
        }
        return n13;
    }

    public static /* synthetic */ int b(qm qm3, qm qm4) {
        return jr0.a(qm3, qm4);
    }

    @Override
    public final void a(dm dm3, long l10) {
        if (l10 != -1L) {
            while (this.c + l10 > this.a && !this.b.isEmpty()) {
                dm3.a(this.b.first());
            }
        }
    }

    public final void a(dm dm3, qm qm3) {
        this.b.add(qm3);
        this.c += qm3.d;
        while (this.c > this.a && !this.b.isEmpty()) {
            dm3.a(this.b.first());
        }
    }

    public final void a(dm dm3, qm qm3, qm qm4) {
        this.a(qm3);
        this.a(dm3, qm4);
    }

    public final void a(qm qm3) {
        this.b.remove(qm3);
        this.c -= qm3.d;
    }
}

