/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View$MeasureSpec
 *  com.yandex.mobile.ads.impl.c10
 *  com.yandex.mobile.ads.impl.d10
 *  com.yandex.mobile.ads.impl.g10
 *  com.yandex.mobile.ads.impl.gi2
 *  com.yandex.mobile.ads.impl.ou0
 *  com.yandex.mobile.ads.impl.ou0$a
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import com.yandex.mobile.ads.impl.c10;
import com.yandex.mobile.ads.impl.d10;
import com.yandex.mobile.ads.impl.g10;
import com.yandex.mobile.ads.impl.gi2;
import com.yandex.mobile.ads.impl.ou0;
import org.jetbrains.annotations.NotNull;

public final class jb
implements ou0 {
    private final boolean a;
    @NotNull
    private final d10 b;
    @NotNull
    private final g10 c;
    private final Context d;

    public /* synthetic */ jb(Context context, boolean bl2, int n10) {
        if ((n10 & 2) != 0) {
            bl2 = false;
        }
        this(context, bl2, new d10(), new g10());
    }

    public jb(@NotNull Context context, boolean bl2, @NotNull d10 d102, @NotNull g10 g102) {
        this.a = bl2;
        this.b = d102;
        this.c = g102;
        this.d = context.getApplicationContext();
    }

    @NotNull
    public final ou0.a a(int n10, int n13) {
        g10 g102;
        Context context;
        int n14 = View.MeasureSpec.getSize((int)n10);
        int n15 = View.MeasureSpec.getMode((int)n10);
        int n16 = View.MeasureSpec.getSize((int)n13);
        int n17 = View.MeasureSpec.getMode((int)n10);
        if (n15 != 0) {
            context = this.d;
            n10 = gi2.b;
            n10 = context.getResources().getDisplayMetrics().widthPixels;
            context = this.c;
            g102 = this.d;
            context.getClass();
            int n18 = g10.a((Context)g102, (float)420.0f);
            n15 = this.d.getResources().getConfiguration().orientation;
            if (this.b.a(this.d) != c10.b || n15 != 1) {
                n10 = (int)Math.min((double)n10, (double)n18);
            }
            n10 = View.MeasureSpec.makeMeasureSpec((int)((int)Math.min((double)n10, (double)n14)), (int)0x40000000);
        }
        if (n17 != 0) {
            boolean bl2 = this.a;
            n13 = gi2.c((Context)this.d);
            g102 = this.c;
            context = this.d;
            g102.getClass();
            n17 = g10.a((Context)context, (float)350.0f);
            if (!bl2) {
                n13 = (int)Math.min((double)n13, (double)n17);
            }
            n13 = View.MeasureSpec.makeMeasureSpec((int)((int)Math.min((double)n13, (double)n16)), (int)0x40000000);
        }
        context = new ou0.a();
        context.b = n13;
        context.a = n10;
        return context;
    }
}

