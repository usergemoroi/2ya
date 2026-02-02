/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 */
package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.Ca;
import io.appmetrica.analytics.impl.Mo;
import io.appmetrica.analytics.impl.d6;
import io.appmetrica.analytics.impl.gl;
import io.appmetrica.analytics.impl.mq;
import io.appmetrica.analytics.impl.n;
import io.appmetrica.analytics.impl.w0;

public final class on {
    public final w0 a;
    public final Mo b;
    public final n c;
    public final gl d;
    public final d6 e;
    public final Ca f;

    public on(w0 w04, Mo mo3) {
        this(w04, mo3, A4.l().a(), A4.l().o(), A4.l().h(), A4.l().k());
    }

    public on(w0 w04, Mo mo3, n n10, gl gl2, d6 d64, Ca ca3) {
        this.a = w04;
        this.b = mo3;
        this.c = n10;
        this.d = gl2;
        this.e = d64;
        this.f = ca3;
    }

    public static Intent a(Activity activity) {
        return (Intent)SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new mq());
    }

    public static final Intent b(Activity activity) {
        return activity.getIntent();
    }
}

