/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Map;

public interface IReporter {
    public void clearAppEnvironment();

    @NonNull
    public IPluginReporter getPluginExtension();

    public void pauseSession();

    public void putAppEnvironmentValue(@NonNull String var1, @Nullable String var2);

    public void reportAdRevenue(@NonNull AdRevenue var1);

    public void reportAnr(@NonNull Map<Thread, StackTraceElement[]> var1);

    public void reportECommerce(@NonNull ECommerceEvent var1);

    public void reportError(@NonNull String var1, @Nullable String var2);

    public void reportError(@NonNull String var1, @Nullable String var2, @Nullable Throwable var3);

    public void reportError(@NonNull String var1, @Nullable Throwable var2);

    public void reportEvent(@NonNull String var1);

    public void reportEvent(@NonNull String var1, @Nullable String var2);

    public void reportEvent(@NonNull String var1, @Nullable Map<String, Object> var2);

    public void reportRevenue(@NonNull Revenue var1);

    public void reportUnhandledException(@NonNull Throwable var1);

    public void reportUserProfile(@NonNull UserProfile var1);

    public void resumeSession();

    public void sendEventsBuffer();

    public void setDataSendingEnabled(boolean var1);

    public void setUserProfileID(@Nullable String var1);
}

