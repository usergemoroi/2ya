/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.animation.a
 */
package io.appmetrica.analytics.screenshot.impl;

import androidx.compose.animation.a;
import io.appmetrica.analytics.screenshot.impl.x;
import kotlin.jvm.internal.y;

public final class i {
    public final boolean a;

    public i(x x10) {
        this(x10.a());
    }

    public i(boolean bl2) {
        this.a = bl2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        Class<?> clazz = object != null ? object.getClass() : null;
        if (!y.e(i.class, clazz)) {
            return false;
        }
        if (object != null) {
            object = (i)object;
            if (this.a != ((i)object).a) {
                bl2 = false;
            }
            return bl2;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideApiCaptorConfig");
    }

    public final int hashCode() {
        return androidx.compose.animation.a.a((boolean)this.a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ClientSideApiCaptorConfig(enabled=");
        stringBuilder.append(this.a);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

