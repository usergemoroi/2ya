/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import io.appmetrica.analytics.impl.tf;
import org.jetbrains.annotations.NotNull;

public final class d4
extends SimpleThreadSafeToggle {
    public final tf a;

    public d4(@NotNull tf tf2) {
        super(tf2.e(), "[ClientApiTrackingStatusToggle]");
        this.a = tf2;
    }

    public final void a(boolean bl2) {
        this.updateState(bl2);
        this.a.f(bl2);
    }
}

