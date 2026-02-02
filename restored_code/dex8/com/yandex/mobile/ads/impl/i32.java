/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.hf0
 *  com.yandex.mobile.ads.impl.kr1
 *  com.yandex.mobile.ads.impl.zq1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.hf0;
import com.yandex.mobile.ads.impl.kr1;
import com.yandex.mobile.ads.impl.zq1;
import java.util.Map;
import kotlin.text.d;

public final class i32
implements kr1<String> {
    public final Object a(zq1 object) {
        byte[] byArray = object.a().a();
        if (byArray != null) {
            try {
                String string2 = new String(byArray, hf0.a((Map)object.b()));
                object = string2;
            }
            catch (Exception exception) {
                object = new String(byArray, d.b);
            }
        } else {
            object = null;
        }
        return object;
    }
}

