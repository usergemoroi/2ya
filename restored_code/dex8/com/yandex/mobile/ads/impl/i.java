/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.errorprone.annotations.CanIgnoreReturnValue
 */
package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.yandex.mobile.ads.impl.k;
import com.yandex.mobile.ads.impl.ur0;
import java.util.Collection;
import java.util.Map;
import javax.annotation.CheckForNull;

abstract class i<K, V>
extends k<K, V>
implements ur0<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    protected i(Map<K, Collection<V>> map2) {
        super(map2);
    }

    @Override
    public final Map<K, Collection<V>> a() {
        return super.a();
    }

    @Override
    public final boolean equals(@CheckForNull Object object) {
        return super.equals(object);
    }

    @Override
    @CanIgnoreReturnValue
    public final boolean put(K k11, V v14) {
        return super.put(k11, v14);
    }
}

