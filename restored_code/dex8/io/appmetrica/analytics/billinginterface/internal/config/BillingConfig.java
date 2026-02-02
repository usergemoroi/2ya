/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.billinginterface.internal.config;

import androidx.annotation.NonNull;

public class BillingConfig {
    public final int firstCollectingInappMaxAgeSeconds;
    public final int sendFrequencySeconds;

    public BillingConfig(int n10, int n13) {
        this.sendFrequencySeconds = n10;
        this.firstCollectingInappMaxAgeSeconds = n13;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (BillingConfig)object;
            if (this.sendFrequencySeconds != ((BillingConfig)object).sendFrequencySeconds) {
                return false;
            }
            return this.firstCollectingInappMaxAgeSeconds == ((BillingConfig)object).firstCollectingInappMaxAgeSeconds;
        }
        return false;
    }

    public int hashCode() {
        return this.sendFrequencySeconds * 31 + this.firstCollectingInappMaxAgeSeconds;
    }

    @NonNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("BillingConfig{sendFrequencySeconds=");
        stringBuilder.append(this.sendFrequencySeconds);
        stringBuilder.append(", firstCollectingInappMaxAgeSeconds=");
        stringBuilder.append(this.firstCollectingInappMaxAgeSeconds);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

