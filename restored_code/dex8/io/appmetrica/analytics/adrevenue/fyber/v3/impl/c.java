/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.fyber.fairbid.ads.ImpressionData
 */
package io.appmetrica.analytics.adrevenue.fyber.v3.impl;

import androidx.annotation.NonNull;
import com.fyber.fairbid.ads.ImpressionData;
import io.appmetrica.analytics.adrevenue.fyber.v3.impl.a;
import io.appmetrica.analytics.adrevenue.fyber.v3.impl.b;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

public final class c
implements ModuleAdRevenueProcessor {
    public final b a;
    public final ClientContext b;

    public c(@NonNull b b11, @NonNull ClientContext clientContext) {
        this.a = b11;
        this.b = clientContext;
    }

    @Override
    @NonNull
    public final String getDescription() {
        return "Fyber";
    }

    @Override
    public final boolean process(Object ... object) {
        int n10;
        if (!ReflectionUtils.isArgumentsOfClasses(object, new Class[]{ImpressionData.class})) {
            return false;
        }
        Object object2 = (ImpressionData)object[0];
        InternalClientModuleFacade internalClientModuleFacade = this.b.getInternalClientModuleFacade();
        this.a.getClass();
        Object object3 = object2.getPlacementType();
        BigDecimal bigDecimal = BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefault(object2.getNetPayout(), 0.0));
        Currency currency = Currency.getInstance(object2.getCurrency());
        object = object3 == null ? null : ((n10 = io.appmetrica.analytics.adrevenue.fyber.v3.impl.a.a[object3.ordinal()]) != 1 ? (n10 != 2 ? (n10 != 3 ? ModuleAdType.OTHER : ModuleAdType.INTERSTITIAL) : ModuleAdType.REWARDED) : ModuleAdType.BANNER);
        String string2 = object2.getDemandSource();
        String string3 = object2.getCreativeId();
        String string4 = object2.getPriceAccuracy().toString();
        object2 = new HashMap();
        ((HashMap)object2).put("source", "fyber");
        ((HashMap)object2).put("original_source", "ad-revenue-fyber-v3");
        object3 = object3 == null ? "null" : object3.name();
        ((HashMap)object2).put("original_ad_type", object3);
        internalClientModuleFacade.reportAdRevenue(new ModuleAdRevenue(bigDecimal, currency, (ModuleAdType)((Object)object), string2, string3, null, null, null, string4, (Map<String, String>)object2, false));
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from Fyber was reported", new Object[0]);
        return true;
    }
}

