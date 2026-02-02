/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.k42
 *  com.yandex.mobile.ads.impl.m50
 *  com.yandex.mobile.ads.impl.rh1
 *  com.yandex.mobile.ads.impl.rh1$a
 *  com.yandex.mobile.ads.impl.sg0
 *  com.yandex.mobile.ads.impl.zg0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.k42;
import com.yandex.mobile.ads.impl.m50;
import com.yandex.mobile.ads.impl.rh1;
import com.yandex.mobile.ads.impl.sg0;
import com.yandex.mobile.ads.impl.zg0;
import java.io.IOException;

public final class tg0
extends k42 {
    final sg0 e;
    final zg0 f;

    public tg0(String string2, sg0 sg02, zg0 zg02) {
        this.e = sg02;
        this.f = zg02;
        super(string2, true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long e() {
        try {
            this.e.e().a(this.f);
            return -1L;
        }
        catch (IOException iOException) {
            int n10 = rh1.c;
            rh1 rh12 = rh1.a.a();
            String string2 = this.e.c();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Http2Connection.Listener failure for ");
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
            rh12.getClass();
            rh1.a((int)4, (String)string2, (Throwable)iOException);
            try {
                this.f.a(m50.e, iOException);
                return -1L;
            }
            catch (IOException iOException2) {
                return -1L;
            }
        }
    }
}

