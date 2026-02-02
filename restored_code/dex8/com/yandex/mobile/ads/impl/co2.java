/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.aa2
 *  com.yandex.mobile.ads.impl.ca
 *  com.yandex.mobile.ads.impl.me
 *  com.yandex.mobile.ads.impl.pw1
 *  com.yandex.mobile.ads.impl.pw1$a
 *  com.yandex.mobile.ads.impl.y92
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.aa2;
import com.yandex.mobile.ads.impl.bo2;
import com.yandex.mobile.ads.impl.ca;
import com.yandex.mobile.ads.impl.me;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.y92;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class co2
implements aa2 {
    @NotNull
    public static final co2 a = new co2();
    @NotNull
    private static final Object b = new Object();
    @Nullable
    private static volatile bo2 c;

    private co2() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NotNull
    public final y92 a(@NotNull Context context) {
        bo2 bo22 = c;
        Object object = bo22;
        if (bo22 != null) return object;
        Object object2 = b;
        synchronized (object2) {
            Throwable throwable2;
            block3: {
                try {
                    bo22 = c;
                    object = bo22;
                    if (bo22 != null) return object;
                    object = ca.a((Context)context) ? "322a737a-a0ca-44e0-bc85-649b1c7c1db6" : "478cb909-6ad1-4e12-84cc-b3629a789f93";
                }
                catch (Throwable throwable2) {
                    break block3;
                }
                bo22 = new me(context);
                bo22.a((String)object);
                int n10 = pw1.l;
                c = object = new bo2((me)bo22, pw1.a.a().a(context));
                return object;
            }
            throw throwable2;
        }
    }
}

