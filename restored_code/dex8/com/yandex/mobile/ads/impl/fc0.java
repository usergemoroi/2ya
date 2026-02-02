/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.errorprone.annotations.CanIgnoreReturnValue
 *  com.yandex.mobile.ads.impl.gc0
 *  com.yandex.mobile.ads.impl.yx1
 */
package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.yandex.mobile.ads.impl.gc0;
import com.yandex.mobile.ads.impl.yx1;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

public abstract class fc0<K, V>
extends gc0
implements Map<K, V> {
    protected fc0() {
    }

    protected final boolean a(@CheckForNull Object set) {
        boolean bl2;
        if (this == set) {
            bl2 = true;
        } else if (set instanceof Map) {
            Object object = (Map)((Object)set);
            set = this.entrySet();
            object = object.entrySet();
            bl2 = ((yx1.a)set).equals(object);
        } else {
            bl2 = false;
        }
        return bl2;
    }

    protected abstract Map<K, V> b();

    protected final int c() {
        return yx1.a(this.entrySet());
    }

    @Override
    public final void clear() {
        this.b().clear();
    }

    @Override
    public boolean containsKey(@CheckForNull Object object) {
        return this.b().containsKey(object);
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return this.b().entrySet();
    }

    @Override
    @CheckForNull
    public V get(@CheckForNull Object object) {
        return this.b().get(object);
    }

    @Override
    public boolean isEmpty() {
        return this.b().isEmpty();
    }

    @Override
    public Set<K> keySet() {
        return this.b().keySet();
    }

    @Override
    @CheckForNull
    @CanIgnoreReturnValue
    public final V put(K k11, V v14) {
        return this.b().put(k11, v14);
    }

    @Override
    public final void putAll(Map<? extends K, ? extends V> map2) {
        this.b().putAll(map2);
    }

    @Override
    @CheckForNull
    @CanIgnoreReturnValue
    public final V remove(@CheckForNull Object object) {
        return this.b().remove(object);
    }

    @Override
    public int size() {
        return this.b().size();
    }

    @Override
    public final Collection<V> values() {
        return this.b().values();
    }
}

