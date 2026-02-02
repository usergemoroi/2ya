/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.pm.PackageManager
 *  android.content.pm.ProviderInfo
 *  androidx.webkit.internal.u0
 */
package io.appmetrica.analytics.coreutils.internal.services;

import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import androidx.webkit.internal.u0;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreutils.internal.services.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c1\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\b\u0010\t\u00a8\u0006\r"}, d2={"Lio/appmetrica/analytics/coreutils/internal/services/PackageManagerUtilsTiramisu;", "", "Landroid/content/pm/PackageManager;", "packageManager", "", "uri", "Landroid/content/pm/ProviderInfo;", "resolveContentProvider", "a", "Ljava/lang/String;", "tag", "<init>", "()V", "core-utils_release"}, k=1, mv={1, 6, 0})
@TargetApi(value=33)
@DoNotInline
public final class PackageManagerUtilsTiramisu {
    @NotNull
    public static final PackageManagerUtilsTiramisu INSTANCE = new PackageManagerUtilsTiramisu();
    @NotNull
    private static final String a = "[PackageManagerUtilsTiramisu]";

    private PackageManagerUtilsTiramisu() {
    }

    @Nullable
    public final ProviderInfo resolveContentProvider(@NotNull PackageManager packageManager, @NotNull String string2) {
        try {
            packageManager = c.a(packageManager, string2, u0.a((long)8L));
        }
        catch (Throwable throwable) {
            packageManager = null;
        }
        return packageManager;
    }
}

