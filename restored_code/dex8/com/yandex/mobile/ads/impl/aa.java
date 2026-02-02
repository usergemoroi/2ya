/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  com.yandex.mobile.ads.impl.d50
 *  com.yandex.mobile.ads.impl.kx1
 *  com.yandex.mobile.ads.impl.w82
 *  com.yandex.mobile.ads.impl.w82$a
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.ya0
 *  com.yandex.mobile.ads.impl.ya0$b
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import com.yandex.mobile.ads.impl.d50;
import com.yandex.mobile.ads.impl.kx1;
import com.yandex.mobile.ads.impl.w82;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.ya0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class aa
implements w82 {
    @NotNull
    private final d50 a = new d50();

    @NotNull
    public final w82.a a() {
        return w82.a.b;
    }

    @NotNull
    public final String a(@NotNull Context context, @NotNull x2 object, @NotNull kx1 kx12) {
        object = new ya0(ya0.b.a((Context)context, (x2)object, (kx1)kx12), 0).toString();
        return this.a.a(context, (String)object);
    }

    @Nullable
    public final String a(@NotNull x2 object) {
        object = (object = object.j().a()) != null && ((String)object).length() > 0 ? Uri.parse((String)object).buildUpon().appendEncodedPath("v4/ad").build().toString() : null;
        return object;
    }
}

