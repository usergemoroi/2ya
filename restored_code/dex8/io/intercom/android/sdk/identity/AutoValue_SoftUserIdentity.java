/*
 * Decompiled with CFR 0.152.
 */
package io.intercom.android.sdk.identity;

import io.intercom.android.sdk.identity.SoftUserIdentity;

final class AutoValue_SoftUserIdentity
extends SoftUserIdentity {
    private final String anonymousId;
    private final String email;
    private final String encryptedUserId;
    private final String fingerprint;
    private final String hmac;
    private final String intercomId;
    private final String userId;

    AutoValue_SoftUserIdentity(String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        if (string2 != null) {
            this.anonymousId = string2;
            if (string3 != null) {
                this.email = string3;
                if (string4 != null) {
                    this.fingerprint = string4;
                    if (string5 != null) {
                        this.hmac = string5;
                        if (string6 != null) {
                            this.intercomId = string6;
                            if (string7 != null) {
                                this.userId = string7;
                                if (string8 != null) {
                                    this.encryptedUserId = string8;
                                    return;
                                }
                                throw new NullPointerException("Null encryptedUserId");
                            }
                            throw new NullPointerException("Null userId");
                        }
                        throw new NullPointerException("Null intercomId");
                    }
                    throw new NullPointerException("Null hmac");
                }
                throw new NullPointerException("Null fingerprint");
            }
            throw new NullPointerException("Null email");
        }
        throw new NullPointerException("Null anonymousId");
    }

    @Override
    String anonymousId() {
        return this.anonymousId;
    }

    @Override
    String email() {
        return this.email;
    }

    @Override
    String encryptedUserId() {
        return this.encryptedUserId;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return true;
        }
        if (object instanceof SoftUserIdentity) {
            if (!(this.anonymousId.equals(((SoftUserIdentity)(object = (SoftUserIdentity)object)).anonymousId()) && this.email.equals(((SoftUserIdentity)object).email()) && this.fingerprint.equals(((SoftUserIdentity)object).fingerprint()) && this.hmac.equals(((SoftUserIdentity)object).hmac()) && this.intercomId.equals(((SoftUserIdentity)object).intercomId()) && this.userId.equals(((SoftUserIdentity)object).userId()) && this.encryptedUserId.equals(((SoftUserIdentity)object).encryptedUserId()))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    @Override
    String fingerprint() {
        return this.fingerprint;
    }

    public int hashCode() {
        return ((((((this.anonymousId.hashCode() ^ 0xF4243) * 1000003 ^ this.email.hashCode()) * 1000003 ^ this.fingerprint.hashCode()) * 1000003 ^ this.hmac.hashCode()) * 1000003 ^ this.intercomId.hashCode()) * 1000003 ^ this.userId.hashCode()) * 1000003 ^ this.encryptedUserId.hashCode();
    }

    @Override
    String hmac() {
        return this.hmac;
    }

    @Override
    String intercomId() {
        return this.intercomId;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SoftUserIdentity{anonymousId=");
        stringBuilder.append(this.anonymousId);
        stringBuilder.append(", email=");
        stringBuilder.append(this.email);
        stringBuilder.append(", fingerprint=");
        stringBuilder.append(this.fingerprint);
        stringBuilder.append(", hmac=");
        stringBuilder.append(this.hmac);
        stringBuilder.append(", intercomId=");
        stringBuilder.append(this.intercomId);
        stringBuilder.append(", userId=");
        stringBuilder.append(this.userId);
        stringBuilder.append(", encryptedUserId=");
        stringBuilder.append(this.encryptedUserId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    @Override
    String userId() {
        return this.userId;
    }
}

