/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.ar1
 *  com.yandex.mobile.ads.impl.em$a
 *  com.yandex.mobile.ads.impl.hh0
 *  com.yandex.mobile.ads.impl.pw1
 *  com.yandex.mobile.ads.impl.pw1$a
 *  com.yandex.mobile.ads.impl.uc1
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ak;
import com.yandex.mobile.ads.impl.ar1;
import com.yandex.mobile.ads.impl.e00;
import com.yandex.mobile.ads.impl.em;
import com.yandex.mobile.ads.impl.hh0;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.uc1;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

public final class kh1
extends ak<uc1> {
    private static final int w = (int)TimeUnit.SECONDS.toMillis(10L);

    public kh1(@NotNull Context context, @NotNull String string2, @NotNull ak.a<uc1> a13) {
        super(context, string2, a13);
        this.a(context);
        this.r();
        this.s();
    }

    @Override
    private final void a(Context object) {
        int n10 = pw1.l;
        Object object2 = pw1.a.a().a((Context)object);
        n10 = object2 != null && (object2 = object2.W()) != null ? (Integer)object2 : w;
        object = pw1.a.a().a((Context)object);
        int n13 = object != null && (object = object.L()) != null ? (Integer)object : 0;
        this.a(new e00(1.0f, n10, n13));
    }

    @NotNull
    protected final ar1<uc1> a(@NotNull uc1 uc12) {
        return ar1.a((Object)uc12, (em.a)hh0.a((uc1)uc12));
    }
}

