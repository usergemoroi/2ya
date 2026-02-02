/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.FeatureInfo
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.qa;
import io.appmetrica.analytics.impl.ra;

public final class pa
extends qa {
    @Override
    public final ra b(@NonNull FeatureInfo featureInfo) {
        String string2 = featureInfo.name;
        int n10 = featureInfo.flags;
        boolean bl2 = true;
        if ((n10 & 1) == 0) {
            bl2 = false;
        }
        return new ra(string2, -1, bl2);
    }
}

