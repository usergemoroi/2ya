/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.jg
 *  com.yandex.mobile.ads.impl.jj0
 *  com.yandex.mobile.ads.impl.yw0
 *  com.yandex.mobile.ads.impl.zw0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jg;
import com.yandex.mobile.ads.impl.jj0;
import com.yandex.mobile.ads.impl.ri0;
import com.yandex.mobile.ads.impl.yw0;
import com.yandex.mobile.ads.impl.zw0;
import org.jetbrains.annotations.NotNull;

public final class zu0
implements jg<zw0> {
    @NotNull
    private final ri0 a;
    @NotNull
    private final yw0 b;

    public zu0(@NotNull ri0 ri02, @NotNull yw0 yw02) {
        this.a = ri02;
        this.b = yw02;
    }

    /*
     * Unable to fully structure code
     */
    public final boolean a(Object var1_1) {
        var6_2 = (zw0)var1_1;
        var1_1 = var6_2.a();
        var8_3 = var6_2.b();
        var5_4 = false;
        if (var1_1 != null) {
            if (!var1_1.isEmpty()) {
                var7_5 = var1_1.iterator();
                while (var7_5.hasNext()) {
                    var6_2 = (jj0)var7_5.next();
                    if (this.a.a((jj0)var6_2)) continue;
                    ** break block13
                }
            }
            var3_6 = true;
        } else lbl-1000:
        // 2 sources

        {
            var3_6 = false;
        }
        if (var8_3 == null) ** GOTO lbl-1000
        this.b.getClass();
        if (var8_3.a() > 0.0f) {
            var4_7 = true;
        } else lbl-1000:
        // 2 sources

        {
            var4_7 = false;
        }
        if (var1_1 != null && var8_3 != null) {
            var2_8 = var5_4;
            if (var4_7) {
                var2_8 = var5_4;
                if (var3_6) {
                    var2_8 = true;
                }
            }
        } else if (var1_1 != null) {
            var2_8 = var3_6;
        } else {
            var2_8 = var5_4;
            if (var8_3 != null) {
                var2_8 = var4_7;
            }
        }
        return var2_8;
    }
}

