/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.q32
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ky;
import com.yandex.mobile.ads.impl.q32;
import com.yandex.mobile.ads.impl.wu;
import java.util.List;

public abstract class v32
extends ky
implements q32 {
    @Nullable
    private q32 d;
    private long e;

    public final int a() {
        q32 q322 = this.d;
        q322.getClass();
        return q322.a();
    }

    public final int a(long l10) {
        q32 q322 = this.d;
        q322.getClass();
        return q322.a(l10 - this.e);
    }

    public final long a(int n10) {
        q32 q322 = this.d;
        q322.getClass();
        return q322.a(n10) + this.e;
    }

    public final void a(long l10, q32 q322, long l11) {
        this.c = l10;
        this.d = q322;
        if (l11 != Long.MAX_VALUE) {
            l10 = l11;
        }
        this.e = l10;
    }

    public final List<wu> b(long l10) {
        q32 q322 = this.d;
        q322.getClass();
        return q322.b(l10 - this.e);
    }

    public final void b() {
        super.b();
        this.d = null;
    }
}

