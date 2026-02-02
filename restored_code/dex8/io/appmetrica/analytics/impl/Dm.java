/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

public abstract class dm {
    public static final int[] a;

    static {
        int[] nArray = new int[IdentifierStatus.values().length];
        nArray[IdentifierStatus.OK.ordinal()] = 1;
        nArray[IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE.ordinal()] = 2;
        nArray[IdentifierStatus.INVALID_ADV_ID.ordinal()] = 3;
        nArray[IdentifierStatus.NO_STARTUP.ordinal()] = 4;
        nArray[IdentifierStatus.FEATURE_DISABLED.ordinal()] = 5;
        nArray[IdentifierStatus.FORBIDDEN_BY_CLIENT_CONFIG.ordinal()] = 6;
        a = nArray;
    }
}

