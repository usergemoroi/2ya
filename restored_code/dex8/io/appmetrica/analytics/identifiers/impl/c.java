/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.identifiers.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.identifiers.impl.a;
import kotlin.jvm.internal.y;

public final class c {
    public final IdentifierStatus a;
    public final a b;
    public final String c;

    public c(IdentifierStatus identifierStatus, a a14, String string2) {
        this.a = identifierStatus;
        this.b = a14;
        this.c = string2;
    }

    public /* synthetic */ c(IdentifierStatus identifierStatus, a a14, String string2, int n10) {
        if ((n10 & 2) != 0) {
            a14 = null;
        }
        if ((n10 & 4) != 0) {
            string2 = null;
        }
        this(identifierStatus, a14, string2);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof c)) {
            return false;
        }
        object = (c)object;
        if (this.a != ((c)object).a) {
            return false;
        }
        if (!y.e(this.b, ((c)object).b)) {
            return false;
        }
        return y.e(this.c, ((c)object).c);
    }

    public final int hashCode() {
        int n10 = ((Object)((Object)this.a)).hashCode();
        Object object = this.b;
        int n13 = 0;
        int n14 = object == null ? 0 : ((a)object).hashCode();
        object = this.c;
        if (object != null) {
            n13 = ((String)object).hashCode();
        }
        return (n10 * 31 + n14) * 31 + n13;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AdvIdResult(status=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", advIdInfo=");
        stringBuilder.append(this.b);
        stringBuilder.append(", errorExplanation=");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

