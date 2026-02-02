/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.internal.a0
 */
package io.appmetrica.analytics.network.impl;

import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.a0;

public final class b
extends a0
implements a {
    public final HttpsURLConnection a;

    public b(HttpsURLConnection httpsURLConnection) {
        this.a = httpsURLConnection;
        super(0);
    }

    public final Object invoke() {
        return this.a.getErrorStream();
    }
}

