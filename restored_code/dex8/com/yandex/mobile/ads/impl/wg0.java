/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.gn1
 *  com.yandex.mobile.ads.impl.k42
 *  com.yandex.mobile.ads.impl.m50
 *  com.yandex.mobile.ads.impl.sg0
 *  okio.e
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fn1;
import com.yandex.mobile.ads.impl.gn1;
import com.yandex.mobile.ads.impl.k42;
import com.yandex.mobile.ads.impl.m50;
import com.yandex.mobile.ads.impl.sg0;
import java.io.IOException;
import okio.e;

public final class wg0
extends k42 {
    final sg0 e;
    final int f;
    final e g;
    final int h;

    public wg0(String string2, sg0 sg02, int n10, e e11, int n13, boolean bl2) {
        this.e = sg02;
        this.f = n10;
        this.g = e11;
        this.h = n13;
        super(string2, true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final long e() {
        try {
            gn1 gn12 = sg0.f((sg0)this.e);
            e e11 = this.g;
            int n10 = this.h;
            ((fn1)gn12).getClass();
            e11.skip((long)n10);
            this.e.k().a(this.f, m50.i);
            gn12 = this.e;
            // MONITORENTER : gn12
            sg0.b((sg0)this.e).remove(this.f);
        }
        catch (IOException iOException) {
            return -1L;
        }
        return -1L;
    }
}

