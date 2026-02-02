/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.b;
import io.appmetrica.analytics.impl.dd;
import io.appmetrica.analytics.impl.g9;
import io.appmetrica.analytics.impl.la;
import io.appmetrica.analytics.impl.u8;

public final class f9 {
    public final dd a;
    public final dd b;

    public f9() {
        this(new u8(), new la(), new b());
    }

    public f9(u8 u82, la la4, b b11) {
        dd dd3;
        this.a = dd3 = new dd(u82);
        dd3.a((Object)g9.b, u82);
        dd3.a((Object)g9.c, la4);
        dd3.a((Object)g9.d, b11);
        this.b = new dd(u82);
    }
}

