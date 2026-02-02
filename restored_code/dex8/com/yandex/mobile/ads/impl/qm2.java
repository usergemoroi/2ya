/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ss
 *  com.yandex.mobile.ads.impl.us
 *  com.yandex.mobile.ads.instream.InstreamAd
 *  com.yandex.mobile.ads.instream.InstreamAdBreak
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.rm2;
import com.yandex.mobile.ads.impl.ss;
import com.yandex.mobile.ads.impl.us;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdBreak;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class qm2
implements InstreamAd {
    @NotNull
    private final ss a;

    public qm2(@NotNull ss ss3) {
        this.a = ss3;
    }

    @NotNull
    public final ss a() {
        return this.a;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof qm2)) {
            return false;
        }
        object = (qm2)object;
        return y.e(this.a, ((qm2)object).a);
    }

    @NotNull
    public final List<InstreamAdBreak> getAdBreaks() {
        Object object = this.a.a();
        ArrayList<InstreamAdBreak> arrayList = new ArrayList<InstreamAdBreak>(t.x((Iterable)object, (int)10));
        object = object.iterator();
        while (object.hasNext()) {
            arrayList.add(new rm2((us)object.next()));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        ss ss3 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("YandexInstreamAd(coreInstreamAd=");
        stringBuilder.append(ss3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

