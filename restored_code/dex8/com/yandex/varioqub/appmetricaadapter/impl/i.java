/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.metrica.IIdentifierCallback
 *  com.yandex.metrica.ModulesFacade
 *  com.yandex.metrica.YandexMetrica
 *  com.yandex.metrica.p
 *  com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
 *  com.yandex.varioqub.appmetricaadapter.impl.d
 *  com.yandex.varioqub.appmetricaadapter.impl.g
 *  com.yandex.varioqub.appmetricaadapter.impl.h
 */
package com.yandex.varioqub.appmetricaadapter.impl;

import android.content.Context;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.ModulesFacade;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.p;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import com.yandex.varioqub.appmetricaadapter.impl.d;
import com.yandex.varioqub.appmetricaadapter.impl.g;
import com.yandex.varioqub.appmetricaadapter.impl.h;
import java.util.LinkedHashMap;
import java.util.Map;

public final class i
implements d {
    public final void a(Context context, AdapterIdentifiersCallback adapterIdentifiersCallback) {
        p.a((Context)context, (IIdentifierCallback)new g(adapterIdentifiersCallback), (String[])new String[]{"yandex_mobile_metrica_device_id"});
    }

    public final void a(Context context, String string2) {
    }

    public final void a(LinkedHashMap linkedHashMap) {
        YandexMetrica.reportEvent((String)"com.yandex.varioqub.activate_config", (Map)linkedHashMap);
    }

    public final void a(byte[] byArray) {
        ModulesFacade.setSessionExtra((String)"varioqub", (byte[])byArray);
    }

    public final void b(Context context, AdapterIdentifiersCallback adapterIdentifiersCallback) {
        p.a((Context)context, (IIdentifierCallback)new h(adapterIdentifiersCallback), (String[])new String[]{"yandex_mobile_metrica_uuid"});
    }
}

