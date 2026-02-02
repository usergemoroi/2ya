/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.view.Window
 *  android.widget.RelativeLayout
 *  com.yandex.mobile.ads.impl.a1
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.bd0
 *  com.yandex.mobile.ads.impl.i1
 *  com.yandex.mobile.ads.impl.j1
 *  com.yandex.mobile.ads.impl.lf1
 *  com.yandex.mobile.ads.impl.lv1
 *  com.yandex.mobile.ads.impl.ou1
 *  com.yandex.mobile.ads.impl.pc0
 *  com.yandex.mobile.ads.impl.pw1
 *  com.yandex.mobile.ads.impl.pw1$a
 *  com.yandex.mobile.ads.impl.t61
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.y0
 *  com.yandex.mobile.ads.impl.yc0
 */
package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Window;
import android.widget.RelativeLayout;
import com.yandex.mobile.ads.impl.a1;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.bd0;
import com.yandex.mobile.ads.impl.c1;
import com.yandex.mobile.ads.impl.g1;
import com.yandex.mobile.ads.impl.i1;
import com.yandex.mobile.ads.impl.j1;
import com.yandex.mobile.ads.impl.lf1;
import com.yandex.mobile.ads.impl.lv1;
import com.yandex.mobile.ads.impl.ou1;
import com.yandex.mobile.ads.impl.pc0;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.r1;
import com.yandex.mobile.ads.impl.t61;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.y0;
import com.yandex.mobile.ads.impl.yc0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class d1
implements j1 {
    @Nullable
    public final i1 a(@NotNull Activity activity, @NotNull RelativeLayout relativeLayout, @NotNull r1 r12, @NotNull a1 a12, @NotNull Intent object, @NotNull Window window, @Nullable y0 y04) {
        Object var9_8 = null;
        object = var9_8;
        if (y04 != null) {
            b8 b82 = y04.c();
            x2 x22 = y04.b();
            t61 t612 = y04.e();
            lv1 lv12 = y04.g();
            object = b82 instanceof b8 ? b82 : null;
            object = object != null ? (String)object.J() : null;
            int n10 = pw1.l;
            ou1 ou12 = pw1.a.a().a(window.getContext());
            if (lv12 != null && object != null && ((String)object).length() != 0) {
                a12 = new yc0(b82, (String)object, lv12);
                object = new c1(relativeLayout, r12, window, (yc0)a12, ou12, new lf1((Context)activity, a12.a(), r12), new pc0((Context)activity), new bd0(a12.a().m()));
            } else {
                object = var9_8;
                if (t612 != null) {
                    object = new g1((Context)activity, relativeLayout, window, t612, b82, r12, a12, x22, y04.f(), ou12, new pc0((Context)activity), new bd0(x22.b()));
                }
            }
        }
        return object;
    }
}

