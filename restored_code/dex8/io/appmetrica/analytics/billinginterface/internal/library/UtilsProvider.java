/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.billinginterface.internal.library;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import java.util.concurrent.Executor;

public interface UtilsProvider {
    @NonNull
    public BillingInfoManager getBillingInfoManager();

    @NonNull
    public BillingInfoSender getBillingInfoSender();

    @NonNull
    public Executor getUiExecutor();

    @NonNull
    public UpdatePolicy getUpdatePolicy();

    @NonNull
    public Executor getWorkerExecutor();
}

