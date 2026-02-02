/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.util.Base64
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.fg1
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.mv
 *  com.yandex.mobile.ads.impl.pv
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.vn
 */
package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.fg1;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.mv;
import com.yandex.mobile.ads.impl.pv;
import com.yandex.mobile.ads.impl.tj;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.vn;
import java.io.IOException;
import java.net.URLDecoder;

public final class jv
extends tj {
    @Nullable
    private pv e;
    @Nullable
    private byte[] f;
    private int g;
    private int h;

    public jv() {
        super(false);
    }

    @Override
    public final long a(pv object) throws IOException {
        this.b((pv)object);
        this.e = object;
        Object object2 = ((pv)object).a;
        String string2 = object2.getScheme();
        boolean bl2 = "data".equals(string2);
        CharSequence charSequence = new StringBuilder("Unsupported scheme: ");
        ((StringBuilder)charSequence).append(string2);
        uf.a((String)((StringBuilder)charSequence).toString(), (boolean)bl2);
        charSequence = object2.getSchemeSpecificPart();
        int n10 = m92.a;
        charSequence = ((String)charSequence).split(",", -1);
        if (((CharSequence)charSequence).length == 2) {
            object2 = charSequence[1];
            if (((String)charSequence[0]).contains(";base64")) {
                try {
                    this.f = Base64.decode((String)object2, (int)0);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    object = new StringBuilder("Error while parsing Base64 encoded string: ");
                    ((StringBuilder)object).append((String)object2);
                    throw fg1.a((String)((StringBuilder)object).toString(), (IllegalArgumentException)illegalArgumentException);
                }
            } else {
                this.f = m92.c((String)URLDecoder.decode((String)object2, vn.a.name()));
            }
            long l10 = ((pv)object).f;
            object2 = this.f;
            if (l10 <= (long)((Uri)object2).length) {
                this.g = n10 = (int)l10;
                this.h = n10 = ((Uri)object2).length - n10;
                l10 = ((pv)object).g;
                if (l10 != -1L) {
                    this.h = (int)Math.min((long)n10, l10);
                }
                this.c((pv)object);
                l10 = ((pv)object).g;
                if (l10 == -1L) {
                    l10 = this.h;
                }
                return l10;
            }
            this.f = null;
            throw new mv(2008);
        }
        object = new StringBuilder("Unexpected URI format: ");
        ((StringBuilder)object).append(object2);
        throw fg1.a((String)((StringBuilder)object).toString(), null);
    }

    @Override
    public final void close() {
        if (this.f != null) {
            this.f = null;
            this.e();
        }
        this.e = null;
    }

    @Override
    @Nullable
    public final Uri getUri() {
        Object object = this.e;
        object = object != null ? object.a : null;
        return object;
    }

    public final int read(byte[] byArray, int n10, int n13) {
        if (n13 == 0) {
            return 0;
        }
        int n14 = this.h;
        if (n14 == 0) {
            return -1;
        }
        n14 = Math.min(n13, n14);
        byte[] byArray2 = this.f;
        n13 = m92.a;
        System.arraycopy(byArray2, this.g, byArray, n10, n14);
        this.g += n14;
        this.h -= n14;
        this.c(n14);
        return n14;
    }
}

