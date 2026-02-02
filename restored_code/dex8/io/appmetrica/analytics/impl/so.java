/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.kb;
import io.appmetrica.analytics.impl.pf;
import io.appmetrica.analytics.impl.y7;

public final class so
implements kb {
    @Override
    @Nullable
    public final String a(@NonNull Context object) {
        object = new pf(y7.a(object.getApplicationContext()).a()).q();
        object = !TextUtils.isEmpty((CharSequence)object.id) ? object.id : null;
        return object;
    }
}

