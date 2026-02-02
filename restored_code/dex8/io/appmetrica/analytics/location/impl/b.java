/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.LocationListener
 */
package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import io.appmetrica.analytics.location.impl.a;
import io.appmetrica.analytics.location.impl.d;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

public final class b
implements LastKnownLocationExtractor {
    public final Context a;
    public final PermissionResolutionStrategy b;
    public final LocationListener c;
    public final IHandlerExecutor d;
    public final d e;

    public b(@NotNull Context context, @NotNull PermissionResolutionStrategy permissionResolutionStrategy, @NotNull LocationListener locationListener, @NotNull IHandlerExecutor iHandlerExecutor) {
        this.a = context;
        this.b = permissionResolutionStrategy;
        this.c = locationListener;
        this.d = iHandlerExecutor;
        this.e = new d();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void updateLastKnownLocation() {
        block7: {
            if (!this.b.hasNecessaryPermissions(this.a)) ** GOTO lbl19
            var2_1 = this.e;
            var3_4 = this.a;
            var4_5 = this.c;
            var5_6 = this.d;
            var2_1.getClass();
            var1_7 = ReflectionUtils.detectClassExists("com.google.android.gms.location.LocationRequest");
            if (!var1_7) break block7;
            try {
                var2_1 = new GplLibraryWrapper(var3_4, var4_5, var5_6.getLooper(), (Executor)var5_6, TimeUnit.SECONDS.toMillis(1L));

            }
            catch (Throwable var2_3) {

            }
        }
lbl15:

        while (true) {
            try {
                var2_1 = new a();
lbl18:

                var2_1.updateLastKnownLocation();
lbl19:

                return;
            }
            catch (Throwable var2_2) {

            }
            break;
        }
    }
}

