/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.g4;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

public final class o4 {
    public final String a;
    public final String b;
    public final Integer c;
    public final String d;
    public final CounterConfigurationReporterType e;

    public o4(String string2, String string3, Integer n10, String string4, CounterConfigurationReporterType counterConfigurationReporterType) {
        this.a = string2;
        this.b = string3;
        this.c = n10;
        this.d = string4;
        this.e = counterConfigurationReporterType;
    }

    public static o4 a(g4 g44) {
        return new o4(g44.b.getApiKey(), g44.a.a.getAsString("PROCESS_CFG_PACKAGE_NAME"), g44.a.a.getAsInteger("PROCESS_CFG_PROCESS_ID"), g44.a.a.getAsString("PROCESS_CFG_PROCESS_SESSION_ID"), g44.b.getReporterType());
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && o4.class == object.getClass()) {
            object = (o4)object;
            Object object2 = this.a;
            if (object2 != null ? !((String)object2).equals(((o4)object).a) : ((o4)object).a != null) {
                return false;
            }
            if (!this.b.equals(((o4)object).b)) {
                return false;
            }
            object2 = this.c;
            if (object2 != null ? !((Integer)object2).equals(((o4)object).c) : ((o4)object).c != null) {
                return false;
            }
            object2 = this.d;
            if (object2 != null ? !((String)object2).equals(((o4)object).d) : ((o4)object).d != null) {
                return false;
            }
            if (this.e != ((o4)object).e) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        Object object = this.a;
        int n10 = 0;
        int n13 = object != null ? ((String)object).hashCode() : 0;
        int n14 = this.b.hashCode();
        object = this.c;
        int n15 = object != null ? ((Integer)object).hashCode() : 0;
        object = this.d;
        if (object != null) {
            n10 = ((String)object).hashCode();
        }
        return ((Object)((Object)this.e)).hashCode() + (((n14 + n13 * 31) * 31 + n15) * 31 + n10) * 31;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ClientDescription{mApiKey='");
        stringBuilder.append(this.a);
        stringBuilder.append("', mPackageName='");
        stringBuilder.append(this.b);
        stringBuilder.append("', mProcessID=");
        stringBuilder.append(this.c);
        stringBuilder.append(", mProcessSessionID='");
        stringBuilder.append(this.d);
        stringBuilder.append("', mReporterType=");
        stringBuilder.append((Object)this.e);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

