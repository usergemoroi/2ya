/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 */
package io.appmetrica.analytics.identifiers.impl;

import android.os.IBinder;
import android.os.Parcel;
import io.appmetrica.analytics.identifiers.impl.o;

public final class m
implements o {
    public final IBinder a;

    public m(IBinder iBinder) {
        this.a = iBinder;
    }

    public final String a() {
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            this.a.transact(1, parcel, parcel2, 0);
            parcel2.readException();
            String string2 = parcel2.readString();
            return string2;
        }
        finally {
            parcel2.recycle();
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.a;
    }

    public final boolean b() {
        boolean bl2;
        Parcel parcel;
        Parcel parcel2;
        block3: {
            IBinder iBinder;
            parcel2 = Parcel.obtain();
            parcel = Parcel.obtain();
            try {
                parcel2.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                iBinder = this.a;
                bl2 = false;
            }
            catch (Throwable throwable) {
                parcel.recycle();
                parcel2.recycle();
                throw throwable;
            }
            iBinder.transact(2, parcel2, parcel, 0);
            parcel.readException();
            int n10 = parcel.readInt();
            if (n10 == 0) break block3;
            bl2 = true;
        }
        parcel.recycle();
        parcel2.recycle();
        return bl2;
    }
}

