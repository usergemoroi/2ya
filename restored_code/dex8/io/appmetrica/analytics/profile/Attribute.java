/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.K4;
import io.appmetrica.analytics.impl.Qb;
import io.appmetrica.analytics.impl.fn;
import io.appmetrica.analytics.impl.gc;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.profile.BirthDateAttribute;
import io.appmetrica.analytics.profile.BooleanAttribute;
import io.appmetrica.analytics.profile.CounterAttribute;
import io.appmetrica.analytics.profile.GenderAttribute;
import io.appmetrica.analytics.profile.NameAttribute;
import io.appmetrica.analytics.profile.NotificationsEnabledAttribute;
import io.appmetrica.analytics.profile.NumberAttribute;
import io.appmetrica.analytics.profile.StringAttribute;

public final class Attribute {
    @NonNull
    public static BirthDateAttribute birthDate() {
        return new BirthDateAttribute();
    }

    @NonNull
    public static BooleanAttribute customBoolean(@NonNull String string2) {
        return new BooleanAttribute(string2, new Qb(), new gc(new K4(100)));
    }

    @NonNull
    public static CounterAttribute customCounter(@NonNull String string2) {
        return new CounterAttribute(string2, new Qb(), new gc(new K4(100)));
    }

    @NonNull
    public static NumberAttribute customNumber(@NonNull String string2) {
        return new NumberAttribute(string2, new Qb(), new gc(new K4(100)));
    }

    @NonNull
    public static StringAttribute customString(@NonNull String string2) {
        StringBuilder stringBuilder = new StringBuilder("String attribute \"");
        stringBuilder.append(string2);
        stringBuilder.append("\"");
        return new StringAttribute(string2, new fn(200, stringBuilder.toString(), PublicLogger.getAnonymousInstance()), new Qb(), new gc(new K4(100)));
    }

    @NonNull
    public static GenderAttribute gender() {
        return new GenderAttribute();
    }

    @NonNull
    public static NameAttribute name() {
        return new NameAttribute();
    }

    @NonNull
    public static NotificationsEnabledAttribute notificationsEnabled() {
        return new NotificationsEnabledAttribute();
    }
}

