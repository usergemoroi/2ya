/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 *  com.yandex.mobile.ads.impl.t00
 */
package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.t00;
import org.jetbrains.annotations.NotNull;

public final class oq<V extends ViewGroup>
implements t00<V> {
    @NotNull
    private final t00<V>[] a;

    @SafeVarargs
    public oq(t00<V> ... t00Array) {
        this.a = t00Array;
    }

    public final void a(@NotNull V v14) {
        t00<V>[] t00Array = this.a;
        int n10 = t00Array.length;
        for (int i14 = 0; i14 < n10; ++i14) {
            t00Array[i14].a(v14);
        }
    }

    public final void c() {
        t00<V>[] t00Array = this.a;
        int n10 = t00Array.length;
        for (int i14 = 0; i14 < n10; ++i14) {
            t00Array[i14].c();
        }
    }
}

