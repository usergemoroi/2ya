/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.a71
 *  com.yandex.mobile.ads.impl.iq1
 *  com.yandex.mobile.ads.impl.uc1
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.a71;
import com.yandex.mobile.ads.impl.ak;
import com.yandex.mobile.ads.impl.iq1;
import com.yandex.mobile.ads.impl.kj;
import com.yandex.mobile.ads.impl.r61;
import com.yandex.mobile.ads.impl.uc1;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.z61;
import org.jetbrains.annotations.NotNull;

public final class x51
extends kj<a71> {
    public x51(@NotNull Context context, @NotNull x2 x22, @NotNull String string2, @NotNull String string3, @NotNull iq1 iq12, @NotNull ak.a a14, @NotNull r61 r612, @NotNull z61 z612) {
        super(context, x22, string2, string3, r612, iq12, a14, z612, null, 3840);
    }

    @Override
    protected final boolean b(@NotNull uc1 object, int n10) {
        boolean bl2;
        boolean bl3 = false;
        if (200 == n10 && (object = (Object)object.b) != null && (bl2 = ((uc1)object).length == 0) ^ true || 204 == n10) {
            bl3 = true;
        }
        return bl3;
    }
}

