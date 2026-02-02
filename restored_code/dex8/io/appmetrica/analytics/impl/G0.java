/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.wo;
import io.appmetrica.analytics.impl.yo;
import java.util.UUID;

public final class g0
implements yo {
    public final wo a(@Nullable String string2) {
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return new wo(this, false, "ApiKey is empty. Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
        try {
            UUID.fromString(string2);
            wo wo3 = new wo(this, true, "");
            return wo3;
        }
        catch (Throwable throwable) {
            StringBuilder stringBuilder = new StringBuilder("Invalid ApiKey=");
            stringBuilder.append(string2);
            stringBuilder.append(". Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
            return new wo(this, false, stringBuilder.toString());
        }
    }
}

