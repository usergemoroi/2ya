/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreapi.internal.io;

import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2={"Lio/appmetrica/analytics/coreapi/internal/io/SslSocketFactoryProvider;", "", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "getSslSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "core-api_release"}, k=1, mv={1, 6, 0}, xi=48)
public interface SslSocketFactoryProvider {
    @Nullable
    public SSLSocketFactory getSslSocketFactory();
}

