/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.dq
 *  com.yandex.mobile.ads.impl.yx1$c
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dq;
import com.yandex.mobile.ads.impl.k;
import com.yandex.mobile.ads.impl.yx1;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class au0<K, V>
extends yx1.c<Map.Entry<K, V>> {
    au0() {
    }

    public final void clear() {
        ((k.a.a)this).b.clear();
    }

    public final boolean isEmpty() {
        return ((k.a.a)this).b.isEmpty();
    }

    public final boolean removeAll(Collection<?> collection) {
        try {
            collection.getClass();
            boolean bl2 = super.removeAll(collection);
            return bl2;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            Iterator<?> iterator = collection.iterator();
            boolean bl3 = false;
            while (iterator.hasNext()) {
                collection = iterator.next();
                bl3 |= ((k.a.a)this).remove(collection);
            }
            return bl3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean retainAll(Collection<?> iterator) {
        try {
            iterator.getClass();
            return super.retainAll(iterator);
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            int n10 = iterator.size();
            if (n10 < 3) {
                dq.a((int)n10, (String)"expectedSize");
                ++n10;
            } else {
                n10 = n10 < 0x40000000 ? (int)((float)n10 / 0.75f + 1.0f) : Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(n10);
            iterator = iterator.iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    return ((k.a.a)this).b.keySet().retainAll(hashSet);
                }
                Object e11 = iterator.next();
                Set set = ((k.a.a)this).b.d.entrySet();
                set.getClass();
                try {
                    boolean bl2 = set.contains(e11);
                    if (!bl2) continue;
                }
                catch (ClassCastException | NullPointerException runtimeException) {
                    continue;
                }
                if (!(e11 instanceof Map.Entry)) continue;
                hashSet.add(((Map.Entry)e11).getKey());
            }
        }
    }

    public final int size() {
        return ((k.a.a)this).b.d.size();
    }
}

