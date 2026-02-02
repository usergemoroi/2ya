/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.g80
 *  com.yandex.mobile.ads.impl.hj
 *  com.yandex.mobile.ads.impl.rl2
 *  com.yandex.mobile.ads.impl.sl2
 *  kotlin.text.p
 *  org.xmlpull.v1.XmlPullParser
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.g80;
import com.yandex.mobile.ads.impl.hj;
import com.yandex.mobile.ads.impl.rl2;
import com.yandex.mobile.ads.impl.sl2;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

public final class l80
implements rl2<g80> {
    @NotNull
    private final sl2 a;

    public l80(@NotNull sl2 sl22) {
        this.a = sl22;
    }

    public final Object a(XmlPullParser xmlPullParser, hj object) {
        this.a.getClass();
        Object var3_3 = null;
        xmlPullParser.require(2, null, "FalseClick");
        this.a.getClass();
        object = xmlPullParser.getAttributeValue(null, "interval");
        object = object != null ? p.o((String)object) : null;
        this.a.getClass();
        String string2 = sl2.a((XmlPullParser)xmlPullParser);
        xmlPullParser = var3_3;
        if (string2.length() > 0) {
            xmlPullParser = var3_3;
            if (object != null) {
                xmlPullParser = new g80(string2, ((Long)object).longValue());
            }
        }
        return xmlPullParser;
    }
}

