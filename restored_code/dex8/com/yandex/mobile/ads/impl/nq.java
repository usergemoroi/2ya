/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.yandex.mobile.ads.impl.sd
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.sd;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class nq<T extends View>
implements sd<T> {
    @NotNull
    private final List<sd<T>> a;

    public nq(@NotNull List<? extends sd<T>> list) {
        this.a = list;
    }

    public final void a(@NotNull T t13) {
        Iterator<sd<T>> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(t13);
        }
    }

    public final void cancel() {
        Iterator<sd<T>> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().cancel();
        }
    }
}

