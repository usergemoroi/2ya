/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.impl.Ci;
import io.appmetrica.analytics.impl.Lj;
import io.appmetrica.analytics.impl.Mj;
import io.appmetrica.analytics.impl.Nj;
import io.appmetrica.analytics.impl.Oj;
import io.appmetrica.analytics.impl.Pj;
import io.appmetrica.analytics.impl.Qj;
import io.appmetrica.analytics.impl.Rj;
import io.appmetrica.analytics.impl.Sj;
import io.appmetrica.analytics.impl.Tj;
import io.appmetrica.analytics.impl.U;
import io.appmetrica.analytics.impl.Uj;
import io.appmetrica.analytics.impl.Vj;
import io.appmetrica.analytics.impl.Wj;
import io.appmetrica.analytics.impl.Wn;
import io.appmetrica.analytics.impl.Xj;
import io.appmetrica.analytics.impl.Yj;
import io.appmetrica.analytics.impl.Zj;
import io.appmetrica.analytics.impl.ak;
import io.appmetrica.analytics.impl.bk;
import io.appmetrica.analytics.impl.ck;
import io.appmetrica.analytics.impl.dk;
import io.appmetrica.analytics.impl.ek;
import io.appmetrica.analytics.impl.fk;
import io.appmetrica.analytics.impl.gk;
import io.appmetrica.analytics.impl.hk;
import io.appmetrica.analytics.impl.ik;
import io.appmetrica.analytics.impl.jk;
import io.appmetrica.analytics.impl.kk;
import io.appmetrica.analytics.impl.qb;
import io.appmetrica.analytics.impl.rb;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.ArrayList;
import java.util.Map;

public final class lk
implements rb,
IPluginReporter {
    public final ArrayList a = new ArrayList();
    public volatile Ci b;

    @Override
    public final void a(@NonNull U u11) {
        this.a(new ek(u11));
    }

    @Override
    public final void a(@NonNull Wn wn3) {
        this.a(new Vj(wn3));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(qb qb3) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    block3: {
                        try {
                            if (this.b != null) break block3;
                            this.a.add(qb3);
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    qb3.a(this.b);
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public final void clearAppEnvironment() {
        this.a(new gk());
    }

    @Override
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this;
    }

    @Override
    public final void pauseSession() {
        this.a(new Pj());
    }

    @Override
    public final void putAppEnvironmentValue(@NonNull String string2, @Nullable String string3) {
        this.a(new fk(string2, string3));
    }

    @Override
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        this.a(new Wj(adRevenue));
    }

    @Override
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean bl2) {
        this.a(new ck(adRevenue, bl2));
    }

    @Override
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map2) {
        this.a(new dk(map2));
    }

    @Override
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        this.a(new Tj(eCommerceEvent));
    }

    @Override
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String string2) {
        this.a(new Yj(pluginErrorDetails, string2));
    }

    @Override
    public final void reportError(@NonNull String string2, @Nullable String string3) {
        this.a(new Mj(string2, string3, null));
    }

    @Override
    public final void reportError(@NonNull String string2, @Nullable String string3, @Nullable PluginErrorDetails pluginErrorDetails) {
        this.a(new Zj(string2, string3, pluginErrorDetails));
    }

    @Override
    public final void reportError(@NonNull String string2, @Nullable String string3, @NonNull Throwable throwable) {
        this.a(new Mj(string2, string3, throwable));
    }

    @Override
    public final void reportError(@NonNull String string2, @Nullable Throwable throwable) {
        this.a(new Lj(string2, throwable));
    }

    @Override
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
        this.a(new ak(moduleEvent));
    }

    @Override
    public final void reportEvent(@NonNull String string2) {
        this.a(new ik(string2));
    }

    @Override
    public final void reportEvent(@NonNull String string2, @Nullable String string3) {
        this.a(new jk(string2, string3));
    }

    @Override
    public final void reportEvent(@NonNull String string2, @Nullable Map<String, Object> map2) {
        this.a(new kk(string2, map2));
    }

    @Override
    public final void reportRevenue(@NonNull Revenue revenue) {
        this.a(new Sj(revenue));
    }

    @Override
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        this.a(new Xj(pluginErrorDetails));
    }

    @Override
    public final void reportUnhandledException(@NonNull Throwable throwable) {
        this.a(new Nj(throwable));
    }

    @Override
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
        this.a(new Rj(userProfile));
    }

    @Override
    public final void resumeSession() {
        this.a(new Oj());
    }

    @Override
    public final void sendEventsBuffer() {
        this.a(new hk());
    }

    @Override
    public final void setDataSendingEnabled(boolean bl2) {
        this.a(new Uj(bl2));
    }

    @Override
    public final void setSessionExtra(@NonNull String string2, @Nullable byte[] byArray) {
        this.a(new bk(string2, byArray));
    }

    @Override
    public final void setUserProfileID(@Nullable String string2) {
        this.a(new Qj(string2));
    }
}

