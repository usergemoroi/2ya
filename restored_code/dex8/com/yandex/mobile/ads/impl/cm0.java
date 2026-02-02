/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.MainThread
 *  com.yandex.mobile.ads.impl.ct0
 *  com.yandex.mobile.ads.impl.em0
 *  com.yandex.mobile.ads.impl.gt0
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.m32
 *  com.yandex.mobile.ads.impl.m32$a
 *  com.yandex.mobile.ads.impl.vr2
 *  com.yandex.mobile.ads.impl.xs
 *  com.yandex.mobile.ads.impl.zi2
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.MainThread;
import com.yandex.mobile.ads.impl.ct0;
import com.yandex.mobile.ads.impl.dm0;
import com.yandex.mobile.ads.impl.em0;
import com.yandex.mobile.ads.impl.gt0;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.m32;
import com.yandex.mobile.ads.impl.vr2;
import com.yandex.mobile.ads.impl.xs;
import com.yandex.mobile.ads.impl.zi2;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@MainThread
public final class cm0
implements em0 {
    @NotNull
    private final Context a;
    @NotNull
    private final gv1 b;
    @NotNull
    private final gt0 c;
    @NotNull
    private final ct0 d;
    @NotNull
    private final CopyOnWriteArrayList<dm0> e;
    @Nullable
    private xs f;

    public /* synthetic */ cm0(Context context, gv1 gv12) {
        this(context, gv12, new gt0(context), new ct0());
    }

    @JvmOverloads
    public cm0(@NotNull Context context, @NotNull gv1 gv12, @NotNull gt0 gt02, @NotNull ct0 ct02) {
        this.a = context;
        this.b = gv12;
        this.c = gt02;
        this.d = ct02;
        this.e = new CopyOnWriteArrayList();
        gt02.a();
    }

    private static final void a(cm0 cm02, zi2 zi22) {
        Object object = cm02.a;
        gv1 gv12 = cm02.b;
        int n10 = m32.d;
        object = new dm0((Context)object, gv12, cm02, m32.a.a());
        cm02.e.add((dm0)object);
        ((dm0)object).a(cm02.f);
        ((dm0)object).a(zi22);
    }

    public static /* synthetic */ void b(cm0 cm02, zi2 zi22) {
        cm0.a(cm02, zi22);
    }

    public final void a(@NotNull dm0 dm02) {
        this.c.a();
        this.e.remove(dm02);
    }

    public final void a(@Nullable xs xs2) {
        this.c.a();
        this.f = xs2;
        Iterator iterator = this.e.iterator();
        while (iterator.hasNext()) {
            ((dm0)iterator.next()).a(xs2);
        }
    }

    public final void a(@NotNull zi2 zi22) {
        this.c.a();
        this.d.a((Runnable)new vr2(this, zi22));
    }
}

