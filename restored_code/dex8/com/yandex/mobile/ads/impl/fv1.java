/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.fh0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fh0;
import com.yandex.mobile.ads.impl.qz;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class fv1
extends qz {
    @Nullable
    private final SSLSocketFactory s;

    public fv1(@Nullable String string2, @Nullable fh0 fh02, @Nullable SSLSocketFactory sSLSocketFactory) {
        super(string2, 8000, 8000, fh02);
        this.s = sSLSocketFactory;
    }

    @Override
    @NotNull
    public final HttpURLConnection a(@NotNull URL object) {
        object = (HttpURLConnection)((URL)object).openConnection();
        SSLSocketFactory sSLSocketFactory = this.s;
        if (sSLSocketFactory != null && object instanceof HttpsURLConnection) {
            ((HttpsURLConnection)object).setSSLSocketFactory(sSLSocketFactory);
        }
        return object;
    }
}

