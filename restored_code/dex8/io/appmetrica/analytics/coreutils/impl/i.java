/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.internal.a0
 */
package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtilsTiramisu;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.a0;

public final class i
extends a0
implements a {
    public final Context a;
    public final String b;

    public i(Context context, String string2) {
        this.a = context;
        this.b = string2;
        super(0);
    }

    public final Object invoke() {
        PackageManager packageManager = this.a.getPackageManager();
        packageManager = AndroidUtils.isApiAchieved(33) ? PackageManagerUtilsTiramisu.INSTANCE.resolveContentProvider(packageManager, this.b) : packageManager.resolveContentProvider(this.b, 128);
        return packageManager;
    }
}

