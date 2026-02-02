/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  com.yandex.mobile.ads.impl.c92
 *  com.yandex.mobile.ads.impl.i42
 *  com.yandex.mobile.ads.impl.oq2
 *  com.yandex.mobile.ads.impl.sp1$b
 *  com.yandex.mobile.ads.impl.tt
 *  com.yandex.mobile.ads.impl.ut
 *  com.yandex.mobile.ads.impl.xp1
 */
package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.impl.c92;
import com.yandex.mobile.ads.impl.g8;
import com.yandex.mobile.ads.impl.i42;
import com.yandex.mobile.ads.impl.oq2;
import com.yandex.mobile.ads.impl.sp1;
import com.yandex.mobile.ads.impl.tt;
import com.yandex.mobile.ads.impl.ut;
import com.yandex.mobile.ads.impl.xp1;
import java.util.HashMap;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class av
implements i42 {
    @NotNull
    private final tt a;
    @NotNull
    private final g8 b;
    @NotNull
    private final Handler c;

    @JvmOverloads
    public av(@NotNull tt tt2, @NotNull g8 g84, @NotNull Handler handler) {
        this.a = tt2;
        this.b = g84;
        this.c = handler;
    }

    private static final void a(av av2, String string2) {
        a a12 = new a(av2);
        av2.a.a(string2, (ut)a12);
    }

    public static /* synthetic */ void b(av av2, String string2) {
        av.a(av2, string2);
    }

    public final void a(@NotNull xp1 xp12, @NotNull String string2) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("click_type", "custom");
        c92.a.getClass();
        hashMap.put("click_url", c92.a((String)string2));
        xp12.a(sp1.b.C, hashMap);
        this.c.post((Runnable)new oq2(this, string2));
    }

    private final class a
    implements ut {
        final av a;

        public a(av av2) {
            this.a = av2;
        }

        public final void onLeftApplication() {
            this.a.b.a(19, null);
        }

        public final void onReturnedToApplication() {
            this.a.b.a(20, null);
        }
    }
}

