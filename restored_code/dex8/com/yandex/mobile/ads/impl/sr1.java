/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.jf1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jf1;
import com.yandex.mobile.ads.impl.nc1;
import java.io.Serializable;

final class sr1
extends jf1<Comparable<?>>
implements Serializable {
    static final sr1 b = new sr1();
    private static final long serialVersionUID = 0L;

    private sr1() {
    }

    private Object readResolve() {
        return b;
    }

    public final <S extends Comparable<?>> jf1<S> b() {
        return nc1.b;
    }

    public final int compare(Object object, Object object2) {
        object = (Comparable)object;
        object2 = (Comparable)object2;
        object.getClass();
        int n10 = object == object2 ? 0 : object2.compareTo(object);
        return n10;
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}

