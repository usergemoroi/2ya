/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.ad2
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.bd2
 *  com.yandex.mobile.ads.impl.be2
 *  com.yandex.mobile.ads.impl.ca2
 *  com.yandex.mobile.ads.impl.dh2
 *  com.yandex.mobile.ads.impl.ed2
 *  com.yandex.mobile.ads.impl.ff2
 *  com.yandex.mobile.ads.impl.fg2
 *  com.yandex.mobile.ads.impl.hd2
 *  com.yandex.mobile.ads.impl.id2
 *  com.yandex.mobile.ads.impl.kc2
 *  com.yandex.mobile.ads.impl.wd2$b
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.yc2
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ad2;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.bd2;
import com.yandex.mobile.ads.impl.be2;
import com.yandex.mobile.ads.impl.ca2;
import com.yandex.mobile.ads.impl.dh2;
import com.yandex.mobile.ads.impl.ed2;
import com.yandex.mobile.ads.impl.fd2;
import com.yandex.mobile.ads.impl.ff2;
import com.yandex.mobile.ads.impl.fg2;
import com.yandex.mobile.ads.impl.hd2;
import com.yandex.mobile.ads.impl.id2;
import com.yandex.mobile.ads.impl.jb1;
import com.yandex.mobile.ads.impl.kc2;
import com.yandex.mobile.ads.impl.ob1;
import com.yandex.mobile.ads.impl.od2;
import com.yandex.mobile.ads.impl.sa1;
import com.yandex.mobile.ads.impl.ua1;
import com.yandex.mobile.ads.impl.wd2;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.yc2;
import com.yandex.mobile.ads.impl.yg2;
import com.yandex.mobile.ads.impl.zb1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class hb1
implements yc2 {
    @NotNull
    private final sa1 a;
    @NotNull
    private final ff2 b;
    @NotNull
    private final bd2 c;
    @NotNull
    private final ca2<jb1> d;
    @Nullable
    private ed2 e;

    public /* synthetic */ hb1(Context context, b8 b82, x2 x22, sa1 sa12, kc2 kc22, zb1 zb12, fd2 fd22, yg2 yg22, od2 od22, ff2 ff22) {
        this(context, b82, x22, sa12, kc22, zb12, fd22, yg22, od22, ff22, new bd2(context, x22, fd22));
    }

    public hb1(@NotNull Context context, @NotNull b8 b82, @NotNull x2 x22, @NotNull sa1 object, @NotNull kc2 kc22, @NotNull zb1 zb12, @NotNull fd2 fd22, @NotNull yg2 yg22, @NotNull od2 od22, @NotNull ff2 object2, @NotNull bd2 bd22) {
        this.a = object;
        this.b = object2;
        this.c = bd22;
        object = new ua1((sa1)object);
        object2 = new a(this);
        this.d = context = new ca2(context, x22, (hd2)object, (dh2)zb12, kc22, (fg2)new ob1(zb12), new be2(), yg22, od22, (ad2)object2, b82);
        context.a((wd2.b)fd22);
    }

    public final void a(@Nullable ed2 ed22) {
        this.e = ed22;
    }

    public final void play() {
        this.d.d();
    }

    public final void stop() {
        this.d.b();
        this.a.a();
    }

    private final class a
    implements ad2<jb1> {
        final hb1 a;

        public a(hb1 hb12) {
            this.a = hb12;
        }

        public final void a(@NotNull kc2<jb1> ed22) {
            ed22 = this.a.e;
            if (ed22 != null) {
                ed22.a();
            }
        }

        public final void a(@NotNull kc2<jb1> kc22, float f11) {
        }

        public final void a(@NotNull kc2<jb1> ed22, @NotNull id2 id22) {
            this.a.a.e();
            ed22 = this.a.e;
            if (ed22 != null) {
                ed22.b();
            }
        }

        public final void b(@NotNull kc2<jb1> kc22) {
        }

        public final void d(@NotNull kc2<jb1> kc22) {
        }

        public final void e(@NotNull kc2<jb1> ed22) {
            this.a.c.b();
            ed22 = this.a.e;
            if (ed22 != null) {
                ed22.c();
            }
        }

        public final void f(@NotNull kc2<jb1> kc22) {
            this.a.d.c();
        }

        public final void g(@NotNull kc2<jb1> ed22) {
            ed22 = this.a.e;
            if (ed22 != null) {
                ed22.a();
            }
        }

        public final void h(@NotNull kc2<jb1> kc22) {
        }

        public final void i(@NotNull kc2<jb1> kc22) {
        }

        public final void j(@NotNull kc2<jb1> ed22) {
            this.a.c.a();
            ed22 = this.a.e;
            if (ed22 != null) {
                ed22.a();
            }
        }

        public final void k(@NotNull kc2<jb1> kc22) {
            this.a.b.h();
        }

        public final void l(@NotNull kc2<jb1> kc22) {
            this.a.b.d();
        }
    }
}

