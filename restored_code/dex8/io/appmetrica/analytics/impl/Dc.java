/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.Cn;
import io.appmetrica.analytics.impl.Jn;
import io.appmetrica.analytics.impl.U;
import io.appmetrica.analytics.impl.Z9;
import io.appmetrica.analytics.impl.c;
import io.appmetrica.analytics.impl.f0;
import io.appmetrica.analytics.impl.xp;
import org.jetbrains.annotations.NotNull;

public final class dc
implements c {
    public final f0 a;
    public final Jn b;

    public dc(@NotNull f0 f04) {
        this.a = f04;
        this.b = new Jn();
    }

    public static final void a(dc dc3, U u11) {
        dc3.a.a(u11);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final void onAppNotResponding() {
        block5: {
            var4_1 = this.b;
            var3_2 = var4_1.a.a();
            var1_4 /* !! */  = var2_3 /* !! */  = var4_1.a.b();
            if (var2_3 /* !! */  != null) break block5;
            try {
                var1_4 /* !! */  = var3_2.getStackTrace();
                break block5;
            }
            catch (SecurityException var1_6) {
                var1_4 /* !! */  = var2_3 /* !! */ ;
                ** continue;
            }
            catch (SecurityException var1_5) {
                var1_4 /* !! */  = null;
            }
        }
lbl15:
        // 2 sources

        while (true) {
            var2_3 /* !! */  = new U((Cn)var4_1.b.apply(var3_2, var1_4 /* !! */ ), var4_1.a(var3_2, null), var4_1.c.a());
            var1_4 /* !! */  = A4.l().c.a();
            var2_3 /* !! */  = new xp(this, (U)var2_3 /* !! */ );
            ((Z9)var1_4 /* !! */ ).b.post((Runnable)var2_3 /* !! */ );
            return;
        }
    }
}

