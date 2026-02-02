/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.os.ResultReceiver
 */
package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import io.appmetrica.analytics.impl.Pm;
import io.appmetrica.analytics.impl.a7;
import io.appmetrica.analytics.impl.wb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class xb
implements Parcelable {
    public static final Parcelable.Creator<xb> CREATOR = new wb();
    public final ResultReceiver a;
    public final List b;
    public final HashMap c;
    public final boolean d;

    public xb(Parcel parcel) {
        parcel = parcel.readBundle(a7.class.getClassLoader());
        if (parcel != null) {
            this.a = (ResultReceiver)parcel.getParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver");
            this.b = parcel.getStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList");
            this.c = Pm.a(parcel.getString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification"));
            this.d = parcel.getBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration");
        } else {
            this.c = new HashMap();
        }
    }

    public xb(a7 object, List list, Map map2, boolean bl2) {
        this.b = list;
        this.a = object;
        object = map2 == null ? new HashMap() : new HashMap(map2);
        this.c = object;
        this.d = bl2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        HashMap hashMap;
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver", (Parcelable)this.a);
        if (this.b != null) {
            bundle.putStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList", new ArrayList(this.b));
        }
        if ((hashMap = this.c) != null) {
            bundle.putString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification", Pm.a((Map)hashMap));
        }
        bundle.putBoolean("io.appmetrica.analytics.internal.CounterConfiguration.forceRefreshConfiguration", this.d);
        parcel.writeBundle(bundle);
    }
}

