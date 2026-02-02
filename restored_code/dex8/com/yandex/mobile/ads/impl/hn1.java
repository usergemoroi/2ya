/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  com.yandex.mobile.ads.impl.cn0
 *  com.yandex.mobile.ads.impl.ga
 *  com.yandex.mobile.ads.impl.in1
 *  com.yandex.mobile.ads.impl.jj0
 *  com.yandex.mobile.ads.impl.lo1
 *  com.yandex.mobile.ads.impl.oo
 *  com.yandex.mobile.ads.impl.pw1
 *  com.yandex.mobile.ads.impl.se2
 *  com.yandex.mobile.ads.impl.vf
 *  com.yandex.mobile.ads.impl.vi0$b
 *  com.yandex.mobile.ads.impl.zb2
 *  kotlin.reflect.KProperty
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.yandex.mobile.ads.impl.cn0;
import com.yandex.mobile.ads.impl.ga;
import com.yandex.mobile.ads.impl.in1;
import com.yandex.mobile.ads.impl.jj0;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.lo1;
import com.yandex.mobile.ads.impl.oo;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.se2;
import com.yandex.mobile.ads.impl.vf;
import com.yandex.mobile.ads.impl.vi0;
import com.yandex.mobile.ads.impl.zb2;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class hn1
implements cn0 {
    @NotNull
    private final se2 a;
    @Nullable
    private final vf<jj0> b;
    @Nullable
    private final vf<oo> c;
    @NotNull
    private final Context d;
    @NotNull
    private final in1 e;
    @NotNull
    private final pw1 f;

    public hn1(@NotNull se2 se22, @Nullable vf vf3, @Nullable vf vf4, @NotNull Context context, @NotNull in1 in12, @NotNull pw1 pw12) {
        this.a = se22;
        this.b = vf3;
        this.c = vf4;
        this.d = context;
        this.e = in12;
        this.f = pw12;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(@NotNull zb2 var1_1) {
        block17: {
            block16: {
                if (var1_1.l() == null) {
                    var2_2 = var1_1.k();
                    if (var2_2 != null) {
                        var2_2.setVisibility(8);
                    }
                    var1_1 = var1_1.l();
                    if (var1_1 != null) {
                        var1_1.setVisibility(8);
                    }
                    return;
                }
                var4_4 /* !! */  = this.d;
                var2_3 = this.c;
                var5_5 = null;
                if (var2_3 == null) break block16;
                var2_3 = var3_6 = (oo)var2_3.d();
                if (var3_6 != null) break block17;
            }
            if ((var2_3 = this.f.a(var4_4 /* !! */ )) == null || (var2_3 = var2_3.A()) == null) ** GOTO lbl-1000
            if (var2_3.intValue() == 0) {
                var2_3 = null;
            }
            if (var2_3 != null) {
                var2_3 = new oo(var2_3.intValue(), "https://www.yandex.ru/ads/qr/gen");
            } else lbl-1000:
            // 2 sources

            {
                var2_3 = null;
            }
        }
        if (var2_3 == null) {
            var2_3 = var1_1.k();
            if (var2_3 != null) {
                var2_3.setVisibility(8);
            }
            var1_1 = var1_1.l();
            if (var1_1 != null) {
                var1_1.setVisibility(8);
            }
            return;
        }
        var3_6 = this.a.a();
        if (var3_6 != null) {
            if (var3_6.length() <= 0) {
                var3_6 = null;
            }
            if (var3_6 != null) {
                var6_7 = this.b;
                var4_4 /* !! */  = var5_5;
                if (var6_7 != null) {
                    var6_7 = (jj0)var6_7.d();
                    var4_4 /* !! */  = var5_5;
                    if (var6_7 != null) {
                        var4_4 /* !! */  = var6_7.f();
                    }
                }
                this.e.a((oo)var2_3, (String)var3_6, (String)var4_4 /* !! */ , (vi0.b)new a(var1_1));
                return;
            }
        }
        if ((var2_3 = var1_1.k()) != null) {
            var2_3.setVisibility(8);
        }
        var1_1 = var1_1.l();
        if (var1_1 != null) {
            var1_1.setVisibility(8);
        }
    }

    private static final class a
    implements vi0.b {
        static final KProperty<Object>[] c = new KProperty[]{ga.a(a.class, (String)"weekQrcodeContainer", (String)"getWeekQrcodeContainer()Landroid/view/ViewGroup;", (int)0), ga.a(a.class, (String)"weekQrcodeImageView", (String)"getWeekQrcodeImageView()Landroid/widget/ImageView;", (int)0)};
        @NotNull
        private final ko1 a;
        @NotNull
        private final ko1 b;

        public a(@NotNull zb2 zb22) {
            this.a = lo1.a((Object)zb22.k());
            this.b = lo1.a((Object)zb22.l());
        }

        public final void a(@Nullable Bitmap viewGroup) {
            if (viewGroup == null) {
                ko1 ko12 = this.a;
                viewGroup = c;
                if ((ko12 = (ViewGroup)ko12.getValue(this, viewGroup[0])) != null) {
                    ko12.setVisibility(8);
                }
                viewGroup = (ImageView)this.b.getValue(this, viewGroup[1]);
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
            } else {
                ko1 ko13 = this.b;
                KProperty<Object>[] kPropertyArray = c;
                if ((ko13 = (ImageView)ko13.getValue(this, kPropertyArray[1])) != null) {
                    ko13.setImageBitmap((Bitmap)viewGroup);
                }
                if ((viewGroup = (ViewGroup)this.a.getValue(this, kPropertyArray[0])) != null) {
                    viewGroup.setVisibility(0);
                }
                viewGroup = (ImageView)this.b.getValue(this, kPropertyArray[1]);
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
            }
        }
    }
}

