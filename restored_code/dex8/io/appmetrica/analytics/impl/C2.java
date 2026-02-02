/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.impl.K2;
import io.appmetrica.analytics.impl.M2;
import io.appmetrica.analytics.impl.b2;
import io.appmetrica.analytics.impl.d2;
import io.appmetrica.analytics.impl.e2;
import io.appmetrica.analytics.impl.f2;
import java.util.ArrayList;
import java.util.Iterator;

public final class c2
implements ProtobufConverter {
    public final K2 a;

    public c2() {
        this(new K2());
    }

    public c2(K2 k24) {
        this.a = k24;
    }

    @NonNull
    public final b2 a(@NonNull f2 f22) {
        String[] stringArray;
        Object object;
        int n10;
        ArrayList<PermissionState> arrayList = new ArrayList<PermissionState>();
        int n13 = 0;
        for (n10 = 0; n10 < ((e2[])(object = f22.a)).length; ++n10) {
            object = object[n10];
            arrayList.add(new PermissionState(object.a, object.b));
        }
        object = f22.b;
        object = object != null ? this.a.a((d2)object) : null;
        ArrayList<String> arrayList2 = new ArrayList<String>();
        for (n10 = n13; n10 < (stringArray = f22.c).length; ++n10) {
            arrayList2.add(stringArray[n10]);
        }
        return new b2(arrayList, (M2)object, arrayList2);
    }

    @NonNull
    public final f2 a(@NonNull b2 object) {
        Object object2;
        f2 f22 = new f2();
        f22.a = new e2[((b2)object).a.size()];
        Iterator iterator = ((b2)object).a.iterator();
        int n10 = 0;
        int n13 = 0;
        while (iterator.hasNext()) {
            PermissionState permissionState = (PermissionState)iterator.next();
            object2 = f22.a;
            e2 e22 = new e2();
            e22.a = permissionState.name;
            e22.b = permissionState.granted;
            object2[n13] = e22;
            ++n13;
        }
        object2 = ((b2)object).b;
        if (object2 != null) {
            f22.b = this.a.a((M2)object2);
        }
        f22.c = new String[((b2)object).c.size()];
        object = ((b2)object).c.iterator();
        n13 = n10;
        while (object.hasNext()) {
            f22.c[n13] = object2 = (String)object.next();
            ++n13;
        }
        return f22;
    }
}

