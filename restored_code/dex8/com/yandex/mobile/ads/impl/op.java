/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.p52
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.p52;

public final class op
implements p52 {
    private long a;
    private long b;

    public final long a() {
        return this.a;
    }

    public final void a(long l10, long l11) {
        this.b = l11;
    }

    public final void b() {
        this.a += this.b;
        this.b = 0L;
    }
}

