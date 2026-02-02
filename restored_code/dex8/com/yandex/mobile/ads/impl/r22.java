/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.uf
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ec0;
import com.yandex.mobile.ads.impl.oz;
import com.yandex.mobile.ads.impl.uf;

final class r22
extends ec0 {
    private final long b;

    public r22(oz oz3, long l10) {
        super(oz3);
        boolean bl2 = oz3.a() >= l10;
        uf.a((boolean)bl2);
        this.b = l10;
    }

    @Override
    public final long a() {
        return super.a() - this.b;
    }

    @Override
    public final long b() {
        return super.b() - this.b;
    }

    @Override
    public final long d() {
        return super.d() - this.b;
    }
}

