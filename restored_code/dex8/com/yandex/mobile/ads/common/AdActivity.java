/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  android.view.Window
 *  android.widget.RelativeLayout
 *  androidx.activity.ComponentActivity
 *  com.yandex.mobile.ads.impl.a1
 *  com.yandex.mobile.ads.impl.ei2
 *  com.yandex.mobile.ads.impl.i1
 *  com.yandex.mobile.ads.impl.k1
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.we1
 *  com.yandex.mobile.ads.impl.x0
 *  com.yandex.mobile.ads.impl.y0
 *  com.yandex.mobile.ads.impl.z0
 *  com.yandex.mobile.ads.impl.z0$a
 *  com.yandex.mobile.ads.impl.ze1
 */
package com.yandex.mobile.ads.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.activity.ComponentActivity;
import com.yandex.mobile.ads.impl.a1;
import com.yandex.mobile.ads.impl.ei2;
import com.yandex.mobile.ads.impl.g8;
import com.yandex.mobile.ads.impl.i1;
import com.yandex.mobile.ads.impl.k1;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.r1;
import com.yandex.mobile.ads.impl.we1;
import com.yandex.mobile.ads.impl.x0;
import com.yandex.mobile.ads.impl.y0;
import com.yandex.mobile.ads.impl.z0;
import com.yandex.mobile.ads.impl.ze1;
import kotlin.Metadata;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2={"Lcom/yandex/mobile/ads/common/AdActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "mobileads_externalRelease"}, k=1, mv={1, 9, 0})
public final class AdActivity
extends ComponentActivity {
    @Nullable
    private we1 a;
    @Nullable
    private x0 b;

    public final void onBackPressed() {
        x0 x04 = this.b;
        if (x04 == null || x04.c()) {
            super.onBackPressed();
        }
    }

    public final void onConfigurationChanged(@NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        x0 x04 = this.b;
        if (x04 != null) {
            x04.a(configuration);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onCreate(@Nullable Bundle object) {
        we1 we12;
        void var5_32;
        void var1_15;
        void var1_12;
        super.onCreate(object);
        a1 a12 = new a1((Context)this);
        RelativeLayout relativeLayout = new RelativeLayout((Context)this);
        Intent intent = this.getIntent();
        Object var6_20 = null;
        if (intent == null) {
            Object var1_2 = null;
        } else {
            void var5_28;
            void var1_10;
            Window window;
            block16: {
                void var1_7;
                z0 z02;
                int n10;
                block15: {
                    block14: {
                        window = this.getWindow();
                        n10 = z0.d;
                        z02 = z0.a.a();
                        try {
                            if (!intent.hasExtra("data_identifier")) break block14;
                            long l10 = intent.getLongExtra("data_identifier", -1L);
                            Long l11 = l10;
                            if (l10 != -1L) break block15;
                        }
                        catch (Exception exception) {
                            n10 = op0.b;
                        }
                    }
                    Object var1_5 = null;
                }
                if (var1_7 != null) {
                    y0 y04 = z02.a(var1_7.longValue());
                } else {
                    Object var1_9 = null;
                }
                if (var1_10 != null) {
                    try {
                        g8 g84 = var1_10.d();
                        break block16;
                    }
                    catch (Exception exception) {
                        n10 = op0.b;
                    }
                }
                Object var5_27 = null;
            }
            r1 r12 = new r1((Activity)this, (g8)var5_28);
            i1 i14 = k1.b.a().a((Activity)this, relativeLayout, r12, a12, intent, window, (y0)var1_10);
        }
        if (var1_12 != null) {
            x0 x04 = new x0((Activity)this, relativeLayout, (i1)var1_12, a12, new ei2());
        } else {
            Object var1_14 = null;
        }
        this.b = var1_15;
        Object var5_30 = var6_20;
        if (var1_15 != null) {
            var1_15.b();
            k0 k02 = k0.a;
        }
        if (var5_32 == null) {
            this.finish();
        }
        new ze1();
        this.a = we12 = ze1.a((Activity)this, (x0)this.b);
        if (we12 != null) {
            we12.a();
        }
    }

    public final void onDestroy() {
        x0 x04 = this.b;
        if (x04 != null) {
            x04.a();
        }
        if ((x04 = this.a) != null) {
            x04.destroy();
        }
        super.onDestroy();
    }

    public final void onPause() {
        x0 x04 = this.b;
        if (x04 != null) {
            x04.d();
        }
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        x0 x04 = this.b;
        if (x04 != null) {
            x04.e();
        }
    }
}

