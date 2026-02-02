/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.Kn;
import io.appmetrica.analytics.impl.we;
import java.util.Currency;

public class Revenue {
    @NonNull
    public final Currency currency;
    @Nullable
    public final String payload;
    public final long priceMicros;
    @Nullable
    public final String productID;
    @Nullable
    public final Integer quantity;
    @Nullable
    public final Receipt receipt;

    private Revenue(Builder builder) {
        this.priceMicros = builder.a;
        this.currency = builder.b;
        this.quantity = builder.c;
        this.productID = builder.d;
        this.payload = builder.e;
        this.receipt = builder.f;
    }

    /* synthetic */ Revenue(Builder builder, int n10) {
        this(builder);
    }

    @NonNull
    public static Builder newBuilder(long l10, @NonNull Currency currency) {
        return new Builder(l10, currency, 0);
    }

    public static class Builder {
        private static final Kn g = new Kn(new we("revenue currency"));
        final long a;
        final Currency b;
        Integer c;
        String d;
        String e;
        Receipt f;

        private Builder(long l10, Currency currency) {
            g.a(currency);
            this.a = l10;
            this.b = currency;
        }

        /* synthetic */ Builder(long l10, Currency currency, int n10) {
            this(l10, currency);
        }

        @NonNull
        public Revenue build() {
            return new Revenue(this, 0);
        }

        @NonNull
        public Builder withPayload(@Nullable String string2) {
            this.e = string2;
            return this;
        }

        @NonNull
        public Builder withProductID(@Nullable String string2) {
            this.d = string2;
            return this;
        }

        @NonNull
        public Builder withQuantity(@Nullable Integer n10) {
            this.c = n10;
            return this;
        }

        @NonNull
        public Builder withReceipt(@Nullable Receipt receipt) {
            this.f = receipt;
            return this;
        }
    }

    public static class Receipt {
        @Nullable
        public final String data;
        @Nullable
        public final String signature;

        private Receipt(Builder builder) {
            this.data = builder.a;
            this.signature = builder.b;
        }

        /* synthetic */ Receipt(Builder builder, int n10) {
            this(builder);
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder(0);
        }

        public static class Builder {
            private String a;
            private String b;

            private Builder() {
            }

            /* synthetic */ Builder(int n10) {
                this();
            }

            @NonNull
            public Receipt build() {
                return new Receipt(this, 0);
            }

            @NonNull
            public Builder withData(@Nullable String string2) {
                this.a = string2;
                return this;
            }

            @NonNull
            public Builder withSignature(@Nullable String string2) {
                this.b = string2;
                return this;
            }
        }
    }
}

