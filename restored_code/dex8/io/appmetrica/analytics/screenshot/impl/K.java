/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.compose.animation.a
 */
package io.appmetrica.analytics.screenshot.impl;

import androidx.compose.animation.a;
import io.appmetrica.analytics.screenshot.impl.l;
import kotlin.jvm.internal.y;

public final class k {
    public final boolean a;
    public final l b;

    public k(boolean bl2, l l10) {
        this.a = bl2;
        this.b = l10;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        Class<?> clazz = object != null ? object.getClass() : null;
        if (!y.e(k.class, clazz)) {
            return false;
        }
        if (object != null) {
            object = (k)object;
            if (this.a != ((k)object).a) {
                return false;
            }
            return y.e(this.b, ((k)object).b);
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideRemoteScreenshotConfig");
    }

    public final int hashCode() {
        int n10 = androidx.compose.animation.a.a((boolean)this.a);
        l l10 = this.b;
        int n13 = l10 != null ? l10.hashCode() : 0;
        return n10 * 31 + n13;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ClientSideRemoteScreenshotConfig(enabled=");
        stringBuilder.append(this.a);
        stringBuilder.append(", config=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

