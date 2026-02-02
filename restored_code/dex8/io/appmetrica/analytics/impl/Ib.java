/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.location.Location
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.impl.Mo;
import io.appmetrica.analytics.impl.db;
import io.appmetrica.analytics.impl.hd;
import io.appmetrica.analytics.impl.m;
import java.util.List;

public interface ib
extends db,
hd {
    public void a(@Nullable Activity var1);

    @Override
    public /* synthetic */ void a(@Nullable Location var1);

    public void a(@NonNull AnrListener var1);

    public void a(@NonNull ExternalAttribution var1);

    public void a(@NonNull Mo var1);

    public void a(@NonNull m var1);

    @Override
    public /* synthetic */ void a(@NonNull String var1);

    @Override
    public /* synthetic */ void a(String var1, String var2);

    public void a(@NonNull String var1, boolean var2);

    @Override
    public /* synthetic */ void a(boolean var1);

    public void b(@Nullable Activity var1);

    @Override
    public /* synthetic */ void b(@NonNull String var1);

    @Override
    public /* synthetic */ void b(@NonNull String var1, @Nullable String var2);

    @Override
    public /* synthetic */ void b(boolean var1);

    @Override
    public /* synthetic */ boolean b();

    public void c();

    public void c(@NonNull String var1);

    public List<String> f();
}

