/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 */
package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.va;
import io.appmetrica.analytics.internal.IdentifiersResult;

public final class r4 {
    public final IdentifiersResult a;
    public final IdentifiersResult b;
    public final IdentifiersResult c;
    public final IdentifiersResult d;
    public final IdentifiersResult e;
    public final IdentifiersResult f;
    public final IdentifiersResult g;
    public final IdentifiersResult h;
    public final IdentifiersResult i;
    public final IdentifiersResult j;
    public final IdentifiersResult k;
    public final long l;
    public final long m;
    public final va n;
    public final Bundle o;

    public r4(IdentifiersResult identifiersResult, IdentifiersResult identifiersResult2, IdentifiersResult identifiersResult3, IdentifiersResult identifiersResult4, IdentifiersResult identifiersResult5, IdentifiersResult identifiersResult6, IdentifiersResult identifiersResult7, IdentifiersResult identifiersResult8, IdentifiersResult identifiersResult9, IdentifiersResult identifiersResult10, IdentifiersResult identifiersResult11, long l10, long l11, va va4, Bundle bundle) {
        this.a = identifiersResult;
        this.b = identifiersResult2;
        this.c = identifiersResult3;
        this.d = identifiersResult4;
        this.e = identifiersResult5;
        this.f = identifiersResult6;
        this.g = identifiersResult7;
        this.h = identifiersResult8;
        this.i = identifiersResult9;
        this.j = identifiersResult10;
        this.k = identifiersResult11;
        this.l = l10;
        this.m = l11;
        this.n = va4;
        this.o = bundle;
    }

    public static va a(Bundle object) {
        Object object2 = object.getBundle("features");
        object = va.class.getClassLoader();
        if (object2 == null) {
            object = null;
        } else {
            object2.setClassLoader((ClassLoader)object);
            object = object2.getParcelable("value");
        }
        object = object2 = (va)object;
        if (object2 == null) {
            object = new va(null, IdentifierStatus.UNKNOWN, "bundle serialization error");
        }
        return object;
    }

    public static va a(Boolean bl2) {
        boolean bl3 = bl2 != null;
        IdentifierStatus identifierStatus = bl3 ? IdentifierStatus.OK : IdentifierStatus.UNKNOWN;
        String string2 = bl3 ? null : "no identifier in startup state";
        return new va(bl2, identifierStatus, string2);
    }

    public static IdentifiersResult a(Bundle object, String object2) {
        object = object.getBundle((String)object2);
        object2 = IdentifiersResult.class.getClassLoader();
        if (object == null) {
            object = null;
        } else {
            object.setClassLoader((ClassLoader)object2);
            object = object.getParcelable("value");
        }
        object2 = (IdentifiersResult)object;
        object = object2;
        if (object2 == null) {
            object = new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "bundle serialization error");
        }
        return object;
    }

    public static IdentifiersResult a(String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        IdentifierStatus identifierStatus = bl2 ? IdentifierStatus.UNKNOWN : IdentifierStatus.OK;
        String string3 = bl2 ? "no identifier in startup state" : null;
        return new IdentifiersResult(string2, identifierStatus, string3);
    }

    public final void b(Bundle bundle) {
        IdentifiersResult identifiersResult = this.a;
        Object object = new Bundle();
        object.putParcelable("value", (Parcelable)identifiersResult);
        bundle.putBundle("Uuid", object);
        object = this.b;
        identifiersResult = new Bundle();
        identifiersResult.putParcelable("value", (Parcelable)object);
        bundle.putBundle("DeviceId", (Bundle)identifiersResult);
        object = this.c;
        identifiersResult = new Bundle();
        identifiersResult.putParcelable("value", (Parcelable)object);
        bundle.putBundle("DeviceIdHash", (Bundle)identifiersResult);
        identifiersResult = this.d;
        object = new Bundle();
        object.putParcelable("value", (Parcelable)identifiersResult);
        bundle.putBundle("AdUrlReport", object);
        identifiersResult = this.e;
        object = new Bundle();
        object.putParcelable("value", (Parcelable)identifiersResult);
        bundle.putBundle("AdUrlGet", object);
        identifiersResult = this.f;
        object = new Bundle();
        object.putParcelable("value", (Parcelable)identifiersResult);
        bundle.putBundle("Clids", object);
        object = this.g;
        identifiersResult = new Bundle();
        identifiersResult.putParcelable("value", (Parcelable)object);
        bundle.putBundle("RequestClids", (Bundle)identifiersResult);
        object = this.h;
        identifiersResult = new Bundle();
        identifiersResult.putParcelable("value", (Parcelable)object);
        bundle.putBundle("GAID", (Bundle)identifiersResult);
        object = this.i;
        identifiersResult = new Bundle();
        identifiersResult.putParcelable("value", (Parcelable)object);
        bundle.putBundle("HOAID", (Bundle)identifiersResult);
        identifiersResult = this.j;
        object = new Bundle();
        object.putParcelable("value", (Parcelable)identifiersResult);
        bundle.putBundle("YANDEX_ADV_ID", object);
        object = this.k;
        identifiersResult = new Bundle();
        identifiersResult.putParcelable("value", (Parcelable)object);
        bundle.putBundle("CUSTOM_SDK_HOSTS", (Bundle)identifiersResult);
        bundle.putLong("ServerTimeOffset", this.l);
        bundle.putLong("NextStartupTime", this.m);
        object = this.n;
        identifiersResult = new Bundle();
        identifiersResult.putParcelable("value", (Parcelable)object);
        bundle.putBundle("features", (Bundle)identifiersResult);
        bundle.putBundle("module_configs", Na.F.o().i());
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ClientIdentifiersHolder{mUuidData=");
        stringBuilder.append(this.a);
        stringBuilder.append(", mDeviceIdData=");
        stringBuilder.append(this.b);
        stringBuilder.append(", mDeviceIdHashData=");
        stringBuilder.append(this.c);
        stringBuilder.append(", mReportAdUrlData=");
        stringBuilder.append(this.d);
        stringBuilder.append(", mGetAdUrlData=");
        stringBuilder.append(this.e);
        stringBuilder.append(", mResponseClidsData=");
        stringBuilder.append(this.f);
        stringBuilder.append(", mClientClidsForRequestData=");
        stringBuilder.append(this.g);
        stringBuilder.append(", mGaidData=");
        stringBuilder.append(this.h);
        stringBuilder.append(", mHoaidData=");
        stringBuilder.append(this.i);
        stringBuilder.append(", yandexAdvIdData=");
        stringBuilder.append(this.j);
        stringBuilder.append(", customSdkHostsData=");
        stringBuilder.append(this.k);
        stringBuilder.append(", mServerTimeOffset=");
        stringBuilder.append(this.l);
        stringBuilder.append(", nextStartupTime=");
        stringBuilder.append(this.m);
        stringBuilder.append(", features=");
        stringBuilder.append(this.n);
        stringBuilder.append(", modulesConfig=");
        stringBuilder.append(this.o);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

