/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.ProviderInfo
 *  android.content.pm.ResolveInfo
 *  android.content.pm.ServiceInfo
 *  android.os.Bundle
 *  kotlin.jvm.functions.a
 */
package io.appmetrica.analytics.coreutils.internal.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import io.appmetrica.analytics.coreutils.impl.b;
import io.appmetrica.analytics.coreutils.impl.c;
import io.appmetrica.analytics.coreutils.impl.d;
import io.appmetrica.analytics.coreutils.impl.e;
import io.appmetrica.analytics.coreutils.impl.f;
import io.appmetrica.analytics.coreutils.impl.g;
import io.appmetrica.analytics.coreutils.impl.h;
import io.appmetrica.analytics.coreutils.impl.i;
import io.appmetrica.analytics.coreutils.impl.j;
import io.appmetrica.analytics.coreutils.impl.k;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b/\u00100J\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\u0007\u0010\u000bJ'\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b#\u0010$J/\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\f2\u0006\u0010%\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\u00020*2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0004\u00a2\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b-\u0010.\u00a8\u00061"}, d2={"Lio/appmetrica/analytics/coreutils/internal/services/SafePackageManager;", "", "Landroid/content/Context;", "context", "", "packageName", "Landroid/content/pm/PackageInfo;", "getPackageInfo", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/pm/PackageInfo;", "", "flags", "(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/pm/PackageInfo;", "Landroid/content/ComponentName;", "component", "Landroid/content/pm/ServiceInfo;", "getServiceInfo", "(Landroid/content/Context;Landroid/content/ComponentName;I)Landroid/content/pm/ServiceInfo;", "Landroid/content/Intent;", "intent", "Landroid/content/pm/ResolveInfo;", "resolveService", "(Landroid/content/Context;Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;", "resolveActivity", "authority", "Landroid/content/pm/ProviderInfo;", "resolveContentProvider", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/pm/ProviderInfo;", "Landroid/content/pm/ApplicationInfo;", "getApplicationInfo", "(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;", "Landroid/os/Bundle;", "getApplicationMetaData", "(Landroid/content/Context;)Landroid/os/Bundle;", "componentName", "Landroid/content/pm/ActivityInfo;", "getActivityInfo", "(Landroid/content/Context;Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;", "newState", "Lkotlin/k0;", "setComponentEnabledSetting", "(Landroid/content/Context;Landroid/content/ComponentName;II)Lkotlin/k0;", "name", "", "hasSystemFeature", "(Landroid/content/Context;Ljava/lang/String;)Z", "getInstallerPackageName", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "<init>", "()V", "core-utils_release"}, k=1, mv={1, 6, 0})
public final class SafePackageManager {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Object a(Boolean object, a object2) {
        try {
            Object object3 = object2.invoke();
            if (object3 != null) return object3;
            return object;
        }
        catch (Throwable throwable) {
            return object;
        }
    }

    @Nullable
    public final ActivityInfo getActivityInfo(@NotNull Context context, @NotNull ComponentName componentName, int n10) {
        return (ActivityInfo)SafePackageManager.a(null, new io.appmetrica.analytics.coreutils.impl.a(context, componentName, n10));
    }

    @Nullable
    public final ApplicationInfo getApplicationInfo(@NotNull Context context, @NotNull String string2, int n10) {
        return (ApplicationInfo)SafePackageManager.a(null, new b(context, string2, n10));
    }

    @Nullable
    public final Bundle getApplicationMetaData(@NotNull Context context) {
        return (Bundle)SafePackageManager.a(null, new c(this, context));
    }

    @Nullable
    public final String getInstallerPackageName(@NotNull Context context, @NotNull String string2) {
        return (String)SafePackageManager.a(null, new d(context, string2));
    }

    @Nullable
    public final PackageInfo getPackageInfo(@NotNull Context context, @NotNull String string2) {
        return this.getPackageInfo(context, string2, 0);
    }

    @Nullable
    public final PackageInfo getPackageInfo(@NotNull Context context, @NotNull String string2, int n10) {
        return (PackageInfo)SafePackageManager.a(null, new e(context, string2, n10));
    }

    @Nullable
    public final ServiceInfo getServiceInfo(@NotNull Context context, @NotNull ComponentName componentName, int n10) {
        return (ServiceInfo)SafePackageManager.a(null, new f(context, componentName, n10));
    }

    public final boolean hasSystemFeature(@NotNull Context context, @NotNull String string2) {
        return (Boolean)SafePackageManager.a(Boolean.FALSE, new g(context, string2));
    }

    @Nullable
    public final ResolveInfo resolveActivity(@NotNull Context context, @NotNull Intent intent, int n10) {
        return (ResolveInfo)SafePackageManager.a(null, new h(context, intent, n10));
    }

    @Nullable
    public final ProviderInfo resolveContentProvider(@NotNull Context context, @NotNull String string2) {
        return (ProviderInfo)SafePackageManager.a(null, new i(context, string2));
    }

    @Nullable
    public final ResolveInfo resolveService(@NotNull Context context, @NotNull Intent intent, int n10) {
        return (ResolveInfo)SafePackageManager.a(null, new j(context, intent, n10));
    }

    @Nullable
    public final k0 setComponentEnabledSetting(@NotNull Context context, @NotNull ComponentName componentName, int n10, int n13) {
        return (k0)SafePackageManager.a(null, new k(context, componentName, n10, n13));
    }
}

