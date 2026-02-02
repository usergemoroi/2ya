/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.Hl;
import io.appmetrica.analytics.impl.Q4;
import io.appmetrica.analytics.impl.Rn;
import io.appmetrica.analytics.impl.S6;
import io.appmetrica.analytics.impl.Xi;
import io.appmetrica.analytics.impl.Z2;
import io.appmetrica.analytics.impl.gn;
import io.appmetrica.analytics.impl.hl;
import io.appmetrica.analytics.impl.ko;
import io.appmetrica.analytics.impl.y8;
import io.appmetrica.analytics.impl.z8;
import io.appmetrica.analytics.profile.UserProfileUpdate;

public class GenderAttribute {
    private final S6 a = new S6("appmetrica_gender", new z8(), new Hl());

    GenderAttribute() {
    }

    @NonNull
    public UserProfileUpdate<? extends ko> withValue(@NonNull Gender object) {
        String string2 = this.a.c;
        String string3 = object.getStringValue();
        object = new y8();
        S6 s64 = this.a;
        return new UserProfileUpdate(new gn(string2, string3, (Rn)object, s64.a, (Z2)new Q4(s64.b)));
    }

    @NonNull
    public UserProfileUpdate<? extends ko> withValueIfUndefined(@NonNull Gender object) {
        String string2 = this.a.c;
        String string3 = object.getStringValue();
        object = new y8();
        S6 s64 = this.a;
        return new UserProfileUpdate(new gn(string2, string3, (Rn)object, s64.a, (Z2)new hl(s64.b)));
    }

    @NonNull
    public UserProfileUpdate<? extends ko> withValueReset() {
        S6 s64 = this.a;
        return new UserProfileUpdate(new Xi(0, s64.c, s64.a, s64.b));
    }

    public static final class Gender
    extends Enum<Gender> {
        public static final /* enum */ Gender FEMALE;
        public static final /* enum */ Gender MALE;
        public static final /* enum */ Gender OTHER;
        private static final Gender[] b;
        private final String a;

        static {
            Gender gender;
            Gender gender2;
            Gender gender3;
            MALE = gender3 = new Gender("M");
            FEMALE = gender2 = new Gender("F");
            OTHER = gender = new Gender("O");
            b = new Gender[]{gender3, gender2, gender};
        }

        private Gender(String string3) {
            this.a = string3;
        }

        public static Gender valueOf(String string2) {
            return Enum.valueOf(Gender.class, string2);
        }

        public static Gender[] values() {
            return (Gender[])b.clone();
        }

        public String getStringValue() {
            return this.a;
        }
    }
}

