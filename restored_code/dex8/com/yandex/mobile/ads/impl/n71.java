/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ac1
 *  com.yandex.mobile.ads.impl.bv
 *  com.yandex.mobile.ads.impl.ei2
 *  com.yandex.mobile.ads.impl.i41
 *  com.yandex.mobile.ads.impl.i71
 *  com.yandex.mobile.ads.impl.jh2
 *  com.yandex.mobile.ads.impl.lo
 *  com.yandex.mobile.ads.impl.q00
 *  com.yandex.mobile.ads.impl.vf
 *  com.yandex.mobile.ads.impl.wf
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ac1;
import com.yandex.mobile.ads.impl.bv;
import com.yandex.mobile.ads.impl.ea;
import com.yandex.mobile.ads.impl.ei2;
import com.yandex.mobile.ads.impl.i41;
import com.yandex.mobile.ads.impl.i71;
import com.yandex.mobile.ads.impl.jh2;
import com.yandex.mobile.ads.impl.lo;
import com.yandex.mobile.ads.impl.q00;
import com.yandex.mobile.ads.impl.vf;
import com.yandex.mobile.ads.impl.wf;
import java.util.Iterator;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class n71
implements ac1 {
    @NotNull
    private final i41 a;
    @Nullable
    private i71 b;

    public n71(@NotNull i41 i412) {
        this.a = i412;
    }

    public final void a() {
        i71 i712 = this.b;
        if (i712 != null) {
            for (vf vf3 : this.a.c()) {
                wf wf3 = i712.a(vf3);
                if (!(wf3 instanceof q00)) continue;
                ((q00)wf3).b(vf3.d());
            }
        }
    }

    public final void a(@NotNull i71 i712) {
        i712.a();
    }

    public final void a(@NotNull i71 i712, @NotNull lo object) {
        Object object2;
        this.b = i712;
        ea ea3 = new ea(i712, (lo)object, this.a.f(), new ei2());
        Iterator iterator = this.a.c().iterator();
        while (true) {
            boolean bl2 = iterator.hasNext();
            object = null;
            if (!bl2) break;
            vf vf3 = (vf)iterator.next();
            object2 = i712.a(vf3);
            if (object2 instanceof wf) {
                object = object2;
            }
            if (object == null) continue;
            object.c(vf3.d());
            y.h(vf3, "null cannot be cast to non-null type com.monetization.ads.network.model.Asset<kotlin.Any?>");
            object.a(vf3, (jh2)ea3);
        }
        object = i712.h().b();
        if (object != null) {
            object2 = object.iterator();
            while (object2.hasNext()) {
                ((bv)object2.next()).getClass();
                object = i712.c();
                if (!(object instanceof wf)) {
                    object = null;
                }
                if (object == null) continue;
                object.c((Object)k0.a);
            }
        }
    }
}

