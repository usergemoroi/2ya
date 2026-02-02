/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.de1
 *  com.yandex.mobile.ads.impl.ef0
 *  com.yandex.mobile.ads.impl.he1
 *  com.yandex.mobile.ads.impl.mh0
 *  com.yandex.mobile.ads.impl.xj
 *  com.yandex.mobile.ads.impl.yp1
 *  com.yandex.mobile.ads.impl.zp1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ce1;
import com.yandex.mobile.ads.impl.de1;
import com.yandex.mobile.ads.impl.do1;
import com.yandex.mobile.ads.impl.ef0;
import com.yandex.mobile.ads.impl.he1;
import com.yandex.mobile.ads.impl.mh0;
import com.yandex.mobile.ads.impl.ph;
import com.yandex.mobile.ads.impl.xj;
import com.yandex.mobile.ads.impl.yp1;
import com.yandex.mobile.ads.impl.zp1;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class wh0
extends xj {
    @Nullable
    private final SSLSocketFactory a;
    @NotNull
    private final he1 b;

    public wh0(@Nullable SSLSocketFactory sSLSocketFactory) {
        this.a = sSLSocketFactory;
        this.b = new he1();
    }

    @NotNull
    public final mh0 a(@NotNull yp1<?> object, @NotNull Map<String, String> object2) throws IOException, ph {
        int n10 = object.j();
        int n13 = de1.c;
        ce1 ce12 = de1.a((int)n10, (int)n10, (SSLSocketFactory)this.a);
        object2 = this.b.a((yp1)object, (Map)object2);
        n13 = 0;
        ce12 = new do1(ce12, (zp1)object2, false).b();
        n10 = ce12.c();
        Object object3 = ce12.f().c();
        object2 = new ArrayList();
        for (Map.Entry entry : ((TreeMap)object3).entrySet()) {
            String string2 = (String)entry.getKey();
            Iterator object4 = ((List)entry.getValue()).iterator();
            while (object4.hasNext()) {
                ((ArrayList)object2).add(new ef0(string2, (String)object4.next()));
            }
        }
        int n14 = object.f();
        object = null;
        if (n14 != 4 && (100 > n10 || n10 >= 200) && n10 != 204 && n10 != 304) {
            object3 = ce12.a();
            if (object3 != null) {
                n13 = (int)object3.a();
            }
            if ((ce12 = ce12.a()) != null) {
                object = ce12.c().inputStream();
            }
            return new mh0(n10, (ArrayList)object2, n13, (InputStream)object);
        }
        return new mh0(n10, (ArrayList)object2, -1, null);
    }
}

