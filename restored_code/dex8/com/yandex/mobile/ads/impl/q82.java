/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.errorprone.annotations.DoNotCall
 *  com.yandex.mobile.ads.impl.p82
 */
package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.DoNotCall;
import com.yandex.mobile.ads.impl.p82;
import java.util.ListIterator;

public abstract class q82<E>
extends p82<E>
implements ListIterator<E> {
    protected q82() {
    }

    @Override
    @Deprecated
    @DoNotCall(value="Always throws UnsupportedOperationException")
    public final void add(E e11) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    @DoNotCall(value="Always throws UnsupportedOperationException")
    public final void set(E e11) {
        throw new UnsupportedOperationException();
    }
}

