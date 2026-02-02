/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Base64
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Gh;
import io.appmetrica.analytics.impl.W8;
import io.appmetrica.analytics.impl.g9;
import io.appmetrica.analytics.impl.l9;
import io.appmetrica.analytics.impl.zo;

public final class hg
implements zo,
W8 {
    @Override
    public final int a(@NonNull g9 g94) {
        return 2;
    }

    @Override
    @NonNull
    public final byte[] a(@NonNull l9 l94, @NonNull Gh gh3) {
        if (TextUtils.isEmpty((CharSequence)l94.b)) {
            return new byte[0];
        }
        return Base64.decode((String)l94.b, (int)0);
    }
}

