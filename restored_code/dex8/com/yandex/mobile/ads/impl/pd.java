/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.p00$a
 *  com.yandex.mobile.ads.impl.qd$a
 *  kotlin.text.p
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.p00;
import com.yandex.mobile.ads.impl.qd;
import javax.net.ssl.SSLSocket;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;

public final class pd
implements p00.a {
    final String a;

    pd() {
        this.a = "com.google.android.gms.org.conscrypt";
    }

    public final boolean a(@NotNull SSLSocket object) {
        String string2 = object.getClass().getName();
        object = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append(".");
        return p.M((String)string2, (String)stringBuilder.toString(), (boolean)false, (int)2, null);
    }

    @NotNull
    public final qd b(@NotNull SSLSocket sSLSocket) {
        return qd.a.a(sSLSocket.getClass());
    }
}

