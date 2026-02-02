/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.pk;
import io.appmetrica.analytics.impl.tf;
import java.util.concurrent.TimeUnit;

public final class qk {
    public volatile long a;
    public tf b;
    public TimeProvider c;

    public static qk c() {
        return pk.a;
    }

    public final long a() {
        synchronized (this) {
            long l10 = System.currentTimeMillis() / 1000L;
            long l11 = this.a;
            return l10 + l11;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(long l10, @Nullable Long l11) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block4: {
                    block5: {
                        try {
                            this.a = (l10 - this.c.currentTimeMillis()) / 1000L;
                            tf tf2 = this.b;
                            boolean bl2 = true;
                            if (!tf2.b(true)) break block4;
                            if (l11 == null) break block5;
                            l10 = Math.abs(l10 - this.c.currentTimeMillis());
                            tf2 = this.b;
                            if (l10 <= TimeUnit.SECONDS.toMillis(l11)) {
                                bl2 = false;
                            }
                            tf2.d(bl2);
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    this.b.d(false);
                }
                this.b.d(this.a);
                this.b.b();
                return;
            }
            throw throwable2;
        }
    }

    @VisibleForTesting
    public final void a(tf tf2, TimeProvider timeProvider) {
        this.b = tf2;
        this.a = tf2.a(0);
        this.c = timeProvider;
    }

    public final void b() {
        synchronized (this) {
            this.b.d(false);
            this.b.b();
            return;
        }
    }

    public final long d() {
        synchronized (this) {
            long l10 = this.a;
            return l10;
        }
    }

    public final void e() {
        synchronized (this) {
            tf tf2 = Na.F.x();
            SystemTimeProvider systemTimeProvider = new SystemTimeProvider();
            this.a(tf2, systemTimeProvider);
            return;
        }
    }

    public final boolean f() {
        synchronized (this) {
            boolean bl2 = this.b.b(true);
            return bl2;
        }
    }
}

