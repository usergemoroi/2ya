/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.applovin.mediation.MaxAd
 *  com.applovin.mediation.MaxAdFormat
 *  com.applovin.sdk.AppLovinSdk
 *  kotlin.collections.l
 *  kotlin.collections.s0
 */
package io.appmetrica.analytics.adrevenue.applovin.v12.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import io.appmetrica.analytics.adrevenue.applovin.v12.impl.a;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Currency;
import java.util.Map;
import kotlin.collections.l;
import kotlin.collections.s0;
import kotlin.jvm.internal.y;
import kotlin.t;
import kotlin.z;
import org.jetbrains.annotations.NotNull;

public final class b
implements ModuleAdRevenueProcessor {
    public final a a;
    public final ClientContext b;

    public b(@NotNull a a14, @NotNull ClientContext clientContext) {
        this.a = a14;
        this.b = clientContext;
    }

    @Override
    @NotNull
    public final String getDescription() {
        return "AppLovin";
    }

    @Override
    public final boolean process(Object ... objectArray) {
        block4: {
            block5: {
                Object object;
                Object object2;
                Object object3;
                Object object4;
                MaxAd maxAd;
                Object object5;
                block7: {
                    block6: {
                        if (!ReflectionUtils.isArgumentsOfClasses(objectArray, MaxAd.class, AppLovinSdk.class)) {
                            return false;
                        }
                        object5 = l.s0((Object[])objectArray, (int)0);
                        if (object5 == null) break block4;
                        maxAd = (MaxAd)object5;
                        object5 = l.s0((Object[])objectArray, (int)1);
                        if (object5 == null) break block5;
                        object4 = (AppLovinSdk)object5;
                        this.a.getClass();
                        object5 = maxAd.getFormat();
                        object5 = object5 == null ? null : (y.e(object5, MaxAdFormat.NATIVE) ? ModuleAdType.NATIVE : (y.e(object5, MaxAdFormat.BANNER) ? ModuleAdType.BANNER : (y.e(object5, MaxAdFormat.REWARDED) ? ModuleAdType.REWARDED : (y.e(object5, MaxAdFormat.INTERSTITIAL) ? ModuleAdType.INTERSTITIAL : (y.e(object5, MaxAdFormat.MREC) ? ModuleAdType.MREC : ModuleAdType.OTHER)))));
                        object3 = z.a("countryCode", object4.getConfiguration().getCountryCode());
                        object2 = z.a("original_source", "ad-revenue-applovin-v12");
                        object4 = maxAd.getFormat();
                        if (object4 == null) break block6;
                        object4 = object = object4.getLabel();
                        if (object != null) break block7;
                    }
                    object4 = "null";
                }
                object = s0.m((t[])new t[]{object3, object2, z.a("original_ad_type", object4), z.a("source", "applovin")});
                object4 = BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefault(maxAd.getRevenue(), 0.0));
                Currency currency = Currency.getInstance("USD");
                String string2 = maxAd.getNetworkName();
                object3 = maxAd.getAdUnitId();
                object2 = maxAd.getPlacement();
                object5 = new ModuleAdRevenue((BigDecimal)object4, currency, (ModuleAdType)((Object)object5), string2, (String)object3, null, maxAd.getNetworkPlacement(), (String)object2, maxAd.getRevenuePrecision(), (Map)object, false, 32, null);
                this.b.getInternalClientModuleFacade().reportAdRevenue((ModuleAdRevenue)object5);
                object4 = LoggerStorage.getMainPublicOrAnonymousLogger();
                object5 = new StringBuilder("Ad Revenue from AppLovin with values ");
                ((StringBuilder)object5).append(Arrays.toString(objectArray));
                ((StringBuilder)object5).append(" was reported");
                ((BaseReleaseLogger)object4).info(((StringBuilder)object5).toString(), new Object[0]);
                return true;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.applovin.sdk.AppLovinSdk");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.applovin.mediation.MaxAd");
    }
}

