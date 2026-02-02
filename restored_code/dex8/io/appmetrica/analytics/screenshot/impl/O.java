/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.l
 */
package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.screenshot.impl.L;
import java.util.List;
import kotlin.collections.l;

public final class o {
    public final boolean a;
    public final List b;
    public final long c;

    public o() {
        this(new L().a, l.i1((Object[])new L().c), new L().b);
    }

    public o(boolean bl2, List list, long l10) {
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
        StringBuilder stringBuilder = new StringBuilder("ContentObserverCaptorConfig(enabled=");
        stringBuilder.append(this.a);
        stringBuilder.append(", mediaStoreColumnNames='");
        stringBuilder.append(this.b);
        stringBuilder.append("', detectWindowSeconds=");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

