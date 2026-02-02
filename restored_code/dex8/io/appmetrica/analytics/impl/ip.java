/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.I0;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

public final class ip
implements Runnable {
    public final I0 c;
    public final PluginErrorDetails d;
    public final String e;

    public /* synthetic */ ip(I0 i04, PluginErrorDetails pluginErrorDetails, String string2) {
        this.c = i04;
        this.d = pluginErrorDetails;
        this.e = string2;
    }

    @Override
    public final void run() {
        I0.a(this.c, this.d, this.e);
    }
}

