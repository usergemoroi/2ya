/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.q32
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.q32;
import com.yandex.mobile.ads.impl.wu;
import java.util.Collections;
import java.util.List;

final class nn
implements q32 {
    private final List<wu> b;

    public nn(List<wu> list) {
        this.b = list;
    }

    public final int a() {
        return 1;
    }

    public final int a(long l10) {
        int n10 = l10 < 0L ? 0 : -1;
        return n10;
    }

    public final long a(int n10) {
        if (n10 == 0) {
            return 0L;
        }
        throw new IllegalArgumentException();
    }

    public final List<wu> b(long l10) {
        List<wu> list = l10 >= 0L ? this.b : Collections.emptyList();
        return list;
    }
}

