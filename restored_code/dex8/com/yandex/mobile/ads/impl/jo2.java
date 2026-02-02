/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.o70
 *  com.yandex.mobile.ads.video.playback.model.VideoAdExtensions
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.o70;
import com.yandex.mobile.ads.video.playback.model.VideoAdExtensions;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class jo2
implements VideoAdExtensions {
    @NotNull
    private final List<o70> a;

    public jo2(@NotNull List<o70> list) {
        this.a = list;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof jo2)) {
            return false;
        }
        object = (jo2)object;
        return y.e(this.a, ((jo2)object).a);
    }

    @Nullable
    public final String get(@NotNull String string2) {
        Object var3_4;
        Object object;
        block3: {
            block2: {
                Iterator iterator = this.a.iterator();
                do {
                    boolean bl2 = iterator.hasNext();
                    var3_4 = null;
                    if (!bl2) break block2;
                } while (!y.e(((o70)(object = iterator.next())).a(), string2));
                string2 = object;
                break block3;
            }
            string2 = null;
        }
        object = (o70)string2;
        string2 = var3_4;
        if (object != null) {
            string2 = object.b();
        }
        return string2;
    }

    public final int hashCode() {
        return ((Object)this.a).hashCode();
    }

    @NotNull
    public final String toString() {
        List<o70> list = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("YandexVideoAdExtensions(extensions=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

