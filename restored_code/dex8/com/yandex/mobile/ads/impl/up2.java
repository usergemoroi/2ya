/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.yandex.mobile.ads.impl.bp2
 *  com.yandex.mobile.ads.impl.ep2$b
 *  com.yandex.mobile.ads.impl.po2
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.yandex.mobile.ads.impl.bp2;
import com.yandex.mobile.ads.impl.dp2;
import com.yandex.mobile.ads.impl.ep2;
import com.yandex.mobile.ads.impl.oo2;
import com.yandex.mobile.ads.impl.po2;
import com.yandex.mobile.ads.impl.vo2;
import java.util.HashSet;
import org.json.JSONObject;

public final class up2
extends vo2 {
    public up2(ep2.b b10, HashSet<String> hashSet, JSONObject jSONObject, long l10) {
        super(b10, hashSet, jSONObject, l10);
    }

    protected final void a(String string2) {
        Object object;
        if (!TextUtils.isEmpty((CharSequence)string2) && (object = po2.a()) != null) {
            for (oo2 oo22 : object.b()) {
                if (!this.c.contains(oo22.i())) continue;
                oo22.j().a(string2, this.e);
            }
        }
        super.a(string2);
    }

    protected final Object doInBackground(Object[] object) {
        if (bp2.b((JSONObject)this.d, (JSONObject)((dp2)this.b).b())) {
            object = null;
        } else {
            object = this.b;
            JSONObject jSONObject = this.d;
            ((dp2)object).a(jSONObject);
            object = this.d.toString();
        }
        return object;
    }

    protected final /* synthetic */ void onPostExecute(Object object) {
        this.a((String)object);
    }
}

