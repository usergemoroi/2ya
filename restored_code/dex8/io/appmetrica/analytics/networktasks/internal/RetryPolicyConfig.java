/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.networktasks.internal;

public class RetryPolicyConfig {
    public final int exponentialMultiplier;
    public final int maxIntervalSeconds;

    public RetryPolicyConfig(int n10, int n13) {
        this.maxIntervalSeconds = n10;
        this.exponentialMultiplier = n13;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (RetryPolicyConfig)object;
            if (this.maxIntervalSeconds != ((RetryPolicyConfig)object).maxIntervalSeconds) {
                return false;
            }
            if (this.exponentialMultiplier != ((RetryPolicyConfig)object).exponentialMultiplier) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public int hashCode() {
        return this.maxIntervalSeconds * 31 + this.exponentialMultiplier;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("RetryPolicyConfig{maxIntervalSeconds=");
        stringBuilder.append(this.maxIntervalSeconds);
        stringBuilder.append(", exponentialMultiplier=");
        stringBuilder.append(this.exponentialMultiplier);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

