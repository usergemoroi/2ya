/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.internal.a0
 */
package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.billingv6.impl.i;
import io.appmetrica.analytics.billingv6.impl.m;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.a0;
import kotlin.k0;

public final class h
extends a0
implements a {
    public final Map a;
    public final Map b;
    public final i c;

    public h(LinkedHashMap linkedHashMap, Map map2, i i14) {
        this.a = linkedHashMap;
        this.b = map2;
        this.c = i14;
        super(0);
    }

    public final Object invoke() {
        Map map2 = this.a;
        Map map3 = this.b;
        i i14 = this.c;
        m.a(map2, map3, i14.d, i14.c.getBillingInfoManager());
        return k0.a;
    }
}

