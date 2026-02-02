/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

public final class s3
implements IBinaryDataHelper {
    public final IBinaryDataHelper a;

    public s3(IBinaryDataHelper iBinaryDataHelper) {
        this.a = iBinaryDataHelper;
    }

    @Override
    public final byte[] get(String string2) {
        return this.a.get(string2);
    }

    @Override
    public final void insert(String string2, byte[] byArray) {
        this.a.insert(string2, byArray);
    }

    @Override
    public final void remove(String string2) {
        this.a.remove(string2);
    }
}

