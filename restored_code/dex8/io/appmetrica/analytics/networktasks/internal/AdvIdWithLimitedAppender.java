/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri$Builder
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;

public class AdvIdWithLimitedAppender
implements IParamsAppender<AdvertisingIdsHolder> {
    private static void a(Uri.Builder builder, String object, String string2, AdTrackingInfo adTrackingInfo) {
        String string3 = "";
        if (adTrackingInfo == null) {
            builder.appendQueryParameter((String)object, "");
            builder.appendQueryParameter(string2, "");
        } else {
            builder.appendQueryParameter((String)object, StringUtils.emptyIfNull(adTrackingInfo.advId));
            object = adTrackingInfo.limitedAdTracking;
            object = object == null ? string3 : (((Boolean)object).booleanValue() ? "1" : "0");
            builder.appendQueryParameter(string2, (String)object);
        }
    }

    @Override
    public void appendParams(@NonNull Uri.Builder builder, @Nullable AdvertisingIdsHolder object) {
        Object var4_3 = null;
        AdTrackingInfo adTrackingInfo = object == null ? null : ((AdvertisingIdsHolder)object).getGoogle().mAdTrackingInfo;
        AdvIdWithLimitedAppender.a(builder, "adv_id", "limit_ad_tracking", adTrackingInfo);
        adTrackingInfo = object == null ? null : ((AdvertisingIdsHolder)object).getHuawei().mAdTrackingInfo;
        AdvIdWithLimitedAppender.a(builder, "oaid", "limit_oaid_tracking", adTrackingInfo);
        object = object == null ? var4_3 : ((AdvertisingIdsHolder)object).getYandex().mAdTrackingInfo;
        AdvIdWithLimitedAppender.a(builder, "yandex_adv_id", "limit_yandex_adv_id_tracking", (AdTrackingInfo)object);
    }
}

