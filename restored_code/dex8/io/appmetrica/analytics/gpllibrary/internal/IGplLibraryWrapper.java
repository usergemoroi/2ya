/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.gpllibrary.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;

public interface IGplLibraryWrapper {
    public void startLocationUpdates(@NonNull GplLibraryWrapper.Priority var1) throws Throwable;

    public void stopLocationUpdates() throws Throwable;

    public void updateLastKnownLocation() throws Throwable;
}

