/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  com.yandex.mobile.ads.impl.ar1
 *  com.yandex.mobile.ads.impl.b60$a
 *  com.yandex.mobile.ads.impl.dj2
 *  com.yandex.mobile.ads.impl.ir1
 *  com.yandex.mobile.ads.impl.yp1
 */
package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.impl.ar1;
import com.yandex.mobile.ads.impl.b60;
import com.yandex.mobile.ads.impl.dj2;
import com.yandex.mobile.ads.impl.ir1;
import com.yandex.mobile.ads.impl.yp1;
import java.util.concurrent.Executor;

public final class b60
implements ir1 {
    private final Executor a;

    public b60(Handler handler) {
        this.a = new a(handler);
    }

    public final void a(yp1<?> b10, ar1<?> ar12, Runnable runnable) {
        b10.o();
        b10.a("post-response");
        Executor executor = this.a;
        b10 = new /* Unavailable Anonymous Inner Class!! */;
        ((a)executor).a.post((Runnable)b10);
    }

    public final void a(yp1<?> b10, dj2 object) {
        b10.a("post-error");
        ar1 ar12 = ar1.a((dj2)object);
        object = this.a;
        b10 = new /* Unavailable Anonymous Inner Class!! */;
        ((a)object).a.post((Runnable)b10);
    }
}

