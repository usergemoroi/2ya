/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.impl.ua;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

public final class va
implements Parcelable {
    @NotNull
    public static final ua CREATOR = new ua();
    public final Boolean a;
    public final IdentifierStatus b;
    public final String c;

    public va() {
        this(null, IdentifierStatus.UNKNOWN, null);
    }

    public va(Boolean bl2, IdentifierStatus identifierStatus, String string2) {
        this.a = bl2;
        this.b = identifierStatus;
        this.c = string2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof va)) {
            return false;
        }
        object = (va)object;
        if (!y.e(this.a, ((va)object).a)) {
            return false;
        }
        if (this.b != ((va)object).b) {
            return false;
        }
        return y.e(this.c, ((va)object).c);
    }

    public final int hashCode() {
        Object object = this.a;
        int n10 = 0;
        int n13 = object == null ? 0 : object.hashCode();
        int n14 = ((Object)((Object)this.b)).hashCode();
        object = this.c;
        if (object != null) {
            n10 = ((String)object).hashCode();
        }
        return (n14 + n13 * 31) * 31 + n10;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FeaturesInternal(sslPinning=");
        stringBuilder.append(this.a);
        stringBuilder.append(", status=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", errorExplanation=");
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n10) {
        parcel.writeValue((Object)this.a);
        parcel.writeString(this.b.getValue());
        parcel.writeString(this.c);
    }
}

