/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.BillingClient
 *  com.android.billingclient.api.BillingResult
 *  com.android.billingclient.api.ProductDetailsResponseListener
 *  com.android.billingclient.api.Purchase
 *  com.android.billingclient.api.QueryProductDetailsParams
 *  com.android.billingclient.api.QueryProductDetailsParams$Product
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.QueryProductDetailsParams;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv8.impl.d;
import io.appmetrica.analytics.billingv8.impl.f;
import io.appmetrica.analytics.billingv8.impl.h;
import io.appmetrica.analytics.billingv8.impl.i;
import io.appmetrica.analytics.billingv8.impl.m;
import io.appmetrica.analytics.billingv8.impl.n;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.y;

public final class g
extends SafeRunnable {
    public final i a;
    public final BillingResult b;
    public final List c;

    public g(i i14, BillingResult billingResult, List list) {
        this.a = i14;
        this.b = billingResult;
        this.c = list;
    }

    @Override
    public final void runSafety() {
        i i14 = this.a;
        Object object8 = this.b;
        Object object2 = this.c;
        i14.getClass();
        if (object8.getResponseCode() != 0) {
            i14.f.onUpdateFinished();
        } else {
            Object object3;
            Object object4 = new LinkedHashMap<String, BillingInfo>();
            Object object5 = object2.iterator();
            while (object5.hasNext()) {
                object3 = (Purchase)object5.next();
                for (Object object6 : object3.getProducts()) {
                    object8 = i14.d;
                    object8 = y.e(object8, "inapp") ? ProductType.INAPP : (y.e(object8, "subs") ? ProductType.SUBS : ProductType.UNKNOWN);
                    object8 = new BillingInfo((ProductType)((Object)object8), (String)object6, object3.getPurchaseToken(), object3.getPurchaseTime(), 0L);
                    object4.put((String)object8.productId, (BillingInfo)object8);
                }
            }
            Object object7 = i14.c.getUpdatePolicy().getBillingInfoToUpdate(i14.a, (Map<String, BillingInfo>)object4, i14.c.getBillingInfoManager());
            if (object7.isEmpty()) {
                m.a(object4, (Map)object7, i14.d, i14.c.getBillingInfoManager());
                i14.f.onUpdateFinished();
            } else {
                Object object6;
                object8 = t.e1(object7.keySet());
                object3 = i14.f;
                object7 = new h((LinkedHashMap)object4, (Map)object7, i14);
                String string2 = i14.d;
                object5 = i14.b;
                object6 = i14.c;
                object4 = i14.e;
                object2 = new f(string2, (BillingClient)object5, (UtilsProvider)object6, (h)((Object)object7), (List)object2, (d)object4, (n)object3);
                ((d)object4).b.add(object2);
                if (i14.b.isReady()) {
                    object4 = i14.b;
                    object3 = QueryProductDetailsParams.newBuilder();
                    object7 = new ArrayList<QueryProductDetailsParams.Product>(t.x((Iterable)object8, (int)10));
                    for (Object object8 : object8) {
                        ((ArrayList)object7).add(QueryProductDetailsParams.Product.newBuilder().setProductId((String)object8).setProductType(i14.d).build());
                    }
                    object4.queryProductDetailsAsync(object3.setProductList(object7).build(), (ProductDetailsResponseListener)object2);
                } else {
                    i14.e.a(object2);
                    object3.onUpdateFinished();
                }
            }
        }
        object8 = this.a;
        object8.e.a(object8);
    }
}

