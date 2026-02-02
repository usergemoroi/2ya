/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter;
import io.appmetrica.analytics.impl.cj;
import io.appmetrica.analytics.impl.om;
import io.appmetrica.analytics.impl.tm;
import org.jetbrains.annotations.NotNull;

public interface ab
extends SimpleAdvertisingIdGetter,
tm {
    @NotNull
    public AdvertisingIdsHolder a();

    @NotNull
    public AdvertisingIdsHolder a(@NotNull cj var1);

    @Override
    public /* synthetic */ void a(@NonNull om var1);

    public void b(boolean var1);

    public void c(boolean var1);

    @NotNull
    public AdvertisingIdsHolder getIdentifiers();

    public void init();
}

