/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 */
package io.appmetrica.analytics.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import io.appmetrica.analytics.internal.IAppMetricaService;

public final class c
implements IAppMetricaService {
    public final IBinder a;

    public c(IBinder iBinder) {
        this.a = iBinder;
    }

    public final IBinder asBinder() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void pauseUserSession(Bundle bundle) {
        Throwable throwable2;
        Parcel parcel;
        block4: {
            block3: {
                block2: {
                    parcel = Parcel.obtain();
                    try {
                        parcel.writeInterfaceToken("io.appmetrica.analytics.internal.IAppMetricaService");
                        if (bundle == null) break block2;
                        parcel.writeInt(1);
                        bundle.writeToParcel(parcel, 0);
                        break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                parcel.writeInt(0);
            }
            this.a.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
        }
        parcel.recycle();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void reportData(int n10, Bundle bundle) {
        Throwable throwable2;
        Parcel parcel;
        block4: {
            block3: {
                block2: {
                    parcel = Parcel.obtain();
                    try {
                        parcel.writeInterfaceToken("io.appmetrica.analytics.internal.IAppMetricaService");
                        parcel.writeInt(n10);
                        if (bundle == null) break block2;
                        parcel.writeInt(1);
                        bundle.writeToParcel(parcel, 0);
                        break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                parcel.writeInt(0);
            }
            this.a.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
        }
        parcel.recycle();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void resumeUserSession(Bundle bundle) {
        Throwable throwable2;
        Parcel parcel;
        block4: {
            block3: {
                block2: {
                    parcel = Parcel.obtain();
                    try {
                        parcel.writeInterfaceToken("io.appmetrica.analytics.internal.IAppMetricaService");
                        if (bundle == null) break block2;
                        parcel.writeInt(1);
                        bundle.writeToParcel(parcel, 0);
                        break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                parcel.writeInt(0);
            }
            this.a.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
        }
        parcel.recycle();
        throw throwable2;
    }
}

