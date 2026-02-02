/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.b92
 *  com.yandex.mobile.ads.impl.i42
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.xp1
 *  com.yandex.mobile.ads.impl.z82
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.b92;
import com.yandex.mobile.ads.impl.i42;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.xp1;
import com.yandex.mobile.ads.impl.z82;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

public final class gk1
implements b92 {
    @NotNull
    private final xp1 a;
    @NotNull
    private final i42 b;
    @NotNull
    private final z82 c;
    private String d;

    public gk1(@NotNull xp1 xp12, @NotNull i42 i422, @NotNull z82 z822) {
        this.a = xp12;
        this.b = i422;
        this.c = z822;
    }

    public final void a(@NotNull String string2) {
        String string3 = this.c.a(string2);
        if (string2.length() != 0) {
            string2 = string3;
        }
        this.d = string2;
        Object var4_3 = null;
        string3 = string2;
        if (string2 == null) {
            y.B("targetUrl");
            string3 = null;
        }
        if (string3.length() == 0) {
            int n10 = op0.b;
        } else {
            string3 = this.b;
            xp1 xp12 = this.a;
            string2 = this.d;
            if (string2 == null) {
                y.B("targetUrl");
                string2 = var4_3;
            }
            string3.a(xp12, string2);
        }
    }
}

