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
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.impl.Nk;
import io.appmetrica.analytics.impl.Ok;
import io.appmetrica.analytics.impl.Pk;
import io.appmetrica.analytics.impl.Qk;
import io.appmetrica.analytics.impl.Zk;
import io.appmetrica.analytics.impl.al;
import io.appmetrica.analytics.impl.el;
import io.appmetrica.analytics.impl.rb;
import io.appmetrica.analytics.impl.v5;
import java.util.concurrent.TimeUnit;

public abstract class g {
    public final v5 a;
    public final al b;
    public final el c;
    public final Zk d;
    public final rb e;
    public final SystemTimeProvider f;

    public g(@NonNull v5 v54, @NonNull al al2, @NonNull el el3, @NonNull Zk zk2, @NonNull rb rb2, @NonNull SystemTimeProvider systemTimeProvider) {
        this.a = v54;
        this.b = al2;
        this.c = el3;
        this.d = zk2;
        this.e = rb2;
        this.f = systemTimeProvider;
    }

    @NonNull
    public final Nk a(@NonNull Ok ok2) {
        if (this.c.h()) {
            this.e.reportEvent("create session with non-empty storage");
        }
        v5 v54 = this.a;
        el el3 = this.c;
        long l10 = this.b.a();
        el el4 = this.c;
        el4.a("SESSION_ID", l10);
        el4.a("SESSION_SLEEP_START", ok2.a);
        el4.a("SESSION_INIT_TIME", ok2.a);
        el4.a("SESSION_COUNTER_ID", 0L);
        el4.a("SESSION_IS_ALIVE_REPORT_NEEDED", Boolean.TRUE);
        el4.b();
        this.a.e.a(l10, this.d.a, TimeUnit.MILLISECONDS.toSeconds(ok2.b));
        return new Nk(v54, el3, this.a(), new SystemTimeProvider());
    }

    public final Qk a() {
        Pk pk3 = new Pk(this.d);
        pk3.g = this.c.i();
        pk3.f = this.c.c.a("SESSION_COUNTER_ID");
        pk3.d = this.c.c.a("SESSION_INIT_TIME");
        pk3.c = this.c.c.a("SESSION_ID");
        pk3.h = this.c.c.a("SESSION_SLEEP_START");
        pk3.a = this.c.c.a("SESSION_LAST_EVENT_OFFSET");
        return new Qk(pk3);
    }

    @Nullable
    public final Nk b() {
        if (this.c.h()) {
            return new Nk(this.a, this.c, this.a(), this.f);
        }
        return null;
    }
}

