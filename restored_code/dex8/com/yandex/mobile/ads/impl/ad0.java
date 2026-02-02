/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.fg0
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.og0
 *  com.yandex.mobile.ads.impl.ou1
 *  com.yandex.mobile.ads.impl.pw1
 *  com.yandex.mobile.ads.impl.pw1$a
 *  com.yandex.mobile.ads.impl.tr
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.z62
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.fg0;
import com.yandex.mobile.ads.impl.g8;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.og0;
import com.yandex.mobile.ads.impl.ou1;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.q1;
import com.yandex.mobile.ads.impl.tc0;
import com.yandex.mobile.ads.impl.tr;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.z62;
import com.yandex.mobile.ads.impl.zf1;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ad0
implements og0 {
    @NotNull
    private final b8<String> a;
    @Nullable
    private final ou1 b;
    @NotNull
    private final fg0 c;
    @NotNull
    private final q1 d;
    @Nullable
    private tr e;
    @Nullable
    private z62 f;
    private boolean g;

    public /* synthetic */ ad0(Context context, gv1 gv12, x2 x22, b8 b82, g8 g84) {
        int n10 = pw1.l;
        this(context, gv12, x22, (b8<String>)b82, g84, pw1.a.a().a(context));
    }

    public ad0(@NotNull Context context, @NotNull gv1 gv12, @NotNull x2 x22, @NotNull b8<String> b82, @NotNull g8 g84, @Nullable ou1 ou12) {
        this.a = b82;
        this.b = ou12;
        this.c = new fg0(context, x22);
        this.d = new q1(context, b82, g84, gv12, x22);
    }

    public final void a() {
        this.g = true;
    }

    public final void a(@NotNull f3 f33) {
        tr tr3 = this.e;
        if (tr3 != null) {
            tr3.a(f33);
        }
    }

    public final void a(@Nullable tc0 tc02) {
        this.f = tc02;
    }

    public final void a(@Nullable tr tr3) {
        this.e = tr3;
    }

    public final void a(@NotNull zf1 zf12, @NotNull Map map2) {
        zf12 = this.f;
        if (zf12 != null) {
            zf12.a(map2);
        }
        if ((zf12 = this.e) != null) {
            zf12.a();
        }
    }

    public final void a(@NotNull String string2) {
        ou1 ou12 = this.b;
        if (ou12 == null || !ou12.Y() || this.g) {
            this.c.a(string2, this.a, this.d);
            this.g = false;
        }
    }

    public final void a(boolean bl2) {
    }
}

