/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ln1
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.internal.a0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ln1;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.a0;
import org.jetbrains.annotations.NotNull;

final class vu1
extends a0
implements l<ln1, CharSequence> {
    public static final vu1 b = new vu1();

    vu1() {
        super(1);
    }

    @NotNull
    public static String a(@NotNull ln1 object) {
        String string2 = object.getKey();
        String string3 = object.getValue();
        object = new StringBuilder();
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("=");
        ((StringBuilder)object).append(string3);
        return ((StringBuilder)object).toString();
    }
}

