/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.billinginterface.internal.monitor;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfigChangedListener;

public interface BillingMonitor
extends BillingConfigChangedListener {
    public void onSessionResumed() throws Throwable;
}

