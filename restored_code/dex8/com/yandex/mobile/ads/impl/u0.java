/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.view.Window
 *  android.widget.LinearLayout
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 *  com.yandex.mobile.ads.impl.a1
 *  com.yandex.mobile.ads.impl.e92
 *  com.yandex.mobile.ads.impl.ek2
 *  com.yandex.mobile.ads.impl.f92
 *  com.yandex.mobile.ads.impl.i1
 *  com.yandex.mobile.ads.impl.j1
 *  com.yandex.mobile.ads.impl.s7
 *  com.yandex.mobile.ads.impl.u7
 *  com.yandex.mobile.ads.impl.y0
 */
package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.a1;
import com.yandex.mobile.ads.impl.e92;
import com.yandex.mobile.ads.impl.ek2;
import com.yandex.mobile.ads.impl.f92;
import com.yandex.mobile.ads.impl.i1;
import com.yandex.mobile.ads.impl.j1;
import com.yandex.mobile.ads.impl.q2;
import com.yandex.mobile.ads.impl.r1;
import com.yandex.mobile.ads.impl.s7;
import com.yandex.mobile.ads.impl.t0;
import com.yandex.mobile.ads.impl.u7;
import com.yandex.mobile.ads.impl.y0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class u0
implements j1 {
    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public final i1 a(@NotNull Activity object, @NotNull RelativeLayout relativeLayout, @NotNull r1 r14, @NotNull a1 object2, @NotNull Intent object3, @NotNull Window window, @Nullable y0 y04) {
        void var6_11;
        void var5_9;
        String string2 = var5_9.getStringExtra("extra_browser_url");
        if (string2 == null) return null;
        if (string2.length() <= 0) return null;
        q2 q22 = new q2((Context)object);
        LinearLayout linearLayout = new LinearLayout((Context)object);
        linearLayout.setId(1);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundColor(s7.b());
        TextView textView = u7.c((Context)object);
        ProgressBar progressBar = u7.d((Context)object);
        e92 e922 = new e92();
        f92 f922 = new f92(e922);
        t0 t02 = new t0((Context)object, relativeLayout, r14, (Window)var6_11, string2, q22, linearLayout, textView, progressBar, f922);
        return t02;
        {
        // Removed invalid catch block
            }
        }
        // Removed invalid catch block
            throw ek23;
        }
    }
}

