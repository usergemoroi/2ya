/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.properties.e
 *  kotlin.reflect.KProperty
 */
package com.yandex.mobile.ads.impl;

import java.lang.ref.WeakReference;
import kotlin.properties.e;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ko1
implements e<Object, Object> {
    @NotNull
    private WeakReference<Object> a;

    ko1(Object object) {
        this.a = new WeakReference<Object>(object);
    }

    @Nullable
    public final Object getValue(@Nullable Object object, @NotNull KProperty<?> kProperty) {
        return this.a.get();
    }

    public final void setValue(@Nullable Object object, @NotNull KProperty<?> kProperty, @Nullable Object object2) {
        this.a = new WeakReference<Object>(object2);
    }
}

