/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.monetization.ads.nativeads.CustomizableMediaView
 *  com.yandex.mobile.ads.impl.ay1
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.ba
 *  com.yandex.mobile.ads.impl.ej0
 *  com.yandex.mobile.ads.impl.ek2
 *  com.yandex.mobile.ads.impl.ex0
 *  com.yandex.mobile.ads.impl.fx0
 *  com.yandex.mobile.ads.impl.gx0
 *  com.yandex.mobile.ads.impl.h51
 *  com.yandex.mobile.ads.impl.hx0
 *  com.yandex.mobile.ads.impl.hz1
 *  com.yandex.mobile.ads.impl.ix0
 *  com.yandex.mobile.ads.impl.jx0
 *  com.yandex.mobile.ads.impl.m91
 *  com.yandex.mobile.ads.impl.q80
 *  com.yandex.mobile.ads.impl.r80
 *  com.yandex.mobile.ads.impl.su0
 *  com.yandex.mobile.ads.impl.uv0
 *  com.yandex.mobile.ads.impl.wb2
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.zw0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.aw1;
import com.yandex.mobile.ads.impl.ay1;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.ba;
import com.yandex.mobile.ads.impl.ck0;
import com.yandex.mobile.ads.impl.cw1;
import com.yandex.mobile.ads.impl.cx0;
import com.yandex.mobile.ads.impl.db1;
import com.yandex.mobile.ads.impl.dw1;
import com.yandex.mobile.ads.impl.ej0;
import com.yandex.mobile.ads.impl.ek2;
import com.yandex.mobile.ads.impl.ex0;
import com.yandex.mobile.ads.impl.fc1;
import com.yandex.mobile.ads.impl.fx0;
import com.yandex.mobile.ads.impl.gx0;
import com.yandex.mobile.ads.impl.h51;
import com.yandex.mobile.ads.impl.hx0;
import com.yandex.mobile.ads.impl.hz1;
import com.yandex.mobile.ads.impl.ix0;
import com.yandex.mobile.ads.impl.jx0;
import com.yandex.mobile.ads.impl.m91;
import com.yandex.mobile.ads.impl.q80;
import com.yandex.mobile.ads.impl.r80;
import com.yandex.mobile.ads.impl.su0;
import com.yandex.mobile.ads.impl.u81;
import com.yandex.mobile.ads.impl.uv0;
import com.yandex.mobile.ads.impl.wb2;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.zw0;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class yv1
implements ex0 {
    @NotNull
    private final b8<?> a;
    @NotNull
    private final ix0 b;
    @NotNull
    private final fx0 c;
    @NotNull
    private final hx0 d;
    @NotNull
    private final gx0 e;

    public yv1(@NotNull b8 b82, @NotNull ix0 ix02, @NotNull fx0 fx02, @NotNull hx0 hx02, @NotNull gx0 gx02) {
        this.a = b82;
        this.b = ix02;
        this.c = fx02;
        this.d = hx02;
        this.e = gx02;
    }

    private final cx0 a(CustomizableMediaView object, x2 object2, ej0 ej02, jx0 jx02, ay1 ay12, zw0 object3) {
        if ((object3 = object3.a()) != null && !object3.isEmpty()) {
            if (object3.size() == 1) {
                object = this.c.a(object, ej02, jx02);
            } else {
                try {
                    object2 = this.d.a(this.a, object2, object, ej02, (List)object3, jx02, ay12);
                    object = object2;
                }
                catch (Throwable throwable) {
                    object = this.c.a(object, ej02, jx02);
                }
            }
        } else {
            object = null;
        }
        return object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public final cx0 a(@NotNull CustomizableMediaView customizableMediaView, @NotNull x2 x22, @NotNull ej0 ej02, @NotNull uv0 object, @NotNull ck0 object2, @NotNull m91 object3, @NotNull u81 u812, @NotNull h51 h512, @NotNull jx0 jx02, @Nullable ay1 ay12, @Nullable zw0 zw02) {
        void var5_22;
        void var4_14;
        void var10_30;
        void var9_29;
        void var5_17;
        void var6_23;
        void var11_31;
        Object var13_32 = null;
        Object var14_33 = null;
        if (var11_31 == null) {
            return null;
        }
        db1 db12 = var6_23.a();
        fc1 fc12 = var6_23.b();
        su0 su02 = var11_31.b();
        Context context = customizableMediaView.getContext();
        boolean bl2 = r80.a((Context)customizableMediaView.getContext(), (q80)q80.e);
        if (bl2) {
            customizableMediaView.removeAllViews();
        }
        if (db12 != null) {
            cx0 cx02;
            void var4_7;
            void var8_28;
            void var7_27;
            wb2 wb22 = var11_31.c();
            cw1 cw12 = this.b.a(customizableMediaView, object, x22, (ck0)var5_17, db12, (u81)var7_27, (h51)var8_28, (jx0)var9_29, ej02, (ay1)var10_30, wb22);
            Object var4_5 = var14_33;
            if (var10_30 != null) {
                hz1 hz12 = var10_30.a();
            }
            if (var4_7 != null && bl2 && (cx02 = this.a(customizableMediaView, x22, ej02, (jx0)var9_29, (ay1)var10_30, (zw0)var11_31)) != null) {
                dw1 dw12 = new dw1(customizableMediaView, cw12, cx02, (jx0)var9_29, (hz1)var4_7);
            } else {
                cw1 cw13 = cw12;
            }
        } else {
            Object var4_10 = var13_32;
            if (fc12 != null) {
                Object var4_11 = var13_32;
                if (su02 != null) {
                    Object var4_12 = var13_32;
                    if (ba.a((Context)context)) {
                        try {
                            aw1 aw12 = this.e.a(customizableMediaView, su02, (ck0)var5_17, fc12, (jx0)var9_29);
                        }
                        catch (ek2 ek22) {
                            Object var4_16 = var13_32;
                        }
                    }
                }
            }
        }
        void var5_20 = var4_14;
        if (var4_14 == null) {
            cx0 cx03 = this.a(customizableMediaView, x22, ej02, (jx0)var9_29, (ay1)var10_30, (zw0)var11_31);
        }
        return var5_22;
    }
}

