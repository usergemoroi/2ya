/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.identifiers.impl.a;
import io.appmetrica.analytics.identifiers.impl.b;
import io.appmetrica.analytics.identifiers.impl.c;
import io.appmetrica.analytics.identifiers.impl.f;
import io.appmetrica.analytics.identifiers.impl.g;
import io.appmetrica.analytics.identifiers.impl.i;
import io.appmetrica.analytics.identifiers.impl.k;
import io.appmetrica.analytics.identifiers.impl.m;
import io.appmetrica.analytics.identifiers.impl.o;
import org.jetbrains.annotations.NotNull;

public final class j
implements b {
    public final f a;

    public j() {
        this(new f(k.a(), i.a, "huawei"));
    }

    @VisibleForTesting
    public j(@NotNull f f11) {
        this.a = f11;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NotNull
    public final c a(@NotNull Context var1_1) {
        block13: {
            var4_4 = (m)((o)this.a.a(var1_1));
            var3_6 = var4_4.a();
            var2_9 = var4_4.b();
            var6_10 = IdentifierStatus.OK;
            var5_11 = new a("huawei", (String)var3_6, var2_9);
            var3_6 = var4_4 = new c(var6_10, (a)var5_11, null, 4);
            try {
                var5_11 = this.a;

            }
            catch (Throwable var1_2) {
                return var3_6;
            }
            catch (Throwable var4_5) {
            }
            catch (g var3_7) {

            }
            var3_6 = new StringBuilder("exception while fetching hoaid: ");
            var3_6.append(var4_5.getMessage());
            var3_6 = var3_6.toString();
            var3_6 = var4_4 = new c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, (String)var3_6);
            var5_11 = this.a;

            catch (Throwable var3_8) {}
            {
                break block13;
lbl28:

                var3_6 = var4_4 = var3_7.getMessage();
                if (var4_4 == null) {
                    var3_6 = "unknown exception during binding huawei services";
                }
                var3_6 = var4_4 = new c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, (String)var3_6);
            }
            var5_11 = this.a;
lbl34:

            var3_6 = var4_4;
            var5_11.b(var1_1);
            return var4_4;
        }
        try {}
        catch (Throwable var1_3) {
            throw var3_8;
        }
        this.a.b(var1_1);
        throw var3_8;
    }
}

