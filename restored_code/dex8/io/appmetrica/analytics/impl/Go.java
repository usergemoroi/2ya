/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.l4;
import io.appmetrica.analytics.impl.nh;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.v5;

public final class go
extends nh {
    public go(v5 v54) {
        super(v54);
    }

    @Override
    public final boolean a(@NonNull o6 object) {
        String string2 = this.a.c.j();
        object = ((o6)object).h;
        this.a.c.j((String)object).b();
        if (!TextUtils.equals((CharSequence)string2, (CharSequence)object)) {
            this.a.a(l4.o());
        }
        return false;
    }
}

