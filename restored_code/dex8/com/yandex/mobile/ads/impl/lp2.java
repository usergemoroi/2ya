/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  com.yandex.mobile.ads.impl.bp2
 *  com.yandex.mobile.ads.impl.qo2
 *  com.yandex.mobile.ads.impl.qo2$a
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.bp2;
import com.yandex.mobile.ads.impl.n72;
import com.yandex.mobile.ads.impl.qo2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

public final class lp2
implements qo2 {
    private final int[] a = new int[2];

    public final JSONObject a(View object) {
        if (object == null) {
            return bp2.a((int)0, (int)0, (int)0, (int)0);
        }
        int n10 = object.getWidth();
        int n13 = object.getHeight();
        object.getLocationOnScreen(this.a);
        object = this.a;
        return bp2.a((int)object[0], (int)object[1], (int)n10, (int)n13);
    }

    public final void a(View object, JSONObject jSONObject, qo2.a a13, boolean bl2, boolean bl3) {
        int n10;
        if (!(object instanceof ViewGroup)) {
            return;
        }
        Object object2 = (ViewGroup)object;
        int n13 = 0;
        if (bl2) {
            HashMap<Float, Object> hashMap = new HashMap<Float, Object>();
            for (n10 = n13; n10 < object2.getChildCount(); ++n10) {
                View view = object2.getChildAt(n10);
                ArrayList arrayList = (ArrayList)hashMap.get(Float.valueOf(view.getZ()));
                object = arrayList;
                if (arrayList == null) {
                    object = new ArrayList();
                    hashMap.put(Float.valueOf(view.getZ()), object);
                }
                ((ArrayList)object).add(view);
            }
            object = new ArrayList(hashMap.keySet());
            Collections.sort(object);
            object2 = ((ArrayList)object).iterator();
            while (object2.hasNext()) {
                for (ArrayList arrayList : (ArrayList)hashMap.get((Float)object2.next())) {
                    ((n72)a13).a((View)arrayList, this, jSONObject, bl3);
                }
            }
        } else {
            for (n10 = 0; n10 < object2.getChildCount(); ++n10) {
                object = object2.getChildAt(n10);
                ((n72)a13).a((View)object, this, jSONObject, bl3);
            }
        }
    }
}

