/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.internal.a0
 */
package io.appmetrica.analytics.identifiers.impl;

import android.os.IBinder;
import io.appmetrica.analytics.identifiers.impl.s;
import io.appmetrica.analytics.identifiers.impl.t;
import io.appmetrica.analytics.identifiers.impl.u;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.a0;

public final class p
extends a0
implements l {
    public static final p a = new p();

    public p() {
        super(1);
    }

    public final Object invoke(Object object) {
        IBinder iBinder = (IBinder)object;
        int n10 = t.a;
        object = iBinder == null ? null : ((object = iBinder.queryLocalInterface("com.yandex.android.advid.service.YandexAdvIdInterface")) != null && object instanceof u ? (u)object : new s(iBinder));
        return object;
    }
}

