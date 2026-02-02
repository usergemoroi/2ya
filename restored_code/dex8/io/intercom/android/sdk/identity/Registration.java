/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.intercom.twig.Twig
 */
package io.intercom.android.sdk.identity;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.UserAttributes;
import io.intercom.android.sdk.logger.LumberMill;

public class Registration {
    @Nullable
    private UserAttributes attributes;
    private String email = "";
    private final Twig twig = LumberMill.getLogger();
    private String userId = "";
    private Validity validity = Validity.NOT_SET;

    public static Registration create() {
        return new Registration();
    }

    private void updateState(boolean bl2) {
        Validity validity = this.validity;
        if (validity == Validity.NOT_SET || validity == Validity.VALID) {
            validity = bl2 ? Validity.VALID : Validity.INVALID;
            this.validity = validity;
        }
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            Object object2 = (Registration)object;
            if (!this.email.equals(((Registration)object2).email)) {
                return false;
            }
            if (!this.userId.equals(((Registration)object2).userId)) {
                return false;
            }
            object = this.attributes;
            object2 = ((Registration)object2).attributes;
            if (object != null) {
                bl2 = ((UserAttributes)object).equals(object2);
            } else if (object2 != null) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    @Nullable
    public UserAttributes getAttributes() {
        return this.attributes;
    }

    public String getEmail() {
        return this.email;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int n10 = this.email.hashCode();
        int n13 = this.userId.hashCode();
        UserAttributes userAttributes = this.attributes;
        int n14 = userAttributes != null ? userAttributes.hashCode() : 0;
        return (n10 * 31 + n13) * 31 + n14;
    }

    boolean isValidRegistration() {
        return ((Object)((Object)Validity.VALID)).equals((Object)this.validity);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Registration{email='");
        stringBuilder.append(this.email);
        stringBuilder.append('\'');
        stringBuilder.append(", userId='");
        stringBuilder.append(this.userId);
        stringBuilder.append('\'');
        stringBuilder.append(", attributes=");
        stringBuilder.append(this.attributes);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public Registration withEmail(@NonNull String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2) ^ true;
        if (bl2) {
            this.email = string2;
        } else {
            this.twig.e("Email cannot be null or empty", new Object[0]);
        }
        this.updateState(bl2);
        return this;
    }

    public Registration withUserAttributes(@NonNull UserAttributes userAttributes) {
        if (userAttributes == null) {
            this.validity = Validity.INVALID;
            this.twig.e("Registration.withUserAttributes method failed: the attributes Map provided is null", new Object[0]);
        } else if (userAttributes.isEmpty()) {
            this.validity = Validity.INVALID;
            this.twig.e("Registration.withUserAttributes method failed: the attributes Map provided is empty", new Object[0]);
        } else {
            this.attributes = userAttributes;
        }
        return this;
    }

    public Registration withUserId(@NonNull String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2) ^ true;
        if (bl2) {
            this.userId = string2;
        } else {
            this.twig.e("UserId cannot be null or empty", new Object[0]);
        }
        this.updateState(bl2);
        return this;
    }

    private static enum Validity {
        NOT_SET,
        INVALID,
        VALID;

    }
}

