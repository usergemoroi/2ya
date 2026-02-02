/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.impl.pg;
import java.io.File;

public final class oq
implements Consumer {
    public final void consume(Object object) {
        pg.a((File)object);
    }
}

