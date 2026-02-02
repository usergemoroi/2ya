/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.identity;

import io.intercom.android.sdk.identity.AppIdentity;

final class AutoValue_AppIdentity
extends AppIdentity {
    private final String apiKey;
    private final String appId;

    AutoValue_AppIdentity(String string2, String string3) {
        if (string2 != null) {
            this.apiKey = string2;
            if (string3 != null) {
                this.appId = string3;
                return;
            }
            throw new NullPointerException("Null appId");
        }
        throw new NullPointerException("Null apiKey");
    }

    @Override
    public String apiKey() {
        return this.apiKey;
    }

    @Override
    public String appId() {
        return this.appId;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return true;
        }
        if (object instanceof AppIdentity) {
            if (!this.apiKey.equals(((AppIdentity)(object = (AppIdentity)object)).apiKey()) || !this.appId.equals(((AppIdentity)object).appId())) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public int hashCode() {
        return (this.apiKey.hashCode() ^ 0xF4243) * 1000003 ^ this.appId.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AppIdentity{apiKey=");
        stringBuilder.append(this.apiKey);
        stringBuilder.append(", appId=");
        stringBuilder.append(this.appId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

