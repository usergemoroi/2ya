/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.GuardedBy
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.ar1
 *  com.yandex.mobile.ads.impl.ar1$a
 *  com.yandex.mobile.ads.impl.ar1$b
 *  com.yandex.mobile.ads.impl.em$a
 *  com.yandex.mobile.ads.impl.hh0
 *  com.yandex.mobile.ads.impl.uc1
 *  com.yandex.mobile.ads.impl.yp1
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ar1;
import com.yandex.mobile.ads.impl.em;
import com.yandex.mobile.ads.impl.hh0;
import com.yandex.mobile.ads.impl.uc1;
import com.yandex.mobile.ads.impl.yp1;
import java.io.UnsupportedEncodingException;
import java.util.Map;

public final class h32
extends yp1<String> {
    private final Object s = new Object();
    @GuardedBy(value="mLock")
    @Nullable
    private ar1.b<String> t;

    public h32(String string2, ar1.b b10, @Nullable ar1.a a13) {
        super(0, string2, a13);
        this.t = b10;
    }

    protected final ar1<String> a(uc1 uc12) {
        String string2;
        try {
            string2 = new String(uc12.b, hh0.a((Map)uc12.c));
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            string2 = new String(uc12.b);
        }
        return ar1.a((Object)string2, (em.a)hh0.a((uc1)uc12));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        super.a();
        Object object = this.s;
        synchronized (object) {
            this.t = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    protected final void a(Object object) {
        String string2 = (String)object;
        object = this.s;
        // MONITORENTER : object
        ar1.b<String> b10 = this.t;
        // MONITOREXIT : object
        if (b10 == null) return;
        b10.a((Object)string2);
    }
}

