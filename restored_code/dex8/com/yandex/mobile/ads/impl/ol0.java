/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.MainThread
 *  com.yandex.mobile.ads.impl.ct0
 *  com.yandex.mobile.ads.impl.gt0
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.is
 *  com.yandex.mobile.ads.impl.m32
 *  com.yandex.mobile.ads.impl.m32$a
 *  com.yandex.mobile.ads.impl.o13
 *  com.yandex.mobile.ads.impl.p4
 *  com.yandex.mobile.ads.impl.pa2
 *  com.yandex.mobile.ads.impl.qc2
 *  com.yandex.mobile.ads.impl.ql0
 *  com.yandex.mobile.ads.impl.vk0
 *  com.yandex.mobile.ads.impl.vs
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.MainThread;
import com.yandex.mobile.ads.impl.ct0;
import com.yandex.mobile.ads.impl.gt0;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.is;
import com.yandex.mobile.ads.impl.m32;
import com.yandex.mobile.ads.impl.o13;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.pa2;
import com.yandex.mobile.ads.impl.pl0;
import com.yandex.mobile.ads.impl.qc2;
import com.yandex.mobile.ads.impl.ql0;
import com.yandex.mobile.ads.impl.tm2;
import com.yandex.mobile.ads.impl.vk0;
import com.yandex.mobile.ads.impl.vs;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.xn2;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@MainThread
public final class ol0
implements ql0 {
    @NotNull
    private final Context a;
    @NotNull
    private final gv1 b;
    @NotNull
    private final gt0 c;
    @NotNull
    private final ct0 d;
    @NotNull
    private final CopyOnWriteArrayList<pl0> e;
    @Nullable
    private vs f;

    public /* synthetic */ ol0(Context context, xn2 xn22) {
        this(context, xn22, new gt0(context), new ct0(), new CopyOnWriteArrayList());
    }

    public ol0(@NotNull Context context, @NotNull xn2 xn22, @NotNull gt0 gt02, @NotNull ct0 ct02, @NotNull CopyOnWriteArrayList copyOnWriteArrayList) {
        this.a = context;
        this.b = xn22;
        this.c = gt02;
        this.d = ct02;
        this.e = copyOnWriteArrayList;
        gt02.a();
    }

    private static final void a(ol0 ol02, pa2 pa22) {
        Context context = ol02.a;
        gv1 gv12 = ol02.b;
        int n10 = m32.d;
        m32 m322 = m32.a.a();
        p4 p42 = new p4();
        Object object = new x2(is.h, gv12);
        object = new pl0(context, gv12, ol02, m322, p42, (x2)object, new qc2(context, (x2)object, p42), new vk0());
        ol02.e.add((pl0)object);
        ((pl0)object).a(ol02.f);
        ((pl0)object).a(pa22);
    }

    public static /* synthetic */ void b(ol0 ol02, pa2 pa22) {
        ol0.a(ol02, pa22);
    }

    public final void a(@NotNull pa2 pa22) {
        this.c.a();
        this.d.a((Runnable)new o13(this, pa22));
    }

    public final void a(@NotNull pl0 pl02) {
        this.c.a();
        this.e.remove(pl02);
    }

    public final void a(@Nullable tm2 tm22) {
        this.c.a();
        this.f = tm22;
        Iterator iterator = this.e.iterator();
        while (iterator.hasNext()) {
            ((pl0)iterator.next()).a(tm22);
        }
    }
}

