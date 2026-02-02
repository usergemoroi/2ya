/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View$MeasureSpec
 *  com.yandex.mobile.ads.impl.ou0
 *  com.yandex.mobile.ads.impl.ou0$a
 *  com.yandex.mobile.ads.impl.tf
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.ou0;
import com.yandex.mobile.ads.impl.tf;
import org.jetbrains.annotations.NotNull;

public final class pm1
implements ou0 {
    private final float a;
    @NotNull
    private final ou0.a b;
    @NotNull
    private final tf c;

    public pm1(float f11) {
        this(f11, new ou0.a());
    }

    public /* synthetic */ pm1(float f11, ou0.a a14) {
        this(f11, a14, new tf(f11));
    }

    public pm1(float f11, @NotNull ou0.a a14, @NotNull tf tf2) {
        this.a = f11;
        this.b = a14;
        this.c = tf2;
    }

    @NotNull
    public final ou0.a a(int n10, int n13) {
        int n14;
        int n15;
        int n16 = View.MeasureSpec.getMode((int)n10);
        int n17 = View.MeasureSpec.getMode((int)n13);
        int n18 = View.MeasureSpec.getSize((int)n10);
        int n19 = View.MeasureSpec.getSize((int)n13);
        if (n16 == 0x40000000 && (n17 == Integer.MIN_VALUE || n17 == 0)) {
            n13 = n15 = this.c.a(n18);
            if (n17 == Integer.MIN_VALUE) {
                n13 = (int)Math.min((double)n19, (double)n15);
            }
            n14 = View.MeasureSpec.makeMeasureSpec((int)n13, (int)0x40000000);
            n15 = n10;
        } else if (n17 == 0x40000000 && (n16 == Integer.MIN_VALUE || n16 == 0)) {
            n10 = n15 = this.c.b(n19);
            if (n16 == Integer.MIN_VALUE) {
                n10 = (int)Math.min((double)n18, (double)n15);
            }
            n15 = View.MeasureSpec.makeMeasureSpec((int)n10, (int)0x40000000);
            n14 = n13;
        } else {
            n15 = n10;
            n14 = n13;
            if (n17 == Integer.MIN_VALUE) {
                n15 = n10;
                n14 = n13;
                if (n16 == Integer.MIN_VALUE) {
                    n15 = n10;
                    n14 = n13;
                    if (n19 != 0) {
                        n15 = n10;
                        n14 = n13;
                        if (n18 != 0) {
                            if ((float)n18 / (float)n19 > this.a) {
                                n15 = View.MeasureSpec.makeMeasureSpec((int)this.c.b(n19), (int)0x40000000);
                                n14 = View.MeasureSpec.makeMeasureSpec((int)n19, (int)0x40000000);
                            } else {
                                n10 = this.c.a(n18);
                                n15 = View.MeasureSpec.makeMeasureSpec((int)n18, (int)0x40000000);
                                n14 = View.MeasureSpec.makeMeasureSpec((int)n10, (int)0x40000000);
                            }
                        }
                    }
                }
            }
        }
        ou0.a a14 = this.b;
        a14.a = n15;
        a14.b = n14;
        return a14;
    }
}

