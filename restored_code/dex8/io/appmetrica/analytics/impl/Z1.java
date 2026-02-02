/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.y1;

public interface z1 {
    public /* synthetic */ void a(Intent var1);

    public /* synthetic */ void a(Intent var1, int var2);

    public /* synthetic */ void a(Intent var1, int var2, int var3);

    public void a(@NonNull y1 var1);

    public /* synthetic */ void b(Intent var1);

    public /* synthetic */ void c(Intent var1);

    public /* synthetic */ void onConfigurationChanged(Configuration var1);

    public /* synthetic */ void onCreate();

    public /* synthetic */ void onDestroy();

    public void pauseUserSession(@NonNull Bundle var1);

    public void reportData(int var1, Bundle var2);

    public void resumeUserSession(@NonNull Bundle var1);
}

