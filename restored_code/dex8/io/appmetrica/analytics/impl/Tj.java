/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.nh;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.v5;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import org.jetbrains.annotations.NotNull;

public final class tj
extends nh {
    public tj(@NotNull v5 v54) {
        super(v54);
        v54.b().a();
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    @Override
    public final boolean a(@NotNull o6 var1_1) {
        for (Object var4_4 : var1_1.p.entrySet()) {
            var2_2 = this.a.u;
            var3_3 = (String)var4_4.getKey();
            if ((var4_4 = (Object)((byte[])var4_4.getValue())) == null) ** GOTO lbl-1000
            var2_2.getClass();
            if (((Object)var4_4).length != 0) {
                var3_3 = (byte[])var2_2.b.put(var3_3, var4_4);
            } else // 2 sources

            {
                var3_3 = (byte[])var2_2.b.remove(var3_3);
            }
            var5_5 = var2_2.a;
            var6_6 = var2_2.b;
            var3_3 = var5_5.d;
            var4_4 = var5_5.a;
            var2_2 = var5_5.c;
            var5_5 = var5_5.b.a(var6_6);
            var2_2.getClass();
            var3_3.insert((String)var4_4, MessageNano.toByteArray((MessageNano)var5_5));
        }
        return true;
    }
}

