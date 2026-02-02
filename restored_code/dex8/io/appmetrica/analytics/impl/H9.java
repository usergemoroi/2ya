/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.s0
 *  kotlin.collections.t
 *  kotlin.ranges.j
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.impl.i9;
import io.appmetrica.analytics.impl.j9;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.ranges.j;
import kotlin.t;
import kotlin.z;
import org.jetbrains.annotations.NotNull;

public final class h9
implements Converter {
    @NotNull
    public final Map<String, byte[]> a(@NotNull byte[] object) {
        i9[] i9Array = MessageNano.mergeFrom(new j9(), (byte[])object).a;
        object = new LinkedHashMap(j.e((int)s0.f((int)i9Array.length), (int)16));
        for (i9 i94 : i9Array) {
            t<String, byte[]> object2 = z.a(i94.a, i94.b);
            object.put(object2.c(), object2.d());
        }
        return object;
    }

    @NotNull
    public final byte[] a(@NotNull Map<String, byte[]> object) {
        j9 j94 = new j9();
        i9[] i9Array = new i9[object.size()];
        object = object.entrySet().iterator();
        int n10 = 0;
        while (object.hasNext()) {
            Object object2 = object.next();
            if (n10 < 0) {
                kotlin.collections.t.w();
            }
            Map.Entry entry = (Map.Entry)object2;
            object2 = new i9();
            ((i9)object2).a = (String)entry.getKey();
            ((i9)object2).b = (byte[])entry.getValue();
            i9Array[n10] = object2;
            ++n10;
        }
        j94.a = i9Array;
        return MessageNano.toByteArray(j94);
    }
}

