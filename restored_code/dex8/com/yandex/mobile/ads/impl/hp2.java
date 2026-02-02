/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.yandex.mobile.ads.impl.bp2
 *  com.yandex.mobile.ads.impl.po2
 *  com.yandex.mobile.ads.impl.qo2
 *  com.yandex.mobile.ads.impl.qo2$a
 *  com.yandex.mobile.ads.impl.tp2
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.bp2;
import com.yandex.mobile.ads.impl.lp2;
import com.yandex.mobile.ads.impl.n72;
import com.yandex.mobile.ads.impl.oo2;
import com.yandex.mobile.ads.impl.po2;
import com.yandex.mobile.ads.impl.qo2;
import com.yandex.mobile.ads.impl.tp2;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.json.JSONObject;

public final class hp2
implements qo2 {
    private final qo2 a;

    public hp2(lp2 lp22) {
        this.a = lp22;
    }

    public final JSONObject a(View view) {
        return bp2.a((int)0, (int)0, (int)0, (int)0);
    }

    public final void a(View object, JSONObject jSONObject, qo2.a a13, boolean bl2, boolean bl3) {
        Object object2;
        object = new ArrayList();
        Object object3 = po2.a();
        if (object3 != null) {
            object2 = object3.c();
            object3 = new IdentityHashMap(object2.size() * 2 + 3);
            object2 = object2.iterator();
            while (object2.hasNext()) {
                int n10;
                View view = ((oo2)((Object)object2.next())).f();
                if (view == null || !tp2.b((View)view) || (view = view.getRootView()) == null || ((IdentityHashMap)object3).containsKey(view)) continue;
                ((IdentityHashMap)object3).put(view, view);
                float f11 = tp2.a((View)view);
                for (n10 = ((ArrayList)object).size(); n10 > 0 && tp2.a((View)((View)((ArrayList)object).get(n10 - 1))) > f11; --n10) {
                }
                ((ArrayList)object).add(n10, view);
            }
        }
        object3 = ((ArrayList)object).iterator();
        while (object3.hasNext()) {
            object2 = (View)object3.next();
            object = this.a;
            ((n72)a13).a((View)object2, (qo2)object, jSONObject, bl3);
        }
    }
}

