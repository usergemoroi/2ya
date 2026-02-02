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
import javax.annotation.CheckForNull;

final class tr1<T>
extends jf1<T>
implements Serializable {
    private static final long serialVersionUID = 0L;
    final jf1<? super T> b;

    tr1(jf1<? super T> jf12) {
        this.b = (jf1)wj1.a(jf12);
    }

    public final <S extends T> jf1<S> b() {
        return this.b;
    }

    public final int compare(T t13, T t14) {
        return this.b.compare(t14, t13);
    }

    public final boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof tr1) {
            object = (tr1)object;
            return this.b.equals(((tr1)object).b);
        }
        return false;
    }

    public final int hashCode() {
        return -this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b);
        stringBuilder.append(".reverse()");
        return stringBuilder.toString();
    }
}

