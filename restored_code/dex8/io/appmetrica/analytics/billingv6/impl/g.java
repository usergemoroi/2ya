/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.BillingClient
 *  com.android.billingclient.api.BillingResult
 *  com.android.billingclient.api.ProductDetailsResponseListener
 *  com.android.billingclient.api.PurchaseHistoryRecord
 *  com.android.billingclient.api.QueryProductDetailsParams
 *  com.android.billingclient.api.QueryProductDetailsParams$Product
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.QueryProductDetailsParams;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv6.impl.d;
import io.appmetrica.analytics.billingv6.impl.f;
import io.appmetrica.analytics.billingv6.impl.h;
import io.appmetrica.analytics.billingv6.impl.i;
import io.appmetrica.analytics.billingv6.impl.m;
import io.appmetrica.analytics.billingv6.impl.n;
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
        Object object7 = this.b;
        Object object2 = this.c;
        i14.getClass();
        if (object7.getResponseCode() == 0 && object2 != null) {
            Object object3;
            ArrayList<QueryProductDetailsParams.Product> arrayList = new LinkedHashMap<String, BillingInfo>();
            Object object4 = object2.iterator();
            while (object4.hasNext()) {
                object3 = (PurchaseHistoryRecord)object4.next();
                for (Object object5 : object3.getProducts()) {
                    object7 = i14.d;
                    object7 = y.e(object7, "inapp") ? ProductType.INAPP : (y.e(object7, "subs") ? ProductType.SUBS : ProductType.UNKNOWN);
                    object7 = new BillingInfo((ProductType)((Object)object7), (String)object5, object3.getPurchaseToken(), object3.getPurchaseTime(), 0L);
                    arrayList.put((String)object7.productId, (BillingInfo)object7);
                }
            }
            object3 = i14.c.getUpdatePolicy().getBillingInfoToUpdate(i14.a, (Map<String, BillingInfo>)((Object)arrayList), i14.c.getBillingInfoManager());
            if (object3.isEmpty()) {
                m.a(arrayList, (Map)object3, i14.d, i14.c.getBillingInfoManager());
                i14.f.onUpdateFinished();
            } else {
                Object object5;
                object7 = t.e1(object3.keySet());
                Object object6 = i14.f;
                object4 = new h((LinkedHashMap)((Object)arrayList), (Map)object3, i14);
                object3 = i14.d;
                BillingClient billingClient = i14.b;
                object5 = i14.c;
                arrayList = i14.e;
                object2 = new f((String)object3, billingClient, (UtilsProvider)object5, (h)((Object)object4), (List)object2, (d)((Object)arrayList), (n)object6);
                ((d)((Object)arrayList)).b.add(object2);
                if (i14.b.isReady()) {
                    object6 = i14.b;
                    object3 = QueryProductDetailsParams.newBuilder();
                    arrayList = new ArrayList<QueryProductDetailsParams.Product>(t.x((Iterable)object7, (int)10));
                    for (Object object7 : object7) {
                        arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String)object7).setProductType(i14.d).build());
                    }
                    object6.queryProductDetailsAsync(object3.setProductList(arrayList).build(), (ProductDetailsResponseListener)object2);
                } else {
                    i14.e.a(object2);
                    object6.onUpdateFinished();
                }
            }
        } else {
            i14.f.onUpdateFinished();
        }
        object7 = this.a;
        object7.e.a(object7);
    }
}

