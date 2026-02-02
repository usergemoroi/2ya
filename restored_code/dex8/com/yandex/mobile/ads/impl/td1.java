/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.dg
 *  com.yandex.mobile.ads.impl.ur1
 *  com.yandex.mobile.ads.impl.vf
 *  com.yandex.mobile.ads.impl.w61
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dg;
import com.yandex.mobile.ads.impl.ur1;
import com.yandex.mobile.ads.impl.vf;
import com.yandex.mobile.ads.impl.w61;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

public final class td1
extends dg<String, String> {
    @NotNull
    private final ur1 a;

    public td1(@NotNull ur1 ur12) {
        this.a = ur12;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final vf a(Object object, String string2) {
        String string3 = (String)object;
        object = string3;
        if (!y.e("review_count", string2)) return dg.a((String)string2, (String)"string", (Object)object);
        try {
            object = this.a.a(string3);
            return dg.a((String)string2, (String)"string", (Object)object);
        }
        catch (w61 w612) {
            object = string3;
            return dg.a((String)string2, (String)"string", (Object)object);
        }
    }
}

