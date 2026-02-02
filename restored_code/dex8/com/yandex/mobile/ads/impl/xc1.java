/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.cj
 *  com.yandex.mobile.ads.impl.gh0
 *  com.yandex.mobile.ads.impl.hf0
 *  com.yandex.mobile.ads.impl.wc1
 *  com.yandex.mobile.ads.impl.zq1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cj;
import com.yandex.mobile.ads.impl.gh0;
import com.yandex.mobile.ads.impl.hf0;
import com.yandex.mobile.ads.impl.wc1;
import com.yandex.mobile.ads.impl.zq1;
import java.util.Map;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class xc1
implements wc1 {
    @NotNull
    private final cj a;

    public /* synthetic */ xc1() {
        this(new cj());
    }

    public xc1(@NotNull cj cj3) {
        this.a = cj3;
    }

    @Nullable
    public final String a(@NotNull zq1 object) {
        byte[] byArray = object.a().a();
        if (byArray != null) {
            if ((object = hf0.c((Map)object.b(), (gh0)gh0.d0)) == null || Boolean.parseBoolean((String)object)) {
                this.a.getClass();
                object = cj.a((byte[])byArray);
            } else {
                object = new String(byArray, d.b);
            }
        } else {
            object = null;
        }
        return object;
    }
}

