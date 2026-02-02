/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.yandex.mobile.ads.impl.gh2
 *  com.yandex.mobile.ads.impl.gi2
 *  com.yandex.mobile.ads.impl.jh2
 *  com.yandex.mobile.ads.impl.vf
 *  com.yandex.mobile.ads.impl.vh2
 *  com.yandex.mobile.ads.impl.wf
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.gh2;
import com.yandex.mobile.ads.impl.gi2;
import com.yandex.mobile.ads.impl.jh2;
import com.yandex.mobile.ads.impl.vf;
import com.yandex.mobile.ads.impl.vh2;
import com.yandex.mobile.ads.impl.wf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class xy<V extends View, T>
implements wf<T> {
    @NotNull
    private final gh2<V, T> a;

    public xy(@NotNull gh2<V, T> gh22) {
        this.a = gh22;
    }

    public final void a() {
        View view = this.a.b();
        if (view == null) {
            return;
        }
        this.a.a(view);
    }

    public final void a(@NotNull vf<T> vf3, @NotNull jh2 jh22) {
        this.a.a(vf3, jh22, vf3.d());
    }

    public final boolean a(T t13) {
        View view = this.a.b();
        boolean bl2 = view != null && this.a.a(view, t13);
        return bl2;
    }

    public void b(T t13) {
        this.c(t13);
    }

    public final boolean b() {
        boolean bl2 = this.a.b() != null;
        return bl2;
    }

    @Nullable
    public final vh2 c() {
        Object object = this.a.b();
        object = object != null ? new vh2(object.getWidth(), object.getHeight()) : null;
        return object;
    }

    public final void c(T t13) {
        View view = this.a.b();
        if (view == null) {
            return;
        }
        this.a.b(view, t13);
        view.setVisibility(0);
    }

    public final boolean d() {
        return gi2.a((View)this.a.b(), (int)100);
    }

    public final void destroy() {
    }

    public final boolean e() {
        return this.a.c();
    }
}

