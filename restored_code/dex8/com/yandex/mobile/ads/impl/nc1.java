/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.jf1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jf1;
import com.yandex.mobile.ads.impl.sr1;
import java.io.Serializable;

final class nc1
extends jf1<Comparable<?>>
implements Serializable {
    static final nc1 b = new nc1();
    private static final long serialVersionUID = 0L;

    private nc1() {
    }

    private Object readResolve() {
        return b;
    }

    public final <S extends Comparable<?>> jf1<S> b() {
        return sr1.b;
    }

    public final int compare(Object object, Object object2) {
        object = (Comparable)object;
        object2 = (Comparable)object2;
        object.getClass();
        object2.getClass();
        return object.compareTo(object2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}

