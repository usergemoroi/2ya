/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.screenshot.impl.T;
import io.appmetrica.analytics.screenshot.impl.X;
import io.appmetrica.analytics.screenshot.impl.e;
import io.appmetrica.analytics.screenshot.impl.e0;
import io.appmetrica.analytics.screenshot.impl.f0;
import io.appmetrica.analytics.screenshot.impl.i0;
import io.appmetrica.analytics.screenshot.impl.o;

public final class h0 {
    public final e0 a;
    public final i0 b;
    public final f0 c;

    public h0(T object) {
        Object object2 = ((T)object).a();
        Object var4_3 = null;
        object2 = object2 != null ? new e0((e)object2) : null;
        Object object3 = ((T)object).c();
        object3 = object3 != null ? new i0((X)object3) : null;
        o o11 = ((T)object).b();
        object = var4_3;
        if (o11 != null) {
            object = new f0(o11);
        }
        this((e0)object2, (i0)object3, (f0)object);
    }

    public h0(e0 e03, i0 i04, f0 f04) {
        this.a = e03;
        this.b = i04;
        this.c = f04;
    }

    public final e0 a() {
        return this.a;
    }

    public final f0 b() {
        return this.c;
    }

    public final i0 c() {
        return this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ServiceSideScreenshotConfig(apiCaptorConfig=");
        stringBuilder.append(this.a);
        stringBuilder.append(", serviceCaptorConfig=");
        stringBuilder.append(this.b);
        stringBuilder.append(", contentObserverCaptorConfig=");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

