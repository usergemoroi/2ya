/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback
 *  com.yandex.varioqub.config.impl.C
 *  com.yandex.varioqub.config.impl.g
 */
package com.yandex.varioqub.config.impl;

import android.util.Log;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import com.yandex.varioqub.config.impl.C;
import com.yandex.varioqub.config.impl.g;

public final class f
implements AdapterIdentifiersCallback {
    public final g a;

    public f(g g11) {
        this.a = g11;
    }

    public final void onError(String string2) {
        this.a.b.countDown();
        this.a.getClass();
        boolean bl2 = C.a;
        if (bl2 && bl2) {
            Log.e((String)"Varioqub/Varioqub/IdentifierProvider", (String)string2, null);
        }
    }

    public final void onSuccess(String string2) {
        this.a.getClass();
        CharSequence charSequence = new StringBuilder("received userId from adapter - ");
        charSequence.append(string2);
        charSequence = charSequence.toString();
        if (C.a) {
            StringBuilder stringBuilder = new StringBuilder("Varioqub/");
            stringBuilder.append("IdentifierProvider");
            Log.d((String)stringBuilder.toString(), (String)charSequence);
        }
        charSequence = this.a;
        ((g)charSequence).c = string2;
        ((g)charSequence).b.countDown();
    }
}

