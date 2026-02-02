/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.id1
 *  com.yandex.mobile.ads.impl.oz0$a
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.id1;
import com.yandex.mobile.ads.impl.oz0;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

public final class uv2
implements oz0.a {
    public final id1 a;
    public final CountDownLatch b;
    public final ArrayList c;

    public /* synthetic */ uv2(id1 id12, CountDownLatch countDownLatch, ArrayList arrayList) {
        this.a = id12;
        this.b = countDownLatch;
        this.c = arrayList;
    }

    public final void a(JSONObject jSONObject) {
        id1.b((id1)this.a, (CountDownLatch)this.b, (ArrayList)this.c, (JSONObject)jSONObject);
    }
}

