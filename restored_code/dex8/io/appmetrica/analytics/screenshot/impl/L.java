/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.screenshot.impl.D;
import io.appmetrica.analytics.screenshot.impl.F;
import io.appmetrica.analytics.screenshot.impl.i;
import io.appmetrica.analytics.screenshot.impl.j;
import io.appmetrica.analytics.screenshot.impl.m;
import io.appmetrica.analytics.screenshot.impl.x;
import io.appmetrica.analytics.screenshot.impl.z;
import kotlin.jvm.internal.y;

public final class l {
    public final i a;
    public final m b;
    public final j c;

    public l(D object) {
        Object object2 = ((D)object).a();
        Object var4_3 = null;
        object2 = object2 != null ? new i((x)object2) : null;
        Object object3 = ((D)object).c();
        object3 = object3 != null ? new m((F)object3) : null;
        z z13 = ((D)object).b();
        object = var4_3;
        if (z13 != null) {
            object = new j(z13);
        }
        this((i)object2, (m)object3, (j)object);
    }

    public l(i i14, m m12, j j10) {
        this.a = i14;
        this.b = m12;
        this.c = j10;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        Class<?> clazz = object != null ? object.getClass() : null;
        if (!y.e(l.class, clazz)) {
            return false;
        }
        if (object != null) {
            object = (l)object;
            if (!y.e(this.a, ((l)object).a)) {
                return false;
            }
            if (!y.e(this.b, ((l)object).b)) {
                return false;
            }
            return y.e(this.c, ((l)object).c);
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideScreenshotConfig");
    }

    public final int hashCode() {
        Object object = this.a;
        int n10 = 0;
        int n13 = object != null ? ((i)object).hashCode() : 0;
        object = this.b;
        int n14 = object != null ? ((m)object).hashCode() : 0;
        object = this.c;
        if (object != null) {
            n10 = ((j)object).hashCode();
        }
        return (n13 * 31 + n14) * 31 + n10;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ClientSideScreenshotConfig(apiCaptorConfig=");
        stringBuilder.append(this.a);
        stringBuilder.append(", serviceCaptorConfig=");
        stringBuilder.append(this.b);
        stringBuilder.append(", contentObserverCaptorConfig=");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

