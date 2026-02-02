/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.d52
 *  com.yandex.mobile.ads.impl.f52
 *  com.yandex.mobile.ads.impl.r62
 *  com.yandex.mobile.ads.impl.rl2
 *  com.yandex.mobile.ads.impl.sl2
 *  com.yandex.mobile.ads.impl.wa2
 *  kotlin.collections.t
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.d52;
import com.yandex.mobile.ads.impl.f52;
import com.yandex.mobile.ads.impl.r62;
import com.yandex.mobile.ads.impl.rl2;
import com.yandex.mobile.ads.impl.sl2;
import com.yandex.mobile.ads.impl.wa2;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class s62
implements rl2<r62> {
    @NotNull
    private final sl2 a;
    @NotNull
    private final f52 b;

    public /* synthetic */ s62() {
        sl2 sl22 = new sl2();
        d52[] d52Array = d52.values();
        this(sl22, new f52(new HashSet(t.p((Object[])Arrays.copyOf(d52Array, d52Array.length)))));
    }

    public s62(@NotNull sl2 sl22, @NotNull f52 f522) {
        this.a = sl22;
        this.b = f522;
    }

    @Nullable
    public final r62 a(@NotNull XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        this.a.getClass();
        Object var2_2 = null;
        xmlPullParser.require(2, null, "Tracking");
        String string2 = xmlPullParser.getAttributeValue(null, "event");
        String string3 = xmlPullParser.getAttributeValue(null, "offset");
        this.a.getClass();
        String string4 = sl2.a((XmlPullParser)xmlPullParser);
        if (string2 != null && string2.length() != 0 && string4.length() > 0) {
            xmlPullParser = var2_2;
            if (string3 != null) {
                xmlPullParser = this.b.a(string3);
            }
            return new r62(string2, string4, (wa2)xmlPullParser);
        }
        return null;
    }
}

