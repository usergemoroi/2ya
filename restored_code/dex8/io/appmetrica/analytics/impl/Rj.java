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
import io.appmetrica.analytics.impl.nh;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.v5;

public final class rj
extends nh {
    public rj(@NonNull v5 v54) {
        super(v54);
    }

    @Override
    public final boolean a(@NonNull o6 object) {
        object = ((o6)object).h;
        if (!TextUtils.isEmpty((CharSequence)object)) {
            this.a.c.j((String)object).b();
        }
        return false;
    }
}

