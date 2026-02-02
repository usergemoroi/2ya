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
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.impl.wo;
import io.appmetrica.analytics.impl.yo;
import java.util.Collection;

public final class te
implements yo {
    public final String a;

    public te(@NonNull String string2) {
        this.a = string2;
    }

    public final wo a(@Nullable Collection<Object> object) {
        if (ro.a(object)) {
            object = new StringBuilder();
            ((StringBuilder)object).append(this.a);
            ((StringBuilder)object).append(" is null or empty.");
            return new wo(this, false, ((StringBuilder)object).toString());
        }
        return new wo(this, true, "");
    }
}

