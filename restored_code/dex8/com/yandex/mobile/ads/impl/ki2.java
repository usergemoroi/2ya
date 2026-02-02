/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ji2
 *  com.yandex.mobile.ads.impl.rl2
 *  com.yandex.mobile.ads.impl.sl2
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ji2;
import com.yandex.mobile.ads.impl.rl2;
import com.yandex.mobile.ads.impl.sl2;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class ki2
implements rl2<ji2> {
    @NotNull
    private final sl2 a;

    public /* synthetic */ ki2() {
        this(new sl2());
    }

    public ki2(@NotNull sl2 sl22) {
        this.a = sl22;
    }

    @NotNull
    public final ji2 a(@NotNull XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        this.a.getClass();
        xmlPullParser.require(2, null, "ViewableImpression");
        ArrayList<String> arrayList = new ArrayList<String>();
        while (true) {
            this.a.getClass();
            if (xmlPullParser.next() == 3) break;
            this.a.getClass();
            if (xmlPullParser.getEventType() != 2) continue;
            if (y.e("Viewable", xmlPullParser.getName())) {
                this.a.getClass();
                arrayList.add(sl2.a((XmlPullParser)xmlPullParser));
                continue;
            }
            this.a.getClass();
            sl2.b((XmlPullParser)xmlPullParser);
        }
        return new ji2(arrayList);
    }
}

