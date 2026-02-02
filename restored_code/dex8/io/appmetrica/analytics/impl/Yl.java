/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.telephony.SubscriptionInfo
 */
package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.telephony.SubscriptionInfo;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import io.appmetrica.analytics.impl.ar;
import io.appmetrica.analytics.impl.zq;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\b\u0007\u0010\u0006\u00a8\u0006\n"}, d2={"Lio/appmetrica/analytics/impl/yl;", "", "Landroid/telephony/SubscriptionInfo;", "subscriptionInfo", "", "a", "(Landroid/telephony/SubscriptionInfo;)Ljava/lang/Integer;", "b", "<init>", "()V", "analytics_binaryProdRelease"}, k=1, mv={1, 6, 0})
@TargetApi(value=29)
@DoNotInline
public final class yl {
    @NotNull
    public static final yl a = new yl();

    private yl() {
    }

    @JvmStatic
    @Nullable
    public static final Integer a(@NotNull SubscriptionInfo subscriptionInfo) {
        return ParseUtils.intValueOf(zq.a(subscriptionInfo));
    }

    @JvmStatic
    @Nullable
    public static final Integer b(@NotNull SubscriptionInfo subscriptionInfo) {
        return ParseUtils.intValueOf(ar.a(subscriptionInfo));
    }
}

