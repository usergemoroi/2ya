/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.logger.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class BaseDebugLogger {
    public BaseDebugLogger(@NonNull String string2) {
    }

    public void error(@NonNull String string2, @Nullable String string3, Object ... objectArray) {
    }

    public void error(@NonNull String string2, @Nullable Throwable throwable) {
    }

    public void error(@NonNull String string2, @Nullable Throwable throwable, @Nullable String string3, Object ... objectArray) {
    }

    public void info(@NonNull String string2, @Nullable String string3, Object ... objectArray) {
    }

    public void warning(@NonNull String string2, @Nullable String string3, Object ... objectArray) {
    }
}

