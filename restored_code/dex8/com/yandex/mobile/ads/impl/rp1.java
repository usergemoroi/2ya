/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ed2
 *  com.yandex.mobile.ads.impl.hd2
 *  com.yandex.mobile.ads.impl.id2
 *  com.yandex.mobile.ads.impl.jd2
 *  com.yandex.mobile.ads.impl.kc2
 *  com.yandex.mobile.ads.impl.rd2
 *  com.yandex.mobile.ads.impl.yc2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ed2;
import com.yandex.mobile.ads.impl.hd2;
import com.yandex.mobile.ads.impl.id2;
import com.yandex.mobile.ads.impl.jb1;
import com.yandex.mobile.ads.impl.jd2;
import com.yandex.mobile.ads.impl.kc2;
import com.yandex.mobile.ads.impl.od2;
import com.yandex.mobile.ads.impl.rd2;
import com.yandex.mobile.ads.impl.sa1;
import com.yandex.mobile.ads.impl.ua1;
import com.yandex.mobile.ads.impl.yc2;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class rp1
implements yc2 {
    @NotNull
    private final sa1 a;
    @NotNull
    private final kc2<jb1> b;
    @NotNull
    private final rd2 c;
    @NotNull
    private final a d;
    @Nullable
    private ed2 e;

    public /* synthetic */ rp1(sa1 sa12, kc2 kc22, od2 od22) {
        this(sa12, kc22, new rd2((hd2)new ua1(sa12), od22));
    }

    @JvmOverloads
    public rp1(@NotNull sa1 sa12, @NotNull kc2 kc22, @NotNull rd2 rd22) {
        this.a = sa12;
        this.b = kc22;
        this.c = rd22;
        this.d = new a(this);
    }

    public final void a(@Nullable ed2 ed22) {
        this.e = ed22;
    }

    public final void play() {
        this.a.a(this.d);
        this.a.a((jb1)this.b.e(), (jb1)this.b.c());
    }

    public final void stop() {
        this.c.b();
        this.a.pauseAd();
        this.a.a();
    }

    private final class a
    implements jd2 {
        final rp1 a;

        public a(rp1 rp12) {
            this.a = rp12;
        }

        public final void a() {
        }

        public final void a(@NotNull id2 id22) {
            this.a.c.b();
            this.a.a.a((jd2)null);
            this.a.a.e();
        }

        public final void b() {
        }

        public final void c() {
            this.a.c.a();
            ed2 ed22 = this.a.e;
            if (ed22 != null) {
                ed22.c();
            }
        }

        public final void d() {
            this.a.c.b();
            this.a.a.a((jd2)null);
            ed2 ed22 = this.a.e;
            if (ed22 != null) {
                ed22.a();
            }
        }

        public final void e() {
            this.a.c.b();
            this.a.a.a((jd2)null);
        }

        public final void f() {
        }

        public final void g() {
            this.a.c.b();
            this.a.a.a((jd2)null);
        }

        public final void h() {
            this.a.a.c();
        }

        public final void i() {
        }

        public final void onVolumeChanged(float f11) {
        }
    }
}

