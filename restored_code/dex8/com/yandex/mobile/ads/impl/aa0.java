/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  com.monetization.ads.nativeads.ExtendedNativeAdView
 *  com.yandex.div.core.view2.Div2View
 *  com.yandex.mobile.ads.impl.m10
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.t00
 *  com.yandex.mobile.ads.impl.yk1
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.div.core.view2.Div2View;
import com.yandex.mobile.ads.impl.c20;
import com.yandex.mobile.ads.impl.cy1;
import com.yandex.mobile.ads.impl.m10;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.t00;
import com.yandex.mobile.ads.impl.wp1;
import com.yandex.mobile.ads.impl.yk1;
import org.jetbrains.annotations.NotNull;

public final class aa0
implements t00<ExtendedNativeAdView> {
    @NotNull
    private final yk1 a;
    @NotNull
    private final c20 b;
    @NotNull
    private final wp1 c;

    public aa0(@NotNull yk1 yk12, @NotNull c20 c202, @NotNull wp1 wp12) {
        this.a = yk12;
        this.b = c202;
        this.c = wp12;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(ViewGroup viewGroup) {
        Throwable throwable2;
        block5: {
            Div2View div2View;
            ExtendedNativeAdView extendedNativeAdView;
            block4: {
                block3: {
                    extendedNativeAdView = (ExtendedNativeAdView)viewGroup;
                    try {
                        extendedNativeAdView.removeAllViews();
                        div2View = this.a.d();
                        viewGroup = div2View.getParent();
                        if (!(viewGroup instanceof ViewGroup)) break block3;
                        break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                viewGroup = null;
            }
            if (viewGroup != null) {
                viewGroup.removeView((View)div2View);
            }
            m10.a((Div2View)div2View).a(this.b);
            extendedNativeAdView.addView((View)div2View);
            return;
        }
        int n10 = op0.b;
        this.c.reportError("Failed to bind DivKit Feed Preloaded Ad", throwable2);
    }

    public final void c() {
        Div2View div2View = this.a.d();
        cy1 cy12 = m10.a((Div2View)div2View);
        ViewGroup viewGroup = null;
        cy12.a(null);
        cy12 = div2View.getParent();
        if (cy12 instanceof ViewGroup) {
            viewGroup = (ViewGroup)cy12;
        }
        if (viewGroup != null) {
            viewGroup.removeView((View)div2View);
        }
    }
}

