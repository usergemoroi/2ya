/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
 */
package com.yandex.varioqub.appmetricaadapter.impl;

import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import io.appmetrica.analytics.StartupParamsCallback;

public final class b
implements StartupParamsCallback {
    public final AdapterIdentifiersCallback a;

    public b(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.a = adapterIdentifiersCallback;
    }

    @Override
    public final void onReceive(StartupParamsCallback.Result object) {
        AdapterIdentifiersCallback adapterIdentifiersCallback;
        block3: {
            block2: {
                adapterIdentifiersCallback = this.a;
                if (object == null) break block2;
                String string2 = ((StartupParamsCallback.Result)object).uuid;
                object = string2;
                if (string2 != null) break block3;
            }
            object = "";
        }
        adapterIdentifiersCallback.onSuccess((String)object);
    }

    @Override
    public final void onRequestError(StartupParamsCallback.Reason reason, StartupParamsCallback.Result result2) {
        this.a.onError(reason.value);
    }
}

