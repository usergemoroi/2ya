/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
 *  com.yandex.varioqub.config.impl.C
 *  com.yandex.varioqub.config.impl.g
 *  com.yandex.varioqub.config.impl.l
 */
package com.yandex.varioqub.config.impl;

import android.util.Log;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import com.yandex.varioqub.config.impl.C;
import com.yandex.varioqub.config.impl.g;
import com.yandex.varioqub.config.impl.l;

public final class e
implements AdapterIdentifiersCallback {
    public final g a;

    public e(g g11) {
        this.a = g11;
    }

    public final void onError(String string2) {
        this.a.getClass();
        boolean bl2 = C.a;
        if (bl2 && bl2) {
            Log.e((String)"Varioqub/Varioqub/IdentifierProvider", (String)string2, null);
        }
        l.a((int)3);
    }

    public final void onSuccess(String string2) {
        this.a.getClass();
        CharSequence charSequence = new StringBuilder("received deviceId from adapter - ");
        charSequence.append(string2);
        charSequence = charSequence.toString();
        if (C.a) {
            Log.d((String)"Varioqub/IdentifierProvider", (String)charSequence);
        }
        this.a.d = string2;
        l.a((int)3);
    }
}

