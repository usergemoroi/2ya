/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.auto.value.AutoValue
 */
package io.intercom.android.sdk.identity;

import android.text.TextUtils;
import com.google.auto.value.AutoValue;
import io.intercom.android.sdk.identity.AutoValue_SoftUserIdentity;
import io.intercom.android.sdk.identity.Registration;

@AutoValue
abstract class SoftUserIdentity {
    static final SoftUserIdentity NONE = SoftUserIdentity.create("", "", "", "", "", "", "");

    SoftUserIdentity() {
    }

    static SoftUserIdentity create(String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        return new AutoValue_SoftUserIdentity(string2, string3, string4, string5, string6, string7, string8);
    }

    abstract String anonymousId();

    abstract String email();

    abstract String encryptedUserId();

    abstract String fingerprint();

    abstract String hmac();

    abstract String intercomId();

    boolean isPresent() {
        return this.equals(NONE) ^ true;
    }

    boolean isSameUser(Registration object) {
        String string2 = ((Registration)object).getUserId();
        object = ((Registration)object).getEmail();
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        boolean bl3 = true;
        boolean bl4 = !bl2 || !TextUtils.isEmpty((CharSequence)object);
        bl2 = bl4;
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            bl2 = bl4 && string2.equals(this.userId());
        }
        bl4 = bl2;
        if (!TextUtils.isEmpty((CharSequence)object)) {
            bl2 = bl2 && ((String)object).equals(this.email()) ? bl3 : false;
            bl4 = bl2;
        }
        return bl4;
    }

    abstract String userId();
}

