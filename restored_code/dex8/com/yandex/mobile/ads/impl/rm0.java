/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  com.yandex.mobile.ads.impl.e33
 *  com.yandex.mobile.ads.impl.f33
 *  com.yandex.mobile.ads.impl.j3
 *  com.yandex.mobile.ads.impl.o4
 *  com.yandex.mobile.ads.impl.oq1
 *  com.yandex.mobile.ads.impl.p4
 *  com.yandex.mobile.ads.impl.pm0$a
 *  com.yandex.mobile.ads.impl.qm0
 *  com.yandex.mobile.ads.impl.r4
 *  com.yandex.mobile.ads.impl.ss
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.xs
 *  com.yandex.mobile.ads.impl.zi2
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.e33;
import com.yandex.mobile.ads.impl.f33;
import com.yandex.mobile.ads.impl.j3;
import com.yandex.mobile.ads.impl.o4;
import com.yandex.mobile.ads.impl.oq1;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.pm0;
import com.yandex.mobile.ads.impl.qm0;
import com.yandex.mobile.ads.impl.r4;
import com.yandex.mobile.ads.impl.ss;
import com.yandex.mobile.ads.impl.uo0;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.xs;
import com.yandex.mobile.ads.impl.zi2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class rm0
implements pm0.a {
    @NotNull
    private final x2 a;
    @NotNull
    private final p4 b;
    @NotNull
    private final qm0 c;
    @NotNull
    private final Handler d;
    @NotNull
    private final r4 e;
    @Nullable
    private xs f;

    public /* synthetic */ rm0(Context context, x2 x22, p4 p42, qm0 qm02) {
        this(x22, p42, qm02, new Handler(Looper.getMainLooper()), new r4(context, x22, p42));
    }

    public rm0(@NotNull x2 x22, @NotNull p4 p42, @NotNull qm0 qm02, @NotNull Handler handler, @NotNull r4 r43) {
        this.a = x22;
        this.b = p42;
        this.c = qm02;
        this.d = handler;
        this.e = r43;
    }

    private static final void a(rm0 rm02, ss ss3) {
        xs xs3 = rm02.f;
        if (xs3 != null) {
            xs3.a(ss3);
        }
        rm02.c.a();
    }

    private static final void a(rm0 rm02, String string2) {
        xs xs3 = rm02.f;
        if (xs3 != null) {
            xs3.onInstreamAdFailedToLoad(string2);
        }
        rm02.c.a();
    }

    public static /* synthetic */ void b(rm0 rm02, ss ss3) {
        rm0.a(rm02, ss3);
    }

    public static /* synthetic */ void c(rm0 rm02, String string2) {
        rm0.a(rm02, string2);
    }

    public final void a(@NotNull ss ss3) {
        j3.a((String)this.a.b().b());
        this.b.a(o4.e);
        this.e.a();
        this.d.post((Runnable)new e33(this, ss3));
    }

    public final void a(@Nullable xs xs3) {
        this.f = xs3;
        this.e.a(new Object[]{xs3});
    }

    public final void a(@NotNull zi2 object) {
        object = new uo0((zi2)object);
        this.e.a((oq1)object);
    }

    public final void a(@NotNull String string2) {
        this.b.a(o4.e);
        this.e.a(string2);
        this.d.post((Runnable)new f33(this, string2));
    }
}

