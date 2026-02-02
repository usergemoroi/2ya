/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

public class dd {
    public final Map a;
    public final Object b;

    public dd(Object object) {
        this(new HashMap(), object);
    }

    public dd(HashMap hashMap, Object object) {
        this.a = hashMap;
        this.b = object;
    }

    public final Object a(Object object) {
        Object v14 = this.a.get(object);
        object = v14;
        if (v14 == null) {
            object = this.b;
        }
        return object;
    }

    public final void a(Object object, Object object2) {
        this.a.put(object, object2);
    }
}

