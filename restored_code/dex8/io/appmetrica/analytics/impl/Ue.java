/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.wo;
import io.appmetrica.analytics.impl.yo;

public final class ue
implements yo {
    public final String a;

    public ue(@NonNull String string2) {
        this.a = string2;
    }

    public final wo a(@Nullable String charSequence) {
        if (TextUtils.isEmpty((CharSequence)charSequence)) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(this.a);
            ((StringBuilder)charSequence).append(" is empty.");
            return new wo(this, false, ((StringBuilder)charSequence).toString());
        }
        return new wo(this, true, "");
    }
}

