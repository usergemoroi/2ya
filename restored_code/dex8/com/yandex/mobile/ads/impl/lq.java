/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.jf1
 *  com.yandex.mobile.ads.impl.wj1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jf1;
import com.yandex.mobile.ads.impl.wj1;
import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;

final class lq<T>
extends jf1<T>
implements Serializable {
    private static final long serialVersionUID = 0L;
    final Comparator<T> b;

    lq(Comparator<T> comparator) {
        this.b = (Comparator)wj1.a(comparator);
    }

    public final int compare(T t13, T t14) {
        return this.b.compare(t13, t14);
    }

    public final boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof lq) {
            object = (lq)object;
            return this.b.equals(((lq)object).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }
}

