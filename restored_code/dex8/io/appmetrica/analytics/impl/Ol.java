/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import io.appmetrica.analytics.impl.A8;
import io.appmetrica.analytics.impl.Zi;
import io.appmetrica.analytics.impl.pl;
import io.appmetrica.analytics.impl.yj;
import java.util.List;

public final class ol
extends ECommerceEvent {
    @NonNull
    public final yj a;
    public final A8 b;

    public ol(@NonNull ECommerceScreen eCommerceScreen) {
        this(new yj(eCommerceScreen), new pl());
    }

    @VisibleForTesting
    public ol(@NonNull yj yj3, @NonNull A8 a84) {
        this.a = yj3;
        this.b = a84;
    }

    @NonNull
    @VisibleForTesting
    public final A8 a() {
        return this.b;
    }

    @Override
    @NonNull
    public final String getPublicDescription() {
        return "shown screen info";
    }

    @Override
    public final List<Zi> toProto() {
        return (List)this.b.fromModel(this);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ShownScreenInfoEvent{screen=");
        stringBuilder.append(this.a);
        stringBuilder.append(", converter=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

