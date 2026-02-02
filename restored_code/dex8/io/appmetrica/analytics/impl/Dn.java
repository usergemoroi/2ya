/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.impl.c3;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.UnsupportedEncodingException;

public final class dn
extends c3 {
    public dn(int n10, @NonNull String string2) {
        this(n10, string2, PublicLogger.getAnonymousInstance());
    }

    public dn(int n10, @NonNull String string2, @NonNull PublicLogger publicLogger) {
        super(n10, string2, publicLogger);
    }

    @NonNull
    @VisibleForTesting(otherwise=3)
    public final String a() {
        return this.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public final String a(@Nullable String string2) {
        int n10;
        byte[] byArray;
        String string3 = string2;
        if (TextUtils.isEmpty((CharSequence)string2)) return string3;
        try {
            byArray = string2.getBytes("UTF-8");
            int n13 = byArray.length;
            n10 = this.a;
            string3 = string2;
            if (n13 <= n10) return string3;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return string2;
        }
        string3 = new String(byArray, 0, n10, "UTF-8");
        try {
            this.c.warning("\"%s\" %s exceeded limit of %d bytes", this.b, string2, this.a);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return string3;
        }
        return string3;
    }

    @VisibleForTesting(otherwise=3)
    public final int b() {
        return this.a;
    }
}

