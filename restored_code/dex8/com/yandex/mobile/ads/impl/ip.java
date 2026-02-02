/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.hg
 *  com.yandex.mobile.ads.impl.hp
 *  com.yandex.mobile.ads.impl.hp$a
 *  com.yandex.mobile.ads.impl.w61
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.hg;
import com.yandex.mobile.ads.impl.hp;
import com.yandex.mobile.ads.impl.w61;
import kotlin.jvm.internal.y;
import org.json.JSONObject;

public final class ip
implements hg<hp> {
    public final Object a(JSONObject object) {
        block4: {
            block3: {
                block2: {
                    if (!object.has("value") || !object.isNull("value")) break block2;
                    object = new hp(hp.a.c, null);
                    break block3;
                }
                hp.a a13 = hp.a.b;
                if ((object = object.optString("value")) == null || ((String)object).length() == 0 || y.e(object, "null")) break block4;
                object = new hp(a13, (String)object);
            }
            return object;
        }
        throw new w61("Native Ad json has not required attributes");
    }
}

