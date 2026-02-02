/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.yx1$d
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.wx1;
import com.yandex.mobile.ads.impl.yx1;
import com.yandex.mobile.ads.impl.zj0;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

final class xx1
extends yx1.d<Object> {
    final Set b;
    final Set c;

    xx1(zj0 zj02, zj0 zj03) {
        this.b = zj02;
        this.c = zj03;
        super(null);
    }

    public final boolean contains(@CheckForNull Object object) {
        boolean bl2 = this.b.contains(object) && this.c.contains(object);
        return bl2;
    }

    public final boolean containsAll(Collection<?> collection) {
        boolean bl2 = this.b.containsAll(collection) && this.c.containsAll(collection);
        return bl2;
    }

    public final boolean isEmpty() {
        return Collections.disjoint(this.c, this.b);
    }

    public final Iterator iterator() {
        return new wx1(this);
    }

    public final int size() {
        Iterator iterator = this.b.iterator();
        int n10 = 0;
        while (iterator.hasNext()) {
            Object e11 = iterator.next();
            if (!this.c.contains(e11)) continue;
            ++n10;
        }
        return n10;
    }
}

