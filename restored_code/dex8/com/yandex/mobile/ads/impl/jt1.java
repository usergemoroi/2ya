/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.ca
 *  com.yandex.mobile.ads.impl.gt1
 *  com.yandex.mobile.ads.impl.it1
 *  com.yandex.mobile.ads.impl.kr0
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.pw1
 *  com.yandex.mobile.ads.impl.zj1
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ca;
import com.yandex.mobile.ads.impl.gt1;
import com.yandex.mobile.ads.impl.it1;
import com.yandex.mobile.ads.impl.kr0;
import com.yandex.mobile.ads.impl.nu1;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.zj1;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class jt1
implements it1 {
    @NotNull
    private final pw1 a;

    public jt1(@NotNull pw1 pw12) {
        this.a = pw12;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public final SSLSocketFactory a(@NotNull Context object) {
        void var1_10;
        Object object2 = this.a.a(object);
        nu1 nu12 = new nu1((Context)object);
        if (object2 != null && object2.q0()) {
            SSLSocketFactory sSLSocketFactory = new gt1(kr0.a((nu1)nu12)).a().getSocketFactory();
            return var1_10;
        }
        if (ca.a((int)21)) {
            int n10 = zj1.b;
            try {
                object2 = SSLContext.getInstance("TLSv1.2");
                try {
                    ((SSLContext)object2).init(null, null, null);
                }
                catch (KeyManagementException keyManagementException) {
                    n10 = op0.b;
                }
                zj1 zj12 = new zj1(((SSLContext)object2).getSocketFactory());
                return var1_10;
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                n10 = op0.b;
            }
        }
        Object var1_9 = null;
        return var1_10;
    }
}

