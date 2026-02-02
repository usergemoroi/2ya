/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.coreapi.internal.identifiers;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

public class AdTrackingInfoResult {
    @Nullable
    public final AdTrackingInfo mAdTrackingInfo;
    @Nullable
    public final String mErrorExplanation;
    @NonNull
    public final IdentifierStatus mStatus;

    public AdTrackingInfoResult() {
        this(null, IdentifierStatus.UNKNOWN, "identifier info has never been updated");
    }

    public AdTrackingInfoResult(@Nullable AdTrackingInfo adTrackingInfo, @NonNull IdentifierStatus identifierStatus, @Nullable String string2) {
        this.mAdTrackingInfo = adTrackingInfo;
        this.mStatus = identifierStatus;
        this.mErrorExplanation = string2;
    }

    @NonNull
    public static AdTrackingInfoResult getProviderUnavailableResult(@NonNull String string2) {
        return new AdTrackingInfoResult(null, IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, string2);
    }

    public boolean isValid() {
        AdTrackingInfo adTrackingInfo = this.mAdTrackingInfo;
        boolean bl2 = adTrackingInfo != null && !TextUtils.isEmpty((CharSequence)adTrackingInfo.advId);
        return bl2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AdTrackingInfoResult{mAdTrackingInfo=");
        stringBuilder.append(this.mAdTrackingInfo);
        stringBuilder.append(", mStatus=");
        stringBuilder.append((Object)this.mStatus);
        stringBuilder.append(", mErrorExplanation='");
        stringBuilder.append(this.mErrorExplanation);
        stringBuilder.append("'}");
        return stringBuilder.toString();
    }
}

