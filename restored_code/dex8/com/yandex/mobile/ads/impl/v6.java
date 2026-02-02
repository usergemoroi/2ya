/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.quality.base.model.AdQualityVerificationBlockingReasons
 *  com.yandex.mobile.ads.impl.w6
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.quality.base.model.AdQualityVerificationBlockingReasons;
import com.yandex.mobile.ads.impl.w6;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class v6
implements w6 {
    @NotNull
    private final AdQualityVerificationBlockingReasons a;

    public v6(@NotNull AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons) {
        this.a = adQualityVerificationBlockingReasons;
    }

    @NotNull
    public final AdQualityVerificationBlockingReasons a() {
        return this.a;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof v6)) {
            return false;
        }
        object = (v6)object;
        return y.e(this.a, ((v6)object).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        AdQualityVerificationBlockingReasons adQualityVerificationBlockingReasons = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AdQualityVerifierControllerBlockedResult(reasons=");
        stringBuilder.append(adQualityVerificationBlockingReasons);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

