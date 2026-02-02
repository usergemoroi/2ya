/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.intercom.twig.Twig
 */
package io.intercom.android.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Company;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.CustomAttributeValidator;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class UserAttributes {
    private static final String COMPANIES = "companies";
    private static final String CUSTOM_ATTRIBUTES = "custom_attributes";
    private static final String EMAIL = "email";
    private static final String LANGUAGE_OVERRIDE = "language_override";
    private static final String NAME = "name";
    private static final String PHONE = "phone";
    private static final String SIGNED_UP_AT = "signed_up_at";
    private static final Twig TWIG = LumberMill.getLogger();
    private static final String UNSUBSCRIBED_FROM_EMAILS = "unsubscribed_from_emails";
    private static final String USER_ID = "user_id";
    private final Map<String, Object> attributes;
    private final List<Map<String, Object>> companies;
    private final Map<String, Object> customAttributes;

    UserAttributes(Builder builder) {
        this.attributes = builder.attributes;
        this.customAttributes = builder.customAttributes;
        this.companies = builder.companies;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (UserAttributes)object;
            if (!this.attributes.equals(((UserAttributes)object).attributes)) {
                return false;
            }
            if (!this.customAttributes.equals(((UserAttributes)object).customAttributes)) {
                return false;
            }
            return this.companies.equals(((UserAttributes)object).companies);
        }
        return false;
    }

    public int hashCode() {
        return (this.attributes.hashCode() * 31 + this.customAttributes.hashCode()) * 31 + this.companies.hashCode();
    }

    public boolean isEmpty() {
        boolean bl2 = this.attributes.isEmpty() && this.customAttributes.isEmpty() && this.companies.isEmpty();
        return bl2;
    }

    public Map<String, Object> toMap() {
        if (!this.customAttributes.isEmpty()) {
            this.attributes.put(CUSTOM_ATTRIBUTES, this.customAttributes);
        }
        if (!this.companies.isEmpty()) {
            this.attributes.put(COMPANIES, this.companies);
        }
        return this.attributes;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UserAttributes{attributes=");
        stringBuilder.append(this.attributes);
        stringBuilder.append(", customAttributes=");
        stringBuilder.append(this.customAttributes);
        stringBuilder.append(", companies=");
        stringBuilder.append(this.companies);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static final class Builder {
        final Map<String, Object> attributes = new HashMap<String, Object>();
        final List<Map<String, Object>> companies;
        final Map<String, Object> customAttributes = new HashMap<String, Object>();

        public Builder() {
            this.companies = new ArrayList<Map<String, Object>>();
        }

        public UserAttributes build() {
            return new UserAttributes(this);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null && Builder.class == object.getClass()) {
                object = (Builder)object;
                if (!this.attributes.equals(((Builder)object).attributes)) {
                    return false;
                }
                if (!this.customAttributes.equals(((Builder)object).customAttributes)) {
                    return false;
                }
                return this.companies.equals(((Builder)object).companies);
            }
            return false;
        }

        public int hashCode() {
            return (this.attributes.hashCode() * 31 + this.customAttributes.hashCode()) * 31 + this.companies.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Builder{attributes=");
            stringBuilder.append(this.attributes);
            stringBuilder.append(", customAttributes=");
            stringBuilder.append(this.customAttributes);
            stringBuilder.append(", companies=");
            stringBuilder.append(this.companies);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }

        public Builder withCompany(@NonNull Company company) {
            if (company == null) {
                TWIG.w("The company you provided was null", new Object[0]);
            } else {
                this.companies.add(company.getAttributes());
            }
            return this;
        }

        public Builder withCustomAttribute(@NonNull String string2, @Nullable Object object) {
            if (string2 == null) {
                string2 = TWIG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("The key you provided was null for the attribute ");
                stringBuilder.append(object);
                string2.w(stringBuilder.toString(), new Object[0]);
            } else if (CustomAttributeValidator.isValid(object)) {
                this.customAttributes.put(string2, object);
            } else {
                Twig twig = TWIG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("The custom user attribute ");
                stringBuilder.append(string2);
                stringBuilder.append(" was of type ");
                stringBuilder.append(object.getClass().getSimpleName());
                stringBuilder.append(" We only accept the following types: ");
                stringBuilder.append(CustomAttributeValidator.getAcceptedTypes());
                twig.w(stringBuilder.toString(), new Object[0]);
            }
            return this;
        }

        public Builder withCustomAttributes(@NonNull Map<String, ?> object) {
            if (object == null) {
                TWIG.w("The map of attributes you provided was null.", new Object[0]);
            } else {
                for (Map.Entry entry : object.entrySet()) {
                    Object v14 = entry.getValue();
                    if (CustomAttributeValidator.isValid(v14)) {
                        this.customAttributes.put((String)entry.getKey(), v14);
                        continue;
                    }
                    Twig twig = TWIG;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("The custom user attribute ");
                    stringBuilder.append((String)entry.getKey());
                    stringBuilder.append(" was of type ");
                    stringBuilder.append(v14.getClass().getSimpleName());
                    stringBuilder.append(" We only accept the following types: ");
                    stringBuilder.append(CustomAttributeValidator.getAcceptedTypes());
                    twig.w(stringBuilder.toString(), new Object[0]);
                }
            }
            return this;
        }

        public Builder withEmail(@Nullable String string2) {
            this.attributes.put(UserAttributes.EMAIL, string2);
            return this;
        }

        public Builder withLanguageOverride(@Nullable String string2) {
            this.attributes.put(UserAttributes.LANGUAGE_OVERRIDE, string2);
            return this;
        }

        public Builder withName(@Nullable String string2) {
            this.attributes.put(UserAttributes.NAME, string2);
            return this;
        }

        public Builder withPhone(@Nullable String string2) {
            this.attributes.put(UserAttributes.PHONE, string2);
            return this;
        }

        public Builder withSignedUpAt(@Nullable Long l10) {
            this.attributes.put(UserAttributes.SIGNED_UP_AT, l10);
            return this;
        }

        public Builder withSignedUpAt(@Nullable Date comparable) {
            comparable = comparable == null ? null : Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(comparable.getTime()));
            return this.withSignedUpAt((Long)comparable);
        }

        public Builder withUnsubscribedFromEmails(@Nullable Boolean bl2) {
            this.attributes.put(UserAttributes.UNSUBSCRIBED_FROM_EMAILS, bl2);
            return this;
        }

        public Builder withUserId(@Nullable String string2) {
            this.attributes.put(UserAttributes.USER_ID, string2);
            return this;
        }
    }
}

