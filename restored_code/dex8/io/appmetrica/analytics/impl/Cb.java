/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  android.os.Bundle
 *  androidx.annotation.AnyThread
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.WorkerThread
 */
package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.impl.Jc;
import io.appmetrica.analytics.impl.Z6;
import io.appmetrica.analytics.impl.hd;
import io.appmetrica.analytics.impl.rb;
import io.appmetrica.analytics.impl.sb;
import io.appmetrica.analytics.impl.tb;
import io.appmetrica.analytics.impl.xa;
import java.util.List;
import java.util.Map;

public interface cb
extends hd,
Z6,
tb {
    @Override
    @NonNull
    public /* synthetic */ sb a();

    @Override
    public /* synthetic */ void a(int var1, @NonNull Bundle var2);

    @Override
    public /* synthetic */ void a(@Nullable Location var1);

    @WorkerThread
    public void a(@NonNull AppMetricaLibraryAdapterConfig var1);

    @WorkerThread
    public void a(DeferredDeeplinkListener var1);

    @WorkerThread
    public void a(DeferredDeeplinkParametersListener var1);

    @WorkerThread
    public void a(@NonNull ReporterConfig var1);

    @WorkerThread
    public void a(@NonNull StartupParamsCallback var1, @NonNull List<String> var2);

    @Override
    public /* synthetic */ void a(@NonNull String var1);

    @Override
    public /* synthetic */ void a(String var1, String var2);

    @Override
    public /* synthetic */ void a(boolean var1);

    @WorkerThread
    public void b(@NonNull AppMetricaConfig var1);

    @Override
    public /* synthetic */ void b(boolean var1);

    @NonNull
    @WorkerThread
    public rb c(@NonNull ReporterConfig var1);

    @Override
    public /* synthetic */ void clearAppEnvironment();

    @AnyThread
    @NonNull
    public xa d();

    @AnyThread
    @Nullable
    public String e();

    @AnyThread
    @Nullable
    public Map<String, String> g();

    @AnyThread
    @NonNull
    public AdvIdentifiersResult h();

    @AnyThread
    @Nullable
    public Jc i();

    @Override
    public /* synthetic */ void putAppEnvironmentValue(String var1, String var2);

    @Override
    public /* synthetic */ void setDataSendingEnabled(boolean var1);

    @Override
    public /* synthetic */ void setUserProfileID(@Nullable String var1);
}

