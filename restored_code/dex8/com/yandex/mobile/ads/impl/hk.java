/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  com.yandex.mobile.ads.impl.am
 *  com.yandex.mobile.ads.impl.cd1
 *  com.yandex.mobile.ads.impl.cd1$a
 *  com.yandex.mobile.ads.impl.dj2
 *  com.yandex.mobile.ads.impl.ej2
 *  com.yandex.mobile.ads.impl.em$a
 *  com.yandex.mobile.ads.impl.hh0
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.pc1
 *  com.yandex.mobile.ads.impl.uc1
 *  com.yandex.mobile.ads.impl.xj
 *  com.yandex.mobile.ads.impl.yp1
 */
package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import com.yandex.mobile.ads.impl.am;
import com.yandex.mobile.ads.impl.cd1;
import com.yandex.mobile.ads.impl.dj2;
import com.yandex.mobile.ads.impl.ej2;
import com.yandex.mobile.ads.impl.em;
import com.yandex.mobile.ads.impl.hh0;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.pc1;
import com.yandex.mobile.ads.impl.qh0;
import com.yandex.mobile.ads.impl.uc1;
import com.yandex.mobile.ads.impl.xj;
import com.yandex.mobile.ads.impl.yp1;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class hk
implements pc1 {
    private final xj a;
    protected final am b;

    public hk(qh0 qh02, am am2) {
        this.a = qh02;
        this.b = am2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final uc1 a(yp1<?> yp12) throws dj2 {
        long l10 = SystemClock.elapsedRealtime();
        while (true) {
            Object object;
            Map map2;
            Object object2;
            block11: {
                Object object3;
                int n10;
                Collections.emptyList();
                object2 = null;
                try {
                    map2 = hh0.a((em.a)yp12.c());
                    object = this.a.a(yp12, map2);
                    map2 = object2;
                }
                catch (IOException iOException) {
                    object2 = null;
                    map2 = null;
                    break block11;
                }
                try {
                    n10 = object.e();
                    map2 = object2;
                    object3 = object.d();
                    if (n10 == 304) {
                        map2 = object2;
                        return cd1.a(yp12, (long)(SystemClock.elapsedRealtime() - l10), (List)object3);
                    }
                }
                catch (IOException iOException) {
                    object2 = object;
                    object = iOException;
                    break block11;
                }
                map2 = object2;
                InputStream inputStream = object.a();
                if (inputStream != null) {
                    map2 = object2;
                    object2 = cd1.a((InputStream)inputStream, (int)object.c(), (am)this.b);
                } else {
                    map2 = object2;
                    object2 = new byte[0];
                }
                map2 = object2;
                long l11 = SystemClock.elapsedRealtime();
                map2 = object2;
                if (ej2.a || l11 - l10 > 3000L) {
                    map2 = object2;
                    yp12.h().getClass();
                    map2 = object2;
                    int n13 = op0.b;
                }
                if (n10 >= 200 && n10 <= 299) {
                    map2 = object2;
                    return new uc1(n10, (byte[])object2, false, SystemClock.elapsedRealtime() - l10, (List)object3);
                }
                map2 = object2;
                map2 = object2;
                object3 = new IOException();
                map2 = object2;
                throw object3;
            }
            cd1.a(yp12, (cd1.a)cd1.a(yp12, (IOException)object, (long)l10, object2, (byte[])map2));
        }
    }
}

