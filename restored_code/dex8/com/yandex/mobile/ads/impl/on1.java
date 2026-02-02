/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  com.yandex.mobile.ads.impl.fe
 *  com.yandex.mobile.ads.impl.vl
 *  com.yandex.mobile.ads.impl.vl$a
 */
package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.b52;
import com.yandex.mobile.ads.impl.fe;
import com.yandex.mobile.ads.impl.mf0;
import com.yandex.mobile.ads.impl.p13;
import com.yandex.mobile.ads.impl.p22;
import com.yandex.mobile.ads.impl.sg1;
import com.yandex.mobile.ads.impl.vl;

public abstract class on1
implements vl {
    public static final vl.a<on1> b = new p13();

    on1() {
    }

    private static on1 a(Bundle bundle) {
        int n10 = bundle.getInt(Integer.toString(0, 36), -1);
        if (n10 != 0) {
            if (n10 != 1) {
                if (n10 != 2) {
                    if (n10 == 3) {
                        return (on1)b52.e.fromBundle(bundle);
                    }
                    throw new IllegalArgumentException(fe.a((String)"Unknown RatingType: ", (int)n10));
                }
                return (on1)p22.e.fromBundle(bundle);
            }
            return (on1)sg1.d.fromBundle(bundle);
        }
        return (on1)mf0.e.fromBundle(bundle);
    }

    public static /* synthetic */ on1 c(Bundle bundle) {
        return on1.a(bundle);
    }
}

