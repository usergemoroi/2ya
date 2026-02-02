/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.r62
 *  com.yandex.mobile.ads.impl.ug2
 *  kotlin.collections.s0
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.lu;
import com.yandex.mobile.ads.impl.r62;
import com.yandex.mobile.ads.impl.ug2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;

public final class qu
implements ug2 {
    final lu a;

    qu(lu lu3) {
        this.a = lu3;
    }

    @NotNull
    public final Map<String, List<String>> a() {
        Object object = this.a.d();
        object = object != null ? object.c() : null;
        Object object2 = object;
        if (object == null) {
            object2 = t.m();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object object3 : object2) {
            String string2 = ((r62)object3).a();
            object2 = linkedHashMap.get(string2);
            object = object2;
            if (object2 == null) {
                object = new ArrayList();
                linkedHashMap.put(string2, object);
            }
            ((List)object).add(object3);
        }
        object = new LinkedHashMap(s0.f((int)linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object object3;
            object2 = entry.getKey();
            object3 = (Iterable)entry.getValue();
            ArrayList<String> arrayList = new ArrayList<String>(t.x(object3, (int)10));
            object3 = object3.iterator();
            while (object3.hasNext()) {
                arrayList.add(((r62)object3.next()).c());
            }
            object.put(object2, arrayList);
        }
        return object;
    }
}

