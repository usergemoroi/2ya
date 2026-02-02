/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.nb
 *  com.yandex.mobile.ads.impl.ng0
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.sb
 *  com.yandex.mobile.ads.impl.wb
 *  com.yandex.mobile.ads.impl.xb
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.nb;
import com.yandex.mobile.ads.impl.ng0;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.sb;
import com.yandex.mobile.ads.impl.wb;
import com.yandex.mobile.ads.impl.xb;
import com.yandex.mobile.ads.impl.yb;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class vb
implements ng0 {
    @NotNull
    private final nb a;
    @NotNull
    private final List<sb> b;
    @Nullable
    private xb c;
    @Nullable
    private String d;

    public vb(@NotNull nb nb3) {
        this.a = nb3;
        this.b = this.a();
    }

    private final List<sb> a() {
        return t.p((Object[])new yb[]{new yb("adtuneRendered", (Runnable)new /* Unavailable Anonymous Inner Class!! */), new yb("adtuneClosed", (Runnable)new /* Unavailable Anonymous Inner Class!! */), new yb("openOptOut", (Runnable)new /* Unavailable Anonymous Inner Class!! */)});
    }

    public static final void a(vb vb2) {
        vb2 = vb2.c;
        if (vb2 != null) {
            vb2.b();
        }
    }

    public static final /* synthetic */ xb b(vb vb2) {
        return vb2.c;
    }

    public static final /* synthetic */ nb c(vb vb2) {
        return vb2.a;
    }

    public static final /* synthetic */ String d(vb vb2) {
        return vb2.d;
    }

    public final void a(int n10) {
        xb xb3;
        if (new wb().a(n10) && (xb3 = this.c) != null) {
            xb3.b();
        }
    }

    public final void a(@NotNull xb xb3) {
        this.c = xb3;
    }

    public final void a(@NotNull String string2) {
        block4: {
            Object object = new URI(string2);
            String string3 = ((URI)object).getScheme();
            object = ((URI)object).getHost();
            for (sb sb3 : this.b) {
                if (!sb3.a(string3, (String)object)) continue;
                sb3.a();
                return;
            }
            string3 = this.c;
            if (string3 == null) break block4;
            try {
                string3.a(string2);
            }
            catch (URISyntaxException uRISyntaxException) {
                int n10 = op0.b;
                xb xb3 = this.c;
                if (xb3 == null) break block4;
                xb3.b();
            }
        }
    }

    public final void b(@Nullable String string2) {
        this.d = string2;
    }
}

