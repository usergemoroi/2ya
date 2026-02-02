/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.zi2
 *  com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.zi2;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class dn2
implements zi2 {
    @NotNull
    private final InstreamAdRequestConfiguration a;

    public dn2(@NotNull InstreamAdRequestConfiguration instreamAdRequestConfiguration) {
        this.a = instreamAdRequestConfiguration;
    }

    @NotNull
    public final String a() {
        return this.a.getCategoryId();
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof dn2)) {
            return false;
        }
        object = (dn2)object;
        return y.e(this.a, ((dn2)object).a);
    }

    @NotNull
    public final String getPageId() {
        return this.a.getPageId();
    }

    @NotNull
    public final Map<String, String> getParameters() {
        Map<String, String> map2;
        Map<String, String> map3 = map2 = this.a.getParameters();
        if (map2 == null) {
            map3 = Collections.emptyMap();
        }
        return map3;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        InstreamAdRequestConfiguration instreamAdRequestConfiguration = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("YandexInstreamAdRequestConfigurationAdapter(adRequestConfiguration=");
        stringBuilder.append(instreamAdRequestConfiguration);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

