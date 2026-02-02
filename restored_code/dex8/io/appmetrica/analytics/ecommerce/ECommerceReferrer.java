/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;

public class ECommerceReferrer {
    private String a;
    private String b;
    private ECommerceScreen c;

    @Nullable
    public String getIdentifier() {
        return this.b;
    }

    @Nullable
    public ECommerceScreen getScreen() {
        return this.c;
    }

    @Nullable
    public String getType() {
        return this.a;
    }

    @NonNull
    public ECommerceReferrer setIdentifier(@Nullable String string2) {
        this.b = string2;
        return this;
    }

    @NonNull
    public ECommerceReferrer setScreen(@Nullable ECommerceScreen eCommerceScreen) {
        this.c = eCommerceScreen;
        return this;
    }

    @NonNull
    public ECommerceReferrer setType(@Nullable String string2) {
        this.a = string2;
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ECommerceReferrer{type='");
        stringBuilder.append(this.a);
        stringBuilder.append("', identifier='");
        stringBuilder.append(this.b);
        stringBuilder.append("', screen=");
        stringBuilder.append(this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

