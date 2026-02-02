/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.a71
 *  com.yandex.mobile.ads.impl.eo
 *  com.yandex.mobile.ads.impl.gt
 *  com.yandex.mobile.ads.impl.h61
 *  com.yandex.mobile.ads.impl.ht
 *  com.yandex.mobile.ads.impl.jr1
 *  com.yandex.mobile.ads.impl.kt
 *  com.yandex.mobile.ads.impl.m91
 *  com.yandex.mobile.ads.impl.ot
 *  com.yandex.mobile.ads.impl.ra
 *  com.yandex.mobile.ads.impl.t20
 *  com.yandex.mobile.ads.impl.t61
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.a71;
import com.yandex.mobile.ads.impl.eo;
import com.yandex.mobile.ads.impl.gt;
import com.yandex.mobile.ads.impl.h61;
import com.yandex.mobile.ads.impl.ht;
import com.yandex.mobile.ads.impl.jr1;
import com.yandex.mobile.ads.impl.kt;
import com.yandex.mobile.ads.impl.m71;
import com.yandex.mobile.ads.impl.m91;
import com.yandex.mobile.ads.impl.ot;
import com.yandex.mobile.ads.impl.ra;
import com.yandex.mobile.ads.impl.t20;
import com.yandex.mobile.ads.impl.t61;
import com.yandex.mobile.ads.nativeads.c;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class k81
implements t61 {
    @NotNull
    private final List<t61> a;
    @Nullable
    private final t61 b;

    public k81(@NotNull ArrayList arrayList) {
        this.a = arrayList;
        arrayList = arrayList.isEmpty() ? null : (t61)arrayList.get(0);
        this.b = arrayList;
    }

    @Nullable
    public final ra a() {
        Object object = this.b;
        object = object != null ? object.a() : null;
        return object;
    }

    public final void a(@Nullable ht ht3) {
        t61 t612 = this.b;
        if (t612 != null) {
            t612.a(ht3);
        }
    }

    public final void a(@NotNull kt kt2) {
        t61 t612 = this.b;
        if (t612 != null) {
            t612.a(kt2);
        }
    }

    public final void a(@Nullable c c11) {
        t61 t612 = this.b;
        if (t612 != null) {
            t612.a(c11);
        }
    }

    @Nullable
    public final a71 b() {
        Object object = this.b;
        object = object != null ? object.b() : null;
        return object;
    }

    public final void b(@NotNull kt kt2) {
        t61 t612 = this.b;
        if (t612 != null) {
            t612.b(kt2);
        }
    }

    public final void b(@NotNull m71 m712) throws h61 {
        t61 t612 = this.b;
        if (t612 != null) {
            t612.b(m712);
        }
    }

    public final void b(@NotNull m71 m712, @NotNull eo eo3) throws h61 {
        t61 t612 = this.b;
        if (t612 != null) {
            t612.b(m712, eo3);
        }
    }

    @NotNull
    public final m91 c() {
        t61 t612;
        block3: {
            block2: {
                t612 = this.b;
                if (t612 == null) break block2;
                m91 m912 = t612.c();
                t612 = m912;
                if (m912 != null) break block3;
            }
            t612 = new m91(null, null);
        }
        return t612;
    }

    @Nullable
    public final List<t20> d() {
        Object object = this.b;
        object = object != null ? object.d() : null;
        return object;
    }

    public final void destroy() {
        t61 t612 = this.b;
        if (t612 != null) {
            t612.destroy();
        }
    }

    @NotNull
    public final List<t61> f() {
        return this.a;
    }

    @NotNull
    public final gt getAdAssets() {
        t61 t612;
        block3: {
            block2: {
                t612 = this.b;
                if (t612 == null) break block2;
                gt gt3 = t612.getAdAssets();
                t612 = gt3;
                if (gt3 != null) break block3;
            }
            t612 = new gt(0);
        }
        return t612;
    }

    @NotNull
    public final jr1 getAdType() {
        t61 t612;
        block3: {
            block2: {
                t612 = this.b;
                if (t612 == null) break block2;
                jr1 jr12 = t612.getAdType();
                t612 = jr12;
                if (jr12 != null) break block3;
            }
            t612 = jr1.c;
        }
        return t612;
    }

    @Nullable
    public final String getInfo() {
        Object object = this.b;
        object = object != null ? object.getInfo() : null;
        return object;
    }

    @Nullable
    public final ot getNativeAdVideoController() {
        Object object = this.b;
        object = object != null ? object.getNativeAdVideoController() : null;
        return object;
    }

    public final void loadImages() {
        t61 t612 = this.b;
        if (t612 != null) {
            t612.loadImages();
        }
    }
}

