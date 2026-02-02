/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  android.location.LocationListener
 *  android.os.Bundle
 */
package io.appmetrica.analytics.location.impl;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.location.impl.h;
import io.appmetrica.analytics.location.impl.p;
import io.appmetrica.analytics.location.impl.t;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;

public final class n
implements LocationListener {
    public final p a;

    public n(p p14) {
        this.a = p14;
    }

    public final void onLocationChanged(Location location) {
        block8: {
            Object object;
            block9: {
                if (location == null) break block8;
                Object object2 = this.a;
                object2.getClass();
                String string2 = location.getProvider();
                object = (t)((p)object2).e.get(string2);
                if (object == null) {
                    object = new t(((p)object2).a.a);
                    h h14 = ((p)object2).c;
                    ((t)object).c.add(h14);
                    for (Consumer consumer : ((p)object2).d) {
                        ((t)object).c.add(consumer);
                    }
                    ((p)object2).e.put(string2, object);
                } else {
                    ((t)object).a = ((p)object2).a.a;
                }
                if (((t)object).d == null) break block9;
                object2 = ((t)object).a;
                boolean bl2 = ((t)object).b.didTimePassMillis(((t)object).e, ((LocationFilter)object2).getUpdateTimeInterval(), "isSavedLocationOutdated");
                object2 = ((t)object).a;
                float f11 = location.distanceTo(((t)object).d);
                float f12 = ((LocationFilter)object2).getUpdateDistanceInterval();
                boolean bl3 = false;
                boolean bl4 = f11 > f12;
                if (((t)object).d == null || location.getTime() - ((t)object).d.getTime() >= 0L) {
                    bl3 = true;
                }
                if (!bl2 && !bl4 || !bl3) break block8;
            }
            ((t)object).d = location;
            ((t)object).e = System.currentTimeMillis();
            object = ((t)object).c.iterator();
            while (object.hasNext()) {
                ((Consumer)object.next()).consume(location);
            }
        }
    }

    public final void onProviderDisabled(String string2) {
    }

    public final void onProviderEnabled(String string2) {
    }

    public final void onStatusChanged(String string2, int n10, Bundle bundle) {
    }
}

