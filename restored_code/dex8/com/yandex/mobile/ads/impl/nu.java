/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.hj
 *  com.yandex.mobile.ads.impl.rl2
 *  com.yandex.mobile.ads.impl.sl2
 *  org.json.JSONException
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.hj;
import com.yandex.mobile.ads.impl.l80;
import com.yandex.mobile.ads.impl.rl2;
import com.yandex.mobile.ads.impl.sl2;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class nu<T>
implements rl2<T> {
    @NotNull
    private final rl2<T> a;
    @NotNull
    private final sl2 b;

    public nu(@NotNull l80 l802, @NotNull sl2 sl22) {
        this.a = l802;
        this.b = sl22;
    }

    @Nullable
    public final T a(@NotNull XmlPullParser xmlPullParser, @NotNull hj hj3) throws IOException, XmlPullParserException, JSONException {
        this.b.getClass();
        Object object = null;
        xmlPullParser.require(2, null, "CreativeExtension");
        while (true) {
            this.b.getClass();
            if (xmlPullParser.next() == 3) break;
            this.b.getClass();
            if (xmlPullParser.getEventType() != 2) continue;
            object = this.a.a(xmlPullParser, hj3);
        }
        return (T)object;
    }
}

