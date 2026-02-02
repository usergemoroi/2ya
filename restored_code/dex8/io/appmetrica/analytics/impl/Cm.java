/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsItem;
import io.appmetrica.analytics.StartupParamsItemStatus;
import io.appmetrica.analytics.impl.dm;
import io.appmetrica.analytics.impl.em;
import io.appmetrica.analytics.internal.IdentifiersResult;

public final class cm {
    public final em a = new em();

    public final StartupParamsItem a(IdentifiersResult identifiersResult) {
        String string2 = identifiersResult.id;
        em em3 = this.a;
        Enum enum_ = identifiersResult.status;
        em3.getClass();
        switch (dm.a[enum_.ordinal()]) {
            default: {
                enum_ = StartupParamsItemStatus.UNKNOWN_ERROR;
                break;
            }
            case 6: {
                enum_ = StartupParamsItemStatus.FORBIDDEN_BY_CLIENT_CONFIG;
                break;
            }
            case 5: {
                enum_ = StartupParamsItemStatus.FEATURE_DISABLED;
                break;
            }
            case 4: {
                enum_ = StartupParamsItemStatus.NETWORK_ERROR;
                break;
            }
            case 3: {
                enum_ = StartupParamsItemStatus.INVALID_VALUE_FROM_PROVIDER;
                break;
            }
            case 2: {
                enum_ = StartupParamsItemStatus.PROVIDER_UNAVAILABLE;
                break;
            }
            case 1: {
                enum_ = StartupParamsItemStatus.OK;
            }
        }
        return new StartupParamsItem(string2, (StartupParamsItemStatus)enum_, identifiersResult.errorExplanation);
    }
}

