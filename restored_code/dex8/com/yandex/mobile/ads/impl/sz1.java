/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.co0
 *  com.yandex.mobile.ads.impl.nd2
 *  com.yandex.mobile.ads.impl.rz1
 *  com.yandex.mobile.ads.impl.zd2
 *  com.yandex.mobile.ads.impl.zm0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.co0;
import com.yandex.mobile.ads.impl.nd2;
import com.yandex.mobile.ads.impl.rz1;
import com.yandex.mobile.ads.impl.zd2;
import com.yandex.mobile.ads.impl.zm0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class sz1
implements nd2 {
    @NotNull
    private final rz1 a;
    @Nullable
    private final zd2 b;
    private boolean c;

    public sz1(@NotNull rz1 rz12, @Nullable zd2 zd22) {
        this.a = rz12;
        this.b = zd22;
    }

    public /* synthetic */ sz1(zm0 zm02, co0 co02) {
        this(new rz1(zm02), co02.h());
    }

    public final void a(long l10, long l11) {
        zd2 zd22;
        if (!this.c && (zd22 = this.b) != null) {
            if (l11 >= zd22.a()) {
                this.a.a();
                this.c = true;
            } else {
                this.a.a(this.b.a(), l11);
            }
        }
    }
}

