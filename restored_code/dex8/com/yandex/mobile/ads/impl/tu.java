/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.yandex.mobile.ads.impl.cf2
 *  com.yandex.mobile.ads.impl.ic2
 *  com.yandex.mobile.ads.impl.id2
 *  com.yandex.mobile.ads.impl.jo0
 *  com.yandex.mobile.ads.impl.mu
 *  com.yandex.mobile.ads.impl.ug2
 *  com.yandex.mobile.ads.impl.vg2
 *  com.yandex.mobile.ads.impl.xg2
 *  com.yandex.mobile.ads.impl.xg2$a
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.cf2;
import com.yandex.mobile.ads.impl.ic2;
import com.yandex.mobile.ads.impl.id2;
import com.yandex.mobile.ads.impl.jo0;
import com.yandex.mobile.ads.impl.lu;
import com.yandex.mobile.ads.impl.mu;
import com.yandex.mobile.ads.impl.qu;
import com.yandex.mobile.ads.impl.ug2;
import com.yandex.mobile.ads.impl.vg2;
import com.yandex.mobile.ads.impl.xg2;
import java.util.List;
import kotlin.r;
import org.jetbrains.annotations.NotNull;

public final class tu
implements xg2 {
    @NotNull
    private final lu a;
    @NotNull
    private final vg2 b;
    @NotNull
    private final cf2 c;
    @NotNull
    private final jo0 d;
    private boolean e;

    public tu(@NotNull lu lu3, @NotNull vg2 vg22, @NotNull cf2 cf22) {
        this.a = lu3;
        this.b = vg22;
        this.c = cf22;
        this.d = new jo0(new mu());
    }

    public final void a() {
        this.b.a((ug2)this.a, "unmute");
    }

    public final void a(float f11) {
    }

    public final void a(float f11, long l10) {
        if (!this.e) {
            this.e = true;
            this.b.a((ug2)this.a, "start");
        }
    }

    public final void a(@NotNull View view, @NotNull List<ic2> list) {
    }

    public final void a(@NotNull id2 id22) {
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(@NotNull xg2.a object) {
        void var1_5;
        int n10 = ((Enum)object).ordinal();
        if (n10 != 0) {
            if (n10 != 1) {
                if (n10 != 2) throw new r();
                String string2 = "thirdQuartile";
            } else {
                String string3 = "midpoint";
            }
        } else {
            String string4 = "firstQuartile";
        }
        this.b.a((ug2)this.a, (String)var1_5);
    }

    public final void a(@NotNull String string2) {
        if (!this.e) {
            this.e = true;
            this.b.a((ug2)this.a, "start");
        }
        string2 = this.d.a(this.a, string2);
        this.c.a(string2.b(), null);
    }

    public final void b() {
        this.b.a((ug2)this.a, "complete");
    }

    public final void c() {
        this.b.a((ug2)this.a, "resume");
    }

    public final void d() {
        this.b.a((ug2)this.a, "pause");
    }

    public final void e() {
        this.b.a((ug2)this.a, "skip");
    }

    public final void f() {
    }

    public final void g() {
    }

    public final void h() {
        this.b.a((ug2)this.a, "creativeView");
    }

    public final void i() {
        qu qu3 = new qu(this.a);
        this.b.a((ug2)qu3, "creativeRenderingStart");
    }

    public final void j() {
    }

    public final void k() {
        this.e = false;
    }

    public final void l() {
        this.b.a((ug2)this.a, "mute");
    }

    public final void m() {
        if (!this.e) {
            this.e = true;
            this.b.a((ug2)this.a, "start");
        }
        this.b.a((ug2)this.a, "clickTracking");
    }

    public final void n() {
    }
}

