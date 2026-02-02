/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.plugin.unity;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ReporterConfig;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

final class ReporterConfigSerializer {
    private ReporterConfigSerializer() {
    }

    @NonNull
    public static ReporterConfig fromJsonString(@NonNull String object) throws JSONException {
        JSONObject jSONObject = new JSONObject((String)object);
        object = ReporterConfig.newConfigBuilder(jSONObject.getString("ApiKey"));
        if (jSONObject.has("AppEnvironment")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("AppEnvironment");
            Iterator iterator = jSONObject2.keys();
            while (iterator.hasNext()) {
                String string2 = (String)iterator.next();
                ((ReporterConfig.Builder)object).withAppEnvironmentValue(string2, jSONObject2.getString(string2));
            }
        }
        if (jSONObject.has("DataSendingEnabled")) {
            ((ReporterConfig.Builder)object).withDataSendingEnabled(jSONObject.getBoolean("DataSendingEnabled"));
        }
        if (jSONObject.has("DispatchPeriodSeconds")) {
            ((ReporterConfig.Builder)object).withDispatchPeriodSeconds(jSONObject.getInt("DispatchPeriodSeconds"));
        }
        if (jSONObject.optBoolean("Logs", false)) {
            ((ReporterConfig.Builder)object).withLogs();
        }
        if (jSONObject.has("MaxReportsCount")) {
            ((ReporterConfig.Builder)object).withMaxReportsCount(jSONObject.getInt("MaxReportsCount"));
        }
        if (jSONObject.has("MaxReportsInDatabaseCount")) {
            ((ReporterConfig.Builder)object).withMaxReportsInDatabaseCount(jSONObject.getInt("MaxReportsInDatabaseCount"));
        }
        if (jSONObject.has("SessionTimeout")) {
            ((ReporterConfig.Builder)object).withSessionTimeout(jSONObject.getInt("SessionTimeout"));
        }
        if (jSONObject.has("UserProfileID")) {
            ((ReporterConfig.Builder)object).withUserProfileID(jSONObject.getString("UserProfileID"));
        }
        return ((ReporterConfig.Builder)object).build();
    }
}

