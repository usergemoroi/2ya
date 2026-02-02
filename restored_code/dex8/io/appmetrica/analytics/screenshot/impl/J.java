/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.collection.a
 *  androidx.compose.animation.a
 */
package io.appmetrica.analytics.screenshot.impl;

import androidx.compose.animation.a;
import io.appmetrica.analytics.screenshot.impl.z;
import java.util.List;
import kotlin.jvm.internal.y;

public final class j {
    public final boolean a;
    public final List b;
    public final long c;

    public j(z z13) {
        this(z13.b(), z13.c(), z13.a());
    }

    public j(boolean bl2, List list, long l10) {
        this.a = bl2;
        this.b = list;
        this.c = l10;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        Class<?> clazz = object != null ? object.getClass() : null;
        if (!y.e(j.class, clazz)) {
            return false;
        }
        if (object != null) {
            object = (j)object;
            if (this.a != ((j)object).a) {
                return false;
            }
            if (!y.e(this.b, ((j)object).b)) {
                return false;
            }
            return this.c == ((j)object).c;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideContentObserverCaptorConfig");
    }

    public final int hashCode() {
        int n10 = androidx.compose.animation.a.a((boolean)this.a);
        int n13 = ((Object)this.b).hashCode();
        return androidx.collection.a.a((long)this.c) + (n13 + n10 * 31) * 31;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ClientSideContentObserverCaptorConfig(enabled=");
        stringBuilder.append(this.a);
        stringBuilder.append(", mediaStoreColumnNames=");
        stringBuilder.append(this.b);
        stringBuilder.append(", detectWindowSeconds=");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

