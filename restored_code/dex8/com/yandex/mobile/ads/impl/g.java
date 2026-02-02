/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.errorprone.annotations.CanIgnoreReturnValue
 *  com.yandex.mobile.ads.impl.p82
 *  com.yandex.mobile.ads.impl.s8
 */
package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.yandex.mobile.ads.impl.p82;
import com.yandex.mobile.ads.impl.s8;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

public abstract class g<T>
extends p82<T> {
    private int b = 2;
    @CheckForNull
    private T c;

    protected g() {
    }

    @CheckForNull
    protected abstract T a();

    @CheckForNull
    @CanIgnoreReturnValue
    protected final void b() {
        this.b = 3;
    }

    @CanIgnoreReturnValue
    public final boolean hasNext() {
        int n10 = this.b;
        if (n10 != 4) {
            n10 = s8.a((int)n10);
            boolean bl2 = true;
            if (n10 != 0) {
                if (n10 != 2) {
                    this.b = 4;
                    this.c = this.a();
                    if (this.b != 3) {
                        this.b = 1;
                    } else {
                        bl2 = false;
                    }
                    return bl2;
                }
                return false;
            }
            return true;
        }
        throw new IllegalStateException();
    }

    @CanIgnoreReturnValue
    public final T next() {
        if (this.hasNext()) {
            this.b = 2;
            T t13 = this.c;
            this.c = null;
            return t13;
        }
        throw new NoSuchElementException();
    }
}

