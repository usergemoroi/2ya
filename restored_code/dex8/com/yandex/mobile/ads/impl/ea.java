/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.yandex.mobile.ads.impl.ei2
 *  com.yandex.mobile.ads.impl.i71
 *  com.yandex.mobile.ads.impl.jh2
 *  com.yandex.mobile.ads.impl.ko
 *  com.yandex.mobile.ads.impl.lo
 *  com.yandex.mobile.ads.impl.qr0
 *  com.yandex.mobile.ads.impl.vf
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.ei2;
import com.yandex.mobile.ads.impl.i71;
import com.yandex.mobile.ads.impl.jh2;
import com.yandex.mobile.ads.impl.ko;
import com.yandex.mobile.ads.impl.lo;
import com.yandex.mobile.ads.impl.qr0;
import com.yandex.mobile.ads.impl.vf;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ea
implements jh2 {
    @NotNull
    private final i71 a;
    @NotNull
    private final lo b;
    @Nullable
    private final qr0 c;
    @NotNull
    private final ei2 d;

    @JvmOverloads
    public ea(@NotNull i71 i712, @NotNull lo lo3, @Nullable qr0 qr02, @NotNull ei2 ei22) {
        this.a = i712;
        this.b = lo3;
        this.c = qr02;
        this.d = ei22;
    }

    public final void a(@NotNull View view, @NotNull vf object) {
        if (view.getTag() == null) {
            ei2 ei22 = this.d;
            object = object.b();
            ei22.getClass();
            view.setTag((Object)ei2.a((String)object));
        }
    }

    public final void a(@NotNull vf<?> vf3, @NotNull ko ko3) {
        qr0 qr02;
        qr0 qr03 = qr02 = vf3.a();
        if (qr02 == null) {
            qr03 = this.c;
        }
        this.b.a(vf3, qr03, this.a, ko3);
    }
}

