/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.monetization.ads.mediation.base.model.MediatedAdObjectInfo
 *  com.monetization.ads.quality.base.result.AdQualityVerificationResult
 *  com.monetization.ads.quality.base.result.AdQualityVerificationResult$NotImplemented
 *  com.yandex.mobile.ads.impl.b7
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.base.model.MediatedAdObjectInfo;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import com.yandex.mobile.ads.impl.b7;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.x2;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class g6
implements b7 {
    @Nullable
    public final Object a(@NotNull Context context, @NotNull Object object, @Nullable b8<?> b82, @NotNull x2 x22, @Nullable MediatedAdObjectInfo mediatedAdObjectInfo, @NotNull d<? super AdQualityVerificationResult> d10) {
        return AdQualityVerificationResult.NotImplemented.INSTANCE;
    }

    public final void onAdClicked() {
    }

    public final void onAdClosed() {
    }

    public final void onAdWillDisplay() {
    }

    public final void onInvalidated() {
    }
}

