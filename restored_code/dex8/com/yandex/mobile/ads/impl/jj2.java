/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.dc2
 *  com.yandex.mobile.ads.impl.dj2
 *  com.yandex.mobile.ads.impl.hq1
 *  com.yandex.mobile.ads.impl.uc1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ak;
import com.yandex.mobile.ads.impl.dc2;
import com.yandex.mobile.ads.impl.dj2;
import com.yandex.mobile.ads.impl.hq1;
import com.yandex.mobile.ads.impl.uc1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class jj2
implements ak.a<uc1> {
    @Nullable
    private final hq1<uc1> a = null;

    public final void a(@NotNull dj2 object) {
        hq1<uc1> hq12;
        if (object.b == null) {
            hq12 = object.getMessage();
            object = hq12;
            if (hq12 == null) {
                object = "Ad request failed with network error";
            }
            object = new dc2(2, (String)object);
        } else {
            object = new dc2(1, "Ping error");
        }
        hq12 = this.a;
        if (hq12 != null) {
            hq12.a((dc2)object);
        }
    }

    public final void a(Object hq12) {
        uc1 uc12 = (uc1)hq12;
        hq12 = this.a;
        if (hq12 != null) {
            hq12.a((Object)uc12);
        }
    }
}

