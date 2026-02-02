/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
 *  com.yandex.varioqub.appmetricaadapter.impl.d
 *  kotlin.collections.t
 */
package com.yandex.varioqub.appmetricaadapter.impl;

import android.content.Context;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import com.yandex.varioqub.appmetricaadapter.impl.a;
import com.yandex.varioqub.appmetricaadapter.impl.b;
import com.yandex.varioqub.appmetricaadapter.impl.d;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.IModuleReporter;
import io.appmetrica.analytics.ModulesFacade;
import java.util.LinkedHashMap;
import kotlin.collections.t;

public final class c
implements d {
    public IModuleReporter a;

    public final void a(Context context, AdapterIdentifiersCallback adapterIdentifiersCallback) {
        AppMetrica.requestStartupParams(context, new a(adapterIdentifiersCallback), t.e((Object)"appmetrica_device_id"));
    }

    public final void a(Context context, String string2) {
        this.a = ModulesFacade.getModuleReporter(context, string2);
    }

    public final void a(LinkedHashMap linkedHashMap) {
        AppMetrica.reportEvent("com.yandex.varioqub.activate_config", linkedHashMap);
    }

    public final void a(byte[] byArray) {
        IModuleReporter iModuleReporter = this.a;
        if (iModuleReporter != null) {
            iModuleReporter.setSessionExtra("varioqub", byArray);
        } else {
            ModulesFacade.setSessionExtra("varioqub", byArray);
        }
    }

    public final void b(Context context, AdapterIdentifiersCallback adapterIdentifiersCallback) {
        AppMetrica.requestStartupParams(context, new b(adapterIdentifiersCallback), t.e((Object)"appmetrica_uuid"));
    }
}

