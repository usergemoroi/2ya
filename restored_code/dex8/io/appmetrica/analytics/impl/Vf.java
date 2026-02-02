/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Kf;
import io.appmetrica.analytics.impl.ho;
import io.appmetrica.analytics.impl.q8;
import io.appmetrica.analytics.impl.wf;
import io.appmetrica.analytics.impl.xf;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class vf
implements ho {
    public final boolean a;

    public vf(@NotNull xf iterator) {
        boolean bl2;
        iterator = ((xf)((Object)iterator)).b;
        if (!(iterator instanceof Collection) || !iterator.isEmpty()) {
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                if (((wf)iterator.next()).c != q8.c) continue;
                bl2 = false;
                break;
            }
        } else {
            bl2 = true;
        }
        this.a = bl2;
    }

    @Nullable
    public final List<wf> a(@NotNull List<? extends wf> list, @NotNull Kf kf3) {
        wf wf3 = new wf(kf3.a, kf3.b, kf3.e);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                if (((wf)iterator.next()).c != kf3.e) continue;
                list = wf3.c == q8.c && this.a ? t.N0((Collection)list, (Object)wf3) : null;
                break;
            }
        } else {
            list = t.N0(list, (Object)wf3);
        }
        return list;
    }
}

