/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  androidx.annotation.Nullable
 *  androidx.appcompat.app.AppCompatActivity
 */
package io.intercom.android.sdk.activities;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.ContextLocaliser;

public abstract class IntercomBaseActivity
extends AppCompatActivity {
    private Context localizedContext(Context context) {
        AppConfig appConfig = Injector.get().getAppConfigProvider().get();
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(ContextLocaliser.convertToLocale(appConfig.getLocale()));
        return context.createConfigurationContext(configuration);
    }

    protected void attachBaseContext(Context context) {
        super.attachBaseContext(this.localizedContext(context));
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Injector.get().getActivityFinisher().register((Activity)this);
    }

    protected void onDestroy() {
        super.onDestroy();
        Injector.get().getActivityFinisher().unregister((Activity)this);
    }
}

