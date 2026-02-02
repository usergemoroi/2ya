/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.vn
 *  com.yandex.mobile.ads.impl.xh
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.vn;
import com.yandex.mobile.ads.impl.xh;

final class a32
implements xh {
    public final String a;

    private a32(String string2) {
        this.a = string2;
    }

    public static a32 a(bg1 bg12) {
        return new a32(bg12.a(bg12.a(), vn.c));
    }

    public final int getType() {
        return 1852994675;
    }
}

