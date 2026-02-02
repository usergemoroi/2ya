/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.wd2$a
 *  kotlin.properties.b
 *  kotlin.reflect.KProperty
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ud2;
import com.yandex.mobile.ads.impl.wd2;
import kotlin.jvm.internal.y;
import kotlin.properties.b;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

public final class td2
extends b<wd2.a> {
    final ud2 a;

    public td2(ud2 ud22) {
        this.a = ud22;
        super(null);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    protected final void afterChange(@NotNull KProperty kProperty, Object object, Object object2) {
        y.j(kProperty, "property");
        kProperty = (wd2.a)object2;
        object = (wd2.a)object;
        ud2.a(this.a).a((wd2.a)kProperty);
    }
}

