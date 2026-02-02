/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.MainThread
 *  com.yandex.mobile.ads.impl.au
 *  com.yandex.mobile.ads.impl.ba1
 *  com.yandex.mobile.ads.impl.ea1
 *  com.yandex.mobile.ads.impl.gt0
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.i7
 *  com.yandex.mobile.ads.impl.is
 *  com.yandex.mobile.ads.impl.lt
 *  com.yandex.mobile.ads.impl.o61
 *  com.yandex.mobile.ads.impl.rt
 *  com.yandex.mobile.ads.impl.x61
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.MainThread;
import com.yandex.mobile.ads.impl.ao2;
import com.yandex.mobile.ads.impl.au;
import com.yandex.mobile.ads.impl.ba1;
import com.yandex.mobile.ads.impl.ea1;
import com.yandex.mobile.ads.impl.gt0;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.i7;
import com.yandex.mobile.ads.impl.is;
import com.yandex.mobile.ads.impl.lt;
import com.yandex.mobile.ads.impl.n61;
import com.yandex.mobile.ads.impl.o61;
import com.yandex.mobile.ads.impl.rn2;
import com.yandex.mobile.ads.impl.rt;
import com.yandex.mobile.ads.impl.x61;
import com.yandex.mobile.ads.impl.xn2;
import com.yandex.mobile.ads.impl.y61;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class l61
implements o61 {
    @NotNull
    private final Context a;
    @NotNull
    private final gv1 b;
    @NotNull
    private final is c;
    @NotNull
    private final List<n61> d;
    @NotNull
    private final gt0 e;
    @Nullable
    private lt f;
    @Nullable
    private rt g;
    @Nullable
    private au h;

    public /* synthetic */ l61(Context context, xn2 xn22, is is3) {
        this(context, xn22, is3, new CopyOnWriteArrayList(), new gt0(context), null, null, null);
    }

    public l61(@NotNull Context context, @NotNull xn2 xn22, @NotNull is is3, @NotNull List list, @NotNull gt0 gt02, @Nullable lt lt3, @Nullable rt rt2, @Nullable au au3) {
        this.a = context;
        this.b = xn22;
        this.c = is3;
        this.d = list;
        this.e = gt02;
        this.f = lt3;
        this.g = rt2;
        this.h = au3;
        gt02.a();
    }

    public final void a() {
        Iterator<n61> iterator = this.d.iterator();
        while (iterator.hasNext()) {
            iterator.next().b();
        }
        this.d.clear();
    }

    @MainThread
    public final void a(@Nullable ao2 ao22) {
        this.e.a();
        this.h = ao22;
        Iterator<n61> iterator = this.d.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(ao22);
        }
    }

    public final void a(@NotNull i7 object, @NotNull y61 y612) {
        ba1 ba12 = ba1.c;
        ea1 ea12 = ea1.c;
        object = new x61((i7)object, ba12, y612, 1);
        object = new n61(this.a, this.b, (x61)object, this, this.c, 464);
        this.d.add((n61)object);
        ((n61)object).a(this.f);
        ((n61)object).c();
    }

    public final void a(@NotNull i7 object, @NotNull y61 y612, int n10) {
        ba1 ba12 = ba1.d;
        ea1 ea12 = ea1.c;
        object = new x61((i7)object, ba12, y612, n10);
        object = new n61(this.a, this.b, (x61)object, this, null, 496);
        this.d.add((n61)object);
        ((n61)object).a(this.g);
        ((n61)object).c();
    }

    @MainThread
    public final void a(@Nullable lt lt3) {
        this.e.a();
        this.f = lt3;
        Iterator<n61> iterator = this.d.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(lt3);
        }
    }

    @MainThread
    public final void a(@NotNull n61 n612) {
        this.e.a();
        this.d.remove(n612);
    }

    @MainThread
    public final void a(@Nullable rn2 rn22) {
        this.e.a();
        this.g = rn22;
        Iterator<n61> iterator = this.d.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(rn22);
        }
    }

    public final void b(@NotNull i7 object, @NotNull y61 y612) {
        ba1 ba12 = ba1.e;
        ea1 ea12 = ea1.c;
        object = new x61((i7)object, ba12, y612, 1);
        object = new n61(this.a, this.b, (x61)object, this, this.c, 464);
        this.d.add((n61)object);
        ((n61)object).a(this.h);
        ((n61)object).c();
    }
}

