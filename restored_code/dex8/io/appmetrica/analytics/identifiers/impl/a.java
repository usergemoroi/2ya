/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.identifiers.impl;

import kotlin.jvm.internal.y;

public final class a {
    public final String a;
    public final String b;
    public final Boolean c;

    public a(String string2, String string3, Boolean bl2) {
        this.a = string2;
        this.b = string3;
        this.c = bl2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        object = (a)object;
        if (!y.e(this.a, ((a)object).a)) {
            return false;
        }
        if (!y.e(this.b, ((a)object).b)) {
            return false;
        }
        return y.e(this.c, ((a)object).c);
    }

    public final int hashCode() {
        int n10 = this.a.hashCode();
        Object object = this.b;
        int n13 = 0;
        int n14 = object == null ? 0 : ((String)object).hashCode();
        object = this.c;
        if (object != null) {
            n13 = object.hashCode();
        }
        return (n10 * 31 + n14) * 31 + n13;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AdvIdInfo(provider=");
        stringBuilder.append(this.a);
        stringBuilder.append(", advId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", limitedAdTracking=");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

