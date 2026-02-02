/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnDismissListener
 *  com.yandex.mobile.ads.impl.f10
 *  com.yandex.mobile.ads.impl.ks2
 *  com.yandex.mobile.ads.impl.nr
 */
package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.content.DialogInterface;
import com.yandex.mobile.ads.impl.f10;
import com.yandex.mobile.ads.impl.ks2;
import com.yandex.mobile.ads.impl.nr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class e10
implements nr {
    @Nullable
    private Dialog a;

    private static final void a(e10 e102, DialogInterface dialogInterface) {
        dialogInterface = e102.a;
        if (dialogInterface != null) {
            dialogInterface.setOnDismissListener(null);
        }
        e102.a = null;
    }

    public static /* synthetic */ void b(e10 e102, DialogInterface dialogInterface) {
        e10.a(e102, dialogInterface);
    }

    public final void a(@NotNull Dialog dialog) {
        this.a = dialog;
        dialog.setOnDismissListener((DialogInterface.OnDismissListener)new ks2(this));
    }

    public final void e() {
        Dialog dialog = this.a;
        if (dialog != null) {
            f10.a((Dialog)dialog);
        }
    }
}

