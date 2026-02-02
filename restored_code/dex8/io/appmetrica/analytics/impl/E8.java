/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.P5;
import io.appmetrica.analytics.impl.of;
import io.appmetrica.analytics.impl.rd;
import io.appmetrica.analytics.impl.sd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;

public final class e8
implements ServiceComponentsInitializer {
    public final List a = t.p((Object[])new String[]{"io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudServiceModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint"});

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void onCreate(@NotNull Context context) {
        sd sd3 = Na.F.s;
        Object object = this.a;
        rd[] rdArray = new ArrayList(t.x((Iterable)object, (int)10));
        object = object.iterator();
        while (object.hasNext()) {
            rdArray.add(new P5((String)object.next()));
        }
        if ((rdArray = rdArray.toArray(new P5[0])) != null) {
            rdArray = Arrays.copyOf(rdArray, rdArray.length);
            synchronized (sd3) {
                t.G((Collection)sd3.a, (Object[])rdArray);
            }
            Na.F.s.a(new of(context, "io.appmetrica.analytics.modules.ads", "lsm"));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}

