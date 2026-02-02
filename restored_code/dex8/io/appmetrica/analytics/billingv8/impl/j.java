/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.BillingResult
 *  com.android.billingclient.api.ProductDetails
 *  com.android.billingclient.api.Purchase
 */
package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billingv8.impl.k;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.y;

public final class j
extends SafeRunnable {
    public final k a;
    public final BillingResult b;
    public final List c;

    public j(k k11, BillingResult billingResult, List list) {
        this.a = k11;
        this.b = billingResult;
        this.c = list;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public final void runSafety() {
        block15: {
            block14: {
                var11_1 = this.a;
                var9_2 = this.b;
                var8_3 /* !! */  = this.c;
                var11_1.getClass();
                if (var9_2.getResponseCode() == 0) break block14;
                var11_1.f.onUpdateFinished();
                break block15;
            }
            var12_4 = new LinkedHashMap<String, Purchase>();
            var9_2 = var8_3 /* !! */ .iterator();
            while (var9_2.hasNext()) {
                var10_5 = (Purchase)var9_2.next();
                var8_3 /* !! */  = var10_5.getProducts().iterator();
                while (var8_3 /* !! */ .hasNext()) {
                    var12_4.put((String)var8_3 /* !! */ .next(), (Purchase)var10_5);
                }
            }
            var8_3 /* !! */  = var11_1.c;
            var13_6 = new LinkedHashMap<String, Object>();
            var8_3 /* !! */  = var8_3 /* !! */ .iterator();
            while (var8_3 /* !! */ .hasNext()) {
                var9_2 = (Purchase)var8_3 /* !! */ .next();
                var10_5 = var9_2.getProducts().iterator();
                while (var10_5.hasNext()) {
                    var13_6.put((String)var10_5.next(), var9_2);
                }
            }
            var8_3 /* !! */  = var11_1.d;
            var14_7 = new ArrayList<ProductInfo>();
            var15_8 = var8_3 /* !! */ .iterator();
            while (var15_8.hasNext()) {
                block19: {
                    block16: {
                        block18: {
                            block17: {
                                var9_2 = (ProductDetails)var15_8.next();
                                var17_15 = (Purchase)var13_6.get(var9_2.getProductId());
                                if (var17_15 == null) ** GOTO lbl-1000
                                var16_14 = (Purchase)var12_4.get(var9_2.getProductId());
                                var8_3 /* !! */  = var9_2.getProductType();
                                var1_9 = var8_3 /* !! */ .hashCode();
                                var2_10 = false;
                                var3_11 = false;
                                if (var1_9 == 3541555) break block16;
                                if (var1_9 != 100343516 || !var8_3 /* !! */ .equals("inapp")) ** GOTO lbl-1000
                                var8_3 /* !! */  = var9_2.getProductType();
                                var8_3 /* !! */  = y.e(var8_3 /* !! */ , "inapp") ? ProductType.INAPP : (y.e(var8_3 /* !! */ , "subs") ? ProductType.SUBS : ProductType.UNKNOWN);
                                var18_16 = var9_2.getProductId();
                                var1_9 = var17_15.getQuantity();
                                var10_5 = var9_2.getOneTimePurchaseOfferDetails();
                                var4_12 = var10_5 != null ? var10_5.getPriceAmountMicros() : 0L;
                                var9_2 = var9_2.getOneTimePurchaseOfferDetails();
                                if (var9_2 == null) break block17;
                                var9_2 = var10_5 = var9_2.getPriceCurrencyCode();
                                if (var10_5 != null) break block18;
                            }
                            var9_2 = "";
                        }
                        var20_18 = var17_15.getSignature();
                        var19_17 = var17_15.getPurchaseToken();
                        var6_13 = var17_15.getPurchaseTime();
                        var2_10 = var3_11;
                        if (var16_14 != null) {
                            var2_10 = var16_14.isAutoRenewing();
                        }
                        if (var16_14 == null || (var10_5 = var16_14.getOriginalJson()) == null) {
                            var10_5 = "{}";
                        }
                        var8_3 /* !! */  = new ProductInfo((ProductType)var8_3 /* !! */ , var18_16, var1_9, var4_12, (String)var9_2, 0L, null, 1, null, var20_18, var19_17, var6_13, var2_10, (String)var10_5);
                        break block19;
                    }
                    if (var8_3 /* !! */ .equals("subs")) {
                        var8_3 /* !! */  = var9_2.getProductType();
                        var8_3 /* !! */  = y.e(var8_3 /* !! */ , "inapp") ? ProductType.INAPP : (y.e(var8_3 /* !! */ , "subs") ? ProductType.SUBS : ProductType.UNKNOWN);
                        var19_17 = var9_2.getProductId();
                        var1_9 = var17_15.getQuantity();
                        var10_5 = var17_15.getSignature();
                        var18_16 = var17_15.getPurchaseToken();
                        var4_12 = var17_15.getPurchaseTime();
                        if (var16_14 != null) {
                            var2_10 = var16_14.isAutoRenewing();
                        }
                        if (var16_14 == null || (var9_2 = var16_14.getOriginalJson()) == null) {
                            var9_2 = "{}";
                        }
                        var8_3 /* !! */  = new ProductInfo((ProductType)var8_3 /* !! */ , var19_17, var1_9, 0L, "", 0L, null, 1, null, (String)var10_5, var18_16, var4_12, var2_10, (String)var9_2);
                    } else // 3 sources

                    {
                        var8_3 /* !! */  = null;
                    }
                }
                if (var8_3 /* !! */  == null) continue;
                var14_7.add((ProductInfo)var8_3 /* !! */ );
            }
            var11_1.a.getBillingInfoSender().sendInfo(var14_7);
            var11_1.b.invoke();
            var11_1.f.onUpdateFinished();
        }
        var8_3 /* !! */  = this.a;
        var8_3 /* !! */ .e.a(var8_3 /* !! */ );
    }
}

