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
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.CustomAttributeValidator;
import java.util.HashMap;
import java.util.Map;

public class Company {
    private static final String COMPANY_ID = "id";
    private static final String CREATED_AT = "created_at";
    private static final String CUSTOM_ATTRIBUTES = "custom_attributes";
    private static final String MONTHLY_SPEND = "monthly_spend";
    private static final String NAME = "name";
    private static final String PLAN = "plan";
    private static final Twig TWIG = LumberMill.getLogger();
    private final Map<String, Object> attributes;
    private final Map<String, Object> customAttributes;

    Company(Builder builder) {
        this.attributes = builder.attributes;
        this.customAttributes = builder.customAttributes;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (Company)object;
            if (!this.attributes.equals(((Company)object).attributes)) {
                return false;
            }
            return this.customAttributes.equals(((Company)object).customAttributes);
        }
        return false;
    }

    Map<String, Object> getAttributes() {
        if (!this.customAttributes.isEmpty()) {
            this.attributes.put(CUSTOM_ATTRIBUTES, this.customAttributes);
        }
        return this.attributes;
    }

    public int hashCode() {
        return this.attributes.hashCode() * 31 + this.customAttributes.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Company{attributes=");
        stringBuilder.append(this.attributes);
        stringBuilder.append(", customAttributes=");
        stringBuilder.append(this.customAttributes);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static final class Builder {
        final Map<String, Object> attributes = new HashMap<String, Object>();
        final Map<String, Object> customAttributes = new HashMap<String, Object>();

        public Company build() {
            return new Company(this);
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
                return this.customAttributes.equals(((Builder)object).customAttributes);
            }
            return false;
        }

        public int hashCode() {
            return this.attributes.hashCode() * 31 + this.customAttributes.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Builder{attributes=");
            stringBuilder.append(this.attributes);
            stringBuilder.append(", customAttributes=");
            stringBuilder.append(this.customAttributes);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }

        public Builder withCompanyId(@Nullable String string2) {
            this.attributes.put(Company.COMPANY_ID, string2);
            return this;
        }

        public Builder withCreatedAt(@Nullable Long l10) {
            this.attributes.put(Company.CREATED_AT, l10);
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
                stringBuilder.append("The custom company attribute ");
                stringBuilder.append(string2);
                stringBuilder.append(" was of type ");
                stringBuilder.append(object.getClass().getSimpleName());
                stringBuilder.append(" We only accept the following types: ");
                stringBuilder.append(CustomAttributeValidator.getAcceptedTypes());
                twig.w(stringBuilder.toString(), new Object[0]);
            }
            return this;
        }

        public Builder withCustomAttributes(@NonNull Map<String, ?> entry2) {
            if (entry2 == null) {
                TWIG.w("The map of attributes you provided was null.", new Object[0]);
            } else {
                for (Map.Entry<String, ?> entry2 : entry2.entrySet()) {
                    if (CustomAttributeValidator.isValid(entry2.getValue())) {
                        this.customAttributes.put((String)entry2.getKey(), entry2.getValue());
                        continue;
                    }
                    Twig twig = TWIG;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("The custom company attribute ");
                    stringBuilder.append((String)entry2.getKey());
                    stringBuilder.append(" was of type ");
                    stringBuilder.append(entry2.getClass().getSimpleName());
                    stringBuilder.append(" We only accept the following types: ");
                    stringBuilder.append(CustomAttributeValidator.getAcceptedTypes());
                    twig.w(stringBuilder.toString(), new Object[0]);
                }
            }
            return this;
        }

        public Builder withMonthlySpend(@Nullable Integer n10) {
            this.attributes.put(Company.MONTHLY_SPEND, n10);
            return this;
        }

        public Builder withName(@Nullable String string2) {
            this.attributes.put(Company.NAME, string2);
            return this;
        }

        public Builder withPlan(@Nullable String string2) {
            this.attributes.put(Company.PLAN, string2);
            return this;
        }
    }
}

