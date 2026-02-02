/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.if;
import io.appmetrica.analytics.impl.rb;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

public final class gf
implements Runnable {
    public final PluginErrorDetails a;
    public final String b;
    public final if c;

    public gf(if if_, PluginErrorDetails pluginErrorDetails, String string2) {
        this.c = if_;
        this.a = pluginErrorDetails;
        this.b = string2;
    }

    @Override
    public final void run() {
        ((rb)this.c.d.get()).getPluginExtension().reportError(this.a, this.b);
    }
}

