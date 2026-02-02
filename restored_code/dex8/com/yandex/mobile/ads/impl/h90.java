/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.ca0
 *  com.yandex.mobile.ads.impl.yk1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.c02;
import com.yandex.mobile.ads.impl.ca0;
import com.yandex.mobile.ads.impl.yk1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class h90
extends ca0 {
    @NotNull
    private final c02 a;
    @NotNull
    private final b8<String> b;
    @NotNull
    private final List<yk1> c;

    public h90(@NotNull c02 c022, @NotNull b8 b82, @NotNull ArrayList arrayList) {
        super(0);
        this.a = c022;
        this.b = b82;
        this.c = arrayList;
    }

    @NotNull
    public final b8<String> a() {
        return this.b;
    }

    @NotNull
    public final List<yk1> b() {
        return this.c;
    }

    @NotNull
    public final c02 c() {
        return this.a;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof h90)) {
            return false;
        }
        object = (h90)((Object)object);
        if (!y.e(this.a, ((h90)((Object)object)).a)) {
            return false;
        }
        if (!y.e(this.b, ((h90)((Object)object)).b)) {
            return false;
        }
        return y.e(this.c, ((h90)((Object)object)).c);
    }

    public final int hashCode() {
        int n10 = this.a.hashCode();
        int n12 = this.b.hashCode();
        return ((Object)this.c).hashCode() + (n12 + n10 * 31) * 31;
    }

    @NotNull
    public final String toString() {
        c02 c022 = this.a;
        b8<String> b82 = this.b;
        List<yk1> list = this.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeedItem(sliderAd=");
        stringBuilder.append(c022);
        stringBuilder.append(", adResponse=");
        stringBuilder.append(b82);
        stringBuilder.append(", preloadedDivKitDesigns=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

