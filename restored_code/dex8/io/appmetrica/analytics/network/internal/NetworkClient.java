/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.network.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.network.impl.c;
import io.appmetrica.analytics.network.impl.d;
import io.appmetrica.analytics.network.internal.Call;
import io.appmetrica.analytics.network.internal.Request;
import javax.net.ssl.SSLSocketFactory;

public class NetworkClient {
    private final Integer a;
    private final Integer b;
    private final SSLSocketFactory c;
    private final Boolean d;
    private final Boolean e;
    private final int f;

    private NetworkClient(Integer n10, Integer n13, SSLSocketFactory sSLSocketFactory, Boolean bl2, Boolean bl3, Integer n14) {
        this.a = n10;
        this.b = n13;
        this.c = sSLSocketFactory;
        this.d = bl2;
        this.e = bl3;
        int n15 = n14 == null ? Integer.MAX_VALUE : n14;
        this.f = n15;
    }

    /* synthetic */ NetworkClient(Integer n10, Integer n13, SSLSocketFactory sSLSocketFactory, Boolean bl2, Boolean bl3, Integer n14, int n15) {
        this(n10, n13, sSLSocketFactory, bl2, bl3, n14);
    }

    @Nullable
    public Integer getConnectTimeout() {
        return this.a;
    }

    @Nullable
    public Boolean getInstanceFollowRedirects() {
        return this.e;
    }

    public int getMaxResponseSize() {
        return this.f;
    }

    @Nullable
    public Integer getReadTimeout() {
        return this.b;
    }

    @Nullable
    public SSLSocketFactory getSslSocketFactory() {
        return this.c;
    }

    @Nullable
    public Boolean getUseCaches() {
        return this.d;
    }

    @NonNull
    public Call newCall(@NonNull Request request) {
        return new c(this, request, new d());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("NetworkClient{connectTimeout=");
        stringBuilder.append(this.a);
        stringBuilder.append(", readTimeout=");
        stringBuilder.append(this.b);
        stringBuilder.append(", sslSocketFactory=");
        stringBuilder.append(this.c);
        stringBuilder.append(", useCaches=");
        stringBuilder.append(this.d);
        stringBuilder.append(", instanceFollowRedirects=");
        stringBuilder.append(this.e);
        stringBuilder.append(", maxResponseSize=");
        stringBuilder.append(this.f);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static class Builder {
        private Integer a;
        private Integer b;
        private SSLSocketFactory c;
        private Boolean d;
        private Boolean e;
        private Integer f;

        @NonNull
        public NetworkClient build() {
            return new NetworkClient(this.a, this.b, this.c, this.d, this.e, this.f, 0);
        }

        @NonNull
        public Builder withConnectTimeout(int n10) {
            this.a = n10;
            return this;
        }

        @NonNull
        public Builder withInstanceFollowRedirects(boolean bl2) {
            this.e = bl2;
            return this;
        }

        @NonNull
        public Builder withMaxResponseSize(int n10) {
            this.f = n10;
            return this;
        }

        @NonNull
        public Builder withReadTimeout(int n10) {
            this.b = n10;
            return this;
        }

        @NonNull
        public Builder withSslSocketFactory(@Nullable SSLSocketFactory sSLSocketFactory) {
            this.c = sSLSocketFactory;
            return this;
        }

        @NonNull
        public Builder withUseCaches(boolean bl2) {
            this.d = bl2;
            return this;
        }
    }
}

