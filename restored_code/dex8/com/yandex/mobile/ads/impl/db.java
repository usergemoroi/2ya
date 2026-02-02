/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.yandex.mobile.ads.impl.af0
 *  com.yandex.mobile.ads.impl.f72
 *  com.yandex.mobile.ads.impl.i9
 *  com.yandex.mobile.ads.impl.rb
 *  com.yandex.mobile.ads.impl.sp1$b
 *  com.yandex.mobile.ads.impl.t
 *  com.yandex.mobile.ads.impl.v
 *  com.yandex.mobile.ads.impl.xp1
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.af0;
import com.yandex.mobile.ads.impl.cb;
import com.yandex.mobile.ads.impl.f72;
import com.yandex.mobile.ads.impl.i9;
import com.yandex.mobile.ads.impl.rb;
import com.yandex.mobile.ads.impl.sp1;
import com.yandex.mobile.ads.impl.t;
import com.yandex.mobile.ads.impl.v;
import com.yandex.mobile.ads.impl.xp1;
import org.jetbrains.annotations.NotNull;

public final class db
implements v<cb> {
    @NotNull
    private final rb a;
    @NotNull
    private final i9 b;
    @NotNull
    private final xp1 c;

    public db(@NotNull rb rb2, @NotNull i9 i92, @NotNull xp1 xp12) {
        this.a = rb2;
        this.b = i92;
        this.c = xp12;
    }

    public final af0 a(View view, t object2) {
        cb cb2 = (cb)object2;
        for (String string2 : cb2.b()) {
            this.b.a(string2, f72.b);
        }
        this.a.a(view, cb2);
        this.c.a(sp1.b.j);
        return new af0(false);
    }
}

