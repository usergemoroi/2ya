/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.impl.yb;

public class IdentifiersResult
implements Parcelable {
    public static final Parcelable.Creator<IdentifiersResult> CREATOR = new yb();
    @Nullable
    public final String errorExplanation;
    @Nullable
    public final String id;
    @NonNull
    public final IdentifierStatus status;

    public IdentifiersResult(@Nullable String string2, @NonNull IdentifierStatus identifierStatus, @Nullable String string3) {
        this.id = string2;
        this.status = identifierStatus;
        this.errorExplanation = string3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (IdentifiersResult)object;
            String string2 = this.id;
            if (string2 != null ? !string2.equals(((IdentifiersResult)object).id) : ((IdentifiersResult)object).id != null) {
                return false;
            }
            if (this.status != ((IdentifiersResult)object).status) {
                return false;
            }
            string2 = this.errorExplanation;
            if (string2 != null) {
                bl2 = string2.equals(((IdentifiersResult)object).errorExplanation);
            } else if (((IdentifiersResult)object).errorExplanation != null) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public int hashCode() {
        String string2 = this.id;
        int n10 = 0;
        int n13 = string2 != null ? string2.hashCode() : 0;
        int n14 = ((Object)((Object)this.status)).hashCode();
        string2 = this.errorExplanation;
        if (string2 != null) {
            n10 = string2.hashCode();
        }
        return (n14 + n13 * 31) * 31 + n10;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("IdentifiersResult{id='");
        stringBuilder.append(this.id);
        stringBuilder.append("', status=");
        stringBuilder.append((Object)this.status);
        stringBuilder.append(", errorExplanation='");
        stringBuilder.append(this.errorExplanation);
        stringBuilder.append("'}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n10) {
        parcel.writeString(this.id);
        parcel.writeString(this.status.getValue());
        parcel.writeString(this.errorExplanation);
    }
}

