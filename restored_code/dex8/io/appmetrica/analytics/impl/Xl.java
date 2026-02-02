/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.telephony.SubscriptionInfo
 *  android.telephony.SubscriptionManager
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.impl.rl;
import io.appmetrica.analytics.impl.yl;
import io.appmetrica.analytics.impl.yq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c1\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a8\u0006\t"}, d2={"Lio/appmetrica/analytics/impl/xl;", "", "Landroid/content/Context;", "context", "", "Lio/appmetrica/analytics/impl/rl;", "a", "<init>", "()V", "analytics_binaryProdRelease"}, k=1, mv={1, 6, 0})
@TargetApi(value=23)
@DoNotInline
public final class xl {
    @NotNull
    public static final xl a = new xl();

    private xl() {
    }

    @JvmStatic
    @NotNull
    public static final List<rl> a(@NotNull Context object) {
        if ((object = (List)SystemServiceUtils.accessSystemServiceByNameSafely((Context)object, "telephony_subscription_service", "getting active subcription info list", "SubscriptionManager", new yq())) != null) {
            ArrayList<rl> arrayList = new ArrayList<rl>(t.x((Iterable)object, (int)10));
            Iterator iterator = object.iterator();
            while (true) {
                object = arrayList;
                if (iterator.hasNext()) {
                    Object object2 = (SubscriptionInfo)iterator.next();
                    object = AndroidUtils.isApiAchieved(29) ? yl.a((SubscriptionInfo)object2) : Integer.valueOf(object2.getMcc());
                    Integer n10 = AndroidUtils.isApiAchieved(29) ? yl.b((SubscriptionInfo)object2) : Integer.valueOf(object2.getMnc());
                    int n13 = object2.getDataRoaming();
                    boolean bl2 = true;
                    if (n13 != 1) {
                        bl2 = false;
                    }
                    object2 = object2.getCarrierName();
                    object2 = object2 != null ? object2.toString() : null;
                    arrayList.add(new rl((Integer)object, n10, bl2, (String)object2));
                    continue;
                }
                break;
            }
        } else {
            object = t.m();
        }
        return object;
    }

    private static final List a(SubscriptionManager subscriptionManager) {
        return subscriptionManager.getActiveSubscriptionInfoList();
    }

    public static /* synthetic */ List b(SubscriptionManager subscriptionManager) {
        return xl.a(subscriptionManager);
    }
}

