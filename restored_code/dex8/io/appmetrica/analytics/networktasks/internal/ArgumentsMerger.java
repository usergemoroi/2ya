/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;

public interface ArgumentsMerger<I, O> {
    public boolean compareWithOtherArguments(@NonNull I var1);

    @NonNull
    public O mergeFrom(@NonNull I var1);
}

