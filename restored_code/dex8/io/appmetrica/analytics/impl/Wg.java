/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.WorkerThread
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.impl.Ag;
import io.appmetrica.analytics.impl.Jg;
import io.appmetrica.analytics.impl.sg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.t;

public final class wg
implements sg {
    public final Ag a;

    public wg(Ag ag2) {
        this.a = ag2;
    }

    @Override
    @WorkerThread
    public final void a() {
        Ag ag2 = this.a;
        Object object = ag2.g;
        ArrayList arrayList = new ArrayList();
        Iterator iterator = ((ArrayList)object).iterator();
        while (iterator.hasNext()) {
            Object e11 = iterator.next();
            object = (Jg)e11;
            ag2.c.getClass();
            object = object != null ? ((Jg)object).a : null;
            boolean bl2 = object == null || ((String)object).length() == 0;
            if (!(bl2 ^ true)) continue;
            arrayList.add(e11);
        }
        object = t.o0(arrayList);
        ag2.a(ag2.c.a((List)object));
    }
}

