/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.o70
 *  com.yandex.mobile.ads.impl.rl2
 *  com.yandex.mobile.ads.impl.sl2
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.o70;
import com.yandex.mobile.ads.impl.rl2;
import com.yandex.mobile.ads.impl.sl2;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class sy1
implements rl2<o70> {
    @NotNull
    private final sl2 a;

    public sy1(@NotNull sl2 sl22) {
        this.a = sl22;
    }

    @Nullable
    public final o70 a(@NotNull XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        this.a.getClass();
        Object var2_2 = null;
        xmlPullParser.require(2, null, "Extension");
        String string2 = xmlPullParser.getAttributeValue(null, "type");
        this.a.getClass();
        String string3 = sl2.a((XmlPullParser)xmlPullParser);
        xmlPullParser = var2_2;
        if (string2 != null) {
            if (string2.length() == 0) {
                xmlPullParser = var2_2;
            } else {
                xmlPullParser = var2_2;
                if (string3.length() > 0) {
                    xmlPullParser = new o70(string2, string3);
                }
            }
        }
        return xmlPullParser;
    }
}

