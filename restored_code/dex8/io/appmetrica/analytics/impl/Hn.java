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
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.Gh;
import io.appmetrica.analytics.impl.l9;
import io.appmetrica.analytics.impl.zo;

public final class hn
implements zo {
    @Override
    @NonNull
    public final byte[] a(@NonNull l9 l94, @NonNull Gh gh3) {
        if (!TextUtils.isEmpty((CharSequence)l94.b)) {
            return StringUtils.getUTF8Bytes(l94.b);
        }
        return new byte[0];
    }
}

