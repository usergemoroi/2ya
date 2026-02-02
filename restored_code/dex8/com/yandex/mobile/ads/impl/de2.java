/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.yandex.mobile.ads.impl.ic2
 *  com.yandex.mobile.ads.impl.id2
 *  com.yandex.mobile.ads.impl.ug2
 *  com.yandex.mobile.ads.impl.vg2
 *  com.yandex.mobile.ads.impl.xg2
 *  com.yandex.mobile.ads.impl.xg2$a
 *  kotlin.collections.s0
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.hc2;
import com.yandex.mobile.ads.impl.ic2;
import com.yandex.mobile.ads.impl.id2;
import com.yandex.mobile.ads.impl.ug2;
import com.yandex.mobile.ads.impl.vg2;
import com.yandex.mobile.ads.impl.xb2;
import com.yandex.mobile.ads.impl.xg2;
import java.util.List;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.r;
import kotlin.z;
import org.jetbrains.annotations.NotNull;

public final class de2
implements xg2 {
    @NotNull
    private final xb2 a;
    @NotNull
    private final vg2 b;

    public de2(@NotNull xb2 xb22, @NotNull vg2 vg22) {
        this.a = xb22;
        this.b = vg22;
    }

    public final void a() {
    }

    public final void a(float f10) {
    }

    public final void a(float f10, long l10) {
    }

    public final void a(@NotNull View view, @NotNull List<ic2> list) {
    }

    public final void a(@NotNull id2 object) {
        int n10;
        switch (object.a().ordinal()) {
            default: {
                throw new r();
            }
            case 30: {
                n10 = 902;
                break;
            }
            case 29: {
                n10 = 901;
                break;
            }
            case 23: {
                n10 = 403;
                break;
            }
            case 19: {
                n10 = 401;
                break;
            }
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 20: 
            case 21: 
            case 22: 
            case 24: 
            case 27: {
                n10 = 400;
                break;
            }
            case 8: 
            case 12: 
            case 28: {
                n10 = 900;
                break;
            }
            case 7: {
                n10 = 402;
                break;
            }
            case 0: 
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 9: 
            case 10: 
            case 11: 
            case 25: 
            case 26: {
                n10 = 405;
            }
        }
        object = s0.g(z.a("[ERRORCODE]", String.valueOf(n10)));
        this.b.a((ug2)this.a, "error", (Map)object);
    }

    public final void a(@NotNull xg2.a a12) {
    }

    public final void a(@NotNull String string2) {
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void e() {
    }

    public final void f() {
    }

    public final void g() {
    }

    public final void h() {
        this.b.a((ug2)this.a, "render_impression");
    }

    public final void i() {
        hc2 hc22 = new hc2(this.a);
        this.b.a((ug2)hc22, "renderingStart");
    }

    public final void j() {
    }

    public final void k() {
    }

    public final void l() {
    }

    public final void m() {
    }

    public final void n() {
        this.b.a((ug2)this.a, "impression");
    }
}

