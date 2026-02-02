/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.a3$a
 *  com.yandex.mobile.ads.impl.ar1
 *  com.yandex.mobile.ads.impl.dj2
 *  com.yandex.mobile.ads.impl.g3
 *  com.yandex.mobile.ads.impl.gj2
 *  com.yandex.mobile.ads.impl.h3$a
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.uc1
 *  com.yandex.mobile.ads.impl.vi2
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.xi2
 *  com.yandex.mobile.ads.impl.zi2
 *  kotlin.collections.s0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.a3;
import com.yandex.mobile.ads.impl.ar1;
import com.yandex.mobile.ads.impl.cj2;
import com.yandex.mobile.ads.impl.dg1;
import com.yandex.mobile.ads.impl.dj2;
import com.yandex.mobile.ads.impl.g3;
import com.yandex.mobile.ads.impl.gj;
import com.yandex.mobile.ads.impl.gj2;
import com.yandex.mobile.ads.impl.h3;
import com.yandex.mobile.ads.impl.kj2;
import com.yandex.mobile.ads.impl.o62;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.uc1;
import com.yandex.mobile.ads.impl.vi2;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.xi2;
import com.yandex.mobile.ads.impl.zi2;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class yi2
extends o62<zi2, vi2> {
    @NotNull
    private final xi2 C;
    @NotNull
    private final gj2 D;

    @JvmOverloads
    public yi2(@NotNull Context context, @NotNull x2 x22, @NotNull String string2, @NotNull kj2 kj22, @NotNull zi2 zi22, @NotNull cj2 cj22, @NotNull xi2 xi22, @NotNull gj2 gj22) {
        super(context, x22, 0, string2, kj22, zi22, cj22, null, 1920);
        this.C = xi22;
        this.D = gj22;
        int n10 = op0.b;
    }

    @Override
    @NotNull
    public final ar1<vi2> a(@NotNull uc1 object, int n10) {
        Object object2;
        if (200 == n10 && (object2 = object.b) != null && ((byte[])object2).length != 0) {
            String string2 = this.D.a(object);
            object2 = object.c;
            object = object2;
            if (object2 == null) {
                object = s0.j();
            }
            new gj((Map)object);
            if (string2 != null && string2.length() != 0) {
                try {
                    object = ar1.a((Object)this.C.a(string2), null);
                }
                catch (Exception exception) {
                    object = ar1.a((dj2)new dg1(exception));
                }
            } else {
                object = ar1.a((dj2)new dg1("Can't parse VMAP response"));
            }
        } else {
            n10 = a3.d;
            object = ar1.a((dj2)new dj2(h3.a.a(null, (g3)a3.a.a((uc1)object).a()).c()));
        }
        return object;
    }
}

