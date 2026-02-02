/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.impl.en;
import io.appmetrica.analytics.impl.v3;

public final class ma {
    public final Context a;
    public final en b;
    public final v3 c;
    public final SafePackageManager d;

    public ma(Context context) {
        this(context, new en(context, "io.appmetrica.analytics.build_id"), new v3(context, "io.appmetrica.analytics.is_offline"), new SafePackageManager());
    }

    public ma(Context context, en en3, v3 v33, SafePackageManager safePackageManager) {
        this.a = context;
        this.b = en3;
        this.c = v33;
        this.d = safePackageManager;
    }
}

