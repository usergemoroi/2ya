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

import com.yandex.mobile.ads.impl.r62;
import com.yandex.mobile.ads.impl.ug2;
import com.yandex.mobile.ads.impl.xb2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;

public final class hc2
implements ug2 {
    final xb2 a;

    hc2(xb2 xb22) {
        this.a = xb22;
    }

    @NotNull
    public final Map<String, List<String>> a() {
        Iterator iterator;
        ArrayList arrayList = this.a.l().b();
        LinkedHashMap<String, ArrayList<Object>> linkedHashMap = new LinkedHashMap();
        for (Object t13 : arrayList) {
            iterator = ((r62)t13).a();
            Object v14 = linkedHashMap.get(iterator);
            arrayList = v14;
            if (v14 == null) {
                arrayList = new ArrayList();
                linkedHashMap.put((String)((Object)iterator), arrayList);
            }
            ((List)arrayList).add(t13);
        }
        arrayList = new LinkedHashMap(s0.f((int)linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap = entry.getKey();
            iterator = (Iterable)entry.getValue();
            ArrayList<String> arrayList2 = new ArrayList<String>(t.x((Iterable)((Object)iterator), (int)10));
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                arrayList2.add(((r62)iterator.next()).c());
            }
            arrayList.put(linkedHashMap, arrayList2);
        }
        return arrayList;
    }
}

