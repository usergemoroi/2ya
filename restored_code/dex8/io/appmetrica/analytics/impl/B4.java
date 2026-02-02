/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Pm;
import io.appmetrica.analytics.impl.Q3;
import io.appmetrica.analytics.impl.Y3;
import io.appmetrica.analytics.impl.om;
import io.appmetrica.analytics.impl.q8;
import io.appmetrica.analytics.impl.r8;
import io.appmetrica.analytics.impl.ro;
import java.util.Map;

public final class b4 {
    public static boolean a(Map map2, om om3, Y3 y34) {
        map2 = ((Q3)y34.a((r8)new Q3((Map<String, String>)map2, (q8)q8.c))).a;
        if (ro.a(map2)) {
            return true;
        }
        return map2.equals(Pm.a(om3.m));
    }
}

