/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.mobile.ads.impl.a91
 *  com.yandex.mobile.ads.impl.b81
 *  com.yandex.mobile.ads.impl.gy1
 *  com.yandex.mobile.ads.impl.ou1
 *  com.yandex.mobile.ads.impl.pw1
 *  com.yandex.mobile.ads.impl.u92
 *  com.yandex.mobile.ads.impl.u92$a
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.a91;
import com.yandex.mobile.ads.impl.b81;
import com.yandex.mobile.ads.impl.gy1;
import com.yandex.mobile.ads.impl.k81;
import com.yandex.mobile.ads.impl.ma;
import com.yandex.mobile.ads.impl.ou1;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.u92;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

public final class na
extends ma {
    @NotNull
    private final k81 f;
    @NotNull
    private final pw1 g;

    private na(Context context, k81 k812, b81 b812, Set<? extends String> set, pw1 pw12) {
        super(context, b812, set);
        this.f = k812;
        this.g = pw12;
    }

    public /* synthetic */ na(Context context, k81 k812, b81 b812, Set set, pw1 pw12, int n10) {
        this(context, k812, b812, set, pw12);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @VisibleForTesting
    @NotNull
    public final u92 a(@NotNull Context context, int n10, boolean bl2, boolean bl3) {
        Object object;
        ou1 ou12 = this.g.a(context);
        ou12 = ou12 != null && !ou12.n0() ? new u92(u92.a.c, null, null, 6) : super.a(context, n10, bl2, bl3);
        Object object2 = ou12;
        if (ou12.c() != u92.a.c) return object2;
        Iterator iterator = this.f.f();
        object2 = new ArrayList();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            if (!(object instanceof a91)) continue;
            ((ArrayList)object2).add(object);
        }
        if (!((ArrayList)object2).isEmpty()) {
            iterator = ((ArrayList)object2).iterator();
            while (iterator.hasNext()) {
                int n13;
                object2 = (a91)iterator.next();
                object = object2.g();
                Object object3 = object2.h();
                object2 = this.g.a(context);
                boolean bl4 = object2 == null || object2.n0();
                object3 = object3.e().iterator();
                do {
                    object2 = ou12;
                    if (!object3.hasNext()) return object2;
                    object2 = (gy1)object3.next();
                    n13 = bl4 ? object2.d() : n10;
                } while ((object2 = bl3 ? object.b(context, n13) : object.a(context, n13)).c() == u92.a.c);
            }
        }
        context = u92.a.c;
        return u92.a((u92)ou12);
    }
}

