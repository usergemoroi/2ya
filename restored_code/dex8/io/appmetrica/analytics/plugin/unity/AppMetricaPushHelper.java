/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  org.json.JSONException
 */
package io.appmetrica.analytics.plugin.unity;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.plugin.unity.AppMetricaConfigSerializer;
import org.json.JSONException;

public class AppMetricaPushHelper {
    private AppMetricaPushHelper() {
    }

    public static AppMetricaConfig getAppMetricaConfigFromUnityJsonString(@NonNull String string2) throws JSONException {
        return AppMetricaConfigSerializer.fromJsonString(string2);
    }
}

