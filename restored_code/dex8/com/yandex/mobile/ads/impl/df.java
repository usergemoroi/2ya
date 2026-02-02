/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.xe
 *  com.yandex.mobile.ads.impl.ye
 *  com.yandex.mobile.ads.impl.ze
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.xe;
import com.yandex.mobile.ads.impl.ye;
import com.yandex.mobile.ads.impl.ze;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.StartupParamsItem;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class df
implements StartupParamsCallback {
    @NotNull
    private final ze a;

    public df(@NotNull ze ze2) {
        this.a = ze2;
    }

    @Override
    public final void onReceive(@Nullable StartupParamsCallback.Result object) {
        Object object2;
        Object object3;
        ze ze2 = this.a;
        String string2 = null;
        object3 = object != null && (object3 = ((StartupParamsCallback.Result)object).parameters) != null && (object3 = object3.get("appmetrica_uuid")) != null ? ((StartupParamsItem)object3).getId() : null;
        object2 = object != null && (object2 = ((StartupParamsCallback.Result)object).parameters) != null && (object2 = object2.get("appmetrica_device_id")) != null ? ((StartupParamsItem)object2).getId() : null;
        String string3 = string2;
        if (object != null) {
            object = ((StartupParamsCallback.Result)object).parameters;
            string3 = string2;
            if (object != null) {
                object = (StartupParamsItem)object.get("appmetrica_get_ad_url");
                string3 = string2;
                if (object != null) {
                    string3 = ((StartupParamsItem)object).getId();
                }
            }
        }
        ze2.a(new xe((String)object3, (String)object2, string3));
    }

    @Override
    public final void onRequestError(@NotNull StartupParamsCallback.Reason reason, @Nullable StartupParamsCallback.Result result2) {
        result2 = this.a;
        reason = y.e(reason, StartupParamsCallback.Reason.NETWORK) ? ye.c : (y.e(reason, StartupParamsCallback.Reason.INVALID_RESPONSE) ? ye.d : ye.b);
        result2.a((ye)reason);
    }
}

