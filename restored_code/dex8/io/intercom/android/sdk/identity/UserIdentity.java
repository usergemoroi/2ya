/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  androidx.annotation.VisibleForTesting
 */
package io.intercom.android.sdk.identity;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.VisibleForTesting;
import io.intercom.android.sdk.identity.Registration;
import io.intercom.android.sdk.identity.SoftUserIdentity;
import io.intercom.android.sdk.models.User;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UserIdentity {
    public static final String ANONYMOUS_ID = "anonymous_id";
    public static final String EMAIL = "email";
    public static final String INTERCOM_ID = "intercom_id";
    private static final String KEY_ANONYMOUS_ID = "INTERCOM_SDK_ANONYMOUS_ID";
    private static final String KEY_EMAIL_ID = "INTERCOM_SDK_EMAIL_ID";
    private static final String KEY_INTERCOM_ID = "INTERCOM_SDK_INTERCOM_ID";
    private static final String KEY_PREFIX = "intercomsdk-session-";
    private static final String KEY_SECURE_HMAC = "SecureMode_HMAC";
    private static final String KEY_USER_ID = "INTERCOM_SDK_USER_ID";
    private static final String TYPE = "type";
    private static final String USER = "user";
    private static final String USER_ID = "user_id";
    private String anonymousId;
    private String email;
    private String encryptedUserId;
    private String fingerprint = "";
    private String hmac;
    private String intercomId;
    private final SharedPreferences prefs;
    private SoftUserIdentity softUserIdentity = SoftUserIdentity.NONE;
    private String userId;

    public UserIdentity(Context context) {
        context = context.getSharedPreferences("INTERCOM_SDK_USER_PREFS", 0);
        this.prefs = context;
        this.anonymousId = context.getString("intercomsdk-session-INTERCOM_SDK_ANONYMOUS_ID", "");
        this.intercomId = context.getString("intercomsdk-session-INTERCOM_SDK_INTERCOM_ID", "");
        this.userId = context.getString("intercomsdk-session-INTERCOM_SDK_USER_ID", "");
        this.email = context.getString("intercomsdk-session-INTERCOM_SDK_EMAIL_ID", "");
        this.hmac = context.getString("intercomsdk-session-SecureMode_HMAC", "");
        this.encryptedUserId = "";
        if (this.identityExists()) {
            this.fingerprint = this.generateFingerprint();
        }
    }

    private String generateFingerprint() {
        return UUID.randomUUID().toString();
    }

    public boolean canRegisterIdentifiedUser(Registration registration) {
        boolean bl2 = registration.isValidRegistration() && !this.isIdentified();
        return bl2;
    }

    public boolean canRegisterUnidentifiedUser() {
        return this.identityExists() ^ true;
    }

    public String getAnonymousId() {
        return this.anonymousId;
    }

    public String getEmail() {
        return this.email;
    }

    public String getEncryptedUserId() {
        return this.encryptedUserId;
    }

    public String getFingerprint() {
        return this.fingerprint;
    }

    public String getHmac() {
        return this.hmac;
    }

    public String getIntercomId() {
        return this.intercomId;
    }

    @VisibleForTesting
    public String getSoftUserIdentityHmac() {
        return this.softUserIdentity.hmac();
    }

    public String getUserId() {
        return this.userId;
    }

    public void hardReset() {
        this.softUserIdentity = SoftUserIdentity.NONE;
    }

    public boolean hasIntercomId() {
        return this.getIntercomId().isEmpty() ^ true;
    }

    public boolean identityExists() {
        boolean bl2 = !(this.email.isEmpty() && this.userId.isEmpty() && this.intercomId.isEmpty() && this.anonymousId.isEmpty());
        return bl2;
    }

    public boolean isIdentified() {
        boolean bl2 = this.identityExists() && !this.isUnidentified();
        return bl2;
    }

    public boolean isSameUser(Registration registration) {
        if (this.isUnidentified()) {
            return false;
        }
        return this.softUserIdentity.isSameUser(registration);
    }

    public boolean isSoftReset() {
        return this.softUserIdentity.isPresent();
    }

    public boolean isUnidentified() {
        boolean bl2 = !this.anonymousId.isEmpty() && this.email.isEmpty() && this.userId.isEmpty();
        return bl2;
    }

    public void registerIdentifiedUser(Registration object) {
        this.intercomId = "";
        SharedPreferences.Editor editor = this.prefs.edit().putString("intercomsdk-session-INTERCOM_SDK_INTERCOM_ID", this.intercomId);
        if (!((Registration)object).getUserId().isEmpty()) {
            String string2;
            this.userId = string2 = ((Registration)object).getUserId();
            editor.putString("intercomsdk-session-INTERCOM_SDK_USER_ID", string2);
        }
        if (!((Registration)object).getEmail().isEmpty()) {
            this.email = object = ((Registration)object).getEmail();
            editor.putString("intercomsdk-session-INTERCOM_SDK_EMAIL_ID", (String)object);
        }
        editor.apply();
        if (this.fingerprint.isEmpty()) {
            this.fingerprint = this.generateFingerprint();
        }
    }

    public void registerUnidentifiedUser() {
        this.anonymousId = UUID.randomUUID().toString();
        this.prefs.edit().putString("intercomsdk-session-INTERCOM_SDK_ANONYMOUS_ID", this.anonymousId).apply();
        if (this.fingerprint.isEmpty()) {
            this.fingerprint = this.generateFingerprint();
        }
    }

    public boolean registrationHasAttributes(Registration registration) {
        boolean bl2 = registration != null && registration.getAttributes() != null && !registration.getAttributes().isEmpty();
        return bl2;
    }

    public void setUserHash(String string2) {
        this.hmac = string2;
        this.prefs.edit().putString("intercomsdk-session-SecureMode_HMAC", string2).apply();
    }

    public void softReset() {
        if (!this.isSoftReset()) {
            this.softUserIdentity = SoftUserIdentity.create(this.anonymousId, this.email, this.fingerprint, this.hmac, this.intercomId, this.userId, this.encryptedUserId);
            this.prefs.edit().clear().apply();
            this.anonymousId = "";
            this.intercomId = "";
            this.encryptedUserId = "";
            this.userId = "";
            this.email = "";
            this.hmac = "";
            this.fingerprint = "";
        }
    }

    public void softRestart() {
        this.userId = this.softUserIdentity.userId();
        this.email = this.softUserIdentity.email();
        this.anonymousId = this.softUserIdentity.anonymousId();
        this.intercomId = this.softUserIdentity.intercomId();
        this.encryptedUserId = this.softUserIdentity.encryptedUserId();
        this.hmac = this.softUserIdentity.hmac();
        this.fingerprint = this.softUserIdentity.fingerprint();
        this.prefs.edit().putString("intercomsdk-session-INTERCOM_SDK_USER_ID", this.userId).putString("intercomsdk-session-INTERCOM_SDK_EMAIL_ID", this.email).putString("intercomsdk-session-INTERCOM_SDK_ANONYMOUS_ID", this.anonymousId).putString("intercomsdk-session-INTERCOM_SDK_INTERCOM_ID", this.intercomId).apply();
        this.softUserIdentity = SoftUserIdentity.NONE;
    }

    public boolean softUserIdentityHmacDiffers(String string2) {
        boolean bl2 = this.softUserIdentity.isPresent() && !this.getSoftUserIdentityHmac().equals(string2);
        return bl2;
    }

    public Map<String, Object> softUserIdentityToMap() {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        String string2 = this.softUserIdentity.anonymousId();
        String string3 = this.softUserIdentity.intercomId();
        String string4 = this.softUserIdentity.userId();
        String string5 = this.softUserIdentity.email();
        if (!string2.isEmpty()) {
            hashMap.put(ANONYMOUS_ID, string2);
        } else if (!string3.isEmpty()) {
            hashMap.put(INTERCOM_ID, string3);
        }
        if (!string4.isEmpty()) {
            hashMap.put(USER_ID, string4);
        }
        if (!string5.isEmpty()) {
            hashMap.put(EMAIL, string5);
        }
        hashMap.put(TYPE, USER);
        return hashMap;
    }

    public Map<String, Object> toMap() {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        if (!this.anonymousId.isEmpty()) {
            hashMap.put(ANONYMOUS_ID, this.anonymousId);
        } else if (!this.intercomId.isEmpty()) {
            hashMap.put(INTERCOM_ID, this.intercomId);
        }
        if (!this.userId.isEmpty()) {
            hashMap.put(USER_ID, this.userId);
        }
        if (!this.email.isEmpty()) {
            hashMap.put(EMAIL, this.email);
        }
        hashMap.put(TYPE, USER);
        return hashMap;
    }

    public void update(User object) {
        if (object == User.NULL) {
            return;
        }
        this.userId = ((User)object).getUserId();
        this.email = ((User)object).getEmail();
        this.anonymousId = ((User)object).getAnonymousId();
        this.encryptedUserId = ((User)object).getEncryptedUserId();
        SharedPreferences.Editor editor = this.prefs.edit().putString("intercomsdk-session-INTERCOM_SDK_USER_ID", this.userId).putString("intercomsdk-session-INTERCOM_SDK_EMAIL_ID", this.email).putString("intercomsdk-session-INTERCOM_SDK_ANONYMOUS_ID", this.anonymousId);
        if (!((User)object).getIntercomId().isEmpty()) {
            this.intercomId = object = ((User)object).getIntercomId();
            editor.putString("intercomsdk-session-INTERCOM_SDK_INTERCOM_ID", (String)object);
        }
        editor.apply();
    }
}

