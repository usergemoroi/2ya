/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ou0
 *  com.yandex.mobile.ads.impl.ou0$a
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ou0;
import org.jetbrains.annotations.NotNull;

public final class sq
implements ou0 {
    @NotNull
    private final ou0.a a = new ou0.a();
    @NotNull
    private final ou0[] b;

    public sq(ou0 ... ou0Array) {
        this.b = ou0Array;
    }

    @NotNull
    public final ou0.a a(int n10, int n13) {
        ou0.a a14;
        ou0[] ou0Array = this.b;
        int n14 = ou0Array.length;
        int n15 = 0;
        int n16 = n10;
        for (n10 = n15; n10 < n14; ++n10) {
            a14 = ou0Array[n10].a(n16, n13);
            n16 = a14.a;
            n13 = a14.b;
        }
        a14 = this.a;
        a14.a = n16;
        a14.b = n13;
        return a14;
    }
}

