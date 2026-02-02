/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.RequiresApi
 *  com.yandex.mobile.ads.impl.dv
 *  com.yandex.mobile.ads.impl.tw1
 *  com.yandex.mobile.ads.impl.uw1
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.impl.dv;
import com.yandex.mobile.ads.impl.tw1;
import com.yandex.mobile.ads.impl.uw1;
import java.net.Socket;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi(value=24)
public final class jv1
extends X509ExtendedTrustManager
implements tw1 {
    @NotNull
    private final uw1 a;

    public jv1(@NotNull dv dv3) {
        this.a = new uw1(dv3);
    }

    @Override
    public final void checkClientTrusted(@Nullable X509Certificate[] x509CertificateArray, @Nullable String string2) {
        this.a.a(x509CertificateArray, string2);
    }

    @Override
    public final void checkClientTrusted(@Nullable X509Certificate[] x509CertificateArray, @Nullable String string2, @Nullable Socket socket) {
        this.a.a(x509CertificateArray, string2, socket);
    }

    @Override
    public final void checkClientTrusted(@Nullable X509Certificate[] x509CertificateArray, @Nullable String string2, @Nullable SSLEngine sSLEngine) {
        this.a.a(x509CertificateArray, string2, sSLEngine);
    }

    @Override
    public final void checkServerTrusted(@Nullable X509Certificate[] x509CertificateArray, @Nullable String string2) {
        this.a.b(x509CertificateArray, string2);
    }

    @Override
    public final void checkServerTrusted(@Nullable X509Certificate[] x509CertificateArray, @Nullable String string2, @Nullable Socket socket) {
        this.a.b(x509CertificateArray, string2, socket);
    }

    @Override
    public final void checkServerTrusted(@Nullable X509Certificate[] x509CertificateArray, @Nullable String string2, @Nullable SSLEngine sSLEngine) {
        this.a.b(x509CertificateArray, string2, sSLEngine);
    }

    @Override
    @NotNull
    public final X509Certificate[] getAcceptedIssuers() {
        return this.a.c();
    }
}

