/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.b1
 */
package io.appmetrica.analytics.remotepermissions.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Set;
import kotlin.collections.b1;
import org.jetbrains.annotations.NotNull;

public final class e
implements PermissionStrategy {
    public Set a = b1.f();

    public final void a(@NotNull Set<String> set) {
        synchronized (this) {
            this.a = set;
            return;
        }
    }

    @Override
    public final boolean forbidUsePermission(@NotNull String string2) {
        synchronized (this) {
            boolean bl2 = this.a.contains(string2);
            return bl2 ^ true;
        }
    }
}

