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
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import io.appmetrica.analytics.impl.A8;
import io.appmetrica.analytics.impl.Zi;
import io.appmetrica.analytics.impl.dg;
import io.appmetrica.analytics.impl.ll;
import io.appmetrica.analytics.impl.yj;
import java.util.List;

public final class kl
extends ECommerceEvent {
    @NonNull
    public final dg a;
    @NonNull
    public final yj b;
    public final A8 c;

    public kl(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommerceScreen eCommerceScreen) {
        this(new dg(eCommerceProduct), new yj(eCommerceScreen), new ll());
    }

    @VisibleForTesting
    public kl(@NonNull dg dg3, @NonNull yj yj3, @NonNull A8 a84) {
        this.a = dg3;
        this.b = yj3;
        this.c = a84;
    }

    @NonNull
    @VisibleForTesting
    public final A8 a() {
        return this.c;
    }

    @Override
    @NonNull
    public final String getPublicDescription() {
        return "shown product card info";
    }

    @Override
    public final List<Zi> toProto() {
        return (List)this.c.fromModel(this);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ShownProductCardInfoEvent{product=");
        stringBuilder.append(this.a);
        stringBuilder.append(", screen=");
        stringBuilder.append(this.b);
        stringBuilder.append(", converter=");
        stringBuilder.append(this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

