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
import io.appmetrica.analytics.impl.S6;
import io.appmetrica.analytics.impl.Xi;
import io.appmetrica.analytics.impl.Z2;
import io.appmetrica.analytics.impl.gn;
import io.appmetrica.analytics.impl.hl;
import io.appmetrica.analytics.impl.ko;
import io.appmetrica.analytics.impl.y8;
import io.appmetrica.analytics.impl.yo;
import io.appmetrica.analytics.impl.z8;
import io.appmetrica.analytics.profile.UserProfileUpdate;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class BirthDateAttribute {
    private final S6 a = new S6("appmetrica_birth_date", new z8(), new Hl());

    BirthDateAttribute() {
    }

    final UserProfileUpdate a(Calendar calendar, String string2, Z2 z24) {
        return new UserProfileUpdate(new gn(this.a.c, new SimpleDateFormat(string2).format(calendar.getTime()), new y8(), (yo)new z8(), z24));
    }

    public UserProfileUpdate<? extends ko> withAge(int n10) {
        int n13 = Calendar.getInstance(Locale.US).get(1);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, n13 - n10);
        return this.a(gregorianCalendar, "yyyy", new Q4(this.a.b));
    }

    public UserProfileUpdate<? extends ko> withAgeIfUndefined(int n10) {
        int n13 = Calendar.getInstance(Locale.US).get(1);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, n13 - n10);
        return this.a(gregorianCalendar, "yyyy", new hl(this.a.b));
    }

    public UserProfileUpdate<? extends ko> withBirthDate(int n10) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, n10);
        return this.a(gregorianCalendar, "yyyy", new Q4(this.a.b));
    }

    public UserProfileUpdate<? extends ko> withBirthDate(int n10, int n13) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, n10);
        gregorianCalendar.set(2, n13 - 1);
        gregorianCalendar.set(5, 1);
        return this.a(gregorianCalendar, "yyyy-MM", new Q4(this.a.b));
    }

    public UserProfileUpdate<? extends ko> withBirthDate(int n10, int n13, int n14) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, n10);
        gregorianCalendar.set(2, n13 - 1);
        gregorianCalendar.set(5, n14);
        return this.a(gregorianCalendar, "yyyy-MM-dd", new Q4(this.a.b));
    }

    public UserProfileUpdate<? extends ko> withBirthDate(@NonNull Calendar calendar) {
        return this.a(calendar, "yyyy-MM-dd", new Q4(this.a.b));
    }

    public UserProfileUpdate<? extends ko> withBirthDateIfUndefined(int n10) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, n10);
        return this.a(gregorianCalendar, "yyyy", new hl(this.a.b));
    }

    public UserProfileUpdate<? extends ko> withBirthDateIfUndefined(int n10, int n13) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, n10);
        gregorianCalendar.set(2, n13 - 1);
        gregorianCalendar.set(5, 1);
        return this.a(gregorianCalendar, "yyyy-MM", new hl(this.a.b));
    }

    public UserProfileUpdate<? extends ko> withBirthDateIfUndefined(int n10, int n13, int n14) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, n10);
        gregorianCalendar.set(2, n13 - 1);
        gregorianCalendar.set(5, n14);
        return this.a(gregorianCalendar, "yyyy-MM-dd", new hl(this.a.b));
    }

    public UserProfileUpdate<? extends ko> withBirthDateIfUndefined(@NonNull Calendar calendar) {
        return this.a(calendar, "yyyy-MM-dd", new hl(this.a.b));
    }

    public UserProfileUpdate<? extends ko> withValueReset() {
        return new UserProfileUpdate(new Xi(0, this.a.c, (yo)new z8(), new Hl()));
    }
}

