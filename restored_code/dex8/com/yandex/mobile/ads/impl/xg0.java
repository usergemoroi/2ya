/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ff0
 *  com.yandex.mobile.ads.impl.gq1
 *  com.yandex.mobile.ads.impl.ho1
 *  com.yandex.mobile.ads.impl.ih0
 *  com.yandex.mobile.ads.impl.m50
 *  com.yandex.mobile.ads.impl.n92
 *  com.yandex.mobile.ads.impl.qm1
 *  com.yandex.mobile.ads.impl.rh0
 *  com.yandex.mobile.ads.impl.sg0
 *  com.yandex.mobile.ads.impl.w50
 *  com.yandex.mobile.ads.impl.xg0$a
 *  com.yandex.mobile.ads.impl.yq1
 *  com.yandex.mobile.ads.impl.yq1$a
 *  com.yandex.mobile.ads.impl.zg0
 *  com.yandex.mobile.ads.impl.zp1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ce1;
import com.yandex.mobile.ads.impl.eo1;
import com.yandex.mobile.ads.impl.ff0;
import com.yandex.mobile.ads.impl.gq1;
import com.yandex.mobile.ads.impl.ho1;
import com.yandex.mobile.ads.impl.ih0;
import com.yandex.mobile.ads.impl.kf0;
import com.yandex.mobile.ads.impl.m50;
import com.yandex.mobile.ads.impl.n92;
import com.yandex.mobile.ads.impl.qm1;
import com.yandex.mobile.ads.impl.rh0;
import com.yandex.mobile.ads.impl.sg0;
import com.yandex.mobile.ads.impl.w50;
import com.yandex.mobile.ads.impl.xg0;
import com.yandex.mobile.ads.impl.yq1;
import com.yandex.mobile.ads.impl.zg0;
import com.yandex.mobile.ads.impl.zp1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.y;
import okio.h;
import okio.j0;
import okio.l0;
import okio.m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Exception performing whole class analysis ignored.
 */
public final class xg0
implements w50 {
    @NotNull
    private static final List<String> g = n92.a((Object[])new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    @NotNull
    private static final List<String> h = n92.a((Object[])new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    @NotNull
    private final eo1 a;
    @NotNull
    private final ho1 b;
    @NotNull
    private final sg0 c;
    @Nullable
    private volatile zg0 d;
    @NotNull
    private final qm1 e;
    private volatile boolean f;

    public xg0(@NotNull ce1 ce12, @NotNull eo1 object, @NotNull ho1 ho12, @NotNull sg0 sg02) {
        this.a = object;
        this.b = ho12;
        this.c = sg02;
        object = ce12.r();
        ce12 = qm1.h;
        if (!object.contains(ce12)) {
            ce12 = qm1.g;
        }
        this.e = ce12;
    }

    public static final /* synthetic */ List d() {
        return h;
    }

    @Nullable
    public final yq1.a a(boolean bl2) {
        zg0 zg02 = this.d;
        y.g(zg02);
        yq1.a a14 = com.yandex.mobile.ads.impl.xg0$a.a((kf0)zg02.s(), (qm1)this.e);
        zg02 = a14;
        if (bl2) {
            zg02 = a14;
            if (a14.b() == 100) {
                zg02 = null;
            }
        }
        return zg02;
    }

    @NotNull
    public final j0 a(@NotNull zp1 zp12, long l10) {
        zp12 = this.d;
        y.g(zp12);
        return zp12.j();
    }

    @NotNull
    public final l0 a(@NotNull yq1 yq12) {
        yq12 = this.d;
        y.g(yq12);
        return yq12.l();
    }

    public final void a() {
        zg0 zg02 = this.d;
        y.g(zg02);
        zg02.j().close();
    }

    public final void a(@NotNull zp1 object) {
        if (this.d != null) {
            return;
        }
        Object object2 = object.a();
        int n10 = 0;
        boolean bl2 = object2 != null;
        kf0 kf02 = object.d();
        object2 = new ArrayList(kf02.size() + 4);
        h h14 = ff0.f;
        String string2 = object.f();
        h.a a14 = okio.h.f;
        ((ArrayList)object2).add(new ff0(h14, a14.d(string2)));
        ((ArrayList)object2).add(new ff0(ff0.g, a14.d(gq1.a((rh0)object.g()))));
        string2 = object.a("Host");
        if (string2 != null) {
            ((ArrayList)object2).add(new ff0(ff0.i, a14.d(string2)));
        }
        ((ArrayList)object2).add(new ff0(ff0.h, a14.d(object.g().k())));
        int n13 = kf02.size();
        while (n10 < n13) {
            string2 = kf02.a(n10).toLowerCase(Locale.US);
            y.i(string2, "toLowerCase(...)");
            if (!g.contains(string2) || y.e(string2, "te") && y.e(kf02.b(n10), "trailers")) {
                object = kf02.b(n10);
                a14 = okio.h.f;
                ((ArrayList)object2).add(new ff0(a14.d(string2), a14.d((String)object)));
            }
            ++n10;
        }
        this.d = this.c.a((ArrayList)object2, bl2);
        if (!this.f) {
            object = this.d;
            y.g(object);
            object2 = object.r();
            long l10 = this.b.e();
            object = TimeUnit.MILLISECONDS;
            ((m0)object2).timeout(l10, (TimeUnit)((Object)object));
            object2 = this.d;
            y.g(object2);
            ((m0)((Object)object2.u())).timeout(this.b.g(), (TimeUnit)((Object)object));
            return;
        }
        object = this.d;
        y.g(object);
        object.a(m50.i);
        throw new IOException("Canceled");
    }

    public final long b(@NotNull yq1 yq12) {
        long l10 = !ih0.a((yq1)yq12) ? 0L : n92.a((yq1)yq12);
        return l10;
    }

    public final void b() {
        this.c.flush();
    }

    @NotNull
    public final eo1 c() {
        return this.a;
    }

    public final void cancel() {
        this.f = true;
        zg0 zg02 = this.d;
        if (zg02 != null) {
            zg02.a(m50.i);
        }
    }
}

