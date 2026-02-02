/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.api;

import io.intercom.android.sdk.api.UserUpdateRequest;
import java.util.Map;

final class AutoValue_UserUpdateRequest
extends UserUpdateRequest {
    private final Map<String, Object> attributes;
    private final boolean internalUpdate;
    private final boolean newSession;
    private final boolean sentFromBackground;

    AutoValue_UserUpdateRequest(boolean bl2, boolean bl3, boolean bl4, Map<String, Object> map2) {
        this.newSession = bl2;
        this.sentFromBackground = bl3;
        this.internalUpdate = bl4;
        if (map2 != null) {
            this.attributes = map2;
            return;
        }
        throw new NullPointerException("Null attributes");
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return true;
        }
        if (object instanceof UserUpdateRequest) {
            if (this.newSession != ((UserUpdateRequest)(object = (UserUpdateRequest)object)).isNewSession() || this.sentFromBackground != ((UserUpdateRequest)object).isSentFromBackground() || this.internalUpdate != ((UserUpdateRequest)object).isInternalUpdate() || !this.attributes.equals(((UserUpdateRequest)object).getAttributes())) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    @Override
    public Map<String, Object> getAttributes() {
        return this.attributes;
    }

    public int hashCode() {
        boolean bl2 = this.newSession;
        int n10 = 1237;
        int n13 = bl2 ? 1231 : 1237;
        int n14 = this.sentFromBackground ? 1231 : 1237;
        if (this.internalUpdate) {
            n10 = 1231;
        }
        return (((n13 ^ 0xF4243) * 1000003 ^ n14) * 1000003 ^ n10) * 1000003 ^ this.attributes.hashCode();
    }

    @Override
    public boolean isInternalUpdate() {
        return this.internalUpdate;
    }

    @Override
    public boolean isNewSession() {
        return this.newSession;
    }

    @Override
    public boolean isSentFromBackground() {
        return this.sentFromBackground;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UserUpdateRequest{newSession=");
        stringBuilder.append(this.newSession);
        stringBuilder.append(", sentFromBackground=");
        stringBuilder.append(this.sentFromBackground);
        stringBuilder.append(", internalUpdate=");
        stringBuilder.append(this.internalUpdate);
        stringBuilder.append(", attributes=");
        stringBuilder.append(this.attributes);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

