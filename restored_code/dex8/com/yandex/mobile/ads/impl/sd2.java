/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.wd2$b
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

public final class sd2
extends b<wd2.b> {
    final ud2 a;

    public sd2(ud2 ud22) {
        this.a = ud22;
        super(null);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    protected final void afterChange(@NotNull KProperty kProperty, Object object, Object object2) {
        y.j(kProperty, "property");
        kProperty = (wd2.b)object2;
        object = (wd2.b)object;
        ud2.a(this.a).a((wd2.b)kProperty);
    }
}

