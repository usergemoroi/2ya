/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.collection.a
 *  androidx.compose.animation.a
 */
package io.appmetrica.analytics.screenshot.impl;

import androidx.compose.animation.a;
import io.appmetrica.analytics.screenshot.impl.F;
import kotlin.jvm.internal.y;

public final class m {
    public final boolean a;
    public final long b;

    public m(F f11) {
        this(f11.b(), f11.a());
    }

    public m(boolean bl2, long l10) {
        this.a = bl2;
        this.b = l10;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        Class<?> clazz = object != null ? object.getClass() : null;
        if (!y.e(m.class, clazz)) {
            return false;
        }
        if (object != null) {
            object = (m)object;
            if (this.a != ((m)object).a) {
                return false;
            }
            return this.b == ((m)object).b;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideServiceCaptorConfig");
    }

    public final int hashCode() {
        int n10 = androidx.compose.animation.a.a((boolean)this.a);
        return androidx.collection.a.a((long)this.b) + n10 * 31;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ClientSideServiceCaptorConfig(enabled=");
        stringBuilder.append(this.a);
        stringBuilder.append(", delaySeconds=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

