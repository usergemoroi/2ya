/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnDismissListener
 *  android.view.ContextThemeWrapper
 *  android.view.View
 *  com.yandex.div.R$style
 *  com.yandex.div.core.Div2Context
 *  com.yandex.div.core.DivActionHandler
 *  com.yandex.div.core.DivConfiguration
 *  com.yandex.div.core.view2.Div2View
 *  com.yandex.mobile.ads.R$style
 *  com.yandex.mobile.ads.impl.f10
 *  com.yandex.mobile.ads.impl.g30
 *  com.yandex.mobile.ads.impl.nr
 *  com.yandex.mobile.ads.impl.rp
 *  com.yandex.mobile.ads.impl.s20
 *  com.yandex.mobile.ads.impl.t20
 *  com.yandex.mobile.ads.impl.t61
 *  com.yandex.mobile.ads.impl.u23
 *  com.yandex.mobile.ads.impl.z00
 *  com.yandex.mobile.ads.impl.z20
 */
package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.yandex.div.R;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.view2.Div2View;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.f10;
import com.yandex.mobile.ads.impl.g30;
import com.yandex.mobile.ads.impl.nr;
import com.yandex.mobile.ads.impl.pp;
import com.yandex.mobile.ads.impl.qp;
import com.yandex.mobile.ads.impl.rp;
import com.yandex.mobile.ads.impl.s20;
import com.yandex.mobile.ads.impl.t20;
import com.yandex.mobile.ads.impl.t61;
import com.yandex.mobile.ads.impl.u23;
import com.yandex.mobile.ads.impl.wp1;
import com.yandex.mobile.ads.impl.z00;
import com.yandex.mobile.ads.impl.z20;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class r20
implements rp {
    @NotNull
    private final t61 a;
    @NotNull
    private final nr b;
    @NotNull
    private final wp1 c;
    @NotNull
    private final z20 d;
    @NotNull
    private final g30 e;
    @Nullable
    private Dialog f;

    @JvmOverloads
    public r20(@NotNull t61 t612, @NotNull nr nr2, @NotNull wp1 wp12, @NotNull z20 z202, @NotNull g30 g302) {
        this.a = t612;
        this.b = nr2;
        this.c = wp12;
        this.d = z202;
        this.e = g302;
    }

    private static final void a(r20 r202, DialogInterface dialogInterface) {
        r202.f = null;
    }

    public static /* synthetic */ void b(r20 r202, DialogInterface dialogInterface) {
        r20.a(r202, dialogInterface);
    }

    public final void a() {
        Dialog dialog = this.f;
        if (dialog != null) {
            f10.a((Dialog)dialog);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@NotNull Context object) {
        Throwable throwable2;
        block6: {
            Object object22;
            Object object3;
            block7: {
                block4: {
                    block5: {
                        try {
                            object3 = this.d;
                            object22 = this.a;
                            object3.getClass();
                            object22 = object22.d();
                            if (object22 == null) break block4;
                            for (Object object22 : object22) {
                                if (!y.e(((t20)object22).e(), z00.e.a())) continue;
                                break block5;
                            }
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                        object22 = null;
                    }
                    object22 = (t20)object22;
                    break block7;
                }
                object22 = null;
            }
            if (object22 == null) {
                this.b.e();
                return;
            }
            object3 = new s20(object, null);
            g30 g302 = this.e;
            object3 = object3.a();
            g302.getClass();
            Object object4 = new ContextThemeWrapper(object, R.style.Div);
            g302 = new Div2Context(object4, (DivConfiguration)object3, 0, null, 4, null);
            object3 = new Div2View((Div2Context)g302, null, 0, 6, null);
            object3.setTag((Object)"");
            g302 = new Dialog(object, R.style.MonetizationAdsInternal_FullscreenDialog);
            object = new u23(this);
            g302.setOnDismissListener((DialogInterface.OnDismissListener)object);
            object4 = new pp((Dialog)g302, this.b);
            object = new qp((pp)object4);
            object3.setActionHandler((DivActionHandler)object);
            object3.setData(object22.b(), object22.c());
            g302.setContentView((View)object3);
            this.f = g302;
            g302.show();
            return;
        }
        this.c.reportError("Failed to show DivKit close dialog", throwable2);
    }
}

