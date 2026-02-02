/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.impl.b3;
import io.appmetrica.analytics.impl.ld;
import io.appmetrica.analytics.impl.wl;
import io.appmetrica.analytics.impl.wn;
import io.appmetrica.analytics.impl.x8;

public final class un {
    public final wn a;
    public final wn b;

    public un(Context context) {
        if (new SafePackageManager().hasSystemFeature(context, "android.hardware.telephony")) {
            this.a = new b3(new wl(context));
            this.b = new b3(new ld(context));
        } else {
            this.a = new x8();
            this.b = new x8();
        }
    }
}

