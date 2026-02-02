/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ironsource.mediationsdk.impressionData.ImpressionData
 *  com.ironsource.mediationsdk.impressionData.ImpressionDataListener
 */
package io.appmetrica.analytics.adrevenue.ironsource.v7.impl;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import io.appmetrica.analytics.adrevenue.ironsource.v7.impl.a;
import io.appmetrica.analytics.adrevenue.ironsource.v7.impl.b;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;
import java.math.BigDecimal;
import java.util.Currency;

public final class c
implements ImpressionDataListener {
    public final ClientContext a;
    public final b b = new b();

    public c(ClientContext clientContext) {
        this.a = clientContext;
    }

    public final void onImpressionSuccess(ImpressionData impressionData) {
        if (impressionData != null) {
            ModuleAdType moduleAdType;
            InternalClientModuleFacade internalClientModuleFacade = this.a.getInternalClientModuleFacade();
            this.b.getClass();
            String string2 = impressionData.getAdUnit();
            BigDecimal bigDecimal = BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefault(impressionData.getRevenue(), 0.0));
            Currency currency = Currency.getInstance("USD");
            if (string2 == null) {
                moduleAdType = null;
            } else {
                int n10 = string2.hashCode();
                int n13 = -1;
                switch (n10) {
                    default: {
                        break;
                    }
                    case 1982491468: {
                        if (!string2.equals("Banner")) break;
                        n13 = 2;
                        break;
                    }
                    case 769047372: {
                        if (!string2.equals("Interstitial")) break;
                        n13 = 1;
                        break;
                    }
                    case 95784425: {
                        if (!string2.equals("Rewarded Video")) break;
                        n13 = 0;
                    }
                }
                switch (n13) {
                    default: {
                        moduleAdType = ModuleAdType.OTHER;
                        break;
                    }
                    case 2: {
                        moduleAdType = ModuleAdType.BANNER;
                        break;
                    }
                    case 1: {
                        moduleAdType = ModuleAdType.INTERSTITIAL;
                        break;
                    }
                    case 0: {
                        moduleAdType = ModuleAdType.REWARDED;
                        break;
                    }
                }
            }
            internalClientModuleFacade.reportAdRevenue(new ModuleAdRevenue(bigDecimal, currency, moduleAdType, impressionData.getAdNetwork(), null, null, null, impressionData.getPlacement(), impressionData.getPrecision(), new a(string2), true));
        }
    }
}

