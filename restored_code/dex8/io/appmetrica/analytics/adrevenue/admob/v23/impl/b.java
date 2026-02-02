/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.gms.ads.AdValue
 *  com.google.android.gms.ads.ResponseInfo
 */
package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.ResponseInfo;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

public final class b {
    public static ModuleAdRevenue a(AdValue object, ModuleAdType moduleAdType, String string2, ResponseInfo object2, String string3) {
        Object object3;
        double d14 = WrapUtils.getFiniteDoubleOrDefault((double)object.getValueMicros() / 1000000.0, 0.0);
        Object object4 = "PUBLISHER_PROVIDED";
        if (object2 != null && (object3 = object2.getLoadedAdapterResponseInfo()) != null) {
            object2 = BigDecimal.valueOf(d14);
            Currency currency = Currency.getInstance(object.getCurrencyCode());
            object4 = object3.getAdapterClassName();
            String string4 = object3.getAdSourceInstanceId();
            object3 = object3.getAdSourceInstanceName();
            int n10 = object.getPrecisionType();
            object = n10 == 0 ? "UNKNOWN" : (n10 == 1 ? "ESTIMATED" : (n10 == 2 ? "PUBLISHER_PROVIDED" : (n10 == 3 ? "PRECISE" : "")));
            HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("original_ad_type", string2);
            hashMap.put("original_source", "ad-revenue-admob-v23");
            hashMap.put("source", "admob");
            return new ModuleAdRevenue((BigDecimal)object2, currency, moduleAdType, (String)object4, string3, null, string4, (String)object3, (String)object, hashMap, false);
        }
        BigDecimal bigDecimal = BigDecimal.valueOf(d14);
        object2 = Currency.getInstance(object.getCurrencyCode());
        int n13 = object.getPrecisionType();
        object = n13 == 0 ? "UNKNOWN" : (n13 == 1 ? "ESTIMATED" : (n13 == 2 ? object4 : (n13 == 3 ? "PRECISE" : "")));
        object4 = new HashMap();
        ((HashMap)object4).put("original_ad_type", string2);
        ((HashMap)object4).put("original_source", "ad-revenue-admob-v23");
        ((HashMap)object4).put("source", "admob");
        return new ModuleAdRevenue(bigDecimal, (Currency)object2, moduleAdType, null, string3, null, null, null, (String)object, (Map<String, String>)object4, false);
    }
}

