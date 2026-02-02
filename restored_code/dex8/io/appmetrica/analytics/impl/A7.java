/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.ResultReceiver
 */
package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import io.appmetrica.analytics.impl.Sl;
import io.appmetrica.analytics.impl.Z6;
import io.appmetrica.analytics.impl.r4;

public final class a7
extends ResultReceiver {
    public final Z6 a;

    public a7(Handler handler, Z6 z64) {
        super(handler);
        this.a = z64;
    }

    public static void a(ResultReceiver resultReceiver, Sl sl3, r4 r44) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("startup_error_key_code", sl3.a);
            r44.b(bundle);
            resultReceiver.send(2, bundle);
        }
    }

    public static void a(ResultReceiver resultReceiver, r4 r44) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            r44.b(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    public final void onReceiveResult(int n10, Bundle bundle) {
        Bundle bundle2 = bundle;
        if (bundle == null) {
            bundle2 = new Bundle();
        }
        this.a.a(n10, bundle2);
    }
}

