/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ep2
 *  com.yandex.mobile.ads.impl.ep2$a
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ep2;
import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class ip2
implements ep2.a {
    private final ThreadPoolExecutor a;
    private final ArrayDeque<ep2> b = new ArrayDeque();
    private ep2 c = null;

    public ip2() {
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<Runnable>();
        this.a = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void b() {
        ep2 ep22;
        this.c = ep22 = this.b.poll();
        if (ep22 != null) {
            ep22.a(this.a);
        }
    }

    public final void a() {
        this.c = null;
        this.b();
    }

    public final void a(ep2 ep22) {
        ep22.a((ep2.a)this);
        this.b.add(ep22);
        if (this.c == null) {
            this.b();
        }
    }
}

