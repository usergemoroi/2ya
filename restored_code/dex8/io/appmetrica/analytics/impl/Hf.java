/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.if;
import io.appmetrica.analytics.impl.rb;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

public final class hf
implements Runnable {
    public final String a;
    public final String b;
    public final PluginErrorDetails c;
    public final if d;

    public hf(if if_, String string2, String string3, PluginErrorDetails pluginErrorDetails) {
        this.d = if_;
        this.a = string2;
        this.b = string3;
        this.c = pluginErrorDetails;
    }

    @Override
    public final void run() {
        ((rb)this.d.d.get()).getPluginExtension().reportError(this.a, this.b, this.c);
    }
}

