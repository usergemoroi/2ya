/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.network.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.network.internal.Response;

public interface Call {
    @NonNull
    public Response execute();
}

