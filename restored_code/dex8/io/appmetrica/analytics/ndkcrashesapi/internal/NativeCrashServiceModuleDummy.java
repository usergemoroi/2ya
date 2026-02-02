/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.ndkcrashesapi.internal;

import android.content.Context;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceConfig;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashServiceModule;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0018"}, d2={"Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashServiceModuleDummy;", "Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashServiceModule;", "Landroid/content/Context;", "context", "Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashServiceConfig;", "config", "Lkotlin/k0;", "init", "(Landroid/content/Context;Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashServiceConfig;)V", "Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashHandler;", "handler", "setDefaultCrashHandler", "(Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrashHandler;)V", "", "Lio/appmetrica/analytics/ndkcrashesapi/internal/NativeCrash;", "getAllCrashes", "()Ljava/util/List;", "", "uuid", "markCrashCompleted", "(Ljava/lang/String;)V", "deleteCompletedCrashes", "()V", "<init>", "ndkcrashes-api_release"}, k=1, mv={1, 6, 0})
public final class NativeCrashServiceModuleDummy
extends NativeCrashServiceModule {
    @Override
    public void deleteCompletedCrashes() {
    }

    @Override
    @NotNull
    public List<NativeCrash> getAllCrashes() {
        return t.m();
    }

    @Override
    public void init(@NotNull Context context, @NotNull NativeCrashServiceConfig nativeCrashServiceConfig) {
    }

    @Override
    public void markCrashCompleted(@NotNull String string2) {
    }

    @Override
    public void setDefaultCrashHandler(@Nullable NativeCrashHandler nativeCrashHandler) {
    }
}

