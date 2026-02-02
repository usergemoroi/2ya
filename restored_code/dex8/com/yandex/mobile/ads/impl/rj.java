/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.MainThread
 *  com.yandex.mobile.ads.impl.c33
 *  com.yandex.mobile.ads.impl.ct0
 *  com.yandex.mobile.ads.impl.gt0
 *  com.yandex.mobile.ads.impl.i7
 *  com.yandex.mobile.ads.impl.k4
 *  com.yandex.mobile.ads.impl.lf
 *  com.yandex.mobile.ads.impl.ls
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.MainThread;
import com.yandex.mobile.ads.impl.c33;
import com.yandex.mobile.ads.impl.cd0;
import com.yandex.mobile.ads.impl.ct0;
import com.yandex.mobile.ads.impl.gm2;
import com.yandex.mobile.ads.impl.gt0;
import com.yandex.mobile.ads.impl.i7;
import com.yandex.mobile.ads.impl.if;
import com.yandex.mobile.ads.impl.jf;
import com.yandex.mobile.ads.impl.k4;
import com.yandex.mobile.ads.impl.lf;
import com.yandex.mobile.ads.impl.ls;
import com.yandex.mobile.ads.impl.xn2;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@MainThread
public final class rj
implements jf {
    @NotNull
    private final Context a;
    @NotNull
    private final gt0 b;
    @NotNull
    private final ct0 c;
    @NotNull
    private final lf d;
    @NotNull
    private final CopyOnWriteArrayList<if> e;
    @Nullable
    private ls f;

    @JvmOverloads
    public rj(@NotNull Context context, @NotNull xn2 xn22, @NotNull gt0 gt02, @NotNull ct0 ct02, @NotNull lf lf3) {
        this.a = context;
        this.b = gt02;
        this.c = ct02;
        this.d = lf3;
        this.e = new CopyOnWriteArrayList();
        gt02.a();
    }

    private static final void a(rj rj3, i7 i73) {
        if if_ = rj3.d.a(rj3.a, (k4)rj3, i73, null);
        rj3.e.add(if_);
        if_.a(i73.a());
        if_.a(rj3.f);
        if_.b(i73);
    }

    public static /* synthetic */ void b(rj rj3, i7 i73) {
        rj.a(rj3, i73);
    }

    @Override
    @MainThread
    public final void a() {
        this.b.a();
        this.c.a();
        for (if if_ : this.e) {
            if_.a((ls)null);
            if_.d();
        }
        this.e.clear();
    }

    public final void a(cd0 cd02) {
        cd02 = (if)cd02;
        this.b.a();
        ((if)cd02).a((ls)null);
        this.e.remove(cd02);
    }

    @Override
    @MainThread
    public final void a(@Nullable gm2 gm22) {
        this.b.a();
        this.f = gm22;
        Iterator<if> iterator = this.e.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(gm22);
        }
    }

    @Override
    @MainThread
    public final void a(@NotNull i7 i73) {
        this.b.a();
        this.c.a((Runnable)new c33(this, i73));
    }
}

