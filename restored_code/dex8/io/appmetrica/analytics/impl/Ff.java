/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.if;
import io.appmetrica.analytics.impl.rb;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

public final class ff
implements Runnable {
    public final PluginErrorDetails a;
    public final if b;

    public ff(if if_, PluginErrorDetails pluginErrorDetails) {
        this.b = if_;
        this.a = pluginErrorDetails;
    }

    @Override
    public final void run() {
        ((rb)this.b.d.get()).getPluginExtension().reportUnhandledException(this.a);
    }
}

