/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
 *  com.yandex.mobile.ads.impl.h31
 *  com.yandex.mobile.ads.impl.l31
 */
package com.yandex.mobile.ads.impl;

import androidx.viewpager2.widget.ViewPager2;
import com.yandex.mobile.ads.impl.h31;
import com.yandex.mobile.ads.impl.l31;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class xf1
extends ViewPager2.OnPageChangeCallback {
    @NotNull
    private final l31 a;
    @Nullable
    private final h31 b;
    private boolean c;

    public xf1(@NotNull l31 l312, @Nullable h31 h312) {
        this.a = l312;
        this.b = h312;
    }

    public final void onPageScrollStateChanged(int n10) {
        if (n10 != 0) {
            if (n10 == 1) {
                h31 h312 = this.b;
                if (h312 != null) {
                    h312.a();
                }
                this.c = true;
            }
        } else {
            this.c = false;
        }
    }

    public final void onPageSelected(int n10) {
        if (this.c) {
            this.a.c();
            this.c = false;
        }
    }
}

