/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.RemoteException
 */
package io.appmetrica.analytics.identifiers.impl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import io.appmetrica.analytics.identifiers.impl.m;
import io.appmetrica.analytics.identifiers.impl.o;

public abstract class n
extends Binder
implements o {
    public n() {
        this.attachInterface(this, "com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
    }

    public static o a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        if (iInterface != null && iInterface instanceof o) {
            return (o)iInterface;
        }
        return new m(iBinder);
    }

    public abstract /* synthetic */ String a() throws RemoteException;

    public final IBinder asBinder() {
        return this;
    }

    public abstract /* synthetic */ boolean b() throws RemoteException;

    public final boolean onTransact(int n10, Parcel object, Parcel parcel, int n13) throws RemoteException {
        if (n10 != 1) {
            if (n10 != 2) {
                if (n10 != 1598968902) {
                    return super.onTransact(n10, object, parcel, n13);
                }
                parcel.writeString("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                return true;
            }
            object.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            n10 = this.b() ? 1 : 0;
            parcel.writeNoException();
            parcel.writeInt(n10);
            return true;
        }
        object.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        object = this.a();
        parcel.writeNoException();
        parcel.writeString((String)object);
        return true;
    }
}

