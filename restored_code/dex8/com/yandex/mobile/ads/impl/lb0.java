/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.lifecycle.Lifecycle
 *  androidx.lifecycle.Lifecycle$State
 *  androidx.lifecycle.LifecycleObserver
 *  androidx.lifecycle.LifecycleOwner
 */
package com.yandex.mobile.ads.impl;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import org.jetbrains.annotations.NotNull;

public final class lb0
implements LifecycleOwner {
    @NotNull
    private final a a = new Lifecycle(){
        @NotNull
        private final Lifecycle.State a = Lifecycle.State.STARTED;

        public final void addObserver(@NotNull LifecycleObserver lifecycleObserver) {
        }

        @NotNull
        public final Lifecycle.State getCurrentState() {
            return this.a;
        }

        public final void removeObserver(@NotNull LifecycleObserver lifecycleObserver) {
        }
    };

    @NotNull
    public final Lifecycle getLifecycle() {
        return this.a;
    }
}

