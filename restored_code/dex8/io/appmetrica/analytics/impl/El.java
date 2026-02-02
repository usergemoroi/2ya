/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.Fb;
import io.appmetrica.analytics.impl.qf;

public final class el {
    public static final String d = "SESSION_SLEEP_START";
    public static final String e = "SESSION_LAST_EVENT_OFFSET";
    public static final String f = "SESSION_ID";
    public static final String g = "SESSION_COUNTER_ID";
    public static final String h = "SESSION_INIT_TIME";
    public static final String i = "SESSION_IS_ALIVE_REPORT_NEEDED";
    public final String a;
    @NonNull
    protected final qf b;
    public Fb c;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public el(@NonNull qf object, @NonNull String string2) {
        void var1_4;
        String string3;
        this.b = object;
        this.a = string3;
        Fb fb2 = new Fb();
        try {
            string3 = ((qf)object).h(string3);
            Fb fb4 = fb2;
            if (!TextUtils.isEmpty((CharSequence)string3)) {
                Fb fb5 = new Fb(string3);
            }
        }
        catch (Throwable throwable) {
            Fb fb6 = fb2;
        }
        this.c = var1_4;
    }

    public final el a(long l10) {
        this.a(h, l10);
        return this;
    }

    public final el a(boolean bl2) {
        this.a(i, bl2);
        return this;
    }

    public final void a() {
        this.c = new Fb();
        this.b();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(String string2, Object object) {
        try {
            this.c.put(string2, object);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public final el b(long l10) {
        this.a(e, l10);
        return this;
    }

    public final void b() {
        this.b.e(this.a, ((Object)((Object)this.c)).toString());
        this.b.b();
    }

    public final el c(long l10) {
        this.a(g, l10);
        return this;
    }

    @Nullable
    public final Long c() {
        return this.c.a(h);
    }

    public final el d(long l10) {
        this.a(f, l10);
        return this;
    }

    @Nullable
    public final Long d() {
        return this.c.a(e);
    }

    public final el e(long l10) {
        this.a(d, l10);
        return this;
    }

    @Nullable
    public final Long e() {
        return this.c.a(g);
    }

    @Nullable
    public final Long f() {
        return this.c.a(f);
    }

    @Nullable
    public final Long g() {
        return this.c.a(d);
    }

    public final boolean h() {
        boolean bl2 = this.c.length() > 0;
        return bl2;
    }

    @Nullable
    public final Boolean i() {
        Object object = this.c;
        ((Object)object).getClass();
        try {
            object = object.getBoolean(i);
        }
        catch (Throwable throwable) {
            object = null;
        }
        return object;
    }
}

