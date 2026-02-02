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

final class f82
implements q32 {
    public static final f82 c = new f82();
    private final List<wu> b;

    private f82() {
        this.b = Collections.emptyList();
    }

    public f82(wu wu2) {
        this.b = Collections.singletonList(wu2);
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

