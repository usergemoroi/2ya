/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.ar1
 *  com.yandex.mobile.ads.impl.dj2
 *  com.yandex.mobile.ads.impl.ja2
 *  com.yandex.mobile.ads.impl.uc1
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ar1;
import com.yandex.mobile.ads.impl.dg1;
import com.yandex.mobile.ads.impl.dj2;
import com.yandex.mobile.ads.impl.ja2;
import com.yandex.mobile.ads.impl.kj2;
import com.yandex.mobile.ads.impl.nl2;
import com.yandex.mobile.ads.impl.o62;
import com.yandex.mobile.ads.impl.uc1;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.xb2;
import com.yandex.mobile.ads.impl.z40;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class eb2
extends o62<xb2, List<? extends xb2>> {
    @NotNull
    private final ja2 C;

    public eb2(@NotNull Context context, @NotNull x2 x22, @NotNull String string2, @NotNull kj2 kj22, @NotNull xb2 xb22, @NotNull nl2 nl22, @NotNull ja2 ja22) {
        super(context, x22, 0, string2, kj22, xb22, nl22, null, 1920);
        this.C = ja22;
    }

    @Override
    @NotNull
    public final ar1<List<xb2>> a(@NotNull uc1 object, int n10) {
        if ((object = this.C.a((uc1)object)) != null) {
            object = (object = object.b().b()).isEmpty() ? ar1.a((dj2)new z40()) : ar1.a((Object)object, null);
            return object;
        }
        return ar1.a((dj2)new dg1("Can't parse VAST response."));
    }
}

