/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.util.Pair;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.impl.s2;
import io.appmetrica.analytics.impl.t2;
import io.appmetrica.analytics.impl.um;
import io.appmetrica.analytics.impl.vm;
import io.appmetrica.analytics.impl.wm;
import java.util.ArrayList;

public final class u2
implements ProtobufConverter {
    /*
     * WARNING - void declaration
     */
    @NonNull
    public final t2 a(@NonNull wm object2) {
        ArrayList<Pair> arrayList = new ArrayList<Pair>();
        for (vm vm3 : ((wm)object2).a) {
            void var1_7;
            String string2 = vm3.a;
            um um3 = vm3.b;
            if (um3 == null) {
                Object var1_5 = null;
            } else {
                s2 s24 = new s2(um3.a);
            }
            arrayList.add(new Pair((Object)string2, (Object)var1_7));
        }
        return new t2(arrayList);
    }

    @NonNull
    public final wm a(@NonNull t2 t24) {
        wm wm3 = new wm();
        wm3.a = new vm[t24.a.size()];
        for (int i14 = 0; i14 < t24.a.size(); ++i14) {
            vm vm3 = new vm();
            Object object = (Pair)t24.a.get(i14);
            vm3.a = (String)object.first;
            if (object.second != null) {
                vm3.b = new um();
                s2 s24 = (s2)object.second;
                if (s24 == null) {
                    object = null;
                } else {
                    object = new um();
                    object.a = s24.a;
                }
                vm3.b = object;
            }
            wm3.a[i14] = vm3;
        }
        return wm3;
    }
}

