/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.coreutils.internal.permission;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J&\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&\u00a8\u0006\r"}, d2={"Lio/appmetrica/analytics/coreutils/internal/permission/MultiplePermissionBaseStrategy;", "Lio/appmetrica/analytics/coreapi/internal/permission/PermissionResolutionStrategy;", "Landroid/content/Context;", "context", "", "hasNecessaryPermissions", "Lio/appmetrica/analytics/coreapi/internal/system/PermissionExtractor;", "permissionExtractor", "", "", "permissions", "<init>", "(Lio/appmetrica/analytics/coreapi/internal/system/PermissionExtractor;Ljava/util/List;)V", "core-utils_release"}, k=1, mv={1, 6, 0})
public abstract class MultiplePermissionBaseStrategy
implements PermissionResolutionStrategy {
    private final PermissionExtractor a;
    private final List b;

    public MultiplePermissionBaseStrategy(@NotNull PermissionExtractor permissionExtractor, @NotNull List<String> list) {
        this.a = permissionExtractor;
        this.b = list;
    }

    @Override
    public boolean hasNecessaryPermissions(@NotNull Context context) {
        boolean bl2 = this.b.isEmpty() || this.hasNecessaryPermissions(context, this.a, this.b);
        return bl2;
    }

    public abstract boolean hasNecessaryPermissions(@NotNull Context var1, @NotNull PermissionExtractor var2, @NotNull List<String> var3);
}

