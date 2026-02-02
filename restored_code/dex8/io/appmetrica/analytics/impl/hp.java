/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.I0;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

public final class hp
implements Runnable {
    public final I0 c;
    public final String d;
    public final String e;
    public final PluginErrorDetails f;

    public /* synthetic */ hp(I0 i04, String string2, String string3, PluginErrorDetails pluginErrorDetails) {
        this.c = i04;
        this.d = string2;
        this.e = string3;
        this.f = pluginErrorDetails;
    }

    @Override
    public final void run() {
        I0.a(this.c, this.d, this.e, this.f);
    }
}

