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
import com.yandex.mobile.ads.impl.rl2;
import com.yandex.mobile.ads.impl.sl2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class ql2<T>
implements rl2<List<? extends T>> {
    @NotNull
    private final rl2<T> a;
    @NotNull
    private final String b;
    @NotNull
    private final String c;
    @NotNull
    private final sl2 d;

    public /* synthetic */ ql2(rl2 rl22, String string2, String string3) {
        this(rl22, string2, string3, new sl2());
    }

    @JvmOverloads
    public ql2(@NotNull rl2<T> rl22, @NotNull String string2, @NotNull String string3, @NotNull sl2 sl22) {
        this.a = rl22;
        this.b = string2;
        this.c = string3;
        this.d = sl22;
    }

    @NotNull
    public final ArrayList b(@NotNull XmlPullParser xmlPullParser, @NotNull hj hj3) throws IOException, XmlPullParserException, JSONException {
        ArrayList<sl2> arrayList = new ArrayList<sl2>();
        Object object = this.d;
        String string2 = this.b;
        object.getClass();
        xmlPullParser.require(2, null, string2);
        while (true) {
            this.d.getClass();
            if (xmlPullParser.next() == 3) break;
            this.d.getClass();
            if (xmlPullParser.getEventType() != 2) continue;
            object = xmlPullParser.getName();
            if (y.e(this.c, object)) {
                object = this.a.a(xmlPullParser, hj3);
                if (object == null) continue;
                arrayList.add((sl2)object);
                continue;
            }
            this.d.getClass();
            sl2.b((XmlPullParser)xmlPullParser);
        }
        return arrayList;
    }
}

