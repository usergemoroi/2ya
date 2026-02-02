/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Point
 *  android.view.WindowManager
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.impl.vj;
import io.appmetrica.analytics.impl.xq;

public final class wj {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ScreenInfo a(Context var0) {
        block10: {
            try {
                var5_3 = AndroidUtils.isApiAchieved(30);
                if (!var5_3) break block10;
            }
            catch (Throwable var6_6) {}
            try {
                var6_4 /* !! */  = xq.a(var0);
            }
            catch (Throwable var6_5) {}
        }
        var6_4 /* !! */  = null;
        var7_7 = var6_4 /* !! */ ;
        if (var6_4 /* !! */  != null) ** GOTO lbl15
        var7_7 = ((WindowManager)var0.getSystemService("window")).getDefaultDisplay();
lbl15:
        // 2 sources

        if (var7_7 == null) return null;
        var6_4 /* !! */  = new vj();
        var6_4 /* !! */  = (Point)SystemServiceUtils.accessSystemServiceSafely(var7_7, "getting display metrics", "Display", var6_4 /* !! */ );
        return null;
        if (var6_4 /* !! */  == null) {
            return null;
        }
        var3_8 = Math.max(var6_4 /* !! */ .x, var6_4 /* !! */ .y);
        var4_9 = Math.min(var6_4 /* !! */ .x, var6_4 /* !! */ .y);
        var0 = var0.getResources().getDisplayMetrics();
        var2_10 = var0.densityDpi;
        var1_11 = var0.density;
        return new ScreenInfo(var3_8, var4_9, var2_10, var1_11);
        {
            catch (Throwable var0_2) {}
        }
        catch (Throwable var0_1) {
            var2_10 = 0;
            var1_11 = 0.0f;
        }
        return new ScreenInfo(var3_8, var4_9, var2_10, var1_11);
    }
}

