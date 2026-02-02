/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.div.core.images.LoadReference
 */
package com.yandex.mobile.ads.impl;

import com.yandex.div.core.images.LoadReference;
import com.yandex.mobile.ads.impl.b20;
import kotlin.jvm.internal.u0;

public final class uq2
implements LoadReference {
    public final b20 a;
    public final u0 b;

    public /* synthetic */ uq2(b20 b202, u0 u04) {
        this.a = b202;
        this.b = u04;
    }

    public final void cancel() {
        b20.f(this.a, this.b);
    }
}

