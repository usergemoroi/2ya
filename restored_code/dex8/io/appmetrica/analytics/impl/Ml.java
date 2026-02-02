/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import io.appmetrica.analytics.impl.A8;
import io.appmetrica.analytics.impl.Tg;
import io.appmetrica.analytics.impl.Zi;
import io.appmetrica.analytics.impl.dg;
import io.appmetrica.analytics.impl.nl;
import java.util.List;

public final class ml
extends ECommerceEvent {
    @NonNull
    public final dg a;
    @Nullable
    public final Tg b;
    public final A8 c;

    public ml(@NonNull ECommerceProduct object, @Nullable ECommerceReferrer eCommerceReferrer) {
        dg dg3 = new dg((ECommerceProduct)object);
        object = eCommerceReferrer == null ? null : new Tg(eCommerceReferrer);
        this(dg3, (Tg)object, new nl());
    }

    @VisibleForTesting
    public ml(@NonNull dg dg3, @Nullable Tg tg3, @NonNull A8 a84) {
        this.a = dg3;
        this.b = tg3;
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
        return "shown product details info";
    }

    @Override
    public final List<Zi> toProto() {
        return (List)this.c.fromModel(this);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ShownProductDetailInfoEvent{product=");
        stringBuilder.append(this.a);
        stringBuilder.append(", referrer=");
        stringBuilder.append(this.b);
        stringBuilder.append(", converter=");
        stringBuilder.append(this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

