/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.screenshot.impl.o;
import java.util.List;

public final class f0 {
    public final boolean a;
    public final List b;
    public final long c;

    public f0(o o11) {
        this(o11.b(), o11.c(), o11.a());
    }

    public f0(boolean bl2, List list, long l10) {
        this.a = bl2;
        this.b = list;
        this.c = l10;
    }

    public final long a() {
        return this.c;
    }

    public final boolean b() {
        return this.a;
    }

    public final List c() {
        return this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ServiceSideContentObserverCaptorConfig(enabled=");
        stringBuilder.append(this.a);
        stringBuilder.append(", mediaStoreColumnNames=");
        stringBuilder.append(this.b);
        stringBuilder.append(", detectWindowSeconds=");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

