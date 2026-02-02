/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.dv
 *  com.yandex.mobile.ads.impl.tw1
 *  com.yandex.mobile.ads.impl.uw1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dv;
import com.yandex.mobile.ads.impl.nu1;
import com.yandex.mobile.ads.impl.tw1;
import com.yandex.mobile.ads.impl.uw1;
import java.security.cert.X509Certificate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class vw1
implements tw1 {
    @NotNull
    private final uw1 a;

    public vw1(@NotNull nu1 nu12) {
        this.a = new uw1((dv)nu12);
    }

    public final void checkClientTrusted(@Nullable X509Certificate[] x509CertificateArray, @Nullable String string2) {
        this.a.a(x509CertificateArray, string2);
    }

    public final void checkServerTrusted(@Nullable X509Certificate[] x509CertificateArray, @Nullable String string2) {
        this.a.b(x509CertificateArray, string2);
    }

    @NotNull
    public final X509Certificate[] getAcceptedIssuers() {
        return this.a.c();
    }
}

