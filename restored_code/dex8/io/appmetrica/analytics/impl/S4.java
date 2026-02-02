/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.Km;
import io.appmetrica.analytics.impl.On;
import io.appmetrica.analytics.impl.Pm;
import io.appmetrica.analytics.impl.T;
import io.appmetrica.analytics.impl.cj;
import io.appmetrica.analytics.impl.om;
import io.appmetrica.analytics.impl.r4;
import io.appmetrica.analytics.impl.se;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;

public final class s4 {
    public final Km a;
    public final T b;

    public s4(Km km3, T t13) {
        this.a = km3;
        this.b = t13;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final r4 a(HashMap object) {
        Object object2;
        om om3 = this.a.e();
        Object object3 = this.b;
        synchronized (object3) {
            object2 = new se();
            object2 = ((T)object3).a((cj)object2);
        }
        IdentifiersResult identifiersResult = r4.a(om3.d);
        object3 = r4.a(om3.a);
        IdentifiersResult identifiersResult2 = r4.a(om3.b);
        IdentifiersResult identifiersResult3 = r4.a(om3.j);
        IdentifiersResult identifiersResult4 = r4.a(om3.i);
        IdentifiersResult identifiersResult5 = r4.a(Gb.a(Pm.a(om3.k)));
        IdentifiersResult identifiersResult6 = r4.a(Gb.a((HashMap)object));
        object = ((AdvertisingIdsHolder)object2).getGoogle().mAdTrackingInfo == null ? null : ((AdvertisingIdsHolder)object2).getGoogle().mAdTrackingInfo.advId;
        IdentifiersResult identifiersResult7 = new IdentifiersResult((String)object, ((AdvertisingIdsHolder)object2).getGoogle().mStatus, ((AdvertisingIdsHolder)object2).getGoogle().mErrorExplanation);
        object = ((AdvertisingIdsHolder)object2).getHuawei().mAdTrackingInfo == null ? null : ((AdvertisingIdsHolder)object2).getHuawei().mAdTrackingInfo.advId;
        IdentifiersResult identifiersResult8 = new IdentifiersResult((String)object, ((AdvertisingIdsHolder)object2).getHuawei().mStatus, ((AdvertisingIdsHolder)object2).getHuawei().mErrorExplanation);
        if (((AdvertisingIdsHolder)object2).getYandex().mAdTrackingInfo == null) {
            object = null;
            return new r4(identifiersResult, (IdentifiersResult)object3, identifiersResult2, identifiersResult3, identifiersResult4, identifiersResult5, identifiersResult6, identifiersResult7, identifiersResult8, new IdentifiersResult((String)object, ((AdvertisingIdsHolder)object2).getYandex().mStatus, ((AdvertisingIdsHolder)object2).getYandex().mErrorExplanation), r4.a(Gb.a(om3.h)), On.a(), om3.o + (long)om3.A.a, r4.a(om3.n.f), new Bundle());
        }
        object = ((AdvertisingIdsHolder)object2).getYandex().mAdTrackingInfo.advId;
        return new r4(identifiersResult, (IdentifiersResult)object3, identifiersResult2, identifiersResult3, identifiersResult4, identifiersResult5, identifiersResult6, identifiersResult7, identifiersResult8, new IdentifiersResult((String)object, ((AdvertisingIdsHolder)object2).getYandex().mStatus, ((AdvertisingIdsHolder)object2).getYandex().mErrorExplanation), r4.a(Gb.a(om3.h)), On.a(), om3.o + (long)om3.A.a, r4.a(om3.n.f), new Bundle());
    }
}

