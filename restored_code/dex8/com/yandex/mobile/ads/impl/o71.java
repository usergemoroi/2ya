/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.b81
 *  com.yandex.mobile.ads.impl.fa
 *  com.yandex.mobile.ads.impl.ou1
 *  com.yandex.mobile.ads.impl.pw1
 *  com.yandex.mobile.ads.impl.pw1$a
 *  com.yandex.mobile.ads.impl.u92$a
 *  com.yandex.mobile.ads.impl.y71
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.b81;
import com.yandex.mobile.ads.impl.fa;
import com.yandex.mobile.ads.impl.ou1;
import com.yandex.mobile.ads.impl.pw1;
import com.yandex.mobile.ads.impl.u92;
import com.yandex.mobile.ads.impl.y71;
import org.jetbrains.annotations.NotNull;

public final class o71
implements fa {
    @NotNull
    private final Context a;
    @NotNull
    private final b81 b;
    @NotNull
    private final y71 c;
    @NotNull
    private final pw1 d;

    public /* synthetic */ o71(Context context, b81 b812, y71 y712) {
        int n10 = pw1.l;
        this(context, b812, y712, pw1.a.a());
    }

    public o71(@NotNull Context context, @NotNull b81 b812, @NotNull y71 y712, @NotNull pw1 pw12) {
        this.a = context;
        this.b = b812;
        this.c = y712;
        this.d = pw12;
    }

    public final boolean a() {
        boolean bl2;
        this.c.getClass();
        ou1 ou12 = this.d.a(this.a);
        boolean bl3 = bl2 = true;
        if (ou12 != null) {
            bl3 = bl2;
            if (ou12.z0()) {
                bl3 = this.b.a(false).c() == u92.a.c ? bl2 : false;
            }
        }
        return bl3;
    }
}

