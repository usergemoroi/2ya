/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.dc2
 *  com.yandex.mobile.ads.impl.dj2
 *  com.yandex.mobile.ads.impl.hq1
 *  com.yandex.mobile.ads.impl.kj2$a
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ak;
import com.yandex.mobile.ads.impl.dc2;
import com.yandex.mobile.ads.impl.dj2;
import com.yandex.mobile.ads.impl.hq1;
import com.yandex.mobile.ads.impl.kj2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Exception performing whole class analysis ignored.
 */
public final class kj2<T>
implements ak.a<T> {
    @Nullable
    private final hq1<T> a;

    public kj2(@Nullable hq1<T> hq12) {
        this.a = hq12;
    }

    public final void a(@NotNull dj2 dj22) {
        if (this.a != null) {
            dj22 = com.yandex.mobile.ads.impl.kj2$a.a((dj2)dj22);
            this.a.a((dc2)dj22);
        }
    }

    public final void a(@NotNull T t13) {
        hq1<T> hq12 = this.a;
        if (hq12 != null) {
            hq12.a(t13);
        }
    }
}

