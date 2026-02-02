/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.ma;
import io.appmetrica.analytics.impl.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class u
implements v {
    public final Context a;

    public u(@NotNull Context context) {
        this.a = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public final String a() {
        Object object;
        block6: {
            A4 a44 = A4.l();
            Context context = this.a;
            ma ma2 = a44.t;
            object = ma2;
            if (ma2 == null) {
                synchronized (a44) {
                    Throwable throwable2;
                    block5: {
                        block4: {
                            try {
                                ma2 = a44.t;
                                object = ma2;
                                if (ma2 != null) break block4;
                                a44.t = object = new ma(context);
                            }
                            catch (Throwable throwable2) {
                                break block5;
                            }
                        }
                        break block6;
                    }
                    throw throwable2;
                }
            }
        }
        if ((object = ((ma)object).d.getApplicationMetaData(((ma)object).a)) == null) return null;
        return object.getString("io.appmetrica.analytics.plugin_supported_ad_revenue_sources");
    }
}

