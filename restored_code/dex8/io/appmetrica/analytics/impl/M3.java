/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.impl.Zm;
import io.appmetrica.analytics.impl.z2;
import java.util.Iterator;
import java.util.List;

public final class m3
implements BillingInfoStorage {
    public final ProtobufStateStorage a;
    public z2 b;

    public m3(@NonNull Context context) {
        this(Zm.a(z2.class).a(context));
    }

    public m3(ProtobufStateStorage protobufStateStorage) {
        this.a = protobufStateStorage;
        this.b = (z2)protobufStateStorage.read();
    }

    @Override
    @NonNull
    public final List<BillingInfo> getBillingInfo() {
        return this.b.a;
    }

    @Override
    public final boolean isFirstInappCheckOccurred() {
        return this.b.b;
    }

    @Override
    public final void saveInfo(@NonNull List<BillingInfo> object, boolean bl2) {
        Iterator<BillingInfo> iterator = object.iterator();
        while (iterator.hasNext()) {
            BillingInfo billingInfo = iterator.next();
        }
        this.b = object = new z2((List)object, bl2);
        this.a.save(object);
    }
}

