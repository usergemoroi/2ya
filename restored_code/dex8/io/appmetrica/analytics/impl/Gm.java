/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri$Builder
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.Be;
import io.appmetrica.analytics.impl.Hk;
import io.appmetrica.analytics.impl.Jg;
import io.appmetrica.analytics.impl.Kd;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Pm;
import io.appmetrica.analytics.impl.Q3;
import io.appmetrica.analytics.impl.hc;
import io.appmetrica.analytics.impl.km;
import io.appmetrica.analytics.impl.m6;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class gm
implements IParamsAppender {
    public final Be a;
    public final Kd b;
    public final hc c;

    public gm(@NonNull Be be3, @NonNull Kd kd3) {
        this.a = be3;
        this.b = kd3;
        this.c = new hc();
    }

    public final void a(@NonNull Uri.Builder builder, @NonNull DataSendingRestrictionController object, @NonNull hc object2) {
        object2.getClass();
        object2 = Na.F.b().getIdentifiers();
        if (object2 != null && !object.isRestrictedForSdk()) {
            object = ((AdvertisingIdsHolder)object2).getGoogle();
            if (!((AdTrackingInfoResult)object).isValid()) {
                builder.appendQueryParameter(this.a.a("adv_id"), "");
            } else {
                builder.appendQueryParameter(this.a.a("adv_id"), ((AdTrackingInfoResult)object).mAdTrackingInfo.advId);
            }
            object = ((AdvertisingIdsHolder)object2).getHuawei();
            if (!((AdTrackingInfoResult)object).isValid()) {
                builder.appendQueryParameter(this.a.a("oaid"), "");
            } else {
                builder.appendQueryParameter(this.a.a("oaid"), ((AdTrackingInfoResult)object).mAdTrackingInfo.advId);
            }
            object = ((AdvertisingIdsHolder)object2).getYandex();
            if (!((AdTrackingInfoResult)object).isValid()) {
                builder.appendQueryParameter(this.a.a("yandex_adv_id"), "");
            } else {
                builder.appendQueryParameter(this.a.a("yandex_adv_id"), ((AdTrackingInfoResult)object).mAdTrackingInfo.advId);
            }
        } else {
            builder.appendQueryParameter(this.a.a("adv_id"), "");
            builder.appendQueryParameter(this.a.a("oaid"), "");
            builder.appendQueryParameter(this.a.a("yandex_adv_id"), "");
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void a(@NonNull Uri.Builder builder, @NonNull km object) {
        String string2;
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.a.a("deviceid"), ((BaseRequestConfig)((Object)object)).getDeviceId());
        this.a(builder, Na.F.g(), this.c);
        builder.appendQueryParameter(this.a.a("app_set_id"), ((BaseRequestConfig)((Object)object)).getAppSetId());
        builder.appendQueryParameter(this.a.a("app_set_id_scope"), ((BaseRequestConfig)((Object)object)).getAppSetIdScope());
        builder.appendQueryParameter(this.a.a("app_platform"), ((BaseRequestConfig)((Object)object)).getAppPlatform());
        builder.appendQueryParameter(this.a.a("protocol_version"), ((BaseRequestConfig)((Object)object)).getProtocolVersion());
        builder.appendQueryParameter(this.a.a("analytics_sdk_version_name"), ((BaseRequestConfig)((Object)object)).getAnalyticsSdkVersionName());
        builder.appendQueryParameter(this.a.a("model"), ((BaseRequestConfig)((Object)object)).getModel());
        builder.appendQueryParameter(this.a.a("manufacturer"), ((BaseRequestConfig)((Object)object)).getManufacturer());
        builder.appendQueryParameter(this.a.a("os_version"), ((BaseRequestConfig)((Object)object)).getOsVersion());
        builder.appendQueryParameter(this.a.a("screen_width"), String.valueOf(((BaseRequestConfig)((Object)object)).getScreenWidth()));
        builder.appendQueryParameter(this.a.a("screen_height"), String.valueOf(((BaseRequestConfig)((Object)object)).getScreenHeight()));
        builder.appendQueryParameter(this.a.a("screen_dpi"), String.valueOf(((BaseRequestConfig)((Object)object)).getScreenDpi()));
        builder.appendQueryParameter(this.a.a("scalefactor"), String.valueOf(((BaseRequestConfig)((Object)object)).getScaleFactor()));
        builder.appendQueryParameter(this.a.a("locale"), ((BaseRequestConfig)((Object)object)).getLocale());
        builder.appendQueryParameter(this.a.a("device_type"), ((BaseRequestConfig)((Object)object)).getDeviceType());
        builder.appendQueryParameter(this.a.a("queries"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("query_hosts"), String.valueOf(2));
        String string22 = this.a.a("features");
        List<String> list = ((Hk)this.b).h();
        String object22 = this.a.a("permissions_collecting");
        Object object2 = this.a.a("features_collecting");
        Object object3 = this.a.a("google_aid");
        String string3 = this.a.a("huawei_oaid");
        String string4 = this.a.a("sim_info");
        String string5 = this.a.a("ssl_pinning");
        list = new ArrayList<String>(list);
        ((ArrayList)list).addAll(Arrays.asList(object22, object2, object3, string3, string4, string5));
        builder.appendQueryParameter(string22, StringUtils.wrapFeatures(((ArrayList)list).toArray((String[])new String[0])));
        builder.appendQueryParameter(this.a.a("app_id"), ((BaseRequestConfig)((Object)object)).getPackageName());
        builder.appendQueryParameter(this.a.a("app_debuggable"), ((m6)((Object)object)).a);
        if (((km)((Object)object)).l) {
            String string6 = ((km)((Object)object)).m;
            if (!TextUtils.isEmpty((CharSequence)string6)) {
                builder.appendQueryParameter(this.a.a("country_init"), string6);
            }
        } else {
            builder.appendQueryParameter(this.a.a("detect_locale"), String.valueOf(1));
        }
        Q3 q34 = ((km)((Object)object)).i;
        if (!ro.a(q34.a)) {
            void var4_13;
            builder.appendQueryParameter(this.a.a("distribution_customization"), String.valueOf(1));
            object3 = Pm.a(q34.a);
            builder.appendQueryParameter(this.a.a("clids_set"), (String)object3);
            int n10 = q34.b.ordinal();
            if (n10 != 1) {
                if (n10 != 2) {
                    if (n10 != 3) {
                        String string7 = "";
                    } else {
                        String string8 = "retail";
                    }
                } else {
                    String string9 = "satellite";
                }
            } else {
                String string10 = "api";
            }
            builder.appendQueryParameter(this.a.a("clids_set_source"), (String)var4_13);
            string22 = ((km)((Object)object)).f;
            string4 = ((km)((Object)object)).g;
            object3 = string22;
            String string11 = string4;
            if (TextUtils.isEmpty((CharSequence)string22)) {
                object2 = ((km)((Object)object)).o.b;
                object3 = string22;
                String string12 = string4;
                if (object2 != null) {
                    object3 = ((Jg)object2).a;
                    String string13 = ((Jg)object2).d.a;
                }
            }
            if (!TextUtils.isEmpty((CharSequence)object3)) {
                void var4_17;
                builder.appendQueryParameter(this.a.a("install_referrer"), (String)object3);
                object3 = var4_17;
                if (var4_17 == null) {
                    object3 = "null";
                }
                builder.appendQueryParameter(this.a.a("install_referrer_source"), (String)object3);
            }
        }
        if (!TextUtils.isEmpty((CharSequence)(string2 = ((BaseRequestConfig)((Object)object)).getUuid()))) {
            builder.appendQueryParameter(this.a.a("uuid"), string2);
        }
        builder.appendQueryParameter(this.a.a("time"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("stat_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("retry_policy"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("cache_control"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("permissions_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("app_system_flag"), ((m6)((Object)object)).b);
        builder.appendQueryParameter(this.a.a("auto_inapp_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("attribution"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("startup_update"), String.valueOf(1));
        builder.appendQueryParameter(this.a.a("external_attribution"), String.valueOf(1));
        object3 = ((Hk)this.b).d();
        for (String string14 : object3.keySet()) {
            builder.appendQueryParameter(string14, String.valueOf(object3.get(string14)));
        }
    }
}

