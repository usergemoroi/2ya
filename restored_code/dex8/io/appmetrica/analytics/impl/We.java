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
import io.appmetrica.analytics.impl.wo;
import io.appmetrica.analytics.impl.yo;

public final class we
implements yo {
    public final String a;

    public we(@NonNull String string2) {
        this.a = string2;
    }

    @Override
    public final wo a(@Nullable Object object) {
        if (object == null) {
            object = new StringBuilder();
            ((StringBuilder)object).append(this.a);
            ((StringBuilder)object).append(" is null.");
            return new wo(this, false, ((StringBuilder)object).toString());
        }
        return new wo(this, true, "");
    }

    @NonNull
    public final String a() {
        return this.a;
    }
}

