/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  com.yandex.mobile.ads.impl.g2
 *  com.yandex.mobile.ads.impl.gs
 *  com.yandex.mobile.ads.impl.lt0
 *  com.yandex.mobile.ads.instream.newapi.adbreak.InstreamAdBreak
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.yandex.mobile.ads.impl.g2;
import com.yandex.mobile.ads.impl.gs;
import com.yandex.mobile.ads.impl.ie0;
import com.yandex.mobile.ads.impl.jl0;
import com.yandex.mobile.ads.impl.lt0;
import com.yandex.mobile.ads.impl.mt0;
import com.yandex.mobile.ads.impl.sn0;
import com.yandex.mobile.ads.impl.w1;
import com.yandex.mobile.ads.impl.wl2;
import com.yandex.mobile.ads.instream.newapi.adbreak.InstreamAdBreak;
import java.util.List;
import kotlin.collections.t;
import kotlin.r;
import org.jetbrains.annotations.NotNull;

public final class ml0
implements lt0<InstreamAdBreak> {
    @NotNull
    private final g2 a;

    public /* synthetic */ ml0() {
        this(new g2());
    }

    public ml0(@NotNull g2 g22) {
        this.a = g22;
    }

    @NotNull
    public final jl0 b(@NotNull mt0 object) {
        block4: {
            sn0 sn02;
            block3: {
                Object object2;
                block2: {
                    sn02 = new sn0((mt0)object);
                    object2 = this.a;
                    object = ((mt0)object).a().a();
                    object2.getClass();
                    object = ((w1)object).b().a().a();
                    if (!(object instanceof ie0.a)) break block2;
                    object = (ie0.a)object;
                    object = new gs(((ie0.a)object).b(), ((ie0.a)object).a(), null);
                    break block3;
                }
                if (!(object instanceof ie0.b)) break block4;
                String string2 = ((ie0.b)object).a();
                object = Uri.parse((String)string2);
                object2 = object.getPathSegments();
                object = new gs((String)t.u0((List)object2, (int)(object2.indexOf("get_vast") + 1)), object.getQueryParameter("imp-id"), string2);
            }
            return new jl0(sn02, new wl2((gs)object));
        }
        throw new r();
    }
}

