/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.n4
 *  com.yandex.mobile.ads.impl.o4
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.internal.a0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.n4;
import com.yandex.mobile.ads.impl.o4;
import java.util.Set;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.a0;

final class ah1
extends a0
implements l<n4, Boolean> {
    final Set<o4> b;

    ah1(Set<? extends o4> set) {
        this.b = set;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (n4)object;
        return this.b.contains(object.a());
    }
}

