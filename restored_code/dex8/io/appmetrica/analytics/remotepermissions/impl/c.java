/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.b1
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.remotepermissions.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.remotepermissions.impl.a;
import io.appmetrica.analytics.remotepermissions.impl.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.b1;
import kotlin.collections.t;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

public final class c
implements ProtobufConverter {
    @NotNull
    public final a a(@NotNull f collection) {
        block4: {
            block3: {
                collection = (Collection<String>)((f)((Object)collection)).a;
                if (collection == null) break block3;
                Collection<String> collection2 = new ArrayList<String>(((Object)collection).length);
                int n10 = ((Object)collection).length;
                for (int i14 = 0; i14 < n10; ++i14) {
                    collection2.add(new String((byte[])collection[i14], d.b));
                }
                collection = collection2 = t.j1(collection2);
                if (collection2 != null) break block4;
            }
            collection = b1.f();
        }
        return new a((Set)collection);
    }

    @NotNull
    public final f a(@NotNull a TArray) {
        f f11 = new f();
        Object object = TArray.a;
        TArray = new ArrayList(t.x((Iterable)object, (int)10));
        object = object.iterator();
        while (object.hasNext()) {
            TArray.add(((String)object.next()).getBytes(d.b));
        }
        if ((TArray = TArray.toArray((T[])new byte[0][])) != null) {
            f11.a = (byte[][])TArray;
            return f11;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}

