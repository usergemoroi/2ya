/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  com.yandex.mobile.ads.impl.a1
 *  com.yandex.mobile.ads.impl.b1
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.e51
 *  com.yandex.mobile.ads.impl.h52
 *  com.yandex.mobile.ads.impl.kp
 *  com.yandex.mobile.ads.impl.m91
 *  com.yandex.mobile.ads.impl.np
 *  com.yandex.mobile.ads.impl.nr
 *  com.yandex.mobile.ads.impl.pw1
 *  com.yandex.mobile.ads.impl.pw1$a
 *  com.yandex.mobile.ads.impl.rc0
 *  com.yandex.mobile.ads.impl.t00
 *  com.yandex.mobile.ads.impl.t20
 *  com.yandex.mobile.ads.impl.y00
 *  com.yandex.mobile.ads.impl.z00
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.a1;
import com.yandex.mobile.ads.impl.b1;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.bb1;
import com.yandex.mobile.ads.impl.db1;
import com.yandex.mobile.ads.impl.dc1;
import com.yandex.mobile.ads.impl.e51;
import com.yandex.mobile.ads.impl.fc1;
import com.yandex.mobile.ads.impl.g51;
import com.yandex.mobile.ads.impl.h52;
import com.yandex.mobile.ads.impl.kp;
import com.yandex.mobile.ads.impl.m91;
import com.yandex.mobile.ads.impl.np;
import com.yandex.mobile.ads.impl.nr;
import com.yandex.mobile.ads.impl.p81;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.rc0;
import com.yandex.mobile.ads.impl.t00;
import com.yandex.mobile.ads.impl.t20;
import com.yandex.mobile.ads.impl.y00;
import com.yandex.mobile.ads.impl.z00;
import java.lang.ref.WeakReference;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class os1<V extends ViewGroup>
implements t00<V> {
    @NotNull
    private final b8<?> a;
    @NotNull
    private final a1 b;
    @NotNull
    private final nr c;
    @NotNull
    private final e51 d;
    @NotNull
    private final m91 e;
    @NotNull
    private final h52 f;
    @Nullable
    private final t20 g;
    @NotNull
    private final kp h;
    @Nullable
    private rc0 i;
    @Nullable
    private b j;

    @JvmOverloads
    public os1(@NotNull b8 b82, @NotNull a1 a14, @NotNull nr nr2, @NotNull g51 g512, @NotNull m91 m912, @NotNull h52 h522, @Nullable t20 t202, @NotNull kp kp2) {
        this.a = b82;
        this.b = a14;
        this.c = nr2;
        this.d = g512;
        this.e = m912;
        this.f = h522;
        this.g = t202;
        this.h = kp2;
    }

    public final void a(@NotNull V object) {
        if ((object = this.d.c(object)) != null) {
            Object object2 = new b(this);
            this.b.a((b1)object2);
            this.j = object2;
            object2 = object.getContext();
            int n10 = pw1.l;
            object2 = pw1.a.a().a((Context)object2);
            boolean bl2 = false;
            n10 = object2 != null && object2.C0() ? 1 : 0;
            boolean bl3 = bl2;
            if (y.e(y00.c.a(), this.a.v())) {
                bl3 = bl2;
                if (n10 != 0) {
                    bl3 = true;
                }
            }
            if (bl3 ^ true) {
                object.setOnClickListener((View.OnClickListener)new /* Unavailable Anonymous Inner Class!! */);
            }
            object.setVisibility(8);
            c c11 = new c(new WeakReference<V>(object));
            Object object3 = this.h;
            b8<?> b82 = this.a;
            object2 = this.e;
            h52 h522 = this.f;
            object = this.g;
            object3.getClass();
            object3 = object2.a();
            fc1 fc12 = object2.b();
            object2 = null;
            object = object != null ? object.e() : null;
            object = y.e(object, z00.d.a()) && h522.b().a() ? new p81(b82, c11, h522) : (object3 != null ? new bb1((db1)object3, c11, b82.t(), h522.c(), h522.b()) : (fc12 != null ? new dc1(fc12, c11) : (h522.b().a() ? new p81(b82, c11, h522) : null)));
            if (object != null) {
                object.start();
                object2 = object;
            }
            this.i = object2;
        }
    }

    public final void c() {
        b b10 = this.j;
        if (b10 != null) {
            this.b.b((b1)b10);
        }
        if ((b10 = this.i) != null) {
            b10.invalidate();
        }
    }

    private final class b
    implements b1 {
        final os1<V> a;

        public b(os1 os12) {
            this.a = os12;
        }

        public final void a() {
            rc0 rc02 = this.a.i;
            if (rc02 != null) {
                rc02.resume();
            }
        }

        public final void b() {
            rc0 rc02 = this.a.i;
            if (rc02 != null) {
                rc02.pause();
            }
        }
    }

    private static final class c
    implements np {
        @NotNull
        private final WeakReference<View> a;

        @JvmOverloads
        public c(@NotNull WeakReference weakReference) {
            this.a = weakReference;
        }

        public final void a() {
            View view = (View)this.a.get();
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }
}

