/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.internal.a0
 */
package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.a0;
import org.jetbrains.annotations.NotNull;

final class za0
extends a0
implements l<Map.Entry<? extends String, ? extends Object>, CharSequence> {
    public static final za0 b = new za0();

    za0() {
        super(1);
    }

    @NotNull
    public static String a(@NotNull Map.Entry object) {
        Object k11 = object.getKey();
        Object v14 = object.getValue();
        object = new StringBuilder();
        ((StringBuilder)object).append(k11);
        ((StringBuilder)object).append("=");
        ((StringBuilder)object).append(v14);
        return ((StringBuilder)object).toString();
    }
}

