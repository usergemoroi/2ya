/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.quality.base.AdQualityVerificationStateFlow
 *  com.monetization.ads.quality.base.model.AdQualityVerificationBlockingReasons
 *  com.monetization.ads.quality.base.model.AdQualityVerificationError
 *  com.monetization.ads.quality.base.model.AdQualityVerificationMode
 *  com.monetization.ads.quality.base.state.AdQualityVerificationState
 *  com.monetization.ads.quality.base.state.AdQualityVerificationState$Blocked
 *  kotlin.collections.t
 *  kotlinx.coroutines.flow.q0
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.quality.base.AdQualityVerificationStateFlow;
import com.monetization.ads.quality.base.model.AdQualityVerificationBlockingReasons;
import com.monetization.ads.quality.base.model.AdQualityVerificationError;
import com.monetization.ads.quality.base.model.AdQualityVerificationMode;
import com.monetization.ads.quality.base.state.AdQualityVerificationState;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.q0;
import kotlinx.coroutines.flow.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class p6
implements AdQualityVerificationStateFlow {
    @NotNull
    private final AdQualityVerificationMode a;
    @NotNull
    private final AdQualityVerificationError b;
    @NotNull
    private final q0<AdQualityVerificationState> c;

    public p6(@NotNull AdQualityVerificationMode adQualityVerificationMode, @NotNull AdQualityVerificationError adQualityVerificationError) {
        this.a = adQualityVerificationMode;
        this.b = adQualityVerificationError;
        this.c = j.c(s0.a(new AdQualityVerificationState.Blocked(new AdQualityVerificationBlockingReasons(t.p((Object[])new String[]{"Ad is blocked by validation policy", adQualityVerificationError.getDescription()}), t.p((Object[])new String[]{"Ad is blocked by validation policy", adQualityVerificationError.getDescription()})))));
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof p6)) {
            return false;
        }
        object = (p6)object;
        if (this.a != ((p6)object).a) {
            return false;
        }
        return y.e(this.b, ((p6)object).b);
    }

    @NotNull
    public final AdQualityVerificationMode getVerificationMode() {
        return this.a;
    }

    @NotNull
    public final q0<AdQualityVerificationState> getVerificationResultStateFlow() {
        return this.c;
    }

    public final int hashCode() {
        int n10 = this.a.hashCode();
        return this.b.hashCode() + n10 * 31;
    }

    @NotNull
    public final String toString() {
        AdQualityVerificationMode adQualityVerificationMode = this.a;
        AdQualityVerificationError adQualityVerificationError = this.b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AdQualityVerificationStateFlowBlockedByPolicy(verificationMode=");
        stringBuilder.append(adQualityVerificationMode);
        stringBuilder.append(", error=");
        stringBuilder.append(adQualityVerificationError);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

