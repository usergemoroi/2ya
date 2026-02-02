/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.U9;
import io.appmetrica.analytics.impl.m9;
import java.util.Iterator;

public final class n9
implements ProtobufConverter {
    public static U9 a(m9 m94) {
        U9 u94 = new U9();
        u94.d = new int[m94.b.size()];
        Iterator iterator = m94.b.iterator();
        int n10 = 0;
        while (iterator.hasNext()) {
            Integer n13 = (Integer)iterator.next();
            u94.d[n10] = n13;
            ++n10;
        }
        u94.c = m94.d;
        u94.b = m94.c;
        u94.a = m94.a;
        return u94;
    }

    @Override
    public final Object toModel(Object object) {
        object = (U9)object;
        return new m9(((U9)object).a, ((U9)object).b, ((U9)object).c, CollectionUtils.hashSetFromIntArray(((U9)object).d));
    }
}

