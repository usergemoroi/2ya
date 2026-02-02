/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.google.auto.value.AutoValue
 */
package io.intercom.android.sdk.api;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import io.intercom.android.sdk.api.AutoValue_UserUpdateRequest;
import java.util.HashMap;
import java.util.Map;

@AutoValue
public abstract class UserUpdateRequest {
    public static UserUpdateRequest create(boolean bl2, boolean bl3, @Nullable Map<String, Object> map2, boolean bl4) {
        return new Builder().isNewSession(bl2).isSentFromBackground(bl3).withAttributes(map2).isInternalUpdate(bl4).build();
    }

    public static UserUpdateRequest create(boolean bl2, boolean bl3, boolean bl4) {
        return UserUpdateRequest.create(bl2, bl3, null, bl4);
    }

    public abstract Map<String, Object> getAttributes();

    public abstract boolean isInternalUpdate();

    public abstract boolean isNewSession();

    public abstract boolean isSentFromBackground();

    public boolean isValidUpdate() {
        boolean bl2 = this.isInternalUpdate() || !this.getAttributes().isEmpty();
        return bl2;
    }

    public static final class Builder {
        @Nullable
        Map<String, Object> attributes;
        boolean isInternalUpdate = false;
        boolean isNewSession = false;
        boolean isSentFromBackground = true;

        public UserUpdateRequest build() {
            HashMap<String, Object> hashMap = new HashMap<String, Object>();
            Map<String, Object> map2 = this.attributes;
            if (map2 != null) {
                hashMap.putAll(map2);
            }
            return new AutoValue_UserUpdateRequest(this.isNewSession, this.isSentFromBackground, this.isInternalUpdate, hashMap);
        }

        public Builder isInternalUpdate(boolean bl2) {
            this.isInternalUpdate = bl2;
            return this;
        }

        public Builder isNewSession(boolean bl2) {
            this.isNewSession = bl2;
            return this;
        }

        public Builder isSentFromBackground(boolean bl2) {
            this.isSentFromBackground = bl2;
            return this;
        }

        public Builder withAttributes(@Nullable Map<String, Object> map2) {
            this.attributes = map2;
            return this;
        }
    }
}

