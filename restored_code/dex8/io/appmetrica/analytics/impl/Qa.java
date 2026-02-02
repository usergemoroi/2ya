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
import io.appmetrica.analytics.impl.ra;

public abstract class qa {
    public final ra a(@NonNull FeatureInfo featureInfo) {
        if (featureInfo.name == null) {
            int n10 = featureInfo.reqGlEsVersion;
            if (n10 == 0) {
                return this.b(featureInfo);
            }
            int n13 = featureInfo.flags;
            boolean bl2 = true;
            if ((n13 & 1) == 0) {
                bl2 = false;
            }
            return new ra("openGlFeature", n10, bl2);
        }
        return this.b(featureInfo);
    }

    public abstract ra b(FeatureInfo var1);
}

