/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.a1
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.d20
 *  com.yandex.mobile.ads.impl.h52
 *  com.yandex.mobile.ads.impl.nr
 *  com.yandex.mobile.ads.impl.ps1
 *  com.yandex.mobile.ads.impl.t2
 *  com.yandex.mobile.ads.impl.t20
 *  com.yandex.mobile.ads.impl.t61
 *  com.yandex.mobile.ads.impl.v00
 *  com.yandex.mobile.ads.impl.v5
 *  com.yandex.mobile.ads.impl.vv
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.a1;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.d20;
import com.yandex.mobile.ads.impl.h52;
import com.yandex.mobile.ads.impl.nr;
import com.yandex.mobile.ads.impl.ns1;
import com.yandex.mobile.ads.impl.ps1;
import com.yandex.mobile.ads.impl.t2;
import com.yandex.mobile.ads.impl.t20;
import com.yandex.mobile.ads.impl.t61;
import com.yandex.mobile.ads.impl.v00;
import com.yandex.mobile.ads.impl.v5;
import com.yandex.mobile.ads.impl.vv;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ts1
implements v00 {
    @NotNull
    private final ps1 a;

    @JvmOverloads
    public ts1(@NotNull ps1 ps12) {
        this.a = ps12;
    }

    @NotNull
    public final List a(@NotNull Context object, @NotNull b8 b82, @NotNull t61 t612, @NotNull nr object2, @NotNull a1 a14, @NotNull vv vv2, @NotNull t2 t24, @NotNull ns1 ns12, @NotNull h52 h522, @NotNull d20 d202, @Nullable t20 t202, @Nullable v5 v53) {
        object2 = new ArrayList();
        if ((object = this.a.a(object, b82, t612, a14, t24, ns12, h522, d202, t202, v53)) != null) {
            ((ArrayList)object2).add(object);
        }
        return object2;
    }
}

