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
import io.appmetrica.analytics.impl.v0;
import io.appmetrica.analytics.impl.w0;
import io.appmetrica.analytics.impl.wo;
import io.appmetrica.analytics.impl.yo;

public final class ql
implements yo {
    public final w0 a;

    public ql(@NonNull w0 w04) {
        this.a = w04;
    }

    public final wo a() {
        return this.a(null);
    }

    public final wo a(@Nullable Void object) {
        this.a.getClass();
        synchronized (v0.class) {
            boolean bl2 = v0.f;
            object = bl2 ? new wo(this, true, "") : new wo(this, false, "AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate.");
            return object;
        }
    }
}

