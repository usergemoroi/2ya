/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.nd2
 *  com.yandex.mobile.ads.impl.pd2
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.nd2;
import com.yandex.mobile.ads.impl.pd2;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;

public final class od2
implements nd2,
pd2 {
    @NotNull
    private final LinkedHashSet a = new LinkedHashSet();
    @NotNull
    private final LinkedHashSet b = new LinkedHashSet();

    public final void a() {
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((pd2)iterator.next()).a();
        }
    }

    public final void a(long l10, long l11) {
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((nd2)iterator.next()).a(l10, l11);
        }
    }

    public final void a(nd2 ... nd2Array) {
        t.G((Collection)this.a, (Object[])nd2Array);
    }

    public final void a(pd2 ... pd2Array) {
        t.G((Collection)this.b, (Object[])pd2Array);
    }

    public final void b() {
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((pd2)iterator.next()).b();
        }
    }
}

