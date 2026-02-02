/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.fj2
 *  com.yandex.mobile.ads.impl.jx
 *  com.yandex.mobile.ads.impl.kr1
 *  com.yandex.mobile.ads.impl.lj2
 *  com.yandex.mobile.ads.impl.uc1
 *  com.yandex.mobile.ads.impl.zq1
 *  kotlin.text.p
 *  kotlinx.serialization.json.b
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fj2;
import com.yandex.mobile.ads.impl.i32;
import com.yandex.mobile.ads.impl.jx;
import com.yandex.mobile.ads.impl.kr1;
import com.yandex.mobile.ads.impl.lj2;
import com.yandex.mobile.ads.impl.uc1;
import com.yandex.mobile.ads.impl.zq1;
import kotlin.text.p;
import kotlinx.serialization.c;
import kotlinx.serialization.json.b;
import org.jetbrains.annotations.NotNull;

public final class ap0
implements lj2<jx> {
    @NotNull
    private final kr1<String> a;
    @NotNull
    private final b b;
    @NotNull
    private final fj2 c;

    public ap0(@NotNull i32 i322, @NotNull b b10, @NotNull fj2 fj22) {
        this.a = i322;
        this.b = b10;
        this.c = fj22;
    }

    public final Object a(uc1 object) {
        this.c.getClass();
        object = fj2.a((uc1)object);
        object = (String)this.a.a((zq1)object);
        if (object != null && !p.h0((CharSequence)object)) {
            b b10 = this.b;
            b10.a();
            object = (jx)b10.c((c)jx.Companion.serializer(), (String)object);
        } else {
            object = null;
        }
        return object;
    }
}

