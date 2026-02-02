/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.http.SslCertificate
 *  android.net.http.SslError
 *  android.os.Build$VERSION
 *  com.yandex.mobile.ads.impl.ft1
 *  com.yandex.mobile.ads.impl.kr0
 *  com.yandex.mobile.ads.impl.l03
 *  com.yandex.mobile.ads.impl.lk2
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.ou1
 *  com.yandex.mobile.ads.impl.pw1
 *  com.yandex.mobile.ads.impl.pw1$a
 *  kotlin.jvm.functions.a
 *  kotlin.n
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Build;
import com.yandex.mobile.ads.impl.ft1;
import com.yandex.mobile.ads.impl.kr0;
import com.yandex.mobile.ads.impl.l03;
import com.yandex.mobile.ads.impl.lk2;
import com.yandex.mobile.ads.impl.nu1;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.ou1;
import com.yandex.mobile.ads.impl.pw1;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import kotlin.m;
import kotlin.n;
import org.jetbrains.annotations.NotNull;

public final class mk2
implements lk2 {
    @NotNull
    private final m a = n.b((kotlin.jvm.functions.a)com.yandex.mobile.ads.impl.mk2$a.b);

    public final boolean a(@NotNull Context context, @NotNull SslError object) {
        boolean bl2 = true;
        int n10 = pw1.l;
        ou1 ou12 = pw1.a.a().a(context);
        if (ou12 != null && ou12.q0()) {
            object = Build.VERSION.SDK_INT >= 29 ? l03.a((SslCertificate)object.getCertificate()) : ft1.a((SslCertificate)object.getCertificate(), (CertificateFactory)((CertificateFactory)this.a.getValue()));
            if (object == null) {
                return false;
            }
            context = kr0.a((nu1)new nu1(context));
            try {
                context.checkServerTrusted(new X509Certificate[]{object}, "RSA");
            }
            catch (Exception exception) {
                n10 = op0.b;
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }
}

