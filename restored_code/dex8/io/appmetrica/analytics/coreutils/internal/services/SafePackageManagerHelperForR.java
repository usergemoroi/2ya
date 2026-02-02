/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.pm.InstallSourceInfo
 *  android.content.pm.PackageManager
 *  com.adjust.sdk.h1
 *  com.adjust.sdk.j1
 */
package io.appmetrica.analytics.coreutils.internal.services;

import android.annotation.TargetApi;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import com.adjust.sdk.h1;
import com.adjust.sdk.j1;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007\u00a8\u0006\b"}, d2={"Lio/appmetrica/analytics/coreutils/internal/services/SafePackageManagerHelperForR;", "", "()V", "extractPackageInstaller", "", "packageManager", "Landroid/content/pm/PackageManager;", "packageName", "core-utils_release"}, k=1, mv={1, 6, 0}, xi=48)
@TargetApi(value=30)
@DoNotInline
public final class SafePackageManagerHelperForR {
    @NotNull
    public static final SafePackageManagerHelperForR INSTANCE = new SafePackageManagerHelperForR();

    private SafePackageManagerHelperForR() {
    }

    @JvmStatic
    @Nullable
    public static final String extractPackageInstaller(@NotNull PackageManager packageManager, @NotNull String string2) {
        return j1.a((InstallSourceInfo)h1.a((PackageManager)packageManager, (String)string2));
    }
}

