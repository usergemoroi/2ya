/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 *  android.location.LocationManager
 *  com.yandex.mobile.ads.impl.e42
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.ts0
 *  com.yandex.mobile.ads.impl.vs0
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.yandex.mobile.ads.impl.e42;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.ts0;
import com.yandex.mobile.ads.impl.vs0;
import java.util.List;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class yq0
implements ts0 {
    @NotNull
    private final vs0 a;
    @Nullable
    private final LocationManager b;
    @NotNull
    private final e42 c;

    public yq0(@NotNull Context context, @NotNull vs0 object) {
        this.a = object;
        object = context.getApplicationContext().getSystemService("location");
        object = object instanceof LocationManager ? (LocationManager)object : null;
        this.b = object;
        this.c = new e42(context.getApplicationContext(), (LocationManager)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public final Location a() {
        Object object;
        List list;
        block4: {
            block3: {
                list = null;
                try {
                    object = this.b;
                    if (object == null) break block3;
                    object = object.getAllProviders();
                    break block4;
                }
                catch (Throwable throwable) {
                    int n10 = op0.b;
                }
            }
            object = null;
        }
        if (object == null) return list;
        list = t.c();
        object = object.iterator();
        while (object.hasNext()) {
            String string2 = (String)object.next();
            if ((string2 = this.c.a(string2)) == null) continue;
            list.add(string2);
        }
        object = t.a((List)list);
        return this.a.a((List)object);
    }
}

