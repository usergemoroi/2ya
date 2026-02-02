/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;

public final class lj {
    public final Context a;
    public final SafePackageManager b;

    public lj(Context context, SafePackageManager safePackageManager) {
        this.a = context;
        this.b = safePackageManager;
    }

    public final ArrayList a() {
        ArrayList<PermissionState> arrayList = new ArrayList<PermissionState>();
        String[] stringArray = this.b;
        Object object = this.a;
        if ((object = stringArray.getPackageInfo((Context)object, object.getPackageName(), 4096)) == null) {
            return arrayList;
        }
        stringArray = object.requestedPermissions;
        object = object.requestedPermissionsFlags;
        if (stringArray == null) {
            return arrayList;
        }
        for (int i14 = 0; i14 < stringArray.length; ++i14) {
            String string2 = stringArray[i14];
            if (object != null && ((Context)object).length > i14 && (object[i14] & 2) != 0) {
                arrayList.add(new PermissionState(string2, true));
                continue;
            }
            arrayList.add(new PermissionState(string2, false));
        }
        return arrayList;
    }
}

