/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.impl.ee;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import java.io.File;

public final class bq
implements Consumer {
    public final ee a;
    public final NativeCrash b;

    public /* synthetic */ bq(ee ee3, NativeCrash nativeCrash) {
        this.a = ee3;
        this.b = nativeCrash;
    }

    public final void consume(Object object) {
        ee.a(this.a, this.b, (File)object);
    }
}

