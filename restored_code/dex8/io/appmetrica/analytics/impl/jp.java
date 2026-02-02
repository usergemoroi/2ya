/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.I0;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

public final class jp
implements Runnable {
    public final I0 c;
    public final PluginErrorDetails d;

    public /* synthetic */ jp(I0 i04, PluginErrorDetails pluginErrorDetails) {
        this.c = i04;
        this.d = pluginErrorDetails;
    }

    @Override
    public final void run() {
        I0.a(this.c, this.d);
    }
}

