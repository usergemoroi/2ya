/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ep2$b
 *  com.yandex.mobile.ads.impl.po2
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ep2;
import com.yandex.mobile.ads.impl.oo2;
import com.yandex.mobile.ads.impl.po2;
import com.yandex.mobile.ads.impl.vo2;
import java.util.HashSet;
import org.json.JSONObject;

public final class rp2
extends vo2 {
    public rp2(ep2.b b10, HashSet<String> hashSet, JSONObject jSONObject, long l10) {
        super(b10, hashSet, jSONObject, l10);
    }

    protected final void a(String string2) {
        po2 po22 = po2.a();
        if (po22 != null) {
            for (oo2 oo22 : po22.b()) {
                if (!this.c.contains(oo22.i())) continue;
                oo22.j().b(string2, this.e);
            }
        }
        super.a(string2);
    }

    protected final Object doInBackground(Object[] objectArray) {
        return this.d.toString();
    }

    protected final /* synthetic */ void onPostExecute(Object object) {
        this.a((String)object);
    }
}

