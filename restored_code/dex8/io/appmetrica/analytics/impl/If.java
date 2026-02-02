/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.ff;
import io.appmetrica.analytics.impl.gf;
import io.appmetrica.analytics.impl.hf;
import io.appmetrica.analytics.impl.lf;
import io.appmetrica.analytics.impl.mf;
import io.appmetrica.analytics.impl.rb;
import io.appmetrica.analytics.impl.te;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.plugins.StackTraceItem;
import java.util.Collection;
import java.util.List;

public final class if
implements IPluginReporter {
    public final lf a = new lf();
    public final mf b = new mf();
    public final IHandlerExecutor c = A4.l().g().a();
    public final Provider d;

    public if(@NonNull Provider<rb> provider) {
        this.d = provider;
    }

    @Override
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String string2) {
        List<StackTraceItem> list = this.a;
        ((lf)((Object)list)).a.a(pluginErrorDetails);
        te te3 = ((lf)((Object)list)).c;
        list = pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null;
        if (!te3.a((Collection<Object>)list).a) {
            return;
        }
        this.b.getClass();
        this.c.execute(new gf(this, pluginErrorDetails, string2));
    }

    @Override
    public final void reportError(@NonNull String string2, @Nullable String string3, @Nullable PluginErrorDetails pluginErrorDetails) {
        this.a.b.a(string2);
        this.b.getClass();
        this.c.execute(new hf(this, string2, string3, pluginErrorDetails));
    }

    @Override
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        this.a.a.a(pluginErrorDetails);
        this.b.getClass();
        this.c.execute(new ff(this, pluginErrorDetails));
    }
}

