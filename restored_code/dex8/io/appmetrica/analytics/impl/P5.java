/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.D4;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class p5 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public final List<D4> a() {
        return this.a;
    }

    public final void a(@NonNull D4 d44) {
        this.a.add(d44);
    }

    public final void b(@NonNull D4 d44) {
        this.a.remove(d44);
    }
}

