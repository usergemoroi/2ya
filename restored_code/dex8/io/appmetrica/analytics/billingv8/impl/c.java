/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.WorkerThread
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.billingv8.impl;

import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class c
implements BillingInfoManager {
    public final BillingInfoStorage a;
    public boolean b;
    public final LinkedHashMap c;

    public c(@NotNull BillingInfoStorage object) {
        this.a = object;
        this.b = object.isFirstInappCheckOccurred();
        Object object2 = object.getBillingInfo();
        object = new LinkedHashMap();
        object2 = object2.iterator();
        while (object2.hasNext()) {
            Object e11 = object2.next();
            object.put(((BillingInfo)e11).productId, e11);
        }
        this.c = object;
    }

    @Override
    @WorkerThread
    @Nullable
    public final BillingInfo get(@NotNull String string2) {
        return (BillingInfo)this.c.get(string2);
    }

    @Override
    @WorkerThread
    public final boolean isFirstInappCheckOccurred() {
        return this.b;
    }

    @Override
    @WorkerThread
    public final void markFirstInappCheckOccurred() {
        if (!this.b) {
            this.b = true;
            this.a.saveInfo(t.e1(this.c.values()), this.b);
        }
    }

    @WorkerThread
    public final void update(@NotNull Map<String, ? extends BillingInfo> object) {
        for (BillingInfo billingInfo : object.values()) {
            this.c.put(billingInfo.productId, billingInfo);
        }
        this.a.saveInfo(t.e1(this.c.values()), this.b);
    }
}

