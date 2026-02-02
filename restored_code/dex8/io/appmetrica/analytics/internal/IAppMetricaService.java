/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.os.RemoteException
 */
package io.appmetrica.analytics.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import io.appmetrica.analytics.internal.c;

public interface IAppMetricaService
extends IInterface {
    public static final String DESCRIPTOR = "io.appmetrica.analytics.internal.IAppMetricaService";

    public void pauseUserSession(Bundle var1) throws RemoteException;

    public void reportData(int var1, Bundle var2) throws RemoteException;

    public void resumeUserSession(Bundle var1) throws RemoteException;

    public static class Default
    implements IAppMetricaService {
        public IBinder asBinder() {
            return null;
        }

        @Override
        public void pauseUserSession(Bundle bundle) throws RemoteException {
        }

        @Override
        public void reportData(int n10, Bundle bundle) throws RemoteException {
        }

        @Override
        public void resumeUserSession(Bundle bundle) throws RemoteException {
        }
    }

    public static abstract class Stub
    extends Binder
    implements IAppMetricaService {
        public Stub() {
            this.attachInterface(this, IAppMetricaService.DESCRIPTOR);
        }

        public static IAppMetricaService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterface = iBinder.queryLocalInterface(IAppMetricaService.DESCRIPTOR);
            if (iInterface != null && iInterface instanceof IAppMetricaService) {
                return (IAppMetricaService)iInterface;
            }
            return new c(iBinder);
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int n10, Parcel parcel, Parcel object, int n13) throws RemoteException {
            if (n10 >= 1 && n10 <= 0xFFFFFF) {
                parcel.enforceInterface(IAppMetricaService.DESCRIPTOR);
            }
            if (n10 == 1598968902) {
                object.writeString(IAppMetricaService.DESCRIPTOR);
                return true;
            }
            Object var7_5 = null;
            Parcelable.Creator creator = null;
            Parcelable.Creator creator2 = null;
            if (n10 != 1) {
                if (n10 != 2) {
                    if (n10 != 3) {
                        return super.onTransact(n10, parcel, object, n13);
                    }
                    n10 = parcel.readInt();
                    creator = Bundle.CREATOR;
                    object = creator2;
                    if (parcel.readInt() != 0) {
                        object = creator.createFromParcel(parcel);
                    }
                    this.reportData(n10, (Bundle)object);
                } else {
                    creator2 = Bundle.CREATOR;
                    object = var7_5;
                    if (parcel.readInt() != 0) {
                        object = creator2.createFromParcel(parcel);
                    }
                    this.pauseUserSession((Bundle)object);
                }
            } else {
                creator2 = Bundle.CREATOR;
                object = creator;
                if (parcel.readInt() != 0) {
                    object = creator2.createFromParcel(parcel);
                }
                this.resumeUserSession((Bundle)object);
            }
            return true;
        }
    }

    public static class _Parcel {
    }
}

