/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  kotlin.collections.s0
 *  kotlin.collections.t
 *  kotlin.f
 */
package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.impl.Kj;
import io.appmetrica.analytics.impl.g6;
import io.appmetrica.analytics.impl.j4;
import io.appmetrica.analytics.impl.j6;
import io.appmetrica.analytics.impl.kk;
import io.appmetrica.analytics.impl.lk;
import io.appmetrica.analytics.impl.v4;
import io.appmetrica.analytics.impl.w4;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.s0;
import kotlin.collections.t;
import kotlin.f;
import kotlin.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class x4 {
    public final w4 a = new w4();
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public g6 c;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();

    public static void a(String object, String string2, Throwable throwable) {
        lk lk3 = Kj.a;
        object = s0.g(z.a(object, s0.g(z.a(string2, f.b((Throwable)throwable)))));
        lk3.getClass();
        lk3.a(new kk("client_module_errors", (Map)object));
    }

    @NotNull
    public final List<String> a() {
        return this.d;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@Nullable Bundle bundle, @NotNull SdkIdentifiers sdkIdentifiers) {
        if (bundle == null) {
            return;
        }
        Iterator iterator = this.b.iterator();
        while (true) {
            Throwable throwable2;
            ModuleClientEntryPoint moduleClientEntryPoint;
            block5: {
                String string2;
                Object object;
                ServiceConfigUpdateListener serviceConfigUpdateListener;
                ServiceConfigExtensionConfiguration serviceConfigExtensionConfiguration2;
                if (!iterator.hasNext()) {
                    return;
                }
                moduleClientEntryPoint = (ModuleClientEntryPoint)iterator.next();
                try {
                    serviceConfigExtensionConfiguration2 = moduleClientEntryPoint.getServiceConfigExtensionConfiguration();
                    if (serviceConfigExtensionConfiguration2 == null) continue;
                    serviceConfigUpdateListener = serviceConfigExtensionConfiguration2.getServiceConfigUpdateListener();
                    object = this.a;
                    string2 = moduleClientEntryPoint.getIdentifier();
                    object.getClass();
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                object = (string2 = bundle.getBundle(string2)) != null ? new v4(sdkIdentifiers, serviceConfigExtensionConfiguration2.getBundleConverter().fromBundle((Bundle)string2)) : null;
                if (object == null) continue;
                serviceConfigUpdateListener.onServiceConfigUpdated(object);
                continue;
            }
            x4.a(moduleClientEntryPoint.getIdentifier(), "notifyModulesWithConfig", throwable2);
        }
    }

    public final void a(@NotNull g6 g63) {
        this.c = g63;
        HashSet<ModuleClientEntryPoint> hashSet = new HashSet<ModuleClientEntryPoint>();
        for (ModuleClientEntryPoint moduleClientEntryPoint : this.b) {
            try {
                moduleClientEntryPoint.initClientSide(g63);
            }
            catch (Throwable throwable) {
                x4.a(moduleClientEntryPoint.getIdentifier(), "initClientSide", throwable);
                hashSet.add(moduleClientEntryPoint);
            }
        }
        this.b.removeAll(hashSet);
    }

    public final void a(@NotNull ModuleClientEntryPoint<Object> moduleClientEntryPoint) {
        this.b.add(moduleClientEntryPoint);
    }

    @Nullable
    public final ModuleAdRevenueProcessor b() {
        Object object = this.c;
        object = object != null && (object = ((j4)object).b) != null ? ((j6)object).a : null;
        return object;
    }

    public final void c() {
        for (ModuleClientEntryPoint arrayList2 : this.b) {
            try {
                arrayList2.onActivated();
            }
            catch (Throwable throwable) {
                x4.a(arrayList2.getIdentifier(), "onActivated", throwable);
            }
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.d;
        Object object = this.b;
        ArrayList arrayList = new ArrayList();
        Iterator iterator = ((CopyOnWriteArrayList)object).iterator();
        while (iterator.hasNext()) {
            object = ((ModuleClientEntryPoint)iterator.next()).getAdRevenueCollector();
            if (object == null) continue;
            arrayList.add(object);
        }
        object = new ArrayList();
        for (Object e11 : arrayList) {
            if (!((AdRevenueCollector)e11).getEnabled()) continue;
            ((ArrayList)object).add(e11);
        }
        ArrayList<String> arrayList2 = new ArrayList<String>(t.x((Iterable)object, (int)10));
        object = ((ArrayList)object).iterator();
        while (object.hasNext()) {
            arrayList2.add(((AdRevenueCollector)object.next()).getSourceIdentifier());
        }
        copyOnWriteArrayList.addAll(arrayList2);
    }
}

