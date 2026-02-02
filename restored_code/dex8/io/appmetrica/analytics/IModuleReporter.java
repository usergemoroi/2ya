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
import io.appmetrica.analytics.ModuleEvent;

public interface IModuleReporter {
    public void reportAdRevenue(@NonNull AdRevenue var1, boolean var2);

    public void reportEvent(@NonNull ModuleEvent var1);

    public void sendEventsBuffer();

    public void setSessionExtra(@NonNull String var1, @Nullable byte[] var2);
}

