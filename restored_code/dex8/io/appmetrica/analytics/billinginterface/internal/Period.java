/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.billinginterface.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Period {
    private static final Pattern a = Pattern.compile("P(\\d+)(\\S+)");
    public final int number;
    @NonNull
    public final TimeUnit timeUnit;

    public Period(int n10, @NonNull TimeUnit timeUnit) {
        this.number = n10;
        this.timeUnit = timeUnit;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public static Period parse(@NonNull String object) {
        Object object2 = a.matcher((CharSequence)object);
        if (!((Matcher)object2).find()) return null;
        String string2 = ((Matcher)object2).group(1);
        object2 = ((Matcher)object2).group(2);
        if (string2 == null) return null;
        if (object2 == null) return null;
        try {
            void var0_7;
            int n10 = Integer.parseInt(string2);
            char c11 = ((String)object2).charAt(0);
            if (c11 != 'D') {
                if (c11 != 'M') {
                    if (c11 != 'W') {
                        if (c11 != 'Y') {
                            TimeUnit timeUnit = TimeUnit.TIME_UNIT_UNKNOWN;
                            return new Period(n10, (TimeUnit)var0_7);
                        } else {
                            TimeUnit timeUnit = TimeUnit.YEAR;
                        }
                        return new Period(n10, (TimeUnit)var0_7);
                    }
                    TimeUnit timeUnit = TimeUnit.WEEK;
                    return new Period(n10, (TimeUnit)var0_7);
                }
                TimeUnit timeUnit = TimeUnit.MONTH;
                return new Period(n10, (TimeUnit)var0_7);
            }
            TimeUnit timeUnit = TimeUnit.DAY;
            return new Period(n10, (TimeUnit)var0_7);
        }
        // Removed invalid catch block
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (Period)object;
            if (this.number != ((Period)object).number) {
                return false;
            }
            return this.timeUnit == ((Period)object).timeUnit;
        }
        return false;
    }

    public int hashCode() {
        int n10 = this.number;
        return ((Object)((Object)this.timeUnit)).hashCode() + n10 * 31;
    }

    @NonNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Period{number=");
        stringBuilder.append(this.number);
        stringBuilder.append("timeUnit=");
        stringBuilder.append((Object)this.timeUnit);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class TimeUnit
    extends Enum<TimeUnit> {
        public static final /* enum */ TimeUnit DAY;
        public static final /* enum */ TimeUnit MONTH;
        public static final /* enum */ TimeUnit TIME_UNIT_UNKNOWN;
        public static final /* enum */ TimeUnit WEEK;
        public static final /* enum */ TimeUnit YEAR;
        private static final TimeUnit[] a;

        static {
            TimeUnit timeUnit;
            TimeUnit timeUnit2;
            TimeUnit timeUnit3;
            TimeUnit timeUnit4;
            TimeUnit timeUnit5;
            TIME_UNIT_UNKNOWN = timeUnit5 = new TimeUnit();
            DAY = timeUnit4 = new TimeUnit();
            WEEK = timeUnit3 = new TimeUnit();
            MONTH = timeUnit2 = new TimeUnit();
            YEAR = timeUnit = new TimeUnit();
            a = new TimeUnit[]{timeUnit5, timeUnit4, timeUnit3, timeUnit2, timeUnit};
        }

        public static TimeUnit valueOf(String string2) {
            return Enum.valueOf(TimeUnit.class, string2);
        }

        public static TimeUnit[] values() {
            return (TimeUnit[])a.clone();
        }
    }
}

