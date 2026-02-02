/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.adrevenue.admob.v23.impl.b;
import io.appmetrica.analytics.adrevenue.admob.v23.impl.c;
import io.appmetrica.analytics.adrevenue.admob.v23.impl.d;
import io.appmetrica.analytics.adrevenue.admob.v23.impl.e;
import io.appmetrica.analytics.adrevenue.admob.v23.impl.f;
import io.appmetrica.analytics.adrevenue.admob.v23.impl.g;
import io.appmetrica.analytics.adrevenue.admob.v23.impl.h;
import io.appmetrica.analytics.adrevenue.admob.v23.impl.i;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import java.util.ArrayList;
import java.util.Iterator;

public final class a
implements ModuleAdRevenueProcessor {
    public final ArrayList a;

    public a(@NonNull b b11, @NonNull ClientContext clientContext) {
        ArrayList<e> arrayList;
        this.a = arrayList = new ArrayList<e>();
        arrayList.add(new d(b11, clientContext));
        arrayList.add(new f(b11, clientContext));
        arrayList.add(new g(b11, clientContext));
        arrayList.add(new h(b11, clientContext));
        arrayList.add(new i(b11, clientContext));
        arrayList.add(new c(b11, clientContext));
    }

    @Override
    @NonNull
    public final String getDescription() {
        return "AdMob";
    }

    @Override
    public final boolean process(Object ... objectArray) {
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            if (!((ModuleAdRevenueProcessor)iterator.next()).process(objectArray)) continue;
            return true;
        }
        return false;
    }
}

