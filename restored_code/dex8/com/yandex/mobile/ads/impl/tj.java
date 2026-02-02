/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.f03
 *  com.yandex.mobile.ads.impl.k72
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.pv
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.f03;
import com.yandex.mobile.ads.impl.k72;
import com.yandex.mobile.ads.impl.lv;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.pv;
import java.util.ArrayList;
import java.util.Map;

public abstract class tj
implements lv {
    private final boolean a;
    private final ArrayList<k72> b;
    private int c;
    @Nullable
    private pv d;

    protected tj(boolean bl2) {
        this.a = bl2;
        this.b = new ArrayList(1);
    }

    @Override
    public final void a(k72 k722) {
        k722.getClass();
        if (!this.b.contains(k722)) {
            this.b.add(k722);
            ++this.c;
        }
    }

    protected final void b(pv pv3) {
        for (int i14 = 0; i14 < this.c; ++i14) {
            this.b.get(i14).getClass();
        }
    }

    protected final void c(int n10) {
        pv pv3 = this.d;
        int n12 = m92.a;
        for (n12 = 0; n12 < this.c; ++n12) {
            this.b.get(n12).a(pv3, this.a, n10);
        }
    }

    protected final void c(pv pv3) {
        this.d = pv3;
        for (int i14 = 0; i14 < this.c; ++i14) {
            this.b.get(i14).b(pv3, this.a);
        }
    }

    protected final void e() {
        pv pv3 = this.d;
        int n10 = m92.a;
        for (n10 = 0; n10 < this.c; ++n10) {
            this.b.get(n10).a(pv3, this.a);
        }
        this.d = null;
    }

    public /* synthetic */ Map getResponseHeaders() {
        return f03.a((lv)this);
    }
}

