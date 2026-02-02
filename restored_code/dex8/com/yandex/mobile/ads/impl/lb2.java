/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.hj
 *  com.yandex.mobile.ads.impl.jq0
 *  com.yandex.mobile.ads.impl.kb2
 *  com.yandex.mobile.ads.impl.kq0
 *  com.yandex.mobile.ads.impl.rl2
 *  com.yandex.mobile.ads.impl.sl2
 *  com.yandex.mobile.ads.impl.t62
 *  org.xmlpull.v1.XmlPullParser
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.hb2;
import com.yandex.mobile.ads.impl.hj;
import com.yandex.mobile.ads.impl.jq0;
import com.yandex.mobile.ads.impl.kb2;
import com.yandex.mobile.ads.impl.kq0;
import com.yandex.mobile.ads.impl.rl2;
import com.yandex.mobile.ads.impl.sl2;
import com.yandex.mobile.ads.impl.t62;
import java.util.HashMap;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

public final class lb2
implements rl2<hb2> {
    @NotNull
    private final sl2 a;
    @NotNull
    private final kq0 b;
    @NotNull
    private final kb2 c;
    @NotNull
    private final t62 d;

    public /* synthetic */ lb2() {
        this(new sl2(), new kq0(), new kb2(), new t62());
    }

    public lb2(@NotNull sl2 sl22, @NotNull kq0 kq02, @NotNull kb2 kb22, @NotNull t62 t622) {
        this.a = sl22;
        this.b = kq02;
        this.c = kb22;
        this.d = t622;
    }

    public final Object a(XmlPullParser object, hj object2) {
        this.a.getClass();
        Object var5_3 = null;
        object.require(2, null, "Verification");
        this.a.getClass();
        String string2 = object.getAttributeValue(null, "vendor");
        HashMap hashMap = new HashMap();
        jq0 jq02 = null;
        object2 = null;
        while (true) {
            this.a.getClass();
            if (object.next() == 3) break;
            this.a.getClass();
            if (object.getEventType() != 2) continue;
            String string3 = object.getName();
            if (y.e("JavaScriptResource", string3)) {
                jq02 = this.b.a(object);
                continue;
            }
            if (y.e("VerificationParameters", string3)) {
                object2 = this.c.a(object);
                continue;
            }
            if (y.e("TrackingEvents", string3)) {
                hashMap = this.d.a(object);
                continue;
            }
            this.a.getClass();
            sl2.b((XmlPullParser)object);
        }
        object = var5_3;
        if (string2 != null) {
            object = string2.length() == 0 ? var5_3 : new hb2(string2, jq02, (String)object2, hashMap);
        }
        return object;
    }
}

