/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri$Builder
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;
import androidx.annotation.NonNull;

public interface IParamsAppender<T> {
    public void appendParams(@NonNull Uri.Builder var1, @NonNull T var2);
}

