/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.de1
 *  com.yandex.mobile.ads.impl.fh0
 *  com.yandex.mobile.ads.impl.lv$a
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.de1;
import com.yandex.mobile.ads.impl.fh0;
import com.yandex.mobile.ads.impl.fv1;
import com.yandex.mobile.ads.impl.ge1;
import com.yandex.mobile.ads.impl.lv;
import com.yandex.mobile.ads.impl.tj;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class iv1
implements lv.a {
    @NotNull
    private final String a;
    @Nullable
    private final SSLSocketFactory b;
    private final boolean c;

    public iv1(@NotNull String string2, @Nullable SSLSocketFactory sSLSocketFactory, boolean bl2) {
        this.a = string2;
        this.b = sSLSocketFactory;
        this.c = bl2;
    }

    @NotNull
    public final lv a() {
        tj tj2;
        if (this.c) {
            int n10 = de1.c;
            tj2 = new ge1(de1.a((int)8000, (int)8000, (SSLSocketFactory)this.b), this.a, new fh0());
        } else {
            tj2 = new fv1(this.a, new fh0(), this.b);
        }
        return tj2;
    }
}

