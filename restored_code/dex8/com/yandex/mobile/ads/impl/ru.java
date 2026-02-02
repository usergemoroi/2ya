/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.hj
 *  com.yandex.mobile.ads.impl.lu$a
 *  com.yandex.mobile.ads.impl.nr0
 *  com.yandex.mobile.ads.impl.pu
 *  com.yandex.mobile.ads.impl.rl2
 *  com.yandex.mobile.ads.impl.sl2
 *  org.xmlpull.v1.XmlPullParser
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.hj;
import com.yandex.mobile.ads.impl.lu;
import com.yandex.mobile.ads.impl.nr0;
import com.yandex.mobile.ads.impl.pu;
import com.yandex.mobile.ads.impl.rl2;
import com.yandex.mobile.ads.impl.sl2;
import com.yandex.mobile.ads.impl.wp1;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

public final class ru
implements rl2<lu> {
    @NotNull
    private final sl2 a;
    @NotNull
    private final nr0 b;
    @NotNull
    private final pu c;

    public /* synthetic */ ru(Context context, wp1 wp12) {
        this(new sl2(), new nr0(), new pu(context, wp12));
    }

    public ru(@NotNull sl2 sl22, @NotNull nr0 nr02, @NotNull pu pu3) {
        this.a = sl22;
        this.b = nr02;
        this.c = pu3;
    }

    public final Object a(XmlPullParser object, hj hj3) {
        this.a.getClass();
        Object var4_3 = null;
        object.require(2, null, "Creative");
        this.a.getClass();
        String string2 = object.getAttributeValue(null, "id");
        lu.a a14 = new /* Unavailable Anonymous Inner Class!! */;
        a14.c(string2);
        boolean bl2 = false;
        while (true) {
            this.a.getClass();
            if (object.next() == 3) break;
            this.a.getClass();
            if (object.getEventType() != 2) continue;
            string2 = object.getName();
            if (y.e("Linear", string2)) {
                this.b.a(object, a14, hj3);
                bl2 = true;
                continue;
            }
            if (y.e("CreativeExtensions", string2)) {
                a14.a(this.c.a(object, hj3));
                continue;
            }
            this.a.getClass();
            sl2.b((XmlPullParser)object);
        }
        object = var4_3;
        if (bl2) {
            object = a14.a();
        }
        return object;
    }
}

