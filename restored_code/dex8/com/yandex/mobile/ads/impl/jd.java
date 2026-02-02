/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.http.X509TrustManagerExtensions
 *  com.yandex.mobile.ads.impl.pn
 */
package com.yandex.mobile.ads.impl;

import android.net.http.X509TrustManagerExtensions;
import com.yandex.mobile.ads.impl.pn;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class jd
extends pn {
    @NotNull
    private final X509TrustManager a;
    @NotNull
    private final X509TrustManagerExtensions b;

    public jd(@NotNull X509TrustManager x509TrustManager, @NotNull X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.a = x509TrustManager;
        this.b = x509TrustManagerExtensions;
    }

    @NotNull
    public final List a(@NotNull String object, @NotNull List object2) throws SSLPeerUnverifiedException {
        y.h(object2, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
        object2 = object2.toArray(new X509Certificate[0]);
        try {
            object = this.b.checkServerTrusted((X509Certificate[])object2, "RSA", (String)object);
            return object;
        }
        catch (CertificateException certificateException) {
            object2 = new SSLPeerUnverifiedException(certificateException.getMessage());
            ((Throwable)object2).initCause(certificateException);
            throw object2;
        }
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = object instanceof jd && ((jd)((Object)object)).a == this.a;
        return bl2;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }
}

