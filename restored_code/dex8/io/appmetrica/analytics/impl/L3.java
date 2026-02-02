/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.k3;
import io.appmetrica.analytics.impl.pb;
import java.util.List;

public final class l3
implements BillingInfoSender {
    public final pb a;
    public final ICommonExecutor b;

    public l3(@NonNull pb pb3) {
        this(pb3, Na.j().w().e());
    }

    public l3(@NonNull pb pb3, @NonNull ICommonExecutor iCommonExecutor) {
        this.a = pb3;
        this.b = iCommonExecutor;
    }

    @Override
    public final void sendInfo(@NonNull List<ProductInfo> object) {
        object = object.iterator();
        while (object.hasNext()) {
            ProductInfo productInfo = (ProductInfo)object.next();
            this.b.execute(new k3(this, productInfo));
        }
    }
}

