/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.google.auto.value.AutoValue
 */
package io.intercom.android.sdk.identity;

import android.content.Context;
import com.google.auto.value.AutoValue;
import io.intercom.android.sdk.identity.AutoValue_AppIdentity;

@AutoValue
public abstract class AppIdentity {
    private static final String PREFS_API_KEY = "ApiKey";
    private static final String PREFS_APP_ID = "AppId";

    public static AppIdentity create(String string2, String string3) {
        return new AutoValue_AppIdentity(string2, string3);
    }

    public static AppIdentity loadFromDevice(Context context) {
        context = context.getSharedPreferences("INTERCOM_SDK_PREFS", 0);
        return AppIdentity.create(context.getString(PREFS_API_KEY, ""), context.getString(PREFS_APP_ID, ""));
    }

    public abstract String apiKey();

    public abstract String appId();

    public void persist(Context context) {
        context.getSharedPreferences("INTERCOM_SDK_PREFS", 0).edit().putString(PREFS_API_KEY, this.apiKey()).putString(PREFS_APP_ID, this.appId()).apply();
    }
}

