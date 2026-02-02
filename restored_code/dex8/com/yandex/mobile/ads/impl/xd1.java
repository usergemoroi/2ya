/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.b32
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.fg1
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.qj1
 *  com.yandex.mobile.ads.impl.rj2
 *  com.yandex.mobile.ads.impl.t70
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.zd1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.b32;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.fg1;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.hf1;
import com.yandex.mobile.ads.impl.ja3;
import com.yandex.mobile.ads.impl.oz;
import com.yandex.mobile.ads.impl.qj1;
import com.yandex.mobile.ads.impl.qj2;
import com.yandex.mobile.ads.impl.rb0;
import com.yandex.mobile.ads.impl.rj2;
import com.yandex.mobile.ads.impl.t70;
import com.yandex.mobile.ads.impl.u70;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.zd1;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

public final class xd1
implements t70 {
    private v70 a;
    private b32 b;
    private boolean c;

    static {
        new ja3();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @EnsuresNonNullIf(expression={"streamReader"}, result=true)
    private boolean a(oz oz3) throws IOException {
        zd1 zd12 = new zd1();
        if (!zd12.a(oz3, true)) return false;
        if ((zd12.a & 2) != 2) {
            return false;
        }
        int n10 = Math.min(zd12.e, 8);
        zd12 = new bg1(n10);
        oz3.b(zd12.c(), 0, n10, false);
        zd12.e(0);
        if (zd12.a() >= 5 && zd12.t() == 127 && zd12.v() == 1179402563L) {
            this.b = new rb0();
            return true;
        }
        zd12.e(0);
        try {
            boolean bl2 = rj2.a((int)1, (bg1)zd12, (boolean)true);
            if (bl2) {
                this.b = new qj2();
                return true;
            }
        }
        catch (fg1 fg12) {}
        zd12.e(0);
        if (!hf1.b((bg1)zd12)) return false;
        this.b = new hf1();
        return true;
    }

    private static /* synthetic */ t70[] a() {
        return new t70[]{new xd1()};
    }

    public static /* synthetic */ t70[] b() {
        return xd1.a();
    }

    public final int a(u70 u702, qj1 qj12) throws IOException {
        if (this.a != null) {
            oz oz3;
            if (this.b == null) {
                oz3 = (oz)u702;
                if (this.a(oz3)) {
                    oz3.c();
                } else {
                    throw fg1.a((String)"Failed to determine bitstream type", null);
                }
            }
            if (!this.c) {
                oz3 = this.a.a(0, 1);
                this.a.a();
                this.b.a(this.a, (g62)oz3);
                this.c = true;
            }
            return this.b.a((oz)u702, qj12);
        }
        throw new IllegalStateException();
    }

    public final void a(long l10, long l11) {
        b32 b322 = this.b;
        if (b322 != null) {
            b322.a(l10, l11);
        }
    }

    public final void a(v70 v702) {
        this.a = v702;
    }

    public final boolean a(u70 u702) throws IOException {
        try {
            boolean bl2 = this.a((oz)u702);
            return bl2;
        }
        catch (fg1 fg12) {
            return false;
        }
    }

    public final void release() {
    }
}

