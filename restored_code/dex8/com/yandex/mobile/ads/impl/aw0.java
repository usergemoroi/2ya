/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.hj
 *  com.yandex.mobile.ads.impl.rl2
 *  com.yandex.mobile.ads.impl.sl2
 *  com.yandex.mobile.ads.impl.yv0
 *  com.yandex.mobile.ads.impl.yv0$a
 *  org.xmlpull.v1.XmlPullParser
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.hj;
import com.yandex.mobile.ads.impl.rl2;
import com.yandex.mobile.ads.impl.sl2;
import com.yandex.mobile.ads.impl.yv0;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

public final class aw0
implements rl2<yv0> {
    @NotNull
    private final sl2 a;

    public /* synthetic */ aw0() {
        this(new sl2());
    }

    public aw0(@NotNull sl2 sl22) {
        this.a = sl22;
    }

    public final Object a(XmlPullParser xmlPullParser, hj object) {
        this.a.getClass();
        xmlPullParser.require(2, null, "MediaFile");
        this.a.getClass();
        String string2 = xmlPullParser.getAttributeValue(null, "delivery");
        this.a.getClass();
        String string3 = xmlPullParser.getAttributeValue(null, "type");
        this.a.getClass();
        String string4 = xmlPullParser.getAttributeValue(null, "height");
        this.a.getClass();
        String string5 = xmlPullParser.getAttributeValue(null, "width");
        this.a.getClass();
        object = xmlPullParser.getAttributeValue(null, "bitrate");
        this.a.getClass();
        String string6 = xmlPullParser.getAttributeValue(null, "apiFramework");
        this.a.getClass();
        String string7 = xmlPullParser.getAttributeValue(null, "id");
        this.a.getClass();
        String string8 = xmlPullParser.getAttributeValue(null, "codec");
        this.a.getClass();
        String string9 = xmlPullParser.getAttributeValue(null, "vmaf");
        this.a.getClass();
        return new yv0.a(sl2.a((XmlPullParser)xmlPullParser)).f(string7).d(string2).e(string4).i(string5).b((String)object).a(string6).g(string3).c(string8).h(string9).a();
    }
}

