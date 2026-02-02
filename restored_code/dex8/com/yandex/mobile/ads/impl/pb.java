/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.gf1
 *  com.yandex.mobile.ads.impl.ng0
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.qb
 *  com.yandex.mobile.ads.impl.sb
 *  com.yandex.mobile.ads.impl.wb
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.gf1;
import com.yandex.mobile.ads.impl.ng0;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.qb;
import com.yandex.mobile.ads.impl.sb;
import com.yandex.mobile.ads.impl.wb;
import com.yandex.mobile.ads.impl.yb;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class pb
implements ng0 {
    @NotNull
    private final gf1 a;
    @NotNull
    private final List<sb> b;
    @Nullable
    private qb c;

    public pb(@NotNull gf1 gf12) {
        this.a = gf12;
        this.b = this.a();
    }

    public static final /* synthetic */ gf1 a(pb pb2) {
        return pb2.a;
    }

    private final List<sb> a() {
        return t.e((Object)new yb("noInterestAd", (Runnable)new /* Unavailable Anonymous Inner Class!! */));
    }

    public final void a(int n10) {
        qb qb3;
        if (new wb().a(n10) && (qb3 = this.c) != null) {
            qb3.a();
        }
    }

    public final void a(@NotNull qb qb3) {
        this.c = qb3;
    }

    public final void a(@NotNull String string2) {
        try {
            Object object = new URI(string2);
            string2 = ((URI)object).getScheme();
            object = ((URI)object).getHost();
            for (sb sb3 : this.b) {
                if (!sb3.a(string2, (String)object)) continue;
                sb3.a();
                return;
            }
        }
        catch (URISyntaxException uRISyntaxException) {
            int n10 = op0.b;
        }
    }
}

