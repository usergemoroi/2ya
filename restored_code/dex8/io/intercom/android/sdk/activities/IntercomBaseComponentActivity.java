/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  androidx.appcompat.app.AppCompatActivity
 */
package io.intercom.android.sdk.activities;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.ContextLocaliser;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0011"}, d2={"Lio/intercom/android/sdk/activities/IntercomBaseComponentActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/content/Context;", "context", "localizedContext", "(Landroid/content/Context;)Landroid/content/Context;", "newBase", "Lkotlin/k0;", "attachBaseContext", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "()V", "<init>", "intercom-sdk-base_release"}, k=1, mv={1, 8, 0})
public abstract class IntercomBaseComponentActivity
extends AppCompatActivity {
    private final Context localizedContext(Context context) {
        AppConfig appConfig = Injector.get().getAppConfigProvider().get();
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(ContextLocaliser.convertToLocale(appConfig.getLocale()));
        context = context.createConfigurationContext(configuration);
        y.i(context, "context.createConfigurat\u2026t(localisedConfiguration)");
        return context;
    }

    protected void attachBaseContext(@NotNull Context context) {
        y.j(context, "newBase");
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

