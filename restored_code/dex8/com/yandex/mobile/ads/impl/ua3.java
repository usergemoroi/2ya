/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.window.OnBackInvokedCallback
 */
package com.yandex.mobile.ads.impl;

import android.window.OnBackInvokedCallback;
import com.yandex.mobile.ads.impl.ye1;

public final class ua3
implements OnBackInvokedCallback {
    public final ye1 a;

    public /* synthetic */ ua3(ye1 ye12) {
        this.a = ye12;
    }

    public final void onBackInvoked() {
        ye1.b(this.a);
    }
}

