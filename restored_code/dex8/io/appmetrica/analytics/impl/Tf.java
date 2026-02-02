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
import io.appmetrica.analytics.impl.Ho;
import io.appmetrica.analytics.impl.Td;
import io.appmetrica.analytics.impl.hb;
import io.appmetrica.analytics.impl.oe;
import io.appmetrica.analytics.impl.rf;
import io.appmetrica.analytics.impl.sf;
import java.util.Set;

public final class tf
extends Td
implements Ho {
    public static final sf d = new sf("LOCATION_TRACKING_ENABLED", null);
    public static final sf e = new sf("PREF_KEY_OFFSET", null);
    public static final sf f = new sf("UNCHECKED_TIME", null);
    public static final sf g = new sf("STATISTICS_RESTRICTED_IN_MAIN", null);
    public static final sf h = new sf("LAST_IDENTITY_LIGHT_SEND_TIME", null);
    public static final sf i = new sf("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);
    public static final sf j = new sf("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);
    public static final sf k = new sf("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);
    public static final sf l = new sf("LAST_REPORT_SEND_ATTEMPT_TIME", null);
    public static final sf m = new sf("LAST_LOCATION_SEND_ATTEMPT_TIME", null);
    public static final sf n = new sf("LAST_STARTUP_SEND_ATTEMPT_TIME", null);
    public static final sf o = new sf("SATELLITE_PRELOAD_INFO_CHECKED", null);
    public static final sf p = new sf("SATELLITE_CLIDS_CHECKED", null);
    public static final sf q = new sf("VITAL_DATA", null);
    public static final sf r = new sf("LAST_KOTLIN_VERSION_SEND_TIME", null);
    public static final sf s = new sf("ADV_IDENTIFIERS_TRACKING_ENABLED", null);

    public tf(hb hb4) {
        super(hb4);
    }

    public final int a(@NonNull oe object, int n10) {
        int n13 = object.ordinal();
        object = n13 != 0 ? (n13 != 1 ? (n13 != 2 ? null : k) : j) : i;
        if (object != null) {
            object = ((sf)object).b;
            n10 = this.a.getInt((String)object, n10);
        }
        return n10;
    }

    public final long a(int n10) {
        String string2 = tf.e.b;
        long l10 = n10;
        return this.a.getLong(string2, l10);
    }

    public final long a(long l10) {
        String string2 = tf.h.b;
        return this.a.getLong(string2, l10);
    }

    public final long a(@NonNull oe object, long l10) {
        int n10 = object.ordinal();
        object = n10 != 0 ? (n10 != 1 ? (n10 != 2 ? null : n) : m) : l;
        if (object != null) {
            object = ((sf)object).b;
            l10 = this.a.getLong((String)object, l10);
        }
        return l10;
    }

    @Override
    @Nullable
    public final String a() {
        String string2 = tf.q.b;
        return this.a.getString(string2, null);
    }

    @Override
    public final void a(@NonNull String string2) {
        ((rf)this.b(tf.q.b, string2)).b();
    }

    public final boolean a(boolean bl2) {
        String string2 = tf.s.b;
        return this.a.getBoolean(string2, bl2);
    }

    public final tf b(long l10) {
        return (tf)this.b(tf.h.b, l10);
    }

    public final tf b(@NonNull oe object, int n10) {
        int n13 = object.ordinal();
        object = n13 != 0 ? (n13 != 1 ? (n13 != 2 ? null : k) : j) : i;
        if (object != null) {
            return (tf)this.b(((sf)object).b, n10);
        }
        return this;
    }

    public final tf b(@NonNull oe object, long l10) {
        int n10 = object.ordinal();
        object = n10 != 0 ? (n10 != 1 ? (n10 != 2 ? null : n) : m) : l;
        if (object != null) {
            return (tf)this.b(((sf)object).b, l10);
        }
        return this;
    }

    public final boolean b(boolean bl2) {
        String string2 = tf.f.b;
        return this.a.getBoolean(string2, bl2);
    }

    public final tf c(long l10) {
        return (tf)this.b(tf.r.b, l10);
    }

    public final tf c(boolean bl2) {
        return (tf)this.b(tf.g.b, bl2);
    }

    @Override
    @NonNull
    public final Set<String> c() {
        return this.a.a();
    }

    public final tf d(long l10) {
        return (tf)this.b(tf.e.b, l10);
    }

    public final tf d(boolean bl2) {
        return (tf)this.b(tf.f.b, bl2);
    }

    @Nullable
    public final Boolean d() {
        sf sf2 = g;
        Object object = sf2.b;
        if (this.a.a((String)object)) {
            object = sf2.b;
            object = this.a.getBoolean((String)object, true);
        } else {
            object = null;
        }
        return object;
    }

    public final void e(boolean bl2) {
        ((rf)this.b(tf.s.b, bl2)).b();
    }

    public final boolean e() {
        String string2 = tf.d.b;
        return this.a.getBoolean(string2, false);
    }

    public final long f() {
        String string2 = tf.r.b;
        return this.a.getLong(string2, 0L);
    }

    @Override
    @NonNull
    public final String f(@NonNull String string2) {
        return new sf((String)string2, null).b;
    }

    public final void f(boolean bl2) {
        ((rf)this.b(tf.d.b, bl2)).b();
    }

    public final tf g() {
        return (tf)this.b(tf.p.b, true);
    }

    public final tf h() {
        return (tf)this.b(tf.o.b, true);
    }

    public final boolean i() {
        String string2 = tf.o.b;
        return this.a.getBoolean(string2, false);
    }

    public final boolean j() {
        String string2 = tf.p.b;
        return this.a.getBoolean(string2, false);
    }
}

