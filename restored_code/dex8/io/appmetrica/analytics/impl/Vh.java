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
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.impl.Gh;
import io.appmetrica.analytics.impl.L7;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.hc;
import io.appmetrica.analytics.networktasks.internal.AdvIdWithLimitedAppender;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import io.appmetrica.analytics.networktasks.internal.NetworkTaskForSendingDataParamsAppender;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;

public final class vh
implements IParamsAppender {
    public final AdvIdWithLimitedAppender a;
    public final NetworkTaskForSendingDataParamsAppender b;
    public L7 c;
    public final hc d;
    public long e;

    public vh(AdvIdWithLimitedAppender advIdWithLimitedAppender, NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender, hc hc3) {
        this.a = advIdWithLimitedAppender;
        this.b = networkTaskForSendingDataParamsAppender;
        this.d = hc3;
    }

    public vh(@NonNull RequestBodyEncrypter requestBodyEncrypter) {
        this(new AdvIdWithLimitedAppender(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter), new hc());
    }

    public static void a(Uri.Builder builder, String string2, String string3) {
        if (!TextUtils.isEmpty((CharSequence)string3)) {
            builder.appendQueryParameter(string2, string3);
        }
    }

    public final void a(long l10) {
        this.e = l10;
    }

    public final void a(@NonNull Uri.Builder builder, @NonNull Gh object) {
        builder.path("report");
        this.b.appendEncryptedData(builder);
        L7 l74 = this.c;
        if (l74 != null) {
            builder.appendQueryParameter("deviceid", StringUtils.ifIsEmptyToDef(l74.a, ((BaseRequestConfig)object).getDeviceId()));
            builder.appendQueryParameter("uuid", StringUtils.ifIsEmptyToDef(this.c.b, ((BaseRequestConfig)object).getUuid()));
            vh.a(builder, "analytics_sdk_version_name", this.c.c);
            builder.appendQueryParameter("app_version_name", StringUtils.ifIsEmptyToDef(this.c.f, ((BaseRequestConfig)object).getAppVersion()));
            builder.appendQueryParameter("app_build_number", StringUtils.ifIsEmptyToDef(this.c.h, ((BaseRequestConfig)object).getAppBuildNumber()));
            builder.appendQueryParameter("os_version", StringUtils.ifIsEmptyToDef(this.c.i, ((BaseRequestConfig)object).getOsVersion()));
            vh.a(builder, "os_api_level", this.c.j);
            vh.a(builder, "analytics_sdk_build_number", this.c.d);
            vh.a(builder, "analytics_sdk_build_type", this.c.e);
            vh.a(builder, "app_debuggable", this.c.g);
            builder.appendQueryParameter("locale", StringUtils.ifIsEmptyToDef(this.c.k, ((BaseRequestConfig)object).getLocale()));
            builder.appendQueryParameter("is_rooted", StringUtils.ifIsEmptyToDef(this.c.l, ((BaseRequestConfig)object).getDeviceRootStatus()));
            builder.appendQueryParameter("app_framework", StringUtils.ifIsEmptyToDef(this.c.m, ((BaseRequestConfig)object).getAppFramework()));
            vh.a(builder, "attribution_id", this.c.n);
        }
        builder.appendQueryParameter("api_key_128", ((Gh)object).m);
        builder.appendQueryParameter("app_id", ((BaseRequestConfig)object).getPackageName());
        builder.appendQueryParameter("app_platform", ((BaseRequestConfig)object).getAppPlatform());
        builder.appendQueryParameter("model", ((BaseRequestConfig)object).getModel());
        builder.appendQueryParameter("manufacturer", ((BaseRequestConfig)object).getManufacturer());
        builder.appendQueryParameter("screen_width", String.valueOf(((BaseRequestConfig)object).getScreenWidth()));
        builder.appendQueryParameter("screen_height", String.valueOf(((BaseRequestConfig)object).getScreenHeight()));
        builder.appendQueryParameter("screen_dpi", String.valueOf(((BaseRequestConfig)object).getScreenDpi()));
        builder.appendQueryParameter("scalefactor", String.valueOf(((BaseRequestConfig)object).getScaleFactor()));
        builder.appendQueryParameter("device_type", ((BaseRequestConfig)object).getDeviceType());
        vh.a(builder, "clids_set", WrapUtils.getOrDefault(((Gh)object).p, ""));
        builder.appendQueryParameter("app_set_id", ((BaseRequestConfig)object).getAppSetId());
        builder.appendQueryParameter("app_set_id_scope", ((BaseRequestConfig)object).getAppSetIdScope());
        object = this.a;
        this.d.getClass();
        ((AdvIdWithLimitedAppender)object).appendParams(builder, Na.F.b().getIdentifiers());
        builder.appendQueryParameter("request_id", String.valueOf(this.e));
    }

    public final void a(@NonNull L7 l74) {
        this.c = l74;
    }
}

