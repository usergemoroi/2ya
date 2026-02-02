/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.Da;
import io.appmetrica.analytics.impl.M9;
import io.appmetrica.analytics.impl.a7;
import io.appmetrica.analytics.impl.o6;

public final class n6
implements Parcelable.Creator {
    /*
     * WARNING - void declaration
     */
    public final Object createFromParcel(Parcel object2) {
        void var1_12;
        void var1_9;
        void var1_6;
        Object var6_15;
        Bundle bundle;
        block7: {
            bundle = object2.readBundle(a7.class.getClassLoader());
            boolean bl2 = bundle.containsKey("CounterReport.Source");
            var6_15 = null;
            if (bl2) {
                int n10 = bundle.getInt("CounterReport.Source");
                for (M9 m94 : M9.values()) {
                    if (m94.a != n10) {
                        continue;
                    }
                    break block7;
                }
                M9 m95 = M9.b;
            } else {
                Object var1_5 = null;
            }
        }
        o6 o63 = new o6("", "", 0);
        Bb bb4 = Bb.c;
        o63.d = bundle.getInt("CounterReport.Type", -1);
        o63.e = bundle.getInt("CounterReport.CustomType");
        o63.b = StringUtils.ifIsNullToDef(bundle.getString("CounterReport.Value"), "");
        o63.c = bundle.getString("CounterReport.Environment");
        o63.a = bundle.getString("CounterReport.Event");
        o63.f = o6.a(bundle);
        o63.g = bundle.getInt("CounterReport.TRUNCATED");
        o63.h = bundle.getString("CounterReport.ProfileID");
        o63.i = bundle.getLong("CounterReport.CreationElapsedRealtime");
        o63.j = bundle.getLong("CounterReport.CreationTimestamp");
        o63.k = Da.a(bundle.getInt("CounterReport.UniquenessStatus"));
        o63.l = var1_6;
        o63.m = bundle.getBundle("CounterReport.Payload");
        if (bundle.containsKey("CounterReport.AttributionIdChanged")) {
            Boolean bl3 = bundle.getBoolean("CounterReport.AttributionIdChanged");
        } else {
            Object var1_8 = null;
        }
        o63.n = var1_9;
        Object var1_10 = var6_15;
        if (bundle.containsKey("CounterReport.OpenId")) {
            Integer n13 = bundle.getInt("CounterReport.OpenId");
        }
        o63.o = var1_12;
        o63.p = CollectionUtils.bundleToMap(bundle.getBundle("CounterReport.Extras"));
        return o63;
    }

    public final Object[] newArray(int n10) {
        return new o6[n10];
    }
}

