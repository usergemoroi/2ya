/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.P5;
import io.appmetrica.analytics.impl.rd;
import io.appmetrica.analytics.impl.sd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.t;

public final class b8
implements ClientComponentsInitializer {
    public final List a = t.p((Object[])new String[]{"io.appmetrica.analytics.adrevenue.admob.v23.internal.AdMobClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.applovin.v12.internal.AppLovinClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.fyber.v3.internal.FyberClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.ironsource.v7.internal.IronSourceClientModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudClientModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotClientModuleEntryPoint", "io.appmetrica.analytics.reporterextension.internal.ReporterExtensionClientModuleEntryPoint"});

    @Override
    public final void onCreate() {
        if (A4.l().a.b()) {
            sd sd3 = A4.l().m;
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
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
        }
    }
}

