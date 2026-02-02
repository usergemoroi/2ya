/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.hj
 *  com.yandex.mobile.ads.impl.rl2
 *  com.yandex.mobile.ads.impl.sl2
 *  com.yandex.mobile.ads.impl.xh0
 *  com.yandex.mobile.ads.impl.xh0$a
 *  com.yandex.mobile.ads.impl.xh0$c
 *  org.xmlpull.v1.XmlPullParser
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.hj;
import com.yandex.mobile.ads.impl.rl2;
import com.yandex.mobile.ads.impl.sl2;
import com.yandex.mobile.ads.impl.xh0;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

public final class yh0
implements rl2<xh0> {
    @NotNull
    private final sl2 a;

    public /* synthetic */ yh0() {
        this(new sl2());
    }

    public yh0(@NotNull sl2 sl22) {
        this.a = sl22;
    }

    public final Object a(XmlPullParser xmlPullParser, hj hj3) {
        this.a.getClass();
        xmlPullParser.require(2, null, "Icon");
        hj3 = new xh0.a();
        this.a.getClass();
        String string2 = xmlPullParser.getAttributeValue(null, "program");
        this.a.getClass();
        String string3 = xmlPullParser.getAttributeValue(null, "height");
        this.a.getClass();
        String string4 = xmlPullParser.getAttributeValue(null, "width");
        this.a.getClass();
        String string5 = xmlPullParser.getAttributeValue(null, "xPosition");
        this.a.getClass();
        String string6 = xmlPullParser.getAttributeValue(null, "yPosition");
        this.a.getClass();
        String string7 = xmlPullParser.getAttributeValue(null, "apiFramework");
        this.a.getClass();
        String string8 = xmlPullParser.getAttributeValue(null, "offset");
        this.a.getClass();
        String string9 = xmlPullParser.getAttributeValue(null, "duration");
        block0: while (true) {
            this.a.getClass();
            if (xmlPullParser.next() == 3) break;
            this.a.getClass();
            if (xmlPullParser.getEventType() != 2) continue;
            String string10 = xmlPullParser.getName();
            xh0.c.c.getClass();
            Object object = xh0.c.values();
            int n10 = ((xh0.c[])object).length;
            for (int i14 = 0; i14 < n10; ++i14) {
                if (!y.e(object[i14].a(), string10)) continue;
                this.a.getClass();
                object = sl2.a((XmlPullParser)xmlPullParser);
                hj3.g(string10).h((String)object);
                continue block0;
            }
            this.a.getClass();
            sl2.b((XmlPullParser)xmlPullParser);
        }
        return hj3.f(string2).c(string3).j(string4).d(string5).i(string6).a(string7).e(string8).b(string9).a();
    }
}

