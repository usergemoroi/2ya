/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.hy1
 *  com.yandex.mobile.ads.impl.ld1
 *  com.yandex.mobile.ads.impl.rd1
 *  com.yandex.mobile.ads.impl.u92
 *  kotlin.collections.s0
 *  kotlin.collections.t
 *  kotlin.jvm.functions.l
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.hy1;
import com.yandex.mobile.ads.impl.ld1;
import com.yandex.mobile.ads.impl.rd1;
import com.yandex.mobile.ads.impl.u92;
import com.yandex.mobile.ads.impl.y62;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.s0;
import kotlin.jvm.functions.l;
import kotlin.t;
import kotlin.z;
import org.jetbrains.annotations.NotNull;

public final class zy1
implements ld1 {
    @NotNull
    private static final List<hy1> c = kotlin.collections.t.p((Object[])new hy1[]{hy1.b, hy1.c});
    @NotNull
    private final Map<hy1, ld1> a;
    private boolean b;

    public zy1(@NotNull y62 y622, @NotNull y62 y623) {
        this.a = s0.m((t[])new t[]{z.a(hy1.b, y622), z.a(hy1.c, y623)});
    }

    public final void a(@NotNull b8<?> b82) {
        Iterator iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            ((ld1)iterator.next()).a(b82);
        }
    }

    public final void a(@NotNull hy1 hy12) {
        ld1 ld12 = this.a.get(hy12);
        if (ld12 != null) {
            ld12.a(hy12);
        }
    }

    public final void a(@NotNull hy1 hy12, @NotNull u92 u922) {
        ld1 ld12 = this.a.get(hy12);
        if (ld12 != null) {
            ld12.a(hy12, u922);
        }
    }

    public final void a(@NotNull hy1 hy12, @NotNull List<? extends hy1> list) {
        Object object;
        if (!this.b) {
            this.b = true;
            object = kotlin.collections.t.N0(list, (Object)hy12);
            Set set = kotlin.collections.t.j1((Iterable)object);
            for (hy1 hy13 : kotlin.collections.t.J0(c, (Iterable)set)) {
                this.a(hy13);
                this.a(hy13, (List<? extends hy1>)object);
            }
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            object = list.iterator();
            while (object.hasNext()) {
                if ((hy1)object.next() != hy12) continue;
                break;
            }
        } else {
            object = this.a.get(hy12);
            if (object != null) {
                object.a(hy12, list);
            }
        }
    }

    public final void a(@NotNull List<rd1> arrayList) {
        hy1 hy12 = new LinkedHashMap();
        for (Object t13 : arrayList) {
            hy1 hy13 = ((rd1)t13).a().c();
            Object object = hy12.get(hy13);
            arrayList = object;
            if (object == null) {
                arrayList = new ArrayList();
                hy12.put(hy13, arrayList);
            }
            ((List)arrayList).add(t13);
        }
        for (Map.Entry entry : s0.b(hy12, (l)com.yandex.mobile.ads.impl.zy1$a.b).entrySet()) {
            hy12 = (hy1)entry.getKey();
            List list = (List)entry.getValue();
            if ((hy12 = this.a.get(hy12)) == null) continue;
            hy12.a(list);
        }
    }

    public final void invalidate() {
        Iterator iterator = this.a.values().iterator();
        while (iterator.hasNext()) {
            ((ld1)iterator.next()).invalidate();
        }
    }
}

