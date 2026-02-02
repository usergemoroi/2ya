/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ho1
 *  com.yandex.mobile.ads.impl.ip0
 *  com.yandex.mobile.ads.impl.v50
 *  com.yandex.mobile.ads.impl.yq1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ho1;
import com.yandex.mobile.ads.impl.ip0;
import com.yandex.mobile.ads.impl.v50;
import com.yandex.mobile.ads.impl.yq1;
import java.io.IOException;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

public final class br
implements ip0 {
    @NotNull
    public static final br a = new br();

    private br() {
    }

    @NotNull
    public final yq1 a(@NotNull ho1 ho12) throws IOException {
        y.h(ho12, "null cannot be cast to non-null type com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.http.RealInterceptorChain");
        return ho1.a((ho1)ho12, (int)0, (v50)ho12.b().a(ho12), null, (int)61).a(ho12.f());
    }
}

