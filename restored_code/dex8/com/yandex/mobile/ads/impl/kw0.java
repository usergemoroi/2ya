/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.fx1
 *  com.yandex.mobile.ads.impl.mx1
 *  com.yandex.mobile.ads.impl.mx1$a
 *  com.yandex.mobile.ads.impl.pt1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.b70;
import com.yandex.mobile.ads.impl.c62;
import com.yandex.mobile.ads.impl.fx1;
import com.yandex.mobile.ads.impl.mx1;
import com.yandex.mobile.ads.impl.pt1;
import java.io.IOException;

public interface kw0
extends mx1 {
    public long a(long var1, fx1 var3);

    public long a(b70[] var1, boolean[] var2, pt1[] var3, boolean[] var4, long var5);

    public void a(a var1, long var2);

    public void discardBuffer(long var1, boolean var3);

    public c62 getTrackGroups();

    public void maybeThrowPrepareError() throws IOException;

    public long readDiscontinuity();

    public long seekToUs(long var1);

    public static interface a
    extends mx1.a<kw0> {
        public void a(kw0 var1);
    }
}

