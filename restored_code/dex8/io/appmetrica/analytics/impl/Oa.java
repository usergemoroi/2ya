/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.pm.FeatureInfo
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.lq;
import io.appmetrica.analytics.impl.qa;
import io.appmetrica.analytics.impl.ra;

public final class oa
extends qa {
    @Override
    @TargetApi(value=24)
    public final ra b(@NonNull FeatureInfo featureInfo) {
        String string2 = featureInfo.name;
        int n10 = lq.a(featureInfo);
        int n13 = featureInfo.flags;
        boolean bl2 = true;
        if ((n13 & 1) == 0) {
            bl2 = false;
        }
        return new ra(string2, n10, bl2);
    }
}

