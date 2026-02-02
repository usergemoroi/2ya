/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.internal.a0
 */
package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.a0;

public final class c
extends a0
implements a {
    public final SafePackageManager a;
    public final Context b;

    public c(SafePackageManager safePackageManager, Context context) {
        this.a = safePackageManager;
        this.b = context;
        super(0);
    }

    public final Object invoke() {
        SafePackageManager safePackageManager = this.a;
        Object object = this.b;
        object = (object = safePackageManager.getApplicationInfo((Context)object, object.getPackageName(), 128)) != null ? object.metaData : null;
        return object;
    }
}

