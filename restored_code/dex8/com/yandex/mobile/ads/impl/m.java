/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.errorprone.annotations.concurrent.LazyInit
 *  com.yandex.mobile.ads.impl.m$a
 *  com.yandex.mobile.ads.impl.u31
 */
package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.concurrent.LazyInit;
import com.yandex.mobile.ads.impl.i;
import com.yandex.mobile.ads.impl.k;
import com.yandex.mobile.ads.impl.m;
import com.yandex.mobile.ads.impl.u31;
import com.yandex.mobile.ads.impl.y31;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

abstract class m<K, V>
implements u31<K, V> {
    @LazyInit
    @CheckForNull
    private transient Set<K> b;
    @LazyInit
    @CheckForNull
    private transient Collection<V> c;
    @LazyInit
    @CheckForNull
    private transient Map<K, Collection<V>> d;

    m() {
    }

    public Map<K, Collection<V>> a() {
        Map<K, Collection<Collection<Collection<Collection<V>>>>> map2;
        Map<K, Collection<Collection<Collection<Collection<V>>>>> map3 = map2 = this.d;
        if (map2 == null) {
            map3 = ((y31)this).e();
            this.d = map3;
        }
        return map3;
    }

    public final Set<K> b() {
        Set<K> set;
        Set<K> set2 = set = this.b;
        if (set == null) {
            this.b = set2 = ((y31)this).f();
        }
        return set2;
    }

    public boolean equals(@CheckForNull Object map2) {
        boolean bl2;
        if (map2 == this) {
            bl2 = true;
        } else if (map2 instanceof u31) {
            Object object = (u31)map2;
            map2 = ((i)this).a();
            object = object.a();
            bl2 = ((k.a)((Object)map2)).equals(object);
        } else {
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        return ((k.a)((Object)this.a())).d.hashCode();
    }

    public final String toString() {
        return ((k.a)((Object)this.a())).d.toString();
    }

    public Collection<V> values() {
        a a13;
        a a14 = a13 = this.c;
        if (a13 == null) {
            this.c = a14 = new /* Unavailable Anonymous Inner Class!! */;
        }
        return a14;
    }
}

