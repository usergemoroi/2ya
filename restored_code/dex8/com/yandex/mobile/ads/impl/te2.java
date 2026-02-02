/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.rl2
 *  com.yandex.mobile.ads.impl.se2
 *  com.yandex.mobile.ads.impl.sl2
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.rl2;
import com.yandex.mobile.ads.impl.se2;
import com.yandex.mobile.ads.impl.sl2;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class te2
implements rl2<se2> {
    @NotNull
    private final sl2 a;

    public /* synthetic */ te2() {
        this(new sl2());
    }

    public te2(@NotNull sl2 sl22) {
        this.a = sl22;
    }

    @NotNull
    public final se2 a(@NotNull XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        this.a.getClass();
        String string2 = null;
        xmlPullParser.require(2, null, "VideoClicks");
        ArrayList<String> arrayList = new ArrayList<String>();
        while (true) {
            this.a.getClass();
            if (xmlPullParser.next() == 3) break;
            this.a.getClass();
            if (xmlPullParser.getEventType() != 2) continue;
            String string3 = xmlPullParser.getName();
            if (y.e("ClickThrough", string3)) {
                this.a.getClass();
                string3 = sl2.a((XmlPullParser)xmlPullParser);
                if (string3.length() <= 0) continue;
                string2 = string3;
                continue;
            }
            if (y.e("ClickTracking", string3)) {
                this.a.getClass();
                string3 = sl2.a((XmlPullParser)xmlPullParser);
                if (string3.length() <= 0) continue;
                arrayList.add(string3);
                continue;
            }
            this.a.getClass();
            sl2.b((XmlPullParser)xmlPullParser);
        }
        return new se2(string2, arrayList);
    }
}

